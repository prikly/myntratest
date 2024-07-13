package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Ef;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class T9 implements ProtobufConverter<Z1, Ef> {
    public Object fromModel(Object obj) {
        Ef.a aVar;
        Z1 z1 = (Z1) obj;
        Ef ef = new Ef();
        Map<String, String> map = z1.f5393a;
        if (map == null) {
            aVar = null;
        } else {
            Ef.a aVar2 = new Ef.a();
            aVar2.f3940a = new Ef.a.C0045a[map.size()];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                Ef.a.C0045a aVar3 = new Ef.a.C0045a();
                aVar3.f3942a = (String) next.getKey();
                aVar3.f3943b = (String) next.getValue();
                aVar2.f3940a[i] = aVar3;
                i++;
            }
            aVar = aVar2;
        }
        ef.f3938a = aVar;
        ef.f3939b = z1.f5394b;
        return ef;
    }

    public Object toModel(Object obj) {
        HashMap hashMap;
        Ef ef = (Ef) obj;
        Ef.a aVar = ef.f3938a;
        if (aVar == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (Ef.a.C0045a aVar2 : aVar.f3940a) {
                hashMap2.put(aVar2.f3942a, aVar2.f3943b);
            }
            hashMap = hashMap2;
        }
        return new Z1(hashMap, ef.f3939b);
    }
}
