package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: EndcardSkipModel */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f238a;

    /* renamed from: b  reason: collision with root package name */
    private long f239b;

    /* renamed from: c  reason: collision with root package name */
    private int f240c;

    /* renamed from: d  reason: collision with root package name */
    private int f241d;

    public void a(long j) {
        this.f238a = j;
    }

    public void b(long j) {
        this.f239b = j;
    }

    public void a(int i) {
        this.f240c = i;
    }

    public void b(int i) {
        this.f241d = i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f238a);
                jSONObject.put("total_duration", this.f239b);
                jSONObject.put("vbtt_skip_type", this.f240c);
                jSONObject.put("skip_reason", this.f241d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
