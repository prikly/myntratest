package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbkj implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;

    public zzbkj(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
    }

    public final /* synthetic */ Object zzb() {
        return new zzbki(((zzcpp) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), new zzbkk(), (zzfow) this.zzd.zzb(), (byte[]) null);
    }
}
