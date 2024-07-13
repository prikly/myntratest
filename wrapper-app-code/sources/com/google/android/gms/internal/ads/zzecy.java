package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzecy extends zzdi {
    final Map zza = new HashMap();
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzecm zzc;
    private final zzgfc zzd;
    private final zzecz zze;
    private zzece zzf;

    zzecy(Context context, zzecm zzecm, zzecz zzecz, zzgfc zzgfc) {
        this.zzb = context;
        this.zzc = zzecm;
        this.zzd = zzgfc;
        this.zze = zzecz;
    }

    private static AdRequest zzj() {
        return new AdRequest.Builder().build();
    }

    /* access modifiers changed from: private */
    public static String zzk(Object obj) {
        ResponseInfo responseInfo;
        zzdn zzc2;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).getResponseInfo();
            }
            return "";
        }
        if (responseInfo == null || (zzc2 = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc2.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzl(String str, String str2) {
        try {
            zzger.zzr(this.zzf.zzb(str), new zzecw(this, str2), this.zzd);
        } catch (NullPointerException e2) {
            zzt.zzo().zzu(e2, "OutOfContextTester.setAdAsOutOfContext");
            this.zzc.zzk(str2);
        }
    }

    private final synchronized void zzm(String str, String str2) {
        try {
            zzger.zzr(this.zzf.zzb(str), new zzecx(this, str2), this.zzd);
        } catch (NullPointerException e2) {
            zzt.zzo().zzu(e2, "OutOfContextTester.setAdAsShown");
            this.zzc.zzk(str2);
        }
    }

    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof AdView) {
                zzecz.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzecz.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzece zzece) {
        this.zzf = zzece;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzl(zzk(obj), str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.hashCode()     // Catch:{ all -> 0x00dd }
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1999289321: goto L_0x0040;
                case -1372958932: goto L_0x0036;
                case -428325382: goto L_0x002c;
                case 543046670: goto L_0x0022;
                case 1854800829: goto L_0x0018;
                case 1951953708: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x00dd }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "BANNER"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "REWARDED"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 4
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "APP_OPEN_AD"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "NATIVE"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 3
            goto L_0x004b
        L_0x004a:
            r8 = -1
        L_0x004b:
            if (r8 == 0) goto L_0x00cd
            if (r8 == r5) goto L_0x00ad
            if (r8 == r4) goto L_0x009d
            if (r8 == r3) goto L_0x0079
            if (r8 == r2) goto L_0x0069
            if (r8 == r1) goto L_0x0059
            monitor-exit(r6)
            return
        L_0x0059:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecu r1 = new com.google.android.gms.internal.ads.zzecu     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load((android.content.Context) r8, (java.lang.String) r7, (com.google.android.gms.ads.AdRequest) r0, (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0069:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzect r1 = new com.google.android.gms.internal.ads.zzect     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.rewarded.RewardedAd.load((android.content.Context) r8, (java.lang.String) r7, (com.google.android.gms.ads.AdRequest) r0, (com.google.android.gms.ads.rewarded.RewardedAdLoadCallback) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0079:
            com.google.android.gms.ads.AdLoader$Builder r8 = new com.google.android.gms.ads.AdLoader$Builder     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.zzb     // Catch:{ all -> 0x00dd }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecp r0 = new com.google.android.gms.internal.ads.zzecp     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            r8.forNativeAd(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecv r7 = new com.google.android.gms.internal.ads.zzecv     // Catch:{ all -> 0x00dd }
            r7.<init>(r6, r9)     // Catch:{ all -> 0x00dd }
            r8.withAdListener(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdLoader r7 = r8.build()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r8 = zzj()     // Catch:{ all -> 0x00dd }
            r7.loadAd((com.google.android.gms.ads.AdRequest) r8)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x009d:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecs r1 = new com.google.android.gms.internal.ads.zzecs     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.interstitial.InterstitialAd.load(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00ad:
            com.google.android.gms.ads.AdView r8 = new com.google.android.gms.ads.AdView     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.zzb     // Catch:{ all -> 0x00dd }
            r8.<init>(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.BANNER     // Catch:{ all -> 0x00dd }
            r8.setAdSize(r0)     // Catch:{ all -> 0x00dd }
            r8.setAdUnitId(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecr r0 = new com.google.android.gms.internal.ads.zzecr     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            r8.setAdListener(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r7 = zzj()     // Catch:{ all -> 0x00dd }
            r8.loadAd(r7)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00cd:
            android.content.Context r8 = r6.zzb     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = zzj()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzecq r1 = new com.google.android.gms.internal.ads.zzecq     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.appopen.AppOpenAd.load((android.content.Context) r8, (java.lang.String) r7, (com.google.android.gms.ads.AdRequest) r0, (int) r5, (com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback) r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00dd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecy.zzh(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzecm r0 = r4.zzc     // Catch:{ all -> 0x00aa }
            android.app.Activity r0 = r0.zzg()     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r4)
            return
        L_0x000b:
            java.util.Map r1 = r4.zza     // Catch:{ all -> 0x00aa }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x00aa }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r4)
            return
        L_0x0015:
            com.google.android.gms.internal.ads.zzbjb r2 = com.google.android.gms.internal.ads.zzbjj.zziu     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzbjh r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x00aa }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00aa }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x0037
            boolean r2 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x0037
            boolean r2 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x0037
            boolean r2 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x0037
            boolean r2 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x003c
        L_0x0037:
            java.util.Map r2 = r4.zza     // Catch:{ all -> 0x00aa }
            r2.remove(r5)     // Catch:{ all -> 0x00aa }
        L_0x003c:
            java.lang.String r2 = zzk(r1)     // Catch:{ all -> 0x00aa }
            r4.zzm(r2, r6)     // Catch:{ all -> 0x00aa }
            boolean r6 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x004e
            com.google.android.gms.ads.appopen.AppOpenAd r1 = (com.google.android.gms.ads.appopen.AppOpenAd) r1     // Catch:{ all -> 0x00aa }
            r1.show(r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x004e:
            boolean r6 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0059
            com.google.android.gms.ads.interstitial.InterstitialAd r1 = (com.google.android.gms.ads.interstitial.InterstitialAd) r1     // Catch:{ all -> 0x00aa }
            r1.show(r0)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x0059:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0066
            com.google.android.gms.ads.rewarded.RewardedAd r1 = (com.google.android.gms.ads.rewarded.RewardedAd) r1     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzecn r5 = com.google.android.gms.internal.ads.zzecn.zza     // Catch:{ all -> 0x00aa }
            r1.show(r0, r5)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x0066:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0073
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd r1 = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) r1     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzeco r5 = com.google.android.gms.internal.ads.zzeco.zza     // Catch:{ all -> 0x00aa }
            r1.show(r0, r5)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x0073:
            com.google.android.gms.internal.ads.zzbjb r6 = com.google.android.gms.internal.ads.zzbjj.zziu     // Catch:{ all -> 0x00aa }
            com.google.android.gms.internal.ads.zzbjh r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00aa }
            java.lang.Object r6 = r0.zzb(r6)     // Catch:{ all -> 0x00aa }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x00aa }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x00a8
            boolean r6 = r1 instanceof com.google.android.gms.ads.AdView     // Catch:{ all -> 0x00aa }
            if (r6 != 0) goto L_0x008d
            boolean r6 = r1 instanceof com.google.android.gms.ads.nativead.NativeAd     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x00a8
        L_0x008d:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00aa }
            r6.<init>()     // Catch:{ all -> 0x00aa }
            android.content.Context r0 = r4.zzb     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r6.setClassName(r0, r1)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "adUnit"
            r6.putExtra(r0, r5)     // Catch:{ all -> 0x00aa }
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x00aa }
            android.content.Context r5 = r4.zzb     // Catch:{ all -> 0x00aa }
            com.google.android.gms.ads.internal.util.zzs.zzQ(r5, r6)     // Catch:{ all -> 0x00aa }
            monitor-exit(r4)
            return
        L_0x00a8:
            monitor-exit(r4)
            return
        L_0x00aa:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecy.zzi(java.lang.String, java.lang.String):void");
    }
}
