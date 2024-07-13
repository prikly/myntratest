package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class ad<K0, V0> {

    /* renamed from: com.applovin.exoplayer2.common.a.ad$1  reason: invalid class name */
    class AnonymousClass1 extends c<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11453a;

        /* access modifiers changed from: package-private */
        public <K, V> Map<K, Collection<V>> a() {
            return aj.a(this.f11453a);
        }
    }

    private static final class a<V> implements Supplier<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f11455a;

        a(int i) {
            this.f11455a = j.a(i, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f11455a);
        }
    }

    public static abstract class b<K0, V0> extends ad<K0, V0> {
        b() {
            super((AnonymousClass1) null);
        }

        public abstract <K extends K0, V extends V0> z<K, V> b();
    }

    public static abstract class c<K0> {
        c() {
        }

        public b<K0, Object> a(final int i) {
            j.a(i, "expectedValuesPerKey");
            return new b<K0, Object>() {
                public <K extends K0, V> z<K, V> b() {
                    return ae.a(c.this.a(), new a(i));
                }
            };
        }

        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        public b<K0, Object> b() {
            return a(2);
        }
    }

    private ad() {
    }

    /* synthetic */ ad(AnonymousClass1 r1) {
        this();
    }

    public static c<Comparable> a() {
        return a(ai.b());
    }

    public static <K0> c<K0> a(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new c<K0>() {
            /* access modifiers changed from: package-private */
            public <K extends K0, V> Map<K, Collection<V>> a() {
                return new TreeMap(comparator);
            }
        };
    }
}
