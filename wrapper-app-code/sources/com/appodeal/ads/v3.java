package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17608a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v3(b bVar) {
        super(1);
        this.f17608a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("user_id", ((b.n) this.f17608a).d());
        jsonObjectBuilder.hasValue("locale", ((b.n) this.f17608a).f());
        jsonObjectBuilder.hasValue("consent", Boolean.valueOf(((b.n) this.f17608a).b()));
        jsonObjectBuilder.hasObject("consent_report", ((b.n) this.f17608a).c());
        jsonObjectBuilder.hasObject("token", ((b.n) this.f17608a).h());
        jsonObjectBuilder.hasValue("user_agent", ((b.n) this.f17608a).a());
        jsonObjectBuilder.hasValue("timezone", ((b.n) this.f17608a).g());
        jsonObjectBuilder.hasValue("local_time", Long.valueOf(((b.n) this.f17608a).e()));
        return Unit.INSTANCE;
    }
}
