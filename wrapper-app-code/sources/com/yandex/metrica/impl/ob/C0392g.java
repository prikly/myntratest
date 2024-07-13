package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.billing_interface.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.g  reason: case insensitive filesystem */
public final class C0392g {

    /* renamed from: a  reason: collision with root package name */
    public static final C0392g f5833a = new C0392g();

    private C0392g() {
    }

    public static void a(C0392g gVar, Map map, Map map2, String str, C0516l lVar, g gVar2, int i) {
        g gVar3 = (i & 16) != 0 ? new g() : null;
        Intrinsics.checkNotNullParameter(map, "history");
        Intrinsics.checkNotNullParameter(map2, "newBillingInfo");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(lVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(gVar3, "systemTimeProvider");
        gVar3.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (a aVar : map.values()) {
            if (map2.containsKey(aVar.f3545b)) {
                aVar.f3548e = currentTimeMillis;
            } else {
                a a2 = lVar.a(aVar.f3545b);
                if (a2 != null) {
                    aVar.f3548e = a2.f3548e;
                }
            }
        }
        lVar.a((Map<String, a>) map);
        if (!lVar.a() && Intrinsics.areEqual((Object) "inapp", (Object) str)) {
            lVar.b();
        }
    }
}
