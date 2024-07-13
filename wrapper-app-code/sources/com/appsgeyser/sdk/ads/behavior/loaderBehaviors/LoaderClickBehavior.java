package com.appsgeyser.sdk.ads.behavior.loaderBehaviors;

import com.appsgeyser.sdk.ads.AdsLoader;
import com.appsgeyser.sdk.ads.behavior.BehaviorFactory;

public class LoaderClickBehavior extends LoaderBehavior {
    private final BehaviorFactory.ClickBehavior clickBehavior;

    public LoaderClickBehavior(BehaviorFactory.ClickBehavior clickBehavior2) {
        this.clickBehavior = clickBehavior2;
    }

    public void visit(AdsLoader adsLoader) {
        adsLoader.changeClickBehavior(this.clickBehavior);
    }
}
