package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f11970a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f11971b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11972c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11973d;

    private f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f11970a = jArr;
        this.f11971b = jArr2;
        this.f11972c = j;
        this.f11973d = j2;
    }

    public static f a(long j, long j2, r.a aVar, y yVar) {
        int i;
        long j3 = j;
        r.a aVar2 = aVar;
        y yVar2 = yVar;
        yVar2.e(10);
        int q = yVar.q();
        if (q <= 0) {
            return null;
        }
        int i2 = aVar2.f11330d;
        long d2 = ai.d((long) q, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int i3 = yVar.i();
        int i4 = yVar.i();
        int i5 = yVar.i();
        yVar2.e(2);
        long j4 = j2 + ((long) aVar2.f11329c);
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i6 = 0;
        long j5 = j2;
        while (i6 < i3) {
            int i7 = i4;
            jArr[i6] = (((long) i6) * d2) / ((long) i3);
            long j6 = j4;
            jArr2[i6] = Math.max(j5, j6);
            if (i5 == 1) {
                i = yVar.h();
            } else if (i5 == 2) {
                i = yVar.i();
            } else if (i5 == 3) {
                i = yVar.m();
            } else if (i5 != 4) {
                return null;
            } else {
                i = yVar.w();
            }
            j5 += (long) (i * i7);
            i6++;
            j4 = j6;
            i4 = i7;
        }
        if (!(j3 == -1 || j3 == j5)) {
            q.c("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new f(jArr, jArr2, d2, j5);
    }

    public v.a a(long j) {
        int a2 = ai.a(this.f11970a, j, true, true);
        w wVar = new w(this.f11970a[a2], this.f11971b[a2]);
        if (wVar.f12457b >= j || a2 == this.f11970a.length - 1) {
            return new v.a(wVar);
        }
        int i = a2 + 1;
        return new v.a(wVar, new w(this.f11970a[i], this.f11971b[i]));
    }

    public boolean a() {
        return true;
    }

    public long b() {
        return this.f11972c;
    }

    public long c() {
        return this.f11973d;
    }

    public long c(long j) {
        return this.f11970a[ai.a(this.f11971b, j, true, true)];
    }
}
