package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.Map;

public class Ha implements Converter<Map<String, String>, Na<C0557mf.i, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0540ln f4102a;

    public Ha() {
        this(new C0540ln(20480, 100, 1000));
    }

    /* renamed from: a */
    public Na<C0557mf.i, Vm> fromModel(Map<String, String> map) {
        C0416gn<Map<String, String>, Xm> a2 = this.f4102a.a(map);
        C0557mf.i iVar = new C0557mf.i();
        iVar.f6246b = ((Xm) a2.f5888b).f5357b;
        Map map2 = (Map) a2.f5887a;
        if (map2 != null) {
            iVar.f6245a = new C0557mf.i.a[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                iVar.f6245a[i] = new C0557mf.i.a();
                iVar.f6245a[i].f6248a = C0267b.b((String) entry.getKey());
                iVar.f6245a[i].f6249b = C0267b.b((String) entry.getValue());
                i++;
            }
        }
        return new Na<>(iVar, a2.f5888b);
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    public Ha(C0540ln lnVar) {
        this.f4102a = lnVar;
    }
}
