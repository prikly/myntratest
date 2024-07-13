package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcww implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzcww(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzdbd) this.zza).zza();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new zzbbt(UUID.randomUUID().toString(), ((zzcqa) this.zzb).zza(), str, (JSONObject) this.zzc.zzb(), false, equals);
    }
}
