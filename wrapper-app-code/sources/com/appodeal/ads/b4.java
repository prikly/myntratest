package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.onesignal.outcomes.OSOutcomeConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ServiceData f16317a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b4(ServiceData serviceData) {
        super(1);
        this.f16317a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("user_id", ((ServiceData.FacebookAnalytics) this.f16317a).getUserId());
        jsonObjectBuilder.hasValue(OSOutcomeConstants.APP_ID, ((ServiceData.FacebookAnalytics) this.f16317a).getAppId());
        return Unit.INSTANCE;
    }
}
