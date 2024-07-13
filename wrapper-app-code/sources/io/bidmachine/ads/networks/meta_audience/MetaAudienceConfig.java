package io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

public class MetaAudienceConfig extends NetworkConfig {
    static final String KEY_APP_ID = "app_id";
    static final String KEY_BID_PAYLOAD = "bid_payload";
    static final String KEY_PLACEMENT_ID = "meta_key";
    static final String KEY_TOKEN = "token";

    public MetaAudienceConfig(final String str) {
        this((Map<String, String>) new HashMap<String, String>() {
            {
                put("app_id", str);
            }
        });
    }

    public MetaAudienceConfig(Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new MetaAudienceAdapter();
    }

    public MetaAudienceConfig withMediationConfig(AdsFormat adsFormat, String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public MetaAudienceConfig withMediationConfig(AdsFormat adsFormat, final String str, final String str2) {
        return (MetaAudienceConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(MetaAudienceConfig.KEY_PLACEMENT_ID, str);
                if (!TextUtils.isEmpty(str2)) {
                    put("app_id", str2);
                }
            }
        });
    }
}
