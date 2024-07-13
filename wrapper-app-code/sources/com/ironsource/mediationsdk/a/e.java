package com.ironsource.mediationsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f8428d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e  reason: collision with root package name */
    private final String f8429e = "super.dwh.mediation_events";

    /* renamed from: f  reason: collision with root package name */
    private final String f8430f = "table";

    /* renamed from: g  reason: collision with root package name */
    private final String f8431g = "data";

    e(int i) {
        this.f8394b = i;
    }

    public final String a(ArrayList<c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f8393a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a2 = a(it.next());
                    if (a2 != null) {
                        jSONArray.put(a2);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    public final String c() {
        return "ironbeast";
    }
}
