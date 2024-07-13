package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ServiceInfo f16587a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l3(ServiceInfo serviceInfo) {
        super(1);
        this.f16587a = serviceInfo;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ver", this.f16587a.getBuildVersion());
        jsonObjectBuilder.hasValue(ServiceProvider.NAMED_SDK, this.f16587a.getSdkVersion());
        return Unit.INSTANCE;
    }
}
