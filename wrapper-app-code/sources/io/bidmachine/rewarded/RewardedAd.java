package io.bidmachine.rewarded;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;

public final class RewardedAd extends FullScreenAd<RewardedAd, RewardedRequest, FullScreenAdObject<RewardedRequest>, RewardedListener> {
    public RewardedAd(Context context) {
        super(context, AdsType.Rewarded);
    }

    /* access modifiers changed from: protected */
    public FullScreenAdObject<RewardedRequest> createAdObject(ContextProvider contextProvider, RewardedRequest rewardedRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd createRewarded = networkAdapter.createRewarded();
        if (createRewarded == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, rewardedRequest, adObjectParams, createRewarded);
    }
}
