package io.bidmachine;

import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

public interface AdListener<AdType extends IAd> {
    void onAdClicked(AdType adtype);

    void onAdExpired(AdType adtype);

    void onAdImpression(AdType adtype);

    void onAdLoadFailed(AdType adtype, BMError bMError);

    void onAdLoaded(AdType adtype);
}
