package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackUnityAdapter;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.HashMap;
import java.util.Random;

public class FastTrackUnityAdapter extends FastTrackBaseAdapter {
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public BannerView adView;
    /* access modifiers changed from: private */
    public String bannerPlacementId;
    /* access modifiers changed from: private */
    public boolean bannerRequestFailReported;
    /* access modifiers changed from: private */
    public Runnable bannerViewRefreshRunnable = new Runnable() {
        public void run() {
            if (FastTrackUnityAdapter.this.adView != null) {
                Log.d("fastTrackTag", "unity banner attempt to load");
                HashMap hashMap = FastTrackUnityAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId);
                FastTrackUnityAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                FastTrackUnityAdapter.this.adView.load();
                boolean unused = FastTrackUnityAdapter.this.bannerRequestFailReported = false;
                FastTrackUnityAdapter.this.handler.postDelayed(FastTrackUnityAdapter.this.bannerViewRepeatRequestRunnable, 60000);
                return;
            }
            Log.d("fastTrackTag", "unity banner attempt to load failed: bannerView null");
        }
    };
    /* access modifiers changed from: private */
    public Runnable bannerViewRepeatRequestRunnable = new Runnable() {
        public void run() {
            if (FastTrackUnityAdapter.this.adView != null) {
                Log.d("fastTrackTag", "unity banner repeat attempt to load");
                HashMap hashMap = FastTrackUnityAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId);
                if (!FastTrackUnityAdapter.this.bannerRequestFailReported) {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                }
                FastTrackUnityAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                FastTrackUnityAdapter.this.adView.load();
                boolean unused = FastTrackUnityAdapter.this.bannerRequestFailReported = false;
                FastTrackUnityAdapter.this.handler.postDelayed(FastTrackUnityAdapter.this.bannerViewRepeatRequestRunnable, 60000);
            }
        }
    };
    /* access modifiers changed from: private */
    public boolean fullscreenAdsLoaded;
    /* access modifiers changed from: private */
    public Runnable fullscreenPendingRequestCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackUnityAdapter.this.lambda$new$1$FastTrackUnityAdapter();
        }
    };
    /* access modifiers changed from: private */
    public String fullscreenPlacementId;
    /* access modifiers changed from: private */
    public IUnityAdsShowListener showListener;

    public void loadRewardedVideo() {
    }

    public void sendNativeViewRequest() {
    }

    public FastTrackUnityAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.fullscreenPlacementId = this.fastTrackSdkModel.getFullscreenPlacementId();
        this.bannerPlacementId = this.fastTrackSdkModel.getBannerPlacementId();
        String str = this.fullscreenPlacementId;
        if (str != null && !str.isEmpty()) {
            this.interstitialDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomFullscreenActivated()) {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_unity_custom");
                this.interstitialDetails.put("net_name", "ft_unity_custom");
                this.interstitialDetails.put("net_name_FS", "ft_unity_custom");
                Log.d("fastTrackTag", "unity fullscreen: custom");
            } else {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_unity");
                this.interstitialDetails.put("net_name", "ft_unity");
                this.interstitialDetails.put("net_name_FS", "ft_unity");
                Log.d("fastTrackTag", "unity fullscreen: platform");
            }
        }
        String str2 = this.bannerPlacementId;
        if (str2 != null && !str2.isEmpty()) {
            this.bannerDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomBannerActivated()) {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_unity_custom");
                this.bannerDetails.put("net_name", "ft_unity_custom");
                this.bannerDetails.put("net_name_FS", "ft_unity_custom");
                Log.d("fastTrackTag", "unity banner: custom");
            } else {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_unity");
                this.bannerDetails.put("net_name", "ft_unity");
                this.bannerDetails.put("net_name_FS", "ft_unity");
                Log.d("fastTrackTag", "unity banner: platform");
            }
        }
        UnityAds.initialize(this.context, this.fastTrackSdkModel.getAppId(), true, new IUnityAdsInitializationListener() {
            public void onInitializationComplete() {
                Log.d("fastTrackTag", "unity init complete");
                FastTrackUnityAdapter.this.loadFullscreen();
                FastTrackUnityAdapter.this.loadRewardedVideo();
            }

            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                Log.d("fastTrackTag", "unity init failed: " + str);
            }
        });
    }

    public void initBannerView(final ViewGroup viewGroup, String str, Activity activity2) {
        final Integer bannerViewRefreshRate = getBannerViewRefreshRate(str);
        String str2 = this.bannerPlacementId;
        if (str2 != null && !str2.isEmpty() && bannerViewRefreshRate.intValue() != 0) {
            Log.d("fastTrackTag", "unity banner initializing: " + this.bannerPlacementId);
            BannerView bannerView = new BannerView((Activity) viewGroup.getContext(), this.bannerPlacementId, new UnityBannerSize(320, 50));
            this.adView = bannerView;
            bannerView.setListener(new BannerView.IListener() {
                public void onBannerLoaded(BannerView bannerView) {
                    if (viewGroup == null || FastTrackUnityAdapter.this.adView == null) {
                        Log.d("fastTrackTag", "unity banner loaded, but bannerViewContainer is null");
                    } else {
                        HashMap hashMap = FastTrackUnityAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                        viewGroup.setVisibility(0);
                        FastTrackUnityAdapter.this.handler.removeCallbacks(FastTrackUnityAdapter.this.bannerViewRepeatRequestRunnable);
                        FastTrackUnityAdapter.this.handler.removeCallbacks(FastTrackUnityAdapter.this.bannerViewRefreshRunnable);
                        FastTrackUnityAdapter.this.handler.postDelayed(FastTrackUnityAdapter.this.bannerViewRefreshRunnable, (long) bannerViewRefreshRate.intValue());
                    }
                    Log.d("fastTrackTag", "unity banner onAdLoaded");
                }

                public void onBannerClick(BannerView bannerView) {
                    HashMap hashMap = FastTrackUnityAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                    Log.d("fastTrackTag", "unity banner onBannerClick");
                }

                public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
                    if (bannerErrorInfo.errorCode == BannerErrorCode.NO_FILL) {
                        HashMap hashMap = FastTrackUnityAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = FastTrackUnityAdapter.this.bannerDetails;
                        hashMap2.put("details", "banner id: " + FastTrackUnityAdapter.this.bannerPlacementId + "; error_desc: error code " + bannerErrorInfo.errorCode + " " + bannerErrorInfo.errorMessage);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", FastTrackUnityAdapter.this.bannerDetails, FastTrackUnityAdapter.this.context, true);
                    }
                    boolean unused = FastTrackUnityAdapter.this.bannerRequestFailReported = true;
                    Log.d("fastTrackTag", "unity banner onBannerFailedToLoad: " + bannerErrorInfo.errorCode + " " + bannerErrorInfo.errorMessage);
                }

                public void onBannerLeftApplication(BannerView bannerView) {
                    Log.d("fastTrackTag", "unity banner onBannerLeftApplication");
                }
            });
            Log.d("fastTrackTag", "unity banner attempt to attach bannerView to container");
            this.bannerViewContainer = viewGroup;
            this.bannerViewContainer.addView(this.adView);
            this.handler.post(this.bannerViewRefreshRunnable);
        }
    }

    public void loadFullscreen() {
        this.fullscreenAdsLoaded = false;
        String str = this.fullscreenPlacementId;
        if (str != null && !str.isEmpty()) {
            Log.d("fastTrackTag", "unity fullscreen initializing: " + this.fullscreenPlacementId);
            this.showListener = new IUnityAdsShowListener() {
                public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                    Log.d("fastTrackTag", "unity fs onUnityAdsShowFailure");
                }

                public void onUnityAdsShowStart(String str) {
                    HashMap hashMap = FastTrackUnityAdapter.this.interstitialDetails;
                    hashMap.put("details", "fs id: " + FastTrackUnityAdapter.this.fullscreenPlacementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", FastTrackUnityAdapter.this.interstitialDetails, FastTrackUnityAdapter.this.context, true);
                    if (FastTrackUnityAdapter.this.fullscreenListener != null) {
                        FastTrackUnityAdapter.this.fullscreenListener.onShow();
                    }
                    Log.d("fastTrackTag", "unity fs onUnityAdsShowStart");
                }

                public void onUnityAdsShowClick(String str) {
                    HashMap hashMap = FastTrackUnityAdapter.this.interstitialDetails;
                    hashMap.put("details", "fs id: " + FastTrackUnityAdapter.this.fullscreenPlacementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", FastTrackUnityAdapter.this.interstitialDetails, FastTrackUnityAdapter.this.context, true);
                    Log.d("fastTrackTag", "unity fs onUnityAdsShowClick");
                }

                public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    if (FastTrackUnityAdapter.this.progressDialog != null && FastTrackUnityAdapter.this.progressDialog.isShowing()) {
                        try {
                            FastTrackUnityAdapter.this.progressDialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                            Log.d("fastTrackTag", "progressDialog dismissal IAE");
                        }
                    }
                    FastTrackUnityAdapter.this.loadFullscreen();
                    if (FastTrackUnityAdapter.this.fullscreenListener != null) {
                        FastTrackUnityAdapter.this.fullscreenListener.onClose();
                    }
                    Log.d("fastTrackTag", "unity fs onUnityAdsShowComplete");
                    boolean unused2 = FastTrackUnityAdapter.this.fullscreenAdsLoaded = false;
                }
            };
            AnonymousClass6 r0 = new IUnityAdsLoadListener() {
                public void onUnityAdsAdLoaded(String str) {
                    boolean unused = FastTrackUnityAdapter.this.fullscreenAdsLoaded = true;
                    if (FastTrackUnityAdapter.this.pendingFullscreenRequest && FastTrackUnityAdapter.this.isInForeground) {
                        FastTrackUnityAdapter.this.pendingFullscreenRequest = false;
                        Log.d("fastTrackTag", "unity fullscreen loaded, pending request processing");
                        FastTrackUnityAdapter.this.handler.removeCallbacks(FastTrackUnityAdapter.this.fullscreenPendingRequestCancelRunnable);
                        AppsgeyserProgressDialog appsgeyserProgressDialog = FastTrackUnityAdapter.this.progressDialog;
                        appsgeyserProgressDialog.show();
                        FastTrackUnityAdapter.this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                            public final /* synthetic */ AppsgeyserProgressDialog f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                FastTrackUnityAdapter.AnonymousClass6.this.lambda$onUnityAdsAdLoaded$0$FastTrackUnityAdapter$6(this.f$1);
                            }
                        }, 2000);
                    }
                    Log.d("fastTrackTag", "unity fs onUnityAdsAdLoaded");
                }

                public /* synthetic */ void lambda$onUnityAdsAdLoaded$0$FastTrackUnityAdapter$6(AppsgeyserProgressDialog appsgeyserProgressDialog) {
                    try {
                        appsgeyserProgressDialog.dismiss();
                    } catch (IllegalArgumentException unused) {
                        Log.d("fastTrackTag", "progressDialog dismissal IAE");
                    }
                    UnityAds.show(FastTrackUnityAdapter.this.activity, FastTrackUnityAdapter.this.fullscreenPlacementId, new UnityAdsShowOptions(), FastTrackUnityAdapter.this.showListener);
                }

                public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                    if (unityAdsLoadError == UnityAds.UnityAdsLoadError.NO_FILL) {
                        HashMap hashMap = FastTrackUnityAdapter.this.interstitialDetails;
                        hashMap.put("details", "fs id: " + FastTrackUnityAdapter.this.fullscreenPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", FastTrackUnityAdapter.this.interstitialDetails, FastTrackUnityAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = FastTrackUnityAdapter.this.interstitialDetails;
                        hashMap2.put("details", "fs id: " + FastTrackUnityAdapter.this.fullscreenPlacementId + "; error_desc: error message " + str2);
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", FastTrackUnityAdapter.this.interstitialDetails, FastTrackUnityAdapter.this.context, true);
                    }
                    FastTrackUnityAdapter.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            FastTrackUnityAdapter.AnonymousClass6.this.lambda$onUnityAdsFailedToLoad$1$FastTrackUnityAdapter$6();
                        }
                    }, 60000);
                    Log.d("fastTrackTag", "unity fs onUnityAdsFailedToLoad " + unityAdsLoadError.toString() + " ; " + str2);
                }

                public /* synthetic */ void lambda$onUnityAdsFailedToLoad$1$FastTrackUnityAdapter$6() {
                    FastTrackUnityAdapter.this.loadFullscreen();
                }
            };
            Log.d("fastTrackTag", "unity fullscreen attempt to load");
            HashMap hashMap = this.interstitialDetails;
            hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
            this.interstitialDetails.put("uniqid", GuidGenerator.generateNewGuid());
            UnityAds.load(this.fullscreenPlacementId, r0);
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.interstitialDetails, this.context, true);
        }
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        this.activity = (Activity) context;
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            Log.d("fastTrackTag", "unity fullscreen show request");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
            }
            if (new Random().nextInt(100) + 1 <= getFullscreenIntensityPoints(str2).intValue()) {
                String str3 = this.fullscreenPlacementId;
                if (str3 == null || str3.isEmpty()) {
                    Log.d("fastTrackTag", "unity fullscreen disabled");
                    if (this.fullscreenListener != null) {
                        this.fullscreenListener.onFailedToShow();
                        return;
                    }
                    return;
                }
                HashMap hashMap = this.interstitialDetails;
                hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_attempt", this.interstitialDetails, context, true);
                if (this.fullscreenAdsLoaded) {
                    Log.d("fastTrackTag", "unity fullscreen attempt to show");
                    AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
                    appsgeyserProgressDialog.show();
                    this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                        public final /* synthetic */ AppsgeyserProgressDialog f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            FastTrackUnityAdapter.this.lambda$showFullscreen$0$FastTrackUnityAdapter(this.f$1);
                        }
                    }, 2000);
                    return;
                }
                Log.d("fastTrackTag", "unity fullscreen not loaded yet, waiting for load");
                this.pendingFullscreenRequest = true;
                this.handler.postDelayed(this.fullscreenPendingRequestCancelRunnable, (long) getFullscreenPendingDelayTimerValue().intValue());
                return;
            }
            Log.d("fastTrackTag", "unity fullscreen attempt to show canceled due to intensity settings");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onFailedToShow();
                return;
            }
            return;
        }
        Log.d("fastTrackTag", "unity fullscreen show request was cancelled due to frequency timing settings");
    }

    public /* synthetic */ void lambda$showFullscreen$0$FastTrackUnityAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        UnityAds.show(this.activity, this.fullscreenPlacementId, new UnityAdsShowOptions(), this.showListener);
    }

    public /* synthetic */ void lambda$new$1$FastTrackUnityAdapter() {
        this.pendingFullscreenRequest = false;
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onFailedToShow();
        }
        Log.d("fastTrackTag", "unity fullscreen not loaded, cancelling wait");
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        rewardedVideoListener.onVideoDeactivated();
    }

    public void onPause() {
        super.onPause();
        if (this.adView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("fastTrackTag", "unity banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.adView);
                this.bannerViewContainer = null;
            }
            this.adView.destroy();
            this.adView = null;
        }
        this.handler.removeCallbacks(this.bannerViewRefreshRunnable);
        this.handler.removeCallbacks(this.bannerViewRepeatRequestRunnable);
    }
}
