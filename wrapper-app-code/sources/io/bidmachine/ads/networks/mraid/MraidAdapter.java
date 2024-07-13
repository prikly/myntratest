package io.bidmachine.ads.networks.mraid;

import com.explorestack.iab.bridge.JsBridgeHandler;
import com.explorestack.iab.bridge.NativeStorageJsBridge;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.mraid.MraidType;
import com.explorestack.iab.utils.Logger;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;

public class MraidAdapter extends NetworkAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.3.0";
    public static final String ADAPTER_VERSION_NAME = "2.1.5.1";
    public static final String KEY = "mraid";

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return false;
    }

    public MraidAdapter() {
        super("mraid", "1.3.0", "2.1.5.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public void setLogging(boolean z) throws Throwable {
        MraidLog.setLoggingLevel(z ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        JsBridgeHandler.addBridge(new NativeStorageJsBridge());
        OMSDKSettings.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    public UnifiedBannerAd createBanner() {
        return new MraidBannerAd();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new MraidFullScreenAd(MraidType.Static);
    }

    public UnifiedFullscreenAd createRewarded() {
        return new MraidFullScreenAd(MraidType.Rewarded);
    }
}
