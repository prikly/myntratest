package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.If;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.y9  reason: case insensitive filesystem */
public final class C0841y9 implements Converter<Map<String, ? extends List<? extends String>>, If.d[]> {
    /* renamed from: a */
    public If.d[] fromModel(Map<String, ? extends List<String>> map) {
        int size = map.size();
        If.d[] dVarArr = new If.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new If.d();
        }
        int i2 = 0;
        for (T next : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            dVarArr[i2].f4158a = (String) entry.getKey();
            If.d dVar = dVarArr[i2];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array != null) {
                dVar.f4159b = (String[]) array;
                i2 = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return dVarArr;
    }

    /* renamed from: a */
    public Map<String, List<String>> toModel(If.d[] dVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(dVarArr.length), 16));
        for (If.d dVar : dVarArr) {
            String str = dVar.f4158a;
            String[] strArr = dVar.f4159b;
            Intrinsics.checkNotNullExpressionValue(strArr, "it.hosts");
            Pair pair = TuplesKt.to(str, ArraysKt.toList((T[]) strArr));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
