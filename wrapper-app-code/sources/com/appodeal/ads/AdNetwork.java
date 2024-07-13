package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;

public abstract class AdNetwork<NetworkRequestParams> {
    private final ActivityRule[] adActivityRules;
    private final String adapterVersion;
    private boolean isInterstitialShowing = false;
    private boolean isRewardedShowing = false;
    private boolean isVideoShowing = false;
    private final String name;

    public AdNetwork(AdNetworkBuilder adNetworkBuilder) {
        this.name = adNetworkBuilder.getName();
        this.adapterVersion = adNetworkBuilder.getAdapterVersion();
        this.adActivityRules = adNetworkBuilder.getAdActivityRules();
    }

    public boolean canLoadInterstitialWhenDisplaying() {
        return true;
    }

    public boolean canLoadRewardedWhenDisplaying() {
        return true;
    }

    public boolean canLoadVideoWhenDisplaying() {
        return true;
    }

    public UnifiedBanner<NetworkRequestParams> createBanner() {
        return null;
    }

    public UnifiedInterstitial<NetworkRequestParams> createInterstitial() {
        return null;
    }

    public UnifiedMrec<NetworkRequestParams> createMrec() {
        return null;
    }

    public UnifiedNative<NetworkRequestParams> createNativeAd() {
        return null;
    }

    public UnifiedRewarded<NetworkRequestParams> createRewarded() {
        return null;
    }

    public UnifiedVideo<NetworkRequestParams> createVideo() {
        return null;
    }

    public final ActivityRule[] getAdActivityRules() {
        return this.adActivityRules;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public UnifiedAppStateChangeListener getAppStateChangeListener() {
        return null;
    }

    public final String getName() {
        return this.name;
    }

    public String getRecommendedVersion() {
        return null;
    }

    public abstract String getVersion();

    public abstract void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<NetworkRequestParams> networkInitializationListener);

    public final boolean isInterstitialShowing() {
        return this.isInterstitialShowing;
    }

    public final boolean isRewardedShowing() {
        return this.isRewardedShowing;
    }

    public boolean isSupportSmartBanners() {
        return false;
    }

    public final boolean isVideoShowing() {
        return this.isVideoShowing;
    }

    public final void setInterstitialShowing(boolean z) {
        if (!canLoadInterstitialWhenDisplaying()) {
            this.isInterstitialShowing = z;
        }
    }

    public void setLogging(boolean z) {
    }

    public final void setRewardedShowing(boolean z) {
        if (!canLoadRewardedWhenDisplaying()) {
            this.isRewardedShowing = z;
        }
    }

    public final void setVideoShowing(boolean z) {
        if (!canLoadVideoWhenDisplaying()) {
            this.isVideoShowing = z;
        }
    }

    public LoadingError verifyLoadAvailability(AdType adType) {
        return null;
    }
}
