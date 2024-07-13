package com.appodeal.ads.adapters.applovin.rewarded_video;

import android.app.Activity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

public final class a extends UnifiedRewarded<ApplovinNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public C0164a f16212a;

    /* renamed from: b  reason: collision with root package name */
    public AppLovinIncentivizedInterstitial f16213b;

    /* renamed from: com.appodeal.ads.adapters.applovin.rewarded_video.a$a  reason: collision with other inner class name */
    public static class C0164a extends b<UnifiedRewardedCallback> implements AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        public C0164a(UnifiedRewardedCallback unifiedRewardedCallback) {
            super(unifiedRewardedCallback);
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f16202a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f16202a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f16202a).onAdLoaded();
        }

        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
        }

        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            if (z) {
                ((UnifiedRewardedCallback) this.f16202a).onAdFinished();
            }
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        this.f16212a = new C0164a((UnifiedRewardedCallback) unifiedAdCallback);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(requestParams.zoneId, requestParams.sdk);
        this.f16213b = create;
        create.preload(this.f16212a);
    }

    public final void onDestroy() {
        this.f16213b = null;
        this.f16212a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.f16213b;
        if (appLovinIncentivizedInterstitial == null || !appLovinIncentivizedInterstitial.isAdReadyToDisplay()) {
            unifiedRewardedCallback.onAdShowFailed();
            return;
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial2 = this.f16213b;
        C0164a aVar = this.f16212a;
        appLovinIncentivizedInterstitial2.show(activity, (AppLovinAdRewardListener) null, aVar, aVar, aVar);
    }
}
