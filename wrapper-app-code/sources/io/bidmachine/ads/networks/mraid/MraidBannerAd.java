package io.bidmachine.ads.networks.mraid;

import android.app.Activity;
import android.content.Context;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.mraid.MraidView;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;
import java.util.concurrent.atomic.AtomicBoolean;

class MraidBannerAd extends UnifiedBannerAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;
    MraidView mraidView;

    MraidBannerAd() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        String str;
        final MraidParams mraidParams = new MraidParams(unifiedMediationParams);
        if (mraidParams.isValid(unifiedBannerAdCallback)) {
            if (mraidParams.cacheControl == CacheControl.PartialLoad) {
                setConsiderNetworkImpressionTracking(true);
            }
            final Context applicationContext = contextProvider.getApplicationContext();
            if (mraidParams.omsdkEnabled) {
                MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = new MraidOMSDKAdMeasurer();
                this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer2;
                str = mraidOMSDKAdMeasurer2.injectMeasurerJS(mraidParams.creativeAdm);
            } else {
                str = mraidParams.creativeAdm;
            }
            final String str2 = str;
            final UnifiedBannerAdCallback unifiedBannerAdCallback2 = unifiedBannerAdCallback;
            Utils.onUiThread(new Runnable() {
                public void run() {
                    try {
                        MraidBannerAd.this.mraidView = new MraidView.Builder().setCacheControl(mraidParams.cacheControl).setPlaceholderTimeoutSec(mraidParams.placeholderTimeoutSec).setListener(new MraidBannerAdListener(unifiedBannerAdCallback2)).setAdMeasurer(MraidBannerAd.this.mraidOMSDKAdMeasurer).build(applicationContext);
                        MraidBannerAd.this.mraidView.load(str2);
                    } catch (Throwable th) {
                        Logger.log(th);
                        unifiedBannerAdCallback2.onAdLoadFailed(BMError.internal("Exception when loading banner object"));
                    }
                }
            });
        }
    }

    public void prepareToShow() throws Throwable {
        MraidView mraidView2;
        super.prepareToShow();
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && (mraidView2 = this.mraidView) != null) {
            mraidView2.show((Activity) null);
        }
    }

    public void onShown() {
        super.onShown();
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.onAdShown();
        }
    }

    public void onDestroy() {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.destroy(new Runnable() {
                public void run() {
                    MraidBannerAd.this.destroyMraidView();
                }
            });
            this.mraidOMSDKAdMeasurer = null;
            return;
        }
        destroyMraidView();
    }

    /* access modifiers changed from: private */
    public void destroyMraidView() {
        MraidView mraidView2 = this.mraidView;
        if (mraidView2 != null) {
            mraidView2.destroy();
            this.mraidView = null;
        }
    }
}
