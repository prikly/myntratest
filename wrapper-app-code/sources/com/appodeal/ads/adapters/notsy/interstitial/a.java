package com.appodeal.ads.adapters.notsy.interstitial;

import com.appodeal.ads.adapters.admob.interstitial.UnifiedAdmobInterstitial;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

public final class a extends UnifiedAdmobInterstitial<AdManagerInterstitialAd, AdManagerAdRequest> {

    /* renamed from: com.appodeal.ads.adapters.notsy.interstitial.a$a  reason: collision with other inner class name */
    public static final class C0179a extends AdManagerInterstitialAdLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedInterstitialCallback f16291a;

        /* renamed from: b  reason: collision with root package name */
        public final UnifiedAdContainer<AdManagerInterstitialAd> f16292b;

        public C0179a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer<AdManagerInterstitialAd> unifiedAdContainer) {
            this.f16291a = unifiedInterstitialCallback;
            this.f16292b = unifiedAdContainer;
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f16291a.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f16291a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded(Object obj) {
            AdManagerInterstitialAd adManagerInterstitialAd = (AdManagerInterstitialAd) obj;
            super.onAdLoaded(adManagerInterstitialAd);
            this.f16292b.setAd(adManagerInterstitialAd);
            this.f16291a.onAdLoaded();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        UnifiedAdmobRequestParams unifiedAdmobRequestParams = (UnifiedAdmobRequestParams) obj;
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        AdManagerInterstitialAd.load(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key, (AdManagerAdRequest) unifiedAdmobRequestParams.request, new C0179a((UnifiedInterstitialCallback) unifiedAdCallback, this.unifiedAdContainer));
    }
}
