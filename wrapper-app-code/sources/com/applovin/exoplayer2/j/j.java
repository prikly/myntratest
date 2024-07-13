package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.k.d;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private a f13309a;

    /* renamed from: b  reason: collision with root package name */
    private d f13310b;

    public interface a {
    }

    public abstract k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p;

    public final void a(a aVar, d dVar) {
        this.f13309a = aVar;
        this.f13310b = dVar;
    }

    public abstract void a(Object obj);

    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final d d() {
        return (d) com.applovin.exoplayer2.l.a.b(this.f13310b);
    }
}
