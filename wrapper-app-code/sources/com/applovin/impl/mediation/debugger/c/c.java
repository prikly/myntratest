package com.applovin.impl.mediation.debugger.c;

import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b.c<JSONObject> f14739a;

    public c(b.c<JSONObject> cVar, n nVar) {
        super("TaskFetchMediationDebuggerInfo", nVar, true);
        this.f14739a = cVar;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.c.c.a(this.f15418b));
            Boolean a2 = k.a().a(f());
            if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && !Boolean.TRUE.equals(a2)) {
                o.a k = this.f15418b.Y().k();
                if (StringUtils.isValidString(k.f15750b)) {
                    jSONObject.put("idfa", k.f15750b);
                }
            }
        } catch (JSONException e2) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Failed to construct JSON body", e2);
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15418b.C());
        }
        Map<String, Object> h2 = this.f15418b.Y().h();
        map.put("package_name", String.valueOf(h2.get("package_name")));
        map.put("app_version", String.valueOf(h2.get("app_version")));
        Map<String, Object> b2 = this.f15418b.Y().b();
        map.put("platform", String.valueOf(b2.get("platform")));
        map.put("os", String.valueOf(b2.get("os")));
        return map;
    }

    public void run() {
        AnonymousClass1 r1 = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f15418b).b("POST").a(com.applovin.impl.mediation.c.b.c(this.f15418b)).c(com.applovin.impl.mediation.c.b.d(this.f15418b)).a(a()).a(new JSONObject()).b(((Long) this.f15418b.a(com.applovin.impl.sdk.c.a.f15341g)).intValue()).a(b()).a(), this.f15418b, g()) {
            public void a(int i, String str, JSONObject jSONObject) {
                c.this.f14739a.a(i, str, jSONObject);
            }

            public void a(JSONObject jSONObject, int i) {
                c.this.f14739a.a(jSONObject, i);
            }
        };
        r1.a(com.applovin.impl.sdk.c.a.f15337c);
        r1.b(com.applovin.impl.sdk.c.a.f15338d);
        this.f15418b.V().a((a) r1);
    }
}
