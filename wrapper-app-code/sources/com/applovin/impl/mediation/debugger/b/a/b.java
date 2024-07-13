package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f14679a;

    /* renamed from: b  reason: collision with root package name */
    private final e f14680b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f14681c;

    public b(JSONObject jSONObject, MaxAdFormat maxAdFormat, com.applovin.impl.mediation.debugger.b.c.b bVar, n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f14680b = new e(jSONObject2, nVar);
        } else {
            this.f14680b = null;
        }
        this.f14679a = new d(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f14681c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f14681c.add(new e(jSONObject3, nVar));
            }
        }
    }

    public d a() {
        return this.f14679a;
    }

    public e b() {
        return this.f14680b;
    }

    public boolean c() {
        return this.f14680b != null;
    }

    public List<e> d() {
        return this.f14681c;
    }
}
