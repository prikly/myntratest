package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ab {

    private enum a implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static abstract class b<K, V> extends aq.a<Map.Entry<K, V>> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> a();

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object a2 = ab.a(a(), key);
            if (Objects.equal(a2, entry.getValue())) {
                return a2 != null || a().containsKey(key);
            }
            return false;
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return aq.a((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = aq.a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a2.add(((Map.Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(a2);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static class c<K, V> extends aq.a<K> {

        /* renamed from: d  reason: collision with root package name */
        final Map<K, V> f11448d;

        c(Map<K, V> map) {
            this.f11448d = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        public Map<K, V> c() {
            return this.f11448d;
        }

        public void clear() {
            c().clear();
        }

        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        public boolean isEmpty() {
            return c().isEmpty();
        }

        public Iterator<K> iterator() {
            return ab.a(c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            c().remove(obj);
            return true;
        }

        public int size() {
            return c().size();
        }
    }

    static class d<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f11449a;

        d(Map<K, V> map) {
            this.f11449a = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        public final Map<K, V> a() {
            return this.f11449a;
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return a().containsValue(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public Iterator<V> iterator() {
            return ab.b(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = aq.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a2);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = aq.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a2);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static abstract class e<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f11450a;
        @MonotonicNonNullDecl

        /* renamed from: b  reason: collision with root package name */
        private transient Set<K> f11451b;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        private transient Collection<V> f11452c;

        e() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11450a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a2 = a();
            this.f11450a = a2;
            return a2;
        }

        /* access modifiers changed from: package-private */
        public Set<K> h() {
            return new c(this);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> i() {
            return new d(this);
        }

        public Set<K> keySet() {
            Set<K> set = this.f11451b;
            if (set != null) {
                return set;
            }
            Set<K> h2 = h();
            this.f11451b = h2;
            return h2;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f11452c;
            if (collection != null) {
                return collection;
            }
            Collection<V> i = i();
            this.f11452c = i;
            return i;
        }
    }

    static int a(int i) {
        if (i < 3) {
            j.a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    static <K> Function<Map.Entry<K, ?>, K> a() {
        return a.KEY;
    }

    static <V> V a(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String a(Map<?, ?> map) {
        StringBuilder a2 = k.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            z = false;
            a2.append(next.getKey());
            a2.append('=');
            a2.append(next.getValue());
        }
        a2.append('}');
        return a2.toString();
    }

    static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, K>(it) {
            /* access modifiers changed from: package-private */
            public K a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    public static <K, V> Map.Entry<K, V> a(@NullableDecl K k, @NullableDecl V v) {
        return new r(k, v);
    }

    static <V> Function<Map.Entry<?, V>, V> b() {
        return a.VALUE;
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, V>(it) {
            /* access modifiers changed from: package-private */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    static boolean b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> IdentityHashMap<K, V> c() {
        return new IdentityHashMap<>();
    }

    static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
