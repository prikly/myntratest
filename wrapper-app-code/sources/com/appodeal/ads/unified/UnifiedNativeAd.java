package com.appodeal.ads.unified;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.NativeAdView;
import com.appodeal.ads.NativeMediaView;
import java.util.List;

public abstract class UnifiedNativeAd {
    private String ageRestriction;
    private final String callToAction;
    private List<String> clickNotifyUrls;
    private String clickUrl;
    private final String description;
    private List<String> finishNotifyUrls;
    private final String iconUrl;
    private final String imageUrl;
    private List<String> impressionNotifyUrls;
    private final Float rating;
    private final String title;
    private long trackingPackageExpiry;
    private String trackingPackageName;
    private String vastVideoTag;
    private String videoUrl;

    public UnifiedNativeAd(String str, String str2, String str3) {
        this(str, str2, str3, (Float) null);
    }

    public UnifiedNativeAd(String str, String str2, String str3, Float f2) {
        this(str, str2, str3, (String) null, (String) null, f2);
    }

    public UnifiedNativeAd(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, (Float) null);
    }

    public UnifiedNativeAd(String str, String str2, String str3, String str4, String str5, Float f2) {
        this.trackingPackageExpiry = -1;
        this.title = str;
        this.description = str2;
        this.callToAction = str3;
        this.imageUrl = str4;
        this.iconUrl = str5;
        this.rating = f2;
    }

    public boolean containsVideo() {
        return false;
    }

    public int getAdId() {
        return hashCode();
    }

    public String getAgeRestriction() {
        return this.ageRestriction;
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public List<String> getClickNotifyUrls() {
        return this.clickNotifyUrls;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getFinishNotifyUrls() {
        return this.finishNotifyUrls;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public List<String> getImpressionNotifyUrls() {
        return this.impressionNotifyUrls;
    }

    public Float getRating() {
        return this.rating;
    }

    public String getTitle() {
        return this.title;
    }

    public long getTrackingPackageExpiry() {
        return this.trackingPackageExpiry;
    }

    public String getTrackingPackageName() {
        return this.trackingPackageName;
    }

    public String getVastVideoTag() {
        return this.vastVideoTag;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean hasVideo() {
        return false;
    }

    public View obtainIconView(Context context) {
        return null;
    }

    public View obtainProviderView(Context context) {
        return null;
    }

    public void onAdClick(View view) {
    }

    public void onAdFinish() {
    }

    public void onAdImpression(View view) {
    }

    public void onAdVideoFinish() {
    }

    public void onConfigure(NativeAdView nativeAdView) {
    }

    public boolean onConfigureMediaView(NativeMediaView nativeMediaView) {
        return false;
    }

    public void onDestroy() {
    }

    public void onRegisterForInteraction(NativeAdView nativeAdView) {
    }

    public void onUnregisterForInteraction() {
    }

    public void setAgeRestriction(String str) {
        this.ageRestriction = str;
    }

    public void setClickNotifyUrls(List<String> list) {
        this.clickNotifyUrls = list;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public void setFinishNotifyUrls(List<String> list) {
        this.finishNotifyUrls = list;
    }

    public void setImpressionNotifyUrls(List<String> list) {
        this.impressionNotifyUrls = list;
    }

    public void setTrackingPackage(String str, long j) {
        this.trackingPackageName = str;
        this.trackingPackageExpiry = j;
    }

    public void setVastVideoTag(String str) {
        this.vastVideoTag = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }
}
