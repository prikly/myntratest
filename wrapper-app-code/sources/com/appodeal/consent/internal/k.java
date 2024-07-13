package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class k {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Consent f17880a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17881b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f17882c;

        public a(Consent consent, String str, Boolean bool) {
            this.f17880a = consent;
            this.f17881b = str;
            this.f17882c = bool;
        }

        public final Consent a() {
            return this.f17880a;
        }

        public final String b() {
            return this.f17881b;
        }

        public final Boolean c() {
            return this.f17882c;
        }
    }

    public static a a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        JSONObject optJSONObject = jSONObject.optJSONObject("consent");
        Boolean bool = null;
        Consent consent = optJSONObject == null ? null : new Consent(optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("form");
        String optString = optJSONObject2 == null ? null : optJSONObject2.optString("url");
        if (optJSONObject2 != null) {
            bool = Boolean.valueOf(optJSONObject2.optBoolean(Constants.SHOW));
        }
        return new a(consent, optString, bool);
    }
}
