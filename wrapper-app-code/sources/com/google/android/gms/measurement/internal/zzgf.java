package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzgf implements Runnable {
    final /* synthetic */ zzkw zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgj zzc;

    zzgf(zzgj zzgj, zzkw zzkw, zzq zzq) {
        this.zzc = zzgj;
        this.zza = zzkw;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzP(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzW(this.zza, this.zzb);
        }
    }
}
