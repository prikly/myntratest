package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoErrorModel */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f258a;

    /* renamed from: b  reason: collision with root package name */
    private long f259b;

    /* renamed from: c  reason: collision with root package name */
    private long f260c;

    /* renamed from: d  reason: collision with root package name */
    private int f261d;

    /* renamed from: e  reason: collision with root package name */
    private String f262e;

    /* renamed from: f  reason: collision with root package name */
    private String f263f;

    public void a(String str) {
        this.f258a = str;
    }

    public void a(long j) {
        this.f259b = j;
    }

    public void b(long j) {
        this.f260c = j;
    }

    public void a(int i) {
        this.f261d = i;
    }

    public void b(String str) {
        this.f262e = str;
    }

    public void c(String str) {
        this.f263f = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f258a);
                jSONObject.put("preload_size", this.f259b);
                jSONObject.put("load_time", this.f260c);
                jSONObject.put("error_code", this.f261d);
                jSONObject.put("error_message", this.f262e);
                jSONObject.put("error_message_server", this.f263f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
