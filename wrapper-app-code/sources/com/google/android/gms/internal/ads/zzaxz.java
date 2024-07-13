package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaxz implements Runnable {
    final /* synthetic */ zzayf zza;

    zzaxz(zzayf zzayf) {
        this.zza = zzayf;
    }

    public final void run() {
        zzayf zzayf = this.zza;
        if (!zzayf.zzF) {
            zzayf.zzo.zze(zzayf);
        }
    }
}
