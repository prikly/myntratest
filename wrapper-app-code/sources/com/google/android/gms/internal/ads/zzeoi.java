package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzeoi implements zzgen {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfil zzc;
    final /* synthetic */ zzfio zzd;
    final /* synthetic */ zzfpk zze;
    final /* synthetic */ zzfix zzf;
    final /* synthetic */ zzeoj zzg;

    zzeoi(zzeoj zzeoj, long j, String str, zzfil zzfil, zzfio zzfio, zzfpk zzfpk, zzfix zzfix) {
        this.zzg = zzeoj;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfil;
        this.zzd = zzfio;
        this.zze = zzfpk;
        this.zzf = zzfix;
    }

    public final void zza(Throwable th) {
        Integer num;
        zze zze2;
        zze zzb2;
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        int i = 6;
        if (th instanceof TimeoutException) {
            num = null;
            i = 2;
        } else if (th instanceof zzeny) {
            num = null;
            i = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            i = 4;
        } else if (th instanceof zzfjl) {
            num = null;
            i = 5;
        } else {
            if (th instanceof zzede) {
                if (zzfkg.zza(th).zza == 3) {
                    i = 1;
                }
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzbv)).booleanValue() && (th instanceof zzeku) && (zzb2 = ((zzeku) th).zzb()) != null) {
                    num = Integer.valueOf(zzb2.zza);
                }
            }
            num = null;
        }
        zzeoj.zzg(this.zzg, this.zzb, i, elapsedRealtime, this.zzc.zzah, num);
        zzeoj zzeoj = this.zzg;
        if (zzeoj.zze) {
            zzeoj.zzb.zza(this.zzd, this.zzc, i, th instanceof zzeku ? (zzeku) th : null, elapsedRealtime);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhA)).booleanValue()) {
            zzfpo zzc2 = this.zzg.zzc;
            zzfpk zzfpk = this.zze;
            zzfix zzfix = this.zzf;
            zzfil zzfil = this.zzc;
            zzc2.zzd(zzfpk.zzc(zzfix, zzfil, zzfil.zzo));
        }
        zze zza2 = zzfkg.zza(th);
        int i2 = zza2.zza;
        if ((i2 == 3 || i2 == 0) && (zze2 = zza2.zzd) != null && !zze2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza2 = zzfkg.zza(new zzeku(13, zza2.zzd));
        }
        this.zzg.zzf.zze(this.zzc, elapsedRealtime, zza2);
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzeoj.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah, (Integer) null);
        zzeoj zzeoj = this.zzg;
        if (zzeoj.zze) {
            zzeoj.zzb.zza(this.zzd, this.zzc, 0, (zzeku) null, elapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, elapsedRealtime, (zze) null);
    }
}
