package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfoi implements zzdfd, zzdll, zzdlp {
    private final zzfow zza;
    private final zzfol zzb;

    zzfoi(Context context, zzfow zzfow) {
        this.zza = zzfow;
        this.zzb = zzfok.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbks.zzd.zze()).booleanValue()) {
            zzfow zzfow = this.zza;
            zzfol zzfol = this.zzb;
            zzfol.zzf(true);
            zzfow.zza(zzfol);
        }
    }

    public final void zzf() {
    }

    public final void zzg() {
        if (((Boolean) zzbks.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    public final void zzk(zze zze) {
        if (((Boolean) zzbks.zzd.zze()).booleanValue()) {
            zzfow zzfow = this.zza;
            zzfol zzfol = this.zzb;
            zzfol.zzc(zze.zza().toString());
            zzfol.zzf(false);
            zzfow.zza(zzfol);
        }
    }
}
