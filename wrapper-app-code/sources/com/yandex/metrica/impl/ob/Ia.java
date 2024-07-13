package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Collection;
import java.util.List;

public class Ia implements Converter<Xa, Na<C0557mf.j, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Aa f4133a;

    /* renamed from: b  reason: collision with root package name */
    private final C0379fb f4134b;

    public Ia() {
        this(new Aa(), new C0379fb(30));
    }

    /* renamed from: a */
    public Na<C0557mf.j, Vm> fromModel(Xa xa) {
        int i;
        C0557mf.j jVar = new C0557mf.j();
        Na<C0557mf.a, Vm> a2 = this.f4133a.fromModel(xa.f5330a);
        jVar.f6250a = (C0557mf.a) a2.f4599a;
        C0416gn<List<T>, Xm> a3 = this.f4134b.a(xa.f5331b);
        if (!A2.b((Collection) a3.f5887a)) {
            jVar.f6251b = new C0557mf.a[((List) a3.f5887a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a3.f5887a).size(); i2++) {
                Na<C0557mf.a, Vm> a4 = this.f4133a.fromModel((Sa) ((List) a3.f5887a).get(i2));
                jVar.f6251b[i2] = (C0557mf.a) a4.f4599a;
                i += a4.f4600b.a();
            }
        } else {
            i = 0;
        }
        return new Na<>(jVar, Um.a(a2, a3, new Um(i)));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Ia(Aa aa, C0379fb fbVar) {
        this.f4133a = aa;
        this.f4134b = fbVar;
    }
}
