package com.applovin.impl.mediation.b;

import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.e.w;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public class f extends w {

    /* renamed from: a  reason: collision with root package name */
    private final c f14599a;

    public f(c cVar, n nVar) {
        super("TaskReportMaxReward", nVar);
        this.f14599a = cVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Failed to report reward for mediated ad: " + this.f14599a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f14599a.getAdUnitId());
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f14599a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f14599a.ag());
        String I = this.f14599a.I();
        if (!StringUtils.isValidString(I)) {
            I = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", I);
        String H = this.f14599a.H();
        if (!StringUtils.isValidString(H)) {
            H = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", H);
    }

    /* access modifiers changed from: protected */
    public com.applovin.impl.sdk.b.c b() {
        return this.f14599a.L();
    }

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Reported reward successfully for mediated ad: " + this.f14599a);
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "No reward result was found for mediated ad: " + this.f14599a);
        }
    }
}
