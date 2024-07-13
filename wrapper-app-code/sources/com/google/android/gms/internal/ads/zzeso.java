package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeso {
    private final zzdqr zza;
    private final zzesb zzb;
    private final zzdeq zzc;

    public zzeso(zzdqr zzdqr, zzfnt zzfnt) {
        this.zza = zzdqr;
        zzesb zzesb = new zzesb(zzfnt);
        this.zzb = zzesb;
        this.zzc = new zzesn(zzesb, this.zza.zzg());
    }

    public final zzdeq zza() {
        return this.zzc;
    }

    public final zzdgb zzb() {
        return this.zzb;
    }

    public final zzdon zzc() {
        return new zzdon(this.zza, this.zzb.zzc());
    }

    public final zzesb zzd() {
        return this.zzb;
    }

    public final void zze(zzbh zzbh) {
        this.zzb.zze(zzbh);
    }
}
