package com.appodeal.ads.adapters.admob.interstitial;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AdmobInterstitial extends UnifiedAdmobInterstitial<InterstitialAd, AdRequest> {

    public static final class a extends InterstitialAdLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedInterstitialCallback f16190a;

        /* renamed from: b  reason: collision with root package name */
        public final UnifiedAdContainer<InterstitialAd> f16191b;

        public a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer<InterstitialAd> unifiedAdContainer) {
            this.f16190a = unifiedInterstitialCallback;
            this.f16191b = unifiedAdContainer;
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f16190a.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f16190a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded(Object obj) {
            InterstitialAd interstitialAd = (InterstitialAd) obj;
            super.onAdLoaded(interstitialAd);
            this.f16191b.setAd(interstitialAd);
            this.f16190a.onAdLoaded();
        }
    }

    public void load(ContextProvider contextProvider, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedAdmobRequestParams<AdRequest> unifiedAdmobRequestParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        InterstitialAd.load(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key, unifiedAdmobRequestParams.request, new a(unifiedInterstitialCallback, this.unifiedAdContainer));
    }
}
