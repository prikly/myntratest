package io.bidmachine.ads.networks.meta_audience;

import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

class MetaAudienceBanner extends UnifiedBannerAd {
    private AdView adView;
    private Listener listener;

    MetaAudienceBanner() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        AdSize adSize;
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(unifiedMediationParams);
        if (metaAudienceParams.isValid(unifiedBannerAdCallback)) {
            int i = AnonymousClass1.$SwitchMap$io$bidmachine$banner$BannerSize[unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize().ordinal()];
            if (i == 1) {
                adSize = AdSize.BANNER_HEIGHT_90;
            } else if (i != 2) {
                adSize = AdSize.BANNER_HEIGHT_50;
            } else {
                adSize = AdSize.RECTANGLE_HEIGHT_250;
            }
            this.listener = new Listener(unifiedBannerAdCallback);
            AdView adView2 = new AdView(contextProvider.getContext(), metaAudienceParams.placementId, adSize);
            this.adView = adView2;
            adView2.loadAd(adView2.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).build());
        }
    }

    /* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceBanner$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.bidmachine.banner.BannerSize[] r0 = io.bidmachine.banner.BannerSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$banner$BannerSize = r0
                io.bidmachine.banner.BannerSize r1 = io.bidmachine.banner.BannerSize.Size_728x90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$banner$BannerSize     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.banner.BannerSize r1 = io.bidmachine.banner.BannerSize.Size_300x250     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.meta_audience.MetaAudienceBanner.AnonymousClass1.<clinit>():void");
        }
    }

    public void onDestroy() {
        this.listener = null;
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.destroy();
            this.adView = null;
        }
    }

    private static final class Listener extends BaseMetaAudienceListener<UnifiedBannerAdCallback> {
        public void onLoggingImpression(Ad ad) {
        }

        Listener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
            super(unifiedBannerAdCallback);
        }

        public void onAdLoaded(Ad ad) {
            ((UnifiedBannerAdCallback) getCallback()).onAdLoaded((View) ad);
        }
    }
}
