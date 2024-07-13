package com.appsgeyser.sdk.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.BannerJavascriptInterface;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.hasher.Hasher;

public class BannerJavascriptInterface {
    /* access modifiers changed from: private */
    public final AdView adView;
    /* access modifiers changed from: private */
    public final AdsLoader adsLoader;
    private String androidId;

    public BannerJavascriptInterface(AdView adView2, AdsLoader adsLoader2) {
        this.adView = adView2;
        this.adsLoader = adsLoader2;
    }

    @JavascriptInterface
    public void addJs(final String str, final String str2) {
        this.adView.post(new Runnable() {
            public void run() {
                if (BannerJavascriptInterface.this.checkSecurityCode(str2)) {
                    BannerJavascriptInterface.this.adView.addJsCode(str);
                    if (!str.equals("")) {
                        AppsgeyserSDK.getAdditionalJsCode(new AppsgeyserSDK.OnAdditionalJsLoaded() {
                            public final void onJsLoaded(String str) {
                                BannerJavascriptInterface.AnonymousClass1.this.lambda$run$0$BannerJavascriptInterface$1(str);
                            }
                        });
                        InternalEntryPoint.getInstance().setAdditionalJsCode(str);
                    }
                }
            }

            public /* synthetic */ void lambda$run$0$BannerJavascriptInterface$1(String str) {
                WebView browser = BannerJavascriptInterface.this.adView.getBrowser();
                browser.loadUrl("javascript:(function(){ " + str + " })()");
            }
        });
    }

    @JavascriptInterface
    public void close() {
        this.adView.post(new Runnable() {
            public void run() {
                BannerJavascriptInterface.this.adView.hide();
            }
        });
    }

    @JavascriptInterface
    public void setClickUrl(final String str, final String str2) {
        this.adView.post(new Runnable() {
            public void run() {
                if (BannerJavascriptInterface.this.checkSecurityCode(str2)) {
                    BannerJavascriptInterface.this.adsLoader.setClickUrl(str);
                }
            }
        });
    }

    @JavascriptInterface
    public String getAndroidId(String str) {
        return checkSecurityCode(str) ? this.androidId : "";
    }

    @JavascriptInterface
    public void reload(final String str) {
        this.adView.post(new Runnable() {
            public void run() {
                if (BannerJavascriptInterface.this.checkSecurityCode(str)) {
                    BannerJavascriptInterface.this.adsLoader.reload();
                }
            }
        });
    }

    @JavascriptInterface
    public boolean checkSecurityCode(String str) {
        Configuration instance = Configuration.getInstance(this.adView.getContext());
        String applicationId = instance.getApplicationId();
        String appGuid = instance.getAppGuid();
        if (TextUtils.isEmpty(applicationId) || TextUtils.isEmpty(appGuid)) {
            return false;
        }
        return str.equalsIgnoreCase(Hasher.md5(appGuid + applicationId));
    }

    @JavascriptInterface
    public void forceOpenInNativeBrowser(boolean z) {
        this.adsLoader.forceOpenInNativeBrowser(z);
    }

    @JavascriptInterface
    public void setUniqId(String str) {
        this.adView.setUniqueId(str);
    }

    @JavascriptInterface
    public void proceedClick(String str) {
        this.adsLoader.proceedClick(str);
    }
}
