package com.appodeal.ads.adapters.ironsource.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.ironsource.mediationsdk.IronSource;

public class IronSourceInterstitial extends UnifiedInterstitial<IronSourceNetwork.RequestParams> {
    private String instanceId;
    boolean isLoadFailed = false;
    boolean isLoaded = false;

    public void onDestroy() {
    }

    public void show(Activity activity, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        if (IronSource.isISDemandOnlyInterstitialReady(this.instanceId)) {
            IronSource.showISDemandOnlyInterstitial(this.instanceId);
        } else {
            unifiedInterstitialCallback.onAdShowFailed();
        }
    }

    public void onLoaded() {
        super.onLoaded();
        this.isLoaded = true;
    }
}
