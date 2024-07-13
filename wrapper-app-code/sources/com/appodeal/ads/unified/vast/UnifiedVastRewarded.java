package com.appodeal.ads.unified.vast;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.vast.UnifiedVastUtils;
import com.explorestack.iab.vast.VideoType;

public abstract class UnifiedVastRewarded<NetworkRequestParams> extends UnifiedRewarded<NetworkRequestParams> implements UnifiedVastUtils.UnifiedFullscreenVast<UnifiedRewardedParams, UnifiedRewardedCallback> {
    public UnifiedVastUtils.UnifiedVastFullscreenAd<UnifiedRewardedParams, UnifiedRewardedCallback, NetworkRequestParams> unifiedVast = new UnifiedVastUtils.UnifiedVastFullscreenAd<>(this);

    public UnifiedVastFullscreenListener<UnifiedRewardedCallback> createListener(Context context, UnifiedRewardedParams unifiedRewardedParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        return new UnifiedVastRewardedListener(unifiedRewardedCallback, unifiedVastNetworkParams);
    }

    public VideoType getVideoType() {
        return VideoType.Rewarded;
    }

    public void load(ContextProvider contextProvider, UnifiedRewardedParams unifiedRewardedParams, NetworkRequestParams networkrequestparams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedVast.load(contextProvider, unifiedRewardedParams, networkrequestparams, unifiedRewardedCallback);
    }

    public void loadVast(Context context, UnifiedRewardedParams unifiedRewardedParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedVast.loadVast(context, unifiedRewardedParams, unifiedVastNetworkParams, unifiedRewardedCallback);
    }

    public void onDestroy() {
        this.unifiedVast.onDestroy();
    }

    public void onPrepareToShow(Activity activity, UnifiedRewardedParams unifiedRewardedParams) {
        super.onPrepareToShow(activity, unifiedRewardedParams);
        this.unifiedVast.onPrepareToShow(activity, unifiedRewardedParams);
    }

    public void show(Activity activity, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedVast.show(activity, unifiedRewardedCallback);
    }
}
