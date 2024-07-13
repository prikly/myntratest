package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.g.g;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.b;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final y f11880a = new y(6);

    /* renamed from: b  reason: collision with root package name */
    private j f11881b;

    /* renamed from: c  reason: collision with root package name */
    private int f11882c;

    /* renamed from: d  reason: collision with root package name */
    private int f11883d;

    /* renamed from: e  reason: collision with root package name */
    private int f11884e;

    /* renamed from: f  reason: collision with root package name */
    private long f11885f = -1;

    /* renamed from: g  reason: collision with root package name */
    private b f11886g;

    /* renamed from: h  reason: collision with root package name */
    private i f11887h;
    private c i;
    private g j;

    private static b a(String str, long j2) throws IOException {
        b a2;
        if (j2 == -1 || (a2 = e.a(str)) == null) {
            return null;
        }
        return a2.a(j2);
    }

    private void a() {
        a((a.C0122a) com.applovin.exoplayer2.l.a.b(this.f11886g));
        this.f11882c = 5;
    }

    private void a(a.C0122a... aVarArr) {
        ((j) com.applovin.exoplayer2.l.a.b(this.f11881b)).a(1024, 4).a(new v.a().e("image/jpeg").a(new com.applovin.exoplayer2.g.a(aVarArr)).a());
    }

    private int b(i iVar) throws IOException {
        this.f11880a.a(2);
        iVar.d(this.f11880a.d(), 0, 2);
        return this.f11880a.i();
    }

    private void b() {
        a(new a.C0122a[0]);
        ((j) com.applovin.exoplayer2.l.a.b(this.f11881b)).a();
        this.f11881b.a(new v.b(-9223372036854775807L));
        this.f11882c = 6;
    }

    private void c(i iVar) throws IOException {
        this.f11880a.a(2);
        iVar.d(this.f11880a.d(), 0, 2);
        iVar.c(this.f11880a.i() - 2);
    }

    private void d(i iVar) throws IOException {
        int i2;
        this.f11880a.a(2);
        iVar.b(this.f11880a.d(), 0, 2);
        int i3 = this.f11880a.i();
        this.f11883d = i3;
        if (i3 == 65498) {
            if (this.f11885f != -1) {
                i2 = 4;
            } else {
                b();
                return;
            }
        } else if ((i3 < 65488 || i3 > 65497) && this.f11883d != 65281) {
            i2 = 1;
        } else {
            return;
        }
        this.f11882c = i2;
    }

    private void e(i iVar) throws IOException {
        this.f11880a.a(2);
        iVar.b(this.f11880a.d(), 0, 2);
        this.f11884e = this.f11880a.i() - 2;
        this.f11882c = 2;
    }

    private void f(i iVar) throws IOException {
        String B;
        if (this.f11883d == 65505) {
            y yVar = new y(this.f11884e);
            iVar.b(yVar.d(), 0, this.f11884e);
            if (this.f11886g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.B()) && (B = yVar.B()) != null) {
                b a2 = a(B, iVar.d());
                this.f11886g = a2;
                if (a2 != null) {
                    this.f11885f = a2.f12673d;
                }
            }
        } else {
            iVar.b(this.f11884e);
        }
        this.f11882c = 0;
    }

    private void g(i iVar) throws IOException {
        if (iVar.b(this.f11880a.d(), 0, 1, true)) {
            iVar.a();
            if (this.j == null) {
                this.j = new g();
            }
            c cVar = new c(iVar, this.f11885f);
            this.i = cVar;
            if (this.j.a((i) cVar)) {
                this.j.a((j) new d(this.f11885f, (j) com.applovin.exoplayer2.l.a.b(this.f11881b)));
                a();
                return;
            }
        }
        b();
    }

    public int a(i iVar, u uVar) throws IOException {
        int i2 = this.f11882c;
        if (i2 == 0) {
            d(iVar);
            return 0;
        } else if (i2 == 1) {
            e(iVar);
            return 0;
        } else if (i2 == 2) {
            f(iVar);
            return 0;
        } else if (i2 == 4) {
            long c2 = iVar.c();
            long j2 = this.f11885f;
            if (c2 != j2) {
                uVar.f12451a = j2;
                return 1;
            }
            g(iVar);
            return 0;
        } else if (i2 == 5) {
            if (this.i == null || iVar != this.f11887h) {
                this.f11887h = iVar;
                this.i = new c(iVar, this.f11885f);
            }
            int a2 = ((g) com.applovin.exoplayer2.l.a.b(this.j)).a((i) this.i, uVar);
            if (a2 == 1) {
                uVar.f12451a += this.f11885f;
            }
            return a2;
        } else if (i2 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f11882c = 0;
            this.j = null;
        } else if (this.f11882c == 5) {
            ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(j2, j3);
        }
    }

    public void a(j jVar) {
        this.f11881b = jVar;
    }

    public boolean a(i iVar) throws IOException {
        if (b(iVar) != 65496) {
            return false;
        }
        int b2 = b(iVar);
        this.f11883d = b2;
        if (b2 == 65504) {
            c(iVar);
            this.f11883d = b(iVar);
        }
        if (this.f11883d != 65505) {
            return false;
        }
        iVar.c(2);
        this.f11880a.a(6);
        iVar.d(this.f11880a.d(), 0, 6);
        return this.f11880a.o() == 1165519206 && this.f11880a.i() == 0;
    }

    public void c() {
        g gVar = this.j;
        if (gVar != null) {
            gVar.c();
        }
    }
}
