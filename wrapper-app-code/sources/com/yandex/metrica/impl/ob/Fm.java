package com.yandex.metrica.impl.ob;

import android.util.Base64;

public class Fm implements Cm {
    public Bm a(C0293c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    public byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
