package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

final class ae {

    /* renamed from: a  reason: collision with root package name */
    public final p.a f11056a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11057b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11058c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11059d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11060e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11061f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11062g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11063h;
    public final boolean i;

    ae(p.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = false;
        a.a(!z8 || z6);
        a.a(!z7 || z6);
        if (!z5 || (!z6 && !z7 && !z8)) {
            z9 = true;
        }
        a.a(z9);
        this.f11056a = aVar;
        this.f11057b = j;
        this.f11058c = j2;
        this.f11059d = j3;
        this.f11060e = j4;
        this.f11061f = z5;
        this.f11062g = z6;
        this.f11063h = z7;
        this.i = z8;
    }

    public ae a(long j) {
        if (j == this.f11057b) {
            return this;
        }
        return new ae(this.f11056a, j, this.f11058c, this.f11059d, this.f11060e, this.f11061f, this.f11062g, this.f11063h, this.i);
    }

    public ae b(long j) {
        if (j == this.f11058c) {
            return this;
        }
        return new ae(this.f11056a, this.f11057b, j, this.f11059d, this.f11060e, this.f11061f, this.f11062g, this.f11063h, this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.f11057b == aeVar.f11057b && this.f11058c == aeVar.f11058c && this.f11059d == aeVar.f11059d && this.f11060e == aeVar.f11060e && this.f11061f == aeVar.f11061f && this.f11062g == aeVar.f11062g && this.f11063h == aeVar.f11063h && this.i == aeVar.i && ai.a((Object) this.f11056a, (Object) aeVar.f11056a);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11056a.hashCode()) * 31) + ((int) this.f11057b)) * 31) + ((int) this.f11058c)) * 31) + ((int) this.f11059d)) * 31) + ((int) this.f11060e)) * 31) + (this.f11061f ? 1 : 0)) * 31) + (this.f11062g ? 1 : 0)) * 31) + (this.f11063h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
