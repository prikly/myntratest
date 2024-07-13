package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.List;
import java.util.Map;

public class Ja implements Converter<Ya, Na<C0557mf.k, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Ha f4320a;

    /* renamed from: b  reason: collision with root package name */
    private final Ia f4321b;

    /* renamed from: c  reason: collision with root package name */
    private final Da f4322c;

    /* renamed from: d  reason: collision with root package name */
    private final Ka f4323d;

    /* renamed from: e  reason: collision with root package name */
    private final C0515kn f4324e;

    /* renamed from: f  reason: collision with root package name */
    private final C0515kn f4325f;

    public Ja() {
        this(new Ha(), new Ia(), new Da(), new Ka(), new C0515kn(100), new C0515kn(1000));
    }

    /* renamed from: a */
    public Na<C0557mf.k, Vm> fromModel(Ya ya) {
        Na<C0557mf.d, Vm> na;
        Na<C0557mf.i, Vm> na2;
        Na<C0557mf.j, Vm> na3;
        Na<C0557mf.j, Vm> na4;
        C0557mf.k kVar = new C0557mf.k();
        C0416gn<String, Vm> a2 = this.f4324e.a(ya.f5372a);
        kVar.f6252a = C0267b.b((String) a2.f5887a);
        C0416gn<String, Vm> a3 = this.f4325f.a(ya.f5373b);
        kVar.f6253b = C0267b.b((String) a3.f5887a);
        List<String> list = ya.f5374c;
        Na<C0557mf.l[], Vm> na5 = null;
        if (list != null) {
            na = this.f4322c.fromModel(list);
            kVar.f6254c = (C0557mf.d) na.f4599a;
        } else {
            na = null;
        }
        Map<String, String> map = ya.f5375d;
        if (map != null) {
            na2 = this.f4320a.fromModel(map);
            kVar.f6255d = (C0557mf.i) na2.f4599a;
        } else {
            na2 = null;
        }
        Xa xa = ya.f5376e;
        if (xa != null) {
            na3 = this.f4321b.fromModel(xa);
            kVar.f6256e = (C0557mf.j) na3.f4599a;
        } else {
            na3 = null;
        }
        Xa xa2 = ya.f5377f;
        if (xa2 != null) {
            na4 = this.f4321b.fromModel(xa2);
            kVar.f6257f = (C0557mf.j) na4.f4599a;
        } else {
            na4 = null;
        }
        List<String> list2 = ya.f5378g;
        if (list2 != null) {
            na5 = this.f4323d.fromModel(list2);
            kVar.f6258g = (C0557mf.l[]) na5.f4599a;
        }
        return new Na<>(kVar, Um.a(a2, a3, na, na2, na3, na4, na5));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Ja(Ha ha, Ia ia, Da da, Ka ka, C0515kn knVar, C0515kn knVar2) {
        this.f4320a = ha;
        this.f4321b = ia;
        this.f4322c = da;
        this.f4323d = ka;
        this.f4324e = knVar;
        this.f4325f = knVar2;
    }
}
