package com.bytedance.sdk.openadsdk.b;

import org.json.JSONObject;

/* compiled from: AdShowTime */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private long f325a;

    /* renamed from: b  reason: collision with root package name */
    private long f326b;

    /* renamed from: c  reason: collision with root package name */
    private long f327c;

    /* renamed from: d  reason: collision with root package name */
    private long f328d;

    /* renamed from: e  reason: collision with root package name */
    private long f329e;

    public JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (this.f325a > 0) {
            jSONObject.put("show_start", this.f325a);
            if (this.f326b > 0) {
                jSONObject.put("show_firstQuartile", this.f326b);
                if (this.f327c > 0) {
                    jSONObject.put("show_mid", this.f327c);
                    if (this.f328d > 0) {
                        jSONObject.put("show_thirdQuartile", this.f328d);
                        if (this.f329e > 0) {
                            jSONObject.put("show_full", this.f329e);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public void a(long j) {
        if (this.f325a <= 0) {
            this.f325a = j;
        }
    }

    public void a(long j, float f2) {
        if (f2 > 0.0f) {
            a(j);
        }
        double d2 = (double) f2;
        if (d2 >= 0.25d) {
            a(j);
            b(j);
        }
        if (d2 >= 0.5d) {
            a(j);
            b(j);
            c(j);
        }
        if (d2 >= 0.75d) {
            a(j);
            b(j);
            c(j);
            d(j);
        }
        if (f2 >= 1.0f) {
            a(j);
            b(j);
            c(j);
            d(j);
            e(j);
        }
    }

    public boolean a() {
        return this.f325a > 0;
    }

    public JSONObject b() {
        return a((JSONObject) null);
    }

    public void b(long j) {
        if (this.f326b <= 0) {
            this.f326b = j;
        }
    }

    public void c(long j) {
        if (this.f327c <= 0) {
            this.f327c = j;
        }
    }

    public void d(long j) {
        if (this.f328d <= 0) {
            this.f328d = j;
        }
    }

    public void e(long j) {
        if (this.f329e <= 0) {
            this.f329e = j;
        }
    }
}
