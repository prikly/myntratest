package com.applovin.mediation.adapters;

import com.applovin.impl.sdk.ad.g;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;

public class AppLovinAdapterRewardedInterstitialListener implements g, AppLovinAdClickListener, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
    private boolean hasGrantedReward;
    private final MaxRewardedInterstitialAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedInterstitialListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedInterstitialAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad clicked");
        this.listener.onRewardedInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad shown");
        this.listener.onRewardedInterstitialAdDisplayed();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            MaxReward reward = this.parentAdapter.getReward();
            AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
            appLovinMediationAdapter.log("Rewarded interstitial rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded interstitial ad hidden");
        this.listener.onRewardedInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad loaded");
        this.parentAdapter.loadedRewardedInterstitialAd = appLovinAd;
        this.listener.onRewardedInterstitialAdLoaded();
    }

    public void failedToReceiveAd(int i) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad failed to load with error code: " + i);
        this.listener.onRewardedInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
        this.listener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }

    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("User is over quota: " + map);
    }

    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Reward rejected: " + map);
    }

    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        this.parentAdapter.log("Reward verified");
    }

    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Reward validation request failed with code: " + i);
    }

    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad video started");
        this.listener.onRewardedInterstitialAdVideoStarted();
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad video ended at " + d2 + "% and is fully watched: " + z);
        this.hasGrantedReward = z;
        this.listener.onRewardedInterstitialAdVideoCompleted();
    }
}
