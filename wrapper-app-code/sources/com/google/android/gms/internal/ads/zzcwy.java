package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcwy implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzcwy(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcws zzcws = (zzcws) this.zza.zzb();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        if (((JSONObject) this.zzc.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzdlu(zzcws, zzgfc));
        }
        zzhex.zzb(set);
        return set;
    }
}
