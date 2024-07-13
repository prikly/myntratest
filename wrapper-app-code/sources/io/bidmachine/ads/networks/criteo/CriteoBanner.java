package io.bidmachine.ads.networks.criteo;

import com.criteo.publisher.Bid;
import com.criteo.publisher.CriteoBannerAdListener;
import com.criteo.publisher.CriteoBannerView;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.model.BannerAdUnit;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.AdapterLogger;
import io.bidmachine.core.Utils;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class CriteoBanner extends UnifiedBannerAd {
    private CriteoBannerView criteoBannerView;

    CriteoBanner() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        BannerAdUnit bannerAdUnit = (BannerAdUnit) CriteoAdUnitStorage.getAdUnit(unifiedMediationParams.getString("ad_unit_id"));
        if (bannerAdUnit == null) {
            unifiedBannerAdCallback.onAdLoadFailed(BMError.notFound("AdUnit"));
            return;
        }
        Bid takeBid = CriteoBidTokenStorage.takeBid(networkAdUnit);
        if (takeBid == null) {
            unifiedBannerAdCallback.onAdLoadFailed(BMError.notFound("Bid"));
        } else {
            Utils.onUiThread(new Runnable(contextProvider, bannerAdUnit, unifiedBannerAdCallback, takeBid) {
                public final /* synthetic */ ContextProvider f$1;
                public final /* synthetic */ BannerAdUnit f$2;
                public final /* synthetic */ UnifiedBannerAdCallback f$3;
                public final /* synthetic */ Bid f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    CriteoBanner.this.lambda$load$0$CriteoBanner(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }
    }

    public /* synthetic */ void lambda$load$0$CriteoBanner(ContextProvider contextProvider, BannerAdUnit bannerAdUnit, UnifiedBannerAdCallback unifiedBannerAdCallback, Bid bid) {
        try {
            CriteoBannerView criteoBannerView2 = new CriteoBannerView(contextProvider.getContext(), bannerAdUnit);
            this.criteoBannerView = criteoBannerView2;
            criteoBannerView2.setCriteoBannerAdListener(new Listener(unifiedBannerAdCallback));
            this.criteoBannerView.loadAd(bid);
        } catch (Throwable th) {
            AdapterLogger.logThrowable(th);
            unifiedBannerAdCallback.onAdLoadFailed(BMError.internal("Exception when loading banner object"));
        }
    }

    public void onDestroy() {
        CriteoBannerView criteoBannerView2 = this.criteoBannerView;
        if (criteoBannerView2 != null) {
            criteoBannerView2.setCriteoBannerAdListener((CriteoBannerAdListener) null);
            this.criteoBannerView = null;
        }
    }

    private static final class Listener implements CriteoBannerAdListener {
        private final UnifiedBannerAdCallback callback;

        public void onAdLeftApplication() {
        }

        Listener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
            this.callback = unifiedBannerAdCallback;
        }

        public void onAdReceived(CriteoBannerView criteoBannerView) {
            this.callback.onAdLoaded(criteoBannerView);
        }

        public void onAdFailedToReceive(CriteoErrorCode criteoErrorCode) {
            this.callback.onAdLoadFailed(CriteoAdapter.mapError(criteoErrorCode));
        }

        public void onAdClicked() {
            this.callback.onAdClicked();
        }
    }
}
