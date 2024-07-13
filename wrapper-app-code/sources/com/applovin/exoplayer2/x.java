package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;

public final class x extends aq {

    /* renamed from: a  reason: collision with root package name */
    public static final g.a<x> f13940a = $$Lambda$x$ZnAIZuLi96U9yFVSicQt2fz4VxA.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13941c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13942d;

    public x() {
        this.f13941c = false;
        this.f13942d = false;
    }

    public x(boolean z) {
        this.f13941c = true;
        this.f13942d = z;
    }

    /* access modifiers changed from: private */
    public static x a(Bundle bundle) {
        a.a(bundle.getInt(a(0), -1) == 0);
        return bundle.getBoolean(a(1), false) ? new x(bundle.getBoolean(a(2), false)) : new x();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f13942d == xVar.f13942d && this.f13941c == xVar.f13941c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f13941c), Boolean.valueOf(this.f13942d));
    }
}
