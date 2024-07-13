package com.appsgeyser.sdk.ads.behavior.loaderBehaviors;

import com.appsgeyser.sdk.ads.AdsLoader;

public class LoaderHideTimeoutBehavior extends LoaderBehavior {
    private final float timeOut;

    public LoaderHideTimeoutBehavior(float f2) {
        this.timeOut = f2;
    }

    public void visit(AdsLoader adsLoader) {
        adsLoader.setHideTimeout(this.timeOut);
    }
}
