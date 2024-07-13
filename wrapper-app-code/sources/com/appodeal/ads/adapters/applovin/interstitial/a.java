package com.appodeal.ads.adapters.applovin.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

public final class a extends UnifiedInterstitial<ApplovinNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public C0162a f16205a;

    /* renamed from: b  reason: collision with root package name */
    public AppLovinSdk f16206b;

    /* renamed from: c  reason: collision with root package name */
    public AppLovinAd f16207c;

    /* renamed from: com.appodeal.ads.adapters.applovin.interstitial.a$a  reason: collision with other inner class name */
    public static final class C0162a extends b<UnifiedInterstitialCallback> implements AppLovinAdDisplayListener {

        /* renamed from: b  reason: collision with root package name */
        public final a f16208b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16209c;

        public C0162a(UnifiedInterstitialCallback unifiedInterstitialCallback, a aVar, boolean z) {
            super(unifiedInterstitialCallback);
            this.f16208b = aVar;
            this.f16209c = z;
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedInterstitialCallback) this.f16202a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedInterstitialCallback) this.f16202a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            if (!this.f16209c || !appLovinAd.isVideoAd()) {
                com.appodeal.ads.adapters.applovin.a.a(appLovinAd);
                this.f16208b.f16207c = appLovinAd;
                ((UnifiedInterstitialCallback) this.f16202a).onAdLoaded();
                return;
            }
            ((UnifiedInterstitialCallback) this.f16202a).onAdLoadFailed(LoadingError.IncorrectCreative);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        boolean optBoolean = requestParams.jsonData.optBoolean("check_video");
        this.f16206b = requestParams.sdk;
        this.f16205a = new C0162a(unifiedInterstitialCallback, this, optBoolean);
        AppLovinAd a2 = com.appodeal.ads.adapters.applovin.a.a(requestParams.zoneId);
        this.f16207c = a2;
        if (a2 != null) {
            unifiedInterstitialCallback.onAdLoaded();
            return;
        }
        AppLovinAdService adService = this.f16206b.getAdService();
        if (TextUtils.isEmpty(requestParams.zoneId)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, this.f16205a);
        } else {
            adService.loadNextAdForZoneId(requestParams.zoneId, this.f16205a);
        }
    }

    public final void onDestroy() {
        this.f16207c = null;
        this.f16206b = null;
        this.f16205a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        if (this.f16207c != null) {
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f16206b, activity);
            create.setAdDisplayListener(this.f16205a);
            create.setAdClickListener(this.f16205a);
            create.showAndRender(this.f16207c);
            return;
        }
        unifiedInterstitialCallback.onAdShowFailed();
    }
}
