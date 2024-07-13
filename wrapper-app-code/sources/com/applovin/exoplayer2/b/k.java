package com.applovin.exoplayer2.b;

import com.ironsource.mediationsdk.logger.IronSourceError;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f11263a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11264b;

    public k(int i, float f2) {
        this.f11263a = i;
        this.f11264b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f11263a == kVar.f11263a && Float.compare(kVar.f11264b, this.f11264b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11263a) * 31) + Float.floatToIntBits(this.f11264b);
    }
}
