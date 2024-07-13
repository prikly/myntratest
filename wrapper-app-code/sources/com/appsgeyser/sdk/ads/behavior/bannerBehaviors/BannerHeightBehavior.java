package com.appsgeyser.sdk.ads.behavior.bannerBehaviors;

import com.appsgeyser.sdk.ads.AdView;

public class BannerHeightBehavior extends AdViewBehavior {
    private final int height;

    public void visit(AdView adView) {
    }

    public BannerHeightBehavior(int i) {
        this.height = i;
    }
}
