package com.bytedance.sdk.openadsdk.core.widget.a;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* compiled from: SSWebSettings */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f1786a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1787b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1788c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1789d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1790e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1791f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1792g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1793h = true;

    public static b a(Context context) {
        return new b(context);
    }

    private b(Context context) {
        this.f1786a = new WeakReference<>(context);
    }

    public b a(boolean z) {
        this.f1793h = z;
        return this;
    }

    public b b(boolean z) {
        this.f1788c = z;
        return this;
    }

    public void a(WebView webView) {
        if (webView != null && this.f1786a.get() != null) {
            b(webView);
            WebSettings settings = webView.getSettings();
            a(settings);
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    if (this.f1788c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f1789d);
                settings.setDomStorageEnabled(this.f1790e);
                settings.setAllowFileAccess(this.f1791f);
                settings.setBlockNetworkImage(true ^ this.f1792g);
                settings.setSavePassword(false);
                try {
                    if (Build.VERSION.SDK_INT >= 11 && !this.f1793h) {
                        webView.setLayerType(0, (Paint) null);
                    } else if (Build.VERSION.SDK_INT >= 16 && this.f1793h) {
                        webView.setLayerType(2, (Paint) null);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    private void b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            l.b(th.toString());
        }
    }

    private void a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            l.b(th.toString());
        }
    }
}
