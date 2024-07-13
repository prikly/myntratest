package com.criteo.publisher.l0.d;

import com.criteo.publisher.n0.q;

/* compiled from: Tcf2GdprStrategy */
class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final q f2615a;

    public f(q qVar) {
        this.f2615a = qVar;
    }

    public String c() {
        return this.f2615a.a("IABTCF_TCString", "");
    }

    public String b() {
        int a2 = this.f2615a.a("IABTCF_gdprApplies", -1);
        return a2 != -1 ? String.valueOf(a2) : "";
    }

    public Integer a() {
        return 2;
    }

    public boolean d() {
        return !b().isEmpty() || !c().isEmpty();
    }
}
