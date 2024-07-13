package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.h.c.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StatsEventThread */
public class t extends h<c.a> {
    private n<a> l = m.f();

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    public t(String str, String str2, f fVar, n nVar, h.c cVar, h.b bVar) {
        super(str, str2, fVar, nVar, cVar, bVar);
    }

    public i a(List<c.a> list) {
        if (this.l == null) {
            this.l = m.f();
        }
        if (list == null || list.size() == 0 || !e.a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (c.a aVar : list) {
                jSONArray.put(aVar.f1991b);
            }
            jSONObject.put("stats_list", jSONArray);
        } catch (Exception unused) {
        }
        return this.l.b(jSONObject);
    }
}
