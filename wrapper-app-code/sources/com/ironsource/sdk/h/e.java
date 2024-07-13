package com.ironsource.sdk.h;

import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f9567a;

    public e(JSONObject jSONObject) {
        this.f9567a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final boolean a() {
        return this.f9567a.optBoolean("useCacheDir", false);
    }
}
