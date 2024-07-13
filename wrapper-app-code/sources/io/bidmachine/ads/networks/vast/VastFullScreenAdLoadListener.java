package io.bidmachine.ads.networks.vast;

import android.content.Context;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.processor.VastAd;
import io.bidmachine.measurer.VastOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;

class VastFullScreenAdLoadListener implements VastRequestListener {
    private final UnifiedFullscreenAdCallback callback;
    private final VastOMSDKAdMeasurer vastOMSDKAdMeasurer;

    VastFullScreenAdLoadListener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, VastOMSDKAdMeasurer vastOMSDKAdMeasurer2) {
        this.callback = unifiedFullscreenAdCallback;
        this.vastOMSDKAdMeasurer = vastOMSDKAdMeasurer2;
    }

    public void onVastLoaded(VastRequest vastRequest) {
        if (this.vastOMSDKAdMeasurer != null) {
            VastAd vastAd = vastRequest.getVastAd();
            this.vastOMSDKAdMeasurer.addVerificationScriptResourceList(vastAd != null ? vastAd.getAdVerificationsExtensionList() : null);
            this.vastOMSDKAdMeasurer.setSkipOffset(vastRequest.getVideoCloseTime());
        }
        this.callback.onAdLoaded();
    }

    public void onVastError(Context context, VastRequest vastRequest, int i) {
        if (i == 4) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(BMError.noFill());
        }
    }
}
