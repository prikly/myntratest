package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzebi extends zzbsc {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfol zzd;
    final /* synthetic */ zzcig zze;
    final /* synthetic */ zzebj zzf;

    zzebi(zzebj zzebj, Object obj, String str, long j, zzfol zzfol, zzcig zzcig) {
        this.zzf = zzebj;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfol;
        this.zze = zzcig;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfoy zze2 = this.zzf.zzp;
            zzfol zzfol = this.zzd;
            zzfol.zzc(str);
            zzfol.zzf(false);
            zze2.zzb(zzfol.zzl());
            this.zze.zzd(false);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfoy zze2 = this.zzf.zzp;
            zzfol zzfol = this.zzd;
            zzfol.zzf(true);
            zze2.zzb(zzfol.zzl());
            this.zze.zzd(true);
        }
    }
}
