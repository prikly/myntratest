package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonArrayBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q3 extends Lambda implements Function1<JsonArrayBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17046a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q3(b bVar) {
        super(1);
        this.f17046a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonArrayBuilder jsonArrayBuilder = (JsonArrayBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "$this$jsonArray");
        jsonArrayBuilder.putValues(((b.c) this.f17046a).b());
        return Unit.INSTANCE;
    }
}
