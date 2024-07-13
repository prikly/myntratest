package io.bidmachine.ads.networks.nast;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

public class NastConfig extends NetworkConfig {
    public NastConfig() {
        super("nast", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}
