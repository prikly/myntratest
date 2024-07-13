package com.yandex.metrica.impl.ob;

import android.content.Context;

public class A0 {

    /* renamed from: a  reason: collision with root package name */
    private final C0738u2 f3675a;

    /* renamed from: b  reason: collision with root package name */
    private final F f3676b;

    public A0(Context context) {
        this(new C0738u2(context, "com.yandex.android.appmetrica.build_id"), new F(context, "com.yandex.android.appmetrica.is_offline"));
    }

    public String a() {
        return (String) this.f3675a.a();
    }

    public Boolean b() {
        return (Boolean) this.f3676b.a();
    }

    A0(C0738u2 u2Var, F f2) {
        this.f3675a = u2Var;
        this.f3676b = f2;
    }
}
