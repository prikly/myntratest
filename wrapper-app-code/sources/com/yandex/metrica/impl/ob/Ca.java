package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;

public class Ca implements Converter<Ua, Na<C0557mf.c, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Ja f3813a;

    /* renamed from: b  reason: collision with root package name */
    private final Ea f3814b;

    /* renamed from: c  reason: collision with root package name */
    private final Ia f3815c;

    /* renamed from: d  reason: collision with root package name */
    private final Ma f3816d;

    public Ca() {
        this(new Ja(), new Ea(), new Ia(), new Ma());
    }

    /* renamed from: a */
    public Na<C0557mf.c, Vm> fromModel(Ua ua) {
        Na<C0557mf.m, Vm> na;
        C0557mf.c cVar = new C0557mf.c();
        Na<C0557mf.k, Vm> a2 = this.f3813a.fromModel(ua.f5089a);
        cVar.f6229a = (C0557mf.k) a2.f4599a;
        cVar.f6231c = this.f3814b.fromModel(ua.f5090b);
        Na<C0557mf.j, Vm> a3 = this.f3815c.fromModel(ua.f5091c);
        cVar.f6232d = (C0557mf.j) a3.f4599a;
        C0254ab abVar = ua.f5092d;
        if (abVar != null) {
            na = this.f3816d.fromModel(abVar);
            cVar.f6230b = (C0557mf.m) na.f4599a;
        } else {
            na = null;
        }
        return new Na<>(cVar, Um.a(a2, a3, na));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Ca(Ja ja, Ea ea, Ia ia, Ma ma) {
        this.f3813a = ja;
        this.f3814b = ea;
        this.f3815c = ia;
        this.f3816d = ma;
    }
}
