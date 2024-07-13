package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONObject;

class I7 {

    /* renamed from: a  reason: collision with root package name */
    private String f4130a;

    /* renamed from: b  reason: collision with root package name */
    private String f4131b;

    I7() {
    }

    public void a(String str) {
        this.f4130a = str;
    }

    public void b(String str) {
        this.f4131b = str;
    }

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f4130a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f4131b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
