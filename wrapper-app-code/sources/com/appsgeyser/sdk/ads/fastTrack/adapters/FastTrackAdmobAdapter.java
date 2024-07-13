package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAdmobAdapter;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.appsgeyser.sdk.utils.admobnative.AdmobNativeBannerMedium;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class FastTrackAdmobAdapter extends FastTrackBaseAdapter {
    private AdLoader adLoader;
    /* access modifiers changed from: private */
    public String bannerPlacementId;
    /* access modifiers changed from: private */
    public boolean bannerRequestFailReported;
    /* access modifiers changed from: private */
    public AdView bannerView;
    /* access modifiers changed from: private */
    public Runnable bannerViewRefreshRunnable = new Runnable() {
        public void run() {
            if (FastTrackAdmobAdapter.this.bannerView != null) {
                Log.d("fastTrackTag", "admob banner attempt to load");
                HashMap hashMap = FastTrackAdmobAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId);
                FastTrackAdmobAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                FastTrackAdmobAdapter.this.bannerView.loadAd(new AdRequest.Builder().build());
                boolean unused = FastTrackAdmobAdapter.this.bannerRequestFailReported = false;
                FastTrackAdmobAdapter.this.handler.postDelayed(FastTrackAdmobAdapter.this.bannerViewRepeatRequestRunnable, 60000);
                return;
            }
            Log.d("fastTrackTag", "admob banner attempt to load failed: bannerView null");
        }
    };
    /* access modifiers changed from: private */
    public Runnable bannerViewRepeatRequestRunnable = new Runnable() {
        public void run() {
            if (FastTrackAdmobAdapter.this.bannerView != null) {
                Log.d("fastTrackTag", "admob banner repeat attempt to load");
                HashMap hashMap = FastTrackAdmobAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId);
                if (!FastTrackAdmobAdapter.this.bannerRequestFailReported) {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                }
                FastTrackAdmobAdapter.this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                FastTrackAdmobAdapter.this.bannerView.loadAd(new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, FastTrackAdmobAdapter.this.extras != null ? FastTrackAdmobAdapter.this.extras : new Bundle()).build());
                boolean unused = FastTrackAdmobAdapter.this.bannerRequestFailReported = false;
                FastTrackAdmobAdapter.this.handler.postDelayed(FastTrackAdmobAdapter.this.bannerViewRepeatRequestRunnable, 60000);
            }
        }
    };
    /* access modifiers changed from: private */
    public Bundle extras;
    private boolean fsRequestsBlocked;
    /* access modifiers changed from: private */
    public Runnable fullscreenPendingRequestCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackAdmobAdapter.this.lambda$new$2$FastTrackAdmobAdapter();
        }
    };
    /* access modifiers changed from: private */
    public String fullscreenPlacementId;
    /* access modifiers changed from: private */
    public InterstitialAd interstitialAd;
    private ArrayList<NativeAd> nativeAdCache = new ArrayList<>();
    private String nativeAdsPlacementId;
    /* access modifiers changed from: private */
    public RewardedAd rewardedVideoAd;
    /* access modifiers changed from: private */
    public String rewardedVideoPlacementId;
    /* access modifiers changed from: private */
    public Runnable rewardedVideoShowCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackAdmobAdapter.this.lambda$new$4$FastTrackAdmobAdapter();
        }
    };
    /* access modifiers changed from: private */
    public int unsuccessfulFsRequestsCount;

    public FastTrackAdmobAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.fullscreenPlacementId = this.fastTrackSdkModel.getFullscreenPlacementId();
        this.bannerPlacementId = this.fastTrackSdkModel.getBannerPlacementId();
        this.rewardedVideoPlacementId = this.fastTrackSdkModel.getRewardedVideoPlacementId();
        this.nativeAdsPlacementId = this.fastTrackSdkModel.getNativeAdsPlacementId();
        MobileAds.initialize(this.context.getApplicationContext(), new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                FastTrackAdmobAdapter.this.loadFullscreen();
                FastTrackAdmobAdapter.this.loadRewardedVideo();
                Log.d("fastTrackTag", "Admob SDK onInitializationComplete");
            }
        });
        initNativeAdListener();
        String str = this.fullscreenPlacementId;
        if (str == null || str.isEmpty()) {
            Log.d("fastTrackTag", "admob fullscreen disabled");
        } else {
            this.interstitialDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomFullscreenActivated()) {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob_custom");
                this.interstitialDetails.put("net_name", "ft_admob_custom");
                this.interstitialDetails.put("net_name_FS", "ft_admob_custom");
                Log.d("fastTrackTag", "admob fullscreen: custom");
            } else {
                this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob");
                this.interstitialDetails.put("net_name", "ft_admob");
                this.interstitialDetails.put("net_name_FS", "ft_admob");
                Log.d("fastTrackTag", "admob fullscreen: platform");
            }
        }
        String str2 = this.bannerPlacementId;
        if (str2 == null || str2.isEmpty()) {
            Log.d("fastTrackTag", "admob banner disabled");
        } else {
            this.bannerDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomBannerActivated()) {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob_custom");
                this.bannerDetails.put("net_name", "ft_admob_custom");
                this.bannerDetails.put("net_name_FS", "ft_admob_custom");
                Log.d("fastTrackTag", "admob banner: custom");
            } else {
                this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob");
                this.bannerDetails.put("net_name", "ft_admob");
                this.bannerDetails.put("net_name_FS", "ft_admob");
                Log.d("fastTrackTag", "admob banner: platform");
            }
        }
        String str3 = this.rewardedVideoPlacementId;
        if (str3 == null || str3.isEmpty()) {
            Log.d("fastTrackTag", "admob rewarded disabled");
        } else {
            this.rewardedDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomRewardedActivated()) {
                this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob_custom");
                this.rewardedDetails.put("net_name", "ft_admob_custom");
                this.rewardedDetails.put("net_name_FS", "ft_admob_custom");
                Log.d("fastTrackTag", "admob rewarded: custom");
            } else {
                this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob");
                this.rewardedDetails.put("net_name", "ft_admob");
                this.rewardedDetails.put("net_name_FS", "ft_admob");
                Log.d("fastTrackTag", "admob rewarded: platform");
            }
        }
        String str4 = this.nativeAdsPlacementId;
        if (str4 == null || str4.isEmpty()) {
            Log.d("fastTrackTag", "admob native disabled");
        } else {
            this.nativeAdsDetails.putAll(this.appDetails);
            if (this.fastTrackSdkModel.isCustomRewardedActivated()) {
                this.nativeAdsDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob_custom");
                this.nativeAdsDetails.put("net_name", "ft_admob_custom");
                this.nativeAdsDetails.put("net_name_FS", "ft_admob_custom");
                Log.d("fastTrackTag", "admob native: custom");
            } else {
                this.nativeAdsDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_admob");
                this.nativeAdsDetails.put("net_name", "ft_admob");
                this.nativeAdsDetails.put("net_name_FS", "ft_admob");
                Log.d("fastTrackTag", "admob native: platform");
            }
        }
        String contentRating = this.fastTrackSdkModel.getContentRating();
        this.extras = new Bundle();
        if (contentRating != null && !contentRating.isEmpty()) {
            this.extras.putSerializable("max_ad_content_rating", contentRating);
        }
    }

    public void initBannerView(final ViewGroup viewGroup, String str, Activity activity) {
        final Integer bannerViewRefreshRate = getBannerViewRefreshRate(str);
        String str2 = this.bannerPlacementId;
        if (str2 != null && !str2.isEmpty() && bannerViewRefreshRate.intValue() != 0) {
            Log.d("fastTrackTag", "admob banner initializing: " + this.bannerPlacementId);
            AdView adView = new AdView(this.context);
            this.bannerView = adView;
            adView.setAdSize(AdSize.SMART_BANNER);
            this.bannerView.setAdUnitId(this.bannerPlacementId);
            this.bannerView.setAdListener(new AdListener() {
                public void onAdClosed() {
                    super.onAdClosed();
                    Log.d("fastTrackTag", "admob banner onAdClosed");
                }

                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    super.onAdFailedToLoad(loadAdError);
                    if (loadAdError.getCode() == 3) {
                        HashMap hashMap = FastTrackAdmobAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = FastTrackAdmobAdapter.this.bannerDetails;
                        hashMap2.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId + "; error_desc: error code " + loadAdError.getCode());
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                    }
                    boolean unused = FastTrackAdmobAdapter.this.bannerRequestFailReported = true;
                    Log.d("fastTrackTag", "admob banner onAdFailedToLoad: " + loadAdError.getCode());
                }

                public void onAdClicked() {
                    super.onAdClicked();
                    HashMap hashMap = FastTrackAdmobAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                    Log.d("fastTrackTag", "admob banner onAdClicked");
                }

                public void onAdOpened() {
                    super.onAdOpened();
                    Log.d("fastTrackTag", "admob banner onAdOpened");
                }

                public void onAdLoaded() {
                    super.onAdLoaded();
                    if (viewGroup == null || FastTrackAdmobAdapter.this.bannerView == null) {
                        Log.d("fastTrackTag", "admob banner loaded, but bannerViewContainer is null");
                    } else {
                        HashMap hashMap = FastTrackAdmobAdapter.this.bannerDetails;
                        hashMap.put("details", "banner id: " + FastTrackAdmobAdapter.this.bannerPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", FastTrackAdmobAdapter.this.bannerDetails, FastTrackAdmobAdapter.this.context, true);
                        viewGroup.setVisibility(0);
                        FastTrackAdmobAdapter.this.handler.removeCallbacks(FastTrackAdmobAdapter.this.bannerViewRepeatRequestRunnable);
                        FastTrackAdmobAdapter.this.handler.removeCallbacks(FastTrackAdmobAdapter.this.bannerViewRefreshRunnable);
                        FastTrackAdmobAdapter.this.handler.postDelayed(FastTrackAdmobAdapter.this.bannerViewRefreshRunnable, (long) bannerViewRefreshRate.intValue());
                    }
                    Log.d("fastTrackTag", "admob banner onAdLoaded");
                }

                public void onAdImpression() {
                    super.onAdImpression();
                    Log.d("fastTrackTag", "admob banner onAdImpression");
                }
            });
            Log.d("fastTrackTag", "admob banner attempt to attach bannerView to container");
            this.bannerViewContainer = viewGroup;
            this.bannerViewContainer.addView(this.bannerView);
            this.handler.post(this.bannerViewRefreshRunnable);
        }
    }

    public void loadFullscreen() {
        String str = this.fullscreenPlacementId;
        if (str != null && !str.isEmpty()) {
            if (!this.fsRequestsBlocked) {
                int i = this.unsuccessfulFsRequestsCount + 1;
                this.unsuccessfulFsRequestsCount = i;
                if (i >= 3) {
                    this.fsRequestsBlocked = true;
                    this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            FastTrackAdmobAdapter.this.lambda$loadFullscreen$0$FastTrackAdmobAdapter();
                        }
                    }, 1200000);
                    return;
                }
                AnonymousClass5 r0 = new InterstitialAdLoadCallback() {
                    public void onAdLoaded(InterstitialAd interstitialAd) {
                        super.onAdLoaded(FastTrackAdmobAdapter.this.interstitialAd);
                        int unused = FastTrackAdmobAdapter.this.unsuccessfulFsRequestsCount = 0;
                        InterstitialAd unused2 = FastTrackAdmobAdapter.this.interstitialAd = interstitialAd;
                        FastTrackAdmobAdapter.this.interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);
                                Log.d("fastTrackTag", "admob fs onAdFailedToShowFullScreenContent");
                            }

                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();
                                HashMap hashMap = FastTrackAdmobAdapter.this.interstitialDetails;
                                hashMap.put("details", "fs id: " + FastTrackAdmobAdapter.this.fullscreenPlacementId);
                                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", FastTrackAdmobAdapter.this.interstitialDetails, FastTrackAdmobAdapter.this.context, true);
                                if (FastTrackAdmobAdapter.this.fullscreenListener != null) {
                                    FastTrackAdmobAdapter.this.fullscreenListener.onShow();
                                }
                                Log.d("fastTrackTag", "admob fs onAdShowedFullScreenContent");
                            }

                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                if (FastTrackAdmobAdapter.this.progressDialog != null && FastTrackAdmobAdapter.this.progressDialog.isShowing()) {
                                    try {
                                        FastTrackAdmobAdapter.this.progressDialog.dismiss();
                                    } catch (IllegalArgumentException unused) {
                                        Log.d("fastTrackTag", "progressDialog dismissal IAE");
                                    }
                                }
                                if (FastTrackAdmobAdapter.this.fullscreenListener != null) {
                                    FastTrackAdmobAdapter.this.fullscreenListener.onClose();
                                }
                                InterstitialAd unused2 = FastTrackAdmobAdapter.this.interstitialAd = null;
                                FastTrackAdmobAdapter.this.loadFullscreen();
                                Log.d("fastTrackTag", "admob fs onAdDismissedFullScreenContent");
                            }

                            public void onAdImpression() {
                                super.onAdImpression();
                                Log.d("fastTrackTag", "admob fs onAdImpression");
                            }

                            public void onAdClicked() {
                                super.onAdClicked();
                                HashMap hashMap = FastTrackAdmobAdapter.this.interstitialDetails;
                                hashMap.put("details", "fs id: " + FastTrackAdmobAdapter.this.fullscreenPlacementId);
                                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", FastTrackAdmobAdapter.this.interstitialDetails, FastTrackAdmobAdapter.this.context, true);
                                Log.d("fastTrackTag", "admob fs onAdClicked");
                            }
                        });
                        if (FastTrackAdmobAdapter.this.pendingFullscreenRequest && FastTrackAdmobAdapter.this.isInForeground) {
                            FastTrackAdmobAdapter.this.pendingFullscreenRequest = false;
                            Log.d("fastTrackTag", "admob fullscreen loaded, pending request processing");
                            FastTrackAdmobAdapter.this.handler.removeCallbacks(FastTrackAdmobAdapter.this.fullscreenPendingRequestCancelRunnable);
                            AppsgeyserProgressDialog appsgeyserProgressDialog = FastTrackAdmobAdapter.this.progressDialog;
                            appsgeyserProgressDialog.show();
                            FastTrackAdmobAdapter.this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                                public final /* synthetic */ AppsgeyserProgressDialog f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    FastTrackAdmobAdapter.AnonymousClass5.this.lambda$onAdLoaded$0$FastTrackAdmobAdapter$5(this.f$1);
                                }
                            }, 2000);
                        }
                        Log.d("fastTrackTag", "admob fs onAdLoaded");
                    }

                    public /* synthetic */ void lambda$onAdLoaded$0$FastTrackAdmobAdapter$5(AppsgeyserProgressDialog appsgeyserProgressDialog) {
                        try {
                            appsgeyserProgressDialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                            Log.d("fastTrackTag", "progressDialog dismissal IAE");
                        }
                        FastTrackAdmobAdapter.this.interstitialAd.show((Activity) FastTrackAdmobAdapter.this.context);
                    }

                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);
                        if (loadAdError.getCode() == 3) {
                            HashMap hashMap = FastTrackAdmobAdapter.this.interstitialDetails;
                            hashMap.put("details", "fs id: " + FastTrackAdmobAdapter.this.fullscreenPlacementId);
                            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", FastTrackAdmobAdapter.this.interstitialDetails, FastTrackAdmobAdapter.this.context, true);
                        } else {
                            HashMap hashMap2 = FastTrackAdmobAdapter.this.interstitialDetails;
                            hashMap2.put("details", "fs id: " + FastTrackAdmobAdapter.this.fullscreenPlacementId + "; error_desc: error code " + loadAdError.getCode());
                            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", FastTrackAdmobAdapter.this.interstitialDetails, FastTrackAdmobAdapter.this.context, true);
                        }
                        InterstitialAd unused = FastTrackAdmobAdapter.this.interstitialAd = null;
                        FastTrackAdmobAdapter.this.handler.postDelayed(new Runnable() {
                            public final void run() {
                                FastTrackAdmobAdapter.AnonymousClass5.this.lambda$onAdFailedToLoad$1$FastTrackAdmobAdapter$5();
                            }
                        }, 30000);
                        Log.d("fastTrackTag", "admob fs onAdFailedToLoad " + loadAdError.getCode());
                    }

                    public /* synthetic */ void lambda$onAdFailedToLoad$1$FastTrackAdmobAdapter$5() {
                        FastTrackAdmobAdapter.this.loadFullscreen();
                    }
                };
                Log.d("fastTrackTag", "admob fullscreen attempt to load");
                HashMap hashMap = this.interstitialDetails;
                hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
                this.interstitialDetails.put("uniqid", GuidGenerator.generateNewGuid());
                Context context = this.context;
                String str2 = this.fullscreenPlacementId;
                AdRequest.Builder builder = new AdRequest.Builder();
                Class<AdMobAdapter> cls = AdMobAdapter.class;
                Bundle bundle = this.extras;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                InterstitialAd.load(context, str2, builder.addNetworkExtrasBundle(cls, bundle).build(), r0);
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.interstitialDetails, this.context, true);
                return;
            }
            Log.d("fastTrackTag", "admob fullscreen attempt to load aborted due to repeating load fails");
        }
    }

    public /* synthetic */ void lambda$loadFullscreen$0$FastTrackAdmobAdapter() {
        this.unsuccessfulFsRequestsCount = 0;
        this.fsRequestsBlocked = false;
        loadFullscreen();
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            Log.d("fastTrackTag", "admob fullscreen show request");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
            }
            if (new Random().nextInt(100) + 1 <= getFullscreenIntensityPoints(str2).intValue()) {
                String str3 = this.fullscreenPlacementId;
                if (str3 == null || str3.isEmpty()) {
                    Log.d("fastTrackTag", "admob fullscreen disabled");
                    if (this.fullscreenListener != null) {
                        this.fullscreenListener.onFailedToShow();
                        return;
                    }
                    return;
                }
                HashMap hashMap = this.interstitialDetails;
                hashMap.put("details", "fs id: " + this.fullscreenPlacementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_attempt", this.interstitialDetails, context, true);
                if (this.interstitialAd != null) {
                    Log.d("fastTrackTag", "admob fullscreen attempt to show");
                    AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
                    appsgeyserProgressDialog.show();
                    this.handler.postDelayed(new Runnable(appsgeyserProgressDialog, context) {
                        public final /* synthetic */ AppsgeyserProgressDialog f$1;
                        public final /* synthetic */ Context f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            FastTrackAdmobAdapter.this.lambda$showFullscreen$1$FastTrackAdmobAdapter(this.f$1, this.f$2);
                        }
                    }, 2000);
                    return;
                }
                Log.d("fastTrackTag", "admob fullscreen not loaded yet, waiting for load");
                this.pendingFullscreenRequest = true;
                this.handler.postDelayed(this.fullscreenPendingRequestCancelRunnable, (long) getFullscreenPendingDelayTimerValue().intValue());
                return;
            }
            Log.d("fastTrackTag", "admob fullscreen attempt to show canceled due to intensity settings");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onFailedToShow();
                return;
            }
            return;
        }
        Log.d("fastTrackTag", "admob fullscreen show request was cancelled due to frequency timing settings");
    }

    public /* synthetic */ void lambda$showFullscreen$1$FastTrackAdmobAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog, Context context) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        this.interstitialAd.show((Activity) context);
    }

    public /* synthetic */ void lambda$new$2$FastTrackAdmobAdapter() {
        this.pendingFullscreenRequest = false;
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onFailedToShow();
        }
        Log.d("fastTrackTag", "admob fullscreen not loaded, cancelling wait");
    }

    public void loadRewardedVideo() {
        String str = this.rewardedVideoPlacementId;
        if (str != null && !str.isEmpty()) {
            AnonymousClass6 r0 = new RewardedAdLoadCallback() {
                public void onAdLoaded(RewardedAd rewardedAd) {
                    super.onAdLoaded(rewardedAd);
                    RewardedAd unused = FastTrackAdmobAdapter.this.rewardedVideoAd = rewardedAd;
                    FastTrackAdmobAdapter.this.rewardedVideoAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            super.onAdFailedToShowFullScreenContent(adError);
                        }

                        public void onAdShowedFullScreenContent() {
                            super.onAdShowedFullScreenContent();
                            FastTrackAdmobAdapter.this.progressDialog.dismiss();
                            HashMap hashMap = FastTrackAdmobAdapter.this.rewardedDetails;
                            hashMap.put("details", "rewarded id: " + FastTrackAdmobAdapter.this.rewardedVideoPlacementId);
                            StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_impression", FastTrackAdmobAdapter.this.rewardedDetails, FastTrackAdmobAdapter.this.context, true);
                            FastTrackAdmobAdapter.this.videoShowRequested = false;
                            if (FastTrackAdmobAdapter.this.rewardedVideoListener != null) {
                                FastTrackAdmobAdapter.this.rewardedVideoListener.onVideoOpened();
                            }
                            Log.d("fastTrackTag", "admob rewarded onAdShowedFullScreenContent");
                        }

                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            if (FastTrackAdmobAdapter.this.rewardedVideoListener != null) {
                                FastTrackAdmobAdapter.this.rewardedVideoListener.onVideoClosed();
                                FastTrackAdmobAdapter.this.rewardedVideoListener = null;
                            }
                            RewardedAd unused = FastTrackAdmobAdapter.this.rewardedVideoAd = null;
                            FastTrackAdmobAdapter.this.loadRewardedVideo();
                            Log.d("fastTrackTag", "admob rewarded onRewardedVideoAdClosed");
                        }

                        public void onAdImpression() {
                            super.onAdImpression();
                        }

                        public void onAdClicked() {
                            super.onAdClicked();
                        }
                    });
                    FastTrackAdmobAdapter.this.videoDownloadError = false;
                    if (FastTrackAdmobAdapter.this.rewardedVideoListener != null) {
                        FastTrackAdmobAdapter fastTrackAdmobAdapter = FastTrackAdmobAdapter.this;
                        fastTrackAdmobAdapter.showRewardedVideo(fastTrackAdmobAdapter.rewardedVideoListener, FastTrackAdmobAdapter.this.rewardedVideoCurrentPlacement);
                    }
                    FastTrackAdmobAdapter.this.handler.removeCallbacks(FastTrackAdmobAdapter.this.rewardedVideoShowCancelRunnable);
                    Log.d("fastTrackTag", "admob rewarded onAdLoaded");
                }

                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    super.onAdFailedToLoad(loadAdError);
                    FastTrackAdmobAdapter.this.videoDownloadError = true;
                    if (FastTrackAdmobAdapter.this.rewardedVideoListener != null) {
                        if (FastTrackAdmobAdapter.this.videoShowRequested) {
                            FastTrackAdmobAdapter.this.rewardedVideoListener.onVideoError(FastTrackAdmobAdapter.this.context.getResources().getString(R.string.appsgeysersdk_fasttrack_no_rew_video));
                            FastTrackAdmobAdapter.this.videoShowRequested = false;
                        }
                        FastTrackAdmobAdapter.this.rewardedVideoListener = null;
                    }
                    if (loadAdError.getCode() == 3) {
                        HashMap hashMap = FastTrackAdmobAdapter.this.rewardedDetails;
                        hashMap.put("details", "rewarded id: " + FastTrackAdmobAdapter.this.rewardedVideoPlacementId);
                        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_nofill", FastTrackAdmobAdapter.this.rewardedDetails, FastTrackAdmobAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = FastTrackAdmobAdapter.this.rewardedDetails;
                        hashMap2.put("details", "rewarded id: " + FastTrackAdmobAdapter.this.rewardedVideoPlacementId + "; error_desc: error code " + loadAdError.getCode());
                        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_error", FastTrackAdmobAdapter.this.rewardedDetails, FastTrackAdmobAdapter.this.context, true);
                    }
                    RewardedAd unused = FastTrackAdmobAdapter.this.rewardedVideoAd = null;
                    FastTrackAdmobAdapter.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            FastTrackAdmobAdapter.AnonymousClass6.this.lambda$onAdFailedToLoad$0$FastTrackAdmobAdapter$6();
                        }
                    }, 30000);
                    Log.d("fastTrackTag", "admob rewarded onAdFailedToLoad: " + loadAdError.getCode());
                }

                public /* synthetic */ void lambda$onAdFailedToLoad$0$FastTrackAdmobAdapter$6() {
                    FastTrackAdmobAdapter.this.loadRewardedVideo();
                }
            };
            Log.d("fastTrackTag", "admob rewarded attempt to load");
            HashMap hashMap = this.rewardedDetails;
            hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
            this.rewardedDetails.put("uniqid", GuidGenerator.generateNewGuid());
            Context context = this.context;
            String str2 = this.rewardedVideoPlacementId;
            AdRequest.Builder builder = new AdRequest.Builder();
            Class<AdMobAdapter> cls = AdMobAdapter.class;
            Bundle bundle = this.extras;
            if (bundle == null) {
                bundle = new Bundle();
            }
            RewardedAd.load(context, str2, builder.addNetworkExtrasBundle(cls, bundle).build(), (RewardedAdLoadCallback) r0);
            StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_request", this.rewardedDetails, this.context, true);
        }
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        this.rewardedVideoListener = rewardedVideoListener;
        this.rewardedVideoCurrentPlacement = str;
        String str2 = this.rewardedVideoPlacementId;
        if (str2 == null || str2.isEmpty() || !getRewardedVideoActivationStatus(str).booleanValue()) {
            Log.d("fastTrackTag", "Rewarded video placement disabled");
            this.rewardedVideoListener.onVideoDeactivated();
            this.rewardedVideoListener = null;
        } else if (this.rewardedVideoAd != null) {
            this.videoShowRequested = true;
            this.rewardedVideoAd.show((Activity) this.context, new OnUserEarnedRewardListener(rewardedVideoListener) {
                public final /* synthetic */ FastTrackBaseAdapter.RewardedVideoListener f$1;

                {
                    this.f$1 = r2;
                }

                public final void onUserEarnedReward(RewardItem rewardItem) {
                    FastTrackAdmobAdapter.this.lambda$showRewardedVideo$3$FastTrackAdmobAdapter(this.f$1, rewardItem);
                }
            });
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

    public /* synthetic */ void lambda$showRewardedVideo$3$FastTrackAdmobAdapter(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, RewardItem rewardItem) {
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onVideoFinished();
        }
        HashMap hashMap = this.rewardedDetails;
        hashMap.put("details", "rewarded id: " + this.rewardedVideoPlacementId);
        StatController.getInstance().sendRequestAsyncByKey("ft_rewarded_sdk_completion", this.rewardedDetails, this.context, true);
        Log.d("fastTrackTag", "admob rewarded onRewarded");
    }

    public /* synthetic */ void lambda$new$4$FastTrackAdmobAdapter() {
        if (this.progressDialog != null) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
        if (this.rewardedVideoListener != null) {
            this.rewardedVideoListener.onVideoError(this.context.getResources().getString(R.string.appsgeysersdk_fasttrack_no_rew_video));
            this.rewardedVideoListener = null;
        }
    }

    public void initNativeAdListener() {
        if (this.nativeAdsPlacementId != null) {
            this.adLoader = new AdLoader.Builder(this.context, this.nativeAdsPlacementId).forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    FastTrackAdmobAdapter.this.lambda$initNativeAdListener$5$FastTrackAdmobAdapter(nativeAd);
                }
            }).withAdListener(new AdListener() {
                public void onAdClicked() {
                    Log.d("fastTrackTag", "admob native onClicked");
                    StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_click", FastTrackAdmobAdapter.this.nativeAdsDetails, FastTrackAdmobAdapter.this.context, true);
                    super.onAdClicked();
                }

                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    if (loadAdError.getCode() == 3) {
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAdmobAdapter.this.nativeAdsDetails, FastTrackAdmobAdapter.this.context, true);
                    } else {
                        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", FastTrackAdmobAdapter.this.nativeAdsDetails, FastTrackAdmobAdapter.this.context, true);
                    }
                    Log.d("fastTrackTag", "admob native onAdFailedToLoad: " + loadAdError.getCode());
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            FastTrackAdmobAdapter.AnonymousClass7.this.lambda$onAdFailedToLoad$0$FastTrackAdmobAdapter$7();
                        }
                    }, 30000);
                    super.onAdFailedToLoad(loadAdError);
                }

                public /* synthetic */ void lambda$onAdFailedToLoad$0$FastTrackAdmobAdapter$7() {
                    FastTrackAdmobAdapter.this.loadNativeAds(1);
                }

                public void onAdImpression() {
                    Log.d("fastTrackTag", "admob native onShown");
                    StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_impression", FastTrackAdmobAdapter.this.nativeAdsDetails, FastTrackAdmobAdapter.this.context, true);
                    super.onAdImpression();
                }
            }).build();
        }
        loadNativeAds(10);
    }

    public /* synthetic */ void lambda$initNativeAdListener$5$FastTrackAdmobAdapter(NativeAd nativeAd) {
        Log.d("fastTrackTag", "nativeListener onNativeLoaded");
        onNativeAdLoaded(nativeAd);
    }

    private View createNativeAdView(NativeAd nativeAd) {
        AdmobNativeBannerMedium admobNativeBannerMedium = (AdmobNativeBannerMedium) LayoutInflater.from(this.context).inflate(R.layout.admob_template_view_medium, (ViewGroup) null);
        admobNativeBannerMedium.setNativeAd(nativeAd);
        return admobNativeBannerMedium;
    }

    private void onNativeAdLoaded(NativeAd nativeAd) {
        if (this.nativeRequestQueueSize <= 0 || this.nativeViewReadyListener == null) {
            this.nativeAdCache.add(nativeAd);
            return;
        }
        this.nativeViewReadyListener.onNativeViewReady(createNativeAdView(nativeAd));
        this.nativeRequestQueueSize--;
    }

    public void sendNativeViewRequest() {
        Log.d("fastTrackTag", "admob sendNativeViewRequest");
        if (this.nativeViewReadyListener == null) {
            this.nativeRequestQueueSize++;
            loadNativeAds(10);
        } else if (this.nativeAdCache.size() != 0) {
            this.nativeViewReadyListener.onNativeViewReady(createNativeAdView(this.nativeAdCache.get(0)));
            this.nativeAdCache.remove(0);
        } else {
            this.nativeRequestQueueSize++;
            loadNativeAds(10);
        }
    }

    public void loadNativeAds(int i) {
        AdLoader adLoader2 = this.adLoader;
        if (adLoader2 != null) {
            adLoader2.loadAds(new AdRequest.Builder().build(), i);
            StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_request", this.bannerDetails, this.context, true);
        }
    }

    public void onResume(Context context) {
        super.onResume(context);
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("fastTrackTag", "admob banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
                this.bannerViewContainer = null;
            }
            this.bannerView.destroy();
            this.bannerView = null;
        }
        this.handler.removeCallbacks(this.bannerViewRefreshRunnable);
        this.handler.removeCallbacks(this.bannerViewRepeatRequestRunnable);
    }
}
