package com.applovin.exoplayer2.e;

import kotlin.KotlinVersion;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12463a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12464b;

    /* renamed from: c  reason: collision with root package name */
    private int f12465c;

    /* renamed from: d  reason: collision with root package name */
    private int f12466d;

    public y(byte[] bArr) {
        this.f12463a = bArr;
        this.f12464b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f12464b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r2 = this;
            int r0 = r2.f12465c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f12464b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f12466d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.y.c():void");
    }

    public int a(int i) {
        int i2 = this.f12465c;
        int min = Math.min(i, 8 - this.f12466d);
        int i3 = i2 + 1;
        int i4 = ((this.f12463a[i2] & 255) >> this.f12466d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i) {
            i4 |= (this.f12463a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        b(i);
        return i5;
    }

    public boolean a() {
        boolean z = (((this.f12463a[this.f12465c] & 255) >> this.f12466d) & 1) == 1;
        b(1);
        return z;
    }

    public int b() {
        return (this.f12465c * 8) + this.f12466d;
    }

    public void b(int i) {
        int i2 = i / 8;
        int i3 = this.f12465c + i2;
        this.f12465c = i3;
        int i4 = this.f12466d + (i - (i2 * 8));
        this.f12466d = i4;
        if (i4 > 7) {
            this.f12465c = i3 + 1;
            this.f12466d = i4 - 8;
        }
        c();
    }
}
