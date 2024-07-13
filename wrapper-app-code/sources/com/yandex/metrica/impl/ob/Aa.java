package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;

public class Aa implements Converter<Sa, Na<C0557mf.a, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Ea f3695a;

    /* renamed from: b  reason: collision with root package name */
    private final C0515kn f3696b;

    public Aa() {
        this(new Ea(), new C0515kn(20));
    }

    /* renamed from: a */
    public Na<C0557mf.a, Vm> fromModel(Sa sa) {
        C0557mf.a aVar = new C0557mf.a();
        aVar.f6227b = this.f3695a.fromModel(sa.f4922a);
        C0416gn<String, Vm> a2 = this.f3696b.a(sa.f4923b);
        aVar.f6226a = C0267b.b((String) a2.f5887a);
        return new Na<>(aVar, Um.a(a2));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Aa(Ea ea, C0515kn knVar) {
        this.f3695a = ea;
        this.f3696b = knVar;
    }
}
