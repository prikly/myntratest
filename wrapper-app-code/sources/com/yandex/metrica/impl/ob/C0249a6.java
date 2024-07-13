package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.a6  reason: case insensitive filesystem */
public class C0249a6 {

    /* renamed from: a  reason: collision with root package name */
    private final C0276b8 f5465a;

    public C0249a6(C0276b8 b8Var) {
        this.f5465a = b8Var;
    }

    public long a() {
        long h2 = this.f5465a.h();
        long j = 10000000000L;
        if (h2 >= 10000000000L) {
            j = 1 + h2;
        }
        this.f5465a.a(j);
        return j;
    }
}
