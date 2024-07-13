package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ae {

    private static class a<K, V> extends c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        transient Supplier<? extends List<V>> f11458a;

        a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.f11458a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<V> c() {
            return (List) this.f11458a.get();
        }

        /* access modifiers changed from: package-private */
        public Set<K> f() {
            return g();
        }

        /* access modifiers changed from: package-private */
        public Map<K, Collection<V>> n() {
            return o();
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract ac<K, V> a();

        public void clear() {
            a().e();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().c(entry.getKey(), entry.getValue());
        }

        public int size() {
            return a().d();
        }
    }

    public static <K, V> z<K, V> a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new a(map, supplier);
    }

    static boolean a(ac<?, ?> acVar, @NullableDecl Object obj) {
        if (obj == acVar) {
            return true;
        }
        if (obj instanceof ac) {
            return acVar.b().equals(((ac) obj).b());
        }
        return false;
    }
}
