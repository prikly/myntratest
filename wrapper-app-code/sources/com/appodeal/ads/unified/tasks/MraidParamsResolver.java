package com.appodeal.ads.unified.tasks;

import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.utils.ExchangeAd;

final class MraidParamsResolver implements AdParamsResolver<ExchangeAd, UnifiedMraidNetworkParams> {
    private final UnifiedMraidNetworkParams inputParams;

    public MraidParamsResolver(UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        this.inputParams = unifiedMraidNetworkParams;
    }

    public void processResponse(ExchangeAd exchangeAd, AdParamsResolverCallback<UnifiedMraidNetworkParams> adParamsResolverCallback) {
        UnifiedMraidNetworkParams.Builder adm = new UnifiedMraidNetworkParams.Builder(this.inputParams).setAdm(exchangeAd.getAdm());
        if (exchangeAd.getWidth() > 0) {
            adm.setWidth(exchangeAd.getWidth());
        }
        if (exchangeAd.getHeight() > 0) {
            adm.setHeight(exchangeAd.getHeight());
        }
        if (exchangeAd.getCloseTime() > 0) {
            adm.setCloseTime(exchangeAd.getCloseTime());
        }
        adParamsResolverCallback.onResolve(adm.build());
    }
}
