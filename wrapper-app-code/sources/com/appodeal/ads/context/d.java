package com.appodeal.ads.context;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1<Activity, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f16331a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f16331a = fVar;
    }

    public final Object invoke(Object obj) {
        f.b(this.f16331a, (Activity) obj);
        return Unit.INSTANCE;
    }
}
