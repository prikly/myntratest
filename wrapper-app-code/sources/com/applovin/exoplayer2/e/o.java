package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

public final class o implements v {

    /* renamed from: a  reason: collision with root package name */
    private final p f12430a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12431b;

    public o(p pVar, long j) {
        this.f12430a = pVar;
        this.f12431b = j;
    }

    private w a(long j, long j2) {
        return new w((j * 1000000) / ((long) this.f12430a.f12436e), this.f12431b + j2);
    }

    public v.a a(long j) {
        a.a(this.f12430a.k);
        long[] jArr = this.f12430a.k.f12440a;
        long[] jArr2 = this.f12430a.k.f12441b;
        int a2 = ai.a(jArr, this.f12430a.a(j), true, false);
        long j2 = 0;
        long j3 = a2 == -1 ? 0 : jArr[a2];
        if (a2 != -1) {
            j2 = jArr2[a2];
        }
        w a3 = a(j3, j2);
        if (a3.f12457b == j || a2 == jArr.length - 1) {
            return new v.a(a3);
        }
        int i = a2 + 1;
        return new v.a(a3, a(jArr[i], jArr2[i]));
    }

    public boolean a() {
        return true;
    }

    public long b() {
        return this.f12430a.a();
    }
}
