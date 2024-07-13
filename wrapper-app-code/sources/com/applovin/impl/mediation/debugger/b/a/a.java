package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    private final String f14674a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14675b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f14676c;

    /* renamed from: d  reason: collision with root package name */
    private final c f14677d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f14678e;

    public a(JSONObject jSONObject, Map<String, b> map, n nVar) {
        this.f14674a = JsonUtils.getString(jSONObject, "name", "");
        this.f14675b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f14676c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", (String) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f14678e = new ArrayList(jSONArray.length());
        c cVar = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                c cVar2 = new c(jSONObject2, map, this.f14676c, nVar);
                this.f14678e.add(cVar2);
                if (cVar == null && cVar2.c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f14677d = cVar;
    }

    private c g() {
        if (!this.f14678e.isEmpty()) {
            return this.f14678e.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        return this.f14675b.compareToIgnoreCase(aVar.f14675b);
    }

    public String a() {
        return this.f14674a;
    }

    public String b() {
        return this.f14675b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.f14676c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : LogConstants.KEY_UNKNOWN;
    }

    public MaxAdFormat d() {
        return this.f14676c;
    }

    public c e() {
        c cVar = this.f14677d;
        return cVar != null ? cVar : g();
    }

    public String f() {
        return "\n---------- " + this.f14675b + " ----------" + "\nIdentifier - " + this.f14674a + "\nFormat     - " + c();
    }
}
