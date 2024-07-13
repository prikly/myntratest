package com.appodeal.ads.adapters.admob.mrec;

import android.content.Context;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;

public abstract class UnifiedAdmobMrec<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends UnifiedMrec<UnifiedAdmobRequestParams<AdRequestType>> {
    private AdViewType adView;

    public static final class a<AdViewType extends BaseAdView> extends AdListener {

        /* renamed from: a  reason: collision with root package name */
        public final AdViewType f16192a;

        /* renamed from: b  reason: collision with root package name */
        public final UnifiedMrecCallback f16193b;

        public a(AdViewType adviewtype, UnifiedMrecCallback unifiedMrecCallback) {
            this.f16193b = unifiedMrecCallback;
            this.f16192a = adviewtype;
        }

        public final void onAdClicked() {
            super.onAdClicked();
            this.f16193b.onAdClicked();
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f16193b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f16193b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded() {
            super.onAdLoaded();
            this.f16193b.onAdLoaded(this.f16192a);
        }
    }

    public abstract AdViewType createAdView(Context context);

    public void load(ContextProvider contextProvider, UnifiedMrecParams unifiedMrecParams, UnifiedAdmobRequestParams<AdRequestType> unifiedAdmobRequestParams, UnifiedMrecCallback unifiedMrecCallback) {
        AdViewType createAdView = createAdView(contextProvider.getApplicationContext());
        this.adView = createAdView;
        createAdView.setAdUnitId(unifiedAdmobRequestParams.key);
        this.adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        AdViewType adviewtype = this.adView;
        adviewtype.setAdListener(new a(adviewtype, unifiedMrecCallback));
        this.adView.loadAd(unifiedAdmobRequestParams.request);
    }

    public void onDestroy() {
        AdViewType adviewtype = this.adView;
        if (adviewtype != null) {
            adviewtype.setAdListener((AdListener) null);
            this.adView.destroy();
            this.adView = null;
        }
    }
}
