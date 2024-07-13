package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcix implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcjb zzc;

    zzcix(zzcjb zzcjb, int i, int i2) {
        this.zzc = zzcjb;
        this.zza = i;
        this.zzb = i2;
    }

    public final void run() {
        zzcjb zzcjb = this.zzc;
        if (zzcjb.zzr != null) {
            zzcjb.zzr.zzj(this.zza, this.zzb);
        }
    }
}
