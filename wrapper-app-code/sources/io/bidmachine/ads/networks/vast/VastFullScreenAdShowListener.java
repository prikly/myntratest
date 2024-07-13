package io.bidmachine.ads.networks.vast;

import android.content.Context;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastActivityListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastActivity;
import io.bidmachine.measurer.VastOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;

class VastFullScreenAdShowListener implements VastActivityListener {
    private final UnifiedFullscreenAdCallback callback;
    private final VastOMSDKAdMeasurer vastOMSDKAdMeasurer;

    VastFullScreenAdShowListener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, VastOMSDKAdMeasurer vastOMSDKAdMeasurer2) {
        this.callback = unifiedFullscreenAdCallback;
        this.vastOMSDKAdMeasurer = vastOMSDKAdMeasurer2;
    }

    public void onVastError(Context context, VastRequest vastRequest, int i) {
        if (i == 3) {
            this.callback.onAdShowFailed(BMError.PlaceholderTimeout);
        } else {
            this.callback.onAdShowFailed(BMError.internal("Error when showing interstitial object"));
        }
    }

    public void onVastShown(VastActivity vastActivity, VastRequest vastRequest) {
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer2 = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer2 != null) {
            vastOMSDKAdMeasurer2.onAdShown();
        }
        this.callback.onAdShown();
    }

    public void onVastClick(VastActivity vastActivity, VastRequest vastRequest, final IabClickCallback iabClickCallback, String str) {
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer2 = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer2 != null) {
            vastOMSDKAdMeasurer2.onAdClicked();
        }
        this.callback.onAdClicked();
        if (str != null) {
            Utils.openBrowser(vastActivity, str, new Runnable() {
                public void run() {
                    iabClickCallback.clickHandled();
                }
            });
        } else {
            iabClickCallback.clickHandleCanceled();
        }
    }

    public void onVastComplete(VastActivity vastActivity, VastRequest vastRequest) {
        this.callback.onAdFinished();
    }

    public void onVastDismiss(VastActivity vastActivity, VastRequest vastRequest, boolean z) {
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer2 = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer2 != null) {
            vastOMSDKAdMeasurer2.destroy();
        }
        this.callback.onAdClosed();
    }
}
