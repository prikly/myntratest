package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class v<K, V> extends g<K, V> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    final transient u<K, ? extends q<V>> f11595b;

    /* renamed from: c  reason: collision with root package name */
    final transient int f11596c;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Map<K, Collection<V>> f11604a = aj.a();
        @MonotonicNonNullDecl

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f11605b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f11606c;

        public a<K, V> b(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection collection = this.f11604a.get(k);
                Iterator<? extends V> it = iterable.iterator();
                if (collection != null) {
                    while (it.hasNext()) {
                        Object next = it.next();
                        j.a((Object) k, (Object) next);
                        collection.add(next);
                    }
                    return this;
                } else if (!it.hasNext()) {
                    return this;
                } else {
                    Collection c2 = c();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        j.a((Object) k, (Object) next2);
                        c2.add(next2);
                    }
                    this.f11604a.put(k, c2);
                    return this;
                }
            } else {
                throw new NullPointerException("null key in entry: null=" + x.a((Iterable<?>) iterable));
            }
        }

        public a<K, V> b(K k, V... vArr) {
            return b(k, Arrays.asList(vArr));
        }

        public v<K, V> b() {
            Collection entrySet = this.f11604a.entrySet();
            Comparator comparator = this.f11605b;
            if (comparator != null) {
                entrySet = ai.a(comparator).c().a(entrySet);
            }
            return t.a(entrySet, this.f11606c);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> c() {
            return new ArrayList();
        }
    }

    private static class b<K, V> extends q<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final v<K, V> f11607a;

        b(v<K, V> vVar) {
            this.f11607a = vVar;
        }

        /* renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return this.f11607a.m();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f11607a.b(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f11607a.g();
        }

        public int size() {
            return this.f11607a.d();
        }
    }

    private static final class c<K, V> extends q<V> {

        /* renamed from: a  reason: collision with root package name */
        private final transient v<K, V> f11608a;

        c(v<K, V> vVar) {
            this.f11608a = vVar;
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i) {
            ax<? extends q<V>> a2 = this.f11608a.f11595b.values().iterator();
            while (a2.hasNext()) {
                i = ((q) a2.next()).a(objArr, i);
            }
            return i;
        }

        /* renamed from: a */
        public ax<V> iterator() {
            return this.f11608a.j();
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f11608a.d(obj);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public int size() {
            return this.f11608a.d();
        }
    }

    v(u<K, ? extends q<V>> uVar, int i) {
        this.f11595b = uVar;
        this.f11596c = i;
    }

    @Deprecated
    public boolean a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.b(obj, obj2);
    }

    @Deprecated
    public boolean c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int d() {
        return this.f11596c;
    }

    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    /* renamed from: e */
    public abstract q<V> b(K k);

    @Deprecated
    public void e() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Set<K> f() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f11595b.i();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> n() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: o */
    public w<K> p() {
        return this.f11595b.keySet();
    }

    /* renamed from: q */
    public u<K, Collection<V>> b() {
        return this.f11595b;
    }

    /* renamed from: r */
    public q<Map.Entry<K, V>> k() {
        return (q) super.k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public q<Map.Entry<K, V>> l() {
        return new b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ax<Map.Entry<K, V>> m() {
        return new ax<Map.Entry<K, V>>() {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<? extends Map.Entry<K, ? extends q<V>>> f11597a = v.this.f11595b.entrySet().iterator();

            /* renamed from: b  reason: collision with root package name */
            K f11598b = null;

            /* renamed from: c  reason: collision with root package name */
            Iterator<V> f11599c = y.a();

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                if (!this.f11599c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f11597a.next();
                    this.f11598b = entry.getKey();
                    this.f11599c = ((q) entry.getValue()).iterator();
                }
                return ab.a(this.f11598b, this.f11599c.next());
            }

            public boolean hasNext() {
                return this.f11599c.hasNext() || this.f11597a.hasNext();
            }
        };
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public q<V> h() {
        return (q) super.h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public q<V> i() {
        return new c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public ax<V> j() {
        return new ax<V>() {

            /* renamed from: a  reason: collision with root package name */
            Iterator<? extends q<V>> f11601a = v.this.f11595b.values().iterator();

            /* renamed from: b  reason: collision with root package name */
            Iterator<V> f11602b = y.a();

            public boolean hasNext() {
                return this.f11602b.hasNext() || this.f11601a.hasNext();
            }

            public V next() {
                if (!this.f11602b.hasNext()) {
                    this.f11602b = ((q) this.f11601a.next()).iterator();
                }
                return this.f11602b.next();
            }
        };
    }
}
