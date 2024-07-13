package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcyk implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzcyk(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    /* renamed from: zza */
    public final zzdhc zzb() {
        return new zzdhc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
