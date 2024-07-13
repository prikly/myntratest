package io.bidmachine.ads.networks.vast;

import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastView;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.utils.BMError;

class VastRichMediaAdShowListener implements VastView.VastViewListener {
    private final UnifiedBannerAdCallback callback;

    public void onComplete(VastView vastView, VastRequest vastRequest) {
    }

    public void onFinish(VastView vastView, VastRequest vastRequest, boolean z) {
    }

    public void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i) {
    }

    VastRichMediaAdShowListener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
        this.callback = unifiedBannerAdCallback;
    }

    public void onShown(VastView vastView, VastRequest vastRequest) {
        this.callback.onAdShown();
    }

    public void onClick(VastView vastView, VastRequest vastRequest, final IabClickCallback iabClickCallback, String str) {
        this.callback.onAdClicked();
        if (str != null) {
            Utils.openBrowser(vastView.getContext(), str, new Runnable() {
                public void run() {
                    iabClickCallback.clickHandled();
                }
            });
        } else {
            iabClickCallback.clickHandleCanceled();
        }
    }

    public void onError(VastView vastView, VastRequest vastRequest, int i) {
        if (i == 3) {
            this.callback.onAdShowFailed(BMError.PlaceholderTimeout);
        } else {
            this.callback.onAdShowFailed(BMError.internal("Error when showing interstitial object"));
        }
    }
}
