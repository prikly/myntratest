package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedPlayModel */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f253a;

    /* renamed from: b  reason: collision with root package name */
    private long f254b;

    /* renamed from: c  reason: collision with root package name */
    private int f255c;

    public void a(long j) {
        this.f253a = j;
    }

    public void b(long j) {
        this.f254b = j;
    }

    public void a(int i) {
        this.f255c = i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("video_start_duration", this.f253a);
                jSONObject.put("video_cache_size", this.f254b);
                jSONObject.put("is_auto_play", this.f255c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
