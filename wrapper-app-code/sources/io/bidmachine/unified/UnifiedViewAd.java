package io.bidmachine.unified;

import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;

public abstract class UnifiedViewAd<UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends UnifiedAd<UnifiedAdCallbackType, UnifiedAdRequestParamsType> {
    public void prepareToShow() throws Throwable {
    }
}