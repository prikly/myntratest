package com.appodeal.ads.unified.tasks;

import android.text.TextUtils;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.q4;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.utils.ExchangeAd;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

final class ExchangeAdResponseProcessor implements AdResponseProcessor<ExchangeAd> {
    public void processResponse(URLConnection uRLConnection, String str, AdParamsProcessorCallback<ExchangeAd> adParamsProcessorCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.getTrimmedLength(str) == 0) {
            adParamsProcessorCallback.onProcessFail(LoadingError.NoFill);
            return;
        }
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        q4 q4Var = q4.f17047a;
        adParamsProcessorCallback.onProcessSuccess(new ExchangeAd(str, headerFields, n.c().f17272a));
    }
}
