package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcp {
    public static zzezm zza(zzfbt zzfbt, zzexl zzexl, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new zzext(zzexl, 0, scheduledExecutorService) : new zzext(zzfbt, 0, scheduledExecutorService);
    }

    public static zzezm zzb(zzfcd zzfcd, ScheduledExecutorService scheduledExecutorService) {
        return new zzext(zzfcd, ((Long) zzba.zzc().zzb(zzbjj.zzdC)).longValue(), scheduledExecutorService);
    }

    public static zzezm zzc(zzfcy zzfcy, ScheduledExecutorService scheduledExecutorService) {
        return new zzext(zzfcy, 0, scheduledExecutorService);
    }
}
