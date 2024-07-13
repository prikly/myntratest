package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f11427a;

    /* renamed from: b  reason: collision with root package name */
    public final v f11428b;

    /* renamed from: c  reason: collision with root package name */
    public final v f11429c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11430d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11431e;

    public h(String str, v vVar, v vVar2, int i, int i2) {
        a.a(i == 0 || i2 == 0);
        this.f11427a = a.a(str);
        this.f11428b = (v) a.b(vVar);
        this.f11429c = (v) a.b(vVar2);
        this.f11430d = i;
        this.f11431e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11430d == hVar.f11430d && this.f11431e == hVar.f11431e && this.f11427a.equals(hVar.f11427a) && this.f11428b.equals(hVar.f11428b) && this.f11429c.equals(hVar.f11429c);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11430d) * 31) + this.f11431e) * 31) + this.f11427a.hashCode()) * 31) + this.f11428b.hashCode()) * 31) + this.f11429c.hashCode();
    }
}
