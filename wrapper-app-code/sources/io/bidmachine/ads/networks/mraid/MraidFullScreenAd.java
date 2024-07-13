package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidType;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class MraidFullScreenAd extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public MraidInterstitial mraidInterstitial;
    /* access modifiers changed from: private */
    public MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;
    private final MraidType mraidType;

    MraidFullScreenAd(MraidType mraidType2) {
        this.mraidType = mraidType2;
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        String str;
        final MraidParams mraidParams = new MraidParams(unifiedMediationParams);
        if (mraidParams.isValid(unifiedFullscreenAdCallback)) {
            final Context applicationContext = contextProvider.getApplicationContext();
            if (mraidParams.omsdkEnabled) {
                MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = new MraidOMSDKAdMeasurer();
                this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer2;
                str = mraidOMSDKAdMeasurer2.injectMeasurerJS(mraidParams.creativeAdm);
            } else {
                str = mraidParams.creativeAdm;
            }
            final String str2 = str;
            final UnifiedFullscreenAdCallback unifiedFullscreenAdCallback2 = unifiedFullscreenAdCallback;
            Utils.onUiThread(new Runnable() {
                public void run() {
                    try {
                        MraidInterstitial unused = MraidFullScreenAd.this.mraidInterstitial = MraidInterstitial.newBuilder().setCacheControl(mraidParams.cacheControl).setPlaceholderTimeoutSec(mraidParams.placeholderTimeoutSec).setCloseTime((float) mraidParams.skipOffset).forceUseNativeCloseButton(mraidParams.useNativeClose).setListener(new MraidFullScreenAdListener(applicationContext, unifiedFullscreenAdCallback2, MraidFullScreenAd.this.mraidOMSDKAdMeasurer)).setR1(mraidParams.r1).setR2(mraidParams.r2).setDurationSec((float) mraidParams.progressDuration).setProductLink(mraidParams.storeUrl).setCloseStyle(mraidParams.closeableViewStyle).setCountDownStyle(mraidParams.countDownStyle).setProgressStyle(mraidParams.progressStyle).setAdMeasurer(MraidFullScreenAd.this.mraidOMSDKAdMeasurer).build(applicationContext);
                        MraidFullScreenAd.this.mraidInterstitial.load(str2);
                    } catch (Throwable th) {
                        Logger.log(th);
                        unifiedFullscreenAdCallback2.onAdLoadFailed(BMError.internal("Exception when loading fullscreen object"));
                    }
                }
            });
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        MraidInterstitial mraidInterstitial2 = this.mraidInterstitial;
        if (mraidInterstitial2 == null || !mraidInterstitial2.isReady()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen object is null or not ready"));
        } else {
            this.mraidInterstitial.show(contextProvider.getContext(), this.mraidType);
        }
    }

    public void onDestroy() {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.destroy(new Runnable() {
                public void run() {
                    MraidFullScreenAd.this.destroyMraidInterstitial();
                }
            });
            this.mraidOMSDKAdMeasurer = null;
            return;
        }
        destroyMraidInterstitial();
    }

    /* access modifiers changed from: private */
    public void destroyMraidInterstitial() {
        MraidInterstitial mraidInterstitial2 = this.mraidInterstitial;
        if (mraidInterstitial2 != null) {
            mraidInterstitial2.destroy();
            this.mraidInterstitial = null;
        }
    }
}
