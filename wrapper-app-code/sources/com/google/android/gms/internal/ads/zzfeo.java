package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfeo implements zzesq {
    final /* synthetic */ zzfep zza;

    zzfeo(zzfep zzfep) {
        this.zza = zzfep;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcye zzcye = (zzcye) obj;
        synchronized (this.zza) {
            zzcye zzcye2 = this.zza.zza;
            if (zzcye2 != null) {
                zzcye2.zzaa();
            }
            zzfep zzfep = this.zza;
            zzfep.zza = zzcye;
            zzcye.zzc(zzfep);
            zzfep zzfep2 = this.zza;
            zzfep2.zzg.zzl(new zzcyf(zzcye, zzfep2, zzfep2.zzg));
            zzcye.zzab();
        }
    }
}
