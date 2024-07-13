package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedOverModel */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f248a;

    /* renamed from: b  reason: collision with root package name */
    private long f249b;

    /* renamed from: c  reason: collision with root package name */
    private int f250c = 0;

    public void a(long j) {
        this.f248a = j;
    }

    public void b(long j) {
        this.f249b = j;
    }

    public void a(int i) {
        this.f250c = i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f248a);
                jSONObject.put("buffers_time", this.f249b);
                jSONObject.put("video_backup", this.f250c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
