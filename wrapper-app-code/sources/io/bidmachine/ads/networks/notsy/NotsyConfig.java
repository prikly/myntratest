package io.bidmachine.ads.networks.notsy;

import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

public class NotsyConfig extends NetworkConfig {
    static final String KEY_AD_UNIT_ID = "ad_unit_id";
    static final String KEY_PRICE = "price";
    static final String KEY_SCORE = "score";

    public NotsyConfig() {
        this((Map<String, String>) null);
    }

    public NotsyConfig(Map<String, String> map) {
        super("notsy", map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new NotsyAdapter();
    }

    public NotsyConfig withMediationConfig(AdsFormat adsFormat, String str, String str2, String str3) {
        return withMediationConfig(adsFormat, str, str2, str3, (Map<String, String>) null);
    }

    public NotsyConfig withMediationConfig(AdsFormat adsFormat, String str, String str2, String str3, Map<String, String> map) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final Map<String, String> map2 = map;
        return (NotsyConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(NotsyConfig.KEY_AD_UNIT_ID, str4);
                put(NotsyConfig.KEY_SCORE, str5);
                put("price", str6);
                Map map = map2;
                if (map != null) {
                    putAll(map);
                }
            }
        });
    }
}
