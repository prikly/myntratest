package io.bidmachine.ads.networks.criteo;

import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.Orientation;
import java.util.HashMap;
import java.util.Map;

public class CriteoConfig extends NetworkConfig {
    static final String AD_UNIT_ID = "ad_unit_id";
    static final String PRICE = "price";
    static final String PUBLISHER_ID = "publisher_id";

    public CriteoConfig(final String str) {
        this((Map<String, String>) new HashMap<String, String>() {
            {
                put(CriteoConfig.PUBLISHER_ID, str);
            }
        });
    }

    public CriteoConfig(Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new CriteoAdapter();
    }

    public CriteoConfig withMediationConfig(AdsFormat adsFormat, String str) {
        return withMediationConfig(adsFormat, str, (Orientation) null);
    }

    public CriteoConfig withMediationConfig(AdsFormat adsFormat, final String str, Orientation orientation) {
        return (CriteoConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(CriteoConfig.AD_UNIT_ID, str);
            }
        }, orientation);
    }
}
