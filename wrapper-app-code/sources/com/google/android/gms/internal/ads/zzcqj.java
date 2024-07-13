package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcqj implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzcqj(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    /* renamed from: zza */
    public final zzccm zzb() {
        Context zza2 = ((zzcpp) this.zza).zza();
        zzfoy zzfoy = (zzfoy) this.zzb.zzb();
        zzt.zzf().zzb(zza2, zzchu.zza(), zzfoy).zza("google.afma.request.getAdDictionary", zzbuq.zza, zzbuq.zza);
        zzbut zzb2 = zzt.zzf().zzb(zza2, zzchu.zza(), zzfoy);
        zzbun zzbun = zzbuq.zza;
        return new zzccl(zza2, zzb2.zza("google.afma.sdkConstants.getSdkConstants", zzbun, zzbun));
    }
}
