package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f14373a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f14373a = jSONObject;
    }

    public String getAdapterClassName() {
        return JsonUtils.getString(this.f14373a, "class", "");
    }

    public String getAdapterVersion() {
        return JsonUtils.getString(this.f14373a, MediationMetaData.KEY_VERSION, "");
    }

    public String getName() {
        return JsonUtils.getString(this.f14373a, "name", "");
    }

    public String getSdkVersion() {
        return JsonUtils.getString(this.f14373a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
