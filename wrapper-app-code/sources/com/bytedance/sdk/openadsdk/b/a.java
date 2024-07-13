package com.bytedance.sdk.openadsdk.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.b.a.b;
import com.bytedance.sdk.openadsdk.b.a.c;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.plus.PlusShare;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvent */
public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final String f206a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f207b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f208c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f209d = new JSONObject();

    /* renamed from: e  reason: collision with root package name */
    private String f210e;

    /* renamed from: f  reason: collision with root package name */
    private String f211f;

    /* renamed from: g  reason: collision with root package name */
    private String f212g;

    /* renamed from: h  reason: collision with root package name */
    private String f213h;
    private String i;
    private com.bytedance.sdk.openadsdk.b.a.a j;
    private String k;
    private String l;
    private String m;
    private String n;

    a(C0000a aVar) {
        this.f206a = TextUtils.isEmpty(aVar.f214a) ? l.a() : aVar.f214a;
        this.j = aVar.m;
        this.l = aVar.f218e;
        this.f210e = aVar.f215b;
        this.f211f = aVar.f216c;
        this.f212g = TextUtils.isEmpty(aVar.f217d) ? "app_union" : aVar.f217d;
        this.k = aVar.i;
        this.f213h = aVar.f219f;
        this.i = aVar.f220g;
        this.m = aVar.j;
        this.n = aVar.k;
        this.f209d = aVar.f221h = aVar.f221h != null ? aVar.f221h : new JSONObject();
        this.f207b = new JSONObject();
        if (!TextUtils.isEmpty(aVar.k)) {
            try {
                this.f207b.put("app_log_url", aVar.k);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    a(String str, JSONObject jSONObject) {
        this.f206a = str;
        this.f207b = jSONObject;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("localId", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                return new a(optString, optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void f() throws JSONException {
        this.f207b.putOpt("app_log_url", this.n);
        this.f207b.putOpt("tag", this.f210e);
        this.f207b.putOpt(PlusShare.KEY_CALL_TO_ACTION_LABEL, this.f211f);
        this.f207b.putOpt("category", this.f212g);
        if (!TextUtils.isEmpty(this.f213h)) {
            try {
                this.f207b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.f213h)));
            } catch (NumberFormatException unused) {
                this.f207b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.i)) {
            try {
                this.f207b.putOpt("ext_value", Long.valueOf(Long.parseLong(this.i)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.f207b.putOpt("log_extra", this.l);
        }
        if (!TextUtils.isEmpty(this.k)) {
            try {
                this.f207b.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.k)));
            } catch (NumberFormatException unused3) {
            }
        }
        this.f207b.putOpt("is_ad_event", "1");
        try {
            this.f207b.putOpt("nt", this.m);
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f209d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f207b.putOpt(next, this.f209d.opt(next));
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f206a) || this.f207b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f206a);
            jSONObject.put("event", b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public JSONObject b() {
        if (this.f208c.get()) {
            return this.f207b;
        }
        try {
            f();
            if (this.j != null) {
                this.j.a(this.f207b);
            }
            this.f208c.set(true);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.b("AdEvent", th);
        }
        return this.f207b;
    }

    public JSONObject c() {
        JSONObject b2 = b();
        try {
            JSONObject jSONObject = new JSONObject(b2.toString());
            jSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return b2;
        }
    }

    public String d() {
        return this.f206a;
    }

    public boolean e() {
        JSONObject jSONObject = this.f207b;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(PlusShare.KEY_CALL_TO_ACTION_LABEL);
        if (!TextUtils.isEmpty(optString)) {
            return b.f225a.contains(optString);
        }
        if (TextUtils.isEmpty(this.f211f)) {
            return false;
        }
        return b.f225a.contains(this.f211f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.a$a  reason: collision with other inner class name */
    /* compiled from: AdEvent */
    public static final class C0000a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f214a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f215b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f216c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f217d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f218e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f219f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f220g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public JSONObject f221h;
        /* access modifiers changed from: private */
        public String i;
        /* access modifiers changed from: private */
        public final String j = String.valueOf(NetworkTools.a(m.a()));
        /* access modifiers changed from: private */
        public String k;
        private b l;
        /* access modifiers changed from: private */
        public com.bytedance.sdk.openadsdk.b.a.a m;

        public C0000a a(String str) {
            this.k = str;
            return this;
        }

        public C0000a b(String str) {
            this.f215b = str;
            return this;
        }

        public C0000a c(String str) {
            this.f216c = str;
            return this;
        }

        public C0000a d(String str) {
            this.f217d = str;
            return this;
        }

        public C0000a e(String str) {
            this.f218e = str;
            return this;
        }

        public C0000a f(String str) {
            this.f219f = str;
            return this;
        }

        public C0000a g(String str) {
            this.f220g = str;
            return this;
        }

        public C0000a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f221h = jSONObject;
            return this;
        }

        public void a(com.bytedance.sdk.openadsdk.b.a.a aVar) {
            this.m = aVar;
            final a aVar2 = new a(this);
            try {
                if (this.l != null) {
                    this.l.a(aVar2.f207b);
                } else {
                    new c().a(aVar2.f207b);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.b("AdEvent", th);
            }
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                t.b(new g("dispatchEvent") {
                    public void run() {
                        m.c().a(aVar2);
                    }
                });
            } else {
                m.c().a(aVar2);
            }
        }
    }
}
