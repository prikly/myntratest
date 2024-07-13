package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzext implements zzezm {
    private final zzezm zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzext(zzezm zzezm, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzezm;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final zzgfb zzb() {
        zzgfb zzb2 = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb2 = zzger.zzo(zzb2, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzger.zzg(zzb2, Throwable.class, zzexs.zza, zzcib.zzf);
    }
}
