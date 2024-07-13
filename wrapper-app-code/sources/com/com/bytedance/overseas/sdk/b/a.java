package com.com.bytedance.overseas.sdk.b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: AdvertisingIdHelper */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f2272c;

    /* renamed from: a  reason: collision with root package name */
    private String f2273a = "";

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f2274b = Executors.newSingleThreadExecutor();

    public static a a() {
        if (f2272c == null) {
            synchronized (a.class) {
                if (f2272c == null) {
                    f2272c = new a();
                }
            }
        }
        return f2272c;
    }

    private a() {
    }

    public String b() {
        if (!m.h().p("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f2273a)) {
            return this.f2273a;
        }
        String b2 = c.a(m.a()).b("gaid", "");
        this.f2273a = b2;
        return b2;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            c.a(m.a()).a("gaid", str);
        }
    }

    public void b(String str) {
        this.f2273a = str;
    }
}
