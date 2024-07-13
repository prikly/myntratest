package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0557mf;
import java.math.BigDecimal;
import kotlin.Pair;

public class Ea implements ProtobufConverter<BigDecimal, C0557mf.e> {
    /* renamed from: a */
    public C0557mf.e fromModel(BigDecimal bigDecimal) {
        Pair a2 = Ol.a(bigDecimal);
        Nl nl = new Nl(((Number) a2.getFirst()).longValue(), ((Number) a2.getSecond()).intValue());
        C0557mf.e eVar = new C0557mf.e();
        eVar.f6234a = nl.b();
        eVar.f6235b = nl.a();
        return eVar;
    }

    public Object toModel(Object obj) {
        C0557mf.e eVar = (C0557mf.e) obj;
        throw new UnsupportedOperationException();
    }
}
