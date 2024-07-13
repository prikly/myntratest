package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.g;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f12219a = {73, 68, 51};

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12220b;

    /* renamed from: c  reason: collision with root package name */
    private final x f12221c;

    /* renamed from: d  reason: collision with root package name */
    private final y f12222d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12223e;

    /* renamed from: f  reason: collision with root package name */
    private String f12224f;

    /* renamed from: g  reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f12225g;

    /* renamed from: h  reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f12226h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private com.applovin.exoplayer2.e.x u;
    private long v;

    public f(boolean z) {
        this(z, (String) null);
    }

    public f(boolean z, String str) {
        this.f12221c = new x(new byte[7]);
        this.f12222d = new y(Arrays.copyOf(f12219a, 10));
        e();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.f12220b = z;
        this.f12223e = str;
    }

    private void a(com.applovin.exoplayer2.e.x xVar, long j2, int i2, int i3) {
        this.i = 4;
        this.j = i2;
        this.u = xVar;
        this.v = j2;
        this.s = i3;
    }

    private boolean a(byte b2, byte b3) {
        return a((int) ((b2 & 255) << 8) | (b3 & 255));
    }

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    private boolean a(y yVar, int i2) {
        yVar.d(i2 + 1);
        if (!b(yVar, this.f12221c.f13604a, 1)) {
            return false;
        }
        this.f12221c.a(4);
        int c2 = this.f12221c.c(1);
        int i3 = this.n;
        if (i3 != -1 && c2 != i3) {
            return false;
        }
        if (this.o != -1) {
            if (!b(yVar, this.f12221c.f13604a, 1)) {
                return true;
            }
            this.f12221c.a(2);
            if (this.f12221c.c(4) != this.o) {
                return false;
            }
            yVar.d(i2 + 2);
        }
        if (!b(yVar, this.f12221c.f13604a, 4)) {
            return true;
        }
        this.f12221c.a(14);
        int c3 = this.f12221c.c(13);
        if (c3 < 7) {
            return false;
        }
        byte[] d2 = yVar.d();
        int b2 = yVar.b();
        int i4 = i2 + c3;
        if (i4 >= b2) {
            return true;
        }
        if (d2[i4] == -1) {
            int i5 = i4 + 1;
            if (i5 == b2) {
                return true;
            }
            return a((byte) -1, d2[i5]) && ((d2[i5] & 8) >> 3) == c2;
        } else if (d2[i4] != 73) {
            return false;
        } else {
            int i6 = i4 + 1;
            if (i6 == b2) {
                return true;
            }
            if (d2[i6] != 68) {
                return false;
            }
            int i7 = i4 + 2;
            return i7 == b2 || d2[i7] == 51;
        }
    }

    private boolean a(y yVar, byte[] bArr, int i2) {
        int min = Math.min(yVar.a(), i2 - this.j);
        yVar.a(bArr, this.j, min);
        int i3 = this.j + min;
        this.j = i3;
        return i3 == i2;
    }

    private void b(y yVar) {
        int i2;
        byte[] d2 = yVar.d();
        int c2 = yVar.c();
        int b2 = yVar.b();
        while (c2 < b2) {
            int i3 = c2 + 1;
            byte b3 = d2[c2] & 255;
            if (this.k != 512 || !a((byte) -1, (byte) b3) || (!this.m && !a(yVar, i3 - 2))) {
                int i4 = this.k;
                byte b4 = b3 | i4;
                if (b4 != 329) {
                    if (b4 == 511) {
                        this.k = 512;
                    } else if (b4 == 836) {
                        i2 = 1024;
                    } else if (b4 == 1075) {
                        f();
                        yVar.d(i3);
                        return;
                    } else if (i4 != 256) {
                        this.k = 256;
                        i3--;
                    }
                    c2 = i3;
                } else {
                    i2 = 768;
                }
                this.k = i2;
                c2 = i3;
            } else {
                this.p = (b3 & 8) >> 3;
                boolean z = true;
                if ((b3 & 1) != 0) {
                    z = false;
                }
                this.l = z;
                if (!this.m) {
                    h();
                } else {
                    g();
                }
                yVar.d(i3);
                return;
            }
        }
        yVar.d(c2);
    }

    private boolean b(y yVar, byte[] bArr, int i2) {
        if (yVar.a() < i2) {
            return false;
        }
        yVar.a(bArr, 0, i2);
        return true;
    }

    private void c(y yVar) {
        if (yVar.a() != 0) {
            this.f12221c.f13604a[0] = yVar.d()[yVar.c()];
            this.f12221c.a(2);
            int c2 = this.f12221c.c(4);
            int i2 = this.o;
            if (i2 == -1 || c2 == i2) {
                if (!this.m) {
                    this.m = true;
                    this.n = this.p;
                    this.o = c2;
                }
                g();
                return;
            }
            d();
        }
    }

    private void d() {
        this.m = false;
        e();
    }

    private void d(y yVar) {
        int min = Math.min(yVar.a(), this.s - this.j);
        this.u.a(yVar, min);
        int i2 = this.j + min;
        this.j = i2;
        int i3 = this.s;
        if (i2 == i3) {
            long j2 = this.t;
            if (j2 != -9223372036854775807L) {
                this.u.a(j2, 1, i3, 0, (x.a) null);
                this.t += this.v;
            }
            e();
        }
    }

    private void e() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    private void f() {
        this.i = 2;
        this.j = f12219a.length;
        this.s = 0;
        this.f12222d.d(0);
    }

    private void g() {
        this.i = 3;
        this.j = 0;
    }

    private void h() {
        this.i = 1;
        this.j = 0;
    }

    private void i() {
        this.f12226h.a(this.f12222d, 10);
        this.f12222d.d(6);
        a(this.f12226h, 0, 10, this.f12222d.v() + 10);
    }

    private void j() throws ai {
        this.f12221c.a(0);
        if (!this.q) {
            int c2 = this.f12221c.c(2) + 1;
            if (c2 != 2) {
                q.c("AdtsReader", "Detected audio object type: " + c2 + ", but assuming AAC LC.");
                c2 = 2;
            }
            this.f12221c.b(5);
            byte[] a2 = a.a(c2, this.o, this.f12221c.c(3));
            a.C0106a a3 = a.a(a2);
            v a4 = new v.a().a(this.f12224f).f("audio/mp4a-latm").d(a3.f11192c).k(a3.f11191b).l(a3.f11190a).a((List<byte[]>) Collections.singletonList(a2)).c(this.f12223e).a();
            this.r = 1024000000 / ((long) a4.z);
            this.f12225g.a(a4);
            this.q = true;
        } else {
            this.f12221c.b(10);
        }
        this.f12221c.b(4);
        int c3 = (this.f12221c.c(13) - 2) - 5;
        if (this.l) {
            c3 -= 2;
        }
        a(this.f12225g, this.r, 0, c3);
    }

    private void k() {
        com.applovin.exoplayer2.l.a.b(this.f12225g);
        com.applovin.exoplayer2.l.ai.a(this.u);
        com.applovin.exoplayer2.l.ai.a(this.f12226h);
    }

    public void a() {
        this.t = -9223372036854775807L;
        d();
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.t = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12224f = dVar.c();
        com.applovin.exoplayer2.e.x a2 = jVar.a(dVar.b(), 1);
        this.f12225g = a2;
        this.u = a2;
        if (this.f12220b) {
            dVar.a();
            com.applovin.exoplayer2.e.x a3 = jVar.a(dVar.b(), 5);
            this.f12226h = a3;
            a3.a(new v.a().a(dVar.c()).f("application/id3").a());
            return;
        }
        this.f12226h = new g();
    }

    public void a(y yVar) throws ai {
        k();
        while (yVar.a() > 0) {
            int i2 = this.i;
            if (i2 == 0) {
                b(yVar);
            } else if (i2 == 1) {
                c(yVar);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (a(yVar, this.f12221c.f13604a, this.l ? 7 : 5)) {
                        j();
                    }
                } else if (i2 == 4) {
                    d(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(yVar, this.f12222d.d(), 10)) {
                i();
            }
        }
    }

    public void b() {
    }

    public long c() {
        return this.r;
    }
}
