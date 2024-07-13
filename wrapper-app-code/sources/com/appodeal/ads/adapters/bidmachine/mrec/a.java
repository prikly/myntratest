package com.appodeal.ads.adapters.bidmachine.mrec;

import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.banner.BannerView;
import io.bidmachine.utils.BMError;

/* compiled from: BidMachineMrec */
public final class a extends UnifiedMrec<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public BannerView f16236a;

    /* renamed from: b  reason: collision with root package name */
    public BannerRequest f16237b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.mrec.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineMrec */
    public static class C0169a implements BannerListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedMrecCallback f16238a;

        public C0169a(UnifiedMrecCallback unifiedMrecCallback) {
            this.f16238a = unifiedMrecCallback;
        }

        public final void onAdClicked(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16238a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16238a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            BannerView bannerView = (BannerView) iAd;
            BidMachineNetwork.printError(this.f16238a, bMError);
            this.f16238a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16238a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(bannerView.getAuctionResult()));
            this.f16238a.onAdLoaded(bannerView);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        this.f16237b = (BannerRequest) ((BannerRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new BannerRequest.Builder())).setSize(BannerSize.Size_300x250).build();
        BannerView bannerView = new BannerView(contextProvider.getApplicationContext());
        this.f16236a = bannerView;
        bannerView.setListener(new C0169a((UnifiedMrecCallback) unifiedAdCallback));
        this.f16236a.load(this.f16237b);
    }

    public final void onDestroy() {
        BannerRequest bannerRequest = this.f16237b;
        if (bannerRequest != null) {
            bannerRequest.destroy();
            this.f16237b = null;
        }
        BannerView bannerView = this.f16236a;
        if (bannerView != null) {
            bannerView.destroy();
            this.f16236a = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        BannerRequest bannerRequest = this.f16237b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        BannerRequest bannerRequest = this.f16237b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationWin();
        }
    }
}
