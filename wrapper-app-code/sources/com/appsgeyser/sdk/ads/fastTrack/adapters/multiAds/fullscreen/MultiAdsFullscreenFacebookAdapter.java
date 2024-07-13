package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;
import java.util.HashMap;

public class MultiAdsFullscreenFacebookAdapter extends MultiAdsFullscreenBaseAdapter {
    private InterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public boolean pendingInitCompletion;
    private Runnable pendingInitCompletionRunnable = new Runnable() {
        public void run() {
            boolean unused = MultiAdsFullscreenFacebookAdapter.this.pendingInitCompletion = false;
            if (!AudienceNetworkAds.isInitialized(MultiAdsFullscreenFacebookAdapter.this.context)) {
                Log.d("multiAdsTag", "facebook fullscreen initializing takes too long");
                MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name", "ft_ma_facebook");
                MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_facebook");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails, MultiAdsFullscreenFacebookAdapter.this.context, true);
                MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenError("facebook fullscreen initializing takes too long");
                return;
            }
            MultiAdsFullscreenFacebookAdapter.this.loadFullscreen();
        }
    };

    /* access modifiers changed from: protected */
    public void init() {
    }

    public MultiAdsFullscreenFacebookAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void initCompleted() {
        if (this.pendingInitCompletion) {
            this.handler.removeCallbacks(this.pendingInitCompletionRunnable);
            this.pendingInitCompletionRunnable.run();
        }
    }

    public void loadFullscreen() {
        if (!AudienceNetworkAds.isInitialized(this.context)) {
            this.pendingInitCompletion = true;
            this.handler.postDelayed(this.pendingInitCompletionRunnable, 5000);
        } else if (this.adNetworkSdkModel.getPlacementId() == null || this.adNetworkSdkModel.getPlacementId().isEmpty()) {
            Log.d("multiAdsTag", "facebook fullscreen placement id missing");
            this.listener.onFullscreenError("facebook fullscreen placement id missing");
        } else {
            this.interstitialAd = new InterstitialAd(this.context, this.adNetworkSdkModel.getPlacementId());
            Log.d("multiAdsTag", "facebook fullscreen initializing: " + this.adNetworkSdkModel.getPlacementId());
            AnonymousClass2 r0 = new InterstitialAdListener() {
                public void onLoggingImpression(Ad ad) {
                }

                public void onInterstitialDismissed(Ad ad) {
                    if (MultiAdsFullscreenFacebookAdapter.this.progressDialog != null && MultiAdsFullscreenFacebookAdapter.this.progressDialog.isShowing()) {
                        try {
                            MultiAdsFullscreenFacebookAdapter.this.progressDialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                            Log.d("multiAdsTag", "progressDialog dismissal IAE");
                        }
                    }
                    Log.d("multiAdsTag", "facebook fullscreen onInterstitialDismissed");
                    MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenClosed();
                }

                public void onError(Ad ad, AdError adError) {
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name", "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_facebook");
                    if (adError.getErrorCode() == 1001) {
                        HashMap hashMap = MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails;
                        hashMap.put("details", "fs id: " + MultiAdsFullscreenFacebookAdapter.this.adNetworkSdkModel.getPlacementId());
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails, MultiAdsFullscreenFacebookAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails;
                        hashMap2.put("details", "fs id: " + MultiAdsFullscreenFacebookAdapter.this.adNetworkSdkModel.getPlacementId() + "; error_desc: error code " + adError.getErrorCode() + " " + adError.getErrorMessage());
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails, MultiAdsFullscreenFacebookAdapter.this.context, true);
                    }
                    Log.d("multiAdsTag", "facebook fs onError " + adError.getErrorCode() + " " + adError.getErrorMessage());
                    MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenError(adError.getErrorMessage());
                }

                public void onAdClicked(Ad ad) {
                    Log.d("multiAdsTag", "facebook fullscreen onAdClicked");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name", "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_facebook");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails, MultiAdsFullscreenFacebookAdapter.this.context, true);
                    MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenClicked();
                }

                public void onInterstitialDisplayed(Ad ad) {
                    Log.d("multiAdsTag", "facebook fullscreen onInterstitialDisplayed");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name", "ft_ma_facebook");
                    MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_facebook");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", MultiAdsFullscreenFacebookAdapter.this.fullscreenDetails, MultiAdsFullscreenFacebookAdapter.this.context, true);
                    MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenOpened();
                }

                public void onAdLoaded(Ad ad) {
                    Log.d("multiAdsTag", "facebook fullscreen onInterstitialLoaded");
                    MultiAdsFullscreenFacebookAdapter.this.listener.onFullscreenLoaded();
                }
            };
            Log.d("multiAdsTag", "facebook fullscreen attempt to load");
            this.fullscreenDetails.put("uniqid", GuidGenerator.generateNewGuid());
            this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
            this.fullscreenDetails.put("net_name", "ft_ma_facebook");
            this.fullscreenDetails.put("net_name_FS", "ft_ma_facebook");
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.fullscreenDetails, this.context, true);
            InterstitialAd interstitialAd2 = this.interstitialAd;
            interstitialAd2.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(r0).build());
        }
    }

    public boolean isFullscreenLoaded() {
        return this.interstitialAd.isAdLoaded();
    }

    public void showFullscreen(Context context) {
        Log.d("multiAdsTag", "facebook fullscreen attempt to show");
        this.progressDialog = new AppsgeyserProgressDialog(context);
        AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
        appsgeyserProgressDialog.show();
        this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
            public final /* synthetic */ AppsgeyserProgressDialog f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MultiAdsFullscreenFacebookAdapter.this.lambda$showFullscreen$0$MultiAdsFullscreenFacebookAdapter(this.f$1);
            }
        }, 2000);
    }

    public /* synthetic */ void lambda$showFullscreen$0$MultiAdsFullscreenFacebookAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("multiAdsTag", "progressDialog dismissal IAE");
        }
        try {
            this.interstitialAd.show();
        } catch (Exception e2) {
            Log.d("multiAdsTag", "facebook activity pass fail: " + Arrays.toString(e2.getStackTrace()));
        }
    }
}
