package com.applovin.mediation.adapters;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;

public class AppLovinAdapterNativeListener implements AppLovinNativeAdEventListener, AppLovinNativeAdLoadListener {
    private final MaxNativeAdAdapterListener listener;
    private final MaxAdapterResponseParameters parameters;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeListener(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.parameters = maxAdapterResponseParameters;
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxNativeAdAdapterListener;
    }

    public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad clicked");
        this.listener.onNativeAdClicked();
    }

    public void onNativeAdLoadFailed(int i) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.d("Native ad failed to load with error code: " + i);
        this.listener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
    }

    public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.d("Native ad loaded: " + appLovinNativeAd);
        if (!StringUtils.isValidString(BundleUtils.getString("template", "", this.parameters.getServerParameters())) || !TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinNativeAd;
            appLovinNativeAdImpl.setEventListener(this);
            this.parentAdapter.loadedNativeAd = appLovinNativeAd;
            this.listener.onNativeAdLoaded(new AppLovinAdapterNativeAd(this.parentAdapter, new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setBody(appLovinNativeAd.getBody()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setMainImage(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAdImpl.getMainImageUri())).setMediaView(appLovinNativeAd.getMediaView()).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio()).setOptionsView(appLovinNativeAd.getOptionsView())), (Bundle) null);
            return;
        }
        AppLovinMediationAdapter appLovinMediationAdapter2 = this.parentAdapter;
        appLovinMediationAdapter2.e("Native ad does not have required assets: " + appLovinNativeAd);
        this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
    }
}
