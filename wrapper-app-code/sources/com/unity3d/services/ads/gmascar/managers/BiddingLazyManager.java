package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

public class BiddingLazyManager extends BiddingBaseManager {
    public void start() {
    }

    public BiddingLazyManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(iUnityAdsTokenListener);
    }

    public void onUnityTokenSuccessfullyFetched() {
        permitSignalsUpload();
        fetchSignals();
    }
}
