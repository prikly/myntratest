package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

public final class Y8 {

    /* renamed from: a  reason: collision with root package name */
    private final C0276b8 f5371a;

    public Y8(C0276b8 b8Var) {
        this.f5371a = b8Var;
    }

    public final int a(int i) {
        JSONObject d2 = this.f5371a.d();
        if (d2 != null) {
            return d2.optInt(String.valueOf(i));
        }
        return 0;
    }

    public final void a(int i, int i2) {
        JSONObject d2 = this.f5371a.d();
        if (d2 == null) {
            d2 = new JSONObject();
        }
        d2.put(String.valueOf(i), i2);
        this.f5371a.a(d2);
    }
}
