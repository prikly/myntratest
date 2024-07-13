package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.je  reason: case insensitive filesystem */
public class C0481je implements Ge {

    /* renamed from: a  reason: collision with root package name */
    private final Dm f6071a;

    public C0481je() {
        this(new Dm());
    }

    C0481je(Dm dm) {
        this.f6071a = dm;
    }

    public byte[] a(C0655qe qeVar, Lg lg) {
        byte[] bArr = new byte[0];
        String str = qeVar.f6570b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f6071a.a(qeVar.r).a(bArr);
    }
}
