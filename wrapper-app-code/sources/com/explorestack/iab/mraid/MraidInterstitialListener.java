package com.explorestack.iab.mraid;

import com.explorestack.iab.utils.IabClickCallback;

public interface MraidInterstitialListener {
    void onClose(MraidInterstitial mraidInterstitial);

    void onError(MraidInterstitial mraidInterstitial, int i);

    void onLoaded(MraidInterstitial mraidInterstitial);

    void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback);

    void onPlayVideo(MraidInterstitial mraidInterstitial, String str);

    void onShown(MraidInterstitial mraidInterstitial);
}
