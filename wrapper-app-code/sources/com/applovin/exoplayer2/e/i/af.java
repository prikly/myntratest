package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.b;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.List;

final class af {

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f12189a;

    /* renamed from: b  reason: collision with root package name */
    private final x[] f12190b;

    public af(List<v> list) {
        this.f12189a = list;
        this.f12190b = new x[list.size()];
    }

    public void a(long j, y yVar) {
        if (yVar.a() >= 9) {
            int q = yVar.q();
            int q2 = yVar.q();
            int h2 = yVar.h();
            if (q == 434 && q2 == 1195456820 && h2 == 3) {
                b.b(j, yVar, this.f12190b);
            }
        }
    }

    public void a(j jVar, ad.d dVar) {
        for (int i = 0; i < this.f12190b.length; i++) {
            dVar.a();
            x a2 = jVar.a(dVar.b(), 3);
            v vVar = this.f12189a.get(i);
            String str = vVar.l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.a(z, (Object) "Invalid closed caption mime type provided: " + str);
            a2.a(new v.a().a(dVar.c()).f(str).b(vVar.f13925d).c(vVar.f13924c).p(vVar.D).a(vVar.n).a());
            this.f12190b[i] = a2;
        }
    }
}
