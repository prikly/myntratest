package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbbm implements Runnable {
    final /* synthetic */ zzatd zza;
    final /* synthetic */ zzbbr zzb;

    zzbbm(zzbbr zzbbr, zzatd zzatd) {
        this.zzb = zzbbr;
        this.zza = zzatd;
    }

    public final void run() {
        this.zzb.zzb.zzn(this.zza);
    }
}
