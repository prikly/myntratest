package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdys implements zzdeq, zzdgb, zzdhi {
    private final zzdzc zza;
    private final zzdzm zzb;

    public zzdys(zzdzc zzdzc, zzdzm zzdzm) {
        this.zza = zzdzc;
        this.zzb = zzdzm;
    }

    public final void zza(zze zze) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze.zza));
        this.zza.zza().put("ed", zze.zzc);
        this.zzb.zze(this.zza.zza());
    }

    public final void zzb(zzfix zzfix) {
        this.zza.zzb(zzfix);
    }

    public final void zzbG(zzccb zzccb) {
        this.zza.zzc(zzccb.zza);
    }

    public final void zzn() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
