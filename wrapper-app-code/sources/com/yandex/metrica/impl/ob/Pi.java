package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.impl.ob.C0286bi;
import com.yandex.metrica.impl.ob.Tl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Pi {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, C0286bi.a> f4787a = Collections.unmodifiableMap(new a());

    class a extends HashMap<String, C0286bi.a> {
        a() {
            put("wifi", C0286bi.a.WIFI);
            put("cell", C0286bi.a.CELL);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Ui ui, Tl.a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("requests");
        if (optJSONObject != null && optJSONObject.has("list") && (optJSONArray = optJSONObject.optJSONArray("list")) != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(a(optJSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
            if (!arrayList.isEmpty()) {
                ui.g((List<C0286bi>) arrayList);
            }
        }
    }

    private C0286bi a(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> keys = jSONObject2.keys();
        while (true) {
            i = 0;
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i)));
                i++;
            }
        }
        String b2 = Tl.b(jSONObject, OSOutcomeConstants.OUTCOME_ID);
        String b3 = Tl.b(jSONObject, "url");
        String b4 = Tl.b(jSONObject, "method");
        Long valueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i < jSONArray2.length()) {
                arrayList2.add(f4787a.get(jSONArray2.getString(i)));
                i++;
            }
        }
        return new C0286bi(b2, b3, b4, arrayList, valueOf, arrayList2);
    }
}
