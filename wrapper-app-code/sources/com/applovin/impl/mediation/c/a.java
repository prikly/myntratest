package com.applovin.impl.mediation.c;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

public class a implements a.C0141a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0141a f14607a;

    public a(a.C0141a aVar) {
        this.f14607a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        k.d(this.f14607a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        k.h(this.f14607a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        k.a((MaxAdListener) this.f14607a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        k.b((MaxAdListener) this.f14607a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        k.g(this.f14607a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        k.c(this.f14607a, maxAd);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        k.a((MaxAdListener) this.f14607a, str, maxError);
    }

    public void onAdLoaded(MaxAd maxAd) {
        k.a((MaxAdListener) this.f14607a, maxAd);
    }

    public void onAdRequestStarted(String str) {
        k.a((MaxAdRequestListener) this.f14607a, str);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        k.a((MaxAdRevenueListener) this.f14607a, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        k.f(this.f14607a, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        k.e(this.f14607a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        k.a((MaxAdListener) this.f14607a, maxAd, maxReward);
    }
}
