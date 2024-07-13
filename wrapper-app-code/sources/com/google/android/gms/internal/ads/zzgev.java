package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgev implements zzgfb {
    static final zzgfb zza = new zzgev((Object) null);
    private static final Logger zzb = Logger.getLogger(zzgev.class.getName());
    private final Object zzc;

    zzgev(Object obj) {
        this.zzc = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.zzc;
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        if (timeUnit != null) {
            return this.zzc;
        }
        throw null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zzc);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    public final void zzc(Runnable runnable, Executor executor) {
        zzfye.zzc(runnable, "Runnable was null.");
        zzfye.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e2);
        }
    }
}
