package com.appsgeyser.sdk.ads;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.appsgeyser.sdk.BrowserActivity;
import com.appsgeyser.sdk.ads.AdsBannerWebViewClient;
import com.appsgeyser.sdk.ads.behavior.BehaviorAcceptor;
import com.appsgeyser.sdk.ads.behavior.BehaviorFactory;
import com.appsgeyser.sdk.ads.behavior.BehaviorVisitor;
import com.appsgeyser.sdk.ads.behavior.loaderBehaviors.LoaderBehavior;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.Constants;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParameters;
import com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient;
import com.appsgeyser.sdk.server.network.NetworkManager;
import com.appsgeyser.sdk.utils.BannerUtils;
import com.appsgeyser.sdk.utils.EndpointGetter;
import com.yandex.metrica.YandexMetrica;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class AdsLoader implements AdsBannerWebViewClient.OnPageFinishedListener, AdsBannerWebViewClient.OnPageStartedListener, BehaviorAcceptor {
    private final float DEFAULT_HIDE_TIMEOUT = 60000.0f;
    /* access modifiers changed from: private */
    public AdView adView;
    /* access modifiers changed from: private */
    public String bannerUrl;
    private BehaviorFactory.ClickBehavior clickBehavior;
    private String clickUrl;
    private Thread closeBannerThread = null;
    /* access modifiers changed from: private */
    public HeadersReceiver headersReceiver;
    private AdsLoadingFinishedListener loadingFinishedListener;
    private boolean openInNativeBrowser = true;
    /* access modifiers changed from: private */
    public Timer refreshTimer = new Timer();

    interface AdsLoadingFinishedListener {
        void onAdLoadFinished();
    }

    interface HeadersReceiver {
        boolean onAdHeadersReceived(Map<String, List<String>> map);
    }

    /* access modifiers changed from: package-private */
    public void init(AdView adView2, DeviceIdParameters deviceIdParameters) {
        this.adView = adView2;
        adView2.getBrowser().setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                CorrectClickStateHolder.getInstance().allowClick();
                Log.d("AUTOCLICK_DETECT", "touch detected");
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        this.bannerUrl = createBannerUrl(deviceIdParameters);
        this.clickBehavior = BehaviorFactory.ClickBehavior.HIDE;
        this.closeBannerThread = new Thread() {
            public void run() {
                AdsLoader.this.refreshTimer.cancel();
                if (AdsLoader.this.adView.getBrowser() != null) {
                    AdsLoader.this.adView.getBrowser().stopLoading();
                }
                AdsLoader.this.adView.hide();
            }
        };
    }

    private String createBannerUrl(DeviceIdParameters deviceIdParameters) {
        String str;
        Configuration instance = Configuration.getInstance(this.adView.getContext());
        if (deviceIdParameters != null) {
            String advId = deviceIdParameters.getAdvId();
            String lowerCase = deviceIdParameters.getLimitAdTrackingEnabled().toString().toLowerCase();
            String str2 = deviceIdParameters.getaId();
            if (!TextUtils.isEmpty(advId)) {
                str = "&advid=" + advId + "&limit_ad_tracking_enabled=" + lowerCase;
            } else {
                str = "&aid=" + str2;
            }
        } else {
            str = "&hid=&aid=";
        }
        return "https://ads.appsgeyser.com/" + ("?widgetid=" + instance.getApplicationId() + "&guid=" + instance.getAppGuid() + "&v=" + Constants.PLATFORM_VERSION + str + "&tlat=&tlon=&p=android&sdk=1&templateversion=" + instance.getTemplateVersion());
    }

    /* access modifiers changed from: package-private */
    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    /* access modifiers changed from: package-private */
    public void setHeaderReceiver(HeadersReceiver headersReceiver2) {
        this.headersReceiver = headersReceiver2;
    }

    /* access modifiers changed from: package-private */
    public void setAdsLoadingFinishedListener(AdsLoadingFinishedListener adsLoadingFinishedListener) {
        this.loadingFinishedListener = adsLoadingFinishedListener;
    }

    /* access modifiers changed from: package-private */
    public void reload() {
        try {
            new Thread() {
                public void run() {
                    Map<String, List<String>> loadHeaders = NetworkManager.getInstance().loadHeaders(AdsLoader.this.bannerUrl);
                    if (loadHeaders != null) {
                        if ((AdsLoader.this.headersReceiver == null || AdsLoader.this.headersReceiver.onAdHeadersReceived(loadHeaders)) && AdsLoader.this.adView.getBrowser() != null) {
                            AdsLoader.this.adView.post(new Runnable() {
                                public void run() {
                                    AdsLoader.this.adView.getBrowser().loadUrl(AdsLoader.this.bannerUrl);
                                }
                            });
                        }
                    } else if (AdsLoader.this.adView != null) {
                        AdsLoader.this.adView.post(new Runnable() {
                            public void run() {
                                AdsLoader.this.adView.hide();
                            }
                        });
                    }
                }
            }.start();
        } catch (Exception e2) {
            Log.e("AdsLoader", e2.getMessage());
        }
    }

    public void changeClickBehavior(BehaviorFactory.ClickBehavior clickBehavior2) {
        this.clickBehavior = clickBehavior2;
    }

    public void setRefreshTimeout(float f2) {
        if (((double) f2) > 0.0d) {
            this.refreshTimer.cancel();
            Timer timer = new Timer();
            this.refreshTimer = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    AdsLoader.this.reload();
                    AdsLoader.this.refreshTimer.cancel();
                }
            }, (long) ((int) (f2 * 1000.0f)), 100);
        }
    }

    public void setHideTimeout(float f2) {
        if (((double) f2) <= 0.0d) {
            f2 = 60000.0f;
        }
        this.adView.removeCallbacks(this.closeBannerThread);
        this.adView.postDelayed(this.closeBannerThread, (long) (f2 * 1000.0f));
    }

    public void acceptBehavior(BehaviorVisitor behaviorVisitor) {
        if (behaviorVisitor instanceof LoaderBehavior) {
            ((LoaderBehavior) behaviorVisitor).visit((BehaviorAcceptor) this);
        }
    }

    private void setDefaults() {
        this.refreshTimer.cancel();
        setHideTimeout(60000.0f);
        this.adView.applyDefaultSettings();
    }

    public boolean loadStarted(WebView webView, String str, Bitmap bitmap) {
        Intent intent;
        String str2;
        if (str == null) {
            reload();
            return true;
        } else if (EndpointGetter.getUrlWithoutArguments(str).equals(EndpointGetter.getUrlWithoutArguments(this.bannerUrl)) || BannerUtils.isDataTextHtmlUrl(str)) {
            this.adView.switchToHtmlBanner();
            return true;
        } else if (!CorrectClickStateHolder.getInstance().isClickAllowed()) {
            try {
                str2 = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                str2 = "-1";
            }
            webView.loadUrl("javascript:processACWithUrl('" + str2 + "')");
            return false;
        } else {
            CorrectClickStateHolder.getInstance().reset();
            Log.d("AUTOCLICK_DETECT", "click ALLOWED!");
            if (this.clickBehavior == BehaviorFactory.ClickBehavior.HIDE) {
                this.adView.hide();
                this.refreshTimer.cancel();
            } else if (this.clickBehavior == BehaviorFactory.ClickBehavior.REMAIN_ON_SCREEN) {
                reload();
            }
            webView.stopLoading();
            if (this.openInNativeBrowser) {
                intent = new Intent(this.adView.getContext(), BrowserActivity.class);
                intent.putExtra("browser_url", str);
                intent.putExtra("banner_type", "banner_type_small");
                intent.putExtra("uniqid", this.adView.getUniqueId());
                intent.addFlags(268435456);
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            }
            this.adView.getContext().startActivity(intent);
            if (!TextUtils.isEmpty(this.clickUrl)) {
                AppsgeyserServerClient.getInstance().sendClickInfo(this.clickUrl, webView.getContext());
                YandexMetrica.reportEvent("small_banner_clicked");
            }
            return false;
        }
    }

    public void loadFinished(WebView webView, String str) {
        if (str.equals("data:text/html,chromewebdata") || str.equals("about:blank")) {
            this.adView.hide();
            return;
        }
        this.adView.show();
        this.adView.switchToHtmlBanner();
        if (str.equalsIgnoreCase(this.bannerUrl) || BannerUtils.isDataTextHtmlUrl(str)) {
            setDefaults();
            AdsLoadingFinishedListener adsLoadingFinishedListener = this.loadingFinishedListener;
            if (adsLoadingFinishedListener != null) {
                adsLoadingFinishedListener.onAdLoadFinished();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void stopLoading() {
        this.adView.hide();
    }

    /* access modifiers changed from: package-private */
    public void proceedClick(final String str) {
        if (this.adView.getBrowser() != null) {
            this.adView.getBrowser().post(new Runnable() {
                public void run() {
                    AdsLoader.this.adView.getBrowser().loadUrl(str);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void forceOpenInNativeBrowser(boolean z) {
        this.openInNativeBrowser = z;
    }
}
