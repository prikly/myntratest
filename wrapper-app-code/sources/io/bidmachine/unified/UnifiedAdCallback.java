package io.bidmachine.unified;

import io.bidmachine.utils.BMError;

public interface UnifiedAdCallback {
    void onAdClicked();

    void onAdExpired();

    void onAdLoadFailed(BMError bMError);

    void onAdShowFailed(BMError bMError);

    void onAdShown();
}
