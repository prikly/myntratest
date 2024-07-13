package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;

public final class aj extends aq {

    /* renamed from: a  reason: collision with root package name */
    public static final g.a<aj> f11094a = $$Lambda$aj$fxgHUOv_ZkvCX2ATzGCP2wXnenA.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final float f11095c;

    public aj() {
        this.f11095c = -1.0f;
    }

    public aj(float f2) {
        a.a(f2 >= 0.0f && f2 <= 100.0f, (Object) "percent must be in the range of [0, 100]");
        this.f11095c = f2;
    }

    /* access modifiers changed from: private */
    public static aj a(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(a(0), -1) == 1) {
            z = true;
        }
        a.a(z);
        float f2 = bundle.getFloat(a(1), -1.0f);
        return f2 == -1.0f ? new aj() : new aj(f2);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        return (obj instanceof aj) && this.f11095c == ((aj) obj).f11095c;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f11095c));
    }
}
