package io.bidmachine.ads.networks.mraid;

import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.utils.BMError;

class MraidBannerAdListener implements MraidViewListener {
    private final UnifiedBannerAdCallback callback;

    public void onClose(MraidView mraidView) {
    }

    public void onExpand(MraidView mraidView) {
    }

    public void onPlayVideo(MraidView mraidView, String str) {
    }

    MraidBannerAdListener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
        this.callback = unifiedBannerAdCallback;
    }

    public void onLoaded(MraidView mraidView) {
        this.callback.onAdLoaded(mraidView);
    }

    public void onError(MraidView mraidView, int i) {
        if (i == 1) {
            this.callback.onAdShowFailed(BMError.internal("Error when showing banner object"));
        } else if (i == 2) {
            this.callback.onAdShowFailed(BMError.PlaceholderTimeout);
        } else if (i == 3) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(BMError.noFill());
        }
    }

    public void onShown(MraidView mraidView) {
        this.callback.onAdShown();
    }

    public void onOpenBrowser(MraidView mraidView, String str, final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        Utils.openBrowser(mraidView.getContext(), str, new Runnable() {
            public void run() {
                iabClickCallback.clickHandled();
            }
        });
    }
}
