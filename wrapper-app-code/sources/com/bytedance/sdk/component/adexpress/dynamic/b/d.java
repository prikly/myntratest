package com.bytedance.sdk.component.adexpress.dynamic.b;

import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicDiffPlugin */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f18497a;

    /* renamed from: b  reason: collision with root package name */
    public String f18498b;

    /* renamed from: c  reason: collision with root package name */
    public String f18499c;

    /* renamed from: d  reason: collision with root package name */
    public String f18500d;

    /* compiled from: DynamicDiffPlugin */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18501a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f18502b;
    }

    public static d a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        d dVar = new d();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    a aVar = new a();
                    aVar.f18501a = optJSONObject.optInt(OSOutcomeConstants.OUTCOME_ID);
                    aVar.f18502b = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(aVar);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        dVar.f18497a = arrayList;
        dVar.f18498b = jSONObject.optString("diff_data");
        dVar.f18499c = jSONObject.optString("style_diff");
        dVar.f18500d = jSONObject.optString("tag_diff");
        return dVar;
    }
}
