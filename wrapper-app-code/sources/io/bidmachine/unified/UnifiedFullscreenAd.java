package io.bidmachine.unified;

import io.bidmachine.ContextProvider;

public abstract class UnifiedFullscreenAd extends UnifiedAd<UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    public void onClosed(boolean z) {
    }

    public void onFinished() {
    }

    public abstract void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable;
}
