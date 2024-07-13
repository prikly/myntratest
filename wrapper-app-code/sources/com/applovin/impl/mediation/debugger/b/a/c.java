package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.appnext.ads.fullscreen.RewardedVideo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f14682a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14683b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f14684c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f14685d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14686e = false;

    c(JSONObject jSONObject, Map<String, b> map, MaxAdFormat maxAdFormat, n nVar) {
        this.f14682a = JsonUtils.getString(jSONObject, "name", "");
        this.f14683b = JsonUtils.getBoolean(jSONObject, RewardedVideo.VIDEO_MODE_DEFAULT, false).booleanValue();
        JSONObject jSONObject2 = jSONObject;
        Map<String, b> map2 = map;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        n nVar2 = nVar;
        this.f14684c = a("bidders", jSONObject2, map2, maxAdFormat2, nVar2);
        this.f14685d = a("waterfall", jSONObject2, map2, maxAdFormat2, nVar2);
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, b> map, MaxAdFormat maxAdFormat, n nVar) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (!(jSONObject2 == null || (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) == null)) {
                if (bVar.A()) {
                    this.f14686e = true;
                }
                arrayList.add(new b(jSONObject2, maxAdFormat, bVar, nVar));
            }
        }
        return arrayList;
    }

    public List<b> a() {
        return this.f14684c;
    }

    public List<b> b() {
        return this.f14685d;
    }

    public boolean c() {
        return this.f14683b;
    }

    public boolean d() {
        return this.f14686e;
    }
}
