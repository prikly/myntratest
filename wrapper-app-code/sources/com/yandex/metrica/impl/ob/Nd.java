package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
public class Nd extends Kd {

    /* renamed from: h  reason: collision with root package name */
    private static final Rd f4606h = new Rd("SERVICE_API_LEVEL", (String) null);
    private static final Rd i = new Rd("CLIENT_API_LEVEL", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private Rd f4607f = new Rd(f4606h.b());

    /* renamed from: g  reason: collision with root package name */
    private Rd f4608g = new Rd(i.b());

    public Nd(Context context) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_migrationpreferences";
    }

    public int f() {
        return this.f4434b.getInt(this.f4607f.a(), -1);
    }

    public Nd g() {
        a(this.f4608g.a());
        return this;
    }

    @Deprecated
    public Nd h() {
        a(this.f4607f.a());
        return this;
    }
}
