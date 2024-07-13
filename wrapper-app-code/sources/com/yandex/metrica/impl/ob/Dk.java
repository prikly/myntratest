package com.yandex.metrica.impl.ob;

class Dk implements Yk {

    /* renamed from: a  reason: collision with root package name */
    private final C0587nk f3889a;

    Dk() {
        this(new C0587nk());
    }

    public boolean a(String str, C0805wl wlVar) {
        if (!wlVar.f7071g) {
            return !A2.a((Object) "allow-parsing", (Object) str);
        }
        this.f3889a.getClass();
        return A2.a((Object) "do-not-parse", (Object) str);
    }

    Dk(C0587nk nkVar) {
        this.f3889a = nkVar;
    }
}
