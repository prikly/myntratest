package com.appodeal.ads.adapters.bidmachine.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.rewarded.RewardedRequest;
import io.bidmachine.utils.BMError;

/* compiled from: BidMachineRewarded */
public final class a extends UnifiedRewarded<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public RewardedRequest f16245a;

    /* renamed from: b  reason: collision with root package name */
    public RewardedAd f16246b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.rewarded_video.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineRewarded */
    public static class C0171a implements RewardedListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedRewardedCallback f16247a;

        public C0171a(UnifiedRewardedCallback unifiedRewardedCallback) {
            this.f16247a = unifiedRewardedCallback;
        }

        public final void onAdClicked(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f16247a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f16247a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f16247a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f16247a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            BidMachineNetwork.printError(this.f16247a, bMError);
            this.f16247a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f16247a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((RewardedAd) iAd).getAuctionResult()));
            this.f16247a.onAdLoaded();
        }

        public final void onAdRewarded(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f16247a.onAdFinished();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            BidMachineNetwork.printError(this.f16247a, bMError);
            this.f16247a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        this.f16245a = (RewardedRequest) ((RewardedRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new RewardedRequest.Builder())).build();
        this.f16246b = (RewardedAd) ((RewardedAd) new RewardedAd(contextProvider.getApplicationContext()).setListener(new C0171a((UnifiedRewardedCallback) unifiedAdCallback))).load(this.f16245a);
    }

    public final void onDestroy() {
        RewardedRequest rewardedRequest = this.f16245a;
        if (rewardedRequest != null) {
            rewardedRequest.destroy();
            this.f16245a = null;
        }
        RewardedAd rewardedAd = this.f16246b;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.f16246b = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        RewardedRequest rewardedRequest = this.f16245a;
        if (rewardedRequest != null) {
            rewardedRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        RewardedRequest rewardedRequest = this.f16245a;
        if (rewardedRequest != null) {
            rewardedRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedAd rewardedAd = this.f16246b;
        if (rewardedAd == null || !rewardedAd.canShow()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f16246b.show();
        }
    }
}
