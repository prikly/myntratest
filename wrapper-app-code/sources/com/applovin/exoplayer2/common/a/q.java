package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f11576a = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f11577a;

        /* renamed from: b  reason: collision with root package name */
        int f11578b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f11579c;

        a(int i) {
            j.a(i, "initialCapacity");
            this.f11577a = new Object[i];
        }

        private void a(int i) {
            Object[] objArr = this.f11577a;
            if (objArr.length < i) {
                this.f11577a = Arrays.copyOf(objArr, a(objArr.length, i));
            } else if (this.f11579c) {
                this.f11577a = (Object[]) objArr.clone();
            } else {
                return;
            }
            this.f11579c = false;
        }

        public a<E> a(E e2) {
            Preconditions.checkNotNull(e2);
            a(this.f11578b + 1);
            Object[] objArr = this.f11577a;
            int i = this.f11578b;
            this.f11578b = i + 1;
            objArr[i] = e2;
            return this;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    q() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        ax a2 = iterator();
        while (a2.hasNext()) {
            objArr[i] = a2.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract ax<E> iterator();

    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    public s<E> e() {
        return isEmpty() ? s.g() : s.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean f();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f11576a);
    }

    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b2 = b();
            if (b2 != null) {
                return aj.a(b2, c(), d(), tArr);
            }
            tArr = ah.a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
