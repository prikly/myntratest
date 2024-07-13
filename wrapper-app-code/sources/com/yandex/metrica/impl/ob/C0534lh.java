package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.Jf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lh  reason: case insensitive filesystem */
public class C0534lh {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Jf.e.b.a, String> f6157a = Collections.unmodifiableMap(new a());

    /* renamed from: b  reason: collision with root package name */
    private static final Map<H1.d, String> f6158b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.lh$a */
    class a extends HashMap<Jf.e.b.a, String> {
        a() {
            put(Jf.e.b.a.COMPLETE, "complete");
            put(Jf.e.b.a.ERROR, "error");
            put(Jf.e.b.a.OFFLINE, "offline");
            put(Jf.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lh$b */
    class b extends HashMap<H1.d, String> {
        b() {
            put(H1.d.WIFI, "wifi");
            put(H1.d.CELL, "cell");
            put(H1.d.OFFLINE, "offline");
            put(H1.d.UNDEFINED, AdError.UNDEFINED_DOMAIN);
        }
    }

    public String a(Jf.e.b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(OSOutcomeConstants.OUTCOME_ID, bVar.d().f4345a);
            jSONObject.putOpt("url", bVar.d().f4346b);
            jSONObject.putOpt("status", f6157a.get(bVar.h()));
            jSONObject.putOpt("code", bVar.f());
            if (!A2.a(bVar.e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.e(), 0));
            } else if (!A2.a(bVar.b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.b(), 0));
            }
            jSONObject.putOpt("headers", a(bVar.g()));
            Throwable c2 = bVar.c();
            if (c2 != null) {
                str = c2.toString() + "\n" + Log.getStackTraceString(c2);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f6158b.get(bVar.a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    private JSONObject a(Map<String, List<String>> map) throws JSONException {
        if (A2.b((Map) map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (!A2.b((Collection) next.getValue())) {
                List<String> list = (List) next.getValue();
                if (list.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < 10; i++) {
                        arrayList.add(list.get(i));
                    }
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(A2.a(str2, 100));
                    }
                }
                jSONObject.putOpt(str, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }
}
