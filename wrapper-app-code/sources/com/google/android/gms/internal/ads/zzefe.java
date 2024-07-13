package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzefe implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzefe(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    /* renamed from: zza */
    public final zzefd zzb() {
        Map zzd = ((zzhew) this.zza).zzd();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzefd(zzd, zzgfc, ((zzdhh) this.zzc).zzb());
    }
}
