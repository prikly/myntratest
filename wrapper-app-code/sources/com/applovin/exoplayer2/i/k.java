package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.l.a;
import java.util.List;

public abstract class k extends i implements f {

    /* renamed from: c  reason: collision with root package name */
    private f f13201c;

    /* renamed from: d  reason: collision with root package name */
    private long f13202d;

    public int a(long j) {
        return ((f) a.b(this.f13201c)).a(j - this.f13202d);
    }

    public long a(int i) {
        return ((f) a.b(this.f13201c)).a(i) + this.f13202d;
    }

    public void a() {
        super.a();
        this.f13201c = null;
    }

    public void a(long j, f fVar, long j2) {
        this.f11432a = j;
        this.f13201c = fVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f11432a;
        }
        this.f13202d = j2;
    }

    public List<a> b(long j) {
        return ((f) a.b(this.f13201c)).b(j - this.f13202d);
    }

    public int f_() {
        return ((f) a.b(this.f13201c)).f_();
    }
}
