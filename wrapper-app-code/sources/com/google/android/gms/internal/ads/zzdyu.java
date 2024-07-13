package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdyu implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzdyu(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdys zzdys = (zzdys) this.zza.zzb();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return ((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue() ? new zzdlu((zzeii) this.zzc.zzb(), zzgfc) : new zzdlu(zzdys, zzgfc);
    }
}
