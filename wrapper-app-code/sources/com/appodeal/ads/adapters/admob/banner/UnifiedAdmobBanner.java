package com.appodeal.ads.adapters.admob.banner;

import android.content.Context;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;

public abstract class UnifiedAdmobBanner<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends UnifiedBanner<UnifiedAdmobRequestParams<AdRequestType>> {
    private AdViewType adView;

    public static final class a<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends AdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedAdmobBanner<AdViewType, AdRequestType> f16186a;

        /* renamed from: b  reason: collision with root package name */
        public final UnifiedBannerCallback f16187b;

        /* renamed from: c  reason: collision with root package name */
        public final AdViewType f16188c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16189d;

        public a(UnifiedAdmobBanner<AdViewType, AdRequestType> unifiedAdmobBanner, UnifiedBannerCallback unifiedBannerCallback, AdViewType adviewtype, int i) {
            this.f16186a = unifiedAdmobBanner;
            this.f16187b = unifiedBannerCallback;
            this.f16188c = adviewtype;
            this.f16189d = i;
        }

        public final void onAdClicked() {
            super.onAdClicked();
            this.f16187b.onAdClicked();
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f16187b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f16187b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded() {
            super.onAdLoaded();
            AdSize adSize = this.f16188c.getAdSize();
            if (!(adSize == AdSize.LEADERBOARD || adSize == AdSize.BANNER)) {
                this.f16186a.setRefreshOnRotate(true);
            }
            this.f16187b.onAdLoaded(this.f16188c, -1, this.f16189d);
        }
    }

    public abstract AdViewType createAdView(Context context);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0 > 720.0f) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load(com.appodeal.ads.modules.common.internal.context.ContextProvider r5, com.appodeal.ads.unified.UnifiedBannerParams r6, com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams<AdRequestType> r7, com.appodeal.ads.unified.UnifiedBannerCallback r8) {
        /*
            r4 = this;
            android.content.Context r5 = r5.getApplicationContext()
            com.google.android.gms.ads.BaseAdView r0 = r4.createAdView(r5)
            r4.adView = r0
            java.lang.String r1 = r7.key
            r0.setAdUnitId(r1)
            float r0 = com.appodeal.ads.unified.UnifiedAdUtils.getScreenHeightInDp(r5)
            boolean r1 = r7.useAdaptiveBanner
            r2 = 90
            r3 = 50
            if (r1 == 0) goto L_0x0033
            boolean r1 = r6.useSmartBanners(r5)
            if (r1 == 0) goto L_0x0033
            int r6 = r6.getMaxWidth(r5)
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(r5, r6)
            AdViewType r6 = r4.adView
            r6.setAdSize(r5)
            int r2 = r5.getHeight()
            goto L_0x006b
        L_0x0033:
            boolean r1 = r7.useSmartBanner
            if (r1 == 0) goto L_0x0054
            boolean r1 = r6.useSmartBanners(r5)
            if (r1 == 0) goto L_0x0054
            AdViewType r5 = r4.adView
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.SMART_BANNER
            r5.setAdSize(r6)
            r5 = 1137180672(0x43c80000, float:400.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x004d
            r2 = 32
            goto L_0x006b
        L_0x004d:
            r5 = 1144258560(0x44340000, float:720.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            goto L_0x006b
        L_0x0054:
            boolean r5 = r6.needLeaderBoard(r5)
            if (r5 == 0) goto L_0x0062
            AdViewType r5 = r4.adView
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.LEADERBOARD
            r5.setAdSize(r6)
            goto L_0x006b
        L_0x0062:
            AdViewType r5 = r4.adView
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.BANNER
            r5.setAdSize(r6)
        L_0x0069:
            r2 = 50
        L_0x006b:
            AdViewType r5 = r4.adView
            com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner$a r6 = new com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner$a
            r6.<init>(r4, r8, r5, r2)
            r5.setAdListener(r6)
            AdViewType r5 = r4.adView
            AdRequestType r6 = r7.request
            r5.loadAd(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner.load(com.appodeal.ads.modules.common.internal.context.ContextProvider, com.appodeal.ads.unified.UnifiedBannerParams, com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams, com.appodeal.ads.unified.UnifiedBannerCallback):void");
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
