package com.bytedance.sdk.openadsdk.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.video.c.b;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import com.onesignal.OneSignalDbContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsAppAdDownloadManager */
public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final n f1912a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1913b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, c> f1914c = new HashMap();

    public void a() {
    }

    public void b() {
    }

    public void b(JSONObject jSONObject) {
    }

    private a(b bVar, n nVar) {
        this.f1913b = bVar;
        this.f1912a = nVar;
    }

    public static a a(b bVar, n nVar) {
        return new a(bVar, nVar);
    }

    public void c() {
        this.f1914c.clear();
    }

    private n a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (jSONObject == null) {
            return null;
        }
        n nVar = new n();
        nVar.b(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nVar.m(str);
        }
        if (this.f1912a == null) {
            return nVar;
        }
        if (nVar.aa() != null) {
            str2 = nVar.aa().a();
        }
        if (TextUtils.isEmpty(str2)) {
            return this.f1912a;
        }
        return (this.f1912a.aa() == null || !str2.equals(this.f1912a.aa().a())) ? nVar : this.f1912a;
    }

    public void a(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            a(context, a(optJSONObject, str), optJSONObject, i, z);
        }
    }

    private void a(Context context, n nVar, JSONObject jSONObject, int i, boolean z) {
        if (context != null && nVar != null && nVar.aa() != null && jSONObject != null && this.f1913b != null && this.f1914c.get(nVar.aa().a()) == null) {
            String a2 = u.a(i);
            if (!TextUtils.isEmpty(a2)) {
                this.f1914c.put(nVar.aa().a(), a(context, nVar, jSONObject, a2, z));
            }
        }
    }

    public void a(Context context, JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            a(context, a(optJSONObject, (String) null), str);
        }
    }

    private void a(Context context, n nVar, String str) {
        if (context != null && nVar != null) {
            if (nVar.aa() == null) {
                d.a(context, nVar, str).d();
            } else {
                c cVar = this.f1914c.get(nVar.aa().a());
                if (cVar != null) {
                    cVar.d();
                }
            }
            if (context instanceof b) {
                ((b) context).L();
            }
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            a(a(optJSONObject, (String) null), optJSONObject);
        }
    }

    private void a(n nVar, JSONObject jSONObject) {
        if (this.f1913b != null && nVar != null && nVar.aa() != null) {
            String a2 = nVar.aa().a();
            if (this.f1914c.containsKey(a2)) {
                this.f1914c.remove(a2);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, "success");
                    jSONObject2.put("status", "unsubscribed");
                    jSONObject2.put("appad", jSONObject);
                    this.f1913b.a("app_ad_event", jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private c a(Context context, n nVar, JSONObject jSONObject, String str, boolean z) {
        c a2 = d.a(context, nVar, str);
        a2.a(true);
        return a2;
    }
}
