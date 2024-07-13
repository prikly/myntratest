package com.iab.omid.library.ironsrc.b;

import android.content.Context;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f7885a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f7886b;

    private d() {
    }

    public static d a() {
        return f7885a;
    }

    public void a(Context context) {
        this.f7886b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f7886b;
    }
}
