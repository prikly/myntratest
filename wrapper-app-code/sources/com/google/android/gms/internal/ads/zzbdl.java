package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbdl extends zzbds {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbdl(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    public final void zzb(int i) {
    }

    public final void zzc(zze zze) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzd(zzbdq zzbdq) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbdm(zzbdq, this.zzb));
        }
    }
}
