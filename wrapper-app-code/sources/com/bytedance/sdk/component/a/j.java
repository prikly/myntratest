package com.bytedance.sdk.component.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.a.k;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Environment */
public class j {

    /* renamed from: a  reason: collision with root package name */
    WebView f18236a;

    /* renamed from: b  reason: collision with root package name */
    a f18237b;

    /* renamed from: c  reason: collision with root package name */
    String f18238c = "IESJSBridge";

    /* renamed from: d  reason: collision with root package name */
    h f18239d;

    /* renamed from: e  reason: collision with root package name */
    Context f18240e;

    /* renamed from: f  reason: collision with root package name */
    boolean f18241f;

    /* renamed from: g  reason: collision with root package name */
    boolean f18242g;

    /* renamed from: h  reason: collision with root package name */
    boolean f18243h;
    m i;
    n j;
    String k = "host";
    final Set<String> l = new LinkedHashSet();
    final Set<String> m = new LinkedHashSet();
    boolean n;
    boolean o;
    k.b p;

    j(WebView webView) {
        this.f18236a = webView;
    }

    j() {
    }

    public j a(a aVar) {
        this.f18237b = aVar;
        return this;
    }

    public j a(String str) {
        this.f18238c = str;
        return this;
    }

    public j a(l lVar) {
        this.f18239d = h.a(lVar);
        return this;
    }

    public j a(boolean z) {
        this.f18241f = z;
        return this;
    }

    public j b(boolean z) {
        this.f18242g = z;
        return this;
    }

    public j a() {
        this.o = true;
        return this;
    }

    public r b() {
        c();
        return new r(this);
    }

    private void c() {
        if ((this.f18236a == null && !this.n && this.f18237b == null) || ((TextUtils.isEmpty(this.f18238c) && this.f18236a != null) || this.f18239d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
