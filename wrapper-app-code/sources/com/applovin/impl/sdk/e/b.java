package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class b extends a {
    b(n nVar) {
        super("TaskApiSubmitData", nVar);
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = i.a(jSONObject);
            this.f15418b.O().a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.aa, (Object) a2.getString("device_id"));
            this.f15418b.O().a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.ac, (Object) a2.getString("device_token"));
            this.f15418b.O().a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.ad, (Object) Long.valueOf(a2.getLong("publisher_id")));
            i.d(a2, this.f15418b);
            i.e(a2, this.f15418b);
            String string = JsonUtils.getString(a2, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string)) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(a2, "sdk_update_message")) {
                    str = JsonUtils.getString(a2, "sdk_update_message", str);
                }
                v.h("AppLovinSdk", str);
            }
            this.f15418b.W().b();
        } catch (Throwable th) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Unable to parse API response", th);
            }
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        o Y = this.f15418b.Y();
        Map<String, Object> d2 = Y.d();
        Utils.renameKeyInObjectMap("platform", "type", d2);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d2);
        jSONObject.put("device_info", new JSONObject(d2));
        Map<String, Object> h2 = Y.h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h2);
        Utils.renameKeyInObjectMap("ia", "installed_at", h2);
        jSONObject.put("app_info", new JSONObject(h2));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.ei)).booleanValue()) {
            jSONObject.put(Constants.STATS, this.f15418b.W().c());
        }
    }

    private void d(JSONObject jSONObject) {
        AnonymousClass1 r0 = new u<JSONObject>(c.a(this.f15418b).a(i.a("2.0/device", this.f15418b)).c(i.b("2.0/device", this.f15418b)).a(i.e(this.f15418b)).b("POST").a(jSONObject).d(((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eH)).booleanValue()).a(new JSONObject()).a(((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.dc)).intValue()).a(), this.f15418b) {
            public void a(int i, String str, JSONObject jSONObject) {
                i.a(i, this.f15418b);
            }

            public void a(JSONObject jSONObject, int i) {
                b.this.a(jSONObject);
            }
        };
        r0.a(com.applovin.impl.sdk.c.b.bc);
        r0.b(com.applovin.impl.sdk.c.b.bd);
        this.f15418b.V().a((a) r0);
    }

    public void run() {
        try {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.c(this.f15419c, "Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
        } catch (JSONException e2) {
            v vVar2 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Unable to build JSON message with collected data", e2);
            }
        }
    }
}
