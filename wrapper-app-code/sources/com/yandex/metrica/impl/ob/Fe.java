package com.yandex.metrica.impl.ob;

public class Fe implements Ge {

    /* renamed from: a  reason: collision with root package name */
    private final Dm f4005a;

    public Fe() {
        this(new Dm());
    }

    Fe(Dm dm) {
        this.f4005a = dm;
    }

    public byte[] a(C0655qe qeVar, Lg lg) {
        byte[] bArr = new byte[0];
        try {
            bArr = L0.a(qeVar.f6570b);
        } catch (Throwable unused) {
        }
        byte[] a2 = this.f4005a.a(qeVar.r).a(bArr);
        return a2 == null ? new byte[0] : a2;
    }
}
