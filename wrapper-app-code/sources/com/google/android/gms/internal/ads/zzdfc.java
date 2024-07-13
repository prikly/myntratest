package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdfc implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzdfc(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdez zza2 = ((zzdfb) this.zza).zzb();
        Set zzc2 = ((zzhfa) this.zzb).zzb();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzdfa(zza2, zzc2, zzgfc, (ScheduledExecutorService) this.zzd.zzb());
    }
}
