package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.ads.AdView;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerInterface;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiAdsBannerManager {
    /* access modifiers changed from: private */
    public RelativeLayout adViewContainer;
    private AdView backfillAdView;
    /* access modifiers changed from: private */
    public final ArrayList<MultiAdsBannerBaseAdapter> bannerAdaptersArrayList;
    private final Map<String, AdNetworkSdkModel> bannerPlacementIdMap;
    /* access modifiers changed from: private */
    public Integer bannerRefreshRate;
    private ViewGroup bannerViewContainer;
    private Context context;
    /* access modifiers changed from: private */
    public int currentlyLoadingAdapterIndex = 0;
    /* access modifiers changed from: private */
    public Handler handler;
    /* access modifiers changed from: private */
    public final Runnable nextAdapterTryLoadBannerRunnable = new Runnable() {
        public final void run() {
            MultiAdsBannerManager.this.lambda$new$2$MultiAdsBannerManager();
        }
    };
    /* access modifiers changed from: private */
    public boolean noBannerAvailable = false;
    /* access modifiers changed from: private */
    public ProgressBar progressBar;
    /* access modifiers changed from: private */
    public final Runnable refreshBannerRunnable = new Runnable() {
        public final void run() {
            MultiAdsBannerManager.this.lambda$new$1$MultiAdsBannerManager();
        }
    };
    /* access modifiers changed from: private */
    public final Runnable tryLoadSdkBannerAgainRunnable = new Runnable() {
        public final void run() {
            MultiAdsBannerManager.this.lambda$new$3$MultiAdsBannerManager();
        }
    };

    public MultiAdsBannerManager(Map<String, AdNetworkSdkModel> map, Context context2, HashMap<String, String> hashMap) {
        this.bannerPlacementIdMap = map;
        this.context = context2;
        this.handler = new Handler(context2.getMainLooper());
        this.bannerAdaptersArrayList = new ArrayList<>(3);
        init(hashMap);
    }

    private void init(HashMap<String, String> hashMap) {
        for (Map.Entry next : this.bannerPlacementIdMap.entrySet()) {
            if (((AdNetworkSdkModel) next.getValue()).isActive()) {
                String str = (String) next.getKey();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1892803072:
                        if (str.equals("appodealSdk")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -963943683:
                        if (str.equals("admobSdk")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -291586939:
                        if (str.equals("unitySdk")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 958098324:
                        if (str.equals("facebookSdk")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1314914054:
                        if (str.equals("appnextSdk")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    this.bannerAdaptersArrayList.add(new MultiAdsBannerAppodealAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 1) {
                    this.bannerAdaptersArrayList.add(new MultiAdsBannerAdmobAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 2) {
                    this.bannerAdaptersArrayList.add(new MultiAdsBannerAppnextAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 3) {
                    this.bannerAdaptersArrayList.add(new MultiAdsBannerFacebookAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 4) {
                    this.bannerAdaptersArrayList.add(new MultiAdsBannerUnityAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                }
            }
        }
        if (this.bannerAdaptersArrayList.size() > 1) {
            Collections.sort(this.bannerAdaptersArrayList, $$Lambda$MultiAdsBannerManager$6PrfsoRFRm_uv9hslMejqh20wn0.INSTANCE);
        }
    }

    static /* synthetic */ int lambda$init$0(MultiAdsBannerBaseAdapter multiAdsBannerBaseAdapter, MultiAdsBannerBaseAdapter multiAdsBannerBaseAdapter2) {
        return multiAdsBannerBaseAdapter2.getPriority() - multiAdsBannerBaseAdapter.getPriority();
    }

    public void initBannerView(ViewGroup viewGroup, Integer num) {
        this.bannerRefreshRate = num;
        this.bannerViewContainer = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 50.0f, this.context.getResources().getDisplayMetrics()));
        ProgressBar progressBar2 = new ProgressBar(viewGroup.getContext());
        this.progressBar = progressBar2;
        progressBar2.setLayoutParams(layoutParams);
        viewGroup.addView(this.progressBar);
        this.progressBar.setVisibility(8);
        this.adViewContainer = new RelativeLayout(viewGroup.getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13);
        this.adViewContainer.setGravity(17);
        this.adViewContainer.setLayoutParams(layoutParams2);
        this.bannerViewContainer.addView(this.adViewContainer);
        viewGroup.setVisibility(0);
        loadBanner();
    }

    /* access modifiers changed from: private */
    public void loadBanner() {
        Log.d("multiAdsTag", "Banner load attempt");
        if (this.bannerAdaptersArrayList.size() > 0) {
            this.adViewContainer.removeAllViews();
            if (this.noBannerAvailable || this.currentlyLoadingAdapterIndex >= this.bannerAdaptersArrayList.size()) {
                Log.d("multiAdsTag", "SDK banners unavailable, proceeding to HTML");
                this.progressBar.setVisibility(8);
                this.backfillAdView = new AdView(this.bannerViewContainer.getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) Math.ceil((double) (this.context.getResources().getDisplayMetrics().density * 50.0f)));
                layoutParams.addRule(13, -1);
                this.backfillAdView.setLayoutParams(layoutParams);
                this.adViewContainer.addView(this.backfillAdView);
                AppsgeyserSDK.setAdView(this.backfillAdView);
                this.adViewContainer.setVisibility(0);
                this.backfillAdView.onResume();
                return;
            }
            Log.d("multiAdsTag", "SDK banner load attempt");
            if (this.backfillAdView != null) {
                AppsgeyserSDK.setAdView((AdView) null);
                this.backfillAdView.onPause();
                this.backfillAdView = null;
            }
            this.progressBar.setVisibility(0);
            this.adViewContainer.setVisibility(8);
            MultiAdsBannerInterface multiAdsBannerInterface = this.bannerAdaptersArrayList.get(this.currentlyLoadingAdapterIndex);
            multiAdsBannerInterface.setListener(new MultiAdsBannerInterface.BannerListener() {
                public void onBannerClicked() {
                }

                public void onBannerLoaded() {
                    Log.d("multiAdsTag", "Banner loaded, attempting to show");
                    int unused = MultiAdsBannerManager.this.currentlyLoadingAdapterIndex = 0;
                    MultiAdsBannerManager.this.progressBar.setVisibility(8);
                    MultiAdsBannerManager.this.adViewContainer.setVisibility(0);
                    MultiAdsBannerManager.this.handler.removeCallbacks(MultiAdsBannerManager.this.refreshBannerRunnable);
                    MultiAdsBannerManager.this.handler.postDelayed(MultiAdsBannerManager.this.refreshBannerRunnable, (long) MultiAdsBannerManager.this.bannerRefreshRate.intValue());
                }

                public void onBannerError(String str) {
                    if (MultiAdsBannerManager.this.currentlyLoadingAdapterIndex == MultiAdsBannerManager.this.bannerAdaptersArrayList.size() - 1) {
                        boolean unused = MultiAdsBannerManager.this.noBannerAvailable = true;
                        Log.d("multiAdsTag", "No banner available, blocking loads for 2 minutes");
                        int unused2 = MultiAdsBannerManager.this.currentlyLoadingAdapterIndex = 0;
                        MultiAdsBannerManager.this.loadBanner();
                        MultiAdsBannerManager.this.handler.removeCallbacks(MultiAdsBannerManager.this.tryLoadSdkBannerAgainRunnable);
                        MultiAdsBannerManager.this.handler.postDelayed(MultiAdsBannerManager.this.tryLoadSdkBannerAgainRunnable, 120000);
                        return;
                    }
                    MultiAdsBannerManager.this.handler.removeCallbacks(MultiAdsBannerManager.this.nextAdapterTryLoadBannerRunnable);
                    MultiAdsBannerManager.this.handler.postDelayed(MultiAdsBannerManager.this.nextAdapterTryLoadBannerRunnable, 1000);
                }
            });
            multiAdsBannerInterface.loadBanner(this.adViewContainer);
        }
    }

    public /* synthetic */ void lambda$new$1$MultiAdsBannerManager() {
        Log.d("multiAdsTag", "Attempting to refresh banner");
        loadBanner();
    }

    public /* synthetic */ void lambda$new$2$MultiAdsBannerManager() {
        Log.d("multiAdsTag", "Banner load failed, proceeding to next adapter");
        this.currentlyLoadingAdapterIndex++;
        loadBanner();
    }

    public /* synthetic */ void lambda$new$3$MultiAdsBannerManager() {
        this.noBannerAvailable = false;
        loadBanner();
        Log.d("multiAdsTag", "Banner loading block disabled");
    }

    public void onPause() {
        this.handler.removeCallbacks(this.refreshBannerRunnable);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            this.bannerViewContainer.removeView(progressBar2);
        }
        Iterator<MultiAdsBannerBaseAdapter> it = this.bannerAdaptersArrayList.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void onResume() {
        Iterator<MultiAdsBannerBaseAdapter> it = this.bannerAdaptersArrayList.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }
}
