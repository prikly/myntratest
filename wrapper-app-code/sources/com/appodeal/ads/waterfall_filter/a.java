package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.n5;
import com.appodeal.ads.r;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends d {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f17627d;

    /* renamed from: e  reason: collision with root package name */
    public d f17628e = a();

    /* renamed from: f  reason: collision with root package name */
    public final AdType f17629f;

    public a(JSONObject jSONObject, AdType adType) {
        ArrayList arrayList = new ArrayList();
        this.f17627d = arrayList;
        a(jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        this.f17629f = adType;
        arrayList.add(new c(adType));
        arrayList.add(new b(optJSONArray));
    }

    public final void a(r rVar) {
        this.f17628e = a();
        Iterator it = this.f17627d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this.f17628e.f17637c, rVar);
        }
        d dVar = this.f17628e;
        dVar.f17635a.clear();
        dVar.f17636b.clear();
        Iterator it2 = dVar.f17637c.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject = (JSONObject) it2.next();
            (jSONObject.optBoolean("is_precache") ? dVar.f17635a : dVar.f17636b).add(jSONObject);
        }
        n5.a(this.f17629f, this);
    }

    public final ArrayList b() {
        return this.f17628e.f17635a;
    }

    public final ArrayList c() {
        return this.f17628e.f17636b;
    }
}
