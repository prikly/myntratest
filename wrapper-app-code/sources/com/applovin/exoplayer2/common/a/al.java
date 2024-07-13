package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class al<K, V> extends u<K, V> {

    /* renamed from: b  reason: collision with root package name */
    static final u<Object, Object> f11463b = new al((int[]) null, new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f11464c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int[] f11465d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f11466e;

    static class a<K, V> extends w<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final transient u<K, V> f11467a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final transient Object[] f11468b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final transient int f11469c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final transient int f11470d;

        a(u<K, V> uVar, Object[] objArr, int i, int i2) {
            this.f11467a = uVar;
            this.f11468b = objArr;
            this.f11469c = i;
            this.f11470d = i2;
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i) {
            return e().a(objArr, i);
        }

        /* renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f11467a.get(key));
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public s<Map.Entry<K, V>> i() {
            return new s<Map.Entry<K, V>>() {
                /* renamed from: b */
                public Map.Entry<K, V> get(int i) {
                    Preconditions.checkElementIndex(i, a.this.f11470d);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.f11468b[a.this.f11469c + i2], a.this.f11468b[i2 + (a.this.f11469c ^ 1)]);
                }

                public boolean f() {
                    return true;
                }

                public int size() {
                    return a.this.f11470d;
                }
            };
        }

        public int size() {
            return this.f11470d;
        }
    }

    static final class b<K> extends w<K> {

        /* renamed from: a  reason: collision with root package name */
        private final transient u<K, ?> f11472a;

        /* renamed from: b  reason: collision with root package name */
        private final transient s<K> f11473b;

        b(u<K, ?> uVar, s<K> sVar) {
            this.f11472a = uVar;
            this.f11473b = sVar;
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i) {
            return e().a(objArr, i);
        }

        /* renamed from: a */
        public ax<K> iterator() {
            return e().iterator();
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f11472a.get(obj) != null;
        }

        public s<K> e() {
            return this.f11473b;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public int size() {
            return this.f11472a.size();
        }
    }

    static final class c extends s<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final transient Object[] f11474a;

        /* renamed from: b  reason: collision with root package name */
        private final transient int f11475b;

        /* renamed from: c  reason: collision with root package name */
        private final transient int f11476c;

        c(Object[] objArr, int i, int i2) {
            this.f11474a = objArr;
            this.f11475b = i;
            this.f11476c = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f11476c);
            return this.f11474a[(i * 2) + this.f11475b];
        }

        public int size() {
            return this.f11476c;
        }
    }

    private al(int[] iArr, Object[] objArr, int i) {
        this.f11465d = iArr;
        this.f11464c = objArr;
        this.f11466e = i;
    }

    static <K, V> al<K, V> a(int i, Object[] objArr) {
        if (i == 0) {
            return (al) f11463b;
        }
        if (i == 1) {
            j.a(objArr[0], objArr[1]);
            return new al<>((int[]) null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        return new al<>(a(objArr, i, w.a(i), 0), objArr, i);
    }

    static Object a(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = p.a(obj.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.exoplayer2.common.a.j.a((java.lang.Object) r11, (java.lang.Object) r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.exoplayer2.common.a.j.a((java.lang.Object) r6, (java.lang.Object) r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.exoplayer2.common.a.p.a((int) r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.a.al.a(java.lang.Object[], int, int, int):int[]");
    }

    /* access modifiers changed from: package-private */
    public w<Map.Entry<K, V>> d() {
        return new a(this, this.f11464c, 0, this.f11466e);
    }

    /* access modifiers changed from: package-private */
    public w<K> f() {
        return new b(this, new c(this.f11464c, 0, this.f11466e));
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return a(this.f11465d, this.f11464c, this.f11466e, 0, obj);
    }

    /* access modifiers changed from: package-private */
    public q<V> h() {
        return new c(this.f11464c, 1, this.f11466e);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    public int size() {
        return this.f11466e;
    }
}
