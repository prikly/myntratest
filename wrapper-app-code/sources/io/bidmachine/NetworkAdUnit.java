package io.bidmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class NetworkAdUnit {
    private final String id;
    private final Map<String, String> mediationConfig;
    private final NetworkAdapter networkAdapter;

    public NetworkAdUnit(NetworkAdapter networkAdapter2) {
        this(networkAdapter2, new HashMap());
    }

    public NetworkAdUnit(NetworkAdapter networkAdapter2, Map<String, String> map) {
        this.id = UUID.randomUUID().toString();
        this.networkAdapter = networkAdapter2;
        this.mediationConfig = map;
    }

    public String getId() {
        return this.id;
    }

    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    public String getMediationParameter(String str) {
        return this.mediationConfig.get(str);
    }
}
