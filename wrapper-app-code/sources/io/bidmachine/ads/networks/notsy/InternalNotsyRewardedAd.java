package io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.ads.networks.notsy.InternalNotsyAd;
import io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd;
import io.bidmachine.utils.BMError;

class InternalNotsyRewardedAd extends InternalNotsyFullscreenAd {
    /* access modifiers changed from: private */
    public RewardedAd rewardedAd;

    InternalNotsyRewardedAd(InternalNotsyAdUnit internalNotsyAdUnit) {
        super(internalNotsyAdUnit);
    }

    /* access modifiers changed from: protected */
    public void loadAd(Context context, InternalLoadListener internalLoadListener) throws Throwable {
        RewardedAd.load(context, getAdUnitId(), createAdManagerAdRequest(), (RewardedAdLoadCallback) new LoadListener(this, internalLoadListener));
    }

    /* access modifiers changed from: protected */
    public void showAd(Activity activity, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) throws Throwable {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setFullScreenContentCallback(new InternalNotsyFullscreenAd.InternalFullscreenShowListener(this, internalNotsyFullscreenAdPresentListener));
            this.rewardedAd.show(activity, new RewardListener());
            return;
        }
        internalNotsyFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Rewarded object is null or not loaded"));
    }

    /* access modifiers changed from: protected */
    public void destroyAd() throws Throwable {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setFullScreenContentCallback((FullScreenContentCallback) null);
            this.rewardedAd = null;
        }
    }

    private static final class LoadListener extends RewardedAdLoadCallback {
        private final InternalLoadListener loadListener;
        private final InternalNotsyRewardedAd notsyRewardedAd;

        public LoadListener(InternalNotsyRewardedAd internalNotsyRewardedAd, InternalLoadListener internalLoadListener) {
            this.notsyRewardedAd = internalNotsyRewardedAd;
            this.loadListener = internalLoadListener;
        }

        public void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd unused = this.notsyRewardedAd.rewardedAd = rewardedAd;
            this.notsyRewardedAd.setStatus(InternalNotsyAd.Status.Loaded);
            this.loadListener.onAdLoaded(this.notsyRewardedAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.loadListener.onAdLoadFailed(this.notsyRewardedAd, BMError.noFill());
        }
    }

    private static final class RewardListener implements OnUserEarnedRewardListener {
        public void onUserEarnedReward(RewardItem rewardItem) {
        }

        private RewardListener() {
        }
    }
}
