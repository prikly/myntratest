package com.criteo.publisher.l0.d;

import com.criteo.publisher.n0.q;

/* compiled from: Tcf1GdprStrategy */
class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final q f2614a;

    public e(q qVar) {
        this.f2614a = qVar;
    }

    public String c() {
        return this.f2614a.a("IABConsent_ConsentString", "");
    }

    public String b() {
        return this.f2614a.a("IABConsent_SubjectToGDPR", "");
    }

    public Integer a() {
        return 1;
    }

    public boolean d() {
        return !b().isEmpty() || !c().isEmpty();
    }
}
