package com.appodeal.ads.utils.campaign_frequency;

import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final o f17491b = o.f17407b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ boolean f17492c = (!a.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public final String f17493a;

    public a(String str) {
        this.f17493a = str;
    }

    public static JSONObject a() {
        Map<String, String> d2 = f17491b.f17408a.d();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : d2.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), new JSONObject((String) next.getValue()));
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
        return jSONObject;
    }
}
