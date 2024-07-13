package com.applovin.exoplayer2.e.f;

import android.util.Pair;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.g.e.j;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;

final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f11959a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f11960b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11961c;

    private c(long[] jArr, long[] jArr2, long j) {
        this.f11959a = jArr;
        this.f11960b = jArr2;
        this.f11961c = j == -9223372036854775807L ? h.b(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int a2 = ai.a(jArr, j, true, true);
        long j2 = jArr[a2];
        long j3 = jArr2[a2];
        int i = a2 + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d2 = j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d2 * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public static c a(long j, j jVar, long j2) {
        int length = jVar.f12650d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (jVar.f12648b + jVar.f12650d[i3]);
            j3 += (long) (jVar.f12649c + jVar.f12651e[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new c(jArr, jArr2, j2);
    }

    public v.a a(long j) {
        Pair<Long, Long> a2 = a(h.a(ai.a(j, 0, this.f11961c)), this.f11960b, this.f11959a);
        return new v.a(new w(h.b(((Long) a2.first).longValue()), ((Long) a2.second).longValue()));
    }

    public boolean a() {
        return true;
    }

    public long b() {
        return this.f11961c;
    }

    public long c() {
        return -1;
    }

    public long c(long j) {
        return h.b(((Long) a(j, this.f11959a, this.f11960b).second).longValue());
    }
}
