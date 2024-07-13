package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class u<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f11587a = new Map.Entry[0];
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    private transient w<Map.Entry<K, V>> f11588b;
    @LazyInit

    /* renamed from: c  reason: collision with root package name */
    private transient w<K> f11589c;
    @LazyInit

    /* renamed from: d  reason: collision with root package name */
    private transient q<V> f11590d;

    public static class a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f11591a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f11592b;

        /* renamed from: c  reason: collision with root package name */
        int f11593c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11594d;

        public a() {
            this(4);
        }

        a(int i) {
            this.f11592b = new Object[(i * 2)];
            this.f11593c = 0;
            this.f11594d = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f11592b;
            if (i2 > objArr.length) {
                this.f11592b = Arrays.copyOf(objArr, q.b.a(objArr.length, i2));
                this.f11594d = false;
            }
        }

        public a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.f11593c + ((Collection) iterable).size());
            }
            for (Map.Entry a2 : iterable) {
                a(a2);
            }
            return this;
        }

        public a<K, V> a(K k, V v) {
            a(this.f11593c + 1);
            j.a((Object) k, (Object) v);
            Object[] objArr = this.f11592b;
            int i = this.f11593c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f11593c = i + 1;
            return this;
        }

        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public u<K, V> a() {
            b();
            this.f11594d = true;
            return al.a(this.f11593c, this.f11592b);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int i;
            if (this.f11591a != null) {
                if (this.f11594d) {
                    this.f11592b = Arrays.copyOf(this.f11592b, this.f11593c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f11593c];
                int i2 = 0;
                while (true) {
                    i = this.f11593c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f11592b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, ai.a(this.f11591a).a(ab.b()));
                for (int i4 = 0; i4 < this.f11593c; i4++) {
                    int i5 = i4 * 2;
                    this.f11592b[i5] = entryArr[i4].getKey();
                    this.f11592b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    u() {
    }

    public static <K, V> u<K, V> a() {
        return al.f11463b;
    }

    public static <K, V> u<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    public static <K, V> u<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            if (!uVar.i()) {
                return uVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    /* renamed from: c */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f11588b;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> d2 = d();
        this.f11588b = d2;
        return d2;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract w<Map.Entry<K, V>> d();

    /* renamed from: e */
    public w<K> keySet() {
        w<K> wVar = this.f11589c;
        if (wVar != null) {
            return wVar;
        }
        w<K> f2 = f();
        this.f11589c = f2;
        return f2;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ab.d(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract w<K> f();

    /* renamed from: g */
    public q<V> values() {
        q<V> qVar = this.f11590d;
        if (qVar != null) {
            return qVar;
        }
        q<V> h2 = h();
        this.f11590d = h2;
        return h2;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* access modifiers changed from: package-private */
    public abstract q<V> h();

    public int hashCode() {
        return aq.a((Set<?>) entrySet());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ab.a((Map<?, ?>) this);
    }
}
