package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final d f12126a = new d();

    /* renamed from: b  reason: collision with root package name */
    private x f12127b;

    /* renamed from: c  reason: collision with root package name */
    private j f12128c;

    /* renamed from: d  reason: collision with root package name */
    private f f12129d;

    /* renamed from: e  reason: collision with root package name */
    private long f12130e;

    /* renamed from: f  reason: collision with root package name */
    private long f12131f;

    /* renamed from: g  reason: collision with root package name */
    private long f12132g;

    /* renamed from: h  reason: collision with root package name */
    private int f12133h;
    private int i;
    private a j = new a();
    private long k;
    private boolean l;
    private boolean m;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        v f12134a;

        /* renamed from: b  reason: collision with root package name */
        f f12135b;

        a() {
        }
    }

    private static final class b implements f {
        private b() {
        }

        public long a(i iVar) {
            return -1;
        }

        public void a(long j) {
        }

        public com.applovin.exoplayer2.e.v b() {
            return new v.b(-9223372036854775807L);
        }
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f12127b);
        ai.a(this.f12128c);
    }

    private boolean a(i iVar) throws IOException {
        while (this.f12126a.a(iVar)) {
            this.k = iVar.c() - this.f12131f;
            if (!a(this.f12126a.c(), this.f12131f, this.j)) {
                return true;
            }
            this.f12131f = iVar.c();
        }
        this.f12133h = 3;
        return false;
    }

    private int b(i iVar) throws IOException {
        f bVar;
        if (!a(iVar)) {
            return -1;
        }
        this.i = this.j.f12134a.z;
        if (!this.m) {
            this.f12127b.a(this.j.f12134a);
            this.m = true;
        }
        if (this.j.f12135b != null) {
            bVar = this.j.f12135b;
        } else if (iVar.d() == -1) {
            bVar = new b();
        } else {
            e b2 = this.f12126a.b();
            this.f12129d = new a(this, this.f12131f, iVar.d(), (long) (b2.f12123h + b2.i), b2.f12118c, (b2.f12117b & 4) != 0);
            this.f12133h = 2;
            this.f12126a.d();
            return 0;
        }
        this.f12129d = bVar;
        this.f12133h = 2;
        this.f12126a.d();
        return 0;
    }

    private int b(i iVar, u uVar) throws IOException {
        i iVar2 = iVar;
        long a2 = this.f12129d.a(iVar2);
        if (a2 >= 0) {
            uVar.f12451a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.l) {
            this.f12128c.a((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.a(this.f12129d.b()));
            this.l = true;
        }
        if (this.k > 0 || this.f12126a.a(iVar2)) {
            this.k = 0;
            y c2 = this.f12126a.c();
            long b2 = b(c2);
            if (b2 >= 0) {
                long j2 = this.f12132g;
                if (j2 + b2 >= this.f12130e) {
                    long a3 = a(j2);
                    this.f12127b.a(c2, c2.b());
                    this.f12127b.a(a3, 1, c2.b(), 0, (x.a) null);
                    this.f12130e = -1;
                }
            }
            this.f12132g += b2;
            return 0;
        }
        this.f12133h = 3;
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int a(i iVar, u uVar) throws IOException {
        a();
        int i2 = this.f12133h;
        if (i2 == 0) {
            return b(iVar);
        }
        if (i2 == 1) {
            iVar.b((int) this.f12131f);
            this.f12133h = 2;
            return 0;
        } else if (i2 == 2) {
            ai.a(this.f12129d);
            return b(iVar, uVar);
        } else if (i2 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, long j3) {
        this.f12126a.a();
        if (j2 == 0) {
            a(!this.l);
        } else if (this.f12133h != 0) {
            this.f12130e = b(j3);
            ((f) ai.a(this.f12129d)).a(this.f12130e);
            this.f12133h = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar, x xVar) {
        this.f12128c = jVar;
        this.f12127b = xVar;
        a(true);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        int i2;
        if (z) {
            this.j = new a();
            this.f12131f = 0;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.f12133h = i2;
        this.f12130e = -1;
        this.f12132g = 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(y yVar, long j2, a aVar) throws IOException;

    /* access modifiers changed from: protected */
    public long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: protected */
    public abstract long b(y yVar);

    /* access modifiers changed from: protected */
    public void c(long j2) {
        this.f12132g = j2;
    }
}
