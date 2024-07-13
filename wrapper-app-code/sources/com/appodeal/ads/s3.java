package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17233a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3(b bVar) {
        super(1);
        this.f17233a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ifa", ((b.d) this.f17233a).c());
        jsonObjectBuilder.hasValue("advertising_tracking", ((b.d) this.f17233a).b());
        jsonObjectBuilder.hasValue("adidg", Boolean.valueOf(((b.d) this.f17233a).a()));
        return Unit.INSTANCE;
    }
}
