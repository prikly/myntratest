package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcw implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;

    public zzfcw(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5, zzhfc zzhfc6, zzhfc zzhfc7) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
        this.zzf = zzhfc6;
        this.zzg = zzhfc7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzfck) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzfcl) this.zzc).zzb().booleanValue();
        zzcgm zzcgm = new zzcgm();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzfcu((zzcgx) this.zza.zzb(), booleanValue, booleanValue2, zzcgm, zzgfc, ((zzfch) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb(), (byte[]) null);
    }
}
