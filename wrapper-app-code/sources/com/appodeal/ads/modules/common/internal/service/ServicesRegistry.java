package com.appodeal.ads.modules.common.internal.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J2\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServicesRegistry;", "", "getAvailableServicesInfo", "", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "initialize", "Lkotlin/Result;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "serviceOptions", "initialize-gIAlu-s", "(Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ServicesRegistry {
    List<ServiceInfo> getAvailableServicesInfo();

    /* renamed from: initialize-gIAlu-s  reason: not valid java name */
    Object m144initializegIAlus(ServiceOptions serviceOptions, Continuation<? super Result<? extends Service<? extends ServiceOptions>>> continuation);
}
