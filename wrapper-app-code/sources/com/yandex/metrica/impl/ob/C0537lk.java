package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.lk  reason: case insensitive filesystem */
class C0537lk {

    /* renamed from: a  reason: collision with root package name */
    private final C0277b9 f6160a;

    /* renamed from: b  reason: collision with root package name */
    private long f6161b;

    C0537lk(C0277b9 b9Var) {
        this.f6160a = b9Var;
        this.f6161b = b9Var.c(-1);
    }

    /* access modifiers changed from: package-private */
    public long a() {
        C0277b9 b9Var = this.f6160a;
        long j = this.f6161b + 1;
        this.f6161b = j;
        b9Var.f(j);
        return this.f6161b;
    }
}
