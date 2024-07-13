package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedBreakModel */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public long f242a;

    /* renamed from: b  reason: collision with root package name */
    public long f243b;

    /* renamed from: c  reason: collision with root package name */
    public int f244c;

    /* renamed from: d  reason: collision with root package name */
    public int f245d = 0;

    public void a(long j) {
        this.f242a = j;
    }

    public void b(long j) {
        this.f243b = j;
    }

    public void a(int i) {
        this.f244c = i;
    }

    public void b(int i) {
        this.f245d = i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f242a);
                jSONObject.put("buffers_time", this.f243b);
                jSONObject.put("break_reason", this.f244c);
                jSONObject.put("video_backup", this.f245d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
