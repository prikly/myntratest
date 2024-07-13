package com.apm.insight.b;

import android.content.Context;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f10473a;

    /* renamed from: c  reason: collision with root package name */
    private static h f10474c;

    /* renamed from: b  reason: collision with root package name */
    private final b f10475b;

    private g(Context context) {
        this.f10475b = new b(context);
        h hVar = new h(0);
        f10474c = hVar;
        hVar.b();
    }

    public static g a(Context context) {
        if (f10473a == null) {
            synchronized (g.class) {
                if (f10473a == null) {
                    f10473a = new g(context);
                }
            }
        }
        return f10473a;
    }

    public static h b() {
        return f10474c;
    }

    public b a() {
        return this.f10475b;
    }

    public void c() {
        this.f10475b.a();
    }

    public void d() {
        this.f10475b.b();
    }
}
