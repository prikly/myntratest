package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfo extends zzgeh {
    /* access modifiers changed from: private */
    public zzgfb zza;
    /* access modifiers changed from: private */
    public ScheduledFuture zzb;

    private zzgfo(zzgfb zzgfb) {
        if (zzgfb != null) {
            this.zza = zzgfb;
            return;
        }
        throw null;
    }

    static zzgfb zzg(zzgfb zzgfb, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfo zzgfo = new zzgfo(zzgfb);
        zzgfl zzgfl = new zzgfl(zzgfo);
        zzgfo.zzb = scheduledExecutorService.schedule(zzgfl, j, timeUnit);
        zzgfb.zzc(zzgfl, zzgef.INSTANCE);
        return zzgfo;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzgfb zzgfb = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzgfb == null) {
            return null;
        }
        String str = "inputFuture=[" + zzgfb.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
