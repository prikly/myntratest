package io.bidmachine;

import android.content.Context;
import io.bidmachine.AdRequest;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;

public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends AdObjectParams, UnifiedAdType extends UnifiedAd<UnifiedAdCallbackType, UnifiedAdRequestParamsType>, UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> implements AdObject<AdObjectParamsType, UnifiedAdRequestParamsType, UnifiedAdCallbackType> {
    private final AdObjectParamsType adObjectParams;
    private final AdRequestType adRequest;
    private final ContextProvider contextProvider;
    private final AdProcessCallback processCallback;
    private final UnifiedAdType unifiedAd;
    private final UnifiedAdCallbackType unifiedAdCallback;

    public void hide() {
    }

    public AdObjectImpl(ContextProvider contextProvider2, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, AdObjectParamsType adobjectparamstype, UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider2;
        this.processCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = createUnifiedCallback(adProcessCallback);
    }

    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    public Context getContext() {
        return this.contextProvider.getContext();
    }

    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    public AdProcessCallback getProcessCallback() {
        return this.processCallback;
    }

    public void load(ContextProvider contextProvider2, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.load(contextProvider2, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.toMediationParams(), networkAdUnit);
    }

    public void onShown() {
        getUnifiedAd().onShown();
    }

    public void onShowFailed() {
        getUnifiedAd().onShowFailed();
    }

    public void onImpression() {
        getUnifiedAd().onImpression();
    }

    public void onClicked() {
        getUnifiedAd().onClicked();
    }

    public void onFinished() {
        UnifiedAd unifiedAd2 = getUnifiedAd();
        if (unifiedAd2 instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd2).onFinished();
        }
    }

    public void onClosed(boolean z) {
        UnifiedAd unifiedAd2 = getUnifiedAd();
        if (unifiedAd2 instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd2).onClosed(z);
        }
    }

    public void onExpired() {
        getUnifiedAd().onExpired();
    }

    public void onDestroy() {
        getUnifiedAd().onDestroy();
    }

    protected static class BaseUnifiedAdCallback implements UnifiedAdCallback {
        protected final AdProcessCallback processCallback;

        public BaseUnifiedAdCallback(AdProcessCallback adProcessCallback) {
            this.processCallback = adProcessCallback;
        }

        public void onAdLoadFailed(BMError bMError) {
            this.processCallback.processLoadFail(bMError);
        }

        public void onAdClicked() {
            this.processCallback.processClicked();
        }

        public void onAdShown() {
            this.processCallback.processShown();
        }

        public void onAdShowFailed(BMError bMError) {
            this.processCallback.processShowFail(bMError);
        }

        public void onAdExpired() {
            this.processCallback.processExpired();
        }
    }
}
