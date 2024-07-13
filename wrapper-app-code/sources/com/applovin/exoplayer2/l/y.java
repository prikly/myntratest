package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f13608a;

    /* renamed from: b  reason: collision with root package name */
    private int f13609b;

    /* renamed from: c  reason: collision with root package name */
    private int f13610c;

    public y() {
        this.f13608a = ai.f13530f;
    }

    public y(int i) {
        this.f13608a = new byte[i];
        this.f13610c = i;
    }

    public y(byte[] bArr) {
        this.f13608a = bArr;
        this.f13610c = bArr.length;
    }

    public y(byte[] bArr, int i) {
        this.f13608a = bArr;
        this.f13610c = i;
    }

    public double A() {
        return Double.longBitsToDouble(s());
    }

    public String B() {
        return a(0);
    }

    public String C() {
        if (a() == 0) {
            return null;
        }
        int i = this.f13609b;
        while (i < this.f13610c && !ai.a((int) this.f13608a[i])) {
            i++;
        }
        int i2 = this.f13609b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f13608a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f13609b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f13608a;
        int i3 = this.f13609b;
        String a2 = ai.a(bArr2, i3, i - i3);
        this.f13609b = i;
        int i4 = this.f13610c;
        if (i == i4) {
            return a2;
        }
        if (this.f13608a[i] == 13) {
            int i5 = i + 1;
            this.f13609b = i5;
            if (i5 == i4) {
                return a2;
            }
        }
        byte[] bArr3 = this.f13608a;
        int i6 = this.f13609b;
        if (bArr3[i6] == 10) {
            this.f13609b = i6 + 1;
        }
        return a2;
    }

    public long D() {
        int i;
        int i2;
        long j = (long) this.f13608a[this.f13609b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b2 = this.f13608a[this.f13609b + i];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f13609b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public int a() {
        return this.f13610c - this.f13609b;
    }

    public String a(char c2) {
        if (a() == 0) {
            return null;
        }
        int i = this.f13609b;
        while (i < this.f13610c && this.f13608a[i] != c2) {
            i++;
        }
        byte[] bArr = this.f13608a;
        int i2 = this.f13609b;
        String a2 = ai.a(bArr, i2, i - i2);
        this.f13609b = i;
        if (i < this.f13610c) {
            this.f13609b = i + 1;
        }
        return a2;
    }

    public String a(int i, Charset charset) {
        String str = new String(this.f13608a, this.f13609b, i, charset);
        this.f13609b += i;
        return str;
    }

    public void a(int i) {
        a(e() < i ? new byte[i] : this.f13608a, i);
    }

    public void a(x xVar, int i) {
        a(xVar.f13604a, 0, i);
        xVar.a(0);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.f13608a = bArr;
        this.f13610c = i;
        this.f13609b = 0;
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13608a, this.f13609b, bArr, i, i2);
        this.f13609b += i2;
    }

    public int b() {
        return this.f13610c;
    }

    public void b(int i) {
        if (i > e()) {
            this.f13608a = Arrays.copyOf(this.f13608a, i);
        }
    }

    public int c() {
        return this.f13609b;
    }

    public void c(int i) {
        a.a(i >= 0 && i <= this.f13608a.length);
        this.f13610c = i;
    }

    public void d(int i) {
        a.a(i >= 0 && i <= this.f13610c);
        this.f13609b = i;
    }

    public byte[] d() {
        return this.f13608a;
    }

    public int e() {
        return this.f13608a.length;
    }

    public void e(int i) {
        d(this.f13609b + i);
    }

    public int f() {
        return this.f13608a[this.f13609b] & 255;
    }

    public String f(int i) {
        return a(i, Charsets.UTF_8);
    }

    public char g() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public String g(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f13609b + i) - 1;
        String a2 = ai.a(this.f13608a, this.f13609b, (i2 >= this.f13610c || this.f13608a[i2] != 0) ? i : i - 1);
        this.f13609b += i;
        return a2;
    }

    public int h() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        this.f13609b = i + 1;
        return bArr[i] & 255;
    }

    public int i() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        this.f13609b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public int j() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        this.f13609b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public short k() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        this.f13609b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public short l() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        this.f13609b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public int m() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f13609b = i4;
        byte b2 = i3 | ((bArr[i2] & 255) << 8);
        this.f13609b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public int n() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        byte b2 = (((bArr[i] & 255) << Ascii.CAN) >> 8) | ((bArr[i2] & 255) << 8);
        this.f13609b = i3 + 1;
        return (bArr[i3] & 255) | b2;
    }

    public long o() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        int i4 = i3 + 1;
        this.f13609b = i4;
        this.f13609b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public long p() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        int i4 = i3 + 1;
        this.f13609b = i4;
        this.f13609b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public int q() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f13609b = i4;
        byte b2 = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f13609b = i5;
        byte b3 = b2 | ((bArr[i4] & 255) << 8);
        this.f13609b = i5 + 1;
        return (bArr[i5] & 255) | b3;
    }

    public int r() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        byte b2 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f13609b = i4;
        byte b3 = b2 | ((bArr[i3] & 255) << Ascii.DLE);
        this.f13609b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b3;
    }

    public long s() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        int i4 = i3 + 1;
        this.f13609b = i4;
        int i5 = i4 + 1;
        this.f13609b = i5;
        int i6 = i5 + 1;
        this.f13609b = i6;
        int i7 = i6 + 1;
        this.f13609b = i7;
        int i8 = i7 + 1;
        this.f13609b = i8;
        this.f13609b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public long t() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        int i4 = i3 + 1;
        this.f13609b = i4;
        int i5 = i4 + 1;
        this.f13609b = i5;
        int i6 = i5 + 1;
        this.f13609b = i6;
        int i7 = i6 + 1;
        this.f13609b = i7;
        int i8 = i7 + 1;
        this.f13609b = i8;
        this.f13609b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public int u() {
        byte[] bArr = this.f13608a;
        int i = this.f13609b;
        int i2 = i + 1;
        this.f13609b = i2;
        int i3 = i2 + 1;
        this.f13609b = i3;
        byte b2 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f13609b = i3 + 2;
        return b2;
    }

    public int v() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public int w() {
        int q = q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    public int x() {
        int r = r();
        if (r >= 0) {
            return r;
        }
        throw new IllegalStateException("Top bit not zero: " + r);
    }

    public long y() {
        long s = s();
        if (s >= 0) {
            return s;
        }
        throw new IllegalStateException("Top bit not zero: " + s);
    }

    public float z() {
        return Float.intBitsToFloat(q());
    }
}
