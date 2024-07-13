package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzebk implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;

    public zzebk(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5, zzhfc zzhfc6, zzhfc zzhfc7, zzhfc zzhfc8, zzhfc zzhfc9, zzhfc zzhfc10) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
        this.zzf = zzhfc6;
        this.zzg = zzhfc7;
        this.zzh = zzhfc8;
        this.zzi = zzhfc9;
        this.zzj = zzhfc10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcpp) this.zzb).zza();
        WeakReference zza3 = ((zzcpq) this.zzc).zza();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return new zzebj((Executor) this.zza.zzb(), zza2, zza3, zzgfc, (zzdxc) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdzq) this.zzg.zzb(), ((zzcqa) this.zzh).zza(), ((zzdlg) this.zzi).zzb(), (zzfoy) this.zzj.zzb());
    }
}
