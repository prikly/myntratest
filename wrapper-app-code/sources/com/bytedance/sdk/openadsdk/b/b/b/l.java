package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoSuccessModel */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f266a;

    /* renamed from: b  reason: collision with root package name */
    private long f267b;

    /* renamed from: c  reason: collision with root package name */
    private long f268c;

    /* renamed from: d  reason: collision with root package name */
    private long f269d;

    public void a(String str) {
        this.f266a = str;
    }

    public void a(long j) {
        this.f267b = j;
    }

    public void b(long j) {
        this.f268c = j;
    }

    public void c(long j) {
        this.f269d = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f266a);
                jSONObject.put("preload_size", this.f267b);
                jSONObject.put("load_time", this.f268c);
                jSONObject.put("local_cache", this.f269d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
