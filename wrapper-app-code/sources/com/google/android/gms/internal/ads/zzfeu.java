package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfeu implements zzgen {
    final /* synthetic */ zzesq zza;
    final /* synthetic */ zzfow zzb;
    final /* synthetic */ zzfol zzc;
    final /* synthetic */ zzczi zzd;
    final /* synthetic */ zzfev zze;

    zzfeu(zzfev zzfev, zzesq zzesq, zzfow zzfow, zzfol zzfol, zzczi zzczi) {
        this.zze = zzfev;
        this.zza = zzesq;
        this.zzb = zzfow;
        this.zzc = zzfol;
        this.zzd = zzczi;
    }

    public final void zza(Throwable th) {
        zzfow zzfow;
        zze zza2 = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza2);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhq)).booleanValue()) {
                this.zze.zzb.execute(new zzfet(this, zza2));
            }
            zzfev zzfev = this.zze;
            zzfev.zzh.zzd(zzfev.zzj.zzc());
            zzfka.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzj = this.zze.zzi;
                zzfol zzfol = this.zzc;
                zzfol.zza(zza2);
                zzfol.zzg(th);
                zzfol.zzf(false);
                zzj.zzb(zzfol.zzl());
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
        zzcyl zzcyl = (zzcyl) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcyl.zzc() != null) {
                ViewParent parent = zzcyl.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcyl.zzl() != null) {
                        str = zzcyl.zzl().zzg();
                    }
                    com.google.android.gms.ads.internal.util.zze.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcyl.zzc());
                }
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhq)).booleanValue()) {
                zzdis zzn = zzcyl.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcyl.zzc());
            this.zza.zzb(zzcyl);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhq)).booleanValue()) {
                zzfev zzfev = this.zze;
                Executor zzk = zzfev.zzb;
                zzesb zzg = zzfev.zzd;
                zzg.getClass();
                zzk.execute(new zzfes(zzg));
            }
            this.zze.zzh.zzd(zzcyl.zza());
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zzj = this.zze.zzi;
                zzfol zzfol = this.zzc;
                zzfol.zzb(zzcyl.zzp().zzb);
                zzfol.zzd(zzcyl.zzl().zzg());
                zzfol.zzf(true);
                zzj.zzb(zzfol.zzl());
            } else {
                zzfow.zzf(zzcyl.zzp().zzb);
                zzfow.zze(zzcyl.zzl().zzg());
                zzfol zzfol2 = this.zzc;
                zzfol2.zzf(true);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }
}
