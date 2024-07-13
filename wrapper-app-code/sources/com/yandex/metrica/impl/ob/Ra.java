package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Collections;
import java.util.List;

public class Ra implements Fa<C0354eb> {

    /* renamed from: a  reason: collision with root package name */
    private final Oa f4859a;

    public Ra() {
        this(new Oa());
    }

    public Object fromModel(Object obj) {
        C0557mf mfVar = new C0557mf();
        mfVar.f6219a = 1;
        mfVar.f6220b = new C0557mf.q();
        Na<C0557mf.n, Vm> a2 = this.f4859a.fromModel(((C0354eb) obj).f5730b);
        mfVar.f6220b.f6272a = (C0557mf.n) a2.f4599a;
        return Collections.singletonList(new Na(mfVar, Um.a(a2)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    Ra(Oa oa) {
        this.f4859a = oa;
    }
}
