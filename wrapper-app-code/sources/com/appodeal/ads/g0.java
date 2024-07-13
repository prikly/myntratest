package com.appodeal.ads;

import org.json.JSONObject;

@Deprecated
public final class g0 implements ApdServiceInitParams {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f16412a;

    public g0(JSONObject jSONObject) {
        this.f16412a = jSONObject;
    }

    public final JSONObject getJsonData() {
        return this.f16412a;
    }

    public final RestrictedData getRestrictedData() {
        return j4.f16495a;
    }

    public final boolean isTestMode() {
        return j0.f16489c.isTestMode();
    }
}
