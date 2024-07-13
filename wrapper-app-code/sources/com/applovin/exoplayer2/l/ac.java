package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.h;

public final class ac implements s {

    /* renamed from: a  reason: collision with root package name */
    private final d f13508a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13509b;

    /* renamed from: c  reason: collision with root package name */
    private long f13510c;

    /* renamed from: d  reason: collision with root package name */
    private long f13511d;

    /* renamed from: e  reason: collision with root package name */
    private am f13512e = am.f11104a;

    public ac(d dVar) {
        this.f13508a = dVar;
    }

    public void a() {
        if (!this.f13509b) {
            this.f13511d = this.f13508a.a();
            this.f13509b = true;
        }
    }

    public void a(long j) {
        this.f13510c = j;
        if (this.f13509b) {
            this.f13511d = this.f13508a.a();
        }
    }

    public void a(am amVar) {
        if (this.f13509b) {
            a(c_());
        }
        this.f13512e = amVar;
    }

    public void b() {
        if (this.f13509b) {
            a(c_());
            this.f13509b = false;
        }
    }

    public long c_() {
        long j = this.f13510c;
        if (!this.f13509b) {
            return j;
        }
        long a2 = this.f13508a.a() - this.f13511d;
        return j + (this.f13512e.f11106b == 1.0f ? h.b(a2) : this.f13512e.a(a2));
    }

    public am d() {
        return this.f13512e;
    }
}
