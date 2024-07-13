package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerFacebookAdapter;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import java.util.HashMap;

public class MultiAdsBannerFacebookAdapter extends MultiAdsBannerBaseAdapter {
    /* access modifiers changed from: private */
    public boolean bannerClickReportedRecently;
    /* access modifiers changed from: private */
    public AdView bannerView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    protected MultiAdsBannerFacebookAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadBanner(final ViewGroup viewGroup) {
        this.bannerViewContainer = viewGroup;
        Log.d("multiAdsTag", "facebook banner initializing: " + this.adNetworkSdkModel.getPlacementId());
        this.bannerView = new AdView(this.context, this.adNetworkSdkModel.getPlacementId(), AdSize.BANNER_HEIGHT_50);
        this.bannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 50.0f, this.context.getResources().getDisplayMetrics())));
        AnonymousClass1 r0 = new AdListener() {
            public void onError(Ad ad, AdError adError) {
                Log.d("multiAdsTag", "facebook banner onError: " + adError.getErrorMessage());
                if (adError.getErrorCode() == 1001) {
                    MultiAdsBannerFacebookAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                    MultiAdsBannerFacebookAdapter.this.bannerDetails.put("net_name", "ft_ma_facebook");
                    HashMap hashMap = MultiAdsBannerFacebookAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + MultiAdsBannerFacebookAdapter.this.adNetworkSdkModel.getPlacementId());
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", MultiAdsBannerFacebookAdapter.this.bannerDetails, MultiAdsBannerFacebookAdapter.this.context, true);
                } else {
                    HashMap hashMap2 = MultiAdsBannerFacebookAdapter.this.bannerDetails;
                    hashMap2.put("details", "banner id: " + MultiAdsBannerFacebookAdapter.this.adNetworkSdkModel.getPlacementId() + "; error_desc: error code " + adError.getErrorCode() + " " + adError.getErrorMessage());
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_error", MultiAdsBannerFacebookAdapter.this.bannerDetails, MultiAdsBannerFacebookAdapter.this.context, true);
                }
                MultiAdsBannerFacebookAdapter.this.listener.onBannerError(adError.getErrorMessage());
            }

            public void onAdClicked(Ad ad) {
                if (!MultiAdsBannerFacebookAdapter.this.bannerClickReportedRecently) {
                    MultiAdsBannerFacebookAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                    MultiAdsBannerFacebookAdapter.this.bannerDetails.put("net_name", "ft_ma_facebook");
                    HashMap hashMap = MultiAdsBannerFacebookAdapter.this.bannerDetails;
                    hashMap.put("details", "banner id: " + MultiAdsBannerFacebookAdapter.this.adNetworkSdkModel.getPlacementId());
                    boolean unused = MultiAdsBannerFacebookAdapter.this.bannerClickReportedRecently = true;
                    MultiAdsBannerFacebookAdapter.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            MultiAdsBannerFacebookAdapter.AnonymousClass1.this.lambda$onAdClicked$0$MultiAdsBannerFacebookAdapter$1();
                        }
                    }, 1000);
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", MultiAdsBannerFacebookAdapter.this.bannerDetails, MultiAdsBannerFacebookAdapter.this.context, true);
                    Log.d("multiAdsTag", "facebook banner onAdClicked");
                }
                MultiAdsBannerFacebookAdapter.this.listener.onBannerClicked();
            }

            public /* synthetic */ void lambda$onAdClicked$0$MultiAdsBannerFacebookAdapter$1() {
                boolean unused = MultiAdsBannerFacebookAdapter.this.bannerClickReportedRecently = false;
            }

            public void onAdLoaded(Ad ad) {
                MultiAdsBannerFacebookAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
                MultiAdsBannerFacebookAdapter.this.bannerDetails.put("net_name", "ft_ma_facebook");
                HashMap hashMap = MultiAdsBannerFacebookAdapter.this.bannerDetails;
                hashMap.put("details", "banner id: " + MultiAdsBannerFacebookAdapter.this.adNetworkSdkModel.getPlacementId());
                StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", MultiAdsBannerFacebookAdapter.this.bannerDetails, MultiAdsBannerFacebookAdapter.this.context, true);
                viewGroup.setVisibility(0);
                MultiAdsBannerFacebookAdapter.this.bannerView.setVisibility(0);
                MultiAdsBannerFacebookAdapter.this.listener.onBannerLoaded();
                Log.d("multiAdsTag", "facebook banner onAdLoaded");
            }

            public void onLoggingImpression(Ad ad) {
                Log.d("multiAdsTag", "facebook banner onLoggingImpression");
            }
        };
        Log.d("multiAdsTag", "facebook banner attempt to attach bannerView to container");
        this.bannerViewContainer.addView(this.bannerView);
        Log.d("multiAdsTag", "facebook banner attempt to load");
        this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_facebook");
        this.bannerDetails.put("net_name", "ft_ma_facebook");
        HashMap hashMap = this.bannerDetails;
        hashMap.put("details", "banner id: " + this.adNetworkSdkModel.getPlacementId());
        this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
        StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", this.bannerDetails, this.context, true);
        AdView adView = this.bannerView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(r0).build());
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("multiAdsTag", "facebook banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
            }
            this.bannerView.destroy();
            this.bannerView = null;
        }
    }
}
