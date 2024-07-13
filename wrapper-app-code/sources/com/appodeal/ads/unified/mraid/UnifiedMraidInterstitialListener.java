package com.appodeal.ads.unified.mraid;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.utils.IabClickCallback;

public class UnifiedMraidInterstitialListener extends UnifiedMraidFullscreenListener<UnifiedInterstitialCallback> {
    public UnifiedMraidInterstitialListener(Context context, UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        super(context, unifiedInterstitialCallback, unifiedMraidNetworkParams);
    }

    public /* bridge */ /* synthetic */ void onClose(MraidInterstitial mraidInterstitial) {
        super.onClose(mraidInterstitial);
    }

    public /* bridge */ /* synthetic */ void onError(MraidInterstitial mraidInterstitial, int i) {
        super.onError(mraidInterstitial, i);
    }

    public /* bridge */ /* synthetic */ void onLoaded(MraidInterstitial mraidInterstitial) {
        super.onLoaded(mraidInterstitial);
    }

    public /* bridge */ /* synthetic */ void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        super.onOpenBrowser(mraidInterstitial, str, iabClickCallback);
    }

    public /* bridge */ /* synthetic */ void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        super.onPlayVideo(mraidInterstitial, str);
    }

    public /* bridge */ /* synthetic */ void onShown(MraidInterstitial mraidInterstitial) {
        super.onShown(mraidInterstitial);
    }
}
