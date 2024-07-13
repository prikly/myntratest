package com.applovin.mediation.adapters;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;

public class AppLovinAdapterAdViewListener implements AppLovinAdViewEventListener, AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdLoadListener {
    private final MaxAdFormat adFormat;
    /* access modifiers changed from: private */
    public final MaxAdViewAdapterListener listener;
    /* access modifiers changed from: private */
    public final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterAdViewListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.adFormat = maxAdFormat;
        this.listener = maxAdViewAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad clicked");
        this.listener.onAdViewAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad collapsed");
        this.listener.onAdViewAdCollapsed();
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad shown");
        this.listener.onAdViewAdDisplayed();
    }

    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " failed to display with error code: " + appLovinAdViewDisplayErrorCode);
        this.listener.onAdViewAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad hidden");
        this.listener.onAdViewAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad left application");
    }

    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad expanded");
        this.listener.onAdViewAdExpanded();
    }

    public void adReceived(final AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad loaded");
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView = new AppLovinAdView(AppLovinAdapterAdViewListener.this.parentAdapter.getWrappingSdk(), appLovinAd.getSize(), AppLovinAdapterAdViewListener.this.parentAdapter.getApplicationContext());
                AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView.setAdDisplayListener(AppLovinAdapterAdViewListener.this);
                AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView.setAdClickListener(AppLovinAdapterAdViewListener.this);
                AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView.setAdViewEventListener(AppLovinAdapterAdViewListener.this);
                AppLovinAdapterAdViewListener.this.listener.onAdViewAdLoaded(AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView);
                AppLovinAdapterAdViewListener.this.parentAdapter.loadedAdView.renderAd(appLovinAd);
            }
        });
    }

    public void failedToReceiveAd(int i) {
        MaxAdapterError maxError = AppLovinMediationAdapter.toMaxError(i);
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad failed to load with error code: " + maxError);
        this.listener.onAdViewAdLoadFailed(maxError);
    }
}
