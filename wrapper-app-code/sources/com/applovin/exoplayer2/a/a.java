package com.applovin.exoplayer2.a;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.c.e;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.a.x;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.j;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.m;
import com.applovin.exoplayer2.l.o;
import com.applovin.exoplayer2.l.p;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;

public class a implements an.d, g, com.applovin.exoplayer2.d.g, q, d.a, n {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f10949a;

    /* renamed from: b  reason: collision with root package name */
    private final ba.a f10950b = new ba.a();

    /* renamed from: c  reason: collision with root package name */
    private final ba.c f10951c = new ba.c();

    /* renamed from: d  reason: collision with root package name */
    private final C0103a f10952d = new C0103a(this.f10950b);

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<b.a> f10953e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private p<b> f10954f;

    /* renamed from: g  reason: collision with root package name */
    private an f10955g;

    /* renamed from: h  reason: collision with root package name */
    private o f10956h;
    private boolean i;

    /* renamed from: com.applovin.exoplayer2.a.a$a  reason: collision with other inner class name */
    private static final class C0103a {

        /* renamed from: a  reason: collision with root package name */
        private final ba.a f10957a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public s<p.a> f10958b = s.g();

        /* renamed from: c  reason: collision with root package name */
        private u<p.a, ba> f10959c = u.a();

        /* renamed from: d  reason: collision with root package name */
        private p.a f10960d;

        /* renamed from: e  reason: collision with root package name */
        private p.a f10961e;

        /* renamed from: f  reason: collision with root package name */
        private p.a f10962f;

        public C0103a(ba.a aVar) {
            this.f10957a = aVar;
        }

