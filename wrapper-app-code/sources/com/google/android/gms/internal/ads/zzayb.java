package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzayb implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzayf zzb;

    zzayb(zzayf zzayf, IOException iOException) {
        this.zzb = zzayf;
        this.zza = iOException;
    }

    public final void run() {
        this.zzb.zze.zzi(this.zza);
    }
}
