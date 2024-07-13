package io.bidmachine;

import io.bidmachine.IAd;

public interface AdRewardedListener<AdType extends IAd> {
    void onAdRewarded(AdType adtype);
}
