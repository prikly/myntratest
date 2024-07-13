package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerListener;
import com.appnext.banners.BannerSize;
import com.appnext.banners.BannerView;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.callbacks.OnVideoEnded;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppnextAdapter;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class FastTrackAppnextAdapter extends FastTrackBaseAdapter {
    /* access modifiers changed from: private */
    public boolean bannerClickReportedRecently;
    /* access modifiers changed from: private */
    public String bannerPlacementId;
    /* access modifiers changed from: private */
    public boolean bannerRequestFailReported;
    /* access modifiers changed from: private */
    public BannerView bannerView;
    /* access modifiers changed from: private */
    public Runnable bannerViewRefreshRunnable = new Runnable() {
        public void run() {
            if (FastTrackAppnextAdapter.this.bannerView != null) {
                Log.d("fastTrackTag", "appnext banner attempt to load");
                HashMap hashMap = FastTrackAppnextAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId);
                FastTrackAppnextAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                FastTrackAppnextAdapter.this.bannerView.loadAd(new BannerAdRequest());
                FastTrackAppnextAdapter.this.bannerView.setVisibility(8);
                FastTrackAppnextAdapter.this.progressBar.setVisibility(0);
                boolean unused = FastTrackAppnextAdapter.this.bannerRequestFailReported = false;
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                FastTrackAppnextAdapter.this.handler.postDelayed(FastTrackAppnextAdapter.this.bannerViewRepeatRequestRunnable, 60000);
                return;
            }
            Log.d("fastTrackTag", "appnext banner attempt to load failed: bannerView null");
        }
    };
    /* access modifiers changed from: private */
    public Runnable bannerViewRepeatRequestRunnable = new Runnable() {
        public void run() {
            if (FastTrackAppnextAdapter.this.bannerView != null) {
                Log.d("fastTrackTag", "appnext banner repeat attempt to load");
                HashMap hashMap = FastTrackAppnextAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId);
                if (!FastTrackAppnextAdapter.this.bannerRequestFailReported) {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                }
                FastTrackAppnextAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                FastTrackAppnextAdapter.this.bannerView.loadAd(new BannerAdRequest());
                FastTrackAppnextAdapter.this.progressBar.setVisibility(0);
                boolean unused = FastTrackAppnextAdapter.this.bannerRequestFailReported = false;
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                FastTrackAppnextAdapter.this.handler.postDelayed(FastTrackAppnextAdapter.this.bannerViewRepeatRequestRunnable, 60000);
                return;
            }
            Log.d("fastTrackTag", "appnext banner attempt to load failed: bannerView null");
        }
    };
    private Runnable fullscreenPendingRequestCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackAppnextAdapter.this.lambda$new$7$FastTrackAppnextAdapter();
        }
    };
    private String fullscreenPlacementId;
    private Interstitial interstitialAd;
    /* access modifiers changed from: private */
    public ProgressBar progressBar;
    private RewardedVideo rewardedVideoAd;
    private String rewardedVideoPlacementId;
    private Runnable rewardedVideoShowCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackAppnextAdapter.this.lambda$new$14$FastTrackAppnextAdapter();
        }
    };

    public void sendNativeViewRequest() {
    }

    public FastTrackAppnextAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.fullscreenPlacementId = this.fastTrackSdkModel.getFullscreenPlacementId();
        this.bannerPlacementId = this.fastTrackSdkModel.getBannerPlacementId();
        this.rewardedVideoPlacementId = this.fastTrackSdkModel.getRewardedVideoPlacementId();
        String str = this.fullscreenPlacementId;
        if (str != null && !str.isEmpty()) {
            this.interstitialDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomFullscreenActivated()) {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext_custom");
                this.interstitialDetails.put("net_name", "ft_appnext_custom");
                this.interstitialDetails.put("net_name_FS", "ft_appnext_custom");
                Log.d("fastTrackTag", "appnext fullscreen: custom");
            } else {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext");
                this.interstitialDetails.put("net_name", "ft_appnext");
                this.interstitialDetails.put("net_name_FS", "ft_appnext");
                Log.d("fastTrackTag", "appnext fullscreen: platform");
            }
        }
        String str2 = this.bannerPlacementId;
        if (str2 != null && !str2.isEmpty()) {
            this.bannerDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomBannerActivated()) {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext_custom");
                this.bannerDetails.put("net_name", "ft_appnext_custom");
                this.bannerDetails.put("net_name_FS", "ft_appnext_custom");
                Log.d("fastTrackTag", "appnext banner: custom");
            } else {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext");
                this.bannerDetails.put("net_name", "ft_appnext");
                this.bannerDetails.put("net_name_FS", "ft_appnext");
                Log.d("fastTrackTag", "appnext banner: platform");
            }
        }
        String str3 = this.rewardedVideoPlacementId;
        if (str3 != null && !str3.isEmpty()) {
            this.rewardedDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomRewardedActivated()) {
                this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext_custom");
                this.rewardedDetails.put("net_name", "ft_appnext_custom");
                this.rewardedDetails.put("net_name_FS", "ft_appnext_custom");
                Log.d("fastTrackTag", "appnext rewarded: custom");
            } else {
                this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appnext");
                this.rewardedDetails.put("net_name", "ft_appnext");
                this.rewardedDetails.put("net_name_FS", "ft_appnext");
                Log.d("fastTrackTag", "appnext rewarded: platform");
            }
        }
        Appnext.init(this.context);
        loadFullscreen();
        loadRewardedVideo();
    }

    public void initBannerView(final ViewGroup viewGroup, String str, Activity activity) {
        final Integer bannerViewRefreshRate = getBannerViewRefreshRate(str);
        viewGroup.setVisibility(8);
        String str2 = this.bannerPlacementId;
        if (str2 != null && !str2.isEmpty() && bannerViewRefreshRate.intValue() != 0) {
            Log.d("fastTrackTag", "appnext banner initializing: " + this.bannerPlacementId);
            this.bannerView = new BannerView(this.context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 50.0f, this.context.getResources().getDisplayMetrics()));
            this.bannerView.setLayoutParams(layoutParams);
            this.bannerView.setPlacementId(this.bannerPlacementId);
            this.bannerView.setBannerSize(BannerSize.BANNER);
            ProgressBar progressBar2 = new ProgressBar(this.context);
            this.progressBar = progressBar2;
            progressBar2.setLayoutParams(layoutParams);
            viewGroup.addView(this.progressBar);
            this.progressBar.setVisibility(0);
            this.bannerView.setBannerListener(new BannerListener() {
                public void onError(AppnextError appnextError) {
                    Log.d("fastTrackTag", "appnext banner onError: " + appnextError.getErrorMessage());
                    boolean unused = FastTrackAppnextAdapter.this.bannerRequestFailReported = true;
                    FastTrackAppnextAdapter.this.progressBar.setVisibility(8);
                    if (Objects.equals(appnextError.getErrorMessage(), AppnextError.NO_ADS)) {
                        HashMap hashMap = FastTrackAppnextAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = FastTrackAppnextAdapter.this.bannerDetails;
                        hashMap2.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId + "; error_desc: error code " + appnextError.getErrorMessage());
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                    }
                    super.onError(appnextError);
                }

                public void onAdLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                    if (viewGroup == null || FastTrackAppnextAdapter.this.bannerView == null) {
                        Log.d("fastTrackTag", "appnext banner loaded, but bannerViewContainer is null");
                    } else {
                        viewGroup.setVisibility(0);
                        FastTrackAppnextAdapter.this.bannerView.setVisibility(0);
                        FastTrackAppnextAdapter.this.progressBar.setVisibility(8);
                        HashMap hashMap = FastTrackAppnextAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                        FastTrackAppnextAdapter.this.handler.removeCallbacks(FastTrackAppnextAdapter.this.bannerViewRepeatRequestRunnable);
                        FastTrackAppnextAdapter.this.handler.removeCallbacks(FastTrackAppnextAdapter.this.bannerViewRefreshRunnable);
                        FastTrackAppnextAdapter.this.handler.postDelayed(FastTrackAppnextAdapter.this.bannerViewRefreshRunnable, (long) bannerViewRefreshRate.intValue());
                    }
                    Log.d("fastTrackTag", "appnext banner onAdLoaded");
                    super.onAdLoaded(str, appnextAdCreativeType);
                }

                public void adImpression() {
                    Log.d("fastTrackTag", "appnext banner adImpression");
                    super.adImpression();
                }

                public void onAdClicked() {
                    if (!FastTrackAppnextAdapter.this.bannerClickReportedRecently) {
                        HashMap hashMap = FastTrackAppnextAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackAppnextAdapter.this.bannerPlacementId);
                        boolean unused = FastTrackAppnextAdapter.this.bannerClickReportedRecently = true;
                        FastTrackAppnextAdapter.this.handler.postDelayed(new Runnable() {
                            public final void run() {
                                FastTrackAppnextAdapter.AnonymousClass1.this.lambda$onAdClicked$0$FastTrackAppnextAdapter$1();
                            }
                        }, 1000);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", FastTrackAppnextAdapter.this.bannerDetails, FastTrackAppnextAdapter.this.context, true);
                        Log.d("fastTrackTag", "appnext banner onAdClicked");
                    }
                    super.onAdClicked();
                }

                public /* synthetic */ void lambda$onAdClicked$0$FastTrackAppnextAdapter$1() {
                    boolean unused = FastTrackAppnextAdapter.this.bannerClickReportedRecently = false;
                }
            });
            Log.d("fastTrackTag", "appnext banner attempt to attach bannerView to container");
            this.bannerViewContainer = viewGroup;
            this.bannerViewContainer.addView(this.bannerView);
            this.handler.post(this.bannerViewRefreshRunnable);
        }
    }

    public void loadFullscreen() {
        String str = this.fullscreenPlacementId;
        if (str != null && !str.isEmpty()) {
            this.interstitialAd = new Interstitial(this.context, this.fullscreenPlacementId);
            Log.d("fastTrackTag", "appnext fullscreen initializing: " + this.fullscreenPlacementId);
            this.interstitialAd.setOnAdLoadedCallback(new OnAdLoaded() {
                public final void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$1$FastTrackAppnextAdapter(str, appnextAdCreativeType);
                }
            });
            this.interstitialAd.setOnAdErrorCallback(new OnAdError() {
                public final void adError(String str) {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$2$FastTrackAppnextAdapter(str);
                }
            });
            this.interstitialAd.setOnAdOpenedCallback(new OnAdOpened() {
                public final void adOpened() {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$3$FastTrackAppnextAdapter();
                }
            });
            this.interstitialAd.setOnAdClosedCallback(new OnAdClosed() {
                public final void onAdClosed() {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$4$FastTrackAppnextAdapter();
                }
            });
            this.interstitialAd.setOnAdClickedCallback(new OnAdClicked() {
                public final void adClicked() {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$5$FastTrackAppnextAdapter();
                }
            });
            Log.d("fastTrackTag", "appnext fullscreen attempt to load");
            HashMap hashMap = this.interstitialDetails;
            hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
            this.interstitialDetails.put("uniqid", GuidGenerator.generateNewGuid());
            this.interstitialAd.loadAd();
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.interstitialDetails, this.context, true);
        }
    }

    public /* synthetic */ void lambda$loadFullscreen$1$FastTrackAppnextAdapter(String str, AppnextAdCreativeType appnextAdCreativeType) {
        if (this.pendingFullscreenRequest && this.isInForeground) {
            this.pendingFullscreenRequest = false;
            Log.d("fastTrackTag", "appnext fullscreen loaded, pending request processing");
            this.handler.removeCallbacks(this.fullscreenPendingRequestCancelRunnable);
            AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
            appsgeyserProgressDialog.show();
            this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                public final /* synthetic */ AppsgeyserProgressDialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    FastTrackAppnextAdapter.this.lambda$loadFullscreen$0$FastTrackAppnextAdapter(this.f$1);
                }
            }, 2000);
        }
        Log.d("fastTrackTag", "appnext fullscreen setOnAdLoadedCallback");
    }

    public /* synthetic */ void lambda$loadFullscreen$0$FastTrackAppnextAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        this.interstitialAd.showAd();
    }

    public /* synthetic */ void lambda$loadFullscreen$2$FastTrackAppnextAdapter(String str) {
        if (Objects.equals(str, AppnextError.NO_ADS)) {
            HashMap hashMap = this.interstitialDetails;
            hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", this.interstitialDetails, this.context, true);
        } else {
            HashMap hashMap2 = this.interstitialDetails;
            hashMap2.put("details", "fs id: " + this.fullscreenPlacementId + "; error_desc: error code " + str);
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", this.interstitialDetails, this.context, true);
        }
        this.handler.postDelayed(new Runnable() {
            public final void run() {
                FastTrackAppnextAdapter.this.loadFullscreen();
            }
        }, 30000);
        Log.d("fastTrackTag", "appnext fullscreen OnAdError: " + str);
    }

    public /* synthetic */ void lambda$loadFullscreen$3$FastTrackAppnextAdapter() {
        Log.d("fastTrackTag", "appnext fullscreen OnAdOpened");
        HashMap hashMap = this.interstitialDetails;
        hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", this.interstitialDetails, this.context, true);
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onShow();
        }
    }

    public /* synthetic */ void lambda$loadFullscreen$4$FastTrackAppnextAdapter() {
        this.handler.postDelayed(new Runnable() {
            public final void run() {
                FastTrackAppnextAdapter.this.loadFullscreen();
            }
        }, 5000);
        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            try {
                this.progressDialog.dismiss();
            } catch (IllegalArgumentException unused) {
                Log.d("fastTrackTag", "progressDialog dismissal IAE");
            }
        }
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onClose();
        }
        Log.d("fastTrackTag", "appnext fullscreen OnAdClosed");
    }

    public /* synthetic */ void lambda$loadFullscreen$5$FastTrackAppnextAdapter() {
        Log.d("fastTrackTag", "appnext fullscreen OnAdClicked");
        HashMap hashMap = this.interstitialDetails;
        hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", this.interstitialDetails, this.context, true);
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            Log.d("fastTrackTag", "appnext fullscreen show request");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
            }
            if (new Random().nextInt(100) + 1 > getFullscreenIntensityPoints(str2).intValue()) {
                Log.d("fastTrackTag", "appnext fullscreen attempt to show canceled due to intensity settings");
                if (this.fullscreenListener != null) {
                    this.fullscreenListener.onFailedToShow();
                }
            } else if (this.interstitialAd != null) {
                HashMap hashMap = this.interstitialDetails;
                hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_attempt", this.interstitialDetails, context, true);
                if (this.interstitialAd.isAdLoaded()) {
                    Log.d("fastTrackTag", "appnext fullscreen attempt to show");
                    AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
                    appsgeyserProgressDialog.show();
                    this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                        public final /* synthetic */ AppsgeyserProgressDialog f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            FastTrackAppnextAdapter.this.lambda$showFullscreen$6$FastTrackAppnextAdapter(this.f$1);
                        }
                    }, 2000);
                    return;
                }
                Log.d("fastTrackTag", "appnext fullscreen not loaded yet, waiting for load");
                this.pendingFullscreenRequest = true;
                this.handler.postDelayed(this.fullscreenPendingRequestCancelRunnable, (long) getFullscreenPendingDelayTimerValue().intValue());
            } else {
                Log.d("fastTrackTag", "appnext fullscreen disabled");
                if (this.fullscreenListener != null) {
                    this.fullscreenListener.onFailedToShow();
                }
            }
        } else {
            Log.d("fastTrackTag", "appnext fullscreen show request was cancelled due to frequency timing settings");
        }
    }

    public /* synthetic */ void lambda$showFullscreen$6$FastTrackAppnextAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        this.interstitialAd.showAd();
    }

    public /* synthetic */ void lambda$new$7$FastTrackAppnextAdapter() {
        this.pendingFullscreenRequest = false;
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onFailedToShow();
        }
        Log.d("fastTrackTag", "appnext fullscreen not loaded, cancelling wait");
    }

    public void loadRewardedVideo() {
        String str = this.rewardedVideoPlacementId;
        if (str != null && !str.isEmpty()) {
            RewardedVideo rewardedVideo = new RewardedVideo(this.context, this.rewardedVideoPlacementId);
            this.rewardedVideoAd = rewardedVideo;
            rewardedVideo.setOnAdLoadedCallback(new OnAdLoaded() {
                public final void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$8$FastTrackAppnextAdapter(str, appnextAdCreativeType);
                }
            });
            this.rewardedVideoAd.setOnAdOpenedCallback(new OnAdOpened() {
                public final void adOpened() {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$9$FastTrackAppnextAdapter();
                }
            });
            this.rewardedVideoAd.setOnAdErrorCallback(new OnAdError() {
                public final void adError(String str) {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$10$FastTrackAppnextAdapter(str);
                }
            });
            this.rewardedVideoAd.setOnAdClickedCallback(new OnAdClicked() {
                public final void adClicked() {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$11$FastTrackAppnextAdapter();
                }
            });
            this.rewardedVideoAd.setOnAdClosedCallback(new OnAdClosed() {
                public final void onAdClosed() {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$12$FastTrackAppnextAdapter();
                }
            });
            this.rewardedVideoAd.setOnVideoEndedCallback(new OnVideoEnded() {
                public final void videoEnded() {
                    FastTrackAppnextAdapter.this.lambda$loadRewardedVideo$13$FastTrackAppnextAdapter();
                }
            });
            Log.d("fastTrackTag", "appnext rewarded attempt to load");
            HashMap hashMap = this.rewardedDetails;
            hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
            this.rewardedDetails.put("uniqid", GuidGenerator.generateNewGuid());
            this.rewardedVideoAd.loadAd();
            StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_request", this.rewardedDetails, this.context, true);
        }
    }

    public /* synthetic */ void lambda$loadRewardedVideo$8$FastTrackAppnextAdapter(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.videoDownloadError = false;
        if (this.rewardedVideoListener != null) {
            showRewardedVideo(this.rewardedVideoListener, this.rewardedVideoCurrentPlacement);
        }
        this.handler.removeCallbacks(this.rewardedVideoShowCancelRunnable);
        Log.d("fastTrackTag", "appnext rewarded OnAdLoaded");
    }

    public /* synthetic */ void lambda$loadRewardedVideo$9$FastTrackAppnextAdapter() {
        if (this.progressDialog != null) {
            this.progressDialog.dismiss();
        }
        HashMap hashMap = this.rewardedDetails;
        hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_impression", this.rewardedDetails, this.context, true);
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoOpened();
        }
        Log.d("fastTrackTag", "appnext rewarded OnAdOpened");
    }

    public /* synthetic */ void lambda$loadRewardedVideo$10$FastTrackAppnextAdapter(String str) {
        this.videoDownloadError = true;
        if (this.rewardedVideoListener != null) {
            if (this.videoShowRequested) {
                this.rewardedVideoListener.onVideoError(this.context.getResources().getString(R.string.appsgeysersdk_fasttrack_no_rew_video));
                this.videoShowRequested = false;
            }
            this.rewardedVideoListener = null;
        }
        if (Objects.equals(str, AppnextError.NO_ADS)) {
            HashMap hashMap = this.rewardedDetails;
            hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
            StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_nofill", this.rewardedDetails, this.context, true);
        } else {
            HashMap hashMap2 = this.rewardedDetails;
            hashMap2.put("details", "rewarded id: " + this.rewardedVideoPlacementId + "; error_desc: error code " + str);
            StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_error", this.rewardedDetails, this.context, true);
        }
        this.handler.postDelayed(new Runnable() {
            public final void run() {
                FastTrackAppnextAdapter.this.loadRewardedVideo();
            }
        }, 30000);
        Log.d("fastTrackTag", "appnext rewarded OnAdError: " + str);
    }

    public /* synthetic */ void lambda$loadRewardedVideo$11$FastTrackAppnextAdapter() {
        HashMap hashMap = this.rewardedDetails;
        hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_click", this.rewardedDetails, this.context, true);
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoClicked();
        }
        Log.d("fastTrackTag", "appnext rewarded OnAdClicked");
    }

    public /* synthetic */ void lambda$loadRewardedVideo$12$FastTrackAppnextAdapter() {
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoClosed();
            this.rewardedVideoListener = null;
        }
        loadRewardedVideo();
        Log.d("fastTrackTag", "appnext rewarded OnAdClosed");
    }

    public /* synthetic */ void lambda$loadRewardedVideo$13$FastTrackAppnextAdapter() {
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoFinished();
        }
        HashMap hashMap = this.rewardedDetails;
        hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_completion", this.rewardedDetails, this.context, true);
        Log.d("fastTrackTag", "appnext rewarded OnVideoEnded");
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        this.rewardedVideoListener = rewardedVideoListener;
        this.rewardedVideoCurrentPlacement = str;
        if (!getRewardedVideoActivationStatus(str).booleanValue()) {
            Log.d("fastTrackTag", "Rewarded video placement disabled");
            this.rewardedVideoListener.onVideoDeactivated();
            this.rewardedVideoListener = null;
        } else if (this.rewardedVideoAd.isAdLoaded()) {
            this.videoShowRequested = true;
            this.rewardedVideoAd.showAd();
        } else if (this.videoDownloadError) {
            this.rewardedVideoListener.onVideoError(this.context.getResources().getString(R.string.appsgeysersdk_fasttrack_no_rew_video));
            this.rewardedVideoListener = null;
        } else {
            if (this.progressDialog == null) {
                this.progressDialog = new AppsgeyserProgressDialog(this.context);
            }
            this.progressDialog.show();
            this.handler.postDelayed(this.rewardedVideoShowCancelRunnable, 10000);
        }
    }

    public /* synthetic */ void lambda$new$14$FastTrackAppnextAdapter() {
        this.progressDialog.dismiss();
        this.progressDialog = null;
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoError(this.context.getResources().getString(R.string.appsgeysersdk_fasttrack_no_rew_video));
            this.rewardedVideoListener = null;
        }
    }

    public void onResume(Context context) {
        super.onResume(context);
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("fastTrackTag", "appnext banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
                this.bannerViewContainer.removeView(this.progressBar);
                this.bannerViewContainer = null;
            }
            this.bannerView.setBannerListener((BannerListener) null);
            this.bannerView.destroy();
            this.bannerView = null;
            this.progressBar = null;
        }
        this.handler.removeCallbacks(this.bannerViewRepeatRequestRunnable);
        this.handler.removeCallbacks(this.bannerViewRefreshRunnable);
    }
}
