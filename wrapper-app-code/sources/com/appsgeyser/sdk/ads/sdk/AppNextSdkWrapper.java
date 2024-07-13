package com.appsgeyser.sdk.ads.sdk;

import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.FullScreenBanner;

public class AppNextSdkWrapper extends SdkWrapper {
    public void showFsBanner() {
        InternalEntryPoint.getInstance().getFullScreenBanner(this.context).setBannerType(FullScreenBanner.BannerTypes.SDK);
    }
}
