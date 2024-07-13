package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zn;
import java.util.Map;

public class rn<T, R> implements vn<T, R> {
    public zn<Map<T, R>> a(Map<T, R> map) {
        return new zn<>(zn.a.NEW, map);
    }

    public zn get(Object obj) {
        return new zn(zn.a.NEW, (Map) obj);
    }
}
