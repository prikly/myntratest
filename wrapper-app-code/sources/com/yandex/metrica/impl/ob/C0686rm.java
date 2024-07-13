package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.rm  reason: case insensitive filesystem */
public class C0686rm<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<K, Collection<V>> f6760a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6761b;

    public C0686rm() {
        this(false);
    }

    public Collection<V> a(K k) {
        return this.f6760a.get(k);
    }

    public boolean b() {
        return this.f6760a.isEmpty();
    }

    public int c() {
        int i = 0;
        for (Collection<V> size : this.f6760a.values()) {
            i += size.size();
        }
        return i;
    }

    public String toString() {
        return this.f6760a.toString();
    }

    public C0686rm(boolean z) {
        this.f6760a = new HashMap<>();
        this.f6761b = z;
    }

    public Collection<V> a(K k, V v) {
        ArrayList arrayList;
        Collection collection = this.f6760a.get(k);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(v);
        return this.f6760a.put(k, arrayList);
    }

    public Collection<V> b(K k) {
        return this.f6760a.remove(k);
    }

    public Collection<V> b(K k, V v) {
        Collection collection = this.f6760a.get(k);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f6761b) {
            this.f6760a.remove(k);
        }
        return new ArrayList(collection);
    }

    public Set<? extends Map.Entry<K, ? extends Collection<V>>> a() {
        return this.f6760a.entrySet();
    }
}
