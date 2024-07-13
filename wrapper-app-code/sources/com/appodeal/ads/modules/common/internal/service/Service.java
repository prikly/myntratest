package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0012H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/Service;", "Options", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "", "info", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "getInfo", "()Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "initialize", "Lkotlin/Result;", "", "options", "initialize-gIAlu-s", "(Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEvent", "eventName", "", "params", "", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Service<Options extends ServiceOptions> {
    ServiceInfo getInfo();

    /* renamed from: initialize-gIAlu-s  reason: not valid java name */
    Object m143initializegIAlus(Options options, Continuation<? super Result<Unit>> continuation);

    void logEvent(String str, Map<String, ? extends Object> map);
}
