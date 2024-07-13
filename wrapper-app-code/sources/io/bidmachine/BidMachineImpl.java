package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.iab.vast.VastRequest;
import io.bidmachine.AdRequest;
import io.bidmachine.InitialRequest;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

final class BidMachineImpl {
    private static volatile BidMachineImpl instance;
    private final List<AdRequest.AdRequestListener<?>> adRequestListeners = new CopyOnWriteArrayList();
    Context appContext;
    private final Set<InitializationCallback> callbackSet = new CopyOnWriteArraySet();
    private CustomParams customParams = new CustomParams();
    private final DeviceParams deviceParams = new DeviceParams();
    /* access modifiers changed from: private */
    public final IABSharedPreference iabSharedPreference = new IABSharedPreference();
    String ifv;
    InitialRequest initialRequest;
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);
    private boolean isTestMode;
    private int networksLoadingTimeOutSec = 0;
    private final PriceFloorParams priceFloorParams = new PriceFloorParams().addPriceFloor(UUID.randomUUID().toString(), 0.01d);
    private Publisher publisher;
    int requestTimeOutMs = 0;
    private String sellerId;
    private SessionTracker sessionTracker;
    private TargetingParams targetingParams = new TargetingParams();
    private final Map<TrackEventType, List<String>> trackingEventTypes = new EnumMap(TrackEventType.class);
    private final UserRestrictionParams userRestrictionParams = new UserRestrictionParams();

    BidMachineImpl() {
    }

    static BidMachineImpl get() {
        if (instance == null) {
            synchronized (BidMachineImpl.class) {
                if (instance == null) {
                    instance = new BidMachineImpl();
                }
            }
        }
        return instance;
    }

    static {
        Logger.setMessageBuilder(new Logger.LoggerMessageBuilder() {
            public String buildMessage(String str) {
                if (!BidMachineImpl.get().isTestMode()) {
                    return str;
                }
                return String.format("(TEST MODE) %s", new Object[]{str});
            }
        });
    }

    static void preInitialize(Context context) {
        BidMachineActivityManager.initialize(context);
        UserAgentProvider.initialize(context);
    }

    /* access modifiers changed from: package-private */
    public void initialize(Context context, final String str, InitializationCallback initializationCallback) {
        if (isInitialized()) {
            sendOnInitialized(initializationCallback);
        } else if (context == null) {
            Logger.log("Initialization fail: Context is not provided");
        } else if (TextUtils.isEmpty(str)) {
            Logger.log("Initialization fail: Source id is not provided");
        } else {
            if (initializationCallback != null) {
                this.callbackSet.add(initializationCallback);
            }
            if (this.isInitializing.compareAndSet(false, true)) {
                final Context applicationContext = context.getApplicationContext();
                this.appContext = applicationContext;
                this.sellerId = str;
                this.sessionTracker = new SessionTrackerImpl();
                SessionManager.get().resume();
                BluetoothUtils.register(applicationContext);
                Utils.onBackgroundThread(new Runnable() {
                    public void run() {
                        try {
                            Debugger.setup(applicationContext);
                            BidMachineImpl.this.iabSharedPreference.initialize(applicationContext);
                            BidMachineImpl.this.loadStoredInitResponse(applicationContext);
                            BidMachineImpl.this.initializeNetworks(applicationContext, (NetworkRegistry.NetworksInitializeCallback) null);
                            BidMachineImpl.this.notifyInitializationFinished();
                            BidMachineImpl.this.requestInitData(applicationContext, str);
                        } catch (Throwable th) {
                            Logger.log(th);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Context getAppContext() {
        return this.appContext;
    }

    /* access modifiers changed from: package-private */
    public String obtainIFV(Context context) {
        if (!TextUtils.isEmpty(this.ifv)) {
            return this.ifv;
        }
        String obtainIFV = BidMachineSharedPreference.obtainIFV(context);
        this.ifv = obtainIFV;
        return obtainIFV;
    }

    private static void sendOnInitialized(final InitializationCallback initializationCallback) {
        if (initializationCallback != null) {
            Utils.onUiThread(new Runnable() {
                public void run() {
                    InitializationCallback.this.onInitialized();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void loadStoredInitResponse(Context context) {
        InitResponse initResponse = BidMachineSharedPreference.getInitResponse(context);
        if (initResponse != null) {
            handleInitResponse(initResponse);
        }
    }

    /* access modifiers changed from: private */
    public void requestInitData(final Context context, String str) {
        if (this.initialRequest == null) {
            InitialRequest initialRequest2 = new InitialRequest(context, str, UrlProvider.getInitUrlQueue());
            this.initialRequest = initialRequest2;
            initialRequest2.setListener(new InitialRequest.Listener() {
                public void onSuccess(InitResponse initResponse) {
                    if (BidMachineImpl.this.initialRequest != null) {
                        BidMachineImpl.this.initialRequest.destroy();
                        BidMachineImpl.this.initialRequest = null;
                    }
                    if (initResponse != null) {
                        BidMachineImpl.this.prepareAnalytics(context, initResponse);
                        BidMachineImpl.this.handleInitResponse(initResponse);
                        BidMachineSharedPreference.storeInitResponse(context, initResponse);
                        BidMachineImpl.this.initializeInitNetworks(context, initResponse.getAdNetworksList());
                    }
                }

                public void onFail(BMError bMError) {
                    InitResponse initResponse = BidMachineSharedPreference.getInitResponse(context);
                    if (initResponse != null) {
                        BidMachineImpl.this.initializeInitNetworks(context, initResponse.getAdNetworksList());
                    }
                }
            });
            this.initialRequest.request();
        }
    }

    /* access modifiers changed from: private */
    public void prepareAnalytics(Context context, InitResponse initResponse) {
        try {
            if (initResponse.hasSdkAnalyticConfig()) {
                SdkAnalyticConfig sdkAnalyticConfig = initResponse.getSdkAnalyticConfig();
                String url = sdkAnalyticConfig.getUrl();
                String context2 = sdkAnalyticConfig.getContext();
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                if (!TextUtils.isEmpty(context2)) {
                    ArrayList arrayList = new ArrayList();
                    for (SdkAnalyticConfig.MetricConfig next : sdkAnalyticConfig.getMetricConfigsList()) {
                        arrayList.add(new AnalyticsMetricConfig(next.getName(), new ArrayList(next.getDimensionsList()), new ArrayList(next.getMetricsList())));
                    }
                    BidMachineAnalytics.initialize(context, new AnalyticsConfig.Builder(url, context2).setIntervalSec(sdkAnalyticConfig.getInterval()).setEventBatchSize(sdkAnalyticConfig.getCount()).setAnalyticsMetricConfigList(arrayList).build());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void handleInitResponse(InitResponse initResponse) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        this.trackingEventTypes.clear();
        OrtbUtils.prepareEvents(this.trackingEventTypes, initResponse.getEventList());
        SessionManager.get().setSessionResetAfter((long) initResponse.getSessionResetAfter());
        this.requestTimeOutMs = initResponse.getAdRequestTmax();
        this.networksLoadingTimeOutSec = initResponse.getAdNetworksLoadingTimeout();
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            AdResponseManager.setAdCachePlacementControlMap(adCachePlacementControlMap);
            int i = 0;
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            if (adCachePlacementControl != null) {
                i = 0 + adCachePlacementControl.getMaxCacheSize();
            }
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                i += adCachePlacementControl2.getMaxCacheSize();
            }
            if (i > 5) {
                VastRequest.setCacheSize(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeInitNetworks(Context context, List<AdNetwork> list) {
        if (list != null) {
            for (AdNetwork registerInitNetwork : list) {
                NetworkRegistry.registerInitNetwork(context, registerInitNetwork);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeNetworks(Context context, NetworkRegistry.NetworksInitializeCallback networksInitializeCallback) {
        NetworkRegistry.registerNetwork(new MraidConfig());
        NetworkRegistry.registerNetwork(new VastConfig());
        NetworkRegistry.registerNetwork(new NastConfig());
        NetworkRegistry.initializeNetworks(context, networksInitializeCallback);
    }

    /* access modifiers changed from: package-private */
    public void notifyInitializationFinished() {
        Logger.log("Notify initialization finished");
        this.isInitialized.set(true);
        this.isInitializing.set(false);
        for (InitializationCallback sendOnInitialized : this.callbackSet) {
            sendOnInitialized(sendOnInitialized);
        }
        this.callbackSet.clear();
    }

    /* access modifiers changed from: package-private */
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return this.trackingEventTypes.get(trackEventType);
    }

    /* access modifiers changed from: package-private */
    public int getRequestTimeOutMs() {
        return this.requestTimeOutMs;
    }

    /* access modifiers changed from: package-private */
    public int getNetworksLoadingTimeOutSec() {
        return this.networksLoadingTimeOutSec;
    }

    /* access modifiers changed from: package-private */
    public boolean isInitializationStarted() {
        return isInitializing() || isInitialized();
    }

    /* access modifiers changed from: package-private */
    public boolean isInitializing() {
        return this.isInitializing.get();
    }

    /* access modifiers changed from: package-private */
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    /* access modifiers changed from: package-private */
    public boolean isTestMode() {
        return this.isTestMode;
    }

    /* access modifiers changed from: package-private */
    public void setTestMode(boolean z) {
        this.isTestMode = z;
    }

    /* access modifiers changed from: package-private */
    public SessionTracker getSessionTracker() {
        return this.sessionTracker;
    }

    /* access modifiers changed from: package-private */
    public String getSellerId() {
        return this.sellerId;
    }

    /* access modifiers changed from: package-private */
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    /* access modifiers changed from: package-private */
    public void setTargetingParams(TargetingParams targetingParams2) {
        if (targetingParams2 == null) {
            targetingParams2 = new TargetingParams();
        }
        this.targetingParams = targetingParams2;
    }

    /* access modifiers changed from: package-private */
    public Publisher getPublisher() {
        return this.publisher;
    }

    /* access modifiers changed from: package-private */
    public void setPublisher(Publisher publisher2) {
        this.publisher = publisher2;
    }

    /* access modifiers changed from: package-private */
    public CustomParams getCustomParams() {
        return this.customParams;
    }

    /* access modifiers changed from: package-private */
    public void setCustomParams(CustomParams customParams2) {
        if (customParams2 == null) {
            customParams2 = new CustomParams();
        }
        this.customParams = customParams2;
    }

    /* access modifiers changed from: package-private */
    public UserRestrictionParams getUserRestrictionParams() {
        return this.userRestrictionParams;
    }

    /* access modifiers changed from: package-private */
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    /* access modifiers changed from: package-private */
    public DeviceParams getDeviceParams() {
        return this.deviceParams;
    }

    /* access modifiers changed from: package-private */
    public IABSharedPreference getIabSharedPreference() {
        return this.iabSharedPreference;
    }

    /* access modifiers changed from: package-private */
    public void registerAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener != null) {
            this.adRequestListeners.add(adRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void unregisterAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener != null) {
            this.adRequestListeners.remove(adRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public List<AdRequest.AdRequestListener<?>> getAdRequestListeners() {
        return this.adRequestListeners;
    }
}
