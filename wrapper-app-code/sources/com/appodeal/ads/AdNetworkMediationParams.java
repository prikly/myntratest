package com.appodeal.ads;

public interface AdNetworkMediationParams extends AppodealStateParams {
    @Deprecated
    String getAppName();

    String getImpressionId();

    @Deprecated
    String getStoreUrl();

    @Deprecated
    boolean isCoronaApp();
}
