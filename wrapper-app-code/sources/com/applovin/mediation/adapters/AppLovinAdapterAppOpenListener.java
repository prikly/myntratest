package com.applovin.mediation.adapters;

import com.applovin.impl.sdk.ad.g;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;

public class AppLovinAdapterAppOpenListener implements g, AppLovinAdClickListener, AppLovinAdLoadListener {
    private final MaxAppOpenAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    AppLovinAdapterAppOpenListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxAppOpenAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad clicked");
        this.listener.onAppOpenAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad shown");
        this.listener.onAppOpenAdDisplayed();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad hidden");
        this.listener.onAppOpenAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad loaded");
        this.parentAdapter.loadedAppOpenAd = appLovinAd;
        this.listener.onAppOpenAdLoaded();
    }

    public void failedToReceiveAd(int i) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("App open ad failed to load with error code: " + i);
        this.listener.onAppOpenAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("App open ad failed to display with error: " + str);
        this.listener.onAppOpenAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str));
    }
}
