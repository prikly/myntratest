package com.appodeal.ads.services;

import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.q4;
import com.appodeal.ads.revenue.RevenueInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

public interface c {

    public interface a {
        Object a(List<? extends Service<? extends ServiceOptions>> list, Continuation<? super Unit> continuation);
    }

    Object a(InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, q4.h.a aVar, Continuation continuation);

    Object a(RevenueInfo revenueInfo, Continuation<? super Unit> continuation);

    Object a(String str, Map<String, ? extends Object> map, Continuation<? super Unit> continuation);

    ArrayList getServicesData();
}
