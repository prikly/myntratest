package com.criteo.publisher.m0;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.criteo.publisher.model.t;
import com.criteo.publisher.x;
import java.lang.ref.Reference;

/* compiled from: CriteoBannerLoadTask */
public class b extends x {

    /* renamed from: c  reason: collision with root package name */
    private final Reference<? extends WebView> f2691c;

    /* renamed from: d  reason: collision with root package name */
    private final t f2692d;

    /* renamed from: e  reason: collision with root package name */
    private final WebViewClient f2693e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2694f;

    public b(Reference<? extends WebView> reference, WebViewClient webViewClient, t tVar, String str) {
        this.f2691c = reference;
        this.f2693e = webViewClient;
        this.f2692d = tVar;
        this.f2694f = str;
    }

    public void a() {
        c();
    }

    private void c() {
        WebView webView = (WebView) this.f2691c.get();
        if (webView != null) {
            String b2 = b();
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(this.f2693e);
            webView.loadDataWithBaseURL("", b2, "text/html", "UTF-8", "");
        }
    }

    private String b() {
        return this.f2692d.c().replace(this.f2692d.d(), this.f2694f);
    }
}
