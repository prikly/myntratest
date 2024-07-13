package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfot implements zzgen {
    final /* synthetic */ zzfow zza;
    final /* synthetic */ zzfol zzb;
    final /* synthetic */ boolean zzc;

    zzfot(zzfow zzfow, zzfol zzfol, boolean z) {
        this.zza = zzfow;
        this.zzb = zzfol;
        this.zzc = z;
    }

    public final void zza(Throwable th) {
        zzfol zzfol = this.zzb;
        if (zzfol.zzj()) {
            zzfow zzfow = this.zza;
            zzfol.zzg(th);
            zzfol.zzf(false);
            zzfow.zza(zzfol);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfow zzfow = this.zza;
        zzfol zzfol = this.zzb;
        zzfol.zzf(true);
        zzfow.zza(zzfol);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
