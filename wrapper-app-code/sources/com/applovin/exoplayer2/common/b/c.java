package com.applovin.exoplayer2.common.b;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class c {

    private static class a extends AbstractList<Integer> implements Serializable, RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        final int[] f11617a;

        /* renamed from: b  reason: collision with root package name */
        final int f11618b;

        /* renamed from: c  reason: collision with root package name */
        final int f11619c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i, int i2) {
            this.f11617a = iArr;
            this.f11618b = i;
            this.f11619c = i2;
        }

        /* renamed from: a */
        public Integer get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(this.f11617a[this.f11618b + i]);
        }

        /* renamed from: a */
        public Integer set(int i, Integer num) {
            Preconditions.checkElementIndex(i, size());
            int[] iArr = this.f11617a;
            int i2 = this.f11618b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i3);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            return Arrays.copyOfRange(this.f11617a, this.f11618b, this.f11619c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && c.c(this.f11617a, ((Integer) obj).intValue(), this.f11618b, this.f11619c) != -1;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f11617a[this.f11618b + i] != aVar.f11617a[aVar.f11618b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f11618b; i2 < this.f11619c; i2++) {
                i = (i * 31) + c.a(this.f11617a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Integer) || (a2 = c.c(this.f11617a, ((Integer) obj).intValue(), this.f11618b, this.f11619c)) < 0) {
                return -1;
            }
            return a2 - this.f11618b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Integer) || (b2 = c.d(this.f11617a, ((Integer) obj).intValue(), this.f11618b, this.f11619c)) < 0) {
                return -1;
            }
            return b2 - this.f11618b;
        }

        public int size() {
            return this.f11619c - this.f11618b;
        }

        public List<Integer> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f11617a;
            int i3 = this.f11618b;
            return new a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f11617a[this.f11618b]);
            int i = this.f11618b;
            while (true) {
                i++;
                if (i < this.f11619c) {
                    sb.append(", ");
                    sb.append(this.f11617a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static int a(int i) {
        return i;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int a(long j) {
        int i = (int) j;
        Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static List<Integer> a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int[] a(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public static int c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }
}
