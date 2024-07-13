package com.bytedance.sdk.component.adexpress.a.c;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.adexpress.dynamic.c.f;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TempPkgModel */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f18336a;

    /* renamed from: b  reason: collision with root package name */
    private String f18337b;

    /* renamed from: c  reason: collision with root package name */
    private String f18338c;

    /* renamed from: d  reason: collision with root package name */
    private String f18339d;

    /* renamed from: e  reason: collision with root package name */
    private List<C0225a> f18340e;

    public String a() {
        return this.f18336a;
    }

    public void a(String str) {
        this.f18336a = str;
    }

    public String b() {
        return this.f18337b;
    }

    public void b(String str) {
        this.f18337b = str;
    }

    public String c() {
        return this.f18338c;
    }

    public void c(String str) {
        this.f18338c = str;
    }

    public String d() {
        return this.f18339d;
    }

    public void d(String str) {
        this.f18339d = str;
    }

    public List<C0225a> e() {
        if (this.f18340e == null) {
            this.f18340e = new ArrayList();
        }
        return this.f18340e;
    }

    public void a(List<C0225a> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f18340e = list;
    }

    public boolean f() {
        return !TextUtils.isEmpty(c()) && !TextUtils.isEmpty(b()) && !TextUtils.isEmpty(a());
    }

    public String g() {
        if (!f()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", a());
            jSONObject.putOpt(MediationMetaData.KEY_VERSION, b());
            jSONObject.putOpt("main", c());
            jSONObject.putOpt("fallback", d());
            JSONArray jSONArray = new JSONArray();
            if (e() != null) {
                for (C0225a next : e()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", next.a());
                    jSONObject2.putOpt("md5", next.b());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(next.c()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.a.c.a$a  reason: collision with other inner class name */
    /* compiled from: TempPkgModel */
    public static class C0225a {

        /* renamed from: a  reason: collision with root package name */
        private String f18341a;

        /* renamed from: b  reason: collision with root package name */
        private String f18342b;

        /* renamed from: c  reason: collision with root package name */
        private int f18343c;

        public boolean equals(Object obj) {
            if (!(obj instanceof C0225a)) {
                return super.equals(obj);
            }
            String str = this.f18341a;
            return str != null && str.equals(((C0225a) obj).a());
        }

        public String a() {
            return this.f18341a;
        }

        public void a(String str) {
            this.f18341a = str;
        }

        public String b() {
            return this.f18342b;
        }

        public void b(String str) {
            this.f18342b = str;
        }

        public int c() {
            return this.f18343c;
        }

        public void a(int i) {
            this.f18343c = i;
        }
    }

    public static a e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.a(jSONObject.optString("name"));
        aVar.b(jSONObject.optString(MediationMetaData.KEY_VERSION));
        aVar.c(jSONObject.optString("main"));
        String optString = jSONObject.optString("fallback_optimize");
        aVar.d(optString);
        f.a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C0225a aVar2 = new C0225a();
                aVar2.a(optJSONObject.optString("url"));
                aVar2.b(optJSONObject.optString("md5"));
                aVar2.a(optJSONObject.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(aVar2);
            }
        }
        aVar.a((List<C0225a>) arrayList);
        if (!aVar.f()) {
            return null;
        }
        return aVar;
    }
}
