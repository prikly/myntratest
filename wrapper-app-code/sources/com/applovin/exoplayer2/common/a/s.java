package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final ay<Object> f11582a = new b(ak.f11460a, 0);

    public static final class a<E> extends q.a<E> {
        public a() {
            this(4);
        }

        a(int i) {
            super(i);
        }

        public s<E> a() {
            this.f11579c = true;
            return s.b(this.f11577a, this.f11578b);
        }

        /* renamed from: b */
        public a<E> a(E e2) {
            super.a(e2);
            return this;
        }
    }

    static class b<E> extends a<E> {

        /* renamed from: a  reason: collision with root package name */
        private final s<E> f11583a;

        b(s<E> sVar, int i) {
            super(sVar.size(), i);
            this.f11583a = sVar;
        }

        /* access modifiers changed from: protected */
        public E a(int i) {
            return this.f11583a.get(i);
        }
    }

    class c extends s<E> {

        /* renamed from: a  reason: collision with root package name */
        final transient int f11584a;

        /* renamed from: b  reason: collision with root package name */
        final transient int f11585b;

        c(int i, int i2) {
            this.f11584a = i;
            this.f11585b = i2;
        }

        /* renamed from: a */
        public s<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.f11585b);
            s sVar = s.this;
            int i3 = this.f11584a;
            return sVar.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        public Object[] b() {
            return s.this.b();
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return s.this.c() + this.f11584a;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return s.this.c() + this.f11584a + this.f11585b;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, this.f11585b);
            return s.this.get(i + this.f11584a);
        }

        public /* synthetic */ Iterator iterator() {
            return s.super.iterator();
        }

        public /* synthetic */ ListIterator listIterator() {
            return s.super.listIterator();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return s.super.listIterator(i);
        }

        public int size() {
            return this.f11585b;
        }
    }

    s() {
    }

    public static <E> s<E> a(E e2) {
        return c(e2);
    }

    public static <E> s<E> a(E e2, E e3) {
        return c(e2, e3);
    }

    public static <E> s<E> a(E e2, E e3, E e4, E e5, E e6) {
        return c(e2, e3, e4, e5, e6);
    }

    public static <E> s<E> a(E e2, E e3, E e4, E e5, E e6, E e7) {
        return c(e2, e3, e4, e5, e6, e7);
    }

    public static <E> s<E> a(Collection<? extends E> collection) {
        if (!(collection instanceof q)) {
            return c(collection.toArray());
        }
        s<E> e2 = ((q) collection).e();
        return e2.f() ? b(e2.toArray()) : e2;
    }

    public static <E> s<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] b2 = x.b(iterable);
        ah.a(b2);
        Arrays.sort(b2, comparator);
        return b(b2);
    }

    public static <E> s<E> a(E[] eArr) {
        return eArr.length == 0 ? g() : c((Object[]) eArr.clone());
    }

    static <E> s<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> s<E> b(Object[] objArr, int i) {
        return i == 0 ? g() : new ak(objArr, i);
    }

    private static <E> s<E> c(Object... objArr) {
        return b(ah.a(objArr));
    }

    public static <E> s<E> g() {
        return ak.f11460a;
    }

    public static <E> a<E> i() {
        return new a<>();
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public ax<E> iterator() {
        return listIterator();
    }

    /* renamed from: a */
    public ay<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        return isEmpty() ? f11582a : new b(this, i);
    }

    /* renamed from: a */
    public s<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? g() : b(i, i2);
    }

    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public s<E> b(int i, int i2) {
        return new c(i, i2 - i);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final s<E> e() {
        return this;
    }

    public boolean equals(Object obj) {
        return aa.a(this, obj);
    }

    /* renamed from: h */
    public ay<E> listIterator() {
        return listIterator(0);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.c(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }
}
