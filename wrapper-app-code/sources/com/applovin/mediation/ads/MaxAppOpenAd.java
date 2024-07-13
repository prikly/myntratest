package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxAppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final MaxFullscreenAdImpl f15990a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context));
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        this.f15990a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, (MaxFullscreenAdImpl.a) null, "MaxAppOpenAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f15990a.logApiCall("destroy()");
        this.f15990a.destroy();
    }

    public String getAdUnitId() {
        return this.f15990a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f15990a.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f15990a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f15990a.logApiCall("loadAd()");
        this.f15990a.loadAd((Activity) null);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f15990a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f15990a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f15990a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f15990a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f15990a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f15990a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd((String) null);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f15990a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxAppOpenAd");
        this.f15990a.showAd(str, str2, (Activity) null);
    }

    public String toString() {
        return "" + this.f15990a;
    }
}
