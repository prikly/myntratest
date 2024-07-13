package com.appodeal.ads.adapters.admob.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobFullscreenDisplayListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

public abstract class UnifiedAdmobInterstitial<InterstitialType extends InterstitialAd, AdRequestType extends AdRequest> extends UnifiedInterstitial<UnifiedAdmobRequestParams<AdRequestType>> {
    public UnifiedAdContainer<InterstitialType> unifiedAdContainer;

    public void onDestroy() {
        UnifiedAdContainer<InterstitialType> unifiedAdContainer2 = this.unifiedAdContainer;
        if (unifiedAdContainer2 != null) {
            unifiedAdContainer2.destroy();
            this.unifiedAdContainer = null;
        }
    }

    public void show(Activity activity, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        UnifiedAdContainer<InterstitialType> unifiedAdContainer2 = this.unifiedAdContainer;
        InterstitialAd interstitialAd = unifiedAdContainer2 != null ? (InterstitialAd) unifiedAdContainer2.getAd() : null;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new UnifiedAdmobFullscreenDisplayListener(unifiedInterstitialCallback));
            interstitialAd.show(activity);
            return;
        }
        unifiedInterstitialCallback.onAdShowFailed();
    }
}
