package com.bytedance.sdk.openadsdk.core.c.a;

import com.bytedance.sdk.component.e.d.c;
import com.bytedance.sdk.openadsdk.common.a;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicAppInfo */
public class b {
    private List<String> b() {
        return Arrays.asList(new String[]{c.c1657027613239dc("aqrJjci"), c.c1657027613239dc("aeKmbj"), c.c1657027613239dc("gdvWahvki}oBbka")});
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String put : b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put(c.c1657027613239dc("aqrMehc"), a.a());
            jSONObject.put(c.c1657027613239dc("iolfvDvwFhgn"), a.e());
            jSONObject.put(c.c1657027613239dc("ahf"), a.b());
            jSONObject.put(c.c1657027613239dc("seiF`lrngg"), a.c());
            jSONObject.put(c.c1657027613239dc("aqrUawungg"), a.d());
            jSONObject.put(c.c1657027613239dc("ndvW}uc"), a.f());
            jSONObject.put(c.c1657027613239dc("strskwrKaz~"), jSONArray);
            jSONObject.put(c.c1657027613239dc("ddtjg`Oc"), a.a(m.a()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
