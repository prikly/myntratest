package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfgp implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;

    public zzfgp(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5, zzhfc zzhfc6) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
        this.zzf = zzhfc6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfgo((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcpj) this.zzc.zzb(), (zzesb) this.zzd.zzb(), (zzfho) this.zze.zzb(), new zzfje());
    }
}
