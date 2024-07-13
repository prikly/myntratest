package com.appodeal.ads.adapters.meta.mrec;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public final class a extends UnifiedMrec<MetaNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AdView f16262a;

    /* renamed from: com.appodeal.ads.adapters.meta.mrec.a$a  reason: collision with other inner class name */
    public final class C0176a implements AdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedMrecCallback f16263a;

        public C0176a(UnifiedMrecCallback unifiedMrecCallback) {
            this.f16263a = unifiedMrecCallback;
        }

        public final void onAdClicked(Ad ad) {
            this.f16263a.onAdClicked();
        }

        public final void onAdLoaded(Ad ad) {
            this.f16263a.onAdLoaded(a.this.f16262a);
        }

        public final void onError(Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f16263a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f16263a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(Ad ad) {
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        AdView adView = new AdView(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey, AdSize.RECTANGLE_HEIGHT_250);
        this.f16262a = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new C0176a((UnifiedMrecCallback) unifiedAdCallback)).build());
    }

    public final void onDestroy() {
        AdView adView = this.f16262a;
        if (adView != null) {
            adView.destroy();
            this.f16262a = null;
        }
    }
}
