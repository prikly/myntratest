package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final x f12191a;

    /* renamed from: b  reason: collision with root package name */
    private final y f12192b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12193c;

    /* renamed from: d  reason: collision with root package name */
    private String f12194d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f12195e;

    /* renamed from: f  reason: collision with root package name */
    private int f12196f;

    /* renamed from: g  reason: collision with root package name */
    private int f12197g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12198h;
    private long i;
    private v j;
    private int k;
    private long l;

    public b() {
        this((String) null);
    }

    public b(String str) {
        x xVar = new x(new byte[128]);
        this.f12191a = xVar;
        this.f12192b = new y(xVar.f13604a);
        this.f12196f = 0;
        this.l = -9223372036854775807L;
        this.f12193c = str;
    }

    private boolean a(y yVar, byte[] bArr, int i2) {
        int min = Math.min(yVar.a(), i2 - this.f12197g);
        yVar.a(bArr, this.f12197g, min);
        int i3 = this.f12197g + min;
        this.f12197g = i3;
        return i3 == i2;
    }

    private boolean b(y yVar) {
        while (true) {
            boolean z = false;
            if (yVar.a() <= 0) {
                return false;
            }
            if (this.f12198h) {
                int h2 = yVar.h();
                if (h2 == 119) {
                    this.f12198h = false;
                    return true;
                } else if (h2 != 11) {
                    this.f12198h = z;
                }
            } else if (yVar.h() != 11) {
                this.f12198h = z;
            }
            z = true;
            this.f12198h = z;
        }
    }

    private void c() {
        this.f12191a.a(0);
        b.a a2 = com.applovin.exoplayer2.b.b.a(this.f12191a);
        if (this.j == null || a2.f11202d != this.j.y || a2.f11201c != this.j.z || !ai.a((Object) a2.f11199a, (Object) this.j.l)) {
            v a3 = new v.a().a(this.f12194d).f(a2.f11199a).k(a2.f11202d).l(a2.f11201c).c(this.f12193c).a();
            this.j = a3;
            this.f12195e.a(a3);
        }
        this.k = a2.f11203e;
        this.i = (((long) a2.f11204f) * 1000000) / ((long) this.j.z);
    }

    public void a() {
        this.f12196f = 0;
        this.f12197g = 0;
        this.f12198h = false;
        this.l = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12194d = dVar.c();
        this.f12195e = jVar.a(dVar.b(), 1);
    }

    public void a(y yVar) {
        a.a(this.f12195e);
        while (yVar.a() > 0) {
            int i2 = this.f12196f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(yVar.a(), this.k - this.f12197g);
                        this.f12195e.a(yVar, min);
                        int i3 = this.f12197g + min;
                        this.f12197g = i3;
                        int i4 = this.k;
                        if (i3 == i4) {
                            long j2 = this.l;
                            if (j2 != -9223372036854775807L) {
                                this.f12195e.a(j2, 1, i4, 0, (x.a) null);
                                this.l += this.i;
                            }
                            this.f12196f = 0;
                        }
                    }
                } else if (a(yVar, this.f12192b.d(), 128)) {
                    c();
                    this.f12192b.d(0);
                    this.f12195e.a(this.f12192b, 128);
                    this.f12196f = 2;
                }
            } else if (b(yVar)) {
                this.f12196f = 1;
                this.f12192b.d()[0] = Ascii.VT;
                this.f12192b.d()[1] = 119;
                this.f12197g = 2;
            }
        }
    }

    public void b() {
    }
}
