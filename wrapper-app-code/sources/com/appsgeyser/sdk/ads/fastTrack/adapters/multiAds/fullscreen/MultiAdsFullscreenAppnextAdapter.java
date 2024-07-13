package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.HashMap;
import java.util.Objects;

public class MultiAdsFullscreenAppnextAdapter extends MultiAdsFullscreenBaseAdapter {
    private Interstitial interstitialAd;
    private final Runnable onFullscreenClosedRunnable = new Runnable() {
        public final void run() {
            MultiAdsFullscreenAppnextAdapter.this.lambda$new$5$MultiAdsFullscreenAppnextAdapter();
        }
    };

    /* access modifiers changed from: protected */
    public void init() {
    }

    public MultiAdsFullscreenAppnextAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadFullscreen() {
        if (this.adNetworkSdkModel.getPlacementId() == null || this.adNetworkSdkModel.getPlacementId().isEmpty()) {
            Log.d("multiAdsTag", "Appnext fullscreen placement id missing");
            this.listener.onFullscreenError("Appnext fullscreen placement id missing");
            return;
        }
        this.interstitialAd = new Interstitial(this.context, this.adNetworkSdkModel.getPlacementId());
        Log.d("multiAdsTag", "Appnext fullscreen initializing: " + this.adNetworkSdkModel.getPlacementId());
        this.interstitialAd.setOnAdLoadedCallback(new OnAdLoaded() {
            public final void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                MultiAdsFullscreenAppnextAdapter.this.lambda$loadFullscreen$0$MultiAdsFullscreenAppnextAdapter(str, appnextAdCreativeType);
            }
        });
        this.interstitialAd.setOnAdErrorCallback(new OnAdError() {
            public final void adError(String str) {
                MultiAdsFullscreenAppnextAdapter.this.lambda$loadFullscreen$1$MultiAdsFullscreenAppnextAdapter(str);
            }
        });
        this.interstitialAd.setOnAdOpenedCallback(new OnAdOpened() {
            public final void adOpened() {
                MultiAdsFullscreenAppnextAdapter.this.lambda$loadFullscreen$2$MultiAdsFullscreenAppnextAdapter();
            }
        });
        this.interstitialAd.setOnAdClosedCallback(new OnAdClosed() {
            public final void onAdClosed() {
                MultiAdsFullscreenAppnextAdapter.this.lambda$loadFullscreen$3$MultiAdsFullscreenAppnextAdapter();
            }
        });
        this.interstitialAd.setOnAdClickedCallback(new OnAdClicked() {
            public final void adClicked() {
                MultiAdsFullscreenAppnextAdapter.this.lambda$loadFullscreen$4$MultiAdsFullscreenAppnextAdapter();
            }
        });
        Log.d("multiAdsTag", "Appnext fullscreen attempt to load");
        this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
        this.fullscreenDetails.put("net_name", "ft_ma_appnext");
        this.fullscreenDetails.put("net_name_FS", "ft_ma_appnext");
        HashMap hashMap = this.fullscreenDetails;
        hashMap.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId());
        this.fullscreenDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.fullscreenDetails, this.context, true);
        this.interstitialAd.loadAd();
    }

    public /* synthetic */ void lambda$loadFullscreen$0$MultiAdsFullscreenAppnextAdapter(String str, AppnextAdCreativeType appnextAdCreativeType) {
        Log.d("multiAdsTag", "Appnext fullscreen setOnAdLoadedCallback");
        this.listener.onFullscreenLoaded();
    }

    public /* synthetic */ void lambda$loadFullscreen$1$MultiAdsFullscreenAppnextAdapter(String str) {
        this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
        this.fullscreenDetails.put("net_name", "ft_ma_appnext");
        this.fullscreenDetails.put("net_name_FS", "ft_ma_appnext");
        if (Objects.equals(str, AppnextError.NO_ADS)) {
            HashMap hashMap = this.fullscreenDetails;
            hashMap.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId());
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", this.fullscreenDetails, this.context, true);
        } else {
            HashMap hashMap2 = this.fullscreenDetails;
            hashMap2.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId() + "; error_desc: error code " + str);
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", this.fullscreenDetails, this.context, true);
        }
        Log.d("multiAdsTag", "Appnext fullscreen OnAdError: " + str);
        this.listener.onFullscreenError(str);
    }

    public /* synthetic */ void lambda$loadFullscreen$2$MultiAdsFullscreenAppnextAdapter() {
        Log.d("multiAdsTag", "Appnext fullscreen OnAdOpened");
        this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
        this.fullscreenDetails.put("net_name", "ft_ma_appnext");
        this.fullscreenDetails.put("net_name_FS", "ft_ma_appnext");
        HashMap hashMap = this.fullscreenDetails;
        hashMap.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId());
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", this.fullscreenDetails, this.context, true);
        this.listener.onFullscreenOpened();
    }

    public /* synthetic */ void lambda$loadFullscreen$3$MultiAdsFullscreenAppnextAdapter() {
        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            try {
                this.progressDialog.dismiss();
            } catch (IllegalArgumentException unused) {
                Log.d("multiAdsTag", "progressDialog dismissal IAE");
            }
        }
        Log.d("multiAdsTag", "Appnext fullscreen OnAdClosed");
        this.handler.removeCallbacks(this.onFullscreenClosedRunnable);
        this.handler.postDelayed(this.onFullscreenClosedRunnable, 3000);
    }

    public /* synthetic */ void lambda$loadFullscreen$4$MultiAdsFullscreenAppnextAdapter() {
        Log.d("multiAdsTag", "Appnext fullscreen OnAdClicked");
        this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
        this.fullscreenDetails.put("net_name", "ft_ma_appnext");
        this.fullscreenDetails.put("net_name_FS", "ft_ma_appnext");
        HashMap hashMap = this.fullscreenDetails;
        hashMap.put("details", "fs id: " + this.adNetworkSdkModel.getPlacementId());
        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", this.fullscreenDetails, this.context, true);
        this.listener.onFullscreenClicked();
    }

    public /* synthetic */ void lambda$new$5$MultiAdsFullscreenAppnextAdapter() {
        this.listener.onFullscreenClosed();
    }

    public boolean isFullscreenLoaded() {
        return this.interstitialAd.isAdLoaded();
    }

    public void showFullscreen(Context context) {
        this.progressDialog = new AppsgeyserProgressDialog(context);
        AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
        appsgeyserProgressDialog.show();
        this.handler.postDelayed(new Runnable(appsgeyserProgressDialog) {
            public final /* synthetic */ AppsgeyserProgressDialog f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MultiAdsFullscreenAppnextAdapter.this.lambda$showFullscreen$6$MultiAdsFullscreenAppnextAdapter(this.f$1);
            }
        }, 2000);
    }

    public /* synthetic */ void lambda$showFullscreen$6$MultiAdsFullscreenAppnextAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("multiAdsTag", "progressDialog dismissal IAE");
        }
        this.interstitialAd.showAd();
    }
}
