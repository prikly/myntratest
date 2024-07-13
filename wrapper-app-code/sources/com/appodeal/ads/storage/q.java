package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.context.b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f17411a;

    public q(b bVar, String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f17411a = LazyKt.lazy(new p(bVar, str));
    }

    public final SharedPreferences a() {
        Object value = this.f17411a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }
}
