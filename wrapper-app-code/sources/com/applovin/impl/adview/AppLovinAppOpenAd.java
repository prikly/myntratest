package com.applovin.impl.adview;

import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinInterstitialAdDialog f13991a;

    public AppLovinAppOpenAd(AppLovinSdk appLovinSdk) {
        this.f13991a = AppLovinInterstitialAd.create(appLovinSdk, appLovinSdk.coreSdk.P());
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f13991a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f13991a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f13991a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(AppLovinAd appLovinAd) {
        this.f13991a.showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
