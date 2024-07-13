package com.appsgeyser.sdk.ads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appsgeyser.sdk.AdActivity;
import com.appsgeyser.sdk.BrowserActivity;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.Constants;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParameters;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.appsgeyser.sdk.utils.BannerUtils;
import com.appsgeyser.sdk.utils.DeviceInfoGetter;
import com.appsgeyser.sdk.utils.EndpointGetter;
import com.yandex.metrica.YandexMetrica;
import java.util.HashMap;

public class FullScreenBanner {
    private static final String TAG = FullScreenBanner.class.getSimpleName();
    private boolean backKeyLocked = true;
    /* access modifiers changed from: private */
    public boolean bannerClicked = false;
    /* access modifiers changed from: private */
    public String bannerUrl = null;
    /* access modifiers changed from: private */
    public WebView bannerView = null;
    /* access modifiers changed from: private */
    public String clickUrl = null;
    /* access modifiers changed from: private */
    public Context context = null;
    /* access modifiers changed from: private */
    public BannerTypes currentBannerType = BannerTypes.NO_BANNER;
    /* access modifiers changed from: private */
    public int currentlyShownBanners = 0;
    private DeviceIdParameters deviceIdParameters;
    /* access modifiers changed from: private */
    public boolean errorHappened = false;
    private FullScreenEventListener eventListener = null;
    private final Handler handler = new Handler();
    private String impressionUrl = "about:blank";
    private boolean isActivityInForeground = true;
    /* access modifiers changed from: private */
    public boolean isFailedSend = false;
    /* access modifiers changed from: private */
    public boolean isLoading = false;
    private boolean isOnTouchFSEnabled = true;
    /* access modifiers changed from: private */
    public boolean keepAliveCalled = false;
    /* access modifiers changed from: private */
    public IFullScreenBannerListener listener = null;
    /* access modifiers changed from: private */
    public String loadTagBanner;
    /* access modifiers changed from: private */
    public boolean openInNativeBrowser = true;
    /* access modifiers changed from: private */
    public AppsgeyserProgressDialog progressDialog;
    /* access modifiers changed from: private */
    public boolean ready = false;
    /* access modifiers changed from: private */
    public boolean redirect = false;
    /* access modifiers changed from: private */
    public long timerDuration = -1;
    /* access modifiers changed from: private */
    public int timesToShow = 1;
    private final Handler uiThreadHandler;
    /* access modifiers changed from: private */
    public String uniqueId = "-1";

    public enum BannerTypes {
        HTML,
        NO_BANNER,
        PENDING_BANNER,
        SDK
    }

    public interface FullScreenEventListener {
        void bannerClosed();
    }

    static /* synthetic */ int access$1908(FullScreenBanner fullScreenBanner) {
        int i = fullScreenBanner.currentlyShownBanners;
        fullScreenBanner.currentlyShownBanners = i + 1;
        return i;
    }

    public FullScreenBanner(final Context context2) {
        this.context = context2;
        this.progressDialog = new AppsgeyserProgressDialog(context2);
        this.uiThreadHandler = new Handler(context2.getMainLooper());
        WebView webView = new WebView(this.context);
        this.bannerView = webView;
        webView.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (!BannerUtils.isDataTextHtmlUrl(str)) {
                    handleRedirect(webView, str);
                    return;
                }
                handleRedirect(webView, (String) null);
                StatController.getInstance().sendRequestAsyncByKey("click_data_text_html_loaded_in_banner");
            }

