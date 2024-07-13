package com.iab.omid.library.appodeal.b;

import android.content.Context;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f7777a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f7778b;

    private d() {
    }

    public static d a() {
        return f7777a;
    }

    public void a(Context context) {
        this.f7778b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f7778b;
    }
}
