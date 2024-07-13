package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: PlayErrorModel */
public class n implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f273a;

    /* renamed from: b  reason: collision with root package name */
    private long f274b;

    /* renamed from: c  reason: collision with root package name */
    private int f275c;

    /* renamed from: d  reason: collision with root package name */
    private int f276d;

    /* renamed from: e  reason: collision with root package name */
    private String f277e;

    public void a(long j) {
        this.f273a = j;
    }

    public void b(long j) {
        this.f274b = j;
    }

    public void a(int i) {
        this.f275c = i;
    }

    public void b(int i) {
        this.f276d = i;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f273a);
                jSONObject.put("total_duration", this.f274b);
                jSONObject.put("error_code", this.f275c);
                jSONObject.put("extra_error_code", this.f276d);
                jSONObject.put("error_message", this.f277e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
