package com.iab.omid.library.amazon.b;

import android.content.Context;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f7556a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f7557b;

    private d() {
    }

    public static d a() {
        return f7556a;
    }

    public void a(Context context) {
        this.f7557b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f7557b;
    }
}
