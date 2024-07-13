package com.appsgeyser.sdk.ads;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appsgeyser.sdk.ads.sdk.JavascriptSdkController;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.utils.WebViewScreenShooter;

class FullscreenBannerJsInterface extends JavascriptSdkController {
    static String JS_INTERFACE_NAME = "AppsgeyserBanner";
    private FullScreenBanner fullScreenBanner = null;

    @JavascriptInterface
    public void dismissAdMobOnTimeout(String str) {
    }

    @JavascriptInterface
    public void dismissMoPubOnTimeout(String str) {
    }

    @JavascriptInterface
    public void setStatUrls(String str) {
    }

    FullscreenBannerJsInterface(FullScreenBanner fullScreenBanner2, Context context) {
        super(context);
        this.fullScreenBanner = fullScreenBanner2;
    }

    @JavascriptInterface
    public void stayAlive() {
        this.fullScreenBanner.stayAlive();
    }

    @JavascriptInterface
    public void close() {
        this.fullScreenBanner.close();
    }

    @JavascriptInterface
    public void setClickUrl(String str, String str2) {
        if (checkSecurityCode(str2, this.fullScreenBanner.getContext())) {
            this.fullScreenBanner.setClickUrl(str);
        }
    }

    @JavascriptInterface
    public String takeScreenShot() {
        return WebViewScreenShooter.takeScreenShotInBase64(this.fullScreenBanner.getWebView());
    }

    @JavascriptInterface
    public void forceOpenInNativeBrowser(boolean z) {
        this.fullScreenBanner.forceOpenInNativeBrowser(z);
    }

    @JavascriptInterface
    public void setBackKeyLocked(boolean z) {
        this.fullScreenBanner.setBackKeyLocked(z);
    }

    @JavascriptInterface
    public void trackCrossClick() {
        StatController.getInstance().sendRequestAsyncByKey("click_cross_banner");
    }

    @JavascriptInterface
    public void trackBannerClick() {
        StatController.getInstance().sendRequestAsyncByKey("click_html_tap_start");
    }

    @JavascriptInterface
    public void trackTimerClick() {
        StatController.getInstance().sendRequestAsyncByKey("click_timer_banner");
    }

    @JavascriptInterface
    public void showTimer(int i) {
        this.fullScreenBanner.setShowTimer((long) (i * 1000));
    }

    @JavascriptInterface
    public void setUniqueId(String str) {
        this.fullScreenBanner.setUniqueId(str);
    }

    @JavascriptInterface
    public void saveImpressionUrl(String str) {
        this.fullScreenBanner.setImpressionUrl(str);
    }
}
