package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.binders.b;
import com.appodeal.ads.t0;
import kotlin.jvm.internal.Intrinsics;

public final class w0 extends z5<v0> {
    public w0(t0.d dVar) {
        super(dVar);
    }

    public final void e(l lVar) {
        v0 v0Var = (v0) lVar;
        Intrinsics.checkNotNullParameter(v0Var, "adObject");
        t0.a c2 = t0.c();
        Intrinsics.checkNotNullExpressionValue(c2, "obtainAdRenderer()");
        a b2 = c2.b();
        Intrinsics.checkNotNullExpressionValue(b2, "adRenderer.currentDisplayPosition");
        String str = b2.f16163a;
        Intrinsics.checkNotNullExpressionValue(str, "currentDisplayPosition.name");
        a((b.a.C0189a) new b.a.C0189a.C0190a(str, v0Var.t == 50 ? 320 : 728, c2.a(), t0.f17414b));
    }

    public final AdType n() {
        return AdType.Banner;
    }
}
