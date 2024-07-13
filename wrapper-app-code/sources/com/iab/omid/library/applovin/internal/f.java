package com.iab.omid.library.applovin.internal;

import android.content.Context;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static f f7676b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f7677a;

    private f() {
    }

    public static f b() {
        return f7676b;
    }

    public Context a() {
        return this.f7677a;
    }

    public void a(Context context) {
        this.f7677a = context != null ? context.getApplicationContext() : null;
    }
}
