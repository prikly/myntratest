package com.appodeal.ads.adapters.vast.rewarded_video;

import android.content.Context;
import com.appodeal.ads.adapters.vast.VASTNetwork;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;
import com.appodeal.ads.unified.vast.UnifiedVastRewarded;

public final class b extends UnifiedVastRewarded<VASTNetwork.RequestParams> {
    public final void performVastRequest(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, String str) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        S2SAdTask.requestVast(context, str, unifiedVastNetworkParams, unifiedRewardedCallback, new a(this, (UnifiedRewardedParams) unifiedFullscreenAdParams, unifiedRewardedCallback));
    }
}
