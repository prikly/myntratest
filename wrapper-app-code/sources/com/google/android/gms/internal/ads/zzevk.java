package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevk implements zzezm {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzezm zzc;
    private final long zzd;

    public zzevk(zzezm zzezm, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzezm;
        this.zzd = j;
    }

    public final int zza() {
        return 16;
    }

    public final zzgfb zzb() {
        zzevj zzevj = (zzevj) this.zza.get();
        if (zzevj == null || zzevj.zza()) {
            zzevj = new zzevj(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzevj);
        }
        return zzevj.zza;
    }
}
