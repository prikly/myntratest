package com.bytedance.sdk.openadsdk.core.e;

import com.bytedance.sdk.component.utils.l;
import org.json.JSONObject;

/* compiled from: AppInfo */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static int f1044f = 1;

    /* renamed from: g  reason: collision with root package name */
    private static int f1045g = 5;

    /* renamed from: a  reason: collision with root package name */
    private String f1046a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f1047b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f1048c = "";

    /* renamed from: d  reason: collision with root package name */
    private double f1049d = -1.0d;

    /* renamed from: e  reason: collision with root package name */
    private int f1050e = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f1051h;

    public String a() {
        return this.f1046a;
    }

    public void a(String str) {
        this.f1046a = str;
    }

    public String b() {
        return this.f1047b;
    }

    public void b(String str) {
        this.f1047b = str;
    }

    public String c() {
        return this.f1048c;
    }

    public void c(String str) {
        this.f1048c = str;
    }

    public double d() {
        return this.f1049d;
    }

    public void a(double d2) {
        if (d2 < ((double) f1044f) || d2 > ((double) f1045g)) {
            this.f1049d = -1.0d;
        } else {
            this.f1049d = d2;
        }
    }

    public int e() {
        return this.f1050e;
    }

    public void a(int i) {
        if (i <= 0) {
            this.f1050e = -1;
        } else {
            this.f1050e = i;
        }
    }

    public int f() {
        return this.f1051h;
    }

    public void b(int i) {
        this.f1051h = i;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", b());
            jSONObject.put("app_size", f());
            jSONObject.put("comment_num", e());
            jSONObject.put("download_url", a());
            jSONObject.put("package_name", c());
            jSONObject.put("score", d());
        } catch (Exception e2) {
            l.b(e2.toString());
        }
        return jSONObject;
    }
}
