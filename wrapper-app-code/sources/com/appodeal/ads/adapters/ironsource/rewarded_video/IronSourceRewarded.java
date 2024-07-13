package com.appodeal.ads.adapters.ironsource.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.ironsource.mediationsdk.IronSource;

public class IronSourceRewarded extends UnifiedRewarded<IronSourceNetwork.RequestParams> {
    private String instanceId;

    public void onDestroy() {
    }

    public void show(Activity activity, UnifiedRewardedCallback unifiedRewardedCallback) {
        if (IronSource.isISDemandOnlyRewardedVideoAvailable(this.instanceId)) {
            IronSource.showISDemandOnlyRewardedVideo(this.instanceId);
        } else {
            unifiedRewardedCallback.onAdShowFailed();
        }
    }
}
