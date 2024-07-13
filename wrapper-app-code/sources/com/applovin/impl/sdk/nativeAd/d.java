package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f15625a;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f15626e;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, n nVar) {
        super("TaskProcessNativeAdResponse", nVar);
        this.f15625a = jSONObject;
        this.f15626e = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f15625a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Processing ad...");
            }
            this.f15418b.V().a((a) new e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f15625a, this.f15626e, this.f15418b));
            return;
        }
        v vVar2 = this.f15420d;
        if (v.a()) {
            this.f15420d.d(this.f15419c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f15625a, this.f15418b);
        this.f15626e.onNativeAdLoadFailed(204);
    }
}
