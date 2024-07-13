package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.pe  reason: case insensitive filesystem */
public class C0631pe implements Ge {

    /* renamed from: a  reason: collision with root package name */
    private final Dm f6441a;

    public C0631pe() {
        this(new Dm());
    }

    public byte[] a(C0655qe qeVar, Lg lg) {
        String str = qeVar.f6570b;
        return this.f6441a.a(qeVar.r).a(str != null ? C0267b.b(str) : new byte[0]);
    }

    C0631pe(Dm dm) {
        this.f6441a = dm;
    }
}
