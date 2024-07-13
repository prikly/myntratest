package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgeo implements Runnable {
    final Future zza;
    final zzgen zzb;

    zzgeo(Future future, zzgen zzgen) {
        this.zza = future;
        this.zzb = zzgen;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzgfu) || (zza2 = zzgfv.zza((zzgfu) future)) == null) {
            try {
                this.zzb.zzb(zzger.zzp(this.zza));
            } catch (ExecutionException e2) {
                this.zzb.zza(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.zzb.zza(e3);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfxx zza2 = zzfxy.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
