package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/NativeCallbacks;", "", "onNativeClicked", "", "nativeAd", "Lcom/appodeal/ads/NativeAd;", "onNativeExpired", "onNativeFailedToLoad", "onNativeLoaded", "onNativeShowFailed", "onNativeShown", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface NativeCallbacks {
    void onNativeClicked(NativeAd nativeAd);

    void onNativeExpired();

    void onNativeFailedToLoad();

    void onNativeLoaded();

    void onNativeShowFailed(NativeAd nativeAd);

    void onNativeShown(NativeAd nativeAd);
}
