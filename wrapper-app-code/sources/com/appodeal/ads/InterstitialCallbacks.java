package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/InterstitialCallbacks;", "", "onInterstitialClicked", "", "onInterstitialClosed", "onInterstitialExpired", "onInterstitialFailedToLoad", "onInterstitialLoaded", "isPrecache", "", "onInterstitialShowFailed", "onInterstitialShown", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface InterstitialCallbacks {
    void onInterstitialClicked();

    void onInterstitialClosed();

    void onInterstitialExpired();

    void onInterstitialFailedToLoad();

    void onInterstitialLoaded(boolean z);

    void onInterstitialShowFailed();

    void onInterstitialShown();
}
