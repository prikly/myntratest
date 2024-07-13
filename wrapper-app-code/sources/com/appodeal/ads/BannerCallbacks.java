package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/BannerCallbacks;", "", "onBannerClicked", "", "onBannerExpired", "onBannerFailedToLoad", "onBannerLoaded", "height", "", "isPrecache", "", "onBannerShowFailed", "onBannerShown", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface BannerCallbacks {
    void onBannerClicked();

    void onBannerExpired();

    void onBannerFailedToLoad();

    void onBannerLoaded(int i, boolean z);

    void onBannerShowFailed();

    void onBannerShown();
}
