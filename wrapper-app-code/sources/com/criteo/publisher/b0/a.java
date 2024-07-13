package com.criteo.publisher.b0;

import android.content.ComponentName;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.criteo.publisher.s;

/* compiled from: AdWebViewClient */
public class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final c f2356a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f2357b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2358c = s.c().U0();

    public a(c cVar, ComponentName componentName) {
        this.f2356a = cVar;
        this.f2357b = componentName;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f2358c.a(str, this.f2357b, this.f2356a);
        return true;
    }
}
