package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzfvx;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzfvz;
import com.google.android.gms.internal.ads.zzfwa;
import com.google.android.gms.internal.ads.zzfwj;
import com.google.android.gms.internal.ads.zzfwl;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfwo;
import com.google.android.gms.internal.ads.zzfxi;
import com.onesignal.OneSignalDbContract;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzw {
    private String zza = null;
    private String zzb = null;
    private zzcno zzc = null;
    private zzfvz zzd = null;
    private boolean zze = false;
    private zzfwm zzf;

    private final zzfwo zzl() {
        zzfwn zzc2 = zzfwo.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzju)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        return zzc2.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcno zzcno, Context context) {
        this.zzc = zzcno;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfvz zzfvz;
        if (!this.zze || (zzfvz = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfvz.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
    }

    public final void zzc() {
        zzfvz zzfvz;
        if (!this.zze || (zzfvz = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfvx zzc2 = zzfvy.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzju)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        zzfvz.zzb(zzc2.zzc(), this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str, Map map) {
        zzcib.zze.execute(new zzu(this, str, map));
    }

    /* access modifiers changed from: package-private */
    public final void zzf(String str, String str2) {
        zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfvz zzfvz;
        if (!this.zze || (zzfvz = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfvz.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str, Map map) {
        zzcno zzcno = this.zzc;
        if (zzcno != null) {
            zzcno.zzd(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzfwl zzfwl) {
        if (!TextUtils.isEmpty(zzfwl.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzju)).booleanValue()) {
                this.zza = zzfwl.zzb();
            }
        }
        switch (zzfwl.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfwl.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    public final void zzj(zzcno zzcno, zzfwj zzfwj) {
        if (zzcno == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcno;
        if (this.zze || zzk(zzcno.getContext())) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzju)).booleanValue()) {
                this.zzb = zzfwj.zzg();
            }
            zzm();
            zzfvz zzfvz = this.zzd;
            if (zzfvz != null) {
                zzfvz.zzd(zzfwj, this.zzf);
                return;
            }
            return;
        }
        zzf("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfxi.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfwa.zza(context);
        } catch (NullPointerException e2) {
            zze.zza("Error connecting LMD Overlay service");
            zzt.zzo().zzu(e2, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
