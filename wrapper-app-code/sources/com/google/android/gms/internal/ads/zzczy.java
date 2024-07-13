package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzczy implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzczy(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzczt(((zzdcm) this.zza).zzb(), ((zzczx) this.zzb).zza(), ((zzczw) this.zzc).zza(), (Executor) this.zzd.zzb());
    }
}
