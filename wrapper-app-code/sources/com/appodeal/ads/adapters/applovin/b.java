package com.appodeal.ads.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;

public abstract class b<UnifiedAdCallbackType extends UnifiedAdCallback> implements AppLovinAdClickListener, AppLovinAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public UnifiedAdCallbackType f16202a;

    public b(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.f16202a = unifiedadcallbacktype;
    }

    public final void adClicked(AppLovinAd appLovinAd) {
        this.f16202a.onAdClicked();
    }

    public final void failedToReceiveAd(int i) {
        String str;
        LoadingError loadingError = LoadingError.NoFill;
        if (i == 204) {
            str = "no ad is available";
        } else if (i >= 500) {
            str = "internal server error";
        } else {
            loadingError = LoadingError.InternalError;
            str = "internal errors";
        }
        this.f16202a.printError(str, Integer.valueOf(i));
        this.f16202a.onAdLoadFailed(loadingError);
    }
}
