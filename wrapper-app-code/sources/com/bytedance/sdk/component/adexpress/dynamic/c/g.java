package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.c;
import com.bytedance.sdk.component.adexpress.dynamic.b.d;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.e;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicLayoutInflater */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static HashMap<String, String> f18563g;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18564a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f18565b;

    /* renamed from: c  reason: collision with root package name */
    private c f18566c;

    /* renamed from: d  reason: collision with root package name */
    private a f18567d;

    /* renamed from: e  reason: collision with root package name */
    private b f18568e;

    /* renamed from: f  reason: collision with root package name */
    private d f18569f;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f18563g = hashMap;
        hashMap.put("subtitle", "description");
        f18563g.put("source", "source|app.app_name");
        f18563g.put("screenshot", "dynamic_creative.screenshot");
    }

    public g(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f18564a = jSONObject;
        this.f18565b = jSONObject2;
        this.f18566c = new c(jSONObject2);
        this.f18567d = a.a(jSONObject3);
        this.f18569f = d.a(jSONObject4);
    }

    public h a() {
        JSONObject jSONObject;
        this.f18566c.a();
        try {
            jSONObject = new JSONObject(this.f18569f.f18498b);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        h a2 = a(d.a(this.f18564a, jSONObject), (h) null);
        a(a2);
        e eVar = new e();
        e.a aVar = new e.a();
        aVar.f18552a = this.f18567d.f18570a;
        aVar.f18553b = this.f18567d.f18571b;
        aVar.f18554c = 0.0f;
        eVar.a(aVar);
        eVar.a(a2, 0.0f, 0.0f);
        eVar.a();
        if (eVar.f18548a.f18490d == 65536.0f) {
            return null;
        }
        return eVar.f18548a.f18492f;
    }

    private void a(h hVar) {
        float f2;
        if (hVar != null) {
            int b2 = b.b(com.bytedance.sdk.component.adexpress.c.a(), (float) b.a(com.bytedance.sdk.component.adexpress.c.a()));
            if (this.f18567d.f18572c) {
                f2 = this.f18567d.f18570a;
            } else {
                f2 = Math.min(this.f18567d.f18570a, (float) b2);
            }
            if (this.f18567d.f18571b == 0.0f) {
                hVar.e(f2);
                hVar.i().e().i("auto");
                hVar.f(0.0f);
                return;
            }
            hVar.e(f2);
            hVar.f(this.f18567d.f18572c ? this.f18567d.f18571b : Math.min(this.f18567d.f18571b, (float) b.b(com.bytedance.sdk.component.adexpress.c.a(), (float) b.c(com.bytedance.sdk.component.adexpress.c.a()))));
            hVar.i().e().i("fixed");
        }
    }

    public h a(JSONObject jSONObject, h hVar) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f18569f != null) {
                b bVar = new b();
                this.f18568e = bVar;
                JSONObject a2 = bVar.a(this.f18569f.f18497a, optInt, jSONObject);
                if (a2 != null) {
                    jSONObject = a2;
                }
            }
        }
        h a3 = a(jSONObject);
        a3.b(hVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            a3.a((List<h>) null);
            return a3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i2);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    i = a3.i().e().Q();
                } else {
                    i = optJSONArray2.length();
                }
                for (int i3 = 0; i3 < i; i3++) {
                    h a4 = a(optJSONArray2.optJSONObject(i3), a3);
                    arrayList.add(a4);
                    arrayList3.add(a4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            a3.a((List<h>) arrayList);
        }
        if (arrayList2.size() > 0) {
            a3.b((List<List<h>>) arrayList2);
        }
        return a3;
    }

    public h a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString(OSOutcomeConstants.OUTCOME_ID);
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        j.a(optString, optJSONObject);
        JSONObject a2 = j.a(optString, j.a(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        h hVar = new h();
        if (TextUtils.isEmpty(optString2)) {
            hVar.b(String.valueOf(hVar.hashCode()));
        } else {
            hVar.b(optString2);
        }
        if (optJSONObject != null) {
            hVar.c((float) optJSONObject.optDouble("x"));
            hVar.d((float) optJSONObject.optDouble("y"));
            hVar.e((float) optJSONObject.optDouble(IabUtils.KEY_WIDTH));
            hVar.f((float) optJSONObject.optDouble(IabUtils.KEY_HEIGHT));
            hVar.g((float) optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.b.e eVar = new com.bytedance.sdk.component.adexpress.dynamic.b.e();
            eVar.a(optString);
            eVar.b(optJSONObject.optString("data"));
            eVar.c(optJSONObject.optString("dataExtraInfo"));
            f c2 = f.c(optJSONObject);
            eVar.a(c2);
            f c3 = f.c(a2);
            if (c3 == null) {
                eVar.b(c2);
            } else {
                eVar.b(c3);
            }
            a(c2);
            a(c3);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f18565b) != null) {
                a(eVar, jSONObject2.optInt("image_mode"));
            }
            String b2 = eVar.b();
            f e2 = eVar.e();
            if (f18563g.containsKey(b2) && !e2.G()) {
                e2.r(f18563g.get(b2));
            }
            if (e2.G()) {
                str = eVar.c();
            } else {
                str = a(eVar.c());
            }
            if (com.bytedance.sdk.component.adexpress.c.b()) {
                if (TextUtils.equals(b2, "star") || TextUtils.equals(b2, "text_star")) {
                    str = a("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(b2, "score-count") || TextUtils.equals(b2, "score-count-type-1") || TextUtils.equals(b2, "score-count-type-2")) {
                    str = a("dynamic_creative.comment_num_i18n|");
                }
            }
            if (TextUtils.isEmpty(b()) || (!TextUtils.equals("logo-union", optString) && !TextUtils.equals("logo", optString))) {
                eVar.b(str);
            } else {
                eVar.b(str + "adx:" + b());
            }
            hVar.a(eVar);
        }
        return hVar;
    }

    private void a(com.bytedance.sdk.component.adexpress.dynamic.b.e eVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            eVar.a("video");
            String a2 = j.a("video");
            eVar.e().r(a2);
            eVar.f().r(a2);
            eVar.b(a2);
            eVar.e().al();
            return;
        }
        eVar.a("image");
        String a3 = j.a("image");
        eVar.e().r(a3);
        eVar.f().r(a3);
        eVar.b(a3);
        if (a3 != null && (lastIndexOf = a3.lastIndexOf(".")) > 0) {
            String substring = a3.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, a(substring + ".width"));
                jSONObject.put(IabUtils.KEY_HEIGHT, a(substring + ".height"));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            eVar.c(jSONObject.toString());
        }
        eVar.e().am();
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f18566c.b(str2)) {
                String valueOf = String.valueOf(this.f18566c.a(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String b() {
        c cVar = this.f18566c;
        if (cVar == null) {
            return "";
        }
        return String.valueOf(cVar.a("adx_name"));
    }

    private void a(f fVar) {
        if (fVar != null) {
            String s = fVar.s();
            if (!TextUtils.isEmpty(s)) {
                int indexOf = s.indexOf("{{");
                int indexOf2 = s.indexOf("}}");
                if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
                    String a2 = a(s.substring(indexOf + 1, indexOf2));
                    if (!TextUtils.isEmpty(a2)) {
                        fVar.k((s.substring(0, indexOf) + s.substring(indexOf2 + 2)) + a2);
                    }
                }
            }
        }
    }

    /* compiled from: DynamicLayoutInflater */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        float f18570a;

        /* renamed from: b  reason: collision with root package name */
        float f18571b;

        /* renamed from: c  reason: collision with root package name */
        boolean f18572c;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            if (jSONObject != null) {
                aVar.f18570a = (float) jSONObject.optDouble(IabUtils.KEY_WIDTH);
                aVar.f18571b = (float) jSONObject.optDouble(IabUtils.KEY_HEIGHT);
                aVar.f18572c = jSONObject.optBoolean("isLandscape");
            }
            return aVar;
        }
    }
}
