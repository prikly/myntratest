package com.appsgeyser.sdk.inapp.models.configdata;

import com.google.gson.Gson;

public class AccessData implements ConfigInappData {
    private boolean active;
    private boolean allowPurchases;
    private String backgroundColor;
    private String buttonText;
    private String buttonTextColor;
    private String buttonTintColor;
    private String inappKey;
    private String licenseKey;

    public String getButtonText() {
        return this.buttonText;
    }

    public String getButtonTintColor() {
        return this.buttonTintColor;
    }

    public String getButtonTextColor() {
        return this.buttonTextColor;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getInappKey() {
        return this.inappKey;
    }

    public static AccessData parseFromJson(String str) {
        if (str.equals("")) {
            return null;
        }
        return (AccessData) new Gson().fromJson(str, AccessData.class);
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isAllowPurchases() {
        return this.allowPurchases;
    }

    public String toString() {
        return "AuthData{active=" + this.active + ", buttonText='" + this.buttonText + '\'' + ", buttonTintColor='" + this.buttonTintColor + '\'' + ", buttonTextColor='" + this.buttonTextColor + '\'' + ", backgroundColor='" + this.backgroundColor + '\'' + ", licenseKey='" + this.licenseKey + '\'' + ", inappKey='" + this.inappKey + '\'' + '}';
    }
}
