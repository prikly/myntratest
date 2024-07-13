package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.advertising.AdvertisingInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class j {

    public static final class a extends Lambda implements Function1<JsonObjectBuilder, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f17877a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdvertisingInfo.AdvertisingProfile f17878b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Pair<Integer, Integer> f17879c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AdvertisingInfo.AdvertisingProfile advertisingProfile, a aVar, Pair pair) {
            super(1);
            this.f17877a = aVar;
            this.f17878b = advertisingProfile;
            this.f17879c = pair;
        }

        public final Object invoke(Object obj) {
            JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
            Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
            jsonObjectBuilder.hasObject("app", JsonObjectBuilderKt.jsonObject(new h(this.f17877a)));
            jsonObjectBuilder.hasObject("device", JsonObjectBuilderKt.jsonObject(new i(this.f17878b, this.f17877a, this.f17879c)));
            jsonObjectBuilder.hasObject("consent", this.f17877a.d().toJson());
            jsonObjectBuilder.hasValue("sdk_ver", this.f17877a.c());
            jsonObjectBuilder.hasValue("ver", this.f17877a.e());
            return Unit.INSTANCE;
        }
    }

    public static JSONObject a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "data");
        AdvertisingInfo.AdvertisingProfile a2 = aVar.a();
        Pair<Integer, Integer> n = aVar.n();
        JSONObject jSONObject = new JSONObject(aVar.i());
        JsonObjectBuilderKt.jsonObject(jSONObject, new a(a2, aVar, n));
        return jSONObject;
    }
}
