package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;

/* renamed from: com.yandex.metrica.impl.ob.tk  reason: case insensitive filesystem */
public class C0732tk implements Cl {

    /* renamed from: a  reason: collision with root package name */
    private final String f6848a;

    C0732tk(String str) {
        this.f6848a = str;
    }

    public boolean a(Object obj) {
        return ((String) obj).equals(this.f6848a);
    }

    public C0685rl.b a() {
        return C0685rl.b.EQUALS;
    }
}
