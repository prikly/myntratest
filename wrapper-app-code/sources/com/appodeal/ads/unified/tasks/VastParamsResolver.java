package com.appodeal.ads.unified.tasks;

import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;
import com.appodeal.ads.utils.ExchangeAd;

final class VastParamsResolver implements AdParamsResolver<ExchangeAd, UnifiedVastNetworkParams> {
    private final UnifiedVastNetworkParams inputParams;

    public VastParamsResolver(UnifiedVastNetworkParams unifiedVastNetworkParams) {
        this.inputParams = unifiedVastNetworkParams;
    }

    public void processResponse(ExchangeAd exchangeAd, AdParamsResolverCallback<UnifiedVastNetworkParams> adParamsResolverCallback) {
        UnifiedVastNetworkParams.Builder adm = new UnifiedVastNetworkParams.Builder(this.inputParams).setAdm(exchangeAd.getAdm());
        if (exchangeAd.getCloseTime() > 0) {
            adm.setCloseTime(exchangeAd.getCloseTime());
        }
        adParamsResolverCallback.onResolve(adm.build());
    }
}
