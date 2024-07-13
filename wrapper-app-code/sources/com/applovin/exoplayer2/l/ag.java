package com.applovin.exoplayer2.l;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    private long f13521a;

    /* renamed from: b  reason: collision with root package name */
    private long f13522b;

    /* renamed from: c  reason: collision with root package name */
    private long f13523c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Long> f13524d = new ThreadLocal<>();

    public ag(long j) {
        a(j);
    }

    public static long d(long j) {
        return (j * 1000000) / 90000;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public synchronized long a() {
        long j;
        if (this.f13521a != Long.MAX_VALUE) {
            if (this.f13521a != 9223372036854775806L) {
                j = this.f13521a;
            }
        }
        j = -9223372036854775807L;
        return j;
    }

    public synchronized void a(long j) {
        this.f13521a = j;
        this.f13522b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f13523c = -9223372036854775807L;
    }

    public synchronized long b() {
        return this.f13523c != -9223372036854775807L ? this.f13523c + this.f13522b : a();
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13523c != -9223372036854775807L) {
            long e2 = e(this.f13523c);
            long j2 = (4294967296L + e2) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e2) < Math.abs(j - e2)) {
                j = j3;
            }
        }
        return c(d(j));
    }

    public synchronized long c() {
        return this.f13522b;
    }

    public synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13522b == -9223372036854775807L) {
            this.f13522b = (this.f13521a == 9223372036854775806L ? ((Long) a.b(this.f13524d.get())).longValue() : this.f13521a) - j;
            notifyAll();
        }
        this.f13523c = j;
        return j + this.f13522b;
    }
}
