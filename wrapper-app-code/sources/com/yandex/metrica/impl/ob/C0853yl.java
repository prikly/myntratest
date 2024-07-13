package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.yl  reason: case insensitive filesystem */
public class C0853yl {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f7180a;

    /* renamed from: b  reason: collision with root package name */
    private final C0805wl f7181b;

    /* renamed from: com.yandex.metrica.impl.ob.yl$a */
    static class a {
        a() {
        }
    }

    C0853yl(C0805wl wlVar, M0 m0) {
        this.f7181b = wlVar;
        this.f7180a = m0;
    }

    public void a(String str, Throwable th) {
        if (this.f7181b.f7070f) {
            this.f7180a.reportError(str, th);
        }
    }
}
