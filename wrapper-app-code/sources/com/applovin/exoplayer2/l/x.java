package com.applovin.exoplayer2.l;

import java.nio.charset.Charset;
import kotlin.KotlinVersion;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13604a;

    /* renamed from: b  reason: collision with root package name */
    private int f13605b;

    /* renamed from: c  reason: collision with root package name */
    private int f13606c;

    /* renamed from: d  reason: collision with root package name */
    private int f13607d;

    public x() {
        this.f13604a = ai.f13530f;
    }

    public x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public x(byte[] bArr, int i) {
        this.f13604a = bArr;
        this.f13607d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13607d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r2 = this;
            int r0 = r2.f13605b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13607d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13606c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.applovin.exoplayer2.l.a.b((boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.x.g():void");
    }

    public int a() {
        return ((this.f13607d - this.f13605b) * 8) - this.f13606c;
    }

    public String a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        b(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void a(int i) {
        int i2 = i / 8;
        this.f13605b = i2;
        this.f13606c = i - (i2 * 8);
        g();
    }

    public void a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f13606c, i2);
        int i3 = this.f13606c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f13604a;
        int i5 = this.f13605b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f13604a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f13604a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        b(i2);
        g();
    }

    public void a(y yVar) {
        a(yVar.d(), yVar.b());
        a(yVar.c() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.f13604a = bArr;
        this.f13605b = 0;
        this.f13606c = 0;
        this.f13607d = i;
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f13604a;
            int i4 = this.f13605b;
            int i5 = i4 + 1;
            this.f13605b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.f13606c;
            bArr[i] = (byte) (b2 << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (KotlinVersion.MAX_COMPONENT_VALUE >> i7));
            int i8 = this.f13606c;
            if (i8 + i7 > 8) {
                byte b3 = bArr[i3];
                byte[] bArr3 = this.f13604a;
                int i9 = this.f13605b;
                this.f13605b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.f13606c = i8 - 8;
            }
            int i10 = this.f13606c + i7;
            this.f13606c = i10;
            byte[] bArr4 = this.f13604a;
            int i11 = this.f13605b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f13606c = 0;
                this.f13605b = i11 + 1;
            }
            g();
        }
    }

    public int b() {
        return (this.f13605b * 8) + this.f13606c;
    }

    public void b(int i) {
        int i2 = i / 8;
        int i3 = this.f13605b + i2;
        this.f13605b = i3;
        int i4 = this.f13606c + (i - (i2 * 8));
        this.f13606c = i4;
        if (i4 > 7) {
            this.f13605b = i3 + 1;
            this.f13606c = i4 - 8;
        }
        g();
    }

    public void b(byte[] bArr, int i, int i2) {
        a.b(this.f13606c == 0);
        System.arraycopy(this.f13604a, this.f13605b, bArr, i, i2);
        this.f13605b += i2;
        g();
    }

    public int c() {
        a.b(this.f13606c == 0);
        return this.f13605b;
    }

    public int c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f13606c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f13606c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f13606c = i4;
            byte[] bArr = this.f13604a;
            int i5 = this.f13605b;
            this.f13605b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f13604a;
        int i6 = this.f13605b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13606c = 0;
            this.f13605b = i6 + 1;
        }
        g();
        return i7;
    }

    public long d(int i) {
        return i <= 32 ? ai.b(c(i)) : ai.b(c(i - 32), c(32));
    }

    public void d() {
        int i = this.f13606c + 1;
        this.f13606c = i;
        if (i == 8) {
            this.f13606c = 0;
            this.f13605b++;
        }
        g();
    }

    public void e(int i) {
        a.b(this.f13606c == 0);
        this.f13605b += i;
        g();
    }

    public boolean e() {
        boolean z = (this.f13604a[this.f13605b] & (128 >> this.f13606c)) != 0;
        d();
        return z;
    }

    public void f() {
        if (this.f13606c != 0) {
            this.f13606c = 0;
            this.f13605b++;
            g();
        }
    }
}
