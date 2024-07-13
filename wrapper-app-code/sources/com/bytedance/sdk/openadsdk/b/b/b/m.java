package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: PlayBufferModel */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public long f270a;

    /* renamed from: b  reason: collision with root package name */
    public int f271b;

    /* renamed from: c  reason: collision with root package name */
    public long f272c;

    public void a(long j) {
        this.f270a = j;
    }

    public void a(int i) {
        this.f271b = i;
    }

    public void b(long j) {
        this.f272c = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f270a);
                jSONObject.put("buffers_count", this.f271b);
                jSONObject.put("total_duration", this.f272c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
