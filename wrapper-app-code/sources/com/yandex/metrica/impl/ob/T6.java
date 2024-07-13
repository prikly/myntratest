package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import java.util.List;

public class T6 implements ListConverter<D6, C0482jf> {

    /* renamed from: a  reason: collision with root package name */
    private U6 f5013a = new U6();

    /* renamed from: a */
    public C0482jf[] fromModel(List<D6> list) {
        C0482jf[] jfVarArr = new C0482jf[list.size()];
        int i = 0;
        for (D6 a2 : list) {
            jfVarArr[i] = this.f5013a.fromModel(a2);
            i++;
        }
        return jfVarArr;
    }

    public Object toModel(Object obj) {
        C0482jf[] jfVarArr = (C0482jf[]) obj;
        throw new UnsupportedOperationException();
    }
}
