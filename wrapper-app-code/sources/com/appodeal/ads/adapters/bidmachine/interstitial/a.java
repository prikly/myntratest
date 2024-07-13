package com.appodeal.ads.adapters.bidmachine.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import io.bidmachine.AdContentType;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.interstitial.InterstitialRequest;
import io.bidmachine.utils.BMError;

/* compiled from: BidMachineInterstitial */
public final class a extends UnifiedInterstitial<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public InterstitialRequest f16233a;

    /* renamed from: b  reason: collision with root package name */
    public InterstitialAd f16234b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.interstitial.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineInterstitial */
    public static class C0168a implements InterstitialListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedInterstitialCallback f16235a;

        public C0168a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
            this.f16235a = unifiedInterstitialCallback;
        }

        public final void onAdClicked(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16235a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            if (z) {
                this.f16235a.onAdFinished();
            }
            this.f16235a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16235a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16235a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f16235a, bMError);
            this.f16235a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f16235a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((InterstitialAd) iAd).getAuctionResult()));
            this.f16235a.onAdLoaded();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f16235a, bMError);
            this.f16235a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        this.f16233a = (InterstitialRequest) ((InterstitialRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new InterstitialRequest.Builder())).setAdContentType(AdContentType.Static).build();
        this.f16234b = (InterstitialAd) ((InterstitialAd) new InterstitialAd(contextProvider.getApplicationContext()).setListener(new C0168a((UnifiedInterstitialCallback) unifiedAdCallback))).load(this.f16233a);
    }

    public final void onDestroy() {
        InterstitialRequest interstitialRequest = this.f16233a;
        if (interstitialRequest != null) {
            interstitialRequest.destroy();
            this.f16233a = null;
        }
        InterstitialAd interstitialAd = this.f16234b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f16234b = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        InterstitialRequest interstitialRequest = this.f16233a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        InterstitialRequest interstitialRequest = this.f16233a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f16234b;
        if (interstitialAd == null || !interstitialAd.canShow()) {
            unifiedInterstitialCallback.onAdShowFailed();
        } else {
            this.f16234b.show();
        }
    }
}
