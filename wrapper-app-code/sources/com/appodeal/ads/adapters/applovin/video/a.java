package com.appodeal.ads.adapters.applovin.video;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;

public final class a extends UnifiedVideo<ApplovinNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public C0165a f16214a;

    /* renamed from: b  reason: collision with root package name */
    public AppLovinSdk f16215b;

    /* renamed from: c  reason: collision with root package name */
    public AppLovinAd f16216c;

    /* renamed from: com.appodeal.ads.adapters.applovin.video.a$a  reason: collision with other inner class name */
    public static final class C0165a extends b<UnifiedVideoCallback> implements AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b  reason: collision with root package name */
        public final a f16217b;

        public C0165a(UnifiedVideoCallback unifiedVideoCallback, a aVar) {
            super(unifiedVideoCallback);
            this.f16217b = aVar;
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedVideoCallback) this.f16202a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedVideoCallback) this.f16202a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            com.appodeal.ads.adapters.applovin.a.a(appLovinAd);
            this.f16217b.f16216c = appLovinAd;
            ((UnifiedVideoCallback) this.f16202a).onAdLoaded();
        }

        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
        }

        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            if (z) {
                ((UnifiedVideoCallback) this.f16202a).onAdFinished();
            }
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedAdCallback;
        this.f16215b = requestParams.sdk;
        this.f16214a = new C0165a(unifiedVideoCallback, this);
        AppLovinAd a2 = com.appodeal.ads.adapters.applovin.a.a(requestParams.zoneId);
        this.f16216c = a2;
        if (a2 != null) {
            unifiedVideoCallback.onAdLoaded();
            return;
        }
        AppLovinAdService adService = this.f16215b.getAdService();
        if (TextUtils.isEmpty(requestParams.zoneId)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, this.f16214a);
        } else {
            adService.loadNextAdForZoneId(requestParams.zoneId, this.f16214a);
        }
    }

    public final void onDestroy() {
        this.f16216c = null;
        this.f16215b = null;
        this.f16214a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        if (this.f16216c != null) {
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f16215b, activity);
            create.setAdDisplayListener(this.f16214a);
            create.setAdClickListener(this.f16214a);
            create.setAdVideoPlaybackListener(this.f16214a);
            create.showAndRender(this.f16216c);
            return;
        }
        unifiedVideoCallback.onAdShowFailed();
    }
}
