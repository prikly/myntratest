package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.q;
import com.applovin.exoplayer2.l.a;

final class c extends q {

    /* renamed from: a  reason: collision with root package name */
    private final long f11894a;

    public c(i iVar, long j) {
        super(iVar);
        a.a(iVar.c() >= j);
        this.f11894a = j;
    }

    public long b() {
        return super.b() - this.f11894a;
    }

    public long c() {
        return super.c() - this.f11894a;
    }

    public long d() {
        return super.d() - this.f11894a;
    }
}
