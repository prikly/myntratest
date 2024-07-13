package com.appsgeyser.sdk.ads;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.utils.BannerUtils;

class AdsBannerWebViewClient extends WebViewClient {
    private OnPageFinishedListener onPageFinishedListener;
    private OnPageStartedListener onPageStartedListener;

    interface OnPageFinishedListener {
        void loadFinished(WebView webView, String str);
    }

    interface OnPageStartedListener {
        boolean loadStarted(WebView webView, String str, Bitmap bitmap);
    }

    AdsBannerWebViewClient() {
    }

    /* access modifiers changed from: package-private */
    public void setOnPageFinishedListener(OnPageFinishedListener onPageFinishedListener2) {
        this.onPageFinishedListener = onPageFinishedListener2;
    }

    /* access modifiers changed from: package-private */
    public void setOnPageStartedListener(OnPageStartedListener onPageStartedListener2) {
        this.onPageStartedListener = onPageStartedListener2;
    }

    public void onReceivedError(final WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        webView.post(new Runnable() {
            public void run() {
                webView.setVisibility(8);
            }
        });
    }

    public void onPageFinished(WebView webView, String str) {
        OnPageFinishedListener onPageFinishedListener2 = this.onPageFinishedListener;
        if (onPageFinishedListener2 != null) {
            onPageFinishedListener2.loadFinished(webView, str);
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!BannerUtils.isDataTextHtmlUrl(str)) {
            OnPageStartedListener onPageStartedListener2 = this.onPageStartedListener;
            if (onPageStartedListener2 == null || onPageStartedListener2.loadStarted(webView, str, bitmap)) {
                super.onPageStarted(webView, str, bitmap);
                return;
            }
            return;
        }
        this.onPageStartedListener.loadStarted(webView, (String) null, bitmap);
        StatController.getInstance().sendRequestAsyncByKey("click_data_text_html_loaded_in_banner");
    }
}
