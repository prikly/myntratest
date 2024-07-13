package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0823xf;

/* renamed from: com.yandex.metrica.impl.ob.a3  reason: case insensitive filesystem */
class C0246a3 implements ProtobufConverter<a, C0823xf.a> {
    C0246a3() {
    }

    /* renamed from: a */
    public C0823xf.a fromModel(a aVar) {
        C0823xf.a aVar2 = new C0823xf.a();
        int ordinal = aVar.f3544a.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        }
        aVar2.f7109a = i;
        aVar2.f7110b = aVar.f3545b;
        aVar2.f7111c = aVar.f3546c;
        aVar2.f7112d = aVar.f3547d;
        aVar2.f7113e = aVar.f3548e;
        return aVar2;
    }

    /* renamed from: a */
    public a toModel(C0823xf.a aVar) {
        e eVar;
        int i = aVar.f7109a;
        if (i == 2) {
            eVar = e.INAPP;
        } else if (i != 3) {
            eVar = e.UNKNOWN;
        } else {
            eVar = e.SUBS;
        }
        return new a(eVar, aVar.f7110b, aVar.f7111c, aVar.f7112d, aVar.f7113e);
    }
}
