package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zl<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, V> f5430a;

    /* renamed from: b  reason: collision with root package name */
    private final V f5431b;

    public Zl(V v) {
        this(new HashMap(), v);
    }

    public void a(K k, V v) {
        this.f5430a.put(k, v);
    }

    public Zl(Map<K, V> map, V v) {
        this.f5430a = map;
        this.f5431b = v;
    }

    public V a(K k) {
        V v = this.f5430a.get(k);
        return v == null ? this.f5431b : v;
    }

    public Set<K> a() {
        return this.f5430a.keySet();
    }
}
