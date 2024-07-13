package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsr implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzdsr(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzdsq((zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzgfc);
    }
}
