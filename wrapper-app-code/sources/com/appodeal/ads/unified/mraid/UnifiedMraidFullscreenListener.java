package com.appodeal.ads.unified.mraid;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.utils.IabClickCallback;

class UnifiedMraidFullscreenListener<UnifiedCallbackType extends UnifiedFullscreenAdCallback> extends UnifiedMraidListener<UnifiedCallbackType> implements MraidInterstitialListener {
    private final Context context;

    public UnifiedMraidFullscreenListener(Context context2, UnifiedCallbackType unifiedcallbacktype, UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        super(unifiedcallbacktype, unifiedMraidNetworkParams);
        this.context = context2;
    }

    public void onClose(MraidInterstitial mraidInterstitial) {
        ((UnifiedFullscreenAdCallback) this.callback).onAdClosed();
    }

    public void onError(MraidInterstitial mraidInterstitial, int i) {
        ((UnifiedFullscreenAdCallback) this.callback).onAdLoadFailed(LoadingError.NoFill);
    }

    public void onLoaded(MraidInterstitial mraidInterstitial) {
        ((UnifiedFullscreenAdCallback) this.callback).onAdLoaded();
    }

    public void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        handleBrowserOpen(this.context, str, iabClickCallback);
    }

    public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
    }

    public void onShown(MraidInterstitial mraidInterstitial) {
        ((UnifiedFullscreenAdCallback) this.callback).onAdShown();
    }
}
