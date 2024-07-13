package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

public class U6 implements ProtobufConverter<D6, C0482jf> {
    /* renamed from: a */
    public C0482jf fromModel(D6 d6) {
        C0482jf jfVar = new C0482jf();
        String a2 = d6.a();
        String str = jfVar.f6073a;
        if (a2 == null) {
            a2 = str;
        }
        jfVar.f6073a = a2;
        String c2 = d6.c();
        String str2 = jfVar.f6074b;
        if (c2 == null) {
            c2 = str2;
        }
        jfVar.f6074b = c2;
        Integer d2 = d6.d();
        Integer valueOf = Integer.valueOf(jfVar.f6075c);
        if (d2 == null) {
            d2 = valueOf;
        }
        jfVar.f6075c = d2.intValue();
        Integer b2 = d6.b();
        Integer valueOf2 = Integer.valueOf(jfVar.f6078f);
        if (b2 == null) {
            b2 = valueOf2;
        }
        jfVar.f6078f = b2.intValue();
        String e2 = d6.e();
        String str3 = jfVar.f6076d;
        if (e2 == null) {
            e2 = str3;
        }
        jfVar.f6076d = e2;
        Boolean f2 = d6.f();
        Boolean valueOf3 = Boolean.valueOf(jfVar.f6077e);
        if (f2 == null) {
            f2 = valueOf3;
        }
        jfVar.f6077e = f2.booleanValue();
        return jfVar;
    }

    public Object toModel(Object obj) {
        C0482jf jfVar = (C0482jf) obj;
        throw new UnsupportedOperationException();
    }
}
