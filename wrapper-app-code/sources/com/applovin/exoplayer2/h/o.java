package com.applovin.exoplayer2.h;

import com.ironsource.mediationsdk.logger.IronSourceError;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12829a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12830b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12831c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12832d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12833e;

    protected o(o oVar) {
        this.f12829a = oVar.f12829a;
        this.f12830b = oVar.f12830b;
        this.f12831c = oVar.f12831c;
        this.f12832d = oVar.f12832d;
        this.f12833e = oVar.f12833e;
    }

    public o(Object obj) {
        this(obj, -1);
    }

    public o(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private o(Object obj, int i, int i2, long j, int i3) {
        this.f12829a = obj;
        this.f12830b = i;
        this.f12831c = i2;
        this.f12832d = j;
        this.f12833e = i3;
    }

    public o(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public o(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public o a(Object obj) {
        if (this.f12829a.equals(obj)) {
            return this;
        }
        return new o(obj, this.f12830b, this.f12831c, this.f12832d, this.f12833e);
    }

    public boolean a() {
        return this.f12830b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12829a.equals(oVar.f12829a) && this.f12830b == oVar.f12830b && this.f12831c == oVar.f12831c && this.f12832d == oVar.f12832d && this.f12833e == oVar.f12833e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12829a.hashCode()) * 31) + this.f12830b) * 31) + this.f12831c) * 31) + ((int) this.f12832d)) * 31) + this.f12833e;
    }
}
