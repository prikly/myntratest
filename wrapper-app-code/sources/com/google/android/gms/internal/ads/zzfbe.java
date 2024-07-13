package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfbe implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;

    public zzfbe(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
    }

    public static zzfbc zza(String str, zzbdz zzbdz, zzcgx zzcgx, ScheduledExecutorService scheduledExecutorService, zzgfc zzgfc) {
        return new zzfbc(str, zzbdz, zzcgx, scheduledExecutorService, zzgfc, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzfbc(((zzfch) this.zza).zza(), new zzbdz(), (zzcgx) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzgfc, (byte[]) null);
    }
}
