package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Oh;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.s9  reason: case insensitive filesystem */
public class C0697s9 implements ProtobufConverter<Oh, If.a> {
    /* renamed from: a */
    public If.a fromModel(Oh oh) {
        If.a.C0046a aVar;
        If.a aVar2 = new If.a();
        aVar2.f4146a = new If.a.b[oh.f4715a.size()];
        for (int i = 0; i < oh.f4715a.size(); i++) {
            If.a.b bVar = new If.a.b();
            Pair pair = oh.f4715a.get(i);
            bVar.f4149a = (String) pair.first;
            if (pair.second != null) {
                bVar.f4150b = new If.a.C0046a();
                Oh.a aVar3 = (Oh.a) pair.second;
                if (aVar3 == null) {
                    aVar = null;
                } else {
                    If.a.C0046a aVar4 = new If.a.C0046a();
                    aVar4.f4147a = aVar3.f4716a;
                    aVar = aVar4;
                }
                bVar.f4150b = aVar;
            }
            aVar2.f4146a[i] = bVar;
        }
        return aVar2;
    }

    /* renamed from: a */
    public Oh toModel(If.a aVar) {
        Oh.a aVar2;
        ArrayList arrayList = new ArrayList();
        for (If.a.b bVar : aVar.f4146a) {
            String str = bVar.f4149a;
            If.a.C0046a aVar3 = bVar.f4150b;
            if (aVar3 == null) {
                aVar2 = null;
            } else {
                aVar2 = new Oh.a(aVar3.f4147a);
            }
            arrayList.add(new Pair(str, aVar2));
        }
        return new Oh(arrayList);
    }
}
