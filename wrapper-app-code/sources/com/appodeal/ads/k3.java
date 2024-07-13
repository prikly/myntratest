package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16564a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3(b bVar) {
        super(1);
        this.f16564a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("type", ((b.a) this.f16564a).b());
        jsonObjectBuilder.hasValue("main_id", ((b.a) this.f16564a).g());
        jsonObjectBuilder.hasValue("segment_id", Long.valueOf(((b.a) this.f16564a).i()));
        jsonObjectBuilder.hasValue("rewarded_video", ((b.a) this.f16564a).h());
        jsonObjectBuilder.hasValue("large_banners", ((b.a) this.f16564a).f());
        jsonObjectBuilder.hasValue("show_timestamp", ((b.a) this.f16564a).j());
        jsonObjectBuilder.hasValue("click_timestamp", ((b.a) this.f16564a).c());
        jsonObjectBuilder.hasValue("finish_timestamp", ((b.a) this.f16564a).d());
        jsonObjectBuilder.hasValue("impid", ((b.a) this.f16564a).e());
        b.a.C0189a a2 = ((b.a) this.f16564a).a();
        jsonObjectBuilder.hasObject("ad_properties", a2 == null ? null : JsonObjectBuilderKt.jsonObject(new d3(a2)));
        return Unit.INSTANCE;
    }
}
