package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzij implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzim zzb;

    zzij(zzim zzim, long j) {
        this.zzb = zzim;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
