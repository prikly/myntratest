package com.bytedance.sdk.component.b.a.b;

import java.util.Arrays;

/* compiled from: SegmentedByteString */
final class g extends d {

    /* renamed from: g  reason: collision with root package name */
    final transient byte[][] f18882g;

    /* renamed from: h  reason: collision with root package name */
    final transient int[] f18883h;

    g(a aVar, int i) {
        super((byte[]) null);
        i.a(aVar.f18866b, 0, (long) i);
        e eVar = aVar.f18865a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (eVar.f18875c != eVar.f18874b) {
                i3 += eVar.f18875c - eVar.f18874b;
                i4++;
                eVar = eVar.f18878f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f18882g = new byte[i4][];
        this.f18883h = new int[(i4 * 2)];
        e eVar2 = aVar.f18865a;
        int i5 = 0;
        while (i2 < i) {
            this.f18882g[i5] = eVar2.f18873a;
            i2 += eVar2.f18875c - eVar2.f18874b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f18883h;
            iArr[i5] = i2;
            iArr[this.f18882g.length + i5] = eVar2.f18874b;
            eVar2.f18876d = true;
            i5++;
            eVar2 = eVar2.f18878f;
        }
    }

    public String a() {
        return e().a();
    }

    public String b() {
        return e().b();
    }

    public d a(int i, int i2) {
        return e().a(i, i2);
    }

    public byte a(int i) {
        int i2;
        i.a((long) this.f18883h[this.f18882g.length - 1], (long) i, 1);
        int b2 = b(i);
        if (b2 == 0) {
            i2 = 0;
        } else {
            i2 = this.f18883h[b2 - 1];
        }
        int[] iArr = this.f18883h;
        byte[][] bArr = this.f18882g;
        return bArr[b2][(i - i2) + iArr[bArr.length + b2]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.f18883h, 0, this.f18882g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public int c() {
        return this.f18883h[this.f18882g.length - 1];
    }

    public byte[] d() {
        int[] iArr = this.f18883h;
        byte[][] bArr = this.f18882g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f18883h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f18882g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public boolean a(int i, d dVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > c() - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            if (b2 == 0) {
                i4 = 0;
            } else {
                i4 = this.f18883h[b2 - 1];
            }
            int min = Math.min(i3, ((this.f18883h[b2] - i4) + i4) - i);
            int[] iArr = this.f18883h;
            byte[][] bArr = this.f18882g;
            if (!dVar.a(i2, bArr[b2], (i - i4) + iArr[bArr.length + b2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            if (b2 == 0) {
                i4 = 0;
            } else {
                i4 = this.f18883h[b2 - 1];
            }
            int min = Math.min(i3, ((this.f18883h[b2] - i4) + i4) - i);
            int[] iArr = this.f18883h;
            byte[][] bArr2 = this.f18882g;
            if (!i.a(bArr2[b2], (i - i4) + iArr[bArr2.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    private d e() {
        return new d(d());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.c() != c() || !a(0, dVar, 0, c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f18871e;
        if (i != 0) {
            return i;
        }
        int length = this.f18882g.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f18882g[i2];
            int[] iArr = this.f18883h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f18871e = i4;
        return i4;
    }

    public String toString() {
        return e().toString();
    }
}
