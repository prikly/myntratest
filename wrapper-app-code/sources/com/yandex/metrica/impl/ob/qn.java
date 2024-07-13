package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zn;
import java.util.HashMap;
import java.util.Map;

public class qn<T, R> implements vn<T, R> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, wn<R>> f6662a;

    public qn(Map<T, wn<R>> map) {
        this.f6662a = A2.d(map);
    }

    /* renamed from: a */
    public zn<Map<T, R>> get(Map<T, R> map) {
        zn.a.values();
        int[] iArr = new int[3];
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            wn wnVar = this.f6662a.get(next.getKey());
            if (wnVar != null) {
                zn znVar = wnVar.get(next.getValue());
                int ordinal = znVar.f7246a.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
                hashMap.put(next.getKey(), znVar.f7247b);
            }
        }
        zn.a aVar = zn.a.NEW;
        if (iArr[0] > 0) {
            return new zn<>(aVar, hashMap);
        }
        zn.a aVar2 = zn.a.REFRESH;
        if (iArr[2] > 0) {
            return new zn<>(aVar2, hashMap);
        }
        return new zn<>(zn.a.NOT_CHANGED, hashMap);
    }
}
