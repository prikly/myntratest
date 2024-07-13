package com.appsgeyser.sdk.ads.behavior.bannerBehaviors;

import com.appsgeyser.sdk.ads.AdView;
import com.appsgeyser.sdk.ads.behavior.BehaviorAcceptor;
import com.appsgeyser.sdk.ads.behavior.BehaviorVisitor;

public abstract class AdViewBehavior implements BehaviorVisitor {
    /* access modifiers changed from: package-private */
    public abstract void visit(AdView adView);

    public void visit(BehaviorAcceptor behaviorAcceptor) {
        if (behaviorAcceptor instanceof AdView) {
            visit((AdView) behaviorAcceptor);
        }
    }
}
