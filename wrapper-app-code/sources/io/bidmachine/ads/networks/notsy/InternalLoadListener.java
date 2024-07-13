package io.bidmachine.ads.networks.notsy;

import io.bidmachine.utils.BMError;

interface InternalLoadListener {
    void onAdLoadFailed(InternalNotsyAd internalNotsyAd, BMError bMError);

    void onAdLoaded(InternalNotsyAd internalNotsyAd);
}
