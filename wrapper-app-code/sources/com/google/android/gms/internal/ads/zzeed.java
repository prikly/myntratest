package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeed implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzeed(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    /* renamed from: zza */
    public final zzeec zzb() {
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzeec((ScheduledExecutorService) this.zza.zzb(), zzgfc, ((zzeeu) this.zzc).zzb(), zzheo.zza(this.zzd));
    }
}
