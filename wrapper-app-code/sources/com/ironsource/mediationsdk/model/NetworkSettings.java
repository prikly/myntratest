package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a  reason: collision with root package name */
    private String f8711a;

    /* renamed from: b  reason: collision with root package name */
    private String f8712b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f8713c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f8714d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f8715e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f8716f;

    /* renamed from: g  reason: collision with root package name */
    private String f8717g;

    /* renamed from: h  reason: collision with root package name */
    private String f8718h;
    private boolean i;
    private String j;
    private int k;
    private int l;
    private int m;
    private String n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f8711a = networkSettings.getProviderName();
        this.j = networkSettings.getProviderName();
        this.f8712b = networkSettings.getProviderTypeForReflection();
        this.f8714d = networkSettings.getRewardedVideoSettings();
        this.f8715e = networkSettings.getInterstitialSettings();
        this.f8716f = networkSettings.getBannerSettings();
        this.f8713c = networkSettings.getApplicationSettings();
        this.k = networkSettings.getRewardedVideoPriority();
        this.l = networkSettings.getInterstitialPriority();
        this.m = networkSettings.getBannerPriority();
        this.n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f8711a = str;
        this.j = str;
        this.f8712b = str;
        this.n = str;
        this.f8714d = new JSONObject();
        this.f8715e = new JSONObject();
        this.f8716f = new JSONObject();
        this.f8713c = new JSONObject();
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f8711a = str;
        this.j = str;
        this.f8712b = str2;
        this.n = str3;
        this.f8714d = jSONObject2;
        this.f8715e = jSONObject3;
        this.f8716f = jSONObject4;
        this.f8713c = jSONObject;
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f8718h;
    }

    public JSONObject getApplicationSettings() {
        return this.f8713c;
    }

    public int getBannerPriority() {
        return this.m;
    }

    public JSONObject getBannerSettings() {
        return this.f8716f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f8713c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f8713c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f8714d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f8715e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f8716f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f8713c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f8715e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.n;
    }

    public String getProviderInstanceName() {
        return this.j;
    }

    public String getProviderName() {
        return this.f8711a;
    }

    public String getProviderTypeForReflection() {
        return this.f8712b;
    }

    public int getRewardedVideoPriority() {
        return this.k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f8714d;
    }

    public String getSubProviderId() {
        return this.f8717g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f8718h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f8713c = jSONObject;
    }

    public void setBannerPriority(int i2) {
        this.m = i2;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f8716f.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f8716f = jSONObject;
    }

    public void setInterstitialPriority(int i2) {
        this.l = i2;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f8715e.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f8715e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.i = z;
    }

    public void setRewardedVideoPriority(int i2) {
        this.k = i2;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f8714d.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f8714d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f8717g = str;
    }
}
