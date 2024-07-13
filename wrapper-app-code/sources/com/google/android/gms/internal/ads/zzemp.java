package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzemp implements zzgen {
    final /* synthetic */ zzemq zza;

    zzemp(zzemq zzemq) {
        this.zza = zzemq;
    }

    public final void zza(Throwable th) {
        zze zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zza2);
        zzfka.zzb(zza2.zza, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcyl) obj).zzab();
    }
}
