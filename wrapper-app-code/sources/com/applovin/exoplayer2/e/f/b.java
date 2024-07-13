package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.r;

final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final long f11955a;

    /* renamed from: b  reason: collision with root package name */
    private final r f11956b = new r();

    /* renamed from: c  reason: collision with root package name */
    private final r f11957c = new r();

    /* renamed from: d  reason: collision with root package name */
    private long f11958d;

    public b(long j, long j2, long j3) {
        this.f11958d = j;
        this.f11955a = j3;
        this.f11956b.a(0);
        this.f11957c.a(j2);
    }

    public v.a a(long j) {
        int a2 = ai.a(this.f11956b, j, true, true);
        w wVar = new w(this.f11956b.a(a2), this.f11957c.a(a2));
        if (wVar.f12457b == j || a2 == this.f11956b.a() - 1) {
            return new v.a(wVar);
        }
        int i = a2 + 1;
        return new v.a(wVar, new w(this.f11956b.a(i), this.f11957c.a(i)));
    }

    public void a(long j, long j2) {
        if (!b(j)) {
            this.f11956b.a(j);
            this.f11957c.a(j2);
        }
    }

    public boolean a() {
        return true;
    }

    public long b() {
        return this.f11958d;
    }

    public boolean b(long j) {
        r rVar = this.f11956b;
        return j - rVar.a(rVar.a() - 1) < 100000;
    }

    public long c() {
        return this.f11955a;
    }

    public long c(long j) {
        return this.f11956b.a(ai.a(this.f11957c, j, true, true));
    }

    /* access modifiers changed from: package-private */
    public void d(long j) {
        this.f11958d = j;
    }
}
