package io.bidmachine.unified;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UnifiedAd<UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    private final AtomicBoolean considerNetworkImpressionTracking = new AtomicBoolean(false);

    public abstract void load(ContextProvider contextProvider, UnifiedAdCallbackType unifiedadcallbacktype, UnifiedAdRequestParamsType unifiedadrequestparamstype, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable;

    public void onClicked() {
    }

    public void onDestroy() {
    }

    public void onExpired() {
    }

    public void onImpression() {
    }

    public void onShowFailed() {
    }

    public void onShown() {
    }

    public boolean isConsiderNetworkImpressionTracking() {
        return this.considerNetworkImpressionTracking.get();
    }

    /* access modifiers changed from: protected */
    public final void setConsiderNetworkImpressionTracking(boolean z) {
        this.considerNetworkImpressionTracking.set(z);
    }
}
