package com.applovin.exoplayer2;

import android.os.SystemClock;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.b.d;
import com.applovin.exoplayer2.l.ai;

public final class k implements z {

    /* renamed from: a  reason: collision with root package name */
    private final float f13315a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13316b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13317c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13318d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13319e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13320f;

    /* renamed from: g  reason: collision with root package name */
    private final float f13321g;

    /* renamed from: h  reason: collision with root package name */
    private long f13322h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private float f13323a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f13324b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f13325c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f13326d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f13327e = h.b(20);

        /* renamed from: f  reason: collision with root package name */
        private long f13328f = h.b(500);

        /* renamed from: g  reason: collision with root package name */
        private float f13329g = 0.999f;

        public k a() {
            return new k(this.f13323a, this.f13324b, this.f13325c, this.f13326d, this.f13327e, this.f13328f, this.f13329g);
        }
    }

    private k(float f2, float f3, long j2, float f4, long j3, long j4, float f5) {
        this.f13315a = f2;
        this.f13316b = f3;
        this.f13317c = j2;
        this.f13318d = f4;
        this.f13319e = j3;
        this.f13320f = j4;
        this.f13321g = f5;
        this.f13322h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f2;
        this.n = f3;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    private static long a(long j2, long j3, float f2) {
        return (long) ((((float) j2) * f2) + ((1.0f - f2) * ((float) j3)));
    }

    private void b(long j2) {
        long j3 = this.r + (this.s * 3);
        if (this.m > j3) {
            float b2 = (float) h.b(this.f13317c);
            this.m = d.a(j3, this.j, this.m - (((long) ((this.p - 1.0f) * b2)) + ((long) ((this.n - 1.0f) * b2))));
            return;
        }
        long a2 = ai.a(j2 - ((long) (Math.max(0.0f, this.p - 1.0f) / this.f13318d)), this.m, j3);
        this.m = a2;
        long j4 = this.l;
        if (j4 != -9223372036854775807L && a2 > j4) {
            this.m = j4;
        }
    }

    private void b(long j2, long j3) {
        long j4;
        long j5 = j2 - j3;
        long j6 = this.r;
        if (j6 == -9223372036854775807L) {
            this.r = j5;
            j4 = 0;
        } else {
            long max = Math.max(j5, a(j6, j5, this.f13321g));
            this.r = max;
            j4 = a(this.s, Math.abs(j5 - max), this.f13321g);
        }
        this.s = j4;
    }

    private void c() {
        long j2 = this.f13322h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.j != j2) {
            this.j = j2;
            this.m = j2;
            this.r = -9223372036854775807L;
            this.s = -9223372036854775807L;
            this.q = -9223372036854775807L;
        }
    }

    public float a(long j2, long j3) {
        if (this.f13322h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j2, j3);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.f13317c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        b(j2);
        long j4 = j2 - this.m;
        if (Math.abs(j4) < this.f13319e) {
            this.p = 1.0f;
        } else {
            this.p = ai.a((this.f13318d * ((float) j4)) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    public void a() {
        long j2 = this.m;
        if (j2 != -9223372036854775807L) {
            long j3 = j2 + this.f13320f;
            this.m = j3;
            long j4 = this.l;
            if (j4 != -9223372036854775807L && j3 > j4) {
                this.m = j4;
            }
            this.q = -9223372036854775807L;
        }
    }

    public void a(long j2) {
        this.i = j2;
        c();
    }

    public void a(ab.e eVar) {
        this.f13322h = h.b(eVar.f11014b);
        this.k = h.b(eVar.f11015c);
        this.l = h.b(eVar.f11016d);
        this.o = eVar.f11017e != -3.4028235E38f ? eVar.f11017e : this.f13315a;
        this.n = eVar.f11018f != -3.4028235E38f ? eVar.f11018f : this.f13316b;
        c();
    }

    public long b() {
        return this.m;
    }
}
