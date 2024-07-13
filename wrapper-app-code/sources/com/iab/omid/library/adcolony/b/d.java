package com.iab.omid.library.adcolony.b;

import android.content.Context;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f7449a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f7450b;

    private d() {
    }

    public static d a() {
        return f7449a;
    }

    public void a(Context context) {
        this.f7450b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f7450b;
    }
}
