package com.bytedance.sdk.openadsdk.core.c.a;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: DynamicAdInfo */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f1012a;

    /* renamed from: b  reason: collision with root package name */
    private String f1013b;

    /* renamed from: c  reason: collision with root package name */
    private String f1014c;

    public a(String str, String str2, String str3) {
        this.f1012a = str;
        this.f1013b = str2;
        this.f1014c = str3;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f1012a)) {
                jSONObject.put("cid", this.f1012a);
            }
            if (!TextUtils.isEmpty(this.f1013b)) {
                jSONObject.put("log_extra", this.f1013b);
            }
            if (!TextUtils.isEmpty(this.f1014c)) {
                jSONObject.put("download_url", this.f1014c);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
