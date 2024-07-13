package com.yandex.metrica.impl.ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.yc  reason: case insensitive filesystem */
class C0844yc {

    /* renamed from: a  reason: collision with root package name */
    private C0554mc f7149a;

    /* renamed from: b  reason: collision with root package name */
    private V<Location> f7150b;

    /* renamed from: c  reason: collision with root package name */
    private Location f7151c = null;

    /* renamed from: d  reason: collision with root package name */
    private long f7152d;

    /* renamed from: e  reason: collision with root package name */
    private C0810x2 f7153e;

    /* renamed from: f  reason: collision with root package name */
    private Sc f7154f;

    /* renamed from: g  reason: collision with root package name */
    private Rb f7155g;

    C0844yc(C0554mc mcVar, V<Location> v, Location location, long j, C0810x2 x2Var, Sc sc, Rb rb) {
        this.f7149a = mcVar;
        this.f7150b = v;
        this.f7152d = j;
        this.f7153e = x2Var;
        this.f7154f = sc;
        this.f7155g = rb;
    }

    private boolean b(Location location) {
        C0554mc mcVar;
        if (!(location == null || (mcVar = this.f7149a) == null)) {
            if (this.f7151c == null) {
                return true;
            }
            boolean a2 = this.f7153e.a(this.f7152d, mcVar.f6210a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.f7151c) > this.f7149a.f6211b;
            boolean z2 = this.f7151c == null || location.getTime() - this.f7151c.getTime() >= 0;
            if ((a2 || z) && z2) {
                return true;
            }
        }
        return false;
    }

    public void a(Location location) {
        if (b(location)) {
            this.f7151c = location;
            this.f7152d = System.currentTimeMillis();
            this.f7150b.a(location);
            this.f7154f.a();
            this.f7155g.a();
        }
    }

    public void a(C0554mc mcVar) {
        this.f7149a = mcVar;
    }
}
