package com.applovin.impl.mediation.b;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.c.b;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.d.g;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14574a;

    /* renamed from: e  reason: collision with root package name */
    private final MaxAdFormat f14575e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f14576f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f14577g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Object> f14578h;
    private final JSONArray i;
    private final Context j;
    private final a.C0141a k;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, JSONArray jSONArray, Context context, n nVar, a.C0141a aVar) {
        super("TaskFetchMediatedAd " + str, nVar);
        this.f14574a = str;
        this.f14575e = maxAdFormat;
        this.f14576f = map;
        this.f14577g = map2;
        this.f14578h = map3;
        this.i = jSONArray;
        this.j = context;
        this.k = aVar;
    }

    private String a() {
        return b.a(this.f15418b);
    }

    /* access modifiers changed from: private */
    public void a(int i2, String str) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str2 = this.f15419c;
            vVar2.e(str2, "Unable to fetch " + this.f14574a + " ad: server returned " + i2);
        }
        if (i2 == -800) {
            this.f15418b.W().a(f.q);
        }
        k.a((MaxAdListener) this.k, this.f14574a, (MaxError) i2 == -1009 ? new MaxErrorImpl(-1009, str) : i2 == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1));
    }

    private void a(g gVar) {
        long b2 = gVar.b(f.f15400d);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.dr)).intValue())) {
            gVar.b(f.f15400d, currentTimeMillis);
            gVar.c(f.f15401e);
            gVar.c(f.f15402f);
        }
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            i.d(jSONObject, this.f15418b);
            i.c(jSONObject, this.f15418b);
            i.e(jSONObject, this.f15418b);
            i.f(jSONObject, this.f15418b);
            b.a(jSONObject, this.f15418b);
            b.b(jSONObject, this.f15418b);
            com.applovin.impl.sdk.f.a(this.f15418b);
            if (this.f14575e != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", (String) null))) {
                v.i(this.f15419c, "Ad format requested does not match ad unit id's format.");
            }
            this.f15418b.V().a((com.applovin.impl.sdk.e.a) b(jSONObject));
        } catch (Throwable th) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private e b(JSONObject jSONObject) {
        return new e(this.f14574a, this.f14575e, this.f14576f, jSONObject, this.j, this.f15418b, this.k);
    }

    private String b() {
        return b.b(this.f15418b);
    }

    private Map<String, String> c() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("AppLovin-Ad-Unit-Id", this.f14574a);
        map.put("AppLovin-Ad-Format", this.f14575e.getLabel());
        return map;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(LogConstants.MSG_AD_TYPE_DISABLED, new JSONArray(this.f15418b.F().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.c.c.a(this.f15418b));
            jSONObject2.put("initialized", this.f15418b.G().c());
            jSONObject2.put("initialized_classnames", new JSONArray(this.f15418b.G().b().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f15418b.F().a()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f15418b.F().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e2) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Failed to populate adapter classNames", e2);
            }
            throw new RuntimeException("Failed to populate classNames: " + e2);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.i;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f14574a);
        jSONObject2.put("ad_format", this.f14575e.getLabel());
        Map<String, Object> map = CollectionUtils.map(this.f14577g);
        com.applovin.impl.mediation.a.a a2 = this.f15418b.J().a(this.f14574a);
        if (a2 != null) {
            map.put("previous_winning_network", a2.S());
            map.put("previous_winning_network_name", a2.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f15418b.H().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && Utils.isDspDemoApp(this.f15418b.P())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f15418b.q().getExtraParameters()));
    }

    private JSONObject h() throws JSONException {
        Map<String, Object> a2 = this.f15418b.Y().a((Map<String, String>) null, false, true);
        a2.putAll(this.f14578h);
        JSONObject jSONObject = new JSONObject(a2);
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    public void run() {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Fetching next ad for ad unit id: " + this.f14574a + " and format: " + this.f14575e);
        }
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.dO)).booleanValue() && Utils.isVPNConnected()) {
            v vVar3 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "User is connected to a VPN");
            }
        }
        g W = this.f15418b.W();
        W.a(f.p);
        if (W.b(f.f15400d) == 0) {
            W.b(f.f15400d, System.currentTimeMillis());
        }
        try {
            JSONObject h2 = h();
            Map map = CollectionUtils.map();
            map.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15418b.C());
            }
            if (this.f15418b.N().a()) {
                map.put("test_mode", "1");
            }
            String c2 = this.f15418b.N().c();
            if (StringUtils.isValidString(c2)) {
                map.put("filter_ad_network", c2);
                if (!this.f15418b.N().a()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f15418b.N().b()) {
                    map.put("force_ad_network", c2);
                }
            }
            a(W);
            AnonymousClass1 r1 = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f15418b).b("POST").b(c()).a(a()).c(b()).a((Map<String, String>) map).a(h2).d(((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.a.X)).booleanValue()).a(new JSONObject()).b(((Long) this.f15418b.a(com.applovin.impl.sdk.c.a.f15340f)).intValue()).a(((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.cZ)).intValue()).c(((Long) this.f15418b.a(com.applovin.impl.sdk.c.a.f15339e)).intValue()).a(), this.f15418b) {
                public void a(int i, String str, JSONObject jSONObject) {
                    c.this.a(i, str);
                }

                public void a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f15510f.a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f15510f.b());
                        c.this.a(jSONObject);
                        return;
                    }
                    c.this.a(i, (String) null);
                }
            };
            r1.a(com.applovin.impl.sdk.c.a.f15337c);
            r1.b(com.applovin.impl.sdk.c.a.f15338d);
            this.f15418b.V().a((com.applovin.impl.sdk.e.a) r1);
        } catch (Throwable th) {
            v vVar4 = this.f15420d;
            if (v.a()) {
                v vVar5 = this.f15420d;
                String str2 = this.f15419c;
                vVar5.b(str2, "Unable to fetch ad " + this.f14574a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
