package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12107a = $$Lambda$c$K6fmmgGoaTguVv27QPZjc_gdhT0.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private j f12108b;

    /* renamed from: c  reason: collision with root package name */
    private h f12109c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12110d;

    private static y a(y yVar) {
        yVar.d(0);
        return yVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] a() {
        return new h[]{new c()};
    }

    private boolean b(i iVar) throws IOException {
        h gVar;
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.f12117b & 2) == 2) {
            int min = Math.min(eVar.i, 8);
            y yVar = new y(min);
            iVar.d(yVar.d(), 0, min);
            if (b.a(a(yVar))) {
                gVar = new b();
            } else if (i.a(a(yVar))) {
                gVar = new i();
            } else if (g.a(a(yVar))) {
                gVar = new g();
            }
            this.f12109c = gVar;
            return true;
        }
        return false;
    }

    public int a(i iVar, u uVar) throws IOException {
        a.a(this.f12108b);
        if (this.f12109c == null) {
            if (b(iVar)) {
                iVar.a();
            } else {
                throw ai.b("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f12110d) {
            x a2 = this.f12108b.a(0, 1);
            this.f12108b.a();
            this.f12109c.a(this.f12108b, a2);
            this.f12110d = true;
        }
        return this.f12109c.a(iVar, uVar);
    }

    public void a(long j, long j2) {
        h hVar = this.f12109c;
        if (hVar != null) {
            hVar.a(j, j2);
        }
    }

    public void a(j jVar) {
        this.f12108b = jVar;
    }

    public boolean a(i iVar) throws IOException {
        try {
            return b(iVar);
        } catch (ai unused) {
            return false;
        }
    }

    public void c() {
    }
}
