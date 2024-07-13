package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

public class ScarRewardedAdListener {
    private IScarRewardedAdListenerWrapper _adListenerWrapper;
    private IScarLoadListener _loadListener;
    private RewardedAd _rewardedAd;
    private RewardedAdLoadCallback _rewardedAdLoadCallback = new RewardedAdLoadCallback() {
    };
    private RewardedAdCallback rewardedAdCallback = new RewardedAdCallback() {
    };

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this._rewardedAd = rewardedAd;
        this._adListenerWrapper = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.rewardedAdCallback;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this._rewardedAdLoadCallback;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this._loadListener = iScarLoadListener;
    }
}
