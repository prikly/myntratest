package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.List;

public class O9 implements ListConverter<Bd, If.m> {
    /* renamed from: a */
    public If.m[] fromModel(List<Bd> list) {
        If.m[] mVarArr = new If.m[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Bd bd = list.get(i);
            If.m mVar = new If.m();
            mVar.f4208a = bd.f3764a;
            mVar.f4209b = bd.f3765b;
            mVarArr[i] = mVar;
        }
        return mVarArr;
    }

    /* renamed from: a */
    public List<Bd> toModel(If.m[] mVarArr) {
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (If.m mVar : mVarArr) {
            arrayList.add(new Bd(mVar.f4208a, mVar.f4209b));
        }
        return arrayList;
    }
}
