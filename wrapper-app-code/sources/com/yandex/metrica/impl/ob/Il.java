package com.yandex.metrica.impl.ob;

import com.appnext.base.a.c.d;
import com.yandex.metrica.impl.ob.C0685rl;
import org.json.JSONArray;
import org.json.JSONObject;

public class Il extends C0685rl {

    /* renamed from: h  reason: collision with root package name */
    public volatile String f4286h = null;
    public volatile String i = null;

    Il(String str, String str2, C0685rl.b bVar, int i2, boolean z) {
        super(str, str2, (C0685rl.b) null, i2, z, C0685rl.c.VIEW, C0685rl.a.WEBVIEW);
    }

    /* access modifiers changed from: package-private */
    public JSONArray a(C0439hl hlVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d.COLUMN_TYPE, "HTML");
            if (hlVar.j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", A2.a(this.f4286h, hlVar.o));
                jSONObject2.putOpt("ou", A2.a(this.i, hlVar.o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return true;
    }

    public String toString() {
        return "WebViewElement{url='" + this.f4286h + '\'' + ", originalUrl='" + this.i + '\'' + ", mClassName='" + this.f6733a + '\'' + ", mId='" + this.f6734b + '\'' + ", mParseFilterReason=" + this.f6735c + ", mDepth=" + this.f6736d + ", mListItem=" + this.f6737e + ", mViewType=" + this.f6738f + ", mClassType=" + this.f6739g + "} ";
    }
}
