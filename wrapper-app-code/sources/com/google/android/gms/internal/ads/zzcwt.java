package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcwt implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;

    public zzcwt(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcws((zzbvc) this.zza.zzb(), (zzcwo) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzcwn) this.zzd.zzb(), (Clock) this.zze.zzb());
    }
}
