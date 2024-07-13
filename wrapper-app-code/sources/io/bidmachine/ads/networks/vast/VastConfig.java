package io.bidmachine.ads.networks.vast;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

public class VastConfig extends NetworkConfig {
    public VastConfig() {
        super("vast", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}
