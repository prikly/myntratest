package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerListener;
import com.appnext.banners.BannerSize;
import com.appnext.banners.BannerView;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerAppnextAdapter;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import java.util.HashMap;
import java.util.Objects;

public class MultiAdsBannerAppnextAdapter extends MultiAdsBannerBaseAdapter {
    /* access modifiers changed from: private */
    public boolean bannerClickReportedRecently;
    /* access modifiers changed from: private */
    public BannerView bannerView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    protected MultiAdsBannerAppnextAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadBanner(final ViewGroup viewGroup) {
        this.bannerViewContainer = viewGroup;
        final String placementId = this.adNetworkSdkModel.getPlacementId();
        Log.d("multiAdsTag", "appnext banner initializing: " + placementId);
        this.bannerView = new BannerView(viewGroup.getContext());
        this.bannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 50.0f, this.context.getResources().getDisplayMetrics())));
        this.bannerView.setPlacementId(placementId);
        this.bannerView.setBannerSize(BannerSize.BANNER);
        this.bannerView.setBannerListener(new BannerListener() {
            public void onError(AppnextError appnextError) {
                Log.d("multiAdsTag", "appnext banner onError: " + appnextError.getErrorMessage());
                if (Objects.equals(appnextError.getErrorMessage(), AppnextError.NO_ADS)) {
                    MultiAdsBannerAppnextAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
                    MultiAdsBannerAppnextAdapter.this.bannerDetails.put("net_name", "ft_ma_appnext");
                    HashMap hashMap = MultiAdsBannerAppnextAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + placementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", MultiAdsBannerAppnextAdapter.this.bannerDetails, MultiAdsBannerAppnextAdapter.this.context, true);
                } else {
                    HashMap hashMap2 = MultiAdsBannerAppnextAdapter.this.bannerDetails;
                    hashMap2.put("details", "banner id: " + placementId + "; error_desc: error code " + appnextError.getErrorMessage());
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", MultiAdsBannerAppnextAdapter.this.bannerDetails, MultiAdsBannerAppnextAdapter.this.context, true);
                }
                MultiAdsBannerAppnextAdapter.this.listener.onBannerError(appnextError.getErrorMessage());
                super.onError(appnextError);
            }

            public void onAdLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                MultiAdsBannerAppnextAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
                MultiAdsBannerAppnextAdapter.this.bannerDetails.put("net_name", "ft_ma_appnext");
                HashMap hashMap = MultiAdsBannerAppnextAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + placementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", MultiAdsBannerAppnextAdapter.this.bannerDetails, MultiAdsBannerAppnextAdapter.this.context, true);
                viewGroup.setVisibility(0);
                MultiAdsBannerAppnextAdapter.this.bannerView.setVisibility(0);
                MultiAdsBannerAppnextAdapter.this.listener.onBannerLoaded();
                Log.d("multiAdsTag", "appnext banner onAdLoaded");
                super.onAdLoaded(str, appnextAdCreativeType);
            }

            public void adImpression() {
                Log.d("multiAdsTag", "appnext banner adImpression");
                super.adImpression();
            }

            public void onAdClicked() {
                if (!MultiAdsBannerAppnextAdapter.this.bannerClickReportedRecently) {
                    MultiAdsBannerAppnextAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
                    MultiAdsBannerAppnextAdapter.this.bannerDetails.put("net_name", "ft_ma_appnext");
                    HashMap hashMap = MultiAdsBannerAppnextAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + placementId);
                    boolean unused = MultiAdsBannerAppnextAdapter.this.bannerClickReportedRecently = true;
                    MultiAdsBannerAppnextAdapter.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            MultiAdsBannerAppnextAdapter.AnonymousClass1.this.lambda$onAdClicked$0$MultiAdsBannerAppnextAdapter$1();
                        }
                    }, 1000);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", MultiAdsBannerAppnextAdapter.this.bannerDetails, MultiAdsBannerAppnextAdapter.this.context, true);
                    Log.d("multiAdsTag", "appnext banner onAdClicked");
                }
                MultiAdsBannerAppnextAdapter.this.listener.onBannerClicked();
                super.onAdClicked();
            }

            public /* synthetic */ void lambda$onAdClicked$0$MultiAdsBannerAppnextAdapter$1() {
                boolean unused = MultiAdsBannerAppnextAdapter.this.bannerClickReportedRecently = false;
            }
        });
        Log.d("multiAdsTag", "appnext banner attempt to attach bannerView to container");
        this.bannerViewContainer.addView(this.bannerView);
        Log.d("multiAdsTag", "appnext banner attempt to load");
        this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appnext");
        this.bannerDetails.put("net_name", "ft_ma_appnext");
        HashMap hashMap = this.bannerDetails;
        hashMap.put("details", "banner id: " + placementId);
        this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", this.bannerDetails, this.context, true);
        this.bannerView.loadAd(new BannerAdRequest());
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("multiAdsTag", "appnext banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
            }
            this.bannerView.setBannerListener((BannerListener) null);
            this.bannerView.destroy();
            this.bannerView = null;
        }
    }
}
