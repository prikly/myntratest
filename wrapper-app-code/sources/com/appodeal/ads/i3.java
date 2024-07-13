package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16483a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i3(b bVar) {
        super(1);
        this.f16483a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue(Constants.DEBUG_INTERSTITIAL, ((b.g) this.f16483a).a());
        jsonObjectBuilder.hasArray("sa", ((b.g) this.f16483a).c());
        jsonObjectBuilder.hasValue("check_sdk_version", ((b.g) this.f16483a).b());
        return Unit.INSTANCE;
    }
}
