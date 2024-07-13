package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcpt implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzcpt(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzeik zzeik = (zzeik) this.zza.zzb();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbP)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue()) {
                set = Collections.singleton(new zzdlu(zzeik, zzgfc));
                zzhex.zzb(set);
                return set;
            }
        }
        set = Collections.emptySet();
        zzhex.zzb(set);
        return set;
    }
}
