package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ae;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class f<K, V> implements ac<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f11540a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f11541b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    private transient Collection<V> f11542c;
    @MonotonicNonNullDecl

    /* renamed from: d  reason: collision with root package name */
    private transient Map<K, Collection<V>> f11543d;

    class a extends ae.b<K, V> {
        a() {
        }

        /* access modifiers changed from: package-private */
        public ac<K, V> a() {
            return f.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.m();
        }
    }

    class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        public boolean equals(@NullableDecl Object obj) {
            return aq.a((Set<?>) this, obj);
        }

        public int hashCode() {
            return aq.a((Set<?>) this);
        }
    }

    class c extends AbstractCollection<V> {
        c() {
        }

        public void clear() {
            f.this.e();
        }

        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        public Iterator<V> iterator() {
            return f.this.j();
        }

        public int size() {
            return f.this.d();
        }
    }

    f() {
    }

    public boolean a(@NullableDecl K k, @NullableDecl V v) {
        return b(k).add(v);
    }

    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f11543d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> n = n();
        this.f11543d = n;
        return n;
    }

    public boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean d(@NullableDecl Object obj) {
        for (Collection contains : b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ae.a((ac<?, ?>) this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Set<K> f();

    public Collection<V> h() {
        Collection<V> collection = this.f11542c;
        if (collection != null) {
            return collection;
        }
        Collection<V> i = i();
        this.f11542c = i;
        return i;
    }

    public int hashCode() {
        return b().hashCode();
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> i();

    /* access modifiers changed from: package-private */
    public Iterator<V> j() {
        return ab.b(k().iterator());
    }

    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f11540a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> l = l();
        this.f11540a = l;
        return l;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<Map.Entry<K, V>> l();

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> m();

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> n();

    public Set<K> p() {
        Set<K> set = this.f11541b;
        if (set != null) {
            return set;
        }
        Set<K> f2 = f();
        this.f11541b = f2;
        return f2;
    }

    public String toString() {
        return b().toString();
    }
}
