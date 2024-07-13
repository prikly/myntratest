package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.a;
import java.util.Arrays;

final class r {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12340a;

    /* renamed from: b  reason: collision with root package name */
    public int f12341b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12342c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12343d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12344e;

    public r(int i, int i2) {
        this.f12342c = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f12340a = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f12343d = false;
        this.f12344e = false;
    }

    public void a(int i) {
        boolean z = true;
        a.b(!this.f12343d);
        if (i != this.f12342c) {
            z = false;
        }
        this.f12343d = z;
        if (z) {
            this.f12341b = 3;
            this.f12344e = false;
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.f12343d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f12340a;
            int length = bArr2.length;
            int i4 = this.f12341b;
            if (length < i4 + i3) {
                this.f12340a = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f12340a, this.f12341b, i3);
            this.f12341b += i3;
        }
    }

    public boolean b() {
        return this.f12344e;
    }

    public boolean b(int i) {
        if (!this.f12343d) {
            return false;
        }
        this.f12341b -= i;
        this.f12343d = false;
        this.f12344e = true;
        return true;
    }
}
