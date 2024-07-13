package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Collections;
import java.util.List;

public class Pa implements Fa<C0304cb> {

    /* renamed from: a  reason: collision with root package name */
    private final Oa f4752a;

    /* renamed from: b  reason: collision with root package name */
    private final Ja f4753b;

    public Pa() {
        this(new Oa(), new Ja());
    }

    public Object fromModel(Object obj) {
        C0304cb cbVar = (C0304cb) obj;
        C0557mf mfVar = new C0557mf();
        mfVar.f6219a = 2;
        mfVar.f6221c = new C0557mf.o();
        Na<C0557mf.n, Vm> a2 = this.f4752a.fromModel(cbVar.f5612c);
        mfVar.f6221c.f6269b = (C0557mf.n) a2.f4599a;
        Na<C0557mf.k, Vm> a3 = this.f4753b.fromModel(cbVar.f5611b);
        mfVar.f6221c.f6268a = (C0557mf.k) a3.f4599a;
        return Collections.singletonList(new Na(mfVar, Um.a(a2, a3)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    Pa(Oa oa, Ja ja) {
        this.f4752a = oa;
        this.f4753b = ja;
    }
}
