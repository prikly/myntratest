package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Collections;
import java.util.List;

public class Ba implements Fa<Ta> {

    /* renamed from: a  reason: collision with root package name */
    private final Ca f3748a;

    public Ba() {
        this(new Ca());
    }

    public Object fromModel(Object obj) {
        Ta ta = (Ta) obj;
        C0557mf mfVar = new C0557mf();
        mfVar.f6223e = new C0557mf.b();
        Na<C0557mf.c, Vm> a2 = this.f3748a.fromModel(ta.f5015c);
        mfVar.f6223e.f6228a = (C0557mf.c) a2.f4599a;
        mfVar.f6219a = ta.f5014b;
        return Collections.singletonList(new Na(mfVar, Um.a(a2)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    Ba(Ca ca) {
        this.f3748a = ca;
    }
}
