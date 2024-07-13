package com.bytedance.sdk.openadsdk.b.a;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventStartListenerWrapper */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    b f224a;

    public void a(JSONObject jSONObject) throws JSONException {
        b bVar = this.f224a;
        if (bVar != null) {
            bVar.a(jSONObject);
        }
        jSONObject.put("event_ts", System.currentTimeMillis());
    }
}
