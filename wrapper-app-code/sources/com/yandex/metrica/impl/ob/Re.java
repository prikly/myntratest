package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0775vf;

public class Re implements Je {

    /* renamed from: a  reason: collision with root package name */
    private final Wm f4870a;

    public Re(Wm wm) {
        this.f4870a = wm;
    }

    public C0775vf.a a(C0258af afVar, C0775vf.a aVar) {
        if (afVar.a() == this.f4870a.a()) {
            if (afVar.a(aVar.f6992b, new String(aVar.f6991a)) != null) {
                afVar.a(aVar);
            }
        } else if (afVar.a() < this.f4870a.a()) {
            afVar.a(aVar);
            afVar.b();
        }
        return aVar;
    }
}
