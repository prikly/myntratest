package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    private final y f12332a;

    /* renamed from: b  reason: collision with root package name */
    private final r.a f12333b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12334c;

    /* renamed from: d  reason: collision with root package name */
    private x f12335d;

    /* renamed from: e  reason: collision with root package name */
    private String f12336e;

    /* renamed from: f  reason: collision with root package name */
    private int f12337f;

    /* renamed from: g  reason: collision with root package name */
    private int f12338g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12339h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public q() {
        this((String) null);
    }

    public q(String str) {
        this.f12337f = 0;
        y yVar = new y(4);
        this.f12332a = yVar;
        yVar.d()[0] = -1;
        this.f12333b = new r.a();
        this.l = -9223372036854775807L;
        this.f12334c = str;
    }

    private void b(y yVar) {
        byte[] d2 = yVar.d();
        int b2 = yVar.b();
        for (int c2 = yVar.c(); c2 < b2; c2++) {
            boolean z = (d2[c2] & 255) == 255;
            boolean z2 = this.i && (d2[c2] & 224) == 224;
            this.i = z;
            if (z2) {
                yVar.d(c2 + 1);
                this.i = false;
                this.f12332a.d()[1] = d2[c2];
                this.f12338g = 2;
                this.f12337f = 1;
                return;
            }
        }
        yVar.d(b2);
    }

    private void c(y yVar) {
        int min = Math.min(yVar.a(), 4 - this.f12338g);
        yVar.a(this.f12332a.d(), this.f12338g, min);
        int i2 = this.f12338g + min;
        this.f12338g = i2;
        if (i2 >= 4) {
            this.f12332a.d(0);
            if (!this.f12333b.a(this.f12332a.q())) {
                this.f12338g = 0;
                this.f12337f = 1;
                return;
            }
            this.k = this.f12333b.f11329c;
            if (!this.f12339h) {
                this.j = (((long) this.f12333b.f11333g) * 1000000) / ((long) this.f12333b.f11330d);
                this.f12335d.a(new v.a().a(this.f12336e).f(this.f12333b.f11328b).f(4096).k(this.f12333b.f11331e).l(this.f12333b.f11330d).c(this.f12334c).a());
                this.f12339h = true;
            }
            this.f12332a.d(0);
            this.f12335d.a(this.f12332a, 4);
            this.f12337f = 2;
        }
    }

    private void d(y yVar) {
        int min = Math.min(yVar.a(), this.k - this.f12338g);
        this.f12335d.a(yVar, min);
        int i2 = this.f12338g + min;
        this.f12338g = i2;
        int i3 = this.k;
        if (i2 >= i3) {
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                this.f12335d.a(j2, 1, i3, 0, (x.a) null);
                this.l += this.j;
            }
            this.f12338g = 0;
            this.f12337f = 0;
        }
    }

    public void a() {
        this.f12337f = 0;
        this.f12338g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12336e = dVar.c();
        this.f12335d = jVar.a(dVar.b(), 1);
    }

    public void a(y yVar) {
        a.a(this.f12335d);
        while (yVar.a() > 0) {
            int i2 = this.f12337f;
            if (i2 == 0) {
                b(yVar);
            } else if (i2 == 1) {
                c(yVar);
            } else if (i2 == 2) {
                d(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void b() {
    }
}
