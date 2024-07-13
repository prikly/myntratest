package com.applovin.impl.mediation.b;

import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.e.ab;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public class g extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final c f14600a;

    public g(c cVar, n nVar) {
        super("TaskValidateMaxReward", nVar);
        this.f14600a = cVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        this.f14600a.a(com.applovin.impl.sdk.b.c.a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f14600a.a(cVar);
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f14600a.getAdUnitId());
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f14600a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f14600a.ag());
        JsonUtils.putString(jSONObject, "ad_format", this.f14600a.getFormat().getLabel());
        String I = this.f14600a.I();
        if (!StringUtils.isValidString(I)) {
            I = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", I);
        String H = this.f14600a.H();
        if (!StringUtils.isValidString(H)) {
            H = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", H);
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f14600a.J();
    }
}
