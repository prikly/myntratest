package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.HashMap;

public class MultiAdsBannerAdmobAdapter extends MultiAdsBannerBaseAdapter {
    /* access modifiers changed from: private */
    public AdView bannerView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    protected MultiAdsBannerAdmobAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadBanner(final ViewGroup viewGroup) {
        this.bannerViewContainer = viewGroup;
        final String placementId = this.adNetworkSdkModel.getPlacementId();
        Log.d("multiAdsTag", "admob banner initializing: " + placementId);
        AdView adView = new AdView(viewGroup.getContext());
        this.bannerView = adView;
        adView.setAdSize(AdSize.SMART_BANNER);
        this.bannerView.setAdUnitId(placementId);
        this.bannerView.setAdListener(new AdListener() {
            public void onAdClosed() {
                super.onAdClosed();
                Log.d("multiAdsTag", "admob banner onAdClosed");
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put("net_name", "ft_ma_admob");
                if (loadAdError.getCode() == 3) {
                    HashMap hashMap = MultiAdsBannerAdmobAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + placementId);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", MultiAdsBannerAdmobAdapter.this.bannerDetails, MultiAdsBannerAdmobAdapter.this.context, true);
                } else {
                    HashMap hashMap2 = MultiAdsBannerAdmobAdapter.this.bannerDetails;
                    hashMap2.put("details", "banner id: " + placementId + "; error_desc: error code " + loadAdError.getCode());
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", MultiAdsBannerAdmobAdapter.this.bannerDetails, MultiAdsBannerAdmobAdapter.this.context, true);
                }
                MultiAdsBannerAdmobAdapter.this.listener.onBannerError(loadAdError.getMessage());
                Log.d("multiAdsTag", "admob banner onAdFailedToLoad: " + loadAdError.getCode());
            }

            public void onAdClicked() {
                super.onAdClicked();
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put("net_name", "ft_ma_admob");
                HashMap hashMap = MultiAdsBannerAdmobAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + placementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", MultiAdsBannerAdmobAdapter.this.bannerDetails, MultiAdsBannerAdmobAdapter.this.context, true);
                MultiAdsBannerAdmobAdapter.this.listener.onBannerClicked();
                Log.d("multiAdsTag", "admob banner onAdClicked");
            }

            public void onAdOpened() {
                super.onAdOpened();
                Log.d("multiAdsTag", "admob banner onAdOpened");
            }

            public void onAdLoaded() {
                super.onAdLoaded();
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
                MultiAdsBannerAdmobAdapter.this.bannerDetails.put("net_name", "ft_ma_admob");
                HashMap hashMap = MultiAdsBannerAdmobAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + placementId);
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", MultiAdsBannerAdmobAdapter.this.bannerDetails, MultiAdsBannerAdmobAdapter.this.context, true);
                viewGroup.setVisibility(0);
                MultiAdsBannerAdmobAdapter.this.bannerView.setVisibility(0);
                MultiAdsBannerAdmobAdapter.this.listener.onBannerLoaded();
                Log.d("multiAdsTag", "admob banner onAdLoaded");
            }

            public void onAdImpression() {
                super.onAdImpression();
                Log.d("multiAdsTag", "admob banner onAdImpression");
            }
        });
        Log.d("multiAdsTag", "admob banner attempt to attach bannerView to container");
        this.bannerViewContainer.addView(this.bannerView);
        Log.d("multiAdsTag", "admob banner attempt to load");
        this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_admob");
        this.bannerDetails.put("net_name", "ft_ma_admob");
        HashMap hashMap = this.bannerDetails;
        hashMap.put("details", "banner id: " + placementId);
        this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", this.bannerDetails, this.context, true);
        this.bannerView.loadAd(new AdRequest.Builder().build());
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("multiAdsTag", "admob banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
            }
            this.bannerView.destroy();
            this.bannerView = null;
        }
    }
}
