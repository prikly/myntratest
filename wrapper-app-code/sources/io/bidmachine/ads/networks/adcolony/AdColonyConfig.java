package io.bidmachine.ads.networks.adcolony;

import android.text.TextUtils;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

public class AdColonyConfig extends NetworkConfig {
    private static final String DEFAULT_STORE_ID = "google";
    static final String KEY_ADM = "adm";
    static final String KEY_APP_ID = "app_id";
    static final String KEY_STORE_ID = "store_id";
    static final String KEY_TOKEN = "data";
    static final String KEY_ZONE_ID = "zone_id";

    public AdColonyConfig(String str) {
        this(str, DEFAULT_STORE_ID);
    }

    public AdColonyConfig(final String str, final String str2) {
        this((Map<String, String>) new HashMap<String, String>() {
            {
                put("app_id", str);
                put("store_id", str2);
            }
        });
    }

    public AdColonyConfig(Map<String, String> map) {
        super("adcolony", map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new AdColonyAdapter();
    }

    public AdColonyConfig withMediationConfig(AdsFormat adsFormat, String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public AdColonyConfig withMediationConfig(AdsFormat adsFormat, String str, String str2) {
        return withMediationConfig(adsFormat, str, str2, (String) null);
    }

    public AdColonyConfig withMediationConfig(AdsFormat adsFormat, final String str, final String str2, final String str3) {
        return (AdColonyConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(AdColonyConfig.KEY_ZONE_ID, str);
                if (!TextUtils.isEmpty(str2)) {
                    put("app_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    put("store_id", str3);
                }
            }
        });
    }
}
