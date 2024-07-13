package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f14691a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14692b;

    public e(JSONObject jSONObject, n nVar) {
        this.f14691a = JsonUtils.getString(jSONObject, OSOutcomeConstants.OUTCOME_ID, "");
        this.f14692b = JsonUtils.getString(jSONObject, InAppPurchaseMetaData.KEY_PRICE, (String) null);
    }

    public String a() {
        return this.f14691a;
    }

    public String b() {
        return this.f14692b;
    }
}
