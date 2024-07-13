package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.h1  reason: case insensitive filesystem */
public class C0419h1 {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f5891a;

    public C0419h1() {
        this(C0609oh.a());
    }

    public void a(Map<String, Object> map) {
        this.f5891a.reportEvent("login_sdk", map);
    }

    C0419h1(M0 m0) {
        this.f5891a = m0;
    }
}
