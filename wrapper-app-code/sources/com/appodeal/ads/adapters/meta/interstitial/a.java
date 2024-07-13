package com.appodeal.ads.adapters.meta.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public final class a extends UnifiedInterstitial<MetaNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public InterstitialAd f16260a;

    /* renamed from: com.appodeal.ads.adapters.meta.interstitial.a$a  reason: collision with other inner class name */
    public static final class C0175a implements InterstitialAdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedInterstitialCallback f16261a;

        public C0175a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
            this.f16261a = unifiedInterstitialCallback;
        }

        public final void onAdClicked(Ad ad) {
            this.f16261a.onAdClicked();
        }

        public final void onAdLoaded(Ad ad) {
            this.f16261a.onAdLoaded();
        }

        public final void onError(Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f16261a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f16261a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onInterstitialDismissed(Ad ad) {
            if (ad != null) {
                ad.destroy();
            }
            this.f16261a.onAdClosed();
        }

        public final void onInterstitialDisplayed(Ad ad) {
        }

        public final void onLoggingImpression(Ad ad) {
            this.f16261a.onAdShown();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        InterstitialAd interstitialAd = new InterstitialAd(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey);
        this.f16260a = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C0175a((UnifiedInterstitialCallback) unifiedAdCallback)).build());
    }

    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f16260a;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f16260a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f16260a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f16260a.isAdInvalidated()) {
            unifiedInterstitialCallback.onAdShowFailed();
        } else {
            this.f16260a.show();
        }
    }
}
