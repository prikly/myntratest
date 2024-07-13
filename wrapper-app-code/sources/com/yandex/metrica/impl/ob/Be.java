package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;

public class Be implements Ge, C0606oe {
    public int a(Em em) {
        return 2;
    }

    public byte[] a(C0655qe qeVar, Lg lg) {
        if (TextUtils.isEmpty(qeVar.f6570b)) {
            return new byte[0];
        }
        return Base64.decode(qeVar.f6570b, 0);
    }
}
