package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.b;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.List;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f12388a;

    /* renamed from: b  reason: collision with root package name */
    private final x[] f12389b;

    public z(List<v> list) {
        this.f12388a = list;
        this.f12389b = new x[list.size()];
    }

    public void a(long j, y yVar) {
        b.a(j, yVar, this.f12389b);
    }

    public void a(j jVar, ad.d dVar) {
        for (int i = 0; i < this.f12389b.length; i++) {
            dVar.a();
            x a2 = jVar.a(dVar.b(), 3);
            v vVar = this.f12388a.get(i);
            String str = vVar.l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.a(z, (Object) "Invalid closed caption mime type provided: " + str);
            a2.a(new v.a().a(vVar.f13922a != null ? vVar.f13922a : dVar.c()).f(str).b(vVar.f13925d).c(vVar.f13924c).p(vVar.D).a(vVar.n).a());
            this.f12389b[i] = a2;
        }
    }
}
