package io.bidmachine.ads.networks.vast;

import com.explorestack.iab.CacheControl;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastView;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedRichMediaAd;
import java.util.concurrent.atomic.AtomicBoolean;

class VastRichMediaAd extends UnifiedRichMediaAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);
    private VastRichMediaAdLoadListener loadListener;
    private VastRichMediaAdShowListener showListener;
    VastRequest vastRequest;
    VastView vastView;

    VastRichMediaAd() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        VastParams vastParams = new VastParams(unifiedMediationParams);
        if (vastParams.isValid(unifiedBannerAdCallback)) {
            if (vastParams.cacheControl == CacheControl.PartialLoad) {
                setConsiderNetworkImpressionTracking(true);
            }
            this.showListener = new VastRichMediaAdShowListener(unifiedBannerAdCallback);
            VastView vastView2 = new VastView(contextProvider.getContext());
            this.vastView = vastView2;
            vastView2.setListener(this.showListener);
            this.loadListener = new VastRichMediaAdLoadListener(unifiedBannerAdCallback, this.vastView);
            VastRequest build = VastRequest.newBuilder().setCacheControl(vastParams.cacheControl).setPlaceholderTimeoutSec(vastParams.placeholderTimeoutSec).setVideoCloseTime(vastParams.skipOffset).setCompanionCloseTime(vastParams.companionSkipOffset).forceUseNativeCloseTime(vastParams.useNativeClose).build();
            this.vastRequest = build;
            build.loadVideoWithData(contextProvider.getContext(), vastParams.creativeAdm, this.loadListener);
        }
    }

    public void prepareToShow() throws Throwable {
        VastView vastView2;
        super.prepareToShow();
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && this.vastRequest != null && (vastView2 = this.vastView) != null) {
            vastView2.setCanAutoResume(false);
            this.vastView.setCanIgnorePostBanner(true);
            this.vastView.onWindowFocusChanged(true);
            this.vastRequest.display(this.vastView);
        }
    }

    public void onResume() throws Throwable {
        super.onResume();
        VastView vastView2 = this.vastView;
        if (vastView2 != null) {
            vastView2.resume();
        }
    }

    public void onPause() throws Throwable {
        super.onPause();
        VastView vastView2 = this.vastView;
        if (vastView2 != null) {
            vastView2.pause();
        }
    }

    public void onMute() throws Throwable {
        super.onMute();
        VastView vastView2 = this.vastView;
        if (vastView2 != null) {
            vastView2.mute();
        }
    }

    public void onUnMute() throws Throwable {
        super.onUnMute();
        VastView vastView2 = this.vastView;
        if (vastView2 != null) {
            vastView2.unmute();
        }
    }

    public void onDestroy() {
        this.loadListener = null;
        this.vastRequest = null;
        this.showListener = null;
        VastView vastView2 = this.vastView;
        if (vastView2 != null) {
            vastView2.destroy();
            this.vastView = null;
        }
    }
}
