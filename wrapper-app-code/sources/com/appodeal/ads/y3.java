package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class y3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ServiceData f17729a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y3(ServiceData serviceData) {
        super(1);
        this.f17729a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("attribution_id", ((ServiceData.AppsFlyer) this.f17729a).getAttributionId());
        Map<String, Object> conversionData = ((ServiceData.AppsFlyer) this.f17729a).getConversionData();
        JSONObject jSONObject = null;
        if ((conversionData.isEmpty() ^ true ? conversionData : null) != null) {
            jSONObject = JsonObjectBuilderKt.jsonObject(new x3(conversionData));
        }
        jsonObjectBuilder.hasObject("conversion_data", jSONObject);
        return Unit.INSTANCE;
    }
}
