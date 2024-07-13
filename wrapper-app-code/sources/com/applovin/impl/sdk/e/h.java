package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.d.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public abstract class h extends a {

    /* renamed from: a  reason: collision with root package name */
    protected final d f15446a;

    public h(d dVar, String str, n nVar) {
        super(str, nVar);
        this.f15446a = dVar;
    }

    private void a(g gVar) {
        long b2 = gVar.b(f.f15400d);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f15418b.a(b.dr)).intValue())) {
            gVar.b(f.f15400d, currentTimeMillis);
            gVar.c(f.f15401e);
            gVar.c(f.f15402f);
        }
    }

    private Map<String, String> i() {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("AppLovin-Zone-Id", this.f15446a.a());
        if (this.f15446a.c() != null) {
            map.put("AppLovin-Ad-Size", this.f15446a.c().getLabel());
        }
        if (this.f15446a.d() != null) {
            map.put("AppLovin-Ad-Type", this.f15446a.d().getLabel());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    public abstract a a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(4);
        map.put("zone_id", this.f15446a.a());
        if (this.f15446a.c() != null) {
            map.put("size", this.f15446a.c().getLabel());
        }
        if (this.f15446a.d() != null) {
            map.put("require", this.f15446a.d().getLabel());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "Unable to fetch " + this.f15446a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f15418b.W().a(f.j);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        i.d(jSONObject, this.f15418b);
        i.c(jSONObject, this.f15418b);
        i.e(jSONObject, this.f15418b);
        d.a(jSONObject);
        this.f15418b.V().a(a(jSONObject));
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public com.applovin.impl.sdk.ad.b h() {
        return this.f15446a.e() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    public void run() {
        Map<String, String> map;
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Fetching next ad of zone: " + this.f15446a);
        }
        if (((Boolean) this.f15418b.a(b.dO)).booleanValue() && Utils.isVPNConnected()) {
            v vVar2 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "User is connected to a VPN");
            }
        }
        g W = this.f15418b.W();
        W.a(f.f15397a);
        if (W.b(f.f15400d) == 0) {
            W.b(f.f15400d, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f15418b.v().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f15418b.a(b.dl)).booleanValue()) {
                JSONObject jSONObject = new JSONObject(this.f15418b.Y().a(a(), false, true));
                map = CollectionUtils.map();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f15418b.a(b.eA)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15418b.C());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f15418b.Y().a(a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(f())) {
                map.putAll(this.f15418b.v().getAndResetCustomQueryParams());
            }
            a(W);
            c.a<T> b2 = c.a(this.f15418b).a(b()).c(c()).a(map).b(str).b(i()).a(new JSONObject()).a(((Integer) this.f15418b.a(b.cZ)).intValue()).a(((Boolean) this.f15418b.a(b.da)).booleanValue()).b(((Boolean) this.f15418b.a(b.db)).booleanValue()).b(((Integer) this.f15418b.a(b.cY)).intValue());
            if (andResetCustomPostBody != null) {
                b2.a(andResetCustomPostBody);
                b2.d(((Boolean) this.f15418b.a(b.eI)).booleanValue());
            }
            AnonymousClass1 r1 = new u<JSONObject>(b2.a(), this.f15418b) {
                public void a(int i, String str, JSONObject jSONObject) {
                    h.this.a(i);
                }

                public void a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f15510f.a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f15510f.b());
                        h.this.b(jSONObject);
                        return;
                    }
                    h.this.a(i);
                }
            };
            r1.a(b.ba);
            r1.b(b.bb);
            this.f15418b.V().a((a) r1);
        } catch (Throwable th) {
            v vVar3 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Unable to fetch ad " + this.f15446a, th);
            }
            a(0);
        }
    }
}
