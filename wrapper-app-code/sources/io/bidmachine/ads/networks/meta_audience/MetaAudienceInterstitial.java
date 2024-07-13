package io.bidmachine.ads.networks.meta_audience;

import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class MetaAudienceInterstitial extends UnifiedFullscreenAd {
    private InterstitialAd interstitialAd;
    private Listener listener;

    MetaAudienceInterstitial() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(unifiedMediationParams);
        if (metaAudienceParams.isValid(unifiedFullscreenAdCallback)) {
            this.listener = new Listener(unifiedFullscreenAdCallback);
            InterstitialAd interstitialAd2 = new InterstitialAd(contextProvider.getContext(), metaAudienceParams.placementId);
            this.interstitialAd = interstitialAd2;
            interstitialAd2.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).build());
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 == null || !interstitialAd2.isAdLoaded() || this.interstitialAd.isAdInvalidated()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded or invalidated"));
        } else {
            this.interstitialAd.show();
        }
    }

    public void onDestroy() {
        this.listener = null;
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
            this.interstitialAd = null;
        }
    }

    private static final class Listener extends BaseMetaAudienceListener<UnifiedFullscreenAdCallback> implements InterstitialAdListener {
        public void onInterstitialDisplayed(Ad ad) {
        }

        Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            super(unifiedFullscreenAdCallback);
        }

        public void onAdLoaded(Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdLoaded();
        }

        public void onLoggingImpression(Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdShown();
        }

        public void onInterstitialDismissed(Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdClosed();
            ad.destroy();
        }
    }
}
