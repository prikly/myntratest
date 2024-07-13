package com.appsgeyser.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.Utils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.utils.Drawables;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BrowserActivity extends Activity {
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(Constants.FAILED_REQUEST_PRECACHE_MS);
    /* access modifiers changed from: private */
    public final Handler handler = new Handler();
    /* access modifiers changed from: private */
    public boolean isFullScreenBanner = false;
    private ImageButton mBackButton;
    private ImageButton mCloseButton;
    private ImageButton mForwardButton;
    /* access modifiers changed from: private */
    public final Runnable mHtmlCheckRunnable = new Runnable() {
        public void run() {
            if (BrowserActivity.this.mWebView != null) {
                BrowserActivity.this.mWebView.loadUrl("javascript:window.HtmlViewer.detectHTML(document.documentElement.innerHTML);");
            }
        }
    };
    private ImageButton mRefreshButton;
    /* access modifiers changed from: private */
    public TextView mTimer;
    /* access modifiers changed from: private */
    public WebView mWebView;
    /* access modifiers changed from: private */
    public boolean marketOpen;
    private long timerDuration = -1;
    private final long timerStep = 1000;
    private String uniqid;

    public void onBackPressed() {
    }

    private class DetectJSInterface {
        private DetectJSInterface() {
        }

        @JavascriptInterface
        public void detectHTML(String str) {
            String str2 = (str == null || str.length() < 40) ? "click_finish_epmty_html" : "click_finish_html";
            if (BrowserActivity.this.isFullScreenBanner) {
                HashMap hashMap = new HashMap();
                hashMap.put("details", BrowserActivity.this._trimSubstring(str, 1000));
                StatController.getInstance().sendRequestAsyncByKey(str2, hashMap, BrowserActivity.this, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        enableCookies();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("browser_url");
        String stringExtra2 = intent.getStringExtra("banner_type");
        this.uniqid = intent.getStringExtra("uniqid");
        this.isFullScreenBanner = stringExtra2.equals("banner_type_fullscreen");
        this.timerDuration = intent.getLongExtra("timer_duration", -1);
        requestWindowFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().setFlags(1024, 1024);
        setContentView(_initBrowserView());
        this.mWebView.resumeTimers();
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.addJavascriptInterface(new DetectJSInterface(), "HtmlViewer");
        this.mWebView.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                _handleRedirect(str);
                super.onPageStarted(webView, str, bitmap);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return _handleRedirect(str);
            }

            private boolean _handleRedirect(String str) {
                BrowserActivity.this.handler.removeCallbacksAndMessages((Object) null);
                if (str == null) {
                    return false;
                }
                boolean access$400 = BrowserActivity._isHttpUrl(str);
                boolean access$500 = BrowserActivity._isMarketUrl(str);
                if (access$500 && access$400) {
                    str = BrowserActivity._replaceHttpWithMarketUrl(str);
                }
                if (access$500 || !access$400) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    try {
                        if (!BrowserActivity.this.marketOpen) {
                            BrowserActivity.this.startActivity(intent);
                            boolean unused = BrowserActivity.this.marketOpen = true;
                        }
                        if (BrowserActivity.this.isFullScreenBanner) {
                            StatController.getInstance().sendRequestAsyncByKey("click_finish_market", hashMap, BrowserActivity.this, true);
                        }
                        BrowserActivity.this.finish();
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                        if (BrowserActivity.this.isFullScreenBanner) {
                            StatController.getInstance().sendRequestAsyncByKey("click_no_market_on_device", hashMap, BrowserActivity.this, true);
                        }
                    }
                }
                return false;
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (BrowserActivity.this.isFullScreenBanner) {
                    HashMap hashMap = new HashMap();
                    BrowserActivity browserActivity = BrowserActivity.this;
                    hashMap.put("details", browserActivity._trimSubstring(Integer.toString(i) + " : " + str, 1000));
                    hashMap.put("url", str2);
                    StatController.getInstance().sendRequestAsyncByKey("click_loading_error", hashMap, BrowserActivity.this, true);
                }
                super.onReceivedError(webView, i, str, str2);
            }

            public void onPageFinished(WebView webView, String str) {
                if (!BrowserActivity._isMarketUrl(str) && BrowserActivity._isHttpUrl(str)) {
                    BrowserActivity.this.handler.postDelayed(BrowserActivity.this.mHtmlCheckRunnable, 1000);
                    super.onPageFinished(webView, str);
                }
            }
        });
        this.mWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i) {
                BrowserActivity.this.setTitle("Loading...");
                BrowserActivity.this.setProgress(i * 100);
                if (i == 100) {
                    BrowserActivity.this.setTitle(webView.getUrl());
                }
            }
        });
        this.mWebView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                String str5;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (BrowserActivity.this.getPackageManager().resolveActivity(intent, 0) != null) {
                    BrowserActivity.this.startActivity(intent);
                    str5 = "click_finish_download";
                } else {
                    str5 = "click_can_not_start_download";
                }
                if (BrowserActivity.this.isFullScreenBanner) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    StatController.getInstance().sendRequestAsyncByKey(str5, hashMap, BrowserActivity.this, true);
                }
            }
        });
        initButtons();
        if (this.timerDuration > 0) {
            showTimer();
            startTimer();
        } else {
            showClose();
        }
        this.mWebView.loadUrl(stringExtra);
    }

    private void initButtons() {
        this.mCloseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (BrowserActivity.this.isFullScreenBanner) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", BrowserActivity.this.mWebView.getUrl());
                    StatController.getInstance().sendRequestAsyncByKey("click_cross_mini_browser", hashMap, BrowserActivity.this, true);
                }
                BrowserActivity.this.finish();
            }
        });
        this.mBackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (BrowserActivity.this.mWebView.canGoBack()) {
                    BrowserActivity.this.mWebView.goBack();
                }
            }
        });
        this.mForwardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (BrowserActivity.this.mWebView.canGoForward()) {
                    BrowserActivity.this.mWebView.goForward();
                }
            }
        });
        this.mRefreshButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BrowserActivity.this.mWebView.reload();
            }
        });
    }

    private void enableCookies() {
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mWebView.resumeTimers();
        CookieSyncManager.getInstance().startSync();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mWebView.destroy();
        this.mWebView = null;
    }

    /* access modifiers changed from: private */
    public static String _replaceHttpWithMarketUrl(String str) {
        if (!_isMarketUrl(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "market://details?" + parse.getEncodedQuery();
    }

    /* access modifiers changed from: private */
    public static boolean _isMarketUrl(String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        return parse.getScheme().equals(Utils.PLAY_STORE_SCHEME) || (host != null && host.equals("play.google.com"));
    }

    /* access modifiers changed from: private */
    public static boolean _isHttpUrl(String str) {
        String scheme = Uri.parse(str).getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    /* access modifiers changed from: private */
    public String _trimSubstring(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i > str.length()) {
            i = str.length();
        }
        return str.substring(0, i - 1);
    }

    private void showTimer() {
        this.mTimer.setVisibility(0);
        this.mCloseButton.setVisibility(8);
    }

    private void startTimer() {
        new CountDownTimer(this.timerDuration, 1000) {
            public void onTick(long j) {
                BrowserActivity.this.mTimer.setText(String.valueOf(j / 1000));
            }

            public void onFinish() {
                BrowserActivity.this.showClose();
            }
        }.start();
    }

    /* access modifiers changed from: private */
    public void showClose() {
        this.mTimer.setVisibility(8);
        this.mCloseButton.setVisibility(0);
    }

    public static int generateViewId() {
        int i;
        int i2;
        do {
            i = sNextGeneratedId.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!sNextGeneratedId.compareAndSet(i, i2));
        return i;
    }

    private View _initBrowserView() {
        LinearLayout linearLayout = new LinearLayout(this);
        new LinearLayout.LayoutParams(-1, -1, 1.0f);
        linearLayout.setOrientation(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, pixelsByDp(40));
        layoutParams.addRule(12);
        relativeLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setBackgroundColor(-13421773);
        linearLayout2.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, pixelsByDp(40));
        layoutParams2.addRule(10);
        layoutParams2.addRule(12);
        layoutParams2.addRule(9);
        layoutParams2.addRule(11);
        linearLayout2.setLayoutParams(layoutParams2);
        this.mBackButton = _getButton(Drawables.LEFT_ARROW.createDrawable(this));
        this.mForwardButton = _getButton(Drawables.RIGHT_ARROW.createDrawable(this));
        this.mRefreshButton = _getButton(Drawables.REFRESH.createDrawable(this));
        this.mCloseButton = _getButton(Drawables.CLOSE.createDrawable(this));
        linearLayout2.addView(this.mBackButton);
        linearLayout2.addView(this.mForwardButton);
        linearLayout2.addView(this.mRefreshButton);
        linearLayout2.addView(this.mCloseButton);
        TextView textView = new TextView(this);
        this.mTimer = textView;
        textView.setBackgroundColor(0);
        this.mTimer.setPadding(pixelsByDp(5), pixelsByDp(5), pixelsByDp(5), pixelsByDp(5));
        this.mTimer.setGravity(17);
        this.mTimer.setTextColor(-1);
        this.mTimer.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(pixelsByDp(30), pixelsByDp(30), 1.0f);
        layoutParams3.gravity = 17;
        this.mTimer.setLayoutParams(layoutParams3);
        linearLayout2.addView(this.mTimer);
        relativeLayout.addView(linearLayout2);
        this.mWebView = new WebView(this);
        this.mWebView.setId(generateViewId());
        this.mWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(this.mWebView);
        linearLayout.addView(relativeLayout);
        TextView textView2 = new TextView(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(9);
        layoutParams4.addRule(10);
        textView2.setBackgroundColor(-13421773);
        textView2.setTextColor(-5592406);
        textView2.setTextSize((float) pixelsByDp(3));
        textView2.setLayoutParams(layoutParams4);
        textView2.setText(this.uniqid);
        relativeLayout.addView(textView2);
        return linearLayout;
    }

    private ImageButton _getButton(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        imageButton.setBackgroundColor(0);
        imageButton.setPadding(pixelsByDp(5), pixelsByDp(5), pixelsByDp(5), pixelsByDp(5));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pixelsByDp(30), pixelsByDp(30), 1.0f);
        layoutParams.gravity = 17;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(drawable);
        if (drawable.equals(Drawables.CLOSE)) {
            imageButton.setVisibility(8);
        }
        return imageButton;
    }

    private int pixelsByDp(int i) {
        return (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
