package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Tl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ih  reason: case insensitive filesystem */
public class C0459ih {
    public List<C0435hh> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new Tl.a(str).optJSONArray("sdk_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                try {
                                    String optString2 = optJSONArray2.getJSONObject(i2).optString("name");
                                    if (!TextUtils.isEmpty(optString2)) {
                                        arrayList2.add(optString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!A2.b((Collection) arrayList2)) {
                            arrayList.add(new C0435hh(optString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
