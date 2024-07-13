package com.bytedance.sdk.openadsdk.core.j.b;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.a;
import com.bytedance.sdk.openadsdk.core.j.b.b;
import com.bytedance.sdk.openadsdk.i.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastTracker */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f1304a;

    /* renamed from: b  reason: collision with root package name */
    private b f1305b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1306c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1307d;

    /* compiled from: VastTracker */
    enum b {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    protected c(String str, b bVar, Boolean bool) {
        this.f1304a = str;
        this.f1305b = bVar;
        this.f1306c = bool.booleanValue();
    }

    public String c() {
        return this.f1304a;
    }

    public boolean d() {
        return this.f1306c;
    }

    public void f_() {
        this.f1307d = true;
    }

    /* compiled from: VastTracker */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f1308a;

        /* renamed from: b  reason: collision with root package name */
        private b f1309b = b.TRACKING_URL;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1310c = false;

        public a(String str) {
            this.f1308a = str;
        }

        public a a(boolean z) {
            this.f1310c = z;
            return this;
        }

        public c a() {
            return new c(this.f1308a, this.f1309b, Boolean.valueOf(this.f1310c));
        }
    }

    public boolean e() {
        return this.f1307d;
    }

    public static List<String> a(List<c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (c next : list) {
            if (next != null && (!next.e() || next.d())) {
                arrayList.add(next.c());
                next.f_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.j.c.c(arrayList).a(aVar).a(j).a(str).a();
    }

    public static void b(List<c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar, long j, String str) {
        a(a(list, aVar, j, str));
    }

    public static void a(List<String> list) {
        com.bytedance.sdk.component.e.b.b c2;
        for (String next : list) {
            if (!(next == null || (c2 = d.a().b().c()) == null)) {
                c2.a(next);
                c2.a(new com.bytedance.sdk.component.e.a.a() {
                    public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    }

                    public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    }
                });
            }
        }
    }

    public static JSONArray b(List<c> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).c());
        }
        return jSONArray;
    }

    public static List<c> a(JSONArray jSONArray) {
        return a(jSONArray, false);
    }

    public static List<c> a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new a(optString).a(z).a());
                }
            }
        }
        return arrayList;
    }

    public static List<b> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new b.a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).a());
                }
            }
        }
        return arrayList;
    }

    public static List<a> c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new a.C0006a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), optJSONObject.optLong("trackingMilliseconds", 0)).a());
                }
            }
        }
        return arrayList;
    }
}
