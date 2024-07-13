package com.criteo.publisher.model;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.n0.h;
import com.criteo.publisher.n0.o;
import com.criteo.publisher.x;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DeviceInfo */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2852a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2853b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h<String> f2854c = new h<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f2855d = new AtomicBoolean(false);

    public u(Context context, c cVar) {
        com.criteo.publisher.logging.h.b(getClass());
        this.f2852a = context;
        this.f2853b = cVar;
    }

    /* compiled from: DeviceInfo */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (u.this.f2855d.compareAndSet(false, true)) {
                u.this.f2854c.a(u.this.e());
            }
        }
    }

    public void d() {
        a((Runnable) new a());
    }

    public Future<String> b() {
        d();
        return this.f2854c;
    }

    /* compiled from: DeviceInfo */
    class b extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f2857c;

        b(u uVar, Runnable runnable) {
            this.f2857c = runnable;
        }

        public void a() {
            this.f2857c.run();
        }
    }

    private void a(Runnable runnable) {
        this.f2853b.a(new b(this, runnable));
    }

    /* access modifiers changed from: package-private */
    public String e() {
        String str;
        try {
            str = c();
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? a() : str;
    }

    private String c() {
        WebView webView = new WebView(this.f2852a);
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        return userAgentString;
    }

    private String a() {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Throwable th) {
            o.a(th);
            str = null;
        }
        return str != null ? str : "";
    }
}
