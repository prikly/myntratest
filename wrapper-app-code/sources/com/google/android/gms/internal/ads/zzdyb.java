package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdyb implements zza, zzdeq, zzdfh, zzdgb, zzdhi, zzdju {
    private final zzbew zza;
    private boolean zzb = false;

    public zzdyb(zzbew zzbew, zzfgg zzfgg) {
        this.zza = zzbew;
        zzbew.zzc(2);
        if (zzfgg != null) {
            zzbew.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zza(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzb(zzfix zzfix) {
        this.zza.zzb(new zzdxx(zzfix));
    }

    public final void zzbG(zzccb zzccb) {
    }

    public final void zzd() {
        this.zza.zzc(1109);
    }

    public final void zze(zzbfr zzbfr) {
        this.zza.zzb(new zzdya(zzbfr));
        this.zza.zzc(1103);
    }

    public final void zzf(zzbfr zzbfr) {
        this.zza.zzb(new zzdxz(zzbfr));
        this.zza.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzi(zzbfr zzbfr) {
        this.zza.zzb(new zzdxy(zzbfr));
        this.zza.zzc(1104);
    }

    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    public final void zzn() {
        this.zza.zzc(3);
    }
}
