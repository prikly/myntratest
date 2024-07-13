package com.appsgeyser.sdk.inapp.models.configdata;

import com.google.gson.Gson;

public class DisableAdsData implements ConfigInappData {
    private boolean active;
    private boolean allowPurchases;
    private String inappKey;

    public boolean isActive() {
        return this.active;
    }

    public String getInappKey() {
        return this.inappKey;
    }

    public boolean isAllowPurchases() {
        return this.allowPurchases;
    }

    public static DisableAdsData parseFromJson(String str) {
        if (str.equals("")) {
            return null;
        }
        return (DisableAdsData) new Gson().fromJson(str, DisableAdsData.class);
    }

    public String toString() {
        return "DisableAdsData{active=" + this.active + ", inappKey='" + this.inappKey + '\'' + '}';
    }
}
