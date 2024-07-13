package com.yandex.metrica.impl.ob;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.p5  reason: case insensitive filesystem */
public final class C0622p5 extends X4 {
    public C0622p5(L3 l3) {
        super(l3);
        I3 e2 = l3.e();
        Intrinsics.checkNotNullExpressionValue(e2, "component.componentId");
        String a2 = e2.a();
        if (a2 != null) {
            A2.a(a2);
        }
    }

    public boolean a(C0293c0 c0Var) {
        Map<String, byte[]> i = c0Var.i();
        Intrinsics.checkNotNullExpressionValue(i, "reportData.extras");
        for (Map.Entry next : i.entrySet()) {
            L3 a2 = a();
            Intrinsics.checkNotNullExpressionValue(a2, "component");
            C0424h6 u = a2.u();
            Object key = next.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            u.a((String) key, (byte[]) next.getValue());
        }
        return true;
    }
}
