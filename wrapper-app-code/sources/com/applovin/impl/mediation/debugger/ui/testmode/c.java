package com.applovin.impl.mediation.debugger.ui.testmode;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final n f14932a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14933b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14934c;

    /* renamed from: d  reason: collision with root package name */
    private String f14935d;

    public c(n nVar) {
        this.f14932a = nVar;
        this.f14935d = (String) nVar.b(d.B, null);
        nVar.b(d.B);
        if (StringUtils.isValidString(this.f14935d)) {
            this.f14934c = true;
        }
        this.f14933b = ((Boolean) nVar.b(d.C, false)).booleanValue();
        nVar.b(d.C);
    }

    public void a(String str) {
        this.f14935d = str;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f14933b) {
            this.f14933b = JsonUtils.containsCaseInsensitiveString(this.f14932a.Y().k().f15750b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f14932a.Y().g() || AppLovinSdkUtils.isEmulator();
        }
    }

    public void a(boolean z) {
        this.f14934c = z;
    }

    public boolean a() {
        return this.f14933b;
    }

    public boolean b() {
        return this.f14934c;
    }

    public String c() {
        return this.f14935d;
    }

    public void d() {
        this.f14932a.a(d.C, true);
    }
}
