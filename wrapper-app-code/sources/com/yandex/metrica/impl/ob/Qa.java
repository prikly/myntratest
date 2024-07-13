package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Collections;
import java.util.List;

public class Qa implements Fa<C0329db> {

    /* renamed from: a  reason: collision with root package name */
    private final Ja f4821a;

    /* renamed from: b  reason: collision with root package name */
    private final Ma f4822b;

    public Qa() {
        this(new Ja(), new Ma());
    }

    public Object fromModel(Object obj) {
        Na<C0557mf.m, Vm> na;
        C0329db dbVar = (C0329db) obj;
        C0557mf mfVar = new C0557mf();
        mfVar.f6219a = 3;
        mfVar.f6222d = new C0557mf.p();
        Na<C0557mf.k, Vm> a2 = this.f4821a.fromModel(dbVar.f5654b);
        mfVar.f6222d.f6270a = (C0557mf.k) a2.f4599a;
        C0254ab abVar = dbVar.f5655c;
        if (abVar != null) {
            na = this.f4822b.fromModel(abVar);
            mfVar.f6222d.f6271b = (C0557mf.m) na.f4599a;
        } else {
            na = null;
        }
        return Collections.singletonList(new Na(mfVar, Um.a(a2, na)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    Qa(Ja ja, Ma ma) {
        this.f4821a = ja;
        this.f4822b = ma;
    }
}
