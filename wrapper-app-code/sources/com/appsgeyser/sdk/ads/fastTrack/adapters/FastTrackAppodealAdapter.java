package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.BannerView;
import com.appodeal.ads.InterstitialCallbacks;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.NativeCallbacks;
import com.appodeal.ads.native_ad.views.NativeAdViewContentStream;
import com.appodeal.ads.utils.Log;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppodealAdapter;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.Arrays;
import java.util.Random;

public class FastTrackAppodealAdapter extends FastTrackBaseAdapter implements NativeCallbacks {
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public boolean bannerRequestFailReported;
    /* access modifiers changed from: private */
    public BannerView bannerView;
    /* access modifiers changed from: private */
    public Runnable fullscreenPendingRequestCancelRunnable = new Runnable() {
        public final void run() {
            FastTrackAppodealAdapter.this.lambda$new$1$FastTrackAppodealAdapter();
        }
    };

    public FastTrackAppodealAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.interstitialDetails.putAll(this.appDetails);
        if (this.fastTrackSdkModel.isCustomFullscreenActivated()) {
            this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal_custom");
            this.interstitialDetails.put("net_name", "ft_appodeal_custom");
            this.interstitialDetails.put("net_name_FS", "ft_appodeal_custom");
            Log.d("fastTrackTag", "appodeal fullscreen: custom");
        } else {
            this.interstitialDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal");
            this.interstitialDetails.put("net_name", "ft_appodeal");
            this.interstitialDetails.put("net_name_FS", "ft_appodeal");
            Log.d("fastTrackTag", "appodeal fullscreen: platform");
        }
        this.bannerDetails.putAll(this.appDetails);
        if (this.fastTrackSdkModel.isCustomBannerActivated()) {
            this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal_custom");
            this.bannerDetails.put("net_name", "ft_appodeal_custom");
            this.bannerDetails.put("net_name_FS", "ft_appodeal_custom");
            Log.d("fastTrackTag", "appodeal banner: custom");
        } else {
            this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal");
            this.bannerDetails.put("net_name", "ft_appodeal");
            this.bannerDetails.put("net_name_FS", "ft_appodeal");
            Log.d("fastTrackTag", "appodeal banner: platform");
        }
        this.rewardedDetails.putAll(this.appDetails);
        if (this.fastTrackSdkModel.isCustomRewardedActivated()) {
            this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal_custom");
            this.rewardedDetails.put("net_name", "ft_appodeal_custom");
            this.rewardedDetails.put("net_name_FS", "ft_appodeal_custom");
            Log.d("fastTrackTag", "appodeal rewarded: custom");
        } else {
            this.rewardedDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal");
            this.rewardedDetails.put("net_name", "ft_appodeal");
            this.rewardedDetails.put("net_name_FS", "ft_appodeal");
            Log.d("fastTrackTag", "appodeal rewarded: platform");
        }
        this.nativeAdsDetails.putAll(this.appDetails);
        this.nativeAdsDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_appodeal");
        this.nativeAdsDetails.put("net_name", "ft_appodeal");
        this.nativeAdsDetails.put("net_name_FS", "ft_appodeal");
        Appodeal.setAutoCache(128, false);
        Appodeal.setLogLevel(Log.LogLevel.verbose);
        Appodeal.initialize((Activity) this.context, this.fastTrackSdkModel.getAppId(), 519);
        Appodeal.setLogLevel(Log.LogLevel.debug);
        Appodeal.cache((Activity) this.context, 512);
        Appodeal.setNativeCallbacks(this);
        loadFullscreen();
    }

    public void initBannerView(final ViewGroup viewGroup, String str, Activity activity2) {
        Integer bannerViewRefreshRate = getBannerViewRefreshRate(str);
        this.bannerView = Appodeal.getBannerView(activity2);
        if (bannerViewRefreshRate.intValue() != 0) {
            android.util.Log.d("fastTrackTag", "appodeal banner initializing");
            Appodeal.setBannerCallbacks(new BannerCallbacks() {
                public void onBannerLoaded(int i, boolean z) {
                    if (!(viewGroup == null || FastTrackAppodealAdapter.this.bannerView == null)) {
                        viewGroup.setVisibility(0);
                    }
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerLoaded");
                }

                public void onBannerFailedToLoad() {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", FastTrackAppodealAdapter.this.bannerDetails, FastTrackAppodealAdapter.this.context, true);
                    boolean unused = FastTrackAppodealAdapter.this.bannerRequestFailReported = true;
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerFailedToLoad");
                }

                public void onBannerShown() {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", FastTrackAppodealAdapter.this.bannerDetails, FastTrackAppodealAdapter.this.context, true);
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerShown");
                }

                public void onBannerShowFailed() {
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerShowFailed");
                }

                public void onBannerClicked() {
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", FastTrackAppodealAdapter.this.bannerDetails, FastTrackAppodealAdapter.this.context, true);
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerClicked");
                }

                public void onBannerExpired() {
                    android.util.Log.d("fastTrackTag", "appodeal banner onBannerExpired");
                }
            });
            this.bannerViewContainer = viewGroup;
            this.bannerViewContainer.addView(this.bannerView);
            Appodeal.show(activity2, 64);
            android.util.Log.d("fastTrackTag", "appodeal banner attempt to attach bannerView to container");
        }
    }

    public void loadFullscreen() {
        android.util.Log.d("fastTrackTag", "appodeal fullscreen initializing");
        Appodeal.setInterstitialCallbacks(new InterstitialCallbacks() {
            public void onInterstitialLoaded(boolean z) {
                if (FastTrackAppodealAdapter.this.pendingFullscreenRequest && FastTrackAppodealAdapter.this.isInForeground) {
                    FastTrackAppodealAdapter.this.pendingFullscreenRequest = false;
                    android.util.Log.d("fastTrackTag", "appodeal fullscreen loaded, pending request processing");
                    FastTrackAppodealAdapter.this.handler.removeCallbacks(FastTrackAppodealAdapter.this.fullscreenPendingRequestCancelRunnable);
                    AppsgeyserProgressDialog appsgeyserProgressDialog = FastTrackAppodealAdapter.this.progressDialog;
                    appsgeyserProgressDialog.show();
                    FastTrackAppodealAdapter.this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                        public final /* synthetic */ AppsgeyserProgressDialog f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            FastTrackAppodealAdapter.AnonymousClass2.this.lambda$onInterstitialLoaded$0$FastTrackAppodealAdapter$2(this.f$1);
                        }
                    }, 2000);
                }
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialLoaded");
            }

            public /* synthetic */ void lambda$onInterstitialLoaded$0$FastTrackAppodealAdapter$2(AppsgeyserProgressDialog appsgeyserProgressDialog) {
                try {
                    appsgeyserProgressDialog.dismiss();
                } catch (IllegalArgumentException unused) {
                    android.util.Log.d("fastTrackTag", "progressDialog dismissal IAE");
                }
                try {
                    Appodeal.show(FastTrackAppodealAdapter.this.activity, 3);
                } catch (Exception e2) {
                    android.util.Log.d("fastTrackTag", "appodeal activity pass fail: " + Arrays.toString(e2.getStackTrace()));
                }
            }

            public void onInterstitialFailedToLoad() {
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", FastTrackAppodealAdapter.this.interstitialDetails, FastTrackAppodealAdapter.this.context, true);
                FastTrackAppodealAdapter.this.handler.postDelayed(new Runnable() {
                    public final void run() {
                        FastTrackAppodealAdapter.AnonymousClass2.this.lambda$onInterstitialFailedToLoad$1$FastTrackAppodealAdapter$2();
                    }
                }, 30000);
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialFailedToLoad");
            }

            public /* synthetic */ void lambda$onInterstitialFailedToLoad$1$FastTrackAppodealAdapter$2() {
                FastTrackAppodealAdapter.this.loadFullscreen();
            }

            public void onInterstitialShown() {
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialShown");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", FastTrackAppodealAdapter.this.interstitialDetails, FastTrackAppodealAdapter.this.context, true);
                if (FastTrackAppodealAdapter.this.fullscreenListener != null) {
                    FastTrackAppodealAdapter.this.fullscreenListener.onShow();
                }
            }

            public void onInterstitialShowFailed() {
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialShowFailed");
            }

            public void onInterstitialClicked() {
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialClicked");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", FastTrackAppodealAdapter.this.interstitialDetails, FastTrackAppodealAdapter.this.context, true);
            }

            public void onInterstitialClosed() {
                FastTrackAppodealAdapter.this.loadFullscreen();
                if (FastTrackAppodealAdapter.this.progressDialog != null && FastTrackAppodealAdapter.this.progressDialog.isShowing()) {
                    try {
                        FastTrackAppodealAdapter.this.progressDialog.dismiss();
                    } catch (IllegalArgumentException unused) {
                        android.util.Log.d("fastTrackTag", "progressDialog dismissal IAE");
                    }
                }
                if (FastTrackAppodealAdapter.this.fullscreenListener != null) {
                    FastTrackAppodealAdapter.this.fullscreenListener.onClose();
                }
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialClosed");
            }

            public void onInterstitialExpired() {
                android.util.Log.d("fastTrackTag", "appodeal fullscreen onInterstitialExpired");
            }
        });
        android.util.Log.d("fastTrackTag", "appodeal fullscreen attempt to load");
        this.interstitialDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.interstitialDetails, this.context, true);
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        this.activity = (Activity) context;
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            android.util.Log.d("fastTrackTag", "appodeal fullscreen show request");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
            }
            if (new Random().nextInt(100) + 1 <= getFullscreenIntensityPoints(str2).intValue()) {
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_attempt", this.interstitialDetails, context, true);
                if (Appodeal.isLoaded(3)) {
                    android.util.Log.d("fastTrackTag", "appodeal fullscreen attempt to show");
                    AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
                    appsgeyserProgressDialog.show();
                    this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
                        public final /* synthetic */ AppsgeyserProgressDialog f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            FastTrackAppodealAdapter.this.lambda$showFullscreen$0$FastTrackAppodealAdapter(this.f$1);
                        }
                    }, 2000);
                    return;
                }
                android.util.Log.d("fastTrackTag", "appodeal fullscreen not loaded yet, waiting for load");
                this.pendingFullscreenRequest = true;
                this.handler.postDelayed(this.fullscreenPendingRequestCancelRunnable, (long) getFullscreenPendingDelayTimerValue().intValue());
                return;
            }
            return;
        }
        android.util.Log.d("fastTrackTag", "appodeal fullscreen show request was cancelled due to frequency timing settings");
    }

    public /* synthetic */ void lambda$showFullscreen$0$FastTrackAppodealAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            android.util.Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        Appodeal.show(this.activity, 3);
    }

    public /* synthetic */ void lambda$new$1$FastTrackAppodealAdapter() {
        this.pendingFullscreenRequest = false;
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onFailedToShow();
        }
        android.util.Log.d("fastTrackTag", "appodeal fullscreen not loaded, cancelling wait");
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        rewardedVideoListener.onVideoDeactivated();
    }

    public void sendNativeViewRequest() {
        android.util.Log.d("fastTrackTag", "sendNativeViewRequest, is native ad loaded = " + Appodeal.isLoaded(512));
        if (this.nativeViewReadyListener == null || !Appodeal.isLoaded(512)) {
            this.nativeRequestQueueSize++;
            Activity activity2 = this.activity;
            if (activity2 != null) {
                Appodeal.cache(activity2, 512);
                return;
            }
            return;
        }
        this.nativeViewReadyListener.onNativeViewReady(getNativeAdView(Appodeal.getNativeAds(1).get(0)));
    }

    private View getNativeAdView(NativeAd nativeAd) {
        NativeAdViewContentStream nativeAdViewContentStream = new NativeAdViewContentStream(this.context);
        nativeAdViewContentStream.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        nativeAdViewContentStream.setNativeAd(nativeAd);
        return nativeAdViewContentStream;
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                android.util.Log.d("fastTrackTag", "appodeal banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
                this.bannerViewContainer = null;
            }
            Appodeal.destroy(4);
            this.bannerView = null;
        }
    }

    public void onNativeLoaded() {
        android.util.Log.d("fastTrackTag", "appodeal native onLoaded, nativeRequestQueueSize = " + this.nativeRequestQueueSize);
        if (this.nativeRequestQueueSize > 0 && this.nativeViewReadyListener != null) {
            this.nativeViewReadyListener.onNativeViewReady(getNativeAdView(Appodeal.getNativeAds(1).get(0)));
            this.nativeRequestQueueSize--;
        }
    }

    public void onNativeFailedToLoad() {
        if (this.activity != null) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    FastTrackAppodealAdapter.this.lambda$onNativeFailedToLoad$2$FastTrackAppodealAdapter();
                }
            }, 30000);
            android.util.Log.d("fastTrackTag", "appodeal native onFailedToLoad");
            StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_nofill", this.nativeAdsDetails, this.context, true);
        }
    }

    public /* synthetic */ void lambda$onNativeFailedToLoad$2$FastTrackAppodealAdapter() {
        Appodeal.cache(this.activity, 512);
    }

    public void onNativeShown(NativeAd nativeAd) {
        android.util.Log.d("fastTrackTag", "appodeal native onShown");
        StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_impression", this.nativeAdsDetails, this.context, true);
    }

    public void onNativeShowFailed(NativeAd nativeAd) {
        android.util.Log.d("fastTrackTag", "appodeal native onShowFailed");
    }

    public void onNativeClicked(NativeAd nativeAd) {
        android.util.Log.d("fastTrackTag", "appodeal native onClicked");
        StatController.getInstance().sendRequestAsyncByKey("ft_native_sdk_click", this.nativeAdsDetails, this.context, true);
    }

    public void onNativeExpired() {
        android.util.Log.d("fastTrackTag", "appodeal native onExpired");
    }
}
