package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdxw implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzdxw(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        zzdyo zza2 = ((zzdyp) this.zzb).zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzes)).booleanValue()) {
            set = Collections.singleton(new zzdlu(zza2, zzgfc));
        } else {
            set = Collections.emptySet();
        }
        zzhex.zzb(set);
        return set;
    }
}
