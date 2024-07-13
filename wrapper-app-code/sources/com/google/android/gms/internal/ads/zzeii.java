package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeii implements zzdeq, zzdgb, zzdhi {
    private final zzfns zza;
    private final zzfnt zzb;
    private final zzchb zzc;

    public zzeii(zzfns zzfns, zzfnt zzfnt, zzchb zzchb) {
        this.zza = zzfns;
        this.zzb = zzfnt;
        this.zzc = zzchb;
    }

    public final void zza(zze zze) {
        zzfns zzfns = this.zza;
        zzfns.zza("action", "ftl");
        zzfns.zza("ftl", String.valueOf(zze.zza));
        zzfns.zza("ed", zze.zzc);
        this.zzb.zzb(this.zza);
    }

    public final void zzb(zzfix zzfix) {
        this.zza.zzh(zzfix, this.zzc);
    }

    public final void zzbG(zzccb zzccb) {
        this.zza.zzi(zzccb.zza);
    }

    public final void zzn() {
        zzfnt zzfnt = this.zzb;
        zzfns zzfns = this.zza;
        zzfns.zza("action", "loaded");
        zzfnt.zzb(zzfns);
    }
}
