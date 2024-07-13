package com.appodeal.ads.adapters.a4g;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.adapters.admob.AdmobNetwork;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;

public class A4GNetwork extends AdmobNetwork {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public A4GNetwork build() {
            return new A4GNetwork(this);
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.A4G;
        }
    }

    public A4GNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }
}
