package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzajp implements Runnable {
    final /* synthetic */ zzake zza;
    final /* synthetic */ zzajq zzb;

    zzajp(zzajq zzajq, zzake zzake) {
        this.zzb = zzajq;
        this.zza = zzake;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
