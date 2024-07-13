package com.applovin.mediation.adapters;

import com.applovin.impl.sdk.ad.g;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;

public class AppLovinAdapterRewardedListener implements g, AppLovinAdClickListener, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
    private boolean hasGrantedReward;
    private final MaxRewardedAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad clicked");
        this.listener.onRewardedAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad shown");
        this.listener.onRewardedAdDisplayed();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            MaxReward reward = this.parentAdapter.getReward();
            AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
            appLovinMediationAdapter.log("Rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded ad hidden");
        this.listener.onRewardedAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad loaded");
        this.parentAdapter.loadedRewardedAd = appLovinAd;
        this.listener.onRewardedAdLoaded();
    }

    public void failedToReceiveAd(int i) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad failed to load with error code: " + i);
        this.listener.onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad failed to display with error: " + str);
        this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
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
        this.parentAdapter.log("Rewarded ad video started");
        this.listener.onRewardedAdVideoStarted();
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad video ended at " + d2 + "% and is fully watched: " + z);
        this.hasGrantedReward = z;
        this.listener.onRewardedAdVideoCompleted();
    }
}
