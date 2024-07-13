package com.appodeal.ads.unified.tasks;

import com.appodeal.ads.utils.ExchangeAd;

final class NastParamsResolver implements AdParamsResolver<ExchangeAd, String> {
    public void processResponse(ExchangeAd exchangeAd, AdParamsResolverCallback<String> adParamsResolverCallback) {
        adParamsResolverCallback.onResolve(exchangeAd.getAdm());
    }
}
