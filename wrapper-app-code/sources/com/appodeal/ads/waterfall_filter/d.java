package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17635a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f17636b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f17637c = new ArrayList();

    public final d a() {
        d dVar = new d();
        ArrayList arrayList = this.f17635a;
        ArrayList arrayList2 = dVar.f17635a;
        if (arrayList != null) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = this.f17636b;
        ArrayList arrayList4 = dVar.f17636b;
        if (arrayList3 != null) {
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        ArrayList arrayList5 = dVar.f17637c;
        ArrayList arrayList6 = this.f17637c;
        if (arrayList6 != null) {
            arrayList5.clear();
            arrayList5.addAll(arrayList6);
        }
        return dVar;
    }

    public final void a(JSONObject jSONObject) {
        ArrayList arrayList = this.f17635a;
        arrayList.clear();
        JSONArray optJSONArray = jSONObject.optJSONArray("precache");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getJSONObject(i));
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
        }
        ArrayList arrayList2 = this.f17636b;
        arrayList2.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("ads");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    arrayList2.add(optJSONArray2.getJSONObject(i2));
                } catch (Exception e3) {
                    Log.log(e3);
                }
            }
        }
        this.f17637c.clear();
        Iterator it = this.f17635a.iterator();
        while (it.hasNext()) {
            try {
                ((JSONObject) it.next()).put("is_precache", true);
            } catch (JSONException e4) {
                Log.log(e4);
            }
        }
        this.f17637c.addAll(this.f17635a);
        this.f17637c.addAll(this.f17636b);
    }
}
