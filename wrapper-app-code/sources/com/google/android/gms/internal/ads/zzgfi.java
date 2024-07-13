package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgfi {
    public static zzgfc zza(ExecutorService executorService) {
        zzgfc zzgfc;
        if (executorService instanceof zzgfc) {
            return (zzgfc) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgfc = new zzgfh((ScheduledExecutorService) executorService);
        } else {
            zzgfc = new zzgfe(executorService);
        }
        return zzgfc;
    }

    public static Executor zzb() {
        return zzgef.INSTANCE;
    }

    static Executor zzc(Executor executor, zzgdf zzgdf) {
        if (executor == null) {
            throw null;
        } else if (executor == zzgef.INSTANCE) {
            return executor;
        } else {
            return new zzgfd(executor, zzgdf);
        }
    }
}
