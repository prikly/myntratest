package com.appodeal.ads.unified.mraid;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.utils.IabClickCallback;

abstract class UnifiedMraidViewListener<UnifiedCallbackType extends UnifiedViewAdCallback> extends UnifiedMraidListener<UnifiedCallbackType> implements MraidViewListener {
    public UnifiedMraidViewListener(UnifiedCallbackType unifiedcallbacktype, UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        super(unifiedcallbacktype, unifiedMraidNetworkParams);
    }

    public void onClose(MraidView mraidView) {
    }

    public void onError(MraidView mraidView, int i) {
        ((UnifiedViewAdCallback) this.callback).onAdLoadFailed(LoadingError.NoFill);
    }

    public void onExpand(MraidView mraidView) {
    }

    public void onOpenBrowser(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
        handleBrowserOpen(mraidView.getContext(), str, iabClickCallback);
    }

    public void onPlayVideo(MraidView mraidView, String str) {
    }

    public void onShown(MraidView mraidView) {
    }
}
