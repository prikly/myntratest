package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzciu implements Runnable {
    final /* synthetic */ zzcjb zza;

    zzciu(zzcjb zzcjb) {
        this.zza = zzcjb;
    }

    public final void run() {
        zzcjb zzcjb = this.zza;
        if (zzcjb.zzr != null) {
            zzcjb.zzr.zza();
        }
    }
}
