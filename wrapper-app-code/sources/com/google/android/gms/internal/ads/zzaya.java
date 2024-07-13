package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaya implements Runnable {
    final /* synthetic */ zzayd zza;
    final /* synthetic */ zzayf zzb;

    zzaya(zzayf zzayf, zzayd zzayd) {
        this.zzb = zzayf;
        this.zza = zzayd;
    }

    public final void run() {
        this.zza.zza();
        int size = this.zzb.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzayu) this.zzb.zzn.valueAt(i)).zzi();
        }
    }
}
