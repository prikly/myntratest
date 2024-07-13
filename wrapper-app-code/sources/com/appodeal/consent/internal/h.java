package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f17873a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(a aVar) {
        super(1);
        this.f17873a = aVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("key", this.f17873a.b());
        jsonObjectBuilder.hasValue("packageName", this.f17873a.m());
        return Unit.INSTANCE;
    }
}
