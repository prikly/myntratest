package com.appsgeyser.sdk.ads.behavior.loaderBehaviors;

import com.appsgeyser.sdk.ads.AdsLoader;
import com.appsgeyser.sdk.ads.behavior.BehaviorAcceptor;
import com.appsgeyser.sdk.ads.behavior.BehaviorVisitor;

public abstract class LoaderBehavior implements BehaviorVisitor {
    /* access modifiers changed from: package-private */
    public abstract void visit(AdsLoader adsLoader);

    public void visit(BehaviorAcceptor behaviorAcceptor) {
        if (behaviorAcceptor instanceof AdsLoader) {
            visit((AdsLoader) behaviorAcceptor);
        }
    }
}
