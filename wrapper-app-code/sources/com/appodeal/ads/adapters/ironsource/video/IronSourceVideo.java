package com.appodeal.ads.adapters.ironsource.video;

import android.app.Activity;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.ironsource.mediationsdk.IronSource;

public class IronSourceVideo extends UnifiedVideo<IronSourceNetwork.RequestParams> {
    private String instanceId;
    boolean isLoadFailed = false;
    boolean isLoaded = false;

    public void onDestroy() {
    }

    public void show(Activity activity, UnifiedVideoCallback unifiedVideoCallback) {
        if (IronSource.isISDemandOnlyInterstitialReady(this.instanceId)) {
            IronSource.showISDemandOnlyInterstitial(this.instanceId);
        } else {
            unifiedVideoCallback.onAdShowFailed();
        }
    }

    public void onLoaded() {
        super.onLoaded();
        this.isLoaded = true;
    }
}
