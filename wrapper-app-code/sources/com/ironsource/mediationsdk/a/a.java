package com.ironsource.mediationsdk.a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    JSONObject f8393a;

    /* renamed from: b  reason: collision with root package name */
    int f8394b;

    /* renamed from: c  reason: collision with root package name */
    String f8395c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8396d = "eventId";

    /* renamed from: e  reason: collision with root package name */
    private final String f8397e = "timestamp";

    /* renamed from: f  reason: collision with root package name */
    private final String f8398f = "InterstitialEvents";

    /* renamed from: g  reason: collision with root package name */
    private final String f8399g = "events";

    /* renamed from: h  reason: collision with root package name */
    private final String f8400h = "events";

    a() {
    }

    static JSONObject a(c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.c()) ? new JSONObject(cVar.c()) : new JSONObject();
            jSONObject.put("eventId", cVar.a());
            jSONObject.put("timestamp", cVar.b());
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return TextUtils.isEmpty(this.f8395c) ? b() : this.f8395c;
    }

    public abstract String a(ArrayList<c> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public final String a(JSONArray jSONArray) {
        try {
            if (this.f8393a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f8393a.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f8394b == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public abstract String c();
}
