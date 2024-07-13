package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.i7  reason: case insensitive filesystem */
public final class C0450i7 implements C0589nm<File, String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0300c7 f5972a;

    /* renamed from: b  reason: collision with root package name */
    private final C0425h7 f5973b;

    public C0450i7(C0300c7 c7Var, C0425h7 h7Var) {
        this.f5972a = c7Var;
        this.f5973b = h7Var;
    }

    public Object a(Object obj) {
        return this.f5973b.a((File) obj, this.f5972a);
    }
}
