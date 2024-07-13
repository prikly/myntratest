package io.bidmachine.ads.networks.amazon;

import android.text.TextUtils;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

public class AmazonConfig extends NetworkConfig {
    static final String APP_KEY = "app_key";
    static final String SLOT_UUID = "slot_uuid";

    public AmazonConfig(final String str) {
        this((Map<String, String>) new HashMap<String, String>() {
            {
                put(AmazonConfig.APP_KEY, str);
            }
        });
    }

    public AmazonConfig(Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new AmazonAdapter();
    }

    public AmazonConfig withMediationConfig(AdsFormat adsFormat, String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public AmazonConfig withMediationConfig(AdsFormat adsFormat, final String str, final String str2) {
        return (AmazonConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(AmazonConfig.SLOT_UUID, str);
                if (!TextUtils.isEmpty(str2)) {
                    put(AmazonConfig.APP_KEY, str2);
                }
            }
        });
    }
}
