package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.HashMap;

public class MultiAdsFullscreenAdmobAdapter extends MultiAdsFullscreenBaseAdapter {
    /* access modifiers changed from: private */
    public InterstitialAd interstitialAd;
    /* access modifiers changed from: private */
    public boolean interstitialAdLoaded = false;

    /* access modifiers changed from: protected */
    public void init() {
    }

    public MultiAdsFullscreenAdmobAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadFullscreen() {
        this.interstitialAdLoaded = false;
        if (this.adNetworkSdkModel.getPlacementId() == null || this.adNetworkSdkModel.getPlacementId().isEmpty()) {
            Log.d("multiAdsTag", "Admob fullscreen placement id missing");
            this.listener.onFullscreenError("Admob fullscreen placement id missing");
            return;
        }
        AnonymousClass1 r0 = new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                super.onAdLoaded(MultiAdsFullscreenAdmobAdapter.this.interstitialAd);
                Log.d("multiAdsTag", "Admob fs onAdLoaded");
                InterstitialAd unused = MultiAdsFullscreenAdmobAdapter.this.interstitialAd = interstitialAd;
                boolean unused2 = MultiAdsFullscreenAdmobAdapter.this.interstitialAdLoaded = true;
                MultiAdsFullscreenAdmobAdapter.this.interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        super.onAdFailedToShowFullScreenContent(adError);
                        Log.d("multiAdsTag", "Admob fs onAdFailedToShowFullScreenContent");
                        boolean unused = MultiAdsFullscreenAdmobAdapter.this.interstitialAdLoaded = false;
                        MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenError(adError.getMessage());
                    }

                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name", "ft_ma_admob");
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_admob");
                        HashMap hashMap = MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails;
                        hashMap.put("details", "fs id: " + MultiAdsFullscreenAdmobAdapter.this.adNetworkSdkModel.getPlacementId());
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails, MultiAdsFullscreenAdmobAdapter.this.context, true);
                        Log.d("multiAdsTag", "Admob fs onAdShowedFullScreenContent");
                        MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenOpened();
                    }

                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        if (MultiAdsFullscreenAdmobAdapter.this.progressDialog != null && MultiAdsFullscreenAdmobAdapter.this.progressDialog.isShowing()) {
                            try {
                                MultiAdsFullscreenAdmobAdapter.this.progressDialog.dismiss();
                            } catch (IllegalArgumentException unused) {
                                Log.d("multiAdsTag", "progressDialog dismissal IAE");
                            }
                        }
                        InterstitialAd unused2 = MultiAdsFullscreenAdmobAdapter.this.interstitialAd = null;
                        boolean unused3 = MultiAdsFullscreenAdmobAdapter.this.interstitialAdLoaded = false;
                        Log.d("multiAdsTag", "Admob fs onAdDismissedFullScreenContent");
                        MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenClosed();
                    }

                    public void onAdImpression() {
                        super.onAdImpression();
                        Log.d("multiAdsTag", "Admob fs onAdImpression");
                    }

                    public void onAdClicked() {
                        super.onAdClicked();
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name", "ft_ma_admob");
                        MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_admob");
                        HashMap hashMap = MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails;
                        hashMap.put("details", "fs id: " + MultiAdsFullscreenAdmobAdapter.this.adNetworkSdkModel.getPlacementId());
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails, MultiAdsFullscreenAdmobAdapter.this.context, true);
                        Log.d("multiAdsTag", "Admob fs onAdClicked");
                        MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenClicked();
                    }
                });
                MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenLoaded();
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name", "ft_ma_admob");
                MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_admob");
                if (loadAdError.getCode() == 3) {
                    HashMap hashMap = MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails;
                    hashMap.put("details", "fs id: " + MultiAdsFullscreenAdmobAdapter.this.adNetworkSdkModel.getPlacementId());
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails, MultiAdsFullscreenAdmobAdapter.this.context, true);
                } else {
                    HashMap hashMap2 = MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails;
                    hashMap2.put("details", "fs id: " + MultiAdsFullscreenAdmobAdapter.this.adNetworkSdkModel.getPlacementId() + "; error_desc: error code " + loadAdError.getCode());
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", MultiAdsFullscreenAdmobAdapter.this.fullscreenDetails, MultiAdsFullscreenAdmobAdapter.this.context, true);
                }
                InterstitialAd unused = MultiAdsFullscreenAdmobAdapter.this.interstitialAd = null;
                Log.d("multiAdsTag", "Admob fs onAdFailedToLoad " + loadAdError.getCode());
                MultiAdsFullscreenAdmobAdapter.this.listener.onFullscreenError(loadAdError.getMessage());
            }
        };
        Log.d("multiAdsTag", "Admob fullscreen attempt to load");
        this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
        this.fullscreenDetails.put("net_name", "ft_ma_admob");
        this.fullscreenDetails.put("net_name_FS", "ft_ma_admob");
        HashMap hashMap = this.fullscreenDetails;
        hashMap.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId());
        this.fullscreenDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.fullscreenDetails, this.context, true);
        InterstitialAd.load(this.context, this.adNetworkSdkModel.getPlacementId(), new AdRequest.Builder().build(), r0);
    }

    public boolean isFullscreenLoaded() {
        return this.interstitialAdLoaded;
    }

    public void showFullscreen(Context context) {
        Log.d("multiAdsTag", "Admob fullscreen attempt to show");
        this.progressDialog = new AppsgeyserProgressDialog(context);
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
                MultiAdsFullscreenAdmobAdapter.this.lambda$showFullscreen$0$MultiAdsFullscreenAdmobAdapter(this.f$1, this.f$2);
            }
        }, 2000);
    }

    public /* synthetic */ void lambda$showFullscreen$0$MultiAdsFullscreenAdmobAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog, Context context) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("multiAdsTag", "progressDialog dismissal IAE");
        }
        this.interstitialAd.show((Activity) context);
    }
}
