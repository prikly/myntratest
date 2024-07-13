package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfmj implements zzhep {
    private final zzhfc zza;

    public zzfmj(zzhfc zzhfc) {
        this.zza = zzhfc;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfva.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzhex.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
