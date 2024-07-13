package com.appodeal.ads.adapters.mraid.rewarded_video;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidRewarded;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class b extends UnifiedMraidRewarded<UnifiedMraidNetworkParams> {
    public final void requestMraid(Context context, UnifiedAdParams unifiedAdParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallback unifiedAdCallback, String str) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedAdCallback;
        S2SAdTask.requestMraid(context, str, unifiedMraidNetworkParams, unifiedRewardedCallback, new a(this, (UnifiedRewardedParams) unifiedAdParams, unifiedRewardedCallback));
    }
}
