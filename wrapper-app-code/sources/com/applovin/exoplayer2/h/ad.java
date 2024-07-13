package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.c;
import java.util.Arrays;
import java.util.List;

public final class ad implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f12752a = new ad(new ac[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final g.a<ad> f12753c = $$Lambda$ad$uMtsTlt05wF0QGFZkPAW37R4W4I.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final int f12754b;

    /* renamed from: d  reason: collision with root package name */
    private final ac[] f12755d;

    /* renamed from: e  reason: collision with root package name */
    private int f12756e;

    public ad(ac... acVarArr) {
        this.f12755d = acVarArr;
        this.f12754b = acVarArr.length;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ad a(Bundle bundle) {
        return new ad((ac[]) c.a(ac.f12748b, (List<Bundle>) bundle.getParcelableArrayList(b(0)), s.g()).toArray(new ac[0]));
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    public int a(ac acVar) {
        for (int i = 0; i < this.f12754b; i++) {
            if (this.f12755d[i] == acVar) {
                return i;
            }
        }
        return -1;
    }

    public ac a(int i) {
        return this.f12755d[i];
    }

    public boolean a() {
        return this.f12754b == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f12754b == adVar.f12754b && Arrays.equals(this.f12755d, adVar.f12755d);
    }

    public int hashCode() {
        if (this.f12756e == 0) {
            this.f12756e = Arrays.hashCode(this.f12755d);
        }
        return this.f12756e;
    }
}
