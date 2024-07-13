package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedContinueModel */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f246a;

    /* renamed from: b  reason: collision with root package name */
    private long f247b;

    public void a(long j) {
        this.f246a = j;
    }

    public void b(long j) {
        this.f247b = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f246a);
                jSONObject.put("total_duration", this.f247b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
