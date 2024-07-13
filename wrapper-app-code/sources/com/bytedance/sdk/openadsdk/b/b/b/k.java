package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoStartModel */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f264a;

    /* renamed from: b  reason: collision with root package name */
    private long f265b;

    public k(String str, long j) {
        this.f264a = str;
        this.f265b = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f264a);
                jSONObject.put("preload_size", this.f265b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
