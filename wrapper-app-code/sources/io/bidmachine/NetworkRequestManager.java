package io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;

class NetworkRequestManager {
    private static volatile NetworkRequestManager instance;
    private final Object lock = new Object();
    final Map<String, NetworkRequest<?, Response, BMError>> networkRequestMap = new HashMap();

    NetworkRequestManager() {
    }

    public static NetworkRequestManager get() {
        NetworkRequestManager networkRequestManager = instance;
        if (networkRequestManager == null) {
            synchronized (NetworkRequestManager.class) {
                networkRequestManager = instance;
                if (networkRequestManager == null) {
                    networkRequestManager = new NetworkRequestManager();
                    instance = networkRequestManager;
                }
            }
        }
        return networkRequestManager;
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.lock) {
            containsKey = this.networkRequestMap.containsKey(str);
        }
        return containsKey;
    }

    public void add(String str, NetworkRequest<?, Response, BMError> networkRequest) {
        synchronized (this.lock) {
            this.networkRequestMap.put(str, networkRequest);
        }
    }

    public NetworkRequest<?, Response, BMError> remove(String str) {
        NetworkRequest<?, Response, BMError> remove;
        synchronized (this.lock) {
            remove = this.networkRequestMap.remove(str);
        }
        return remove;
    }
}
