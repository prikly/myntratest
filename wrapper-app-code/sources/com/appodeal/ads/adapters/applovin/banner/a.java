package com.appodeal.ads.adapters.applovin.banner;

import android.content.Context;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;

public final class a extends UnifiedBanner<ApplovinNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AppLovinAdView f16203a;

    /* renamed from: com.appodeal.ads.adapters.applovin.banner.a$a  reason: collision with other inner class name */
    public static final class C0161a extends b<UnifiedBannerCallback> {

        /* renamed from: b  reason: collision with root package name */
        public final AppLovinAdView f16204b;

        public C0161a(UnifiedBannerCallback unifiedBannerCallback, AppLovinAdView appLovinAdView) {
            super(unifiedBannerCallback);
            this.f16204b = appLovinAdView;
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedBannerCallback) this.f16202a).onAdLoaded(this.f16204b, appLovinAd.getSize().getWidth(), appLovinAd.getSize().getHeight());
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        AppLovinAdView appLovinAdView = new AppLovinAdView(requestParams.sdk, ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext) ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER, requestParams.zoneId, applicationContext);
        this.f16203a = appLovinAdView;
        C0161a aVar = new C0161a(unifiedBannerCallback, appLovinAdView);
        appLovinAdView.setAdLoadListener(aVar);
        this.f16203a.setAdClickListener(aVar);
        this.f16203a.loadNextAd();
    }

    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f16203a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f16203a = null;
        }
    }
}
