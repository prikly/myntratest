package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0775vf;

public abstract class Se implements Ie, C0283bf {

    /* renamed from: a  reason: collision with root package name */
    private final String f4937a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4938b;

    /* renamed from: c  reason: collision with root package name */
    private final Kn<String> f4939c;

    /* renamed from: d  reason: collision with root package name */
    private final Ke f4940d;

    /* renamed from: e  reason: collision with root package name */
    private C0315cm f4941e = Ul.a();

    Se(int i, String str, Kn<String> kn, Ke ke) {
        this.f4938b = i;
        this.f4937a = str;
        this.f4939c = kn;
        this.f4940d = ke;
    }

    public final C0775vf.a a() {
        C0775vf.a aVar = new C0775vf.a();
        aVar.f6992b = this.f4938b;
        aVar.f6991a = this.f4937a.getBytes();
        aVar.f6994d = new C0775vf.c();
        aVar.f6993c = new C0775vf.b();
        return aVar;
    }

    public Ke b() {
        return this.f4940d;
    }

    public String c() {
        return this.f4937a;
    }

    public int d() {
        return this.f4938b;
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        In a2 = this.f4939c.a(this.f4937a);
        if (a2.b()) {
            return true;
        }
        if (!this.f4941e.isEnabled()) {
            return false;
        }
        C0315cm cmVar = this.f4941e;
        cmVar.w("Attribute " + this.f4937a + " of type " + Ze.a(this.f4938b) + " is skipped because " + a2.a());
        return false;
    }

    public void a(C0315cm cmVar) {
        this.f4941e = cmVar;
    }
}
