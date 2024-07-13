package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
public class Qd extends Kd {

    /* renamed from: f  reason: collision with root package name */
    private Rd f4825f = new Rd("LOCATION_TRACKING_ENABLED");

    public Qd(Context context, String str) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_serviceproviderspreferences";
    }

    public boolean f() {
        return this.f4434b.getBoolean(this.f4825f.a(), false);
    }

    public void g() {
        a(this.f4825f.a()).b();
    }
}
