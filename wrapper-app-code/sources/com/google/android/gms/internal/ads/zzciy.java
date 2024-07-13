package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzciy implements Runnable {
    final /* synthetic */ zzcjb zza;

    zzciy(zzcjb zzcjb) {
        this.zza = zzcjb;
    }

    public final void run() {
        zzcjb zzcjb = this.zza;
        if (zzcjb.zzr != null) {
            zzcjb.zzr.zzd();
            this.zza.zzr.zzi();
        }
    }
}
