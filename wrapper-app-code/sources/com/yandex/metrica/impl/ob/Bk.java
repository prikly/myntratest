package com.yandex.metrica.impl.ob;

class Bk {

    /* renamed from: a  reason: collision with root package name */
    private final Ak f3773a;

    /* renamed from: b  reason: collision with root package name */
    private final Ak f3774b;

    /* renamed from: c  reason: collision with root package name */
    private final Ak f3775c;

    /* renamed from: d  reason: collision with root package name */
    private final Ak f3776d;

    static class a {
        a() {
        }
    }

    Bk(C0876zk zkVar, C0389fl flVar) {
        this(new Ak(zkVar.c(), a(flVar.f5825e)), new Ak(zkVar.b(), a(flVar.f5826f)), new Ak(zkVar.d(), a(flVar.f5828h)), new Ak(zkVar.a(), a(flVar.f5827g)));
    }

    /* access modifiers changed from: package-private */
    public Ak a() {
        return this.f3776d;
    }

    /* access modifiers changed from: package-private */
    public Ak b() {
        return this.f3774b;
    }

    /* access modifiers changed from: package-private */
    public Ak c() {
        return this.f3773a;
    }

    /* access modifiers changed from: package-private */
    public Ak d() {
        return this.f3775c;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    Bk(Ak ak, Ak ak2, Ak ak3, Ak ak4) {
        this.f3773a = ak;
        this.f3774b = ak2;
        this.f3775c = ak3;
        this.f3776d = ak4;
    }
}
