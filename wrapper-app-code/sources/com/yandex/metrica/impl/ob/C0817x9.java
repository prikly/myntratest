package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0763v3;
import com.yandex.metrica.impl.ob.C0847yf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.x9  reason: case insensitive filesystem */
public final class C0817x9 implements ProtobufConverter<C0763v3, C0847yf> {
    private final C0847yf.a a(C0763v3.a aVar) {
        C0847yf.b bVar;
        C0847yf.a aVar2 = new C0847yf.a();
        Map<String, String> b2 = aVar.b();
        int i = 0;
        if (b2 != null) {
            bVar = new C0847yf.b();
            int size = b2.size();
            C0847yf.b.a[] aVarArr = new C0847yf.b.a[size];
            for (int i2 = 0; i2 < size; i2++) {
                aVarArr[i2] = new C0847yf.b.a();
            }
            bVar.f7162a = aVarArr;
            int i3 = 0;
            for (Map.Entry next : b2.entrySet()) {
                C0847yf.b.a[] aVarArr2 = bVar.f7162a;
                aVarArr2[i3].f7164a = (String) next.getKey();
                aVarArr2[i3].f7165b = (String) next.getValue();
                i3++;
            }
        } else {
            bVar = null;
        }
        aVar2.f7160a = bVar;
        int ordinal = aVar.a().ordinal();
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        }
        aVar2.f7161b = i;
        return aVar2;
    }

    public Object fromModel(Object obj) {
        C0763v3 v3Var = (C0763v3) obj;
        C0847yf yfVar = new C0847yf();
        yfVar.f7157a = a(v3Var.c());
        int size = v3Var.a().size();
        C0847yf.a[] aVarArr = new C0847yf.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = a(v3Var.a().get(i));
        }
        yfVar.f7158b = aVarArr;
        return yfVar;
    }

    public Object toModel(Object obj) {
        C0847yf yfVar = (C0847yf) obj;
        C0847yf.a aVar = yfVar.f7157a;
        if (aVar == null) {
            aVar = new C0847yf.a();
        }
        C0763v3.a a2 = a(aVar);
        C0847yf.a[] aVarArr = yfVar.f7158b;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C0847yf.a aVar2 : aVarArr) {
            Intrinsics.checkNotNullExpressionValue(aVar2, "it");
            arrayList.add(a(aVar2));
        }
        return new C0763v3(a2, arrayList);
    }

    private final C0763v3.a a(C0847yf.a aVar) {
        C0736u0 u0Var;
        C0847yf.b bVar = aVar.f7160a;
        Map<String, String> a2 = bVar != null ? a(bVar) : null;
        int i = aVar.f7161b;
        if (i == 0) {
            u0Var = C0736u0.UNDEFINED;
        } else if (i == 1) {
            u0Var = C0736u0.APP;
        } else if (i == 2) {
            u0Var = C0736u0.SATELLITE;
        } else if (i != 3) {
            u0Var = C0736u0.UNDEFINED;
        } else {
            u0Var = C0736u0.RETAIL;
        }
        return new C0763v3.a(a2, u0Var);
    }

    private final Map<String, String> a(C0847yf.b bVar) {
        C0847yf.b.a[] aVarArr = bVar.f7162a;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "proto.pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(aVarArr.length), 16));
        for (C0847yf.b.a aVar : aVarArr) {
            Pair pair = TuplesKt.to(aVar.f7164a, aVar.f7165b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
