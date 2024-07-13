package com.appodeal.ads;

import com.appodeal.ads.r;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;

public abstract class j1<AdRequestType extends r, UnifiedAdType extends UnifiedFullscreenAd, UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback> extends l<AdRequestType, UnifiedAdType, UnifiedAdParamsType, UnifiedAdCallbackType> {
    public j1(r rVar, AdNetwork adNetwork, d0 d0Var) {
        super(rVar, adNetwork, d0Var, 10000);
    }
}
