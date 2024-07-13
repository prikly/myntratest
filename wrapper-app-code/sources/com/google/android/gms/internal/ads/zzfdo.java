package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfdo implements zzgen {
    final /* synthetic */ zzesq zza;
    final /* synthetic */ zzfow zzb;
    final /* synthetic */ zzfol zzc;
    final /* synthetic */ zzfdq zzd;
    final /* synthetic */ zzfdr zze;

    zzfdo(zzfdr zzfdr, zzesq zzesq, zzfow zzfow, zzfol zzfol, zzfdq zzfdq) {
        this.zze = zzfdr;
        this.zza = zzesq;
        this.zzb = zzfow;
        this.zzc = zzfol;
        this.zzd = zzfdq;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfow zzfow;
        zzcxs zzcxs = (zzcxs) this.zze.zze.zzd();
        if (zzcxs == null) {
            zze2 = zzfkg.zzb(th, (zzekv) null);
        } else {
            zze2 = zzcxs.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcxs != null) {
                zzcxs.zzc().zza(zze2);
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzhr)).booleanValue()) {
                    this.zze.zzc.execute(new zzfdn(this, zze2));
                }
            } else {
                this.zze.zzd.zza(zze2);
                ((zzcxs) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzd();
            }
            zzfka.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzh = this.zze.zzh;
                zzfol zzfol = this.zzc;
                zzfol.zza(zze2);
                zzfol.zzg(th);
                zzfol.zzf(false);
                zzh.zzb(zzfol.zzl());
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
        zzdan zzdan = (zzdan) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhr)).booleanValue()) {
                zzdan.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzdan);
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzh = this.zze.zzh;
                zzfol zzfol = this.zzc;
                zzfol.zzb(zzdan.zzp().zzb);
                zzfol.zzd(zzdan.zzl().zzg());
                zzfol.zzf(true);
                zzh.zzb(zzfol.zzl());
            } else {
                zzfow.zzf(zzdan.zzp().zzb);
                zzfow.zze(zzdan.zzl().zzg());
                zzfol zzfol2 = this.zzc;
                zzfol2.zzf(true);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }
}
