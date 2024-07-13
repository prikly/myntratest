package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.zb  reason: case insensitive filesystem */
public class C0867zb {

    /* renamed from: a  reason: collision with root package name */
    private final C0747ub f7221a;

    /* renamed from: b  reason: collision with root package name */
    private final C0747ub f7222b;

    /* renamed from: c  reason: collision with root package name */
    private final C0747ub f7223c;

    public C0867zb() {
        this(new C0747ub(), new C0747ub(), new C0747ub());
    }

    public C0747ub a() {
        return this.f7221a;
    }

    public C0747ub b() {
        return this.f7222b;
    }

    public C0747ub c() {
        return this.f7223c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f7221a + ", mHuawei=" + this.f7222b + ", yandex=" + this.f7223c + '}';
    }

    public C0867zb(C0747ub ubVar, C0747ub ubVar2, C0747ub ubVar3) {
        this.f7221a = ubVar;
        this.f7222b = ubVar2;
        this.f7223c = ubVar3;
    }
}
