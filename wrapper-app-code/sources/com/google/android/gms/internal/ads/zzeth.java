package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeth implements zzezm {
    private final Clock zza;
    private final zzfjg zzb;

    zzeth(Clock clock, zzfjg zzfjg) {
        this.zza = clock;
        this.zzb = zzfjg;
    }

    public final int zza() {
        return 4;
    }

    public final zzgfb zzb() {
        return zzger.zzi(new zzeti(this.zzb, this.zza.currentTimeMillis()));
    }
}
