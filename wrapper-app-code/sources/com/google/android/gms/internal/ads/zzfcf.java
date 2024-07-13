package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcf implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzfcf(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfcd(new zzbzu(), (ScheduledExecutorService) this.zzb.zzb(), ((zzcpp) this.zzc).zza(), (byte[]) null);
    }
}
