package com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades;

import android.content.Context;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.callbacks.OnVideoEnded;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.server.StatController;

public class AppnextRewardedFacade extends AbstractRewardedFacade {
    private RewardedVideo rewardedVideo;

    public AppnextRewardedFacade(Context context, ConfigPhp configPhp) {
        super(context, configPhp);
    }

    /* access modifiers changed from: protected */
    public void setPriority() {
        this.priority = this.configPhp.getRewardedVideoSdk().get("appnextSdk").getPriority();
    }

    /* access modifiers changed from: protected */
    public void init() {
        Appnext.init(this.context);
    }

    public void loadRewardedVideo() {
        this.rewardedVideo = new RewardedVideo(this.context, this.configPhp.getRewardedVideoSdk().get("appnextSdk").getPlacementId());
        setupCallbacks();
        this.rewardedVideo.loadAd();
    }

    private void setupCallbacks() {
        this.rewardedVideo.setOnAdLoadedCallback(new OnAdLoaded() {
            public final void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                AppnextRewardedFacade.this.lambda$setupCallbacks$0$AppnextRewardedFacade(str, appnextAdCreativeType);
            }
        });
        this.rewardedVideo.setOnAdOpenedCallback(new OnAdOpened() {
            public final void adOpened() {
                AppnextRewardedFacade.this.lambda$setupCallbacks$1$AppnextRewardedFacade();
            }
        });
        this.rewardedVideo.setOnAdClickedCallback(new OnAdClicked() {
            public final void adClicked() {
                AppnextRewardedFacade.this.lambda$setupCallbacks$2$AppnextRewardedFacade();
            }
        });
        this.rewardedVideo.setOnAdClosedCallback(new OnAdClosed() {
            public final void onAdClosed() {
                AppnextRewardedFacade.this.lambda$setupCallbacks$3$AppnextRewardedFacade();
            }
        });
        this.rewardedVideo.setOnAdErrorCallback(new OnAdError() {
            public final void adError(String str) {
                AppnextRewardedFacade.this.lambda$setupCallbacks$4$AppnextRewardedFacade(str);
            }
        });
        this.rewardedVideo.setOnVideoEndedCallback(new OnVideoEnded() {
            public final void videoEnded() {
                AppnextRewardedFacade.this.lambda$setupCallbacks$5$AppnextRewardedFacade();
            }
        });
    }

    public /* synthetic */ void lambda$setupCallbacks$0$AppnextRewardedFacade(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.listener.onVideoLoaded();
    }

    public /* synthetic */ void lambda$setupCallbacks$1$AppnextRewardedFacade() {
        StatController.getInstance().sendRequestAsyncByKey("appnext_rewarded_sdk_impression", StatController.generateQueryParametersForSdk(this.configPhp, this.context, StatController.AdsType.REWARDED, "appnext rewarded video impression", "appnextSdk"), this.context, false);
        this.listener.onVideoOpened();
    }

    public /* synthetic */ void lambda$setupCallbacks$2$AppnextRewardedFacade() {
        StatController.getInstance().sendRequestAsyncByKey("appnext_rewarded_sdk_click", StatController.generateQueryParametersForSdk(this.configPhp, this.context, StatController.AdsType.REWARDED, "appnext rewarded video click", "appnextSdk"), this.context, false);
        this.listener.onVideoClicked();
    }

    public /* synthetic */ void lambda$setupCallbacks$3$AppnextRewardedFacade() {
        this.rewardedVideo = null;
        this.listener.onVideoClosed();
    }

    public /* synthetic */ void lambda$setupCallbacks$4$AppnextRewardedFacade(String str) {
        this.rewardedVideo = null;
        this.listener.onVideoError(str);
    }

    public /* synthetic */ void lambda$setupCallbacks$5$AppnextRewardedFacade() {
        this.listener.onVideoFinished();
    }

    public boolean isVideoLoaded() {
        RewardedVideo rewardedVideo2 = this.rewardedVideo;
        return rewardedVideo2 != null && rewardedVideo2.isAdLoaded();
    }

    public void showRewardedVideo() {
        this.rewardedVideo.showAd();
    }
}
