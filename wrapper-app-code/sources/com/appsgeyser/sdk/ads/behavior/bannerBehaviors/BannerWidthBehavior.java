package com.appsgeyser.sdk.ads.behavior.bannerBehaviors;

import com.appsgeyser.sdk.ads.AdView;

public class BannerWidthBehavior extends AdViewBehavior {
    private final int width;

    public void visit(AdView adView) {
    }

    public BannerWidthBehavior(int i) {
        this.width = i;
    }
}
