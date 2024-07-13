package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C0871zf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class D9 implements Converter<Map<String, ? extends byte[]>, byte[]> {
    /* renamed from: a */
    public byte[] fromModel(Map<String, byte[]> map) {
        C0871zf zfVar = new C0871zf();
        int size = map.size();
        C0871zf.a[] aVarArr = new C0871zf.a[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            aVarArr[i2] = new C0871zf.a();
        }
        zfVar.f7225a = aVarArr;
        for (T next : map.entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            zfVar.f7225a[i].f7227a = (String) entry.getKey();
            zfVar.f7225a[i].f7228b = (byte[]) entry.getValue();
            i = i3;
        }
        byte[] byteArray = MessageNano.toByteArray(zfVar);
        Intrinsics.checkNotNullExpressionValue(byteArray, "MessageNano.toByteArray(proto)");
        return byteArray;
    }

    /* renamed from: a */
    public Map<String, byte[]> toModel(byte[] bArr) {
        C0871zf.a[] aVarArr = ((C0871zf) MessageNano.mergeFrom(new C0871zf(), bArr)).f7225a;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "EventExtrasProto.EventEx…s.parseFrom(input).extras");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(aVarArr.length), 16));
        for (C0871zf.a aVar : aVarArr) {
            Pair pair = TuplesKt.to(aVar.f7227a, aVar.f7228b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
