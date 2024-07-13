package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17101a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3(b bVar) {
        super(1);
        this.f17101a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasObject("adapters", JsonObjectBuilderKt.jsonObject(new p3(this.f17101a)));
        jsonObjectBuilder.hasArray("show_array", JsonObjectBuilderKt.jsonArray(new q3(this.f17101a)));
        return Unit.INSTANCE;
    }
}
