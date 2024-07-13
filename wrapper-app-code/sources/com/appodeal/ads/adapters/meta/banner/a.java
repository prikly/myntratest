package com.appodeal.ads.adapters.meta.banner;

import android.content.Context;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public final class a extends UnifiedBanner<MetaNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AdSize f16256a;

    /* renamed from: b  reason: collision with root package name */
    public AdView f16257b;

    /* renamed from: com.appodeal.ads.adapters.meta.banner.a$a  reason: collision with other inner class name */
    public final class C0174a implements AdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedBannerCallback f16258a;

        public C0174a(UnifiedBannerCallback unifiedBannerCallback) {
            this.f16258a = unifiedBannerCallback;
        }

        public final void onAdClicked(Ad ad) {
            this.f16258a.onAdClicked();
        }

        public final void onAdLoaded(Ad ad) {
            this.f16258a.onAdLoaded(a.this.f16257b, -1, a.this.f16256a.getHeight());
        }

        public final void onError(Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f16258a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f16258a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(Ad ad) {
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        MetaNetwork.RequestParams requestParams = (MetaNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        this.f16256a = ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext) ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
        AdView adView = new AdView(applicationContext, requestParams.metaKey, this.f16256a);
        this.f16257b = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new C0174a(unifiedBannerCallback)).build());
    }

    public final void onDestroy() {
        AdView adView = this.f16257b;
        if (adView != null) {
            adView.destroy();
            this.f16257b = null;
        }
        this.f16256a = null;
    }
}
