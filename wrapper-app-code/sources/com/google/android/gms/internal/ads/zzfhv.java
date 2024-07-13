package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfhv implements zzgen {
    final /* synthetic */ zzesq zza;
    final /* synthetic */ zzfow zzb;
    final /* synthetic */ zzfol zzc;
    final /* synthetic */ zzfhx zzd;
    final /* synthetic */ zzfhy zze;

    zzfhv(zzfhy zzfhy, zzesq zzesq, zzfow zzfow, zzfol zzfol, zzfhx zzfhx) {
        this.zze = zzfhy;
        this.zza = zzesq;
        this.zzb = zzfow;
        this.zzc = zzfol;
        this.zzd = zzfhx;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfow zzfow;
        zzdvy zzdvy = (zzdvy) this.zze.zze.zzd();
        if (zzdvy == null) {
            zze2 = zzfkg.zzb(th, (zzekv) null);
        } else {
            zze2 = zzdvy.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdvy != null) {
                zzdvy.zza().zza(zze2);
                this.zze.zzb.execute(new zzfhu(this, zze2));
            } else {
                this.zze.zzd.zza(zze2);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzd();
            }
            zzfka.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzg = this.zze.zzg;
                zzfol zzfol = this.zzc;
                zzfol.zza(zze2);
                zzfol.zzg(th);
                zzfol.zzf(false);
                zzg.zzb(zzfol.zzl());
            } else {
                zzfow.zzc(zze2);
                zzfol zzfol2 = this.zzc;
                zzfol2.zzg(th);
                zzfol2.zzf(false);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfow zzfow;
        zzdvt zzdvt = (zzdvt) obj;
        synchronized (this.zze) {
            zzdvt.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdvt);
            zzfhy zzfhy = this.zze;
            Executor zzh = zzfhy.zzb;
            zzfho zzf = zzfhy.zzd;
            zzf.getClass();
            zzh.execute(new zzfht(zzf));
            this.zze.zzd.zzv();
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzg = this.zze.zzg;
                zzfol zzfol = this.zzc;
                zzfol.zzb(zzdvt.zzp().zzb);
                zzfol.zzd(zzdvt.zzl().zzg());
                zzfol.zzf(true);
                zzg.zzb(zzfol.zzl());
            } else {
                zzfow.zzf(zzdvt.zzp().zzb);
                zzfow.zze(zzdvt.zzl().zzg());
                zzfol zzfol2 = this.zzc;
                zzfol2.zzf(true);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }
}
