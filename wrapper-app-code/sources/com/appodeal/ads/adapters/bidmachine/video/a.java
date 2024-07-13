package com.appodeal.ads.adapters.bidmachine.video;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import io.bidmachine.AdContentType;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.interstitial.InterstitialRequest;
import io.bidmachine.utils.BMError;

/* compiled from: BidMachineVideo */
public final class a extends UnifiedVideo<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public InterstitialRequest f16248a;

    /* renamed from: b  reason: collision with root package name */
    public InterstitialAd f16249b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.video.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineVideo */
    public static class C0172a implements InterstitialListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedVideoCallback f16250a;

        public C0172a(UnifiedVideoCallback unifiedVideoCallback) {
            this.f16250a = unifiedVideoCallback;
        }

        public final void onAdClicked(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16250a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            if (z) {
                this.f16250a.onAdFinished();
            }
            this.f16250a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16250a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f16250a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f16250a, bMError);
            this.f16250a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f16250a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((InterstitialAd) iAd).getAuctionResult()));
            this.f16250a.onAdLoaded();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f16250a, bMError);
            this.f16250a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        this.f16248a = (InterstitialRequest) ((InterstitialRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new InterstitialRequest.Builder())).setAdContentType(AdContentType.Video).build();
        this.f16249b = (InterstitialAd) ((InterstitialAd) new InterstitialAd(contextProvider.getApplicationContext()).setListener(new C0172a((UnifiedVideoCallback) unifiedAdCallback))).load(this.f16248a);
    }

    public final void onDestroy() {
        InterstitialRequest interstitialRequest = this.f16248a;
        if (interstitialRequest != null) {
            interstitialRequest.destroy();
            this.f16248a = null;
        }
        InterstitialAd interstitialAd = this.f16249b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f16249b = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        InterstitialRequest interstitialRequest = this.f16248a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        InterstitialRequest interstitialRequest = this.f16248a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f16249b;
        if (interstitialAd == null || !interstitialAd.canShow()) {
            unifiedVideoCallback.onAdShowFailed();
        } else {
            this.f16249b.show();
        }
    }
}
