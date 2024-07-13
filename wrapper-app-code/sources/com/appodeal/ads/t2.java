package com.appodeal.ads;

import com.appodeal.ads.Native;
import com.appodeal.ads.api.Stats;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.binders.b;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

public final class t2 extends r<s2> {
    public int J;
    public final LinkedHashSet K = new LinkedHashSet();
    public final LinkedHashSet L = new LinkedHashSet();
    public final LinkedHashSet M = new LinkedHashSet();

    public t2(Native.c cVar) {
        super(cVar);
    }

    public final void a(Stats.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setCapacity(this.J);
    }

    public final void e(l lVar) {
        Intrinsics.checkNotNullParameter((s2) lVar, "adObject");
        String str = Native.f16126b.name;
        Intrinsics.checkNotNullExpressionValue(str, "nativeAdType.name");
        a((b.a.C0189a) new b.a.C0189a.d(str));
    }

    public final AdType n() {
        return AdType.Native;
    }
}
