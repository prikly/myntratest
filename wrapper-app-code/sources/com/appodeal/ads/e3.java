package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16387a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e3(b bVar) {
        super(1);
        this.f16387a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("session_id", Long.valueOf(((b.l) this.f16387a).e()));
        jsonObjectBuilder.hasValue("session_uuid", ((b.l) this.f16387a).j());
        jsonObjectBuilder.hasValue("session_uptime", Long.valueOf(((b.l) this.f16387a).h()));
        jsonObjectBuilder.hasValue("session_uptime_m", Long.valueOf(((b.l) this.f16387a).i()));
        jsonObjectBuilder.hasValue("session_start_ts", Long.valueOf(((b.l) this.f16387a).f()));
        jsonObjectBuilder.hasValue("session_start_ts_m", Long.valueOf(((b.l) this.f16387a).g()));
        jsonObjectBuilder.hasValue("app_uptime", Long.valueOf(((b.l) this.f16387a).c()));
        jsonObjectBuilder.hasValue("app_uptime_m", Long.valueOf(((b.l) this.f16387a).d()));
        jsonObjectBuilder.hasValue("app_session_average_length", Long.valueOf(((b.l) this.f16387a).a()));
        jsonObjectBuilder.hasValue("app_session_average_length_m", Long.valueOf(((b.l) this.f16387a).b()));
        return Unit.INSTANCE;
    }
}
