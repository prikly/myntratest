package com.appodeal.ads.unified;

public abstract class UnifiedBanner<NetworkRequestParams> extends UnifiedViewAd<UnifiedBannerParams, UnifiedBannerCallback, NetworkRequestParams> {
    private boolean isRefreshOnRotate = false;

    public boolean isRefreshOnRotate() {
        return this.isRefreshOnRotate;
    }

    public void setRefreshOnRotate(boolean z) {
        this.isRefreshOnRotate = z;
    }
}
