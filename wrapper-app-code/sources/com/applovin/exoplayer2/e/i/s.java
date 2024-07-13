package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

public final class s implements x {

    /* renamed from: a  reason: collision with root package name */
    private v f12345a;

    /* renamed from: b  reason: collision with root package name */
    private ag f12346b;

    /* renamed from: c  reason: collision with root package name */
    private x f12347c;

    public s(String str) {
        this.f12345a = new v.a().f(str).a();
    }

    private void a() {
        a.a(this.f12346b);
        ai.a(this.f12347c);
    }

    public void a(ag agVar, j jVar, ad.d dVar) {
        this.f12346b = agVar;
        dVar.a();
        x a2 = jVar.a(dVar.b(), 5);
        this.f12347c = a2;
        a2.a(this.f12345a);
    }

    public void a(y yVar) {
        a();
        long b2 = this.f12346b.b();
        long c2 = this.f12346b.c();
        if (b2 != -9223372036854775807L && c2 != -9223372036854775807L) {
            if (c2 != this.f12345a.p) {
                v a2 = this.f12345a.a().a(c2).a();
                this.f12345a = a2;
                this.f12347c.a(a2);
            }
            int a3 = yVar.a();
            this.f12347c.a(yVar, a3);
            this.f12347c.a(b2, 1, a3, 0, (x.a) null);
        }
    }
}
