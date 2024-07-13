package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;

public class Ma implements Converter<C0254ab, Na<C0557mf.m, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Oa f4543a;

    /* renamed from: b  reason: collision with root package name */
    private final C0515kn f4544b;

    /* renamed from: c  reason: collision with root package name */
    private final C0515kn f4545c;

    public Ma() {
        this(new Oa(), new C0515kn(100), new C0515kn(2048));
    }

    /* renamed from: a */
    public Na<C0557mf.m, Vm> fromModel(C0254ab abVar) {
        Na<C0557mf.n, Vm> na;
        C0557mf.m mVar = new C0557mf.m();
        C0416gn<String, Vm> a2 = this.f4544b.a(abVar.f5472a);
        mVar.f6261a = C0267b.b((String) a2.f5887a);
        C0416gn<String, Vm> a3 = this.f4545c.a(abVar.f5473b);
        mVar.f6262b = C0267b.b((String) a3.f5887a);
        C0279bb bbVar = abVar.f5474c;
        if (bbVar != null) {
            na = this.f4543a.fromModel(bbVar);
            mVar.f6263c = (C0557mf.n) na.f4599a;
        } else {
            na = null;
        }
        return new Na<>(mVar, Um.a(a2, a3, na));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Ma(Oa oa, C0515kn knVar, C0515kn knVar2) {
        this.f4543a = oa;
        this.f4544b = knVar;
        this.f4545c = knVar2;
    }
}
