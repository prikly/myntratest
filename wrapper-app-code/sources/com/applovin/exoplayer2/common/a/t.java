package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.a.v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class t<K, V> extends v<K, V> implements z<K, V> {

    public static final class a<K, V> extends v.a<K, V> {
        /* renamed from: a */
        public a<K, V> b(K k, Iterable<? extends V> iterable) {
            super.b(k, iterable);
            return this;
        }

        /* renamed from: a */
        public a<K, V> b(K k, V... vArr) {
            super.b(k, vArr);
            return this;
        }

        /* renamed from: a */
        public t<K, V> b() {
            return (t) super.b();
        }
    }

    t(u<K, s<V>> uVar, int i) {
        super(uVar, i);
    }

    public static <K, V> t<K, V> a() {
        return o.f11575a;
    }

    static <K, V> t<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return a();
        }
        u.a aVar = new u.a(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            s<E> a2 = comparator == null ? s.a(collection2) : s.a(comparator, collection2);
            if (!a2.isEmpty()) {
                aVar.a(key, a2);
                i += a2.size();
            }
        }
        return new t<>(aVar.a(), i);
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    /* renamed from: c */
    public s<V> e(@NullableDecl K k) {
        s<V> sVar = (s) this.f11595b.get(k);
        return sVar == null ? s.g() : sVar;
    }
}
