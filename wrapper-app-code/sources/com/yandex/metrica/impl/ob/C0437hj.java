package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.hj  reason: case insensitive filesystem */
public class C0437hj implements C0287bj {

    /* renamed from: a  reason: collision with root package name */
    private final C0277b9 f5940a;

    public C0437hj(C0277b9 b9Var) {
        this.f5940a = b9Var;
    }

    public String a() {
        W0 u = this.f5940a.u();
        String str = !TextUtils.isEmpty(u.f5240a) ? u.f5240a : null;
        if (str != null) {
            return str;
        }
        String n = this.f5940a.n((String) null);
        return !TextUtils.isEmpty(n) ? n : str;
    }
}
