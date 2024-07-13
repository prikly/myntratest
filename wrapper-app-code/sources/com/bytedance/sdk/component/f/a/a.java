package com.bytedance.sdk.component.f.a;

import org.json.JSONObject;

/* compiled from: ThreadLogModel */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f19207a;

    /* renamed from: b  reason: collision with root package name */
    public int f19208b;

    /* renamed from: c  reason: collision with root package name */
    public int f19209c;

    /* renamed from: d  reason: collision with root package name */
    public int f19210d;

    public a(int i, int i2, int i3, int i4) {
        this.f19207a = i;
        this.f19208b = i2;
        this.f19209c = i3;
        this.f19210d = i4;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f19207a);
            jSONObject.put("sdk_max_thread_num", this.f19208b);
            jSONObject.put("app_thread_num", this.f19209c);
            jSONObject.put("app_max_thread_num", this.f19210d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
