package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrandBannerWebViewPool */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static int f1440b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f1441c;

    /* renamed from: a  reason: collision with root package name */
    private final List<SSWebView> f1442a = new ArrayList();

    public static c a() {
        if (f1441c == null) {
            synchronized (c.class) {
                if (f1441c == null) {
                    f1441c = new c();
                }
            }
        }
        return f1441c;
    }

    public SSWebView b() {
        SSWebView remove;
        if (c() > 0 && (remove = this.f1442a.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            b(sSWebView);
        }
    }

    public void b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.f1442a.size() >= f1440b) {
            sSWebView.l();
        } else if (!this.f1442a.contains(sSWebView)) {
            c(sSWebView);
            this.f1442a.add(sSWebView);
        }
    }

    public int c() {
        return this.f1442a.size();
    }

    public void c(SSWebView sSWebView) {
        if (sSWebView != null && sSWebView.getWebView() != null) {
            if (sSWebView.getParent() != null) {
                ((ViewGroup) sSWebView.getParent()).removeView(sSWebView);
            }
            try {
                sSWebView.removeAllViews();
                sSWebView.c();
                sSWebView.setWebChromeClient((WebChromeClient) null);
                sSWebView.setWebViewClient((WebViewClient) null);
                sSWebView.setDownloadListener((DownloadListener) null);
                sSWebView.setDefaultTextEncodingName("UTF-8");
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setSupportZoom(false);
                sSWebView.getWebView().setLayerType(0, (Paint) null);
                sSWebView.setBackgroundColor(0);
                sSWebView.getWebView().setHorizontalScrollBarEnabled(false);
                sSWebView.getWebView().setHorizontalScrollbarOverlay(false);
                sSWebView.getWebView().setVerticalScrollBarEnabled(false);
                sSWebView.getWebView().setVerticalScrollbarOverlay(false);
                sSWebView.a(true);
                sSWebView.j();
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
            } catch (Exception unused) {
            }
        }
    }
}
