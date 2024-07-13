package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;

class MraidFullScreenAdListener implements MraidInterstitialListener {
    private final Context applicationContext;
    private final UnifiedFullscreenAdCallback callback;
    private final MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;

    public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
    }

    MraidFullScreenAdListener(Context context, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2) {
        this.applicationContext = context;
        this.callback = unifiedFullscreenAdCallback;
        this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer2;
    }

    public void onLoaded(MraidInterstitial mraidInterstitial) {
        this.callback.onAdLoaded();
    }

    public void onError(MraidInterstitial mraidInterstitial, int i) {
        if (i == 1) {
            this.callback.onAdShowFailed(BMError.internal("Error when showing interstitial object"));
        } else if (i == 2) {
            this.callback.onAdShowFailed(BMError.PlaceholderTimeout);
        } else if (i == 3) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(BMError.noFill());
        }
    }

    public void onShown(MraidInterstitial mraidInterstitial) {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.onAdShown();
        }
        this.callback.onAdShown();
    }

    public void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, final IabClickCallback iabClickCallback) {
        this.callback.onAdClicked();
        Utils.openBrowser(this.applicationContext, str, new Runnable() {
            public void run() {
                iabClickCallback.clickHandled();
            }
        });
    }

    public void onClose(MraidInterstitial mraidInterstitial) {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.destroy();
        }
        this.callback.onAdFinished();
        this.callback.onAdClosed();
    }
}
