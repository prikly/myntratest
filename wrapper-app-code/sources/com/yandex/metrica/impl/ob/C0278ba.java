package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.ob.C0877zl;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ba  reason: case insensitive filesystem */
class C0278ba implements ListConverter<C0877zl, If.y> {
    C0278ba() {
    }

    /* renamed from: a */
    public If.y[] fromModel(List<C0877zl> list) {
        If.y[] yVarArr = new If.y[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C0877zl zlVar = list.get(i);
            If.y yVar = new If.y();
            yVar.f4259a = zlVar.f7237a.f7244a;
            yVar.f4260b = zlVar.f7238b;
            yVarArr[i] = yVar;
        }
        return yVarArr;
    }

    /* renamed from: a */
    public List<C0877zl> toModel(If.y[] yVarArr) {
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (If.y yVar : yVarArr) {
            arrayList.add(new C0877zl(C0877zl.b.a(yVar.f4259a), yVar.f4260b));
        }
        return arrayList;
    }
}
