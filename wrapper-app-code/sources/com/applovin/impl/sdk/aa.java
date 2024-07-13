package com.applovin.impl.sdk;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.utils.h;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class aa {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static WebView f15225a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static String f15226b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15227c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f15228d = new AtomicBoolean();

    static {
        if (b()) {
            f15226b = (String) e.b(d.D, "", n.Q());
            return;
        }
        f15226b = "";
        e.a(d.D, null, n.Q());
        e.a(d.E, null, n.Q());
    }

    public static String a() {
        String str;
        synchronized (f15227c) {
            str = f15226b;
        }
        return str;
    }

    public static void a(n nVar) {
    }

    public static void b(final n nVar) {
        if (!b() && !f15228d.getAndSet(true)) {
            AppLovinSdkUtils.runOnUiThread(h.b() ? new Runnable() {
                public void run() {
                    try {
                        synchronized (aa.f15227c) {
                            String unused = aa.f15226b = WebSettings.getDefaultUserAgent(n.Q());
                            e.a(d.D, aa.f15226b, n.Q());
                            e.a(d.E, Build.VERSION.RELEASE, n.Q());
                        }
                    } catch (Throwable th) {
                        n.this.D();
                        if (v.a()) {
                            n.this.D().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            } : new Runnable() {
                public void run() {
                    try {
                        aa.a(n.this);
                        synchronized (aa.f15227c) {
                            String unused = aa.f15226b = aa.f15225a.getSettings().getUserAgentString();
                            e.a(d.D, aa.f15226b, n.Q());
                            e.a(d.E, Build.VERSION.RELEASE, n.Q());
                        }
                    } catch (Throwable th) {
                        n.this.D();
                        if (v.a()) {
                            n.this.D().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }

    public static boolean b() {
        boolean equals;
        synchronized (f15227c) {
            equals = Build.VERSION.RELEASE.equals((String) e.b(d.E, "", n.Q()));
        }
        return equals;
    }
}
