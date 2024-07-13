package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0763v3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.u3  reason: case insensitive filesystem */
public final class C0739u3 implements X<Map<String, ? extends String>> {
    public Object invoke(Object obj) {
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        return Boolean.valueOf(g2.d().b(new C0763v3.a((Map) obj, C0736u0.RETAIL)));
    }
}
