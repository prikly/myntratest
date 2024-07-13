package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzesi implements zzesq {
    final /* synthetic */ zzesj zza;

    zzesi(zzesj zzesj) {
        this.zza = zzesj;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdmv zzdmv = (zzdmv) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdmv;
            this.zza.zzh.zzab();
        }
    }
}
