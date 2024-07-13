package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.InterstitialCallbacks;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.Arrays;
import java.util.HashMap;

public class MultiAdsFullscreenAppodealAdapter extends MultiAdsFullscreenBaseAdapter {
    /* access modifiers changed from: private */
    public boolean pendingInitCompletion;
    private Runnable pendingInitCompletionRunnable = new Runnable() {
        public void run() {
            boolean unused = MultiAdsFullscreenAppodealAdapter.this.pendingInitCompletion = false;
            if (!Appodeal.isInitialized(3)) {
                Log.d("multiAdsTag", "Appodeal fullscreen initializing takes too long");
                MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name", "ft_ma_appodeal");
                MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_appodeal");
                StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails, MultiAdsFullscreenAppodealAdapter.this.context, true);
                MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenError("Appodeal fullscreen initializing takes too long");
                return;
            }
            MultiAdsFullscreenAppodealAdapter.this.loadFullscreen();
        }
    };

    /* access modifiers changed from: protected */
    public void init() {
    }

    public MultiAdsFullscreenAppodealAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void initCompleted() {
        if (this.pendingInitCompletion) {
            this.handler.removeCallbacks(this.pendingInitCompletionRunnable);
            this.pendingInitCompletionRunnable.run();
        }
    }

    public void loadFullscreen() {
        if (!Appodeal.isInitialized(3)) {
            this.pendingInitCompletion = true;
            this.handler.postDelayed(this.pendingInitCompletionRunnable, 5000);
        } else if (this.adNetworkSdkModel.getAppId() == null || this.adNetworkSdkModel.getAppId().isEmpty()) {
            Log.d("multiAdsTag", "Appodeal app placement id missing");
            this.listener.onFullscreenError("Appodeal app placement id missing");
        } else {
            Log.d("multiAdsTag", "Appodeal fullscreen initializing");
            Appodeal.setInterstitialCallbacks(new InterstitialCallbacks() {
                public void onInterstitialLoaded(boolean z) {
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialLoaded");
                    MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenLoaded();
                }

                public void onInterstitialFailedToLoad() {
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name", "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_nofill", MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails, MultiAdsFullscreenAppodealAdapter.this.context, true);
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialFailedToLoad");
                    MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenError("Appodeal fullscreen onInterstitialFailedToLoad");
                }

                public void onInterstitialShown() {
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialShown");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name", "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_impression", MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails, MultiAdsFullscreenAppodealAdapter.this.context, true);
                    MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenOpened();
                }

                public void onInterstitialShowFailed() {
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialShowFailed");
                }

                public void onInterstitialClicked() {
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialClicked");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name", "ft_ma_appodeal");
                    MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails.put("net_name_FS", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_click", MultiAdsFullscreenAppodealAdapter.this.fullscreenDetails, MultiAdsFullscreenAppodealAdapter.this.context, true);
                    MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenClicked();
                }

                public void onInterstitialClosed() {
                    if (MultiAdsFullscreenAppodealAdapter.this.progressDialog != null && MultiAdsFullscreenAppodealAdapter.this.progressDialog.isShowing()) {
                        try {
                            MultiAdsFullscreenAppodealAdapter.this.progressDialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                            Log.d("multiAdsTag", "progressDialog dismissal IAE");
                        }
                    }
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialClosed");
                    MultiAdsFullscreenAppodealAdapter.this.listener.onFullscreenClosed();
                }

                public void onInterstitialExpired() {
                    Log.d("multiAdsTag", "Appodeal fullscreen onInterstitialExpired");
                }
            });
            Log.d("multiAdsTag", "appodeal fullscreen attempt to load");
            this.fullscreenDetails.put("uniqid", GuidGenerator.generateNewGuid());
            this.fullscreenDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
            this.fullscreenDetails.put("net_name", "ft_ma_appodeal");
            this.fullscreenDetails.put("net_name_FS", "ft_ma_appodeal");
            StatController.getInstance().sendRequestAsyncByKey("ft_interstitial_sdk_request", this.fullscreenDetails, this.context, true);
            Appodeal.cache((Activity) this.context, 3);
        }
    }

    public boolean isFullscreenLoaded() {
        return Appodeal.isLoaded(3);
    }

    public void showFullscreen(Context context) {
        Log.d("multiAdsTag", "Appodeal fullscreen attempt to show");
        this.progressDialog = new AppsgeyserProgressDialog(context);
        AppsgeyserProgressDialog appsgeyserProgressDialog = this.progressDialog;
        appsgeyserProgressDialog.show();
        this.handler.postDelayed(new Runnable(context) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MultiAdsFullscreenAppodealAdapter.lambda$showFullscreen$0(AppsgeyserProgressDialog.this, this.f$1);
            }
        }, 2000);
    }

    static /* synthetic */ void lambda$showFullscreen$0(AppsgeyserProgressDialog appsgeyserProgressDialog, Context context) {
        try {
            appsgeyserProgressDialog.dismiss();
        } catch (IllegalArgumentException unused) {
            Log.d("fastTrackTag", "progressDialog dismissal IAE");
        }
        try {
            Appodeal.show((Activity) context, 3);
        } catch (Exception e2) {
            Log.d("fastTrackTag", "Appodeal activity pass fail: " + Arrays.toString(e2.getStackTrace()));
        }
    }
}
