package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;

public final class d implements j {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f11895b;

    /* renamed from: c  reason: collision with root package name */
    private final j f11896c;

    public d(long j, j jVar) {
        this.f11895b = j;
        this.f11896c = jVar;
    }

    public x a(int i, int i2) {
        return this.f11896c.a(i, i2);
    }

    public void a() {
        this.f11896c.a();
    }

    public void a(final v vVar) {
        this.f11896c.a(new v() {
            public v.a a(long j) {
                v.a a2 = vVar.a(j);
                return new v.a(new w(a2.f12452a.f12457b, a2.f12452a.f12458c + d.this.f11895b), new w(a2.f12453b.f12457b, a2.f12453b.f12458c + d.this.f11895b));
            }

            public boolean a() {
                return vVar.a();
            }

            public long b() {
                return vVar.b();
            }
        });
    }
}
