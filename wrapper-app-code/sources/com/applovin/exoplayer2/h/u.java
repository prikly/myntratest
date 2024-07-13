package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.d.d;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.e.f;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.s;
import com.applovin.exoplayer2.h.t;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.k.aa;
import com.applovin.exoplayer2.k.b;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.r;
import com.applovin.exoplayer2.k.v;

public final class u extends a implements t.b {

    /* renamed from: a  reason: collision with root package name */
    private final ab f12863a;

    /* renamed from: b  reason: collision with root package name */
    private final ab.f f12864b;

    /* renamed from: c  reason: collision with root package name */
    private final i.a f12865c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f12866d;

    /* renamed from: e  reason: collision with root package name */
    private final h f12867e;

    /* renamed from: f  reason: collision with root package name */
    private final v f12868f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12869g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12870h;
    private long i;
    private boolean j;
    private boolean k;
    private aa l;

    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i.a f12872a;

        /* renamed from: b  reason: collision with root package name */
        private s.a f12873b;

        /* renamed from: c  reason: collision with root package name */
        private com.applovin.exoplayer2.d.i f12874c;

        /* renamed from: d  reason: collision with root package name */
        private v f12875d;

        /* renamed from: e  reason: collision with root package name */
        private int f12876e;

        /* renamed from: f  reason: collision with root package name */
        private String f12877f;

        /* renamed from: g  reason: collision with root package name */
        private Object f12878g;

        public a(i.a aVar) {
            this(aVar, (l) new f());
        }

        public a(i.a aVar, l lVar) {
            this(aVar, (s.a) new s.a() {
                public final s createProgressiveMediaExtractor() {
                    return u.a.a(l.this);
                }
            });
        }

        public a(i.a aVar, s.a aVar2) {
            this.f12872a = aVar;
            this.f12873b = aVar2;
            this.f12874c = new d();
            this.f12875d = new r();
            this.f12876e = 1048576;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ s a(l lVar) {
            return new c(lVar);
        }

        public u a(ab abVar) {
            ab.b bVar;
            ab.b a2;
            com.applovin.exoplayer2.l.a.b(abVar.f10976c);
            boolean z = true;
            boolean z2 = abVar.f10976c.f11031h == null && this.f12878g != null;
            if (abVar.f10976c.f11029f != null || this.f12877f == null) {
                z = false;
            }
            if (z2 && z) {
                a2 = abVar.a().a(this.f12878g);
            } else if (z2) {
                bVar = abVar.a().a(this.f12878g);
                abVar = bVar.a();
                ab abVar2 = abVar;
                return new u(abVar2, this.f12872a, this.f12873b, this.f12874c.a(abVar2), this.f12875d, this.f12876e);
            } else {
                if (z) {
                    a2 = abVar.a();
                }
                ab abVar22 = abVar;
                return new u(abVar22, this.f12872a, this.f12873b, this.f12874c.a(abVar22), this.f12875d, this.f12876e);
            }
            bVar = a2.b(this.f12877f);
            abVar = bVar.a();
            ab abVar222 = abVar;
            return new u(abVar222, this.f12872a, this.f12873b, this.f12874c.a(abVar222), this.f12875d, this.f12876e);
        }
    }

    private u(ab abVar, i.a aVar, s.a aVar2, h hVar, v vVar, int i2) {
        this.f12864b = (ab.f) com.applovin.exoplayer2.l.a.b(abVar.f10976c);
        this.f12863a = abVar;
        this.f12865c = aVar;
        this.f12866d = aVar2;
        this.f12867e = hVar;
        this.f12868f = vVar;
        this.f12869g = i2;
        this.f12870h = true;
        this.i = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.applovin.exoplayer2.h.u$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r9 = this;
            com.applovin.exoplayer2.h.aa r8 = new com.applovin.exoplayer2.h.aa
            long r1 = r9.i
            boolean r3 = r9.j
            boolean r5 = r9.k
            com.applovin.exoplayer2.ab r7 = r9.f12863a
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f12870h
            if (r0 == 0) goto L_0x001a
            com.applovin.exoplayer2.h.u$1 r0 = new com.applovin.exoplayer2.h.u$1
            r0.<init>(r8)
            r8 = r0
        L_0x001a:
            r9.a((com.applovin.exoplayer2.ba) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.u.f():void");
    }

    public void a(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.i;
        }
        if (this.f12870h || this.i != j2 || this.j != z || this.k != z2) {
            this.i = j2;
            this.j = z;
            this.k = z2;
            this.f12870h = false;
            f();
        }
    }

    public void a(n nVar) {
        ((t) nVar).g();
    }

    /* access modifiers changed from: protected */
    public void a(aa aaVar) {
        this.l = aaVar;
        this.f12867e.a();
        f();
    }

    public n b(p.a aVar, b bVar, long j2) {
        i a2 = this.f12865c.a();
        aa aaVar = this.l;
        if (aaVar != null) {
            a2.a(aaVar);
        }
        return new t(this.f12864b.f11024a, a2, this.f12866d.createProgressiveMediaExtractor(), this.f12867e, b(aVar), this.f12868f, a(aVar), this, bVar, this.f12864b.f11029f, this.f12869g);
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f12867e.b();
    }

    public void e() {
    }

    public ab g() {
        return this.f12863a;
    }
}
