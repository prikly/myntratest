package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.b.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

public class v extends w {

    /* renamed from: a  reason: collision with root package name */
    private final e f15515a;

    public v(e eVar, n nVar) {
        super("TaskReportAppLovinReward", nVar);
        this.f15515a = eVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        com.applovin.impl.sdk.v vVar = this.f15420d;
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "Failed to report reward for ad: " + this.f15515a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f15515a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f15515a.ae());
        String clCode = this.f15515a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    public c b() {
        return this.f15515a.aG();
    }

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.v vVar = this.f15420d;
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Reported reward successfully for ad: " + this.f15515a);
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        com.applovin.impl.sdk.v vVar = this.f15420d;
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "No reward result was found for ad: " + this.f15515a);
        }
    }
}
