package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class y {

    private static final class a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        static final ay<Object> f11612a = new a(new Object[0], 0, 0, 0);

        /* renamed from: b  reason: collision with root package name */
        private final T[] f11613b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11614c;

        a(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f11613b = tArr;
            this.f11614c = i;
        }

        /* access modifiers changed from: protected */
        public T a(int i) {
            return this.f11613b[this.f11614c + i];
        }
    }

    private enum b implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            j.a(false);
        }
    }

    static <T> ax<T> a() {
        return b();
    }

    public static <T> ax<T> a(@NullableDecl final T t) {
        return new ax<T>() {

            /* renamed from: a  reason: collision with root package name */
            boolean f11610a;

            public boolean hasNext() {
                return !this.f11610a;
            }

            public T next() {
                if (!this.f11610a) {
                    this.f11610a = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    @NullableDecl
    public static <T> T a(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static String a(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.applovin.exoplayer2.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.a.y.a(java.util.Iterator, java.util.Iterator):boolean");
    }

    static <T> ay<T> b() {
        return a.f11612a;
    }

    public static <T> T b(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    static <T> T c(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static <T> Iterator<T> c() {
        return b.INSTANCE;
    }

    static void d(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
