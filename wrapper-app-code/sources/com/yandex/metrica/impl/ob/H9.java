package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.gpllibrary.a;
import com.yandex.metrica.impl.ob.If;

public class H9 implements ProtobufConverter<C0255ac, If.k.a.b.C0049a> {
    /* renamed from: a */
    public If.k.a.b.C0049a fromModel(C0255ac acVar) {
        If.k.a.b.C0049a aVar = new If.k.a.b.C0049a();
        aVar.f4199a = acVar.f5476b;
        aVar.f4200b = acVar.f5477c;
        int ordinal = acVar.f5475a.ordinal();
        int i = 3;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal != 3) {
            i = 0;
        }
        aVar.f4201c = i;
        return aVar;
    }

    /* renamed from: a */
    public C0255ac toModel(If.k.a.b.C0049a aVar) {
        a.b bVar;
        int i = aVar.f4201c;
        if (i == 1) {
            bVar = a.b.PRIORITY_LOW_POWER;
        } else if (i == 2) {
            bVar = a.b.PRIORITY_BALANCED_POWER_ACCURACY;
        } else if (i != 3) {
            bVar = a.b.PRIORITY_NO_POWER;
        } else {
            bVar = a.b.PRIORITY_HIGH_ACCURACY;
        }
        return new C0255ac(bVar, aVar.f4199a, aVar.f4200b);
    }
}
