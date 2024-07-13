package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.utils.BMError;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

public class NetworkRegistry {
    static final Map<String, NetworkConfig> CACHED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    private static final AtomicBoolean IS_NETWORKS_INITIALIZED = new AtomicBoolean(false);
    static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    interface NetworksInitializeCallback {
        void onExecuted();
    }

    public static NetworkAdapter obtainAdapter(NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            String networkKey = networkConfig.getNetworkKey();
            NetworkAdapter adapter = getAdapter(networkKey);
            if (adapter != null) {
                return adapter;
            }
            NetworkAdapter createNetworkAdapter = networkConfig.createNetworkAdapter();
            NETWORK_ADAPTER_MAP.put(networkKey, createNetworkAdapter);
            return createNetworkAdapter;
        }
    }

    public static NetworkAdapter getAdapter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    static NetworkConfig getConfig(String str) {
        if (str == null) {
            return null;
        }
        return CACHED_NETWORK_CONFIG_MAP.get(str);
    }

    static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    static boolean isNetworkRegistered(String str) {
        return getAdapter(str) != null;
    }

    static String checkAndPutNetwork(Context context, AdsType adsType, NetworkConfig networkConfig, Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    static void registerNetworks(NetworkConfig... networkConfigArr) {
        if (networkConfigArr != null && networkConfigArr.length > 0) {
            for (NetworkConfig registerNetwork : networkConfigArr) {
                registerNetwork(registerNetwork);
            }
        }
    }

    static void registerNetworks(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    NetworkConfig create = NetworkConfigFactory.create(context, jSONArray.getJSONObject(i));
                    if (create != null) {
                        registerNetwork(create);
                    }
                }
            } catch (JSONException e2) {
                Logger.log((Throwable) e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = io.bidmachine.BidMachineImpl.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void registerNetwork(io.bidmachine.NetworkConfig r4) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r4.getNetworkKey()
            boolean r0 = isNetworkRegistered(r0)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            obtainAdapter(r4)
            java.util.Map<java.lang.String, io.bidmachine.NetworkConfig> r0 = PENDING_NETWORK_CONFIG_MAP
            java.lang.String r1 = r4.getNetworkKey()
            r0.put(r1, r4)
            boolean r0 = isNetworksInitialized()
            if (r0 == 0) goto L_0x0041
            io.bidmachine.BidMachineImpl r0 = io.bidmachine.BidMachineImpl.get()
            android.content.Context r1 = r0.getAppContext()
            if (r1 != 0) goto L_0x002b
            return
        L_0x002b:
            io.bidmachine.SimpleContextProvider r2 = new io.bidmachine.SimpleContextProvider
            r2.<init>(r1)
            io.bidmachine.InitializationParamsImpl r1 = new io.bidmachine.InitializationParamsImpl
            io.bidmachine.TargetingParams r3 = r0.getTargetingParams()
            io.bidmachine.UserRestrictionParams r0 = r0.getUserRestrictionParams()
            r1.<init>(r3, r0)
            r0 = 0
            initializeNetwork(r2, r1, r4, r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.NetworkRegistry.registerNetwork(io.bidmachine.NetworkConfig):void");
    }

    static void registerInitNetwork(Context context, AdNetwork adNetwork) {
        NetworkConfig create;
        if (!isNetworkRegistered(adNetwork.getName()) && (create = NetworkConfigFactory.create(context, adNetwork)) != null) {
            FROM_INIT_NETWORK_CONFIG_MAP.put(create.getNetworkKey(), create);
            registerNetwork(create);
        }
    }

    static boolean isNetworksInitialized() {
        return IS_NETWORKS_INITIALIZED.get();
    }

    static void initializeNetworks(final Context context, final NetworksInitializeCallback networksInitializeCallback) {
        if (!IS_NETWORKS_INITIALIZED.get()) {
            IS_NETWORKS_INITIALIZED.set(true);
            new Thread() {
                public void run() {
                    super.run();
                    BidMachineImpl bidMachineImpl = BidMachineImpl.get();
                    NetworkRegistry.initializeNetworks(new SimpleContextProvider(context), new InitializationParamsImpl(bidMachineImpl.getTargetingParams(), bidMachineImpl.getUserRestrictionParams()), NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.values(), networksInitializeCallback);
                }
            }.start();
        }
    }

    /* access modifiers changed from: private */
    public static void initializeNetworks(ContextProvider contextProvider, InitializationParams initializationParams, Collection<NetworkConfig> collection, NetworksInitializeCallback networksInitializeCallback) {
        if (collection.size() > 0) {
            final CountDownLatch countDownLatch = new CountDownLatch(collection.size());
            for (NetworkConfig initializeNetwork : collection) {
                initializeNetwork(contextProvider, initializationParams, initializeNetwork, new NetworksInitializeCallback() {
                    public void onExecuted() {
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                Logger.log((Throwable) e2);
            }
        }
        if (networksInitializeCallback != null) {
            networksInitializeCallback.onExecuted();
        }
    }

    private static void initializeNetwork(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, NetworksInitializeCallback networksInitializeCallback) {
        new NetworkLoadTask(contextProvider, initializationParams, networkConfig, networksInitializeCallback).execute();
    }

    static void setLoggingEnabled(boolean z) {
        for (Map.Entry value : NETWORK_ADAPTER_MAP.entrySet()) {
            try {
                ((NetworkAdapter) value.getValue()).setLogging(z);
            } catch (Throwable th) {
                Logger.log(th);
            }
        }
    }

    static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        CACHED_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        IS_NETWORKS_INITIALIZED.set(false);
        NetworkLoadTask.networkLoadTaskList.clear();
    }

    static final class NetworkLoadTask implements Runnable {
        private static final Executor executor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
        static final List<NetworkLoadTask> networkLoadTaskList = new CopyOnWriteArrayList();
        private final NetworksInitializeCallback callback;
        private final ContextProvider contextProvider;
        private final InitializationParams initializationParams;
        private final NetworkConfig networkConfig;
        private final String networkKey;
        private final TrackingObject trackingObject;

        private NetworkLoadTask(ContextProvider contextProvider2, InitializationParams initializationParams2, NetworkConfig networkConfig2, NetworksInitializeCallback networksInitializeCallback) {
            this.contextProvider = contextProvider2;
            this.initializationParams = initializationParams2;
            this.networkConfig = networkConfig2;
            this.callback = networksInitializeCallback;
            String networkKey2 = networkConfig2.getNetworkKey();
            this.networkKey = networkKey2;
            this.trackingObject = new SimpleTrackingObject(String.format("%s_initialize", new Object[]{networkKey2}));
        }

        public void run() {
            Logger.log(this.networkKey, "Initialization started");
            try {
                BidMachineEvents.eventStart(this.trackingObject, TrackEventType.HeaderBiddingNetworkInitialize, new TrackEventInfo().withParameter("HB_NETWORK", this.networkKey));
                NetworkAdapter obtainAdapter = NetworkRegistry.obtainAdapter(this.networkConfig);
                obtainAdapter.setLogging(Logger.isLoggingEnabled());
                obtainAdapter.initialize(this.contextProvider, this.initializationParams, this.networkConfig.getNetworkConfigParams(), new InitializationCallback(this));
                if (!NetworkRegistry.CACHED_NETWORK_CONFIG_MAP.containsKey(this.networkKey)) {
                    NetworkRegistry.CACHED_NETWORK_CONFIG_MAP.put(this.networkKey, this.networkConfig);
                }
                for (AdsType addNetworkConfig : this.networkConfig.getSupportedAdsTypes(obtainAdapter)) {
                    addNetworkConfig.addNetworkConfig(this.networkKey, this.networkConfig);
                }
                NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.networkKey);
            } catch (Throwable th) {
                Logger.log(th);
                onInitializationFail("Network initialization exception");
            }
            NetworksInitializeCallback networksInitializeCallback = this.callback;
            if (networksInitializeCallback != null) {
                networksInitializeCallback.onExecuted();
            }
        }

        /* access modifiers changed from: package-private */
        public void execute() {
            networkLoadTaskList.add(this);
            executor.execute(this);
        }

        /* access modifiers changed from: package-private */
        public void onInitializationSuccess(NetworkAdapter networkAdapter) {
            Logger.log(this.networkKey, String.format("Initialization completed: %s, %s", new Object[]{networkAdapter.getSdkVersion(), networkAdapter.getAdapterVersion()}));
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.HeaderBiddingNetworkInitialize, (AdsType) null, (BMError) null);
            } else {
                BidMachineEvents.clearEvent(this.trackingObject, TrackEventType.HeaderBiddingNetworkInitialize);
            }
            networkLoadTaskList.remove(this);
        }

        /* access modifiers changed from: package-private */
        public void onInitializationFail(String str) {
            Logger.logError(this.networkKey, String.format("Initialization error: %s", new Object[]{str}));
            BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.HeaderBiddingNetworkInitialize, (AdsType) null, BMError.adapterInitialization(str));
            networkLoadTaskList.remove(this);
        }

        private static class InitializationCallback implements InternalNetworkInitializationCallback {
            private final WeakReference<NetworkLoadTask> weakNetworkLoadTask;

            public InitializationCallback(NetworkLoadTask networkLoadTask) {
                this.weakNetworkLoadTask = new WeakReference<>(networkLoadTask);
            }

            public void onSuccess(NetworkAdapter networkAdapter) {
                NetworkLoadTask networkLoadTask = (NetworkLoadTask) this.weakNetworkLoadTask.get();
                if (networkLoadTask != null) {
                    networkLoadTask.onInitializationSuccess(networkAdapter);
                }
            }

            public void onFail(NetworkAdapter networkAdapter, String str) {
                NetworkLoadTask networkLoadTask = (NetworkLoadTask) this.weakNetworkLoadTask.get();
                if (networkLoadTask != null) {
                    networkLoadTask.onInitializationFail(str);
                }
            }
        }
    }
}
