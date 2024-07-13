package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.BannerView;
import com.appsgeyser.sdk.GuidGenerator;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.server.StatController;
import java.util.HashMap;

public class MultiAdsBannerAppodealAdapter extends MultiAdsBannerBaseAdapter {
    private BannerView bannerView;

    /* access modifiers changed from: protected */
    public void init() {
    }

    protected MultiAdsBannerAppodealAdapter(Context context, AdNetworkSdkModel adNetworkSdkModel, HashMap<String, String> hashMap) {
        super(context, adNetworkSdkModel, hashMap);
    }

    public void loadBanner(final ViewGroup viewGroup) {
        if (this.adNetworkSdkModel.getAppId() != null && !this.adNetworkSdkModel.getAppId().isEmpty()) {
            this.bannerViewContainer = viewGroup;
            Log.d("multiAdsTag", "appodeal banner initializing: " + this.adNetworkSdkModel.getAppId());
            this.bannerView = Appodeal.getBannerView((Activity) viewGroup.getContext());
            Appodeal.setBannerCallbacks(new BannerCallbacks() {
                public void onBannerLoaded(int i, boolean z) {
                    viewGroup.setVisibility(0);
                    Appodeal.show((Activity) viewGroup.getContext(), 64);
                    MultiAdsBannerAppodealAdapter.this.listener.onBannerLoaded();
                    Log.d("multiAdsTag", "appodeal banner onBannerLoaded");
                }

                public void onBannerFailedToLoad() {
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put("net_name", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_nofill", MultiAdsBannerAppodealAdapter.this.bannerDetails, MultiAdsBannerAppodealAdapter.this.context, true);
                    MultiAdsBannerAppodealAdapter.this.listener.onBannerError("appodeal banner onBannerFailedToLoad");
                    Log.d("multiAdsTag", "appodeal banner onBannerFailedToLoad");
                }

                public void onBannerShown() {
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put("net_name", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_impression", MultiAdsBannerAppodealAdapter.this.bannerDetails, MultiAdsBannerAppodealAdapter.this.context, true);
                    Log.d("multiAdsTag", "appodeal banner onBannerShown");
                }

                public void onBannerShowFailed() {
                    Log.d("multiAdsTag", "appodeal banner onBannerShowFailed");
                }

                public void onBannerClicked() {
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
                    MultiAdsBannerAppodealAdapter.this.bannerDetails.put("net_name", "ft_ma_appodeal");
                    StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_click", MultiAdsBannerAppodealAdapter.this.bannerDetails, MultiAdsBannerAppodealAdapter.this.context, true);
                    MultiAdsBannerAppodealAdapter.this.listener.onBannerClicked();
                    Log.d("multiAdsTag", "appodeal banner onBannerClicked");
                }

                public void onBannerExpired() {
                    Log.d("multiAdsTag", "appodeal banner onBannerExpired");
                }
            });
            this.bannerViewContainer = viewGroup;
            Log.d("multiAdsTag", "appodeal banner attempt to attach bannerView to container");
            this.bannerViewContainer.addView(this.bannerView);
            Log.d("multiAdsTag", "appodeal banner attempt to load");
            this.bannerDetails.put(FullscreenAdService.DATA_KEY_AD_SOURCE, "ft_ma_appodeal");
            this.bannerDetails.put("net_name", "ft_ma_appodeal");
            HashMap hashMap = this.bannerDetails;
            hashMap.put("details", "banner id: " + this.adNetworkSdkModel.getAppId());
            this.bannerDetails.put("uniqid", GuidGenerator.generateNewGuid());
            StatController.getInstance().sendRequestAsyncByKey("ft_banner_sdk_request", this.bannerDetails, this.context, true);
            this.handler.postDelayed(new Runnable(viewGroup) {
                public final /* synthetic */ ViewGroup f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Appodeal.cache((Activity) this.f$0.getContext(), 4);
                }
            }, 1000);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.bannerView != null) {
            if (this.bannerViewContainer != null) {
                Log.d("multiAdsTag", "appodeal banner attempt to detach bannerView from container");
                this.bannerViewContainer.removeView(this.bannerView);
            }
            Appodeal.destroy(4);
            this.bannerView = null;
        }
    }
}
