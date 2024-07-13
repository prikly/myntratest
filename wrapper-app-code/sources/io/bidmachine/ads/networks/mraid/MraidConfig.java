package io.bidmachine.ads.networks.mraid;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

public class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super("mraid", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}
