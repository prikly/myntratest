package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appnext.base.Appnext;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.ads.utils.Log;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerManager;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen.MultiAdsFullscreenInterface;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen.MultiAdsFullscreenManager;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.RewardedVideoFacade;
import com.appsgeyser.sdk.server.StatController;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FastTrackMultiAdsAdapter extends FastTrackBaseAdapter {
    private MultiAdsBannerManager bannerManager;
    /* access modifiers changed from: private */
    public MultiAdsFullscreenManager fullscreenManager;

    public void sendNativeViewRequest() {
    }

    public FastTrackMultiAdsAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        ArrayList arrayList = new ArrayList();
        if (this.fastTrackSdkModel.getFullscreenPlacementIdMap() != null && !this.fastTrackSdkModel.getFullscreenPlacementIdMap().isEmpty()) {
            for (Map.Entry next : this.fastTrackSdkModel.getFullscreenPlacementIdMap().entrySet()) {
                if (!arrayList.contains(next.getKey())) {
                    arrayList.add((String) next.getKey());
                }
            }
        }
        if (this.fastTrackSdkModel.getBannerPlacementIdMap() != null && !this.fastTrackSdkModel.getBannerPlacementIdMap().isEmpty()) {
            for (Map.Entry next2 : this.fastTrackSdkModel.getBannerPlacementIdMap().entrySet()) {
                if (!arrayList.contains(next2.getKey())) {
                    arrayList.add((String) next2.getKey());
                }
            }
        }
        if (this.fastTrackSdkModel.getRewardedVideoPlacementIdMap() != null && !this.fastTrackSdkModel.getRewardedVideoPlacementIdMap().isEmpty()) {
            for (Map.Entry next3 : this.fastTrackSdkModel.getRewardedVideoPlacementIdMap().entrySet()) {
                if (!arrayList.contains(next3.getKey())) {
                    arrayList.add((String) next3.getKey());
                }
            }
        }
        Log.d("multiAdsTag", "Activating SDKs:" + arrayList);
        if (arrayList.contains("admobSdk")) {
            MobileAds.initialize(this.context.getApplicationContext(), new OnInitializationCompleteListener() {
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    Log.d("multiAdsTag", "Admob SDK onInitializationComplete");
                }
            });
        }
        String str = null;
        if (arrayList.contains("appodealSdk")) {
            Appodeal.setAutoCache(135, false);
            Appodeal.setLogLevel(Log.LogLevel.verbose);
            String appId = (this.fastTrackSdkModel.getFullscreenPlacementIdMap() == null || this.fastTrackSdkModel.getFullscreenPlacementIdMap().get("appodealSdk") == null) ? null : this.fastTrackSdkModel.getFullscreenPlacementIdMap().get("appodealSdk").getAppId();
            if (appId == null || appId.isEmpty()) {
                appId = this.fastTrackSdkModel.getBannerPlacementIdMap().get("appodealSdk").getAppId();
            }
            Appodeal.initialize((Activity) this.context, appId, 7, (ApdInitializationCallback) new ApdInitializationCallback() {
                public void onInitializationFinished(List<ApdInitializationError> list) {
                    if (FastTrackMultiAdsAdapter.this.fullscreenManager != null) {
                        FastTrackMultiAdsAdapter.this.fullscreenManager.appodealInitCompleted();
                    }
                }
            });
            Appodeal.setLogLevel(Log.LogLevel.debug);
        }
        if (arrayList.contains("unitySdk")) {
            if (!(this.fastTrackSdkModel.getFullscreenPlacementIdMap() == null || this.fastTrackSdkModel.getFullscreenPlacementIdMap().get("unitySdk") == null)) {
                str = this.fastTrackSdkModel.getFullscreenPlacementIdMap().get("unitySdk").getAppId();
            }
            if (str == null || str.isEmpty()) {
                str = this.fastTrackSdkModel.getBannerPlacementIdMap().get("unitySdk").getAppId();
            }
            UnityAds.initialize(this.context, str, true, new IUnityAdsInitializationListener() {
                public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                }

                public void onInitializationComplete() {
                    if (FastTrackMultiAdsAdapter.this.fullscreenManager != null) {
                        FastTrackMultiAdsAdapter.this.fullscreenManager.unityInitCompleted();
                    }
                }
            });
        }
        if (arrayList.contains("facebookSdk")) {
            AudienceNetworkAds.buildInitSettings(this.context).withInitListener(new AudienceNetworkAds.InitListener() {
                public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    if (FastTrackMultiAdsAdapter.this.fullscreenManager != null) {
                        FastTrackMultiAdsAdapter.this.fullscreenManager.facebookInitCompleted();
                    }
                }
            }).initialize();
        }
        if (arrayList.contains("appnextSdk")) {
            Appnext.init(this.context);
        }
        this.fullscreenManager = new MultiAdsFullscreenManager(this.fastTrackSdkModel.getFullscreenPlacementIdMap(), this.context, this.appDetails);
        this.bannerManager = new MultiAdsBannerManager(this.fastTrackSdkModel.getBannerPlacementIdMap(), this.context, this.appDetails);
    }

    public void initBannerView(ViewGroup viewGroup, String str, Activity activity) {
        if (viewGroup != null && getBannerViewRefreshRate(str).intValue() != 0) {
            this.bannerManager.initBannerView(viewGroup, getBannerViewRefreshRate(str));
        }
    }

    public void showFullscreen(String str, String str2, boolean z, final Context context) {
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            android.util.Log.d("multiAdsTag", "smartAds fullscreen show request");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
            }
            if (new Random().nextInt(100) + 1 <= getFullscreenIntensityPoints(str2).intValue()) {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_multiAds");
                this.interstitialDetails.put("net_name", "ft_multiAds");
                this.interstitialDetails.put("net_name_FS", "ft_multiAds");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_attempt", this.interstitialDetails, context, true);
                this.fullscreenManager.loadFullscreen(new MultiAdsFullscreenInterface.FullscreenListener() {
                    public void onFullscreenClicked() {
                    }

                    public void onFullscreenLoaded() {
                        FastTrackMultiAdsAdapter.this.fullscreenManager.showFullscreen(context);
                    }

                    public void onFullscreenOpened() {
                        if (FastTrackMultiAdsAdapter.this.fullscreenListener != null) {
                            FastTrackMultiAdsAdapter.this.fullscreenListener.onShow();
                        }
                    }

                    public void onFullscreenClosed() {
                        if (FastTrackMultiAdsAdapter.this.fullscreenListener != null) {
                            FastTrackMultiAdsAdapter.this.fullscreenListener.onClose();
                        }
                    }

                    public void onFullscreenError(String str) {
                        if (FastTrackMultiAdsAdapter.this.fullscreenListener != null) {
                            FastTrackMultiAdsAdapter.this.fullscreenListener.onFailedToShow();
                        }
                    }
                }, str);
                return;
            }
            android.util.Log.d("multiAdsTag", "multiAds fullscreen attempt to show canceled due to intensity settings");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onFailedToShow();
                return;
            }
            return;
        }
        android.util.Log.d("multiAdsTag", "smartAds fullscreen show request was cancelled due to frequency timing settings");
    }

    public void showRewardedVideo(final FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        if (getRewardedVideoActivationStatus(str).booleanValue()) {
            AppsgeyserSDK.loadRewardedVideo(new RewardedVideoFacade.RewardedVideoListener() {
                public void onVideoLoaded() {
                    AppsgeyserSDK.showRewardedVideo();
                }

                public void onVideoOpened() {
                    rewardedVideoListener.onVideoOpened();
                }

                public void onVideoClicked() {
                    rewardedVideoListener.onVideoClicked();
                }

                public void onVideoClosed() {
                    rewardedVideoListener.onVideoClosed();
                }

                public void onVideoError(String str) {
                    rewardedVideoListener.onVideoError(str);
                }

                public void onVideoFinished() {
                    rewardedVideoListener.onVideoFinished();
                }
            });
            return;
        }
        android.util.Log.d("fastTrackTag", "Rewarded video placement disabled");
        this.rewardedVideoListener.onVideoDeactivated();
        this.rewardedVideoListener = null;
    }

    public void onResume(Context context) {
        super.onResume(context);
        this.bannerManager.onResume();
    }

    public void onPause() {
        super.onPause();
        this.bannerManager.onPause();
    }
}
