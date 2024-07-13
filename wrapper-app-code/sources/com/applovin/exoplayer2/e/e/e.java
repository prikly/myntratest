package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final y f11942a = new y(8);

    /* renamed from: b  reason: collision with root package name */
    private int f11943b;

    private long b(i iVar) throws IOException {
        int i = 0;
        iVar.d(this.f11942a.d(), 0, 1);
        byte b2 = this.f11942a.d()[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        iVar.d(this.f11942a.d(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f11942a.d()[i] & 255) + (i4 << 8);
        }
        this.f11943b += i3 + 1;
        return (long) i4;
    }

    public boolean a(i iVar) throws IOException {
        long b2;
        int i;
        i iVar2 = iVar;
        long d2 = iVar.d();
        long j = 1024;
        int i2 = (d2 > -1 ? 1 : (d2 == -1 ? 0 : -1));
        if (i2 != 0 && d2 <= 1024) {
            j = d2;
        }
        int i3 = (int) j;
        iVar2.d(this.f11942a.d(), 0, 4);
        this.f11943b = 4;
        for (long o = this.f11942a.o(); o != 440786851; o = ((o << 8) & -256) | ((long) (this.f11942a.d()[0] & 255))) {
            int i4 = this.f11943b + 1;
            this.f11943b = i4;
            if (i4 == i3) {
                return false;
            }
            iVar2.d(this.f11942a.d(), 0, 1);
        }
        long b3 = b(iVar);
        long j2 = (long) this.f11943b;
        if (b3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + b3 >= d2) {
            return false;
        }
        while (true) {
            int i5 = this.f11943b;
            long j3 = j2 + b3;
            if (((long) i5) >= j3) {
                return ((long) i5) == j3;
            }
            if (b(iVar) != Long.MIN_VALUE && b2 >= 0 && b2 <= 2147483647L) {
                if (i != 0) {
                    int b4 = (int) (b2 = b(iVar));
                    iVar2.c(b4);
                    this.f11943b += b4;
                }
            }
        }
        return false;
    }
}