        private static p.a a(an anVar, s<p.a> sVar, p.a aVar, ba.a aVar2) {
            ba S = anVar.S();
            int F = anVar.F();
            Object a2 = S.d() ? null : S.a(F);
            int b2 = (anVar.K() || S.d()) ? -1 : S.a(F, aVar2).b(h.b(anVar.I()) - aVar2.c());
            for (int i = 0; i < sVar.size(); i++) {
                p.a aVar3 = (p.a) sVar.get(i);
                if (a(aVar3, a2, anVar.K(), anVar.L(), anVar.M(), b2)) {
                    return aVar3;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (a(aVar, a2, anVar.K(), anVar.L(), anVar.M(), b2)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
            if (r3.f10958b.contains(r3.f10960d) == false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            if (com.applovin.exoplayer2.common.base.Objects.equal(r3.f10960d, r3.f10962f) == false) goto L_0x0056;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(com.applovin.exoplayer2.ba r4) {
            /*
                r3 = this;
                com.applovin.exoplayer2.common.a.u$a r0 = com.applovin.exoplayer2.common.a.u.b()
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r1 = r3.f10958b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0035
                com.applovin.exoplayer2.h.p$a r1 = r3.f10961e
                r3.a((com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, com.applovin.exoplayer2.ba>) r0, (com.applovin.exoplayer2.h.p.a) r1, (com.applovin.exoplayer2.ba) r4)
                com.applovin.exoplayer2.h.p$a r1 = r3.f10962f
                com.applovin.exoplayer2.h.p$a r2 = r3.f10961e
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x0020
                com.applovin.exoplayer2.h.p$a r1 = r3.f10962f
                r3.a((com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, com.applovin.exoplayer2.ba>) r0, (com.applovin.exoplayer2.h.p.a) r1, (com.applovin.exoplayer2.ba) r4)
            L_0x0020:
                com.applovin.exoplayer2.h.p$a r1 = r3.f10960d
                com.applovin.exoplayer2.h.p$a r2 = r3.f10961e
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x005b
                com.applovin.exoplayer2.h.p$a r1 = r3.f10960d
                com.applovin.exoplayer2.h.p$a r2 = r3.f10962f
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x005b
                goto L_0x0056
            L_0x0035:
                r1 = 0
            L_0x0036:
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r2 = r3.f10958b
                int r2 = r2.size()
                if (r1 >= r2) goto L_0x004c
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r2 = r3.f10958b
                java.lang.Object r2 = r2.get(r1)
                com.applovin.exoplayer2.h.p$a r2 = (com.applovin.exoplayer2.h.p.a) r2
                r3.a((com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, com.applovin.exoplayer2.ba>) r0, (com.applovin.exoplayer2.h.p.a) r2, (com.applovin.exoplayer2.ba) r4)
                int r1 = r1 + 1
                goto L_0x0036
            L_0x004c:
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r1 = r3.f10958b
                com.applovin.exoplayer2.h.p$a r2 = r3.f10960d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x005b
            L_0x0056:
                com.applovin.exoplayer2.h.p$a r1 = r3.f10960d
                r3.a((com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, com.applovin.exoplayer2.ba>) r0, (com.applovin.exoplayer2.h.p.a) r1, (com.applovin.exoplayer2.ba) r4)
            L_0x005b:
                com.applovin.exoplayer2.common.a.u r4 = r0.a()
                r3.f10959c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.a.a.C0103a.a(com.applovin.exoplayer2.ba):void");
        }

        private void a(u.a<p.a, ba> aVar, p.a aVar2, ba baVar) {
            if (aVar2 != null) {
                if (baVar.c(aVar2.f12829a) != -1 || (baVar = this.f10959c.get(aVar2)) != null) {
                    aVar.a(aVar2, baVar);
                }
            }
        }

        private static boolean a(p.a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f12829a.equals(obj)) {
                return false;
            }
            return (z && aVar.f12830b == i && aVar.f12831c == i2) || (!z && aVar.f12830b == -1 && aVar.f12833e == i3);
        }

        public ba a(p.a aVar) {
            return this.f10959c.get(aVar);
        }

        public p.a a() {
            return this.f10960d;
        }

        public void a(an anVar) {
            this.f10960d = a(anVar, this.f10958b, this.f10961e, this.f10957a);
        }

        public void a(List<p.a> list, p.a aVar, an anVar) {
            this.f10958b = s.a(list);
            if (!list.isEmpty()) {
                this.f10961e = list.get(0);
                this.f10962f = (p.a) com.applovin.exoplayer2.l.a.b(aVar);
            }
            if (this.f10960d == null) {
                this.f10960d = a(anVar, this.f10958b, this.f10961e, this.f10957a);
            }
            a(anVar.S());
        }

        public p.a b() {
            return this.f10961e;
        }

        public void b(an anVar) {
            this.f10960d = a(anVar, this.f10958b, this.f10961e, this.f10957a);
            a(anVar.S());
        }

        public p.a c() {
            return this.f10962f;
        }

        public p.a d() {
            if (this.f10958b.isEmpty()) {
                return null;
            }
            return (p.a) x.c(this.f10958b);
        }
    }

    public a(com.applovin.exoplayer2.l.d dVar) {
        this.f10949a = (com.applovin.exoplayer2.l.d) com.applovin.exoplayer2.l.a.b(dVar);
        this.f10954f = new com.applovin.exoplayer2.l.p<>(ai.c(), dVar, $$Lambda$a$JouN47HfkIX07cBffWHZb6J5e7Y.INSTANCE);
    }

    private b.a a(p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f10955g);
        ba a2 = aVar == null ? null : this.f10952d.a(aVar);
        if (aVar != null && a2 != null) {
            return a(a2, a2.a(aVar.f12829a, this.f10950b).f11364c, aVar);
        }
        int G = this.f10955g.G();
        ba S = this.f10955g.S();
        if (!(G < S.b())) {
            S = ba.f11359a;
        }
        return a(S, G, (p.a) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i2, b bVar) {
        bVar.c(aVar);
        bVar.f(aVar, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i2, an.e eVar, an.e eVar2, b bVar) {
        bVar.d(aVar, i2);
        bVar.a(aVar, eVar, eVar2, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, e eVar, b bVar) {
        bVar.d(aVar, eVar);
        bVar.b(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.m.o oVar, b bVar) {
        bVar.a(aVar, oVar);
        bVar.a(aVar, oVar.f13758b, oVar.f13759c, oVar.f13760d, oVar.f13761e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.b(aVar, vVar);
        bVar.b(aVar, vVar, hVar);
        bVar.a(aVar, 2, vVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.b(aVar, str, j);
        long j3 = j;
        bVar.b(aVar, str, j2, j3);
        bVar.a(aVar, 2, str, j3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, m mVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(an anVar, b bVar, m mVar) {
        bVar.a(anVar, new b.C0104b(mVar, this.f10953e));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, e eVar, b bVar) {
        bVar.c(aVar, eVar);
        bVar.a(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.a(aVar, vVar);
        bVar.a(aVar, vVar, hVar);
        bVar.a(aVar, 1, vVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.a(aVar, str, j);
        long j3 = j;
        bVar.a(aVar, str, j2, j3);
        bVar.a(aVar, 1, str, j3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, e eVar, b bVar) {
        bVar.b(aVar, eVar);
        bVar.b(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, boolean z, b bVar) {
        bVar.d(aVar, z);
        bVar.c(aVar, z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(b.a aVar, e eVar, b bVar) {
        bVar.a(aVar, eVar);
        bVar.a(aVar, 1, eVar);
    }

    private b.a f() {
        return a(this.f10952d.b());
    }

    private b.a f(int i2, p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f10955g);
        boolean z = true;
        if (aVar != null) {
            if (this.f10952d.a(aVar) == null) {
                z = false;
            }
            return z ? a(aVar) : a(ba.f11359a, i2, aVar);
        }
        ba S = this.f10955g.S();
        if (i2 >= S.b()) {
            z = false;
        }
        if (!z) {
            S = ba.f11359a;
        }
        return a(S, i2, (p.a) null);
    }

    private b.a g() {
        return a(this.f10952d.c());
    }

    private b.a h() {
        return a(this.f10952d.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f10954f.b();
    }

    /* access modifiers changed from: protected */
    public final b.a a(ba baVar, int i2, p.a aVar) {
        long j;
        ba baVar2 = baVar;
        int i3 = i2;
        p.a aVar2 = baVar.d() ? null : aVar;
        long a2 = this.f10949a.a();
        boolean z = true;
        boolean z2 = baVar2.equals(this.f10955g.S()) && i3 == this.f10955g.G();
        long j2 = 0;
        if (aVar2 != null && aVar2.a()) {
            if (!(z2 && this.f10955g.L() == aVar2.f12830b && this.f10955g.M() == aVar2.f12831c)) {
                z = false;
            }
            if (z) {
                j2 = this.f10955g.I();
            }
        } else if (z2) {
            j = this.f10955g.N();
            return new b.a(a2, baVar, i2, aVar2, j, this.f10955g.S(), this.f10955g.G(), this.f10952d.a(), this.f10955g.I(), this.f10955g.J());
        } else if (!baVar.d()) {
            j2 = baVar2.a(i3, this.f10951c).a();
        }
        j = j2;
        return new b.a(a2, baVar, i2, aVar2, j, this.f10955g.S(), this.f10955g.G(), this.f10952d.a(), this.f10955g.I(), this.f10955g.J());
    }

    public /* synthetic */ void a() {
        an.d.CC.$default$a(this);
    }

    public final void a(float f2) {
        b.a g2 = g();
        a(g2, 1019, (p.a<b>) new p.a(f2) {
            public final /* synthetic */ float f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public void a(int i2, int i3) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, (p.a<b>) new p.a(i2, i3) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void a(int i2, long j) {
        b.a f2 = f();
        a(f2, (int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (p.a<b>) new p.a(i2, j) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void a(int i2, long j, long j2) {
        b.a g2 = g();
        a(g2, 1012, (p.a<b>) new p.a(i2, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public final void a(int i2, p.a aVar) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).d(b.a.this);
            }
        });
    }

    public final void a(int i2, p.a aVar, int i3) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, (p.a<b>) new p.a(i3) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public final void a(int i2, p.a aVar, j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f2 = f(i2, aVar);
        a(f2, 1000, (p.a<b>) new p.a(jVar, mVar) {
            public final /* synthetic */ j f$1;
            public final /* synthetic */ com.applovin.exoplayer2.h.m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void a(int i2, p.a aVar, j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z) {
        b.a f2 = f(i2, aVar);
        a(f2, 1003, (p.a<b>) new p.a(jVar, mVar, iOException, z) {
            public final /* synthetic */ j f$1;
            public final /* synthetic */ com.applovin.exoplayer2.h.m f$2;
            public final /* synthetic */ IOException f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public final void a(int i2, p.a aVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f2 = f(i2, aVar);
        a(f2, 1004, (p.a<b>) new p.a(mVar) {
            public final /* synthetic */ com.applovin.exoplayer2.h.m f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void a(int i2, p.a aVar, Exception exc) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, (p.a<b>) new p.a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).d(b.a.this, this.f$1);
            }
        });
    }

    public /* synthetic */ void a(int i2, boolean z) {
        an.d.CC.$default$a((an.d) this, i2, z);
    }

    public final void a(long j) {
        b.a g2 = g();
        a(g2, (int) IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, (p.a<b>) new p.a(j) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void a(long j, int i2) {
        b.a f2 = f();
        a(f2, (int) IronSourceError.ERROR_RV_LOAD_DURING_LOAD, (p.a<b>) new p.a(j, i2) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void a(b.a aVar, int i2, p.a<b> aVar2) {
        this.f10953e.put(i2, aVar);
        this.f10954f.b(i2, aVar2);
    }

    public final void a(ab abVar, int i2) {
        b.a e2 = e();
        a(e2, 1, (p.a<b>) new p.a(abVar, i2) {
            public final /* synthetic */ ab f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public void a(ac acVar) {
        b.a e2 = e();
        a(e2, 14, (p.a<b>) new p.a(acVar) {
            public final /* synthetic */ ac f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.applovin.exoplayer2.ak r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.applovin.exoplayer2.p
            if (r0 == 0) goto L_0x0017
            r0 = r4
            com.applovin.exoplayer2.p r0 = (com.applovin.exoplayer2.p) r0
            com.applovin.exoplayer2.h.o r1 = r0.f13781f
            if (r1 == 0) goto L_0x0017
            com.applovin.exoplayer2.h.p$a r1 = new com.applovin.exoplayer2.h.p$a
            com.applovin.exoplayer2.h.o r0 = r0.f13781f
            r1.<init>((com.applovin.exoplayer2.h.o) r0)
            com.applovin.exoplayer2.a.b$a r0 = r3.a((com.applovin.exoplayer2.h.p.a) r1)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            com.applovin.exoplayer2.a.b$a r0 = r3.e()
        L_0x001e:
            r1 = 10
            com.applovin.exoplayer2.a.-$$Lambda$a$lOvv8fOvfbZyoM2wm55XcT07wsc r2 = new com.applovin.exoplayer2.a.-$$Lambda$a$lOvv8fOvfbZyoM2wm55XcT07wsc
            r2.<init>(r4)
            r3.a((com.applovin.exoplayer2.a.b.a) r0, (int) r1, (com.applovin.exoplayer2.l.p.a<com.applovin.exoplayer2.a.b>) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.a.a.a(com.applovin.exoplayer2.ak):void");
    }

    public final void a(am amVar) {
        b.a e2 = e();
        a(e2, 12, (p.a<b>) new p.a(amVar) {
            public final /* synthetic */ am f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public void a(an.a aVar) {
        b.a e2 = e();
        a(e2, 13, (p.a<b>) new p.a(aVar) {
            public final /* synthetic */ an.a f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void a(an.e eVar, an.e eVar2, int i2) {
        if (i2 == 1) {
            this.i = false;
        }
        this.f10952d.a((an) com.applovin.exoplayer2.l.a.b(this.f10955g));
        b.a e2 = e();
        a(e2, 11, (p.a<b>) new p.a(i2, eVar, eVar2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ an.e f$2;
            public final /* synthetic */ an.e f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, this.f$2, this.f$3, (b) obj);
            }
        });
    }

    public void a(an anVar, Looper looper) {
        com.applovin.exoplayer2.l.a.b(this.f10955g == null || this.f10952d.f10958b.isEmpty());
        this.f10955g = (an) com.applovin.exoplayer2.l.a.b(anVar);
        this.f10956h = this.f10949a.a(looper, (Handler.Callback) null);
        this.f10954f = this.f10954f.a(looper, new p.b(anVar) {
            public final /* synthetic */ an f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj, m mVar) {
                a.this.a(this.f$1, (b) obj, mVar);
            }
        });
    }

    public /* synthetic */ void a(an anVar, an.c cVar) {
        an.d.CC.$default$a((an.d) this, anVar, cVar);
    }

    public final void a(ba baVar, int i2) {
        this.f10952d.b((an) com.applovin.exoplayer2.l.a.b(this.f10955g));
        b.a e2 = e();
        a(e2, 0, (p.a<b>) new p.a(i2) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).c(b.a.this, this.f$1);
            }
        });
    }

    public final void a(e eVar) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, (p.a<b>) new p.a(eVar) {
            public final /* synthetic */ e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.b(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public final void a(com.applovin.exoplayer2.g.a aVar) {
        b.a e2 = e();
        a(e2, (int) IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS, (p.a<b>) new p.a(aVar) {
            public final /* synthetic */ a f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
        b.a e2 = e();
        a(e2, 2, (p.a<b>) new p.a(adVar, hVar) {
            public final /* synthetic */ ad f$1;
            public final /* synthetic */ com.applovin.exoplayer2.j.h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void a(com.applovin.exoplayer2.m.o oVar) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, (p.a<b>) new p.a(oVar) {
            public final /* synthetic */ com.applovin.exoplayer2.m.o f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
        an.d.CC.$default$a((an.d) this, oVar);
    }

    @Deprecated
    public /* synthetic */ void a(v vVar) {
        g.CC.$default$a((g) this, vVar);
    }

    public final void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, (p.a<b>) new p.a(vVar, hVar) {
            public final /* synthetic */ v f$1;
            public final /* synthetic */ com.applovin.exoplayer2.c.h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, this.f$2, (b) obj);
            }
        });
    }

    public final void a(Exception exc) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_SHOW_EXCEPTION, (p.a<b>) new p.a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).c(b.a.this, this.f$1);
            }
        });
    }

    public final void a(Object obj, long j) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_LOAD_DURING_SHOW, (p.a<b>) new p.a(obj, j) {
            public final /* synthetic */ Object f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void a(String str) {
        b.a g2 = g();
        a(g2, 1024, (p.a<b>) new p.a(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1);
            }
        });
    }

    public final void a(String str, long j, long j2) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, (p.a<b>) new p.a(str, j2, j) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, this.f$2, this.f$3, (b) obj);
            }
        });
    }

    public /* synthetic */ void a(List<com.applovin.exoplayer2.i.a> list) {
        an.d.CC.$default$a((an.d) this, (List) list);
    }

    public final void a(List<p.a> list, p.a aVar) {
        this.f10952d.a(list, aVar, (an) com.applovin.exoplayer2.l.a.b(this.f10955g));
    }

    public final void a(boolean z, int i2) {
        b.a e2 = e();
        a(e2, -1, (p.a<b>) new p.a(z, i2) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    @Deprecated
    public /* synthetic */ void a_(v vVar) {
        n.CC.$default$a_(this, vVar);
    }

    public final void a_(boolean z) {
        b.a g2 = g();
        a(g2, 1017, (p.a<b>) new p.a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).e(b.a.this, this.f$1);
            }
        });
    }

    public final void b() {
        b.a e2 = e();
        a(e2, -1, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this);
            }
        });
    }

    public final void b(int i2) {
        b.a e2 = e();
        a(e2, 4, (p.a<b>) new p.a(i2) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void b(int i2, long j, long j2) {
        b.a h2 = h();
        a(h2, 1006, (p.a<b>) new p.a(i2, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public final void b(int i2, p.a aVar) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).e(b.a.this);
            }
        });
    }

    public final void b(int i2, p.a aVar, j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f2 = f(i2, aVar);
        a(f2, 1001, (p.a<b>) new p.a(jVar, mVar) {
            public final /* synthetic */ j f$1;
            public final /* synthetic */ com.applovin.exoplayer2.h.m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void b(ak akVar) {
        an.d.CC.$default$b((an.d) this, akVar);
    }

    public final void b(e eVar) {
        b.a f2 = f();
        a(f2, (int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, (p.a<b>) new p.a(eVar) {
            public final /* synthetic */ e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.a(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public final void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a g2 = g();
        a(g2, 1010, (p.a<b>) new p.a(vVar, hVar) {
            public final /* synthetic */ v f$1;
            public final /* synthetic */ com.applovin.exoplayer2.c.h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                a.b(b.a.this, this.f$1, this.f$2, (b) obj);
            }
        });
    }

    public final void b(Exception exc) {
        b.a g2 = g();
        a(g2, 1018, (p.a<b>) new p.a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void b(String str) {
        b.a g2 = g();
        a(g2, 1013, (p.a<b>) new p.a(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    public final void b(String str, long j, long j2) {
        b.a g2 = g();
        a(g2, 1009, (p.a<b>) new p.a(str, j2, j) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                a.b(b.a.this, this.f$1, this.f$2, this.f$3, (b) obj);
            }
        });
    }

    public final void b(boolean z, int i2) {
        b.a e2 = e();
        a(e2, 5, (p.a<b>) new p.a(z, i2) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void b_(boolean z) {
        b.a e2 = e();
        a(e2, 3, (p.a<b>) new p.a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.c(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public void c() {
        b.a e2 = e();
        this.f10953e.put(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, e2);
        a(e2, (int) IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).h(b.a.this);
            }
        });
        ((o) com.applovin.exoplayer2.l.a.a(this.f10956h)).a((Runnable) new Runnable() {
            public final void run() {
                a.this.i();
            }
        });
    }

    public final void c(int i2) {
        b.a e2 = e();
        a(e2, 6, (p.a<b>) new p.a(i2) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1);
            }
        });
    }

    public final void c(int i2, p.a aVar) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).f(b.a.this);
            }
        });
    }

    public final void c(int i2, p.a aVar, j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f2 = f(i2, aVar);
        a(f2, 1002, (p.a<b>) new p.a(jVar, mVar) {
            public final /* synthetic */ j f$1;
            public final /* synthetic */ com.applovin.exoplayer2.h.m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((b) obj).c(b.a.this, this.f$1, this.f$2);
            }
        });
    }

    public final void c(e eVar) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.AUCTION_ERROR_DECOMPRESSION, (p.a<b>) new p.a(eVar) {
            public final /* synthetic */ e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.d(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public final void c(Exception exc) {
        b.a g2 = g();
        a(g2, (int) IronSourceError.ERROR_IS_LOAD_DURING_SHOW, (p.a<b>) new p.a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1);
            }
        });
    }

    @Deprecated
    public /* synthetic */ void c(boolean z) {
        an.b.CC.$default$c((an.b) this, z);
    }

    public final void d() {
        if (!this.i) {
            b.a e2 = e();
            this.i = true;
            a(e2, -1, (p.a<b>) new p.a() {
                public final void invoke(Object obj) {
                    ((b) obj).a(b.a.this);
                }
            });
        }
    }

    public final void d(int i2) {
        b.a e2 = e();
        a(e2, 8, (p.a<b>) new p.a(i2) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).e(b.a.this, this.f$1);
            }
        });
    }

    public final void d(int i2, p.a aVar) {
        b.a f2 = f(i2, aVar);
        a(f2, (int) IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, (p.a<b>) new p.a() {
            public final void invoke(Object obj) {
                ((b) obj).g(b.a.this);
            }
        });
    }

    public final void d(e eVar) {
        b.a f2 = f();
        a(f2, 1014, (p.a<b>) new p.a(eVar) {
            public final /* synthetic */ e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                a.c(b.a.this, this.f$1, (b) obj);
            }
        });
    }

    public void d(boolean z) {
        b.a e2 = e();
        a(e2, 7, (p.a<b>) new p.a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final b.a e() {
        return a(this.f10952d.a());
    }

    @Deprecated
    public /* synthetic */ void e(int i2) {
        an.b.CC.$default$e((an.b) this, i2);
    }

    @Deprecated
    public /* synthetic */ void e(int i2, p.a aVar) {
        g.CC.$default$e(this, i2, aVar);
    }

    public final void e(boolean z) {
        b.a e2 = e();
        a(e2, 9, (p.a<b>) new p.a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, this.f$1);
            }
        });
    }
}
