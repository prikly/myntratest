package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class w<E> extends q<E> implements Set<E> {
    @NullableDecl
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    private transient s<E> f11609a;

    w() {
    }

    static int a(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    private static <E> w<E> a(int i, Object... objArr) {
        if (i == 0) {
            return g();
        }
        if (i == 1) {
            return a(objArr[0]);
        }
        int a2 = a(i);
        Object[] objArr2 = new Object[a2];
        int i2 = a2 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a3 = ah.a(objArr[i5], i5);
            int hashCode = a3.hashCode();
            int a4 = p.a(hashCode);
            while (true) {
                int i6 = a4 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = a3;
                    objArr2[i6] = a3;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj.equals(a3)) {
                    break;
                } else {
                    a4++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new ar(objArr[0], i3);
        }
        if (a(i4) < a2 / 2) {
            return a(i4, objArr);
        }
        if (a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new am(objArr, i3, objArr2, i2, i4);
    }

    public static <E> w<E> a(E e2) {
        return new ar(e2);
    }

    public static <E> w<E> a(E e2, E e3) {
        return a(2, e2, e3);
    }

    public static <E> w<E> a(E e2, E e3, E e4) {
        return a(3, e2, e3, e4);
    }

    public static <E> w<E> a(Collection<? extends E> collection) {
        if ((collection instanceof w) && !(collection instanceof SortedSet)) {
            w<E> wVar = (w) collection;
            if (!wVar.f()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static <E> w<E> a(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? a(eArr.length, (Object[]) eArr.clone()) : a(eArr[0]) : g();
    }

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> w<E> g() {
        return am.f11477a;
    }

    /* renamed from: a */
    public abstract ax<E> iterator();

    public s<E> e() {
        s<E> sVar = this.f11609a;
        if (sVar != null) {
            return sVar;
        }
        s<E> i = i();
        this.f11609a = i;
        return i;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w) || !h() || !((w) obj).h() || hashCode() == obj.hashCode()) {
            return aq.a((Set<?>) this, obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return aq.a((Set<?>) this);
    }

    /* access modifiers changed from: package-private */
    public s<E> i() {
        return s.b(toArray());
    }
}
