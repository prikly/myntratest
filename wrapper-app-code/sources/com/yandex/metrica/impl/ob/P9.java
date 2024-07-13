package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Bf;
import java.util.ArrayList;
import java.util.List;

public class P9 implements ProtobufConverter<List<Bd>, Bf> {
    public Object fromModel(Object obj) {
        List list = (List) obj;
        Bf bf = new Bf();
        bf.f3766a = new Bf.a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Bf.a[] aVarArr = bf.f3766a;
            Bd bd = (Bd) list.get(i);
            Bf.a aVar = new Bf.a();
            aVar.f3768a = bd.f3764a;
            aVar.f3769b = bd.f3765b;
            aVarArr[i] = aVar;
        }
        return bf;
    }

    public Object toModel(Object obj) {
        Bf bf = (Bf) obj;
        ArrayList arrayList = new ArrayList(bf.f3766a.length);
        int i = 0;
        while (true) {
            Bf.a[] aVarArr = bf.f3766a;
            if (i >= aVarArr.length) {
                return arrayList;
            }
            Bf.a aVar = aVarArr[i];
            arrayList.add(new Bd(aVar.f3768a, aVar.f3769b));
            i++;
        }
    }
}
