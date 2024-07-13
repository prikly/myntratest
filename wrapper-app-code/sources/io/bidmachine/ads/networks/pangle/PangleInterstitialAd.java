package io.bidmachine.ads.networks.pangle;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class PangleInterstitialAd extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private LoadListener loadListener;
    private TTAdNative ttAdNative;
    private TTFullScreenVideoAd ttFullScreenVideoAd;

    PangleInterstitialAd() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        PangleParams pangleParams = new PangleParams(unifiedMediationParams);
        if (pangleParams.isValid(unifiedFullscreenAdCallback)) {
            AdSlot build = new AdSlot.Builder().setCodeId(pangleParams.slotId).withBid(pangleParams.bidPayload).build();
            this.loadListener = new LoadListener(this, unifiedFullscreenAdCallback);
            TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(contextProvider.getApplicationContext());
            this.ttAdNative = createAdNative;
            createAdNative.loadFullScreenVideoAd(build, this.loadListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void setTtFullScreenVideoAd(TTFullScreenVideoAd tTFullScreenVideoAd) {
        this.ttFullScreenVideoAd = tTFullScreenVideoAd;
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        TTFullScreenVideoAd tTFullScreenVideoAd = this.ttFullScreenVideoAd;
        if (tTFullScreenVideoAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null"));
            return;
        }
        tTFullScreenVideoAd.setFullScreenVideoAdInteractionListener(new ShowListener(unifiedFullscreenAdCallback));
        this.ttFullScreenVideoAd.showFullScreenVideoAd(activity);
    }

    public void onDestroy() {
        this.ttAdNative = null;
        LoadListener loadListener2 = this.loadListener;
        if (loadListener2 != null) {
            loadListener2.destroy();
            this.loadListener = null;
        }
        TTFullScreenVideoAd tTFullScreenVideoAd = this.ttFullScreenVideoAd;
        if (tTFullScreenVideoAd != null) {
            tTFullScreenVideoAd.setFullScreenVideoAdInteractionListener((TTFullScreenVideoAd.FullScreenVideoAdInteractionListener) null);
            this.ttFullScreenVideoAd = null;
        }
    }

    private static final class LoadListener implements TTAdNative.FullScreenVideoAdListener {
        private final UnifiedFullscreenAdCallback callback;
        private boolean isDestroyed;
        private final PangleInterstitialAd pangleInterstitialAd;

        public void onFullScreenVideoCached() {
        }

        public LoadListener(PangleInterstitialAd pangleInterstitialAd2, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            this.pangleInterstitialAd = pangleInterstitialAd2;
            this.callback = unifiedFullscreenAdCallback;
        }

        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            if (!this.isDestroyed) {
                this.pangleInterstitialAd.setTtFullScreenVideoAd(tTFullScreenVideoAd);
                this.callback.onAdLoaded();
            }
        }

        public void onError(int i, String str) {
            if (!this.isDestroyed) {
                this.callback.onAdLoadFailed(BMError.noFill());
            }
        }

        public void destroy() {
            this.isDestroyed = true;
        }
    }

    private static final class ShowListener implements TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        private final UnifiedFullscreenAdCallback callback;

        public void onSkippedVideo() {
        }

        public ShowListener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            this.callback = unifiedFullscreenAdCallback;
        }

        public void onAdShow() {
            this.callback.onAdShown();
        }

        public void onAdVideoBarClick() {
            this.callback.onAdClicked();
        }

        public void onAdClose() {
            this.callback.onAdClosed();
        }

        public void onVideoComplete() {
            this.callback.onAdFinished();
        }
    }
}
