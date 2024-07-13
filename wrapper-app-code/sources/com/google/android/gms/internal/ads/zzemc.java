package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemc implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzemc(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemb((Context) this.zza.zzb(), (zzczi) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
