package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbwt extends zzbvv {
    /* access modifiers changed from: private */
    public final Object zza;
    private zzbwv zzb;
    private zzcdc zzc;
    private IObjectWrapper zzd;
    /* access modifiers changed from: private */
    public View zze;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzf;
    /* access modifiers changed from: private */
    public UnifiedNativeAdMapper zzg;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzh;
    /* access modifiers changed from: private */
    public MediationInterscrollerAd zzi;
    /* access modifiers changed from: private */
    public MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzbwt(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(zzl zzl) {
        Bundle bundle;
        Bundle bundle2 = zzl.zzm;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private final Bundle zzV(String str, zzl zzl, String str2) throws RemoteException {
        zzcho.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzl != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzl.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcho.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(zzl zzl) {
        if (zzl.zzf) {
            return true;
        }
        zzay.zzb();
        return zzchh.zzs();
    }

    private static final String zzX(String str, zzl zzl) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzl.zzu;
        }
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        zzl zzl2 = zzl;
        String str2 = str;
        if (this.zza instanceof Adapter) {
            zzcho.zze("Requesting rewarded ad from adapter.");
            try {
                zzbwr zzbwr = new zzbwr(this, zzbvz);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i = zzl2.zzg;
                int i2 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i, i2, zzX, "");
                ((Adapter) this.zza).loadRewardedAd(mediationRewardedAdConfiguration, zzbwr);
            } catch (Exception e2) {
                zzcho.zzh("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzB(zzl zzl, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzl, str, new zzbww((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        zzl zzl2 = zzl;
        String str2 = str;
        if (this.zza instanceof Adapter) {
            zzcho.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbwr zzbwr = new zzbwr(this, zzbvz);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i = zzl2.zzg;
                int i2 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i, i2, zzX, "");
                ((Adapter) this.zza).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, zzbwr);
            } catch (Exception e2) {
                zzcho.zzh("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzcho.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzcho.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                zzcho.zzh("", th);
            }
        } else {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzcho.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzj;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcho.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzI() throws RemoteException {
        if (this.zza instanceof MediationInterstitialAdapter) {
            zzcho.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
            } catch (Throwable th) {
                zzcho.zzh("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            zzcho.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcho.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzcho.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcho.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzL() throws RemoteException {
        if (this.zza instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
            } else {
                zzcho.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final boolean zzM() {
        return false;
    }

    public final boolean zzN() throws RemoteException {
        if (this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final zzbwe zzO() {
        return null;
    }

    public final zzbwf zzP() {
        return null;
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final Bundle zzf() {
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof zza) {
            try {
                return ((zza) obj).getVideoController();
            } catch (Throwable th) {
                zzcho.zzh("", th);
            }
        }
        return null;
    }

    public final zzbnf zzi() {
        zzbwv zzbwv = this.zzb;
        if (zzbwv == null) {
            return null;
        }
        NativeCustomTemplateAd zza2 = zzbwv.zza();
        if (zza2 instanceof zzbng) {
            return ((zzbng) zza2).zza();
        }
        return null;
    }

    public final zzbwc zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbwu(mediationInterscrollerAd);
        }
        return null;
    }

    public final zzbwi zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb2;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbwv zzbwv = this.zzb;
            if (zzbwv == null || (zzb2 = zzbwv.zzb()) == null) {
                return null;
            }
            return new zzbwy(zzb2);
        } else if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
            return null;
        } else {
            return new zzbwy(unifiedNativeAdMapper);
        }
    }

    public final zzbye zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbye.zza(((Adapter) obj).getVersionInfo());
    }

    public final zzbye zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbye.zza(((Adapter) obj).getSDKVersionInfo());
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzcho.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzcho.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzcdc zzcdc, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            this.zzd = iObjectWrapper;
            this.zzc = zzcdc;
            zzcdc.zzl(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.internal.ads.zzbsd r11, java.util.List r12) throws android.os.RemoteException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zza
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzbwn r0 = new com.google.android.gms.internal.ads.zzbwn
            r0.<init>(r9, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0014:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r12.next()
            com.google.android.gms.internal.ads.zzbsj r1 = (com.google.android.gms.internal.ads.zzbsj) r1
            java.lang.String r2 = r1.zza
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -1396342996: goto L_0x0061;
                case -1052618729: goto L_0x0057;
                case -239580146: goto L_0x004d;
                case 604727084: goto L_0x0043;
                case 1167692200: goto L_0x0039;
                case 1911491517: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x006b
        L_0x002f:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 3
            goto L_0x006c
        L_0x0039:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 5
            goto L_0x006c
        L_0x0043:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x004d:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 2
            goto L_0x006c
        L_0x0057:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 4
            goto L_0x006c
        L_0x0061:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 0
            goto L_0x006c
        L_0x006b:
            r2 = -1
        L_0x006c:
            if (r2 == 0) goto L_0x0089
            if (r2 == r8) goto L_0x0086
            if (r2 == r7) goto L_0x0083
            if (r2 == r6) goto L_0x0080
            if (r2 == r5) goto L_0x007d
            if (r2 == r4) goto L_0x007a
            r2 = 0
            goto L_0x008b
        L_0x007a:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L_0x008b
        L_0x007d:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L_0x008b
        L_0x0080:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L_0x008b
        L_0x0083:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L_0x008b
        L_0x0086:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L_0x008b
        L_0x0089:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
        L_0x008b:
            if (r2 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.MediationConfiguration r3 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r1 = r1.zzb
            r3.<init>(r2, r1)
            r11.add(r3)
            goto L_0x0014
        L_0x0099:
            java.lang.Object r12 = r9.zza
            com.google.android.gms.ads.mediation.Adapter r12 = (com.google.android.gms.ads.mediation.Adapter) r12
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r10 = (android.content.Context) r10
            r12.initialize(r10, r0, r11)
            return
        L_0x00a7:
            android.os.RemoteException r10 = new android.os.RemoteException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwt.zzq(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbsd, java.util.List):void");
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzcdc zzcdc, List list) throws RemoteException {
        zzcho.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public final void zzs(zzl zzl, String str) throws RemoteException {
        zzB(zzl, str, (String) null);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        zzl zzl2 = zzl;
        String str2 = str;
        if (this.zza instanceof Adapter) {
            zzcho.zze("Requesting app open ad from adapter.");
            try {
                zzbws zzbws = new zzbws(this, zzbvz);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i = zzl2.zzg;
                int i2 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = r5;
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i, i2, zzX, "");
                ((Adapter) this.zza).loadAppOpenAd(mediationAppOpenAdConfiguration, zzbws);
            } catch (Exception e2) {
                zzcho.zzh("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        zzv(iObjectWrapper, zzq, zzl, str, (String) null, zzbvz);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        AdSize adSize;
        Date date;
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvz zzbvz2 = zzbvz;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            zzcho.zze("Requesting banner ad from adapter.");
            if (zzq2.zzn) {
                adSize = zzb.zzd(zzq2.zze, zzq2.zzb);
            } else {
                adSize = zzb.zzc(zzq2.zze, zzq2.zzb, zzq2.zza);
            }
            AdSize adSize2 = adSize;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = zzl2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzl2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwl zzbwl = new zzbwl(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbwv(zzbvz2), zzV(str3, zzl2, str4), adSize2, zzbwl, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcho.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    zzbwo zzbwo = new zzbwo(this, zzbvz2);
                    Bundle zzV = zzV(str3, zzl2, str4);
                    Bundle zzU = zzU(zzl2);
                    boolean zzW = zzW(zzl);
                    Location location = zzl2.zzk;
                    int i = zzl2.zzg;
                    int i2 = zzl2.zzt;
                    String zzX = zzX(str3, zzl2);
                    String str5 = this.zzk;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration = r2;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i, i2, zzX, adSize2, str5);
                    ((Adapter) obj2).loadBannerAd(mediationBannerAdConfiguration, zzbwo);
                } catch (Throwable th2) {
                    zzcho.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            zzcho.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.zza.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        if (this.zza instanceof Adapter) {
            zzcho.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                zzbwm zzbwm = new zzbwm(this, zzbvz, adapter);
                Bundle zzV = zzV(str3, zzl2, str2);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i = zzl2.zzg;
                int i2 = zzl2.zzt;
                String zzX = zzX(str3, zzl2);
                AdSize zze2 = zzb.zze(zzq2.zze, zzq2.zzb);
                MediationBannerAdConfiguration mediationBannerAdConfiguration = r6;
                MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i, i2, zzX, zze2, "");
                adapter.loadInterscrollerAd(mediationBannerAdConfiguration, zzbwm);
            } catch (Exception e2) {
                zzcho.zzh("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        zzy(iObjectWrapper, zzl, str, (String) null, zzbvz);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvz zzbvz2 = zzbvz;
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            zzcho.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = zzl2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzl2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwl zzbwl = new zzbwl(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbwv(zzbvz2), zzV(str3, zzl2, str4), zzbwl, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcho.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str3, zzl2, str4), zzU(zzl2), zzW(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzX(str3, zzl2), this.zzk), new zzbwp(this, zzbvz2));
                } catch (Throwable th2) {
                    zzcho.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvz zzbvz, zzblz zzblz, List list) throws RemoteException {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvz zzbvz2 = zzbvz;
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            zzcho.zze("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = zzl2.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzl2.zzb;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwx zzbwx = new zzbwx(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzblz, list, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzbwv(zzbvz2);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str3, zzl2, str4), zzbwx, bundle2);
                } catch (Throwable th) {
                    zzcho.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str3, zzl2, str4), zzU(zzl2), zzW(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzX(str3, zzl2), this.zzk, zzblz), new zzbwq(this, zzbvz2));
                } catch (Throwable th2) {
                    zzcho.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcho.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public zzbwt(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
