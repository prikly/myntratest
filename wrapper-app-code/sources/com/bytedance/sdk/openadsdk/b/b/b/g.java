package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedPauseModel */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f251a;

    /* renamed from: b  reason: collision with root package name */
    private long f252b;

    public void a(long j) {
        this.f251a = j;
    }

    public void b(long j) {
        this.f252b = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f251a);
                jSONObject.put("total_duration", this.f252b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
