package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f11837a = $$Lambda$b$ZvNBplAogxcG8cWz6RJVeMN83TU.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11838b;

    /* renamed from: c  reason: collision with root package name */
    private final y f11839c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11840d;

    /* renamed from: e  reason: collision with root package name */
    private final m.a f11841e;

    /* renamed from: f  reason: collision with root package name */
    private j f11842f;

    /* renamed from: g  reason: collision with root package name */
    private x f11843g;

    /* renamed from: h  reason: collision with root package name */
    private int f11844h;
    private a i;
    private p j;
    private int k;
    private int l;
    private a m;
    private int n;
    private long o;

    public b() {
        this(0);
    }

    public b(int i2) {
        this.f11838b = new byte[42];
        this.f11839c = new y(new byte[32768], 0);
        this.f11840d = (i2 & 1) == 0 ? false : true;
        this.f11841e = new m.a();
        this.f11844h = 0;
    }

    private long a(y yVar, boolean z) {
        boolean z2;
        com.applovin.exoplayer2.l.a.b(this.j);
        int c2 = yVar.c();
        while (true) {
            if (c2 <= yVar.b() - 16) {
                yVar.d(c2);
                if (m.a(yVar, this.j, this.l, this.f11841e)) {
                    break;
                }
                c2++;
            } else if (z) {
                while (c2 <= yVar.b() - this.k) {
                    yVar.d(c2);
                    boolean z3 = false;
                    try {
                        z2 = m.a(yVar, this.j, this.l, this.f11841e);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (yVar.c() <= yVar.b()) {
                        z3 = z2;
                    }
                    if (!z3) {
                        c2++;
                    }
                }
                yVar.d(yVar.b());
                return -1;
            } else {
                yVar.d(c2);
                return -1;
            }
        }
        yVar.d(c2);
        return this.f11841e.f12428a;
    }

    private void a() {
        ((x) ai.a(this.f11843g)).a((this.o * 1000000) / ((long) ((p) ai.a(this.j)).f12436e), 1, this.n, 0, (x.a) null);
    }

    private int b(i iVar, u uVar) throws IOException {
        boolean z;
        com.applovin.exoplayer2.l.a.b(this.f11843g);
        com.applovin.exoplayer2.l.a.b(this.j);
        a aVar = this.m;
        if (aVar != null && aVar.b()) {
            return this.m.a(iVar, uVar);
        }
        if (this.o == -1) {
            this.o = m.a(iVar, this.j);
            return 0;
        }
        int b2 = this.f11839c.b();
        if (b2 < 32768) {
            int a2 = iVar.a(this.f11839c.d(), b2, 32768 - b2);
            z = a2 == -1;
            if (!z) {
                this.f11839c.c(b2 + a2);
            } else if (this.f11839c.a() == 0) {
                a();
                return -1;
            }
        } else {
            z = false;
        }
        int c2 = this.f11839c.c();
        int i2 = this.n;
        int i3 = this.k;
        if (i2 < i3) {
            y yVar = this.f11839c;
            yVar.e(Math.min(i3 - i2, yVar.a()));
        }
        long a3 = a(this.f11839c, z);
        int c3 = this.f11839c.c() - c2;
        this.f11839c.d(c2);
        this.f11843g.a(this.f11839c, c3);
        this.n += c3;
        if (a3 != -1) {
            a();
            this.n = 0;
            this.o = a3;
        }
        if (this.f11839c.a() < 16) {
            int a4 = this.f11839c.a();
            System.arraycopy(this.f11839c.d(), this.f11839c.c(), this.f11839c.d(), 0, a4);
            this.f11839c.d(0);
            this.f11839c.c(a4);
        }
        return 0;
    }

    private v b(long j2, long j3) {
        com.applovin.exoplayer2.l.a.b(this.j);
        if (this.j.k != null) {
            return new o(this.j, j2);
        }
        if (j3 == -1 || this.j.j <= 0) {
            return new v.b(this.j.a());
        }
        a aVar = new a(this.j, this.l, j2, j3);
        this.m = aVar;
        return aVar.a();
    }

    private void b(i iVar) throws IOException {
        this.i = n.b(iVar, !this.f11840d);
        this.f11844h = 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new b()};
    }

    private void c(i iVar) throws IOException {
        byte[] bArr = this.f11838b;
        iVar.d(bArr, 0, bArr.length);
        iVar.a();
        this.f11844h = 2;
    }

    private void d(i iVar) throws IOException {
        n.b(iVar);
        this.f11844h = 3;
    }

    private void e(i iVar) throws IOException {
        n.a aVar = new n.a(this.j);
        boolean z = false;
        while (!z) {
            z = n.a(iVar, aVar);
            this.j = (p) ai.a(aVar.f12429a);
        }
        com.applovin.exoplayer2.l.a.b(this.j);
        this.k = Math.max(this.j.f12434c, 6);
        ((x) ai.a(this.f11843g)).a(this.j.a(this.f11838b, this.i));
        this.f11844h = 4;
    }

    private void f(i iVar) throws IOException {
        this.l = n.c(iVar);
        ((j) ai.a(this.f11842f)).a(b(iVar.c(), iVar.d()));
        this.f11844h = 5;
    }

    public int a(i iVar, u uVar) throws IOException {
        int i2 = this.f11844h;
        if (i2 == 0) {
            b(iVar);
            return 0;
        } else if (i2 == 1) {
            c(iVar);
            return 0;
        } else if (i2 == 2) {
            d(iVar);
            return 0;
        } else if (i2 == 3) {
            e(iVar);
            return 0;
        } else if (i2 == 4) {
            f(iVar);
            return 0;
        } else if (i2 == 5) {
            return b(iVar, uVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void a(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.f11844h = 0;
        } else {
            a aVar = this.m;
            if (aVar != null) {
                aVar.a(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.o = j4;
        this.n = 0;
        this.f11839c.a(0);
    }

    public void a(j jVar) {
        this.f11842f = jVar;
        this.f11843g = jVar.a(0, 1);
        jVar.a();
    }

    public boolean a(i iVar) throws IOException {
        n.a(iVar, false);
        return n.a(iVar);
    }

    public void c() {
    }
}
