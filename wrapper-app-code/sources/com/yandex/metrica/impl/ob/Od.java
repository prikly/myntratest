package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
public class Od extends Kd {

    /* renamed from: g  reason: collision with root package name */
    private static final Rd f4652g = new Rd("PREF_KEY_OFFSET", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private Rd f4653f = new Rd(f4652g.b(), (String) null);

    public Od(Context context, String str) {
        super(context, str);
    }

    public long a(int i) {
        return this.f4434b.getLong(this.f4653f.a(), (long) i);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_servertimeoffset";
    }

    public void f() {
        a(this.f4653f.a()).b();
    }
}
