package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdot implements zzhep {
    private final zzhfc zza;

    public zzdot(zzhfc zzhfc) {
        this.zza = zzhfc;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdoq) this.zza).zza().zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzhex.zzb(set);
        return set;
    }
}
