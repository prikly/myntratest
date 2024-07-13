package com.appodeal.ads;

import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f16456a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UserData f16457b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h4(HashMap hashMap, l5 l5Var) {
        super(1);
        this.f16456a = hashMap;
        this.f16457b = l5Var;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (Map.Entry next : this.f16456a.entrySet()) {
            jsonObjectBuilder.hasValue((String) next.getKey(), next.getValue());
        }
        UserSettings.Gender gender = this.f16457b.getGender();
        jsonObjectBuilder.hasValue("appodeal_gender", gender == null ? null : Integer.valueOf(gender.getIntValue()));
        jsonObjectBuilder.hasValue("appodeal_age", this.f16457b.getAge());
        return Unit.INSTANCE;
    }
}
