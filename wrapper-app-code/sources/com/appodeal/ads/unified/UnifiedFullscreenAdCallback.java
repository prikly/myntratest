package com.appodeal.ads.unified;

public abstract class UnifiedFullscreenAdCallback extends UnifiedAdCallback {
    public abstract void onAdClosed();

    public abstract void onAdFinished();

    public abstract void onAdLoaded();

    public abstract void onAdShown();
}
