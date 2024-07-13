package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzegu implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzegu(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    /* renamed from: zza */
    public final zzegt zzb() {
        return new zzegt(((zzcpp) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
