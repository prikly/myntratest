package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzezq implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;

    public zzezq(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
    }

    /* renamed from: zza */
    public final zzezp zzb() {
        Context zza2 = ((zzcpp) this.zza).zza();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzezp(zza2, zzgfc, ((zzhfa) this.zzc).zzb(), (zzfow) this.zzd.zzb(), (zzdzh) this.zze.zzb());
    }
}
