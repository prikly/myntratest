package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;

/* renamed from: com.yandex.metrica.impl.ob.jk  reason: case insensitive filesystem */
class C0487jk implements Cl {

    /* renamed from: a  reason: collision with root package name */
    private final String f6079a;

    C0487jk(String str) {
        this.f6079a = str;
    }

    public boolean a(Object obj) {
        return ((String) obj).contains(this.f6079a);
    }

    public C0685rl.b a() {
        return C0685rl.b.CONTAINS;
    }
}
