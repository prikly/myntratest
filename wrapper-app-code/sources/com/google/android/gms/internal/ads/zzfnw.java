package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfnw implements zzfnt {
    private final zzfnt zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzba.zzc().zzb(zzbjj.zzhN)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfnw(zzfnt zzfnt, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfnt;
        long intValue = (long) ((Integer) zzba.zzc().zzb(zzbjj.zzhM)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new zzfnv(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfnw zzfnw) {
        while (!zzfnw.zzb.isEmpty()) {
            zzfnw.zza.zzb((zzfns) zzfnw.zzb.remove());
        }
    }

    public final String zza(zzfns zzfns) {
        return this.zza.zza(zzfns);
    }

    public final void zzb(zzfns zzfns) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfns);
        } else if (!this.zzd.getAndSet(true)) {
            Queue queue = this.zzb;
            zzfns zzb2 = zzfns.zzb("dropped_event");
            Map zzj = zzfns.zzj();
            if (zzj.containsKey("action")) {
                zzb2.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb2);
        }
    }
}
