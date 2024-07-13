package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;

public final class ax extends aq {

    /* renamed from: a  reason: collision with root package name */
    public static final g.a<ax> f11167a = $$Lambda$ax$2Ip8Yz0jcLbrAUNmvvYtGSSpeM.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final int f11168c;

    /* renamed from: d  reason: collision with root package name */
    private final float f11169d;

    public ax(int i) {
        a.a(i > 0, (Object) "maxStars must be a positive integer");
        this.f11168c = i;
        this.f11169d = -1.0f;
    }

    public ax(int i, float f2) {
        boolean z = true;
        a.a(i > 0, (Object) "maxStars must be a positive integer");
        a.a((f2 < 0.0f || f2 > ((float) i)) ? false : z, (Object) "starRating is out of range [0, maxStars]");
        this.f11168c = i;
        this.f11169d = f2;
    }

    /* access modifiers changed from: private */
    public static ax a(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(a(0), -1) == 2) {
            z = true;
        }
        a.a(z);
        int i = bundle.getInt(a(1), 5);
        float f2 = bundle.getFloat(a(2), -1.0f);
        return f2 == -1.0f ? new ax(i) : new ax(i, f2);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.f11168c == axVar.f11168c && this.f11169d == axVar.f11169d;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f11168c), Float.valueOf(this.f11169d));
    }
}
