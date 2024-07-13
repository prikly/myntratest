package io.bidmachine.ads.networks.criteo;

import com.criteo.publisher.Bid;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.CriteoInterstitialAdListener;
import com.criteo.publisher.model.InterstitialAdUnit;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class CriteoInterstitial extends UnifiedFullscreenAd {
    private com.criteo.publisher.CriteoInterstitial criteoInterstitial;

    CriteoInterstitial() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        InterstitialAdUnit interstitialAdUnit = (InterstitialAdUnit) CriteoAdUnitStorage.getAdUnit(unifiedMediationParams.getString("ad_unit_id"));
        if (interstitialAdUnit == null) {
            unifiedFullscreenAdCallback.onAdLoadFailed(BMError.notFound("AdUnit"));
            return;
        }
        Bid takeBid = CriteoBidTokenStorage.takeBid(networkAdUnit);
        if (takeBid == null) {
            unifiedFullscreenAdCallback.onAdLoadFailed(BMError.notFound("Bid"));
            return;
        }
        com.criteo.publisher.CriteoInterstitial criteoInterstitial2 = new com.criteo.publisher.CriteoInterstitial(interstitialAdUnit);
        this.criteoInterstitial = criteoInterstitial2;
        criteoInterstitial2.setCriteoInterstitialAdListener(new Listener(unifiedFullscreenAdCallback));
        this.criteoInterstitial.loadAd(takeBid);
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        com.criteo.publisher.CriteoInterstitial criteoInterstitial2 = this.criteoInterstitial;
        if (criteoInterstitial2 == null || !criteoInterstitial2.isAdLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded"));
        } else {
            this.criteoInterstitial.show();
        }
    }

    public void onDestroy() {
        com.criteo.publisher.CriteoInterstitial criteoInterstitial2 = this.criteoInterstitial;
        if (criteoInterstitial2 != null) {
            criteoInterstitial2.setCriteoInterstitialAdListener((CriteoInterstitialAdListener) null);
            this.criteoInterstitial = null;
        }
    }

    private static final class Listener implements CriteoInterstitialAdListener {
        private final UnifiedFullscreenAdCallback callback;

        public void onAdLeftApplication() {
        }

        Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            this.callback = unifiedFullscreenAdCallback;
        }

        public void onAdReceived(com.criteo.publisher.CriteoInterstitial criteoInterstitial) {
            this.callback.onAdLoaded();
        }

        public void onAdFailedToReceive(CriteoErrorCode criteoErrorCode) {
            this.callback.onAdLoadFailed(CriteoAdapter.mapError(criteoErrorCode));
        }

        public void onAdClicked() {
            this.callback.onAdClicked();
        }

        public void onAdOpened() {
            this.callback.onAdShown();
        }

        public void onAdClosed() {
            this.callback.onAdClosed();
        }
    }
}
