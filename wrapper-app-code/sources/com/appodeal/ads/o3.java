package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.a;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f17012a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o3(a aVar) {
        super(1);
        this.f17012a = aVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ver", this.f17012a.b());
        jsonObjectBuilder.hasValue(ServiceProvider.NAMED_SDK, this.f17012a.a());
        return Unit.INSTANCE;
    }
}
