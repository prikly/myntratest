package io.bidmachine;

import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

public interface AdFullScreenListener<AdType extends IAd> {
    void onAdClosed(AdType adtype, boolean z);

    void onAdShowFailed(AdType adtype, BMError bMError);
}
