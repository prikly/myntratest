package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.common.b;
import java.util.List;

public interface TTAdNative {

    public interface AppOpenAdListener extends b {
        void onAppOpenAdLoaded(TTAppOpenAd tTAppOpenAd);

        void onError(int i, String str);
    }

    @Deprecated
    public interface BannerAdListener extends b {
        void onBannerAdLoad(TTBannerAd tTBannerAd);

        void onError(int i, String str);
    }

    public interface FeedAdListener extends b {
        void onError(int i, String str);

        void onFeedAdLoad(List<TTFeedAd> list);
    }

    public interface FullScreenVideoAdListener extends b {
        void onError(int i, String str);

        void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd);

        void onFullScreenVideoCached();
    }

    @Deprecated
    public interface InteractionAdListener extends b {
        void onError(int i, String str);

        void onInteractionAdLoad(TTInteractionAd tTInteractionAd);
    }

    @Deprecated
    public interface NativeAdListener extends b {
        void onError(int i, String str);

        void onNativeAdLoad(List<TTNativeAd> list);
    }

    public interface NativeExpressAdListener extends b {
        void onError(int i, String str);

        void onNativeExpressAdLoad(List<TTNativeExpressAd> list);
    }

    public interface RewardVideoAdListener extends b {
        void onError(int i, String str);

        void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd);

        void onRewardVideoCached();
    }

    void loadAppOpenAd(AdSlot adSlot, AppOpenAdListener appOpenAdListener, int i);

    void loadBannerExpressAd(AdSlot adSlot, NativeExpressAdListener nativeExpressAdListener);

    void loadFeedAd(AdSlot adSlot, FeedAdListener feedAdListener);

    void loadFullScreenVideoAd(AdSlot adSlot, FullScreenVideoAdListener fullScreenVideoAdListener);

    @Deprecated
    void loadNativeAd(AdSlot adSlot, NativeAdListener nativeAdListener);

    void loadRewardVideoAd(AdSlot adSlot, RewardVideoAdListener rewardVideoAdListener);
}
