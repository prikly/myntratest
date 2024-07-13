package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.b.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

public class aa extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final e f15422a;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinAdRewardListener f15423e;

    public aa(e eVar, AppLovinAdRewardListener appLovinAdRewardListener, n nVar) {
        super("TaskValidateAppLovinReward", nVar);
        this.f15422a = eVar;
        this.f15423e = appLovinAdRewardListener;
    }

    public String a() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        String str;
        super.a(i);
        if (i < 400 || i >= 500) {
            this.f15423e.validationRequestFailed(this.f15422a, i);
            str = "network_timeout";
        } else {
            this.f15423e.userRewardRejected(this.f15422a, Collections.emptyMap());
            str = "rejected";
        }
        this.f15422a.a(c.a(str));
    }

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        this.f15422a.a(cVar);
        String b2 = cVar.b();
        Map<String, String> a2 = cVar.a();
        if (b2.equals("accepted")) {
            this.f15423e.userRewardVerified(this.f15422a, a2);
        } else if (b2.equals("quota_exceeded")) {
            this.f15423e.userOverQuota(this.f15422a, a2);
        } else if (b2.equals("rejected")) {
            this.f15423e.userRewardRejected(this.f15422a, a2);
        } else {
            this.f15423e.validationRequestFailed(this.f15422a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f15422a.getAdZone().a());
        String clCode = this.f15422a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f15422a.aE();
    }
}
