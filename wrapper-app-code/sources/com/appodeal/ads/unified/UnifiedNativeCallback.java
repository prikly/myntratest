package com.appodeal.ads.unified;

public abstract class UnifiedNativeCallback extends UnifiedAdCallback {
    public abstract void onAdClicked(int i, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener);

    public void onAdClicked(UnifiedNativeAd unifiedNativeAd, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        onAdClicked(unifiedNativeAd.getAdId(), unifiedAdCallbackClickTrackListener);
    }

    public abstract void onAdFinished(int i);

    public void onAdFinished(UnifiedNativeAd unifiedNativeAd) {
        onAdFinished(unifiedNativeAd.getAdId());
    }

    public abstract void onAdLoaded(UnifiedNativeAd unifiedNativeAd);

    public abstract void onAdShown(int i);

    public void onAdShown(UnifiedNativeAd unifiedNativeAd) {
        onAdShown(unifiedNativeAd.getAdId());
    }
}
