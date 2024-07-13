package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcyp implements zzhep {
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

    public zzcyp(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5, zzhfc zzhfc6, zzhfc zzhfc7, zzhfc zzhfc8, zzhfc zzhfc9, zzhfc zzhfc10) {
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

    public static zzcyo zzc(zzdam zzdam, Context context, zzfim zzfim, View view, zzcno zzcno, zzdal zzdal, zzdqr zzdqr, zzdme zzdme, zzhej zzhej, Executor executor) {
        return new zzcyo(zzdam, context, zzfim, view, zzcno, zzdal, zzdqr, zzdme, zzhej, executor);
    }

    /* renamed from: zza */
    public final zzcyo zzb() {
        return new zzcyo(((zzdcm) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcyv) this.zzc).zza(), ((zzcyu) this.zzd).zza(), ((zzczg) this.zze).zza(), ((zzcyw) this.zzf).zza(), ((zzdoq) this.zzg).zza(), (zzdme) this.zzh.zzb(), zzheo.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
