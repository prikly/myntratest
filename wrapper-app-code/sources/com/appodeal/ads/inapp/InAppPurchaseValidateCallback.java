package com.appodeal.ads.inapp;

import com.appodeal.ads.service.ServiceError;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H'¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchaseValidateCallback;", "", "onInAppPurchaseValidateFail", "", "purchase", "Lcom/appodeal/ads/inapp/InAppPurchase;", "errors", "", "Lcom/appodeal/ads/service/ServiceError;", "onInAppPurchaseValidateSuccess", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface InAppPurchaseValidateCallback {
    void onInAppPurchaseValidateFail(InAppPurchase inAppPurchase, List<ServiceError> list);

    void onInAppPurchaseValidateSuccess(InAppPurchase inAppPurchase, List<ServiceError> list);
}
