package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.l.ai;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f13311a;

    /* renamed from: b  reason: collision with root package name */
    public final at[] f13312b;

    /* renamed from: c  reason: collision with root package name */
    public final d[] f13313c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13314d;

    public k(at[] atVarArr, d[] dVarArr, Object obj) {
        this.f13312b = atVarArr;
        this.f13313c = (d[]) dVarArr.clone();
        this.f13314d = obj;
        this.f13311a = atVarArr.length;
    }

    public boolean a(int i) {
        return this.f13312b[i] != null;
    }

    public boolean a(k kVar) {
        if (kVar == null || kVar.f13313c.length != this.f13313c.length) {
            return false;
        }
        for (int i = 0; i < this.f13313c.length; i++) {
            if (!a(kVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(k kVar, int i) {
        return kVar != null && ai.a((Object) this.f13312b[i], (Object) kVar.f13312b[i]) && ai.a((Object) this.f13313c[i], (Object) kVar.f13313c[i]);
    }
}
