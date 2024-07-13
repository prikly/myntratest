package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.a;
import com.appodeal.ads.networking.binders.b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17029a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p3(b bVar) {
        super(1);
        this.f17029a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (Map.Entry next : ((b.c) this.f17029a).a().entrySet()) {
            jsonObjectBuilder.hasObject((String) next.getKey(), JsonObjectBuilderKt.jsonObject(new o3((a) next.getValue())));
        }
        return Unit.INSTANCE;
    }
}
