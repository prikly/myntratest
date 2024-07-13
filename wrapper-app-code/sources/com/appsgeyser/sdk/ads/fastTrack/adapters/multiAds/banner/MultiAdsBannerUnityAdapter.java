package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerInterface;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerUnityAdapter;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.HashMap;

public class MultiAdsBannerUnityAdapter extends MultiAdsBannerBaseAdapter {
    /* access modifiers changed from: private */
    public boolean bannerClickReportedRecently;
    /* access modifiers changed from: private */
    public BannerView bannerView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    protected MultiAdsBannerUnityAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadBanner(final ViewGroup viewGroup) {
        this.bannerViewContainer = viewGroup;
        Log.d("multiAdsTag", "unity banner initializing: " + this.adNetworkSdkModel.getPlacementId());
        this.bannerView = new BannerView((Activity) viewGroup.getContext(), this.adNetworkSdkModel.getPlacementId(), new UnityBannerSize(320, 50));
        this.bannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 50.0f, this.context.getResources().getDisplayMetrics())));
        this.bannerView.setListener(new BannerView.IListener() {
            public void onBannerLoaded(BannerView bannerView) {
                MultiAdsBannerUnityAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                MultiAdsBannerUnityAdapter.this.bannerDetails.put("net_name", "ft_ma_unity");
                HashMap hashMap = MultiAdsBannerUnityAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + MultiAdsBannerUnityAdapter.this.adNetworkSdkModel.getPlacementId());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", MultiAdsBannerUnityAdapter.this.bannerDetails, MultiAdsBannerUnityAdapter.this.context, true);
                viewGroup.setVisibility(0);
                MultiAdsBannerUnityAdapter.this.bannerView.setVisibility(0);
                MultiAdsBannerUnityAdapter.this.listener.onBannerLoaded();
                Log.d("multiAdsTag", "unity banner onBannerLoaded");
            }

            public void onBannerClick(BannerView bannerView) {
                if (!MultiAdsBannerUnityAdapter.this.bannerClickReportedRecently) {
                    MultiAdsBannerUnityAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                    MultiAdsBannerUnityAdapter.this.bannerDetails.put("net_name", "ft_ma_unity");
                    HashMap hashMap = MultiAdsBannerUnityAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + MultiAdsBannerUnityAdapter.this.adNetworkSdkModel.getPlacementId());
                    boolean unused = MultiAdsBannerUnityAdapter.this.bannerClickReportedRecently = true;
                    MultiAdsBannerUnityAdapter.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            MultiAdsBannerUnityAdapter.AnonymousClass1.this.lambda$onBannerClick$0$MultiAdsBannerUnityAdapter$1();
                        }
                    }, 1000);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", MultiAdsBannerUnityAdapter.this.bannerDetails, MultiAdsBannerUnityAdapter.this.context, true);
                    Log.d("multiAdsTag", "unity banner onBannerClick");
                }
                MultiAdsBannerUnityAdapter.this.listener.onBannerClicked();
            }

            public /* synthetic */ void lambda$onBannerClick$0$MultiAdsBannerUnityAdapter$1() {
                boolean unused = MultiAdsBannerUnityAdapter.this.bannerClickReportedRecently = false;
            }

            public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
                Log.d("multiAdsTag", "unity banner onBannerFailedToLoad: " + bannerErrorInfo.errorCode + " " + bannerErrorInfo.errorMessage);
                if (bannerErrorInfo.errorCode == BannerErrorCode.NO_FILL) {
                    MultiAdsBannerUnityAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
                    MultiAdsBannerUnityAdapter.this.bannerDetails.put("net_name", "ft_ma_unity");
                    HashMap hashMap = MultiAdsBannerUnityAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + MultiAdsBannerUnityAdapter.this.adNetworkSdkModel.getPlacementId());
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", MultiAdsBannerUnityAdapter.this.bannerDetails, MultiAdsBannerUnityAdapter.this.context, true);
                } else {
                    HashMap hashMap2 = MultiAdsBannerUnityAdapter.this.bannerDetails;
                    hashMap2.put("details", "banner id: " + MultiAdsBannerUnityAdapter.this.adNetworkSdkModel.getPlacementId() + "; error_desc: error code " + bannerErrorInfo.errorCode + " " + bannerErrorInfo.errorMessage);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", MultiAdsBannerUnityAdapter.this.bannerDetails, MultiAdsBannerUnityAdapter.this.context, true);
                }
                MultiAdsBannerInterface.BannerListener bannerListener = MultiAdsBannerUnityAdapter.this.listener;
                bannerListener.onBannerError(bannerErrorInfo.errorCode + " " + bannerErrorInfo.errorMessage);
            }

            public void onBannerLeftApplication(BannerView bannerView) {
                Log.d("multiAdsTag", "unity banner onBannerLeftApplication");
            }
        });
        Log.d("multiAdsTag", "unity banner attempt to attach bannerView to container");
        this.bannerViewContainer.addView(this.bannerView);
        Log.d("multiAdsTag", "unity banner attempt to load");
        this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_unity");
        this.bannerDetails.put("net_name", "ft_ma_unity");
        HashMap hashMap = this.bannerDetails;
        hashMap.put("details", "banner id: " + this.adNetworkSdkModel.getPlacementId());
        this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", this.bannerDetails, this.context, true);
        this.bannerView.load();
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("multiAdsTag", "unity banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
            }
            this.bannerView.destroy();
            this.bannerView = null;
        }
    }
}
