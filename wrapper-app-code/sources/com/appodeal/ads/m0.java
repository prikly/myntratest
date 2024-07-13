package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n0 f16598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16599b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, int i) {
        super(1);
        this.f16598a = n0Var;
        this.f16599b = i;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        Iterator<String> keys = this.f16598a.f16800b.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "defaultWaterfall.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                jsonObjectBuilder.hasValue(str, this.f16598a.f16800b.get(str));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        jsonObjectBuilder.hasValue("waterfall_ad_type", Integer.valueOf(this.f16599b));
        jsonObjectBuilder.hasValue("waterfall_start_time", Long.valueOf(System.currentTimeMillis()));
        jsonObjectBuilder.hasArray("ad_units", JsonObjectBuilderKt.jsonArray(l0.f16576a));
        return Unit.INSTANCE;
    }
}
