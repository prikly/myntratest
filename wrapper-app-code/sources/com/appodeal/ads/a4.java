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

public final class a4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ServiceData f16174a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a4(ServiceData serviceData) {
        super(1);
        this.f16174a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("attribution_id", ((ServiceData.Adjust) this.f16174a).getAttributionId());
        Map<String, Object> conversionData = ((ServiceData.Adjust) this.f16174a).getConversionData();
        JSONObject jSONObject = null;
        if ((conversionData.isEmpty() ^ true ? conversionData : null) != null) {
            jSONObject = JsonObjectBuilderKt.jsonObject(new z3(conversionData));
        }
        jsonObjectBuilder.hasObject("conversion_data", jSONObject);
        return Unit.INSTANCE;
    }
}
