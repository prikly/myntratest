package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.AdView;
import com.appsgeyser.sdk.ads.FullScreenBanner;
import com.appsgeyser.sdk.ads.IFullScreenBannerListener;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.RewardedVideoFacade;
import java.util.Random;

public class FastTrackHtmlAdapter extends FastTrackBaseAdapter {
    private AdView adView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    public void sendNativeViewRequest() {
    }

    public FastTrackHtmlAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    public void initBannerView(ViewGroup viewGroup, String str, Activity activity) {
        if (viewGroup != null && getBannerViewRefreshRate(str).intValue() != 0) {
            this.adView = new AdView(this.context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) Math.ceil((double) (this.context.getResources().getDisplayMetrics().density * 50.0f)));
            layoutParams.addRule(13, -1);
            this.adView.setLayoutParams(layoutParams);
            this.bannerViewContainer = viewGroup;
            this.bannerViewContainer.addView(this.adView);
            AppsgeyserSDK.setAdView(this.adView);
            this.bannerViewContainer.setVisibility(0);
            this.adView.onResume();
        }
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        if (!z || System.currentTimeMillis() - this.preferencesCoder.getPrefLong("appsgeyserSdk_lastRequestTiming", 0) > ((long) getFullscreenFrequencyTimerValue(str2).intValue())) {
            this.preferencesCoder.savePrefLong("appsgeyserSdk_lastRequestTiming", System.currentTimeMillis());
            Log.d("fastTrackTag", "html fullscreen show request");
            if (new Random().nextInt(100) + 1 <= getFullscreenIntensityPoints(str2).intValue()) {
                InternalEntryPoint.getInstance().getFullScreenBanner(context).load(str);
                return;
            }
            Log.d("fastTrackTag", "html fullscreen attempt to show canceled due to intensity settings");
            if (this.fullscreenListener != null) {
                this.fullscreenListener.onRequest();
                this.fullscreenListener.onFailedToShow();
                return;
            }
            return;
        }
        Log.d("fastTrackTag", "html fullscreen show request was cancelled due to frequency timing settings");
    }

    public void setFullscreenListener(final FastTrackBaseAdapter.FullscreenListener fullscreenListener) {
        AppsgeyserSDK.getFullScreenBanner(this.context).setListener(new IFullScreenBannerListener() {
            public void onLoadStarted() {
                FastTrackBaseAdapter.FullscreenListener fullscreenListener = fullscreenListener;
                if (fullscreenListener != null) {
                    fullscreenListener.onRequest();
                }
            }

            public void onLoadFinished(FullScreenBanner fullScreenBanner) {
                FastTrackBaseAdapter.FullscreenListener fullscreenListener = fullscreenListener;
                if (fullscreenListener != null) {
                    fullscreenListener.onShow();
                }
            }

            public void onAdFailedToLoad(Context context, String str) {
                FastTrackBaseAdapter.FullscreenListener fullscreenListener = fullscreenListener;
                if (fullscreenListener != null) {
                    fullscreenListener.onFailedToShow();
                }
            }

            public void onAdHided(Context context, String str) {
                FastTrackBaseAdapter.FullscreenListener fullscreenListener = fullscreenListener;
                if (fullscreenListener != null) {
                    fullscreenListener.onClose();
                }
            }
        });
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
        Log.d("fastTrackTag", "Rewarded video placement disabled");
        this.rewardedVideoListener.onVideoDeactivated();
        this.rewardedVideoListener = null;
    }

    public void onResume(Context context) {
        super.onResume(context);
    }

    public void onPause() {
        super.onPause();
        if (this.bannerViewContainer != null) {
            this.bannerViewContainer.removeView(this.adView);
            this.bannerViewContainer.setVisibility(8);
            this.bannerViewContainer = null;
            AppsgeyserSDK.setAdView((AdView) null);
            this.adView.onPause();
        }
    }
}
