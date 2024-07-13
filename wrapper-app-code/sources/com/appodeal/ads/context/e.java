package com.appodeal.ads.context;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1<Activity, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f16332a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f16332a = fVar;
    }

    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        Intrinsics.checkNotNullParameter(activity, "destroyedActivity");
        f.a(this.f16332a, activity);
        return Unit.INSTANCE;
    }
}
