package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.List;

public class Da implements Converter<List<String>, Na<C0557mf.d, Vm>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0490jn f3867a;

    public Da() {
        this(new C0490jn(20, 100));
    }

    /* renamed from: a */
    public Na<C0557mf.d, Vm> fromModel(List<String> list) {
        C0416gn<List<T>, Xm> a2 = this.f3867a.a(list);
        C0557mf.d dVar = new C0557mf.d();
        List list2 = (List) a2.f5887a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i = 0; i < list2.size(); i++) {
                bArr[i] = C0267b.b((String) list2.get(i));
            }
        }
        dVar.f6233a = bArr;
        return new Na<>(dVar, a2.f5888b);
    }

    public Object toModel(Object obj) {
        Na na = (Na) obj;
        throw new UnsupportedOperationException();
    }

    public Da(C0490jn jnVar) {
        this.f3867a = jnVar;
    }
}
