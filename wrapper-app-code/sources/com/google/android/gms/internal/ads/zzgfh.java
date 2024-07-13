package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfh extends zzgfe implements zzgfc, ScheduledExecutorService {
    final ScheduledExecutorService zza;

    zzgfh(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        if (scheduledExecutorService != null) {
            this.zza = scheduledExecutorService;
            return;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzgfr zzf = zzgfr.zzf(runnable, (Object) null);
        return new zzgff(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgfg zzgfg = new zzgfg(runnable);
        return new zzgff(zzgfg, this.zza.scheduleAtFixedRate(zzgfg, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgfg zzgfg = new zzgfg(runnable);
        return new zzgff(zzgfg, this.zza.scheduleWithFixedDelay(zzgfg, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgfr zzgfr = new zzgfr(callable);
        return new zzgff(zzgfr, this.zza.schedule(zzgfr, j, timeUnit));
    }
}
