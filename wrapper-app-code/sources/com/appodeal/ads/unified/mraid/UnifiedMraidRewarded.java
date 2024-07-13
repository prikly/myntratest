package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidUtils;
import com.explorestack.iab.mraid.MraidType;

public abstract class UnifiedMraidRewarded<NetworkRequestParams> extends UnifiedRewarded<NetworkRequestParams> implements UnifiedMraidUtils.UnifiedFullscreenMraid<UnifiedRewardedParams, UnifiedRewardedCallback> {
    private final UnifiedMraidUtils.UnifiedMraidFullscreenAd<UnifiedRewardedParams, UnifiedRewardedCallback, NetworkRequestParams> unifiedAd = new UnifiedMraidUtils.UnifiedMraidFullscreenAd<>(this);

    public UnifiedMraidFullscreenListener<UnifiedRewardedCallback> createListener(Context context, UnifiedRewardedParams unifiedRewardedParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        return new UnifiedMraidRewardedListener(context, unifiedRewardedCallback, unifiedMraidNetworkParams);
    }

    public MraidType getMraidType() {
        return MraidType.Rewarded;
    }

    public void load(ContextProvider contextProvider, UnifiedRewardedParams unifiedRewardedParams, NetworkRequestParams networkrequestparams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedAd.load(contextProvider, unifiedRewardedParams, networkrequestparams, unifiedRewardedCallback);
    }

    public void loadMraid(Context context, UnifiedRewardedParams unifiedRewardedParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedAd.loadMraid(context, unifiedRewardedParams, unifiedMraidNetworkParams, unifiedRewardedCallback);
    }

    public void onClicked() {
        super.onClicked();
        this.unifiedAd.onClicked();
    }

    public void onDestroy() {
        this.unifiedAd.onDestroy();
    }

    public void onFinished() {
        super.onFinished();
        this.unifiedAd.onFinished();
    }

    public void onPrepareToShow(Activity activity, UnifiedRewardedParams unifiedRewardedParams) {
        super.onPrepareToShow(activity, unifiedRewardedParams);
        this.unifiedAd.onPrepareToShow(activity, unifiedRewardedParams);
    }

    public void show(Activity activity, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedAd.show(activity, unifiedRewardedCallback);
    }
}
