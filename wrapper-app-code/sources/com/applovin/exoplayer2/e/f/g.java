package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final long f11974a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11975b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11976c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11977d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11978e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f11979f;

    private g(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private g(long j, int i, long j2, long j3, long[] jArr) {
        this.f11974a = j;
        this.f11975b = i;
        this.f11976c = j2;
        this.f11979f = jArr;
        this.f11977d = j3;
        this.f11978e = j3 != -1 ? j + j3 : -1;
    }

    private long a(int i) {
        return (this.f11976c * ((long) i)) / 100;
    }

    public static g a(long j, long j2, r.a aVar, y yVar) {
        int w;
        long j3 = j;
        r.a aVar2 = aVar;
        int i = aVar2.f11333g;
        int i2 = aVar2.f11330d;
        int q = yVar.q();
        if ((q & 1) != 1 || (w = yVar.w()) == 0) {
            return null;
        }
        long d2 = ai.d((long) w, ((long) i) * 1000000, (long) i2);
        if ((q & 6) != 6) {
            return new g(j2, aVar2.f11329c, d2);
        }
        long o = yVar.o();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) yVar.h();
        }
        if (j3 != -1) {
            long j4 = j2 + o;
            if (j3 != j4) {
                q.c("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new g(j2, aVar2.f11329c, d2, o, jArr);
    }

    public v.a a(long j) {
        if (!a()) {
            return new v.a(new w(0, this.f11974a + ((long) this.f11975b)));
        }
        long a2 = ai.a(j, 0, this.f11976c);
        double d2 = (((double) a2) * 100.0d) / ((double) this.f11976c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) a.a(this.f11979f);
                double d4 = (double) jArr[i];
                d3 = d4 + ((d2 - ((double) i)) * ((i == 99 ? 256.0d : (double) jArr[i + 1]) - d4));
            }
        }
        return new v.a(new w(a2, this.f11974a + ai.a(Math.round((d3 / 256.0d) * ((double) this.f11977d)), (long) this.f11975b, this.f11977d - 1)));
    }

    public boolean a() {
        return this.f11979f != null;
    }

    public long b() {
        return this.f11976c;
    }

    public long c() {
        return this.f11978e;
    }

    public long c(long j) {
        long j2 = j - this.f11974a;
        if (!a() || j2 <= ((long) this.f11975b)) {
            return 0;
        }
        long[] jArr = (long[]) a.a(this.f11979f);
        double d2 = (((double) j2) * 256.0d) / ((double) this.f11977d);
        int a2 = ai.a(jArr, (long) d2, true, true);
        long a3 = a(a2);
        long j3 = jArr[a2];
        int i = a2 + 1;
        long a4 = a(i);
        long j4 = a2 == 99 ? 256 : jArr[i];
        return a3 + Math.round((j3 == j4 ? 0.0d : (d2 - ((double) j3)) / ((double) (j4 - j3))) * ((double) (a4 - a3)));
    }
}
