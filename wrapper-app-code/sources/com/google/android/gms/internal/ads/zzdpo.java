package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdpo implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzdpo(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchu zza2 = ((zzcqa) this.zza).zza();
        zzt.zzp();
        return new zzbbt(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
    }
}
