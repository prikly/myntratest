package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfgn implements zzgen {
    final /* synthetic */ zzesq zza;
    final /* synthetic */ zzfow zzb;
    final /* synthetic */ zzfol zzc;
    final /* synthetic */ zzdnw zzd;
    final /* synthetic */ zzfgo zze;

    zzfgn(zzfgo zzfgo, zzesq zzesq, zzfow zzfow, zzfol zzfol, zzdnw zzdnw) {
        this.zze = zzfgo;
        this.zza = zzesq;
        this.zzb = zzfow;
        this.zzc = zzfol;
        this.zzd = zzdnw;
    }

    public final void zza(Throwable th) {
        zzfow zzfow;
        zze zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza2);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhs)).booleanValue()) {
                this.zze.zzb.execute(new zzfgl(this, zza2));
                this.zze.zzb.execute(new zzfgm(this, zza2));
            }
            zzfka.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zze2 = this.zze.zzg;
                zzfol zzfol = this.zzc;
                zzfol.zza(zza2);
                zzfol.zzg(th);
                zzfol.zzf(false);
                zze2.zzb(zzfol.zzl());
            } else {
                zzfow.zzc(zza2);
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
        zzdmv zzdmv = (zzdmv) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhs)).booleanValue()) {
                zzdis zzn = zzdmv.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdmv);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhs)).booleanValue()) {
                this.zze.zzb.execute(new zzfgj(this));
                this.zze.zzb.execute(new zzfgk(this));
            }
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zze2 = this.zze.zzg;
                zzfol zzfol = this.zzc;
                zzfol.zzb(zzdmv.zzp().zzb);
                zzfol.zzd(zzdmv.zzl().zzg());
                zzfol.zzf(true);
                zze2.zzb(zzfol.zzl());
            } else {
                zzfow.zzf(zzdmv.zzp().zzb);
                zzfow.zze(zzdmv.zzl().zzg());
                zzfol zzfol2 = this.zzc;
                zzfol2.zzf(true);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }
}
