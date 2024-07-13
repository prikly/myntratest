package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.za  reason: case insensitive filesystem */
public class C0866za {

    /* renamed from: a  reason: collision with root package name */
    private final C0722ta<Ud> f7219a;

    /* renamed from: b  reason: collision with root package name */
    private final C0722ta<C0763v3> f7220b;

    public C0866za(Context context) {
        this(context, new C0746ua());
    }

    public void a(C0635pi piVar) {
        this.f7219a.a(F0.g().k().a(), piVar.l());
        this.f7220b.a(F0.g().d().a(), piVar.l());
    }

    C0866za(Context context, C0746ua uaVar) {
        this.f7219a = uaVar.c(context, C0390fm.c());
        this.f7220b = uaVar.b(context, C0390fm.c());
    }
}
