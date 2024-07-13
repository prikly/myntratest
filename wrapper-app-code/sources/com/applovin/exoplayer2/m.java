package com.applovin.exoplayer2;

import com.applovin.exoplayer2.l.ac;
import com.applovin.exoplayer2.l.d;
import com.applovin.exoplayer2.l.s;

final class m implements s {

    /* renamed from: a  reason: collision with root package name */
    private final ac f13615a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13616b;

    /* renamed from: c  reason: collision with root package name */
    private ar f13617c;

    /* renamed from: d  reason: collision with root package name */
    private s f13618d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13619e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13620f;

    public interface a {
        void a(am amVar);
    }

    public m(a aVar, d dVar) {
        this.f13616b = aVar;
        this.f13615a = new ac(dVar);
    }

    private void b(boolean z) {
        if (c(z)) {
            this.f13619e = true;
            if (this.f13620f) {
                this.f13615a.a();
                return;
            }
            return;
        }
        s sVar = (s) com.applovin.exoplayer2.l.a.b(this.f13618d);
        long c_ = sVar.c_();
        if (this.f13619e) {
            if (c_ < this.f13615a.c_()) {
                this.f13615a.b();
                return;
            }
            this.f13619e = false;
            if (this.f13620f) {
                this.f13615a.a();
            }
        }
        this.f13615a.a(c_);
        am d2 = sVar.d();
        if (!d2.equals(this.f13615a.d())) {
            this.f13615a.a(d2);
            this.f13616b.a(d2);
        }
    }

    private boolean c(boolean z) {
        ar arVar = this.f13617c;
        return arVar == null || arVar.A() || (!this.f13617c.z() && (z || this.f13617c.g()));
    }

    public long a(boolean z) {
        b(z);
        return c_();
    }

    public void a() {
        this.f13620f = true;
        this.f13615a.a();
    }

    public void a(long j) {
        this.f13615a.a(j);
    }

    public void a(am amVar) {
        s sVar = this.f13618d;
        if (sVar != null) {
            sVar.a(amVar);
            amVar = this.f13618d.d();
        }
        this.f13615a.a(amVar);
    }

    public void a(ar arVar) throws p {
        s sVar;
        s c2 = arVar.c();
        if (c2 != null && c2 != (sVar = this.f13618d)) {
            if (sVar == null) {
                this.f13618d = c2;
                this.f13617c = arVar;
                c2.a(this.f13615a.d());
                return;
            }
            throw p.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void b() {
        this.f13620f = false;
        this.f13615a.b();
    }

    public void b(ar arVar) {
        if (arVar == this.f13617c) {
            this.f13618d = null;
            this.f13617c = null;
            this.f13619e = true;
        }
    }

    public long c_() {
        return this.f13619e ? this.f13615a.c_() : ((s) com.applovin.exoplayer2.l.a.b(this.f13618d)).c_();
    }

    public am d() {
        s sVar = this.f13618d;
        return sVar != null ? sVar.d() : this.f13615a.d();
    }
}
