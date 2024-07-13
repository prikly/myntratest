package io.bidmachine;

import android.graphics.Point;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.ApiRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.displays.DisplayPlacementBuilder;
import io.bidmachine.displays.NativePlacementBuilder;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.displays.VideoPlacementBuilder;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public enum AdsType {
    Banner("banner", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder<UnifiedBannerAdRequestParams>(false) {
        public Point getSize(ContextProvider contextProvider, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams) {
            BannerSize bannerSize = unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize();
            return new Point(bannerSize.width, bannerSize.height);
        }
    }}),
    Interstitial("interstitial", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(true)}),
    Rewarded("rewarded", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(false)}),
    Native("native", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new NativePlacementBuilder()}),
    RichMedia("richmedia", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new VideoPlacementBuilder(true)});
    
    private final ApiRequest.ApiAuctionDataBinder binder;
    private final String name;
    private final Map<String, NetworkConfig> networkConfigs;
    private final PlacementBuilder[] placementBuilders;
    private final Executor placementCreateExecutor;

    private AdsType(String str, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, PlacementBuilder[] placementBuilderArr) {
        this.name = str;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = placementBuilderArr;
        this.networkConfigs = new HashMap();
        this.placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
    }

    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    /* access modifiers changed from: package-private */
    public Map<String, NetworkConfig> getNetworkConfigs() {
        return this.networkConfigs;
    }

    /* access modifiers changed from: package-private */
    public NetworkAdapter findNetworkAdapter(Ad ad) {
        HeaderBiddingAd obtainHeaderBiddingAd = obtainHeaderBiddingAd(ad);
        NetworkAdapter adapter = obtainHeaderBiddingAd != null ? NetworkRegistry.getAdapter(obtainHeaderBiddingAd.getBidder()) : null;
        if (adapter != null) {
            return adapter;
        }
        if (this == Native) {
            return NetworkRegistry.getAdapter("nast");
        }
        if (ad.hasDisplay()) {
            return NetworkRegistry.getAdapter("mraid");
        }
        return ad.hasVideo() ? NetworkRegistry.getAdapter("vast") : adapter;
    }

    /* access modifiers changed from: package-private */
    public AdObjectParams createAdObjectParams(Ad ad) {
        for (PlacementBuilder createAdObjectParams : this.placementBuilders) {
            AdObjectParams createAdObjectParams2 = createAdObjectParams.createAdObjectParams(ad);
            if (createAdObjectParams2 != null) {
                return createAdObjectParams2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public HeaderBiddingAd obtainHeaderBiddingAd(Ad ad) {
        for (PlacementBuilder obtainHeaderBiddingAd : this.placementBuilders) {
            HeaderBiddingAd obtainHeaderBiddingAd2 = obtainHeaderBiddingAd.obtainHeaderBiddingAd(ad);
            if (obtainHeaderBiddingAd2 != null) {
                return obtainHeaderBiddingAd2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void collectPlacements(ContextProvider contextProvider, AdRequest adRequest, UnifiedAdRequestParams unifiedAdRequestParams, List<NetworkConfig> list, List<Message.Builder> list2, List<NetworkAdUnit> list3, int i) {
        PlacementBuilder[] placementBuilderArr;
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        PlacementBuilder[] placementBuilderArr2 = adsType.placementBuilders;
        int length = placementBuilderArr2.length;
        int i2 = 0;
        while (i2 < length) {
            final PlacementBuilder placementBuilder = placementBuilderArr2[i2];
            if (adRequest.isPlacementBuilderMatch(placementBuilder)) {
                Executor executor = adsType.placementCreateExecutor;
                final ContextProvider contextProvider2 = contextProvider;
                final UnifiedAdRequestParams unifiedAdRequestParams2 = unifiedAdRequestParams;
                final List<NetworkConfig> list4 = list;
                final List<NetworkAdUnit> list5 = list3;
                final int i3 = i;
                AnonymousClass2 r11 = r1;
                final List<Message.Builder> list6 = list2;
                placementBuilderArr = placementBuilderArr2;
                Executor executor2 = executor;
                final CountDownLatch countDownLatch2 = countDownLatch;
                AnonymousClass2 r1 = new Runnable() {
                    public void run() {
                        try {
                            Message.Builder createPlacement = placementBuilder.createPlacement(contextProvider2, unifiedAdRequestParams2, AdsType.this, list4, list5, i3);
                            synchronized (list6) {
                                list6.add(createPlacement);
                            }
                            countDownLatch2.countDown();
                        } catch (Exception e2) {
                            Logger.log((Throwable) e2);
                            countDownLatch2.countDown();
                        }
                    }
                };
                executor2.execute(r11);
            } else {
                placementBuilderArr = placementBuilderArr2;
                countDownLatch.countDown();
            }
            i2++;
            adsType = this;
            placementBuilderArr2 = placementBuilderArr;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            Logger.log((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void addNetworkConfig(String str, NetworkConfig networkConfig) {
        this.networkConfigs.put(str, networkConfig);
    }
}
