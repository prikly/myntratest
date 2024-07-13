package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
public class Jd extends Kd {
    public static final /* synthetic */ int j = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Rd f4326f = new Rd("init_event_pref_key", c());

    /* renamed from: g  reason: collision with root package name */
    private final Rd f4327g = new Rd("init_event_pref_key");

    /* renamed from: h  reason: collision with root package name */
    private final Rd f4328h = new Rd("first_event_pref_key", c());
    private final Rd i = new Rd("fitst_event_description_key", c());

    public Jd(Context context, String str) {
        super(context, str);
    }

    private void a(Rd rd) {
        this.f4434b.edit().remove(rd.a()).apply();
    }

    @Deprecated
    public String b(String str) {
        return this.f4434b.getString(this.f4327g.a(), (String) null);
    }

    public String c(String str) {
        return this.f4434b.getString(this.f4328h.a(), (String) null);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_initpreferences";
    }

    public String d(String str) {
        return this.f4434b.getString(this.f4326f.a(), (String) null);
    }

    @Deprecated
    public void f() {
        a(this.f4327g);
    }

    public void g() {
        a(this.i);
    }

    public void h() {
        a(this.f4328h);
    }

    public void i() {
        a(this.f4326f);
    }

    public void j() {
        a(this.f4326f.a(), "DONE").b();
    }
}
