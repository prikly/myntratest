package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.List;
import java.util.Map;

public class Oa implements Converter<C0279bb, Na<C0557mf.n, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final Ha f4643a;

    /* renamed from: b  reason: collision with root package name */
    private final Da f4644b;

    /* renamed from: c  reason: collision with root package name */
    private final C0515kn f4645c;

    /* renamed from: d  reason: collision with root package name */
    private final C0515kn f4646d;

    public Oa() {
        this(new Ha(), new Da(), new C0515kn(100), new C0515kn(1000));
    }

    /* renamed from: a */
    public Na<C0557mf.n, Vm> fromModel(C0279bb bbVar) {
        Na<C0557mf.d, Vm> na;
        C0557mf.n nVar = new C0557mf.n();
        C0416gn<String, Vm> a2 = this.f4645c.a(bbVar.f5527a);
        nVar.f6264a = C0267b.b((String) a2.f5887a);
        List<String> list = bbVar.f5528b;
        Na<C0557mf.i, Vm> na2 = null;
        if (list != null) {
            na = this.f4644b.fromModel(list);
            nVar.f6265b = (C0557mf.d) na.f4599a;
        } else {
            na = null;
        }
        C0416gn<String, Vm> a3 = this.f4646d.a(bbVar.f5529c);
        nVar.f6266c = C0267b.b((String) a3.f5887a);
        Map<String, String> map = bbVar.f5530d;
        if (map != null) {
            na2 = this.f4643a.fromModel(map);
            nVar.f6267d = (C0557mf.i) na2.f4599a;
        }
        return new Na<>(nVar, Um.a(a2, na, a3, na2));
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    Oa(Ha ha, Da da, C0515kn knVar, C0515kn knVar2) {
        this.f4643a = ha;
        this.f4644b = da;
        this.f4645c = knVar;
        this.f4646d = knVar2;
    }
}
