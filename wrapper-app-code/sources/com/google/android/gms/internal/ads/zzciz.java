package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzciz implements Runnable {
    final /* synthetic */ zzcjb zza;

    zzciz(zzcjb zzcjb) {
        this.zza = zzcjb;
    }

    public final void run() {
        zzcjb zzcjb = this.zza;
        if (zzcjb.zzr != null) {
            if (!zzcjb.zzs) {
                zzcjb.zzr.zzg();
                this.zza.zzs = true;
            }
            this.zza.zzr.zze();
        }
    }
}
