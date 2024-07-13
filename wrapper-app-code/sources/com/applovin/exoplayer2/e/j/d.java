package com.applovin.exoplayer2.e.j;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;

final class d implements v {

    /* renamed from: a  reason: collision with root package name */
    private final b f12422a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12423b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12424c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12425d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12426e;

    public d(b bVar, int i, long j, long j2) {
        this.f12422a = bVar;
        this.f12423b = i;
        this.f12424c = j;
        long j3 = (j2 - j) / ((long) bVar.f12417e);
        this.f12425d = j3;
        this.f12426e = b(j3);
    }

    private long b(long j) {
        return ai.d(j * ((long) this.f12423b), 1000000, (long) this.f12422a.f12415c);
    }

    public v.a a(long j) {
        long a2 = ai.a((((long) this.f12422a.f12415c) * j) / (((long) this.f12423b) * 1000000), 0, this.f12425d - 1);
        long j2 = this.f12424c + (((long) this.f12422a.f12417e) * a2);
        long b2 = b(a2);
        w wVar = new w(b2, j2);
        if (b2 >= j || a2 == this.f12425d - 1) {
            return new v.a(wVar);
        }
        long j3 = a2 + 1;
        return new v.a(wVar, new w(b(j3), this.f12424c + (((long) this.f12422a.f12417e) * j3)));
    }

    public boolean a() {
        return true;
    }

    public long b() {
        return this.f12426e;
    }
}
