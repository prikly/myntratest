package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoCancelModel */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f256a;

    /* renamed from: b  reason: collision with root package name */
    private long f257b;

    public i(String str, long j) {
        this.f256a = str;
        this.f257b = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f256a);
                jSONObject.put("preload_size", this.f257b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
