package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzab extends InterstitialAdLoadCallback {
    zzab(zzac zzac) {
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int code = loadAdError.getCode();
        zze.zza("Failed to load ad with error code: " + code);
    }

    public final /* synthetic */ void onAdLoaded(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        zze.zza("Ad is loaded.");
    }
}
