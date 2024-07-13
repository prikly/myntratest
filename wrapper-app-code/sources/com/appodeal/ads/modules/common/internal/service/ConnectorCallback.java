package com.appodeal.ads.modules.common.internal.service;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "", "getPartnerParams", "", "", "onServiceDataUpdated", "", "serviceData", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ConnectorCallback {
    Map<String, String> getPartnerParams();

    void onServiceDataUpdated(ServiceData serviceData);
}
