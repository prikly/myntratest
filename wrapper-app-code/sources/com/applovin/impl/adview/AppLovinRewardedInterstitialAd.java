package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinRewardedInterstitialAd {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f13992a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinAdDisplayListener f13993b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdClickListener f13994c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f13995d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f13992a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f13994c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f13993b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f13995d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f13992a.show(appLovinAd, context, appLovinAdRewardListener, this.f13995d, this.f13993b, this.f13994c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
