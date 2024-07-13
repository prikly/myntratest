package io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class NotsyInterstitial extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Listener listener;
    /* access modifiers changed from: private */
    public InternalNotsyInterstitialAd notsyInterstitialAd;

    NotsyInterstitial() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new NotsyParams(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            Listener listener2 = new Listener(unifiedFullscreenAdCallback, this);
            this.listener = listener2;
            NotsyNetwork.loadInterstitial(networkAdUnit, listener2);
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Listener listener2;
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalNotsyInterstitialAd internalNotsyInterstitialAd = this.notsyInterstitialAd;
        if (internalNotsyInterstitialAd == null || (listener2 = this.listener) == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded"));
        } else {
            internalNotsyInterstitialAd.show(activity, listener2);
        }
    }

    public void onDestroy() {
        this.listener = null;
        InternalNotsyInterstitialAd internalNotsyInterstitialAd = this.notsyInterstitialAd;
        if (internalNotsyInterstitialAd != null) {
            internalNotsyInterstitialAd.destroy();
            this.notsyInterstitialAd = null;
        }
    }

    private static final class Listener extends NotsyFullscreenAdListener<InternalNotsyInterstitialAd> implements InternalNotsyInterstitialAdListener {
        private final NotsyInterstitial notsyInterstitial;

        private Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, NotsyInterstitial notsyInterstitial2) {
            super(unifiedFullscreenAdCallback);
            this.notsyInterstitial = notsyInterstitial2;
        }

        public void onAdLoaded(InternalNotsyInterstitialAd internalNotsyInterstitialAd) {
            InternalNotsyInterstitialAd unused = this.notsyInterstitial.notsyInterstitialAd = internalNotsyInterstitialAd;
            super.onAdLoaded(internalNotsyInterstitialAd);
        }
    }
}
