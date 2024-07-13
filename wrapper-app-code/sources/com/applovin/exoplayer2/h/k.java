package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.k.b;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

public final class k implements n, n.a {

    /* renamed from: a  reason: collision with root package name */
    public final p.a f12802a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12803b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12804c;

    /* renamed from: d  reason: collision with root package name */
    private p f12805d;

    /* renamed from: e  reason: collision with root package name */
    private n f12806e;

    /* renamed from: f  reason: collision with root package name */
    private n.a f12807f;

    /* renamed from: g  reason: collision with root package name */
    private a f12808g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12809h;
    private long i = -9223372036854775807L;

    public interface a {
        void a(p.a aVar);

        void a(p.a aVar, IOException iOException);
    }

    public k(p.a aVar, b bVar, long j) {
        this.f12802a = aVar;
        this.f12804c = bVar;
        this.f12803b = j;
    }

    private long e(long j) {
        long j2 = this.i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public long a(long j, av avVar) {
        return ((n) ai.a(this.f12806e)).a(j, avVar);
    }

    public long a(d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.i;
        if (j3 == -9223372036854775807L || j != this.f12803b) {
            j2 = j;
        } else {
            this.i = -9223372036854775807L;
            j2 = j3;
        }
        return ((n) ai.a(this.f12806e)).a(dVarArr, zArr, xVarArr, zArr2, j2);
    }

    public void a(long j) {
        ((n) ai.a(this.f12806e)).a(j);
    }

    public void a(long j, boolean z) {
        ((n) ai.a(this.f12806e)).a(j, z);
    }

    public void a(n.a aVar, long j) {
        this.f12807f = aVar;
        n nVar = this.f12806e;
        if (nVar != null) {
            nVar.a((n.a) this, e(this.f12803b));
        }
    }

    public void a(n nVar) {
        ((n.a) ai.a(this.f12807f)).a(this);
        a aVar = this.f12808g;
        if (aVar != null) {
            aVar.a(this.f12802a);
        }
    }

    public void a(p.a aVar) {
        long e2 = e(this.f12803b);
        n b2 = ((p) com.applovin.exoplayer2.l.a.b(this.f12805d)).b(aVar, this.f12804c, e2);
        this.f12806e = b2;
        if (this.f12807f != null) {
            b2.a((n.a) this, e2);
        }
    }

    public void a(p pVar) {
        com.applovin.exoplayer2.l.a.b(this.f12805d == null);
        this.f12805d = pVar;
    }

    public long b(long j) {
        return ((n) ai.a(this.f12806e)).b(j);
    }

    public ad b() {
        return ((n) ai.a(this.f12806e)).b();
    }

    /* renamed from: b */
    public void a(n nVar) {
        ((n.a) ai.a(this.f12807f)).a(this);
    }

    public long c() {
        return ((n) ai.a(this.f12806e)).c();
    }

    public boolean c(long j) {
        n nVar = this.f12806e;
        return nVar != null && nVar.c(j);
    }

    public long d() {
        return ((n) ai.a(this.f12806e)).d();
    }

    public void d(long j) {
        this.i = j;
    }

    public long e() {
        return ((n) ai.a(this.f12806e)).e();
    }

    public void e_() throws IOException {
        try {
            if (this.f12806e != null) {
                this.f12806e.e_();
            } else if (this.f12805d != null) {
                this.f12805d.e();
            }
        } catch (IOException e2) {
            a aVar = this.f12808g;
            if (aVar == null) {
                throw e2;
            } else if (!this.f12809h) {
                this.f12809h = true;
                aVar.a(this.f12802a, e2);
            }
        }
    }

    public boolean f() {
        n nVar = this.f12806e;
        return nVar != null && nVar.f();
    }

    public long g() {
        return this.f12803b;
    }

    public long h() {
        return this.i;
    }

    public void i() {
        if (this.f12806e != null) {
            ((p) com.applovin.exoplayer2.l.a.b(this.f12805d)).a(this.f12806e);
        }
    }
}
