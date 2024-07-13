package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ej  reason: case insensitive filesystem */
public class C0362ej {

    /* renamed from: b  reason: collision with root package name */
    private static volatile C0362ej f5764b;

    /* renamed from: a  reason: collision with root package name */
    private final C0710sm f5765a;

    C0362ej(C0710sm smVar) {
        this.f5765a = smVar;
    }

    public static C0362ej a(Context context) {
        if (f5764b == null) {
            synchronized (C0362ej.class) {
                if (f5764b == null) {
                    f5764b = new C0362ej(new C0710sm(context, "uuid.dat"));
                }
            }
        }
        return f5764b;
    }

    public C0337dj b(Context context, C0287bj bjVar) {
        return new C0337dj(bjVar, new C0262aj(), this.f5765a, new C0387fj(context, new B0(), new C0489jm()));
    }

    public C0337dj a(Context context, C0287bj bjVar) {
        return new C0337dj(bjVar, new C0412gj(context, new B0()), this.f5765a, new C0387fj(context, new B0(), new C0489jm()));
    }
}
