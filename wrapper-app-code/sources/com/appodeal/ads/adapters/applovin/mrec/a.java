package com.appodeal.ads.adapters.applovin.mrec;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;

public final class a extends UnifiedMrec<ApplovinNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AppLovinAdView f16210a;

    /* renamed from: com.appodeal.ads.adapters.applovin.mrec.a$a  reason: collision with other inner class name */
    public static final class C0163a extends b<UnifiedMrecCallback> {

        /* renamed from: b  reason: collision with root package name */
        public final AppLovinAdView f16211b;

        public C0163a(UnifiedMrecCallback unifiedMrecCallback, AppLovinAdView appLovinAdView) {
            super(unifiedMrecCallback);
            this.f16211b = appLovinAdView;
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedMrecCallback) this.f16202a).onAdLoaded(this.f16211b);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        Context applicationContext = contextProvider.getApplicationContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * ((float) AppLovinAdSize.MREC.getWidth())), Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * ((float) AppLovinAdSize.MREC.getHeight())), 1);
        AppLovinAdView appLovinAdView = new AppLovinAdView(requestParams.sdk, AppLovinAdSize.MREC, requestParams.zoneId, applicationContext);
        this.f16210a = appLovinAdView;
        C0163a aVar = new C0163a((UnifiedMrecCallback) unifiedAdCallback, appLovinAdView);
        appLovinAdView.setLayoutParams(layoutParams);
        this.f16210a.setAdLoadListener(aVar);
        this.f16210a.setAdClickListener(aVar);
        this.f16210a.loadNextAd();
    }

    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f16210a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f16210a = null;
        }
    }
}
