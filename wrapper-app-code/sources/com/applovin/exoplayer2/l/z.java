package com.applovin.exoplayer2.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f13611a;

    /* renamed from: b  reason: collision with root package name */
    private int f13612b;

    /* renamed from: c  reason: collision with root package name */
    private int f13613c;

    /* renamed from: d  reason: collision with root package name */
    private int f13614d;

    public z(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    private boolean d(int i) {
        if (2 <= i && i < this.f13612b) {
            byte[] bArr = this.f13611a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    private int f() {
        int i = 0;
        int i2 = 0;
        while (!b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = c(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13612b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r2 = this;
            int r0 = r2.f13613c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13612b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13614d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.z.g():void");
    }

    public void a() {
        int i = 1;
        int i2 = this.f13614d + 1;
        this.f13614d = i2;
        if (i2 == 8) {
            this.f13614d = 0;
            int i3 = this.f13613c;
            if (d(i3 + 1)) {
                i = 2;
            }
            this.f13613c = i3 + i;
        }
        g();
    }

    public void a(int i) {
        int i2 = this.f13613c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13613c = i4;
        int i5 = this.f13614d + (i - (i3 * 8));
        this.f13614d = i5;
        if (i5 > 7) {
            this.f13613c = i4 + 1;
            this.f13614d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13613c) {
                g();
                return;
            } else if (d(i2)) {
                this.f13613c++;
                i2 += 2;
            }
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        this.f13611a = bArr;
        this.f13613c = i;
        this.f13612b = i2;
        this.f13614d = 0;
        g();
    }

    public boolean b() {
        boolean z = (this.f13611a[this.f13613c] & (128 >> this.f13614d)) != 0;
        a();
        return z;
    }

    public boolean b(int i) {
        int i2 = this.f13613c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13614d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13612b) {
                int i6 = this.f13612b;
            } else if (d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f13612b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    public int c(int i) {
        int i2;
        int i3;
        this.f13614d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f13614d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f13614d = i5;
            byte[] bArr = this.f13611a;
            int i6 = this.f13613c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!d(i6 + 1)) {
                i3 = 1;
            }
            this.f13613c = i6 + i3;
        }
        byte[] bArr2 = this.f13611a;
        int i7 = this.f13613c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13614d = 0;
            if (!d(i7 + 1)) {
                i3 = 1;
            }
            this.f13613c = i7 + i3;
        }
        g();
        return i8;
    }

    public boolean c() {
        int i = this.f13613c;
        int i2 = this.f13614d;
        int i3 = 0;
        while (this.f13613c < this.f13612b && !b()) {
            i3++;
        }
        boolean z = this.f13613c == this.f13612b;
        this.f13613c = i;
        this.f13614d = i2;
        return !z && b((i3 * 2) + 1);
    }

    public int d() {
        return f();
    }

    public int e() {
        int f2 = f();
        return (f2 % 2 == 0 ? -1 : 1) * ((f2 + 1) / 2);
    }
}
