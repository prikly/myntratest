package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzflk implements zzgen {
    final /* synthetic */ zzfln zza;
    final /* synthetic */ zzflo zzb;

    zzflk(zzflo zzflo, zzfln zzfln) {
        this.zzb = zzflo;
        this.zza = zzfln;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzflo zzflo = this.zzb;
            if (zzflo.zzf == 1) {
                zzflo.zzh();
            }
        }
    }
}
