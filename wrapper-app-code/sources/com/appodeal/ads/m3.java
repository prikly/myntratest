package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16613a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m3(b bVar) {
        super(1);
        this.f16613a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (ServiceInfo serviceInfo : ((b.j) this.f16613a).a()) {
            jsonObjectBuilder.hasObject(serviceInfo.getName(), JsonObjectBuilderKt.jsonObject(new l3(serviceInfo)));
        }
        return Unit.INSTANCE;
    }
}
