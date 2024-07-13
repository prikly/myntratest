package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

public class Fn implements Kn<String> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4017a;

    public Fn(String str) {
        this.f4017a = str;
    }

    public In a(Object obj) {
        if (!TextUtils.isEmpty((String) obj)) {
            return In.a(this);
        }
        return In.a(this, this.f4017a + " is empty.");
    }
}
