package com.bytedance.sdk.component.a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: WebViewBridge */
public class z extends a {
    static final /* synthetic */ boolean j = (!z.class.desiredAssertionStatus());

    /* renamed from: h  reason: collision with root package name */
    protected String f18300h;
    protected WebView i;

    /* access modifiers changed from: protected */
    public Context a(j jVar) {
        if (jVar.f18240e != null) {
            return jVar.f18240e;
        }
        if (jVar.f18236a != null) {
            return jVar.f18236a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* access modifiers changed from: protected */
    public String a() {
        return this.i.getUrl();
    }

    /* access modifiers changed from: protected */
    public void b(j jVar) {
        this.i = jVar.f18236a;
        this.f18300h = jVar.f18238c;
        if (Build.VERSION.SDK_INT >= 17 && !jVar.n) {
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (j || this.i != null) {
            this.i.addJavascriptInterface(this, this.f18300h);
            return;
        }
        throw new AssertionError();
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    public void b() {
        super.b();
        d();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.i.removeJavascriptInterface(this.f18300h);
    }

    /* access modifiers changed from: protected */
    public void a(String str, q qVar) {
        if (qVar == null || TextUtils.isEmpty(qVar.f18252h)) {
            super.a(str, qVar);
            return;
        }
        String str2 = qVar.f18252h;
        a(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(String.format("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        a(str, "javascript:" + this.f18300h + "._handleMessageFromToutiao(" + str + ")");
    }

    private void a(String str, final String str2) {
        if (!this.f18205f && !TextUtils.isEmpty(str2)) {
            AnonymousClass1 r3 = new Runnable() {
                public void run() {
                    if (!z.this.f18205f) {
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                i.a("Invoking Jsb using evaluateJavascript: " + str2);
                                z.this.i.evaluateJavascript(str2, (ValueCallback) null);
                                return;
                            }
                            i.a("Invoking Jsb using loadUrl: " + str2);
                            z.this.i.loadUrl(str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                i.a("Received call on sub-thread, posting to main thread: " + str2);
                this.f18203d.post(r3);
                return;
            }
            r3.run();
        }
    }
}