            public void onPageFinished(WebView webView, String str) {
                boolean unused = FullScreenBanner.this.isLoading = false;
                if (!FullScreenBanner.this.keepAliveCalled) {
                    boolean unused2 = FullScreenBanner.this.errorHappened = true;
                    if (FullScreenBanner.this.listener != null) {
                        FullScreenBanner.this.listener.onAdFailedToLoad(context2, FullScreenBanner.this.loadTagBanner);
                    }
                } else if (!FullScreenBanner.this.errorHappened) {
                    boolean unused3 = FullScreenBanner.this.ready = true;
                    if (!FullScreenBanner.this.currentBannerType.equals(BannerTypes.SDK)) {
                        BannerTypes unused4 = FullScreenBanner.this.currentBannerType = BannerTypes.HTML;
                        if (FullScreenBanner.this.listener != null) {
                            FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                        }
                    }
                    if (FullScreenBanner.this.currentBannerType.equals(BannerTypes.SDK)) {
                        FullScreenBanner.this.close();
                    }
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return handleRedirect(webView, str);
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (FullScreenBanner.this.listener != null && FullScreenBanner.this.isLoading) {
                    if (Build.VERSION.SDK_INT < 21) {
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else if (!str2.contains("https://splash.appsgeyser.com/")) {
                        boolean unused = FullScreenBanner.this.ready = true;
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else if (str2.contains("img") || str2.contains("css")) {
                        boolean unused2 = FullScreenBanner.this.ready = true;
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else {
                        FullScreenBanner.this.listener.onAdFailedToLoad(context2, FullScreenBanner.this.loadTagBanner);
                    }
                }
                boolean unused3 = FullScreenBanner.this.isLoading = false;
            }

            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (FullScreenBanner.this.listener != null && FullScreenBanner.this.isLoading) {
                    if (Build.VERSION.SDK_INT < 21) {
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else if (!webResourceRequest.getUrl().toString().contains("https://splash.appsgeyser.com/")) {
                        boolean unused = FullScreenBanner.this.ready = true;
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else if (webResourceRequest.getUrl().toString().contains("img") || webResourceRequest.getUrl().toString().contains("css")) {
                        boolean unused2 = FullScreenBanner.this.ready = true;
                        FullScreenBanner.this.listener.onLoadFinished(FullScreenBanner.this);
                    } else {
                        FullScreenBanner.this.listener.onAdFailedToLoad(context2, FullScreenBanner.this.loadTagBanner);
                    }
                }
                boolean unused3 = FullScreenBanner.this.isLoading = false;
            }

            private boolean handleRedirect(WebView webView, String str) {
                Intent intent;
                if (str == null) {
                    boolean unused = FullScreenBanner.this.keepAliveCalled = false;
                    FullScreenBanner.this.close();
                    return false;
                } else if (EndpointGetter.getUrlWithoutArguments(str).equalsIgnoreCase(EndpointGetter.getUrlWithoutArguments(FullScreenBanner.this.bannerUrl)) || FullScreenBanner.this.redirect || BannerUtils.isDataTextHtmlUrl(str)) {
                    return false;
                } else {
                    webView.stopLoading();
                    boolean unused2 = FullScreenBanner.this.bannerClicked = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    if (FullScreenBanner.this.openInNativeBrowser) {
                        intent = new Intent(FullScreenBanner.this.context, BrowserActivity.class);
                        intent.putExtra("browser_url", str);
                        intent.putExtra("uniqid", FullScreenBanner.this.uniqueId);
                        intent.putExtra("banner_type", "banner_type_fullscreen");
                        intent.putExtra("timer_duration", FullScreenBanner.this.timerDuration);
                        intent.addFlags(268435456);
                        StatController.getInstance().sendRequestAsyncByKey("click_redirect_start", hashMap, context2, true);
                    } else {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        StatController.getInstance().sendRequestAsyncByKey("click_external_browser", hashMap, context2, true);
                    }
                    intent.setFlags(268435456);
                    FullScreenBanner.this.close();
                    FullScreenBanner.this.context.startActivity(intent);
                    if (!TextUtils.isEmpty(FullScreenBanner.this.clickUrl)) {
                        AppsgeyserServerClient.getInstance().sendClickInfo(FullScreenBanner.this.clickUrl, webView.getContext());
                        YandexMetrica.reportEvent("fullscreen_clicked");
                    }
                    return true;
                }
            }
        });
        this.bannerView.setWebChromeClient(new WebChromeClient() {
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.d("FSBannerJsError", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
                return super.onConsoleMessage(consoleMessage);
            }
        });
        this.bannerView.addJavascriptInterface(new FullscreenBannerJsInterface(this, this.context), FullscreenBannerJsInterface.JS_INTERFACE_NAME);
        this.context.getDir("appcache", 0).getPath();
        String path = this.context.getDir("geolocation", 0).getPath();
        WebSettings settings = this.bannerView.getSettings();
        settings.setCacheMode(-1);
        settings.setGeolocationDatabasePath(path);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setListener(new SimpleFullScreenBannerListener());
    }

    public void load(String str) {
        if (!this.isLoading) {
            this.currentlyShownBanners = 0;
            this.keepAliveCalled = false;
            this.ready = false;
            this.errorHappened = false;
            if (this.bannerUrl != null) {
                this.currentBannerType = BannerTypes.NO_BANNER;
                updateBannerUrlWithTag(str);
                loadBanner();
                return;
            }
            this.currentBannerType = BannerTypes.PENDING_BANNER;
        }
    }

    /* access modifiers changed from: private */
    public void loadBanner() {
        if (this.bannerUrl == null || this.isLoading) {
            Log.e(TAG, "initialization error, can't load banner!");
            return;
        }
        IFullScreenBannerListener iFullScreenBannerListener = this.listener;
        if (iFullScreenBannerListener != null) {
            iFullScreenBannerListener.onLoadStarted();
        }
        this.uiThreadHandler.post(new Runnable() {
            public void run() {
                FullScreenBanner.this.bannerView.loadUrl(FullScreenBanner.this.bannerUrl);
            }
        });
    }

    public void show() {
        if (!this.isActivityInForeground) {
            return;
        }
        if (!this.ready || this.errorHappened) {
            String str = TAG;
            Log.e(str, this.ready + " " + this.errorHappened);
            Log.e(TAG, "banner is not ready!");
            return;
        }
        this.progressDialog.show();
        this.handler.postDelayed(new Runnable() {
            public void run() {
                FullScreenBanner fullScreenBanner = FullScreenBanner.this;
                fullScreenBanner.updateBannerUrlWithTag(fullScreenBanner.loadTagBanner);
                FullScreenBanner.this.progressDialog.dismiss();
                if (FullScreenBanner.this.currentBannerType.equals(BannerTypes.HTML) || FullScreenBanner.this.currentBannerType.equals(BannerTypes.NO_BANNER)) {
                    AdActivity.startActivity(FullScreenBanner.this.context);
                }
            }
        }, Constants.getFullScreenDelay());
    }

    /* access modifiers changed from: package-private */
    public void stayAlive() {
        this.keepAliveCalled = true;
    }

    public void setListener(final IFullScreenBannerListener iFullScreenBannerListener) {
        this.listener = new IFullScreenBannerListener() {
            public void onLoadStarted() {
                boolean unused = FullScreenBanner.this.isLoading = true;
                boolean unused2 = FullScreenBanner.this.isFailedSend = false;
                if (FullScreenBanner.this.currentlyShownBanners != FullScreenBanner.this.timesToShow) {
                    iFullScreenBannerListener.onLoadStarted();
                }
            }

            public void onLoadFinished(FullScreenBanner fullScreenBanner) {
                boolean unused = FullScreenBanner.this.isLoading = false;
                if (FullScreenBanner.this.currentlyShownBanners < FullScreenBanner.this.timesToShow) {
                    FullScreenBanner.access$1908(FullScreenBanner.this);
                    fullScreenBanner.show();
                }
            }

            public void onAdFailedToLoad(Context context, String str) {
                if (FullScreenBanner.this.currentlyShownBanners != FullScreenBanner.this.timesToShow && !FullScreenBanner.this.isFailedSend) {
                    boolean unused = FullScreenBanner.this.isFailedSend = true;
                    iFullScreenBannerListener.onAdFailedToLoad(context, str);
                }
            }

            public void onAdHided(Context context, String str) {
                BannerTypes unused = FullScreenBanner.this.currentBannerType = BannerTypes.NO_BANNER;
                if (FullScreenBanner.this.currentlyShownBanners == FullScreenBanner.this.timesToShow) {
                    iFullScreenBannerListener.onAdHided(context, str);
                }
                if (FullScreenBanner.this.currentlyShownBanners < FullScreenBanner.this.timesToShow && !FullScreenBanner.this.bannerClicked) {
                    FullScreenBanner.this.loadBanner();
                }
                boolean unused2 = FullScreenBanner.this.bannerClicked = false;
            }
        };
    }

    public void setEventListener(AdActivity adActivity) {
        this.eventListener = adActivity;
    }

    public synchronized void initWithDeviceIdParameters(DeviceIdParameters deviceIdParameters2) {
        this.deviceIdParameters = deviceIdParameters2;
        Configuration instance = Configuration.getInstance(getContext());
        String str = "";
        if (deviceIdParameters2 != null) {
            String advId = deviceIdParameters2.getAdvId();
            String lowerCase = deviceIdParameters2.getLimitAdTrackingEnabled().toString().toLowerCase();
            String str2 = deviceIdParameters2.getaId();
            if (!TextUtils.isEmpty(advId)) {
                str = "&advid=" + advId + "&limit_ad_tracking_enabled=" + lowerCase;
            } else {
                str = "&aid=" + str2;
            }
        }
        if (this.loadTagBanner == null) {
            this.loadTagBanner = "on_start";
        }
        this.bannerUrl = "https://splash.appsgeyser.com/" + ("?widgetid=" + instance.getApplicationId() + "&guid=" + instance.getAppGuid() + "&v=" + Constants.PLATFORM_VERSION + str + "&tlat=&tlon=&p=android&sdk=1" + DeviceInfoGetter.getDeviceInfo(this.context.getApplicationContext()) + "&load_tag_banner=" + this.loadTagBanner + "&templateversion=" + instance.getTemplateVersion());
        if (this.currentBannerType.equals(BannerTypes.PENDING_BANNER)) {
            loadBanner();
        }
    }

    public WebView getWebView() {
        return this.bannerView;
    }

    /* access modifiers changed from: package-private */
    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    /* access modifiers changed from: package-private */
    public void setImpressionUrl(String str) {
        this.impressionUrl = str;
    }

    public void setBannerType(BannerTypes bannerTypes) {
        this.currentBannerType = bannerTypes;
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context2) {
        Context context3 = this.context;
        if (context3 != null && !context3.equals(context2)) {
            this.context = context2;
            this.progressDialog = new AppsgeyserProgressDialog(context2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackKeyLocked(boolean z) {
        this.backKeyLocked = z;
    }

    /* access modifiers changed from: package-private */
    public void setShowTimer(long j) {
        if (j > 0) {
            this.timerDuration = j;
        }
    }

    /* access modifiers changed from: package-private */
    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setTimesToShow(int i) {
        this.timesToShow = i;
    }

    public void setOnTouchFSEnabled(boolean z) {
        this.isOnTouchFSEnabled = z;
    }

    public void setActivityInForeground(boolean z) {
        this.isActivityInForeground = z;
    }

    public void close() {
        IFullScreenBannerListener iFullScreenBannerListener = this.listener;
        if (iFullScreenBannerListener != null) {
            iFullScreenBannerListener.onAdHided(this.context, this.loadTagBanner);
        }
        this.redirect = false;
        FullScreenEventListener fullScreenEventListener = this.eventListener;
        if (fullScreenEventListener != null) {
            try {
                fullScreenEventListener.bannerClosed();
                this.eventListener = null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void forceOpenInNativeBrowser(boolean z) {
        this.openInNativeBrowser = z;
    }

    /* access modifiers changed from: private */
    public void updateBannerUrlWithTag(String str) {
        String str2;
        if (this.loadTagBanner == null) {
            this.loadTagBanner = "on_start";
        }
        if (!this.loadTagBanner.equals(str)) {
            this.loadTagBanner = str;
            Configuration instance = Configuration.getInstance(getContext());
            this.bannerUrl = "https://splash.appsgeyser.com/?widgetid=" + instance.getApplicationId() + "&guid=" + instance.getAppGuid() + "&v=" + Constants.PLATFORM_VERSION;
            DeviceIdParameters deviceIdParameters2 = this.deviceIdParameters;
            if (deviceIdParameters2 != null) {
                String advId = deviceIdParameters2.getAdvId();
                String lowerCase = this.deviceIdParameters.getLimitAdTrackingEnabled().toString().toLowerCase();
                String str3 = this.deviceIdParameters.getaId();
                if (!TextUtils.isEmpty(advId)) {
                    str2 = "&advid=" + advId + "&limit_ad_tracking_enabled=" + lowerCase;
                } else {
                    str2 = "&aid=" + str3;
                }
                this.bannerUrl += str2;
            }
            this.bannerUrl += "&tlat=&tlon=&p=android&sdk=1" + DeviceInfoGetter.getDeviceInfo(this.context.getApplicationContext()) + "&load_tag_banner=" + this.loadTagBanner + "&templateversion=" + instance.getTemplateVersion();
        }
        if (!this.bannerUrl.contains("&skipAdmob=true")) {
            this.bannerUrl += "&skipAdmob=true";
        }
        if (!this.bannerUrl.contains("&skipMoPub=true")) {
            this.bannerUrl += "&skipMoPub=true";
        }
    }
}
