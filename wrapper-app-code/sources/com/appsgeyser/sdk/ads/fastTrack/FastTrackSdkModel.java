package com.appsgeyser.sdk.ads.fastTrack;

import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class FastTrackSdkModel {
    @SerializedName("additional_reporting_params")
    private Map<String, String> additionalReportingParams;
    @SerializedName("app_id")
    private String appId;
    @SerializedName("banner_placement_id")
    private String bannerPlacementId;
    @SerializedName("banner_placement_id_map")
    private Map<String, AdNetworkSdkModel> bannerPlacementIdMap;
    @SerializedName("banner_placements_refresh_timer_map")
    private Map<String, Integer> bannerPlacementsRefreshTimerMap;
    @SerializedName("content_rating")
    private String contentRating;
    @SerializedName("custom_banner_activated")
    private boolean customBannerActivated;
    @SerializedName("custom_fullscreen_activated")
    private boolean customFullscreenActivated;
    @SerializedName("custom_rewarded_activated")
    private boolean customRewardedActivated;
    @SerializedName("banner_refresh_timer")
    private Integer defaultBannerRefreshTimer;
    @SerializedName("fullscreen_intensity")
    private Integer defaultFullscreenIntensity;
    @SerializedName("fullscreen_frequency_timer")
    private Integer fullscreenFrequencyTimer;
    @SerializedName("fullscreen_pending_delay_timer")
    private Integer fullscreenPendingDelayTimer;
    @SerializedName("fullscreen_placement_id")
    private String fullscreenPlacementId;
    @SerializedName("fullscreen_placement_id_map")
    private Map<String, AdNetworkSdkModel> fullscreenPlacementIdMap;
    @SerializedName("fullscreen_placements_frequency_timer_map")
    private Map<String, Integer> fullscreenPlacementsFrequencyTimerMap;
    @SerializedName("fullscreen_placements_intensity_map")
    private Map<String, Integer> fullscreenPlacementsIntensityMap;
    @SerializedName("name")
    private String name;
    @SerializedName("native_ads_placement_id")
    private String nativeAdsPlacementId;
    @SerializedName("rewarded_placements_activation_map")
    private Map<String, Boolean> rewardedPlacementsActivationMap;
    @SerializedName("rewarded_video_placement_id")
    private String rewardedVideoPlacementId;
    @SerializedName("rewarded_video_placement_id_map")
    private Map<String, AdNetworkSdkModel> rewardedVideoPlacementIdMap;

    public String getName() {
        return this.name;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getFullscreenPlacementId() {
        return this.fullscreenPlacementId;
    }

    public Integer getDefaultFullscreenIntensity() {
        return this.defaultFullscreenIntensity;
    }

    public String getBannerPlacementId() {
        return this.bannerPlacementId;
    }

    public Integer getDefaultBannerRefreshTimer() {
        return this.defaultBannerRefreshTimer;
    }

    public String getRewardedVideoPlacementId() {
        return this.rewardedVideoPlacementId;
    }

    public boolean isCustomBannerActivated() {
        return this.customBannerActivated;
    }

    public boolean isCustomFullscreenActivated() {
        return this.customFullscreenActivated;
    }

    public boolean isCustomRewardedActivated() {
        return this.customRewardedActivated;
    }

    public Map<String, String> getAdditionalReportingParams() {
        return this.additionalReportingParams;
    }

    public Map<String, Integer> getFullscreenPlacementsIntensityMap() {
        return this.fullscreenPlacementsIntensityMap;
    }

    public Integer getFullscreenFrequencyTimer() {
        return this.fullscreenFrequencyTimer;
    }

    public Integer getFullscreenPendingDelayTimer() {
        return this.fullscreenPendingDelayTimer;
    }

    public Map<String, Integer> getBannerPlacementsRefreshTimerMap() {
        return this.bannerPlacementsRefreshTimerMap;
    }

    public Map<String, Boolean> getRewardedPlacementsActivationMap() {
        return this.rewardedPlacementsActivationMap;
    }

    public String getNativeAdsPlacementId() {
        return this.nativeAdsPlacementId;
    }

    public String getContentRating() {
        return this.contentRating;
    }

    public Map<String, Integer> getFullscreenPlacementsFrequencyTimerMap() {
        return this.fullscreenPlacementsFrequencyTimerMap;
    }

    public Map<String, AdNetworkSdkModel> getFullscreenPlacementIdMap() {
        return this.fullscreenPlacementIdMap;
    }

    public Map<String, AdNetworkSdkModel> getBannerPlacementIdMap() {
        return this.bannerPlacementIdMap;
    }

    public Map<String, AdNetworkSdkModel> getRewardedVideoPlacementIdMap() {
        return this.rewardedVideoPlacementIdMap;
    }
}
