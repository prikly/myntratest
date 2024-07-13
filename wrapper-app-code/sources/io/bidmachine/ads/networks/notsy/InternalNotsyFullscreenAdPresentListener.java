package io.bidmachine.ads.networks.notsy;

interface InternalNotsyFullscreenAdPresentListener extends InternalNotsyAdPresentListener {
    void onAdClosed();

    void onAdComplete();
}
