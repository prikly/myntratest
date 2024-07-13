package com.bytedance.sdk.component.adexpress.d;

import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.a.z;
import com.bytedance.sdk.component.adexpress.a.a.a;
import com.bytedance.sdk.component.adexpress.a.a.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewPool */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f18430d = new byte[0];

    /* renamed from: e  reason: collision with root package name */
    private static int f18431e = 10;

    /* renamed from: g  reason: collision with root package name */
    private static volatile e f18432g;

    /* renamed from: a  reason: collision with root package name */
    private List<SSWebView> f18433a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, c> f18434b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, d> f18435c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f18436f = new AtomicBoolean(false);

    private e() {
        c c2 = a.a().c();
        if (c2 != null) {
            f18431e = c2.j();
        }
    }

    public static e a() {
        if (f18432g == null) {
            synchronized (e.class) {
                if (f18432g == null) {
                    f18432g = new e();
                }
            }
        }
        return f18432g;
    }

    public SSWebView b() {
        SSWebView remove;
        if (d() <= 0 || (remove = this.f18433a.remove(0)) == null) {
            return null;
        }
        l.b("WebViewPool", "get WebView from pool; current available count: " + d());
        return remove;
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            e(sSWebView);
            sSWebView.b("SDK_INJECT_GLOBAL");
            d(sSWebView);
            b(sSWebView);
        }
    }

    public void b(SSWebView sSWebView) {
        if (sSWebView != null) {
            if (this.f18433a.size() >= f18431e) {
                l.b("WebViewPool", "WebView pool is full，destroy webview");
                sSWebView.l();
            } else if (!this.f18433a.contains(sSWebView)) {
                this.f18433a.add(sSWebView);
                l.b("WebViewPool", "recycle WebView，current available count: " + d());
            }
        }
    }

    public boolean c(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        l.b("WebViewPool", "WebView render fail and abandon");
        sSWebView.l();
        return true;
    }

    public void c() {
        for (SSWebView next : this.f18433a) {
            if (next != null) {
                next.l();
            }
        }
        this.f18433a.clear();
    }

    public int d() {
        return this.f18433a.size();
    }

    public int e() {
        return this.f18433a.size();
    }

    private void e(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.c();
        sSWebView.setWebChromeClient((WebChromeClient) null);
        sSWebView.setWebViewClient((WebViewClient) null);
        sSWebView.setDownloadListener((DownloadListener) null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setUserAgentString("android_client");
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    public void a(SSWebView sSWebView, b bVar) {
        if (sSWebView != null && bVar != null) {
            c cVar = this.f18434b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.a(bVar);
            } else {
                cVar = new c(bVar);
                this.f18434b.put(Integer.valueOf(sSWebView.hashCode()), cVar);
            }
            sSWebView.a((Object) cVar, "SDK_INJECT_GLOBAL");
        }
    }

    public void d(SSWebView sSWebView) {
        if (sSWebView != null) {
            c cVar = this.f18434b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.a((b) null);
            }
            sSWebView.b("SDK_INJECT_GLOBAL");
        }
    }

    public void a(WebView webView, z zVar, String str) {
        if (webView != null && zVar != null && !TextUtils.isEmpty(str)) {
            d dVar = this.f18435c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.a(zVar);
            } else {
                dVar = new d(zVar);
                this.f18435c.put(Integer.valueOf(webView.hashCode()), dVar);
            }
            webView.addJavascriptInterface(dVar, str);
        }
    }

    public void a(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            d dVar = this.f18435c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.a((z) null);
            }
            webView.removeJavascriptInterface(str);
        }
    }
}
