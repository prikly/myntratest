package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ms.bd.o.Pgl.c;

public final class d3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a.C0189a f16371a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d3(b.a.C0189a aVar) {
        super(1);
        this.f16371a = aVar;
    }

    public final Object invoke(Object obj) {
        int i;
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("type", this.f16371a.getType());
        b.a.C0189a aVar = this.f16371a;
        if (aVar instanceof b.a.C0189a.C0190a) {
            jsonObjectBuilder.hasValue("animation", Boolean.valueOf(((b.a.C0189a.C0190a) aVar).a()));
            jsonObjectBuilder.hasValue("smart", Boolean.valueOf(((b.a.C0189a.C0190a) this.f16371a).c()));
            i = ((b.a.C0189a.C0190a) this.f16371a).b();
        } else {
            if (aVar instanceof b.a.C0189a.c) {
                i = c.COLLECT_MODE_FINANCE;
            }
            return Unit.INSTANCE;
        }
        jsonObjectBuilder.hasValue("size", Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
