package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;

public class Zk implements Cl {

    /* renamed from: a  reason: collision with root package name */
    private final int f5429a;

    public Zk(int i) {
        this.f5429a = i;
    }

    public boolean a(Object obj) {
        return ((String) obj).length() > this.f5429a;
    }

    public C0685rl.b a() {
        return C0685rl.b.TEXT_TOO_LONG;
    }
}
