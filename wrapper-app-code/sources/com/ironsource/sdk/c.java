package com.ironsource.sdk;

import com.ironsource.sdk.j.a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9033a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9034b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f9035c = null;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f9036d;

    /* renamed from: e  reason: collision with root package name */
    private String f9037e;

    /* renamed from: f  reason: collision with root package name */
    private final a f9038f;

    public c(String str, a aVar) {
        this.f9037e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f9038f = (a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    public final b a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f9037e);
            jSONObject.put("rewarded", this.f9033a);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return new b(this.f9034b ? d.a() : d.a(jSONObject), this.f9037e, this.f9033a, this.f9034b, this.f9036d, this.f9038f, this.f9035c);
    }
}
