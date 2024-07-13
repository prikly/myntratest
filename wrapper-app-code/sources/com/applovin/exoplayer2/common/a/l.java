package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class l<K, V> extends AbstractMap<K, V> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    transient long[] f11549a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    transient Object[] f11550b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f11551c;

    /* renamed from: d  reason: collision with root package name */
    transient float f11552d;

    /* renamed from: e  reason: collision with root package name */
    transient int f11553e;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    private transient int[] f11554f;

    /* renamed from: g  reason: collision with root package name */
    private transient int f11555g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public transient int f11556h;
    @MonotonicNonNullDecl
    private transient Set<K> i;
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> j;
    @MonotonicNonNullDecl
    private transient Collection<V> k;

    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        public void clear() {
            l.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = l.this.a(entry.getKey());
            return a2 != -1 && Objects.equal(l.this.f11551c[a2], entry.getValue());
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return l.this.f();
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = l.this.a(entry.getKey());
            if (a2 == -1 || !Objects.equal(l.this.f11551c[a2], entry.getValue())) {
                return false;
            }
            Object unused = l.this.j(a2);
            return true;
        }

        public int size() {
            return l.this.f11556h;
        }
    }

    private abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f11561b;

        /* renamed from: c  reason: collision with root package name */
        int f11562c;

        /* renamed from: d  reason: collision with root package name */
        int f11563d;

        private b() {
            this.f11561b = l.this.f11553e;
            this.f11562c = l.this.b();
            this.f11563d = -1;
        }

        private void a() {
            if (l.this.f11553e != this.f11561b) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract T a(int i);

        public boolean hasNext() {
            return this.f11562c >= 0;
        }

        public T next() {
            a();
            if (hasNext()) {
                int i = this.f11562c;
                this.f11563d = i;
                T a2 = a(i);
                this.f11562c = l.this.e(this.f11562c);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            j.a(this.f11563d >= 0);
            this.f11561b++;
            Object unused = l.this.j(this.f11563d);
            this.f11562c = l.this.a(this.f11562c, this.f11563d);
            this.f11563d = -1;
        }
    }

    class c extends AbstractSet<K> {
        c() {
        }

        public void clear() {
            l.this.clear();
        }

        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return l.this.d();
        }

        public boolean remove(@NullableDecl Object obj) {
            int a2 = l.this.a(obj);
            if (a2 == -1) {
                return false;
            }
            Object unused = l.this.j(a2);
            return true;
        }

        public int size() {
            return l.this.f11556h;
        }
    }

    final class d extends e<K, V> {
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        private final K f11567b;

        /* renamed from: c  reason: collision with root package name */
        private int f11568c;

        d(int i) {
            this.f11567b = l.this.f11550b[i];
            this.f11568c = i;
        }

        private void a() {
            int i = this.f11568c;
            if (i == -1 || i >= l.this.size() || !Objects.equal(this.f11567b, l.this.f11550b[this.f11568c])) {
                this.f11568c = l.this.a((Object) this.f11567b);
            }
        }

        public K getKey() {
            return this.f11567b;
        }

        public V getValue() {
            a();
            if (this.f11568c == -1) {
                return null;
            }
            return l.this.f11551c[this.f11568c];
        }

        public V setValue(V v) {
            a();
            if (this.f11568c == -1) {
                l.this.put(this.f11567b, v);
                return null;
            }
            V v2 = l.this.f11551c[this.f11568c];
            l.this.f11551c[this.f11568c] = v;
            return v2;
        }
    }

    class e extends AbstractCollection<V> {
        e() {
        }

        public void clear() {
            l.this.clear();
        }

        public Iterator<V> iterator() {
            return l.this.h();
        }

        public int size() {
            return l.this.f11556h;
        }
    }

    l() {
        a(3, 1.0f);
    }

    l(int i2) {
        this(i2, 1.0f);
    }

    l(int i2, float f2) {
        a(i2, f2);
    }

    private static int a(long j2) {
        return (int) (j2 >>> 32);
    }

    /* access modifiers changed from: private */
    public int a(@NullableDecl Object obj) {
        int a2 = p.a(obj);
        int i2 = this.f11554f[i() & a2];
        while (i2 != -1) {
            long j2 = this.f11549a[i2];
            if (a(j2) == a2 && Objects.equal(obj, this.f11550b[i2])) {
                return i2;
            }
            i2 = b(j2);
        }
        return -1;
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    public static <K, V> l<K, V> a() {
        return new l<>();
    }

    public static <K, V> l<K, V> a(int i2) {
        return new l<>(i2);
    }

    @NullableDecl
    private V a(@NullableDecl Object obj, int i2) {
        int i3 = i() & i2;
        int i4 = this.f11554f[i3];
        if (i4 == -1) {
            return null;
        }
        int i5 = -1;
        while (true) {
            if (a(this.f11549a[i4]) != i2 || !Objects.equal(obj, this.f11550b[i4])) {
                int b2 = b(this.f11549a[i4]);
                if (b2 == -1) {
                    return null;
                }
                int i6 = b2;
                i5 = i4;
                i4 = i6;
            } else {
                V v = this.f11551c[i4];
                if (i5 == -1) {
                    this.f11554f[i3] = b(this.f11549a[i4]);
                } else {
                    long[] jArr = this.f11549a;
                    jArr[i5] = a(jArr[i5], b(jArr[i4]));
                }
                d(i4);
                this.f11556h--;
                this.f11553e++;
                return v;
            }
        }
    }

    private static int b(long j2) {
        return (int) j2;
    }

    private static int[] f(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] g(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    private void h(int i2) {
        int length = this.f11549a.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                c(max);
            }
        }
    }

    private int i() {
        return this.f11554f.length - 1;
    }

    private void i(int i2) {
        if (this.f11554f.length >= 1073741824) {
            this.f11555g = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f11552d)) + 1;
        int[] f2 = f(i2);
        long[] jArr = this.f11549a;
        int length = f2.length - 1;
        for (int i4 = 0; i4 < this.f11556h; i4++) {
            int a2 = a(jArr[i4]);
            int i5 = a2 & length;
            int i6 = f2[i5];
            f2[i5] = i4;
            jArr[i4] = (((long) a2) << 32) | (((long) i6) & 4294967295L);
        }
        this.f11555g = i3;
        this.f11554f = f2;
    }

    /* access modifiers changed from: private */
    public V j(int i2) {
        return a(this.f11550b[i2], a(this.f11549a[i2]));
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        boolean z = false;
        Preconditions.checkArgument(i2 >= 0, "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Illegal load factor");
        int a2 = p.a(i2, (double) f2);
        this.f11554f = f(a2);
        this.f11552d = f2;
        this.f11550b = new Object[i2];
        this.f11551c = new Object[i2];
        this.f11549a = g(i2);
        this.f11555g = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, @NullableDecl K k2, @NullableDecl V v, int i3) {
        this.f11549a[i2] = (((long) i3) << 32) | 4294967295L;
        this.f11550b[i2] = k2;
        this.f11551c[i2] = v;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
    }

    /* access modifiers changed from: package-private */
    public Set<K> c() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        this.f11550b = Arrays.copyOf(this.f11550b, i2);
        this.f11551c = Arrays.copyOf(this.f11551c, i2);
        long[] jArr = this.f11549a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.f11549a = copyOf;
    }

    public void clear() {
        this.f11553e++;
        Arrays.fill(this.f11550b, 0, this.f11556h, (Object) null);
        Arrays.fill(this.f11551c, 0, this.f11556h, (Object) null);
        Arrays.fill(this.f11554f, -1);
        Arrays.fill(this.f11549a, -1);
        this.f11556h = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return a(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i2 = 0; i2 < this.f11556h; i2++) {
            if (Objects.equal(obj, this.f11551c[i2])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Iterator<K> d() {
        return new l<K, V>.b<K>() {
            /* access modifiers changed from: package-private */
            public K a(int i) {
                return l.this.f11550b[i];
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f11550b;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.f11551c;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f11549a;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int a2 = a(j2) & i();
            int[] iArr = this.f11554f;
            int i3 = iArr[a2];
            if (i3 == size) {
                iArr[a2] = i2;
                return;
            }
            while (true) {
                long j3 = this.f11549a[i3];
                int b2 = b(j3);
                if (b2 == size) {
                    this.f11549a[i3] = a(j3, i2);
                    return;
                }
                i3 = b2;
            }
        } else {
            this.f11550b[i2] = null;
            this.f11551c[i2] = null;
            this.f11549a[i2] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public int e(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f11556h) {
            return i3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> e() {
        return new a();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> e2 = e();
        this.j = e2;
        return e2;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> f() {
        return new l<K, V>.b<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> a(int i) {
                return new d(i);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public Collection<V> g() {
        return new e();
    }

    public V get(@NullableDecl Object obj) {
        int a2 = a(obj);
        b(a2);
        if (a2 == -1) {
            return null;
        }
        return this.f11551c[a2];
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> h() {
        return new l<K, V>.b<V>() {
            /* access modifiers changed from: package-private */
            public V a(int i) {
                return l.this.f11551c[i];
            }
        };
    }

    public boolean isEmpty() {
        return this.f11556h == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        Set<K> c2 = c();
        this.i = c2;
        return c2;
    }

    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        long[] jArr = this.f11549a;
        Object[] objArr = this.f11550b;
        V[] vArr = this.f11551c;
        int a2 = p.a((Object) k2);
        int i2 = i() & a2;
        int i3 = this.f11556h;
        int[] iArr = this.f11554f;
        int i4 = iArr[i2];
        if (i4 == -1) {
            iArr[i2] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (a(j2) != a2 || !Objects.equal(k2, objArr[i4])) {
                    int b2 = b(j2);
                    if (b2 == -1) {
                        jArr[i4] = a(j2, i3);
                        break;
                    }
                    i4 = b2;
                } else {
                    V v2 = vArr[i4];
                    vArr[i4] = v;
                    b(i4);
                    return v2;
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i5 = i3 + 1;
            h(i5);
            a(i3, k2, v, a2);
            this.f11556h = i5;
            if (i3 >= this.f11555g) {
                i(this.f11554f.length * 2);
            }
            this.f11553e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return a(obj, p.a(obj));
    }

    public int size() {
        return this.f11556h;
    }

    public Collection<V> values() {
        Collection<V> collection = this.k;
        if (collection != null) {
            return collection;
        }
        Collection<V> g2 = g();
        this.k = g2;
        return g2;
    }
}
