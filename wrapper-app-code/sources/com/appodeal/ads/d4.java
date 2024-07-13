package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class d4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d4(b bVar) {
        super(1);
        this.f16372a = bVar;
    }

    public final Object invoke(Object obj) {
        JSONObject jsonObject;
        String str;
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (ServiceData serviceData : ((b.k) this.f16372a).a()) {
            if (serviceData instanceof ServiceData.AppsFlyer) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new y3(serviceData));
                str = "appsflyer";
            } else if (serviceData instanceof ServiceData.Adjust) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new a4(serviceData));
                str = "adjust";
            } else if (serviceData instanceof ServiceData.FacebookAnalytics) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new b4(serviceData));
                str = "facebook_analytics";
            } else if (serviceData instanceof ServiceData.Firebase) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new c4(serviceData));
                str = "firebase";
            }
            jsonObjectBuilder.hasObject(str, jsonObject);
        }
        return Unit.INSTANCE;
    }
}
