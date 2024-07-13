package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    String f9219a;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f9220b;

    /* renamed from: c  reason: collision with root package name */
    String f9221c;

    /* renamed from: d  reason: collision with root package name */
    String f9222d;

    public n(JSONObject jSONObject) {
        this.f9219a = jSONObject.optString("functionName");
        this.f9220b = jSONObject.optJSONObject("functionParams");
        this.f9221c = jSONObject.optString("success");
        this.f9222d = jSONObject.optString("fail");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f9219a);
            jSONObject.put("functionParams", this.f9220b);
            jSONObject.put("success", this.f9221c);
            jSONObject.put("fail", this.f9222d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
