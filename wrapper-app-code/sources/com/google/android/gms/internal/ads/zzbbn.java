package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbbn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbbr zzc;

    zzbbn(zzbbr zzbbr, int i, long j) {
        this.zzc = zzbbr;
        this.zza = i;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzb.zzl(this.zza, this.zzb);
    }
}
