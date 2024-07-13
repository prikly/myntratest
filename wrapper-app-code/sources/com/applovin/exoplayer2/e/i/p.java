package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import java.util.List;

public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f12324a;

    /* renamed from: b  reason: collision with root package name */
    private final y f12325b;

    /* renamed from: c  reason: collision with root package name */
    private final x f12326c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f12327d;

    /* renamed from: e  reason: collision with root package name */
    private String f12328e;

    /* renamed from: f  reason: collision with root package name */
    private v f12329f;

    /* renamed from: g  reason: collision with root package name */
    private int f12330g;

    /* renamed from: h  reason: collision with root package name */
    private int f12331h;
    private int i;
    private int j;
    private long k = -9223372036854775807L;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public p(String str) {
        this.f12324a = str;
        y yVar = new y(1024);
        this.f12325b = yVar;
        this.f12326c = new x(yVar.d());
    }

    private void a(int i2) {
        this.f12325b.a(i2);
        this.f12326c.a(this.f12325b.d());
    }

    private void a(x xVar) throws ai {
        if (!xVar.e()) {
            this.l = true;
            b(xVar);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw ai.b((String) null, (Throwable) null);
        } else if (this.n == 0) {
            a(xVar, e(xVar));
            if (this.p) {
                xVar.b((int) this.q);
            }
        } else {
            throw ai.b((String) null, (Throwable) null);
        }
    }

    private void a(x xVar, int i2) {
        int b2 = xVar.b();
        if ((b2 & 7) == 0) {
            this.f12325b.d(b2 >> 3);
        } else {
            xVar.a(this.f12325b.d(), 0, i2 * 8);
            this.f12325b.d(0);
        }
        this.f12327d.a(this.f12325b, i2);
        long j2 = this.k;
        if (j2 != -9223372036854775807L) {
            this.f12327d.a(j2, 1, i2, 0, (x.a) null);
            this.k += this.s;
        }
    }

    private void b(com.applovin.exoplayer2.l.x xVar) throws ai {
        boolean e2;
        int c2 = xVar.c(1);
        int c3 = c2 == 1 ? xVar.c(1) : 0;
        this.m = c3;
        if (c3 == 0) {
            if (c2 == 1) {
                f(xVar);
            }
            if (xVar.e()) {
                this.n = xVar.c(6);
                int c4 = xVar.c(4);
                int c5 = xVar.c(3);
                if (c4 == 0 && c5 == 0) {
                    if (c2 == 0) {
                        int b2 = xVar.b();
                        int d2 = d(xVar);
                        xVar.a(b2);
                        byte[] bArr = new byte[((d2 + 7) / 8)];
                        xVar.a(bArr, 0, d2);
                        v a2 = new v.a().a(this.f12328e).f("audio/mp4a-latm").d(this.u).k(this.t).l(this.r).a((List<byte[]>) Collections.singletonList(bArr)).c(this.f12324a).a();
                        if (!a2.equals(this.f12329f)) {
                            this.f12329f = a2;
                            this.s = 1024000000 / ((long) a2.z);
                            this.f12327d.a(a2);
                        }
                    } else {
                        xVar.b(((int) f(xVar)) - d(xVar));
                    }
                    c(xVar);
                    boolean e3 = xVar.e();
                    this.p = e3;
                    this.q = 0;
                    if (e3) {
                        if (c2 == 1) {
                            this.q = f(xVar);
                        } else {
                            do {
                                e2 = xVar.e();
                                this.q = (this.q << 8) + ((long) xVar.c(8));
                            } while (e2);
                        }
                    }
                    if (xVar.e()) {
                        xVar.b(8);
                        return;
                    }
                    return;
                }
                throw ai.b((String) null, (Throwable) null);
            }
            throw ai.b((String) null, (Throwable) null);
        }
        throw ai.b((String) null, (Throwable) null);
    }

    private void c(com.applovin.exoplayer2.l.x xVar) {
        int i2;
        int c2 = xVar.c(3);
        this.o = c2;
        if (c2 == 0) {
            i2 = 8;
        } else if (c2 == 1) {
            i2 = 9;
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            xVar.b(6);
            return;
        } else if (c2 == 6 || c2 == 7) {
            xVar.b(1);
            return;
        } else {
            throw new IllegalStateException();
        }
        xVar.b(i2);
    }

    private int d(com.applovin.exoplayer2.l.x xVar) throws ai {
        int a2 = xVar.a();
        a.C0106a a3 = a.a(xVar, true);
        this.u = a3.f11192c;
        this.r = a3.f11190a;
        this.t = a3.f11191b;
        return a2 - xVar.a();
    }

    private int e(com.applovin.exoplayer2.l.x xVar) throws ai {
        int c2;
        if (this.o == 0) {
            int i2 = 0;
            do {
                c2 = xVar.c(8);
                i2 += c2;
            } while (c2 == 255);
            return i2;
        }
        throw ai.b((String) null, (Throwable) null);
    }

    private static long f(com.applovin.exoplayer2.l.x xVar) {
        return (long) xVar.c((xVar.c(2) + 1) * 8);
    }

    public void a() {
        this.f12330g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.k = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12327d = jVar.a(dVar.b(), 1);
        this.f12328e = dVar.c();
    }

    public void a(y yVar) throws ai {
        com.applovin.exoplayer2.l.a.a(this.f12327d);
        while (yVar.a() > 0) {
            int i2 = this.f12330g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int h2 = yVar.h();
                    if ((h2 & 224) == 224) {
                        this.j = h2;
                        this.f12330g = 2;
                    } else if (h2 == 86) {
                    }
                } else if (i2 == 2) {
                    int h3 = ((this.j & -225) << 8) | yVar.h();
                    this.i = h3;
                    if (h3 > this.f12325b.d().length) {
                        a(this.i);
                    }
                    this.f12331h = 0;
                    this.f12330g = 3;
                } else if (i2 == 3) {
                    int min = Math.min(yVar.a(), this.i - this.f12331h);
                    yVar.a(this.f12326c.f13604a, this.f12331h, min);
                    int i3 = this.f12331h + min;
                    this.f12331h = i3;
                    if (i3 == this.i) {
                        this.f12326c.a(0);
                        a(this.f12326c);
                    }
                } else {
                    throw new IllegalStateException();
                }
                this.f12330g = 0;
            } else if (yVar.h() == 86) {
                this.f12330g = 1;
            }
        }
    }

    public void b() {
    }
}
