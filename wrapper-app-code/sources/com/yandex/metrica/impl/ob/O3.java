package com.yandex.metrica.impl.ob;

public class O3 {

    /* renamed from: a  reason: collision with root package name */
    private final Y8 f4637a;

    /* renamed from: b  reason: collision with root package name */
    private final C0276b8 f4638b;

    public O3(C0276b8 b8Var) {
        this(b8Var, new Y8(b8Var));
    }

    public int a() {
        int b2 = this.f4638b.b();
        this.f4638b.a(b2 + 1);
        return b2;
    }

    O3(C0276b8 b8Var, Y8 y8) {
        this.f4638b = b8Var;
        this.f4637a = y8;
    }

    public int a(int i) {
        int a2 = this.f4637a.a(i);
        this.f4637a.a(i, a2 + 1);
        return a2;
    }
}
