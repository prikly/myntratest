package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.List;

public class Ka implements Converter<List<String>, Na<C0557mf.l[], Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0490jn f4429a;

    public Ka() {
        this(new C0490jn(20, 100));
    }

    /* renamed from: a */
    public Na<C0557mf.l[], Vm> fromModel(List<String> list) {
        C0416gn<List<T>, Xm> a2 = this.f4429a.a(list);
        List list2 = (List) a2.f5887a;
        C0557mf.l[] lVarArr = new C0557mf.l[0];
        if (list2 != null) {
            lVarArr = new C0557mf.l[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                lVarArr[i] = new C0557mf.l();
                lVarArr[i].f6260a = C0267b.b((String) list2.get(i));
            }
        }
        return new Na<>(lVarArr, a2.f5888b);
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    public Ka(C0490jn jnVar) {
        this.f4429a = jnVar;
    }
}
