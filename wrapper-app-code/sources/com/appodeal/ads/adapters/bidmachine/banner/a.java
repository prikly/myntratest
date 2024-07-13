package com.appodeal.ads.adapters.bidmachine.banner;

import android.content.Context;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.banner.BannerView;
import io.bidmachine.utils.BMError;

/* compiled from: BidMachineBanner */
public final class a extends UnifiedBanner<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public BannerView f16228a;

    /* renamed from: b  reason: collision with root package name */
    public BannerRequest f16229b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.banner.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineBanner */
    public static class C0167a implements BannerListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedBannerCallback f16230a;

        /* renamed from: b  reason: collision with root package name */
        public final BannerSize f16231b;

        public C0167a(UnifiedBannerCallback unifiedBannerCallback, BannerSize bannerSize) {
            this.f16230a = unifiedBannerCallback;
            this.f16231b = bannerSize;
        }

        public final void onAdClicked(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16230a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16230a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            BannerView bannerView = (BannerView) iAd;
            BidMachineNetwork.printError(this.f16230a, bMError);
            this.f16230a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f16230a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(bannerView.getAuctionResult()));
            UnifiedBannerCallback unifiedBannerCallback = this.f16230a;
            BannerSize bannerSize = this.f16231b;
            unifiedBannerCallback.onAdLoaded(bannerView, bannerSize.width, bannerSize.height);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        BannerSize bannerSize;
        BidMachineNetwork.RequestParams requestParams = (BidMachineNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext)) {
            bannerSize = BannerSize.Size_728x90;
        } else {
            bannerSize = BannerSize.Size_320x50;
        }
        this.f16229b = (BannerRequest) ((BannerRequest.Builder) requestParams.prepareRequest(new BannerRequest.Builder())).setSize(bannerSize).build();
        BannerView bannerView = new BannerView(applicationContext);
        this.f16228a = bannerView;
        bannerView.setListener(new C0167a(unifiedBannerCallback, bannerSize));
        this.f16228a.load(this.f16229b);
    }

    public final void onDestroy() {
        BannerRequest bannerRequest = this.f16229b;
        if (bannerRequest != null) {
            bannerRequest.destroy();
            this.f16229b = null;
        }
        BannerView bannerView = this.f16228a;
        if (bannerView != null) {
            bannerView.destroy();
            this.f16228a = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        BannerRequest bannerRequest = this.f16229b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        BannerRequest bannerRequest = this.f16229b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationWin();
        }
    }
}
