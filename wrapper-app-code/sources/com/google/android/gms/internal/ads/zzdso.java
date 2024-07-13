package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdso implements zzhep {
    private final zzdsh zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzdso(zzdsh zzdsh, zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzdsh;
        this.zzb = zzhfc;
        this.zzc = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlu(((zzdvp) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
