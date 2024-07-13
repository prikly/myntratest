package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfl implements Runnable {
    zzgfo zza;

    zzgfl(zzgfo zzgfo) {
        this.zza = zzgfo;
    }

    public final void run() {
        zzgfb zzf;
        String str;
        zzgfo zzgfo = this.zza;
        if (zzgfo != null && (zzf = zzgfo.zza) != null) {
            this.zza = null;
            if (zzf.isDone()) {
                zzgfo.zzt(zzf);
                return;
            }
            try {
                ScheduledFuture zzw = zzgfo.zzb;
                zzgfo.zzb = null;
                str = "Timed out";
                if (zzw != null) {
                    long abs = Math.abs(zzw.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgfo.zze(new zzgfn(str + ": " + zzf.toString(), (zzgfm) null));
                zzf.cancel(true);
            } catch (Throwable th) {
                zzf.cancel(true);
                throw th;
            }
        }
    }
}
