package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;

public class d implements v {

    /* renamed from: a  reason: collision with root package name */
    private final long f11873a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11874b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11875c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11876d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11877e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11878f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11879g;

    public d(long j, long j2, int i, int i2, boolean z) {
        long j3;
        this.f11873a = j;
        this.f11874b = j2;
        this.f11875c = i2 == -1 ? 1 : i2;
        this.f11877e = i;
        this.f11879g = z;
        if (j == -1) {
            this.f11876d = -1;
            j3 = -9223372036854775807L;
        } else {
            this.f11876d = j - j2;
            j3 = a(j, j2, i);
        }
        this.f11878f = j3;
    }

    private static long a(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    private long c(long j) {
        int i = this.f11875c;
        long j2 = (((j * ((long) this.f11877e)) / 8000000) / ((long) i)) * ((long) i);
        long j3 = this.f11876d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - ((long) i));
        }
        return this.f11874b + Math.max(j2, 0);
    }

    public v.a a(long j) {
        if (this.f11876d == -1 && !this.f11879g) {
            return new v.a(new w(0, this.f11874b));
        }
        long c2 = c(j);
        long b2 = b(c2);
        w wVar = new w(b2, c2);
        if (this.f11876d != -1 && b2 < j) {
            int i = this.f11875c;
            if (((long) i) + c2 < this.f11873a) {
                long j2 = c2 + ((long) i);
                return new v.a(wVar, new w(b(j2), j2));
            }
        }
        return new v.a(wVar);
    }

    public boolean a() {
        return this.f11876d != -1 || this.f11879g;
    }

    public long b() {
        return this.f11878f;
    }

    public long b(long j) {
        return a(j, this.f11874b, this.f11877e);
    }
}
