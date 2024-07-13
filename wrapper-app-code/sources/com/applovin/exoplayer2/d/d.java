package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.util.Collection;
import java.util.Map;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11749a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ab.d f11750b;

    /* renamed from: c  reason: collision with root package name */
    private h f11751c;

    /* renamed from: d  reason: collision with root package name */
    private t.b f11752d;

    /* renamed from: e  reason: collision with root package name */
    private String f11753e;

    private h a(ab.d dVar) {
        t.b bVar = this.f11752d;
        if (bVar == null) {
            bVar = new q.a().a(this.f11753e);
        }
        p pVar = new p(dVar.f10997b == null ? null : dVar.f10997b.toString(), dVar.f11001f, bVar);
        ax<Map.Entry<String, String>> a2 = dVar.f10998c.entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry next = a2.next();
            pVar.a((String) next.getKey(), (String) next.getValue());
        }
        c a3 = new c.a().a(dVar.f10996a, o.f11782a).a(dVar.f10999d).b(dVar.f11000e).a(com.applovin.exoplayer2.common.b.c.a((Collection<? extends Number>) dVar.f11002g)).a((r) pVar);
        a3.a(0, dVar.a());
        return a3;
    }

    public h a(ab abVar) {
        h hVar;
        a.b(abVar.f10976c);
        ab.d dVar = abVar.f10976c.f11026c;
        if (dVar == null || ai.f13525a < 18) {
            return h.f11769b;
        }
        synchronized (this.f11749a) {
            if (!ai.a((Object) dVar, (Object) this.f11750b)) {
                this.f11750b = dVar;
                this.f11751c = a(dVar);
            }
            hVar = (h) a.b(this.f11751c);
        }
        return hVar;
    }
}
