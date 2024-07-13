package com.appsgeyser.sdk.ads;

import com.appsgeyser.sdk.ads.AdsLoader;
import com.appsgeyser.sdk.ads.behavior.BehaviorFactory;
import com.appsgeyser.sdk.ads.behavior.BehaviorVisitor;
import java.util.List;
import java.util.Map;

class AdsHeaderReceiver implements AdsLoader.AdsLoadingFinishedListener, AdsLoader.HeadersReceiver {
    private final AdView adView;
    private final AdsLoader adsLoader;
    private Map<String, List<String>> lastResponseHeaders;

    AdsHeaderReceiver(AdView adView2, AdsLoader adsLoader2) {
        this.adsLoader = adsLoader2;
        this.adView = adView2;
    }

    public boolean onAdHeadersReceived(Map<String, List<String>> map) {
        this.lastResponseHeaders = map;
        return true;
    }

    public void onAdLoadFinished() {
        applyBehaviors(new BehaviorFactory().createPostloadBehaviors(this.lastResponseHeaders));
    }

    private void applyBehaviors(List<BehaviorVisitor> list) {
        for (BehaviorVisitor next : list) {
            this.adsLoader.acceptBehavior(next);
            this.adView.acceptBehavior(next);
        }
    }
}
