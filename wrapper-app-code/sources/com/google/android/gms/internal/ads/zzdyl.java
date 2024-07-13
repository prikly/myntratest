package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdyl implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzdyl(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String str = (String) this.zza.zzb();
        Context zza2 = ((zzcpp) this.zzb).zza();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        Map zzd2 = ((zzhet) this.zzd).zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzes)).booleanValue()) {
            zzbew zzbew = new zzbew(new zzbfc(zza2));
            zzbew.zzb(new zzdym(str));
            set = Collections.singleton(new zzdlu(new zzdyo(zzbew, zzd2), zzgfc));
        } else {
            set = Collections.emptySet();
        }
        zzhex.zzb(set);
        return set;
    }
}
