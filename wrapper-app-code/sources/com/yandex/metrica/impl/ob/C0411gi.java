package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.gi  reason: case insensitive filesystem */
public enum C0411gi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);
    

    /* renamed from: a  reason: collision with root package name */
    private int f5878a;

    private C0411gi(int i) {
        this.f5878a = i;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f5878a);
        return bundle;
    }
}
