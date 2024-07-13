package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.be  reason: case insensitive filesystem */
public final class C0282be extends C0712t0<C0357ee> {
    public boolean a(Object obj, Object obj2) {
        C0357ee eeVar = (C0357ee) obj;
        C0357ee eeVar2 = (C0357ee) obj2;
        if (eeVar.f5745c) {
            if (eeVar2.f5745c) {
                int intValue = a().a(eeVar.f5747e).intValue();
                Integer a2 = a().a(eeVar2.f5747e);
                Intrinsics.checkNotNullExpressionValue(a2, "priorities[oldData.source]");
                if (Intrinsics.compare(intValue, a2.intValue()) > 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
