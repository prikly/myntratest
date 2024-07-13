package io.bidmachine.ads.networks.notsy;

import io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;

class NotsyFullscreenAdListener<NotsyAdType extends InternalNotsyFullscreenAd> implements InternalNotsyAdLoadListener<NotsyAdType>, InternalNotsyFullscreenAdPresentListener {
    protected final UnifiedFullscreenAdCallback callback;

    NotsyFullscreenAdListener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.callback = unifiedFullscreenAdCallback;
    }

    public void onAdLoaded(NotsyAdType notsyadtype) {
        this.callback.onAdLoaded();
    }

    public void onAdLoadFailed(BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    public void onAdShowFailed(BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    public void onAdShown() {
        this.callback.onAdShown();
    }

    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    public void onAdComplete() {
        this.callback.onAdFinished();
    }

    public void onAdClosed() {
        this.callback.onAdClosed();
    }
}
