package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Ff;
import java.util.ArrayList;
import java.util.List;

public class V9 implements ProtobufConverter<C0360eh, Ff> {
    public Object fromModel(Object obj) {
        C0360eh ehVar = (C0360eh) obj;
        Ff ff = new Ff();
        ff.f4006a = new Ff.a[ehVar.f5753a.size()];
        for (int i = 0; i < ehVar.f5753a.size(); i++) {
            Ff.a[] aVarArr = ff.f4006a;
            C0435hh hhVar = ehVar.f5753a.get(i);
            Ff.a aVar = new Ff.a();
            aVar.f4012a = hhVar.f5930a;
            List<String> list = hhVar.f5931b;
            aVar.f4013b = new String[list.size()];
            int i2 = 0;
            for (String str : list) {
                aVar.f4013b[i2] = str;
                i2++;
            }
            aVarArr[i] = aVar;
        }
        ff.f4007b = ehVar.f5754b;
        ff.f4008c = ehVar.f5755c;
        ff.f4009d = ehVar.f5756d;
        ff.f4010e = ehVar.f5757e;
        return ff;
    }

    public Object toModel(Object obj) {
        Ff ff = (Ff) obj;
        ArrayList arrayList = new ArrayList(ff.f4006a.length);
        int i = 0;
        while (true) {
            Ff.a[] aVarArr = ff.f4006a;
            if (i >= aVarArr.length) {
                return new C0360eh(arrayList, ff.f4007b, ff.f4008c, ff.f4009d, ff.f4010e);
            }
            Ff.a aVar = aVarArr[i];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f4013b;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f4013b.length);
                int i2 = 0;
                while (true) {
                    String[] strArr2 = aVar.f4013b;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    arrayList2.add(strArr2[i2]);
                    i2++;
                }
            }
            String str = aVar.f4012a;
            if (str == null) {
                str = "";
            }
            arrayList.add(new C0435hh(str, arrayList2));
            i++;
        }
    }
}
