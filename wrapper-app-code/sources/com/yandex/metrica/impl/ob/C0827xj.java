package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0755uj;

/* renamed from: com.yandex.metrica.impl.ob.xj  reason: case insensitive filesystem */
public class C0827xj {
    private boolean a(Integer num) {
        return (num == null || num.intValue() == Integer.MAX_VALUE) ? false : true;
    }

    public C0755uj a(C0755uj ujVar) {
        C0755uj.a aVar = new C0755uj.a();
        aVar.a(ujVar.c());
        if (a(ujVar.p())) {
            aVar.l(ujVar.p());
        }
        if (a(ujVar.k())) {
            aVar.i(ujVar.k());
        }
        if (a(ujVar.l())) {
            aVar.j(ujVar.l());
        }
        if (a(ujVar.e())) {
            aVar.c(ujVar.e());
        }
        if (a(ujVar.b())) {
            aVar.b(ujVar.b());
        }
        if (!TextUtils.isEmpty(ujVar.n())) {
            aVar.b(ujVar.n());
        }
        if (!TextUtils.isEmpty(ujVar.m())) {
            aVar.a(ujVar.m());
        }
        aVar.a(ujVar.q());
        if (a(ujVar.o())) {
            aVar.k(ujVar.o());
        }
        aVar.a(ujVar.d());
        if (a(ujVar.h())) {
            aVar.f(ujVar.h());
        }
        if (a(ujVar.j())) {
            aVar.h(ujVar.j());
        }
        if (a(ujVar.a())) {
            aVar.a(ujVar.a());
        }
        if (a(ujVar.i())) {
            aVar.g(ujVar.i());
        }
        if (a(ujVar.f())) {
            aVar.d(ujVar.f());
        }
        if (a(ujVar.g())) {
            aVar.e(ujVar.g());
        }
        return new C0755uj(aVar);
    }
}
