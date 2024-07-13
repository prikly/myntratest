package com.appodeal.ads.adapters.nast;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.nast.native_ad.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedNative;

public class NASTNetwork extends AdNetwork<RequestParams> {

    public static final class RequestParams {
        public final RestrictedData restrictedData;
        public final String url;

        private RequestParams(String str, RestrictedData restrictedData2) {
            this.url = str;
            this.restrictedData = restrictedData2;
        }
    }

    public static class builder extends AdNetworkBuilder {
        public NASTNetwork build() {
            return new NASTNetwork(this);
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "nast";
        }
    }

    public NASTNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public UnifiedNative<RequestParams> createNativeAd() {
        return new b();
    }

    public String getVersion() {
        return "1.4.1";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        String string = adUnit.getJsonData().getString("url");
        if (adUnit.getJsonData().optBoolean("top")) {
            string = UnifiedAdUtils.parseUrlWithTopParams(contextProvider.getApplicationContext(), string, adNetworkMediationParams);
        }
        networkInitializationListener.onInitializationFinished(new RequestParams(string, adNetworkMediationParams.getRestrictedData()));
    }
}
