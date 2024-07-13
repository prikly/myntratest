package io.bidmachine.ads.networks.notsy;

import io.bidmachine.utils.BMError;

interface InternalNotsyAdPresentListener {
    void onAdClicked();

    void onAdShowFailed(BMError bMError);

    void onAdShown();
}
