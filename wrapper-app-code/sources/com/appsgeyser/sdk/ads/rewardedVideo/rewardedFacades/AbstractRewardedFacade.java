package com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades;

import android.content.Context;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.RewardedVideoFacade;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;

public abstract class AbstractRewardedFacade implements RewardedVideoFacade {
    protected ConfigPhp configPhp;
    protected Context context;
    protected RewardedVideoFacade.RewardedVideoListener listener;
    protected int priority;

    /* access modifiers changed from: protected */
    public abstract void init();

    public void onPause() {
    }

    public void onResume() {
    }

    /* access modifiers changed from: protected */
    public abstract void setPriority();

    protected AbstractRewardedFacade(Context context2, ConfigPhp configPhp2) {
        this.context = context2;
        this.configPhp = configPhp2;
        setPriority();
        init();
    }

    public void setListener(RewardedVideoFacade.RewardedVideoListener rewardedVideoListener) {
        this.listener = rewardedVideoListener;
    }

    public int getPriority() {
        return this.priority;
    }
}
