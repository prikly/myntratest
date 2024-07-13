package com.appsgeyser.sdk.ads;

import android.app.Activity;
import android.content.Context;

public class SimpleFullScreenBannerListener implements IFullScreenBannerListener {
    public void onLoadStarted() {
    }

    public void onLoadFinished(FullScreenBanner fullScreenBanner) {
        fullScreenBanner.show();
    }

    public void onAdFailedToLoad(Context context, String str) {
        if (str.equals("on_exit") && (context instanceof Activity)) {
            ((Activity) context).finish();
        }
    }

    public void onAdHided(Context context, String str) {
        if (str.equals("on_exit") && (context instanceof Activity)) {
            ((Activity) context).finish();
        }
    }
}
