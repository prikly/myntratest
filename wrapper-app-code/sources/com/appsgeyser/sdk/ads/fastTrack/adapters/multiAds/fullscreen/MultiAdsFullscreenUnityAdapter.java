package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import java.util.Arrays;
import java.util.HashMap;

public class MultiAdsFullscreenUnityAdapter extends MultiAdsFullscreenBaseAdapter {
    /* access modifiers changed from: private */
    public boolean fullscreenAdsLoaded;
    /* access modifiers changed from: private */
    public boolean pendingInitCompletion;
    private Runnable pendingInitCompletionRunnable = new Runnable() {
        public void run() {
            boolean unused = MultiAdsFullscreenUnityAdapter.this.pendingInitCompletion = false;
            if (!UnityAds.isInitialized()) {
                Log.d("multiAdsTag", "unity fullscreen initializing takes too long");
                MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name", "ft_ma_unity");
                MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_unity");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenUnityAdapter.this.fullscreenDetails, MultiAdsFullscreenUnityAdapter.this.context, true);
                MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenError("unity fullscreen initializing takes too long");
                return;
            }
            MultiAdsFullscreenUnityAdapter.this.loadFullscreen();
        }
    };
    private IUnityAdsShowListener showListener;

    /* access modifiers changed from: protected */
    public void init() {
    }

    public MultiAdsFullscreenUnityAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void initCompleted() {
        if (this.pendingInitCompletion) {
            this.handler.removeCallbacks(this.pendingInitCompletionRunnable);
            this.pendingInitCompletionRunnable.run();
        }
    }

    public void loadFullscreen() {
        if (!UnityAds.isInitialized()) {
            this.pendingInitCompletion = true;
            this.handler.postDelayed(this.pendingInitCompletionRunnable, 5000);
        } else if (this.adNetworkSdkModel.getPlacementId() == null || this.adNetworkSdkModel.getPlacementId().isEmpty()) {
            Log.d("multiAdsTag", "unity fullscreen placement id missing");
            this.listener.onFullscreenError("unity fullscreen placement id missing");
        } else {
            this.fullscreenAdsLoaded = false;
            Log.d("fastTrackTag", "unity fullscreen initializing: " + this.adNetworkSdkModel.getPlacementId());
            this.showListener = new IUnityAdsShowListener() {
                public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                    Log.d("fastTrackTag", "unity fs onUnityAdsShowFailure");
                }

                public void onUnityAdsShowStart(String str) {
                    Log.d("multiAdsTag", "unity fullscreen onUnityAdsShowStart");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name", "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_unity");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", MultiAdsFullscreenUnityAdapter.this.fullscreenDetails, MultiAdsFullscreenUnityAdapter.this.context, true);
                    MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenOpened();
                }

                public void onUnityAdsShowClick(String str) {
                    Log.d("multiAdsTag", "unity fullscreen onUnityAdsShowClick");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name", "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_unity");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", MultiAdsFullscreenUnityAdapter.this.fullscreenDetails, MultiAdsFullscreenUnityAdapter.this.context, true);
                    MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenClicked();
                }

                public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    if (MultiAdsFullscreenUnityAdapter.this.progressDialog != null && MultiAdsFullscreenUnityAdapter.this.progressDialog.isShowing()) {
                        try {
                            MultiAdsFullscreenUnityAdapter.this.progressDialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                            Log.d("multiAdsTag", "progressDialog dismissal IAE");
                        }
                    }
                    Log.d("multiAdsTag", "unity fullscreen onInterstitialDismissed");
                    MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenClosed();
                    boolean unused2 = MultiAdsFullscreenUnityAdapter.this.fullscreenAdsLoaded = false;
                }
            };
            AnonymousClass3 r0 = new IUnityAdsLoadListener() {
                public void onUnityAdsAdLoaded(String str) {
                    boolean unused = MultiAdsFullscreenUnityAdapter.this.fullscreenAdsLoaded = true;
                    Log.d("multiAdsTag", "unity fullscreen onUnityAdsAdLoaded");
                    MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenLoaded();
                }

                public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name", "ft_ma_unity");
                    MultiAdsFullscreenUnityAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_unity");
                    if (unityAdsLoadError == UnityAds.UnityAdsLoadError.NO_FILL) {
                        HashMap hashMap = MultiAdsFullscreenUnityAdapter.this.fullscreenDetails;
                        hashMap.put("details", "fs id: " + MultiAdsFullscreenUnityAdapter.this.adNetworkSdkModel.getPlacementId());
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenUnityAdapter.this.fullscreenDetails, MultiAdsFullscreenUnityAdapter.this.context, true);
                    } else {
                        HashMap hashMap2 = MultiAdsFullscreenUnityAdapter.this.fullscreenDetails;
                        hashMap2.put("details", "fs id: " + MultiAdsFullscreenUnityAdapter.this.adNetworkSdkModel.getPlacementId() + "; error_desc: error message " + str2);
                        StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_error", MultiAdsFullscreenUnityAdapter.this.fullscreenDetails, MultiAdsFullscreenUnityAdapter.this.context, true);
                    }
                    Log.d("multiAdsTag", "unity fs onUnityAdsFailedToLoad " + unityAdsLoadError.toString() + " ; " + str2);
                    MultiAdsFullscreenUnityAdapter.this.listener.onFullscreenError(str2);
                }
            };
            Log.d("multiAdsTag", "unity fullscreen attempt to load");
            this.fullscreenDetails.put("uniqid", GuidGenerator.generateNewGuid());
            this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
            this.fullscreenDetails.put("net_name", "ft_ma_unity");
            this.fullscreenDetails.put("net_name_FS", "ft_ma_unity");
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.fullscreenDetails, this.context, true);
            UnityAds.load(this.adNetworkSdkModel.getPlacementId(), r0);
        }
    }

    public boolean isFullscreenLoaded() {
        return this.fullscreenAdsLoaded;
    }

    public void showFullscreen(Context context) {
        Log.d("multiAdsTag", "unity fullscreen attempt to show");
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
                MultiAdsFullscreenUnityAdapter.this.lambda$showFullscreen$0$MultiAdsFullscreenUnityAdapter(this.f$1, this.f$2);
            }
        }, 2000);
    }

    public /* synthetic */ void lambda$showFullscreen$0$MultiAdsFullscreenUnityAdapter(AppsgeyserProgressDialog appsgeyserProgressDialog, Context context) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("multiAdsTag", "progressDialog dismissal IAE");
        }
        try {
            UnityAds.show((Activity) context, this.adNetworkSdkModel.getPlacementId(), new UnityAdsShowOptions(), this.showListener);
        } catch (Exception e2) {
            Log.d("multiAdsTag", "facebook activity pass fail: " + Arrays.toString(e2.getStackTrace()));
        }
    }
}
