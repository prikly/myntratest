package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzced extends zzcdq {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcee zzb;

    public zzced(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcee zzcee) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcee;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzg() {
        zzcee zzcee;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzcee = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzcee);
        }
    }
}
