package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.segments.j;
import com.appodeal.ads.storage.a;
import com.appodeal.ads.storage.o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

public final class f implements j.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f17245a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f17246b = LazyKt.lazy(new e(this));

    public f(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f17245a = oVar;
    }

    public final Object a(Context context, j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jVar, "ruleHelper");
        return Integer.valueOf(((Number) this.f17246b.getValue()).intValue());
    }
}
