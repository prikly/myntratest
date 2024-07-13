package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzebh implements zzgen {
    final /* synthetic */ zzebj zza;

    zzebh(zzebj zzebj) {
        this.zza = zzebj;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zze(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new zzebg(this, str));
        }
    }
}
