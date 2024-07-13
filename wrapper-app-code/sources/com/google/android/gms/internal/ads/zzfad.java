package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfad implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;

    public zzfad(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5, zzhfc zzhfc6, zzhfc zzhfc7) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
        this.zzf = zzhfc6;
        this.zzg = zzhfc7;
    }

    public static zzfab zza(zzcgo zzcgo, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzfab(zzcgo, context, scheduledExecutorService, executor, i, z, z2, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzfab(new zzcgo(), ((zzcpp) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzgfc, ((zzfci) this.zze).zzb().intValue(), ((zzfcj) this.zzf).zzb().booleanValue(), ((zzfcl) this.zzg).zzb().booleanValue(), (byte[]) null);
    }
}
