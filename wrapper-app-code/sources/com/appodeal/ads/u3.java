package com.appodeal.ads;

import com.appnext.base.b.i;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17451a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3(b bVar) {
        super(1);
        this.f17451a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("lt", ((b.h) this.f17451a).b());
        jsonObjectBuilder.hasValue(i.fC, ((b.h) this.f17451a).a());
        jsonObjectBuilder.hasValue("lon", ((b.h) this.f17451a).c());
        return Unit.INSTANCE;
    }
}
