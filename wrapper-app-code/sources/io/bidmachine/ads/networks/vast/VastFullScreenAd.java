package io.bidmachine.ads.networks.vast;

import android.content.Context;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VideoType;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.measurer.VastOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

class VastFullScreenAd extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private VastFullScreenAdLoadListener vastAdLoadListener;
    private VastFullScreenAdShowListener vastAdShowListener;
    private VastOMSDKAdMeasurer vastOMSDKAdMeasurer;
    private VastRequest vastRequest;
    private final VideoType videoType;

    VastFullScreenAd(VideoType videoType2) {
        this.videoType = videoType2;
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        VastParams vastParams = new VastParams(unifiedMediationParams);
        if (vastParams.isValid(unifiedFullscreenAdCallback)) {
            if (vastParams.omsdkEnabled) {
                this.vastOMSDKAdMeasurer = new VastOMSDKAdMeasurer();
            }
            this.vastAdLoadListener = new VastFullScreenAdLoadListener(unifiedFullscreenAdCallback, this.vastOMSDKAdMeasurer);
            VastRequest build = VastRequest.newBuilder().setCacheControl(vastParams.cacheControl).setPlaceholderTimeoutSec(vastParams.placeholderTimeoutSec).setVideoCloseTime(vastParams.skipOffset).setCompanionCloseTime(vastParams.companionSkipOffset).forceUseNativeCloseTime(vastParams.useNativeClose).build();
            this.vastRequest = build;
            build.loadVideoWithData(contextProvider.getApplicationContext(), vastParams.creativeAdm, this.vastAdLoadListener);
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        VastRequest vastRequest2 = this.vastRequest;
        if (vastRequest2 == null || !vastRequest2.canDisplay()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen object is null or can not find video file"));
            return;
        }
        this.vastAdShowListener = new VastFullScreenAdShowListener(unifiedFullscreenAdCallback, this.vastOMSDKAdMeasurer);
        VastRequest vastRequest3 = this.vastRequest;
        Context context = contextProvider.getContext();
        VideoType videoType2 = this.videoType;
        VastFullScreenAdShowListener vastFullScreenAdShowListener = this.vastAdShowListener;
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer2 = this.vastOMSDKAdMeasurer;
        vastRequest3.display(context, videoType2, vastFullScreenAdShowListener, vastOMSDKAdMeasurer2, vastOMSDKAdMeasurer2);
    }

    public void onDestroy() {
        this.vastAdLoadListener = null;
        this.vastAdShowListener = null;
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer2 = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer2 != null) {
            vastOMSDKAdMeasurer2.destroy();
            this.vastOMSDKAdMeasurer = null;
        }
        if (this.vastRequest != null) {
            this.vastRequest = null;
        }
    }
}
