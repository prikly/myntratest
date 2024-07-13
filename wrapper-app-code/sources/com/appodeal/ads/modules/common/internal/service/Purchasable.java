package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.inapp.InAppPurchase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/Purchasable;", "", "validatePurchase", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult;", "purchase", "Lcom/appodeal/ads/inapp/InAppPurchase;", "(Lcom/appodeal/ads/inapp/InAppPurchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Purchasable {
    Object validatePurchase(InAppPurchase inAppPurchase, Continuation<? super InAppPurchaseValidationResult> continuation);
}
