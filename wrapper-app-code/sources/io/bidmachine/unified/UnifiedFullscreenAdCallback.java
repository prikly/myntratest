package io.bidmachine.unified;

public interface UnifiedFullscreenAdCallback extends UnifiedAdCallback {
    void onAdClosed();

    void onAdFinished();

    void onAdLoaded();
}
