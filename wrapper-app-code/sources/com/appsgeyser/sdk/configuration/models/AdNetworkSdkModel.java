package com.appsgeyser.sdk.configuration.models;

import com.google.gson.annotations.SerializedName;

public class AdNetworkSdkModel {
    @SerializedName("app_id")
    private String appId;
    @SerializedName("banner_id")
    private String bannerId;
    @SerializedName("active")
    private boolean isActive;
    @SerializedName("placement_id")
    private String placementId;
    @SerializedName("priority")
    private int priority;
    @SerializedName("uniq_id")
    private String uniqueId;

    public boolean isActive() {
        return this.isActive;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getBannerId() {
        return this.bannerId;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getAppId() {
        return this.appId;
    }

    public int getPriority() {
        return this.priority;
    }
}
