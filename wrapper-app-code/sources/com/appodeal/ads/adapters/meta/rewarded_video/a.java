package com.appodeal.ads.adapters.meta.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

public final class a extends UnifiedRewarded<MetaNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoAd f16272a;

    /* renamed from: com.appodeal.ads.adapters.meta.rewarded_video.a$a  reason: collision with other inner class name */
    public static final class C0178a implements RewardedVideoAdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedRewardedCallback f16273a;

        public C0178a(UnifiedRewardedCallback unifiedRewardedCallback) {
            this.f16273a = unifiedRewardedCallback;
        }

        public /* synthetic */ C0178a(UnifiedRewardedCallback unifiedRewardedCallback, int i) {
            this(unifiedRewardedCallback);
        }

        public final void onAdClicked(Ad ad) {
            this.f16273a.onAdClicked();
        }

        public final void onAdLoaded(Ad ad) {
            this.f16273a.onAdLoaded();
        }

        public final void onError(Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f16273a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f16273a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(Ad ad) {
            this.f16273a.onAdShown();
        }

        public final void onRewardedVideoClosed() {
            this.f16273a.onAdClosed();
        }

        public final void onRewardedVideoCompleted() {
            this.f16273a.onAdFinished();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey);
        this.f16272a = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(new C0178a((UnifiedRewardedCallback) unifiedAdCallback, 0)).build());
    }

    public final void onDestroy() {
        RewardedVideoAd rewardedVideoAd = this.f16272a;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.f16272a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedVideoAd rewardedVideoAd = this.f16272a;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f16272a.isAdInvalidated()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f16272a.show();
        }
    }
}
