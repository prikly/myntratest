package io.bidmachine;

import android.content.Context;
import android.location.Location;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.ApiRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

class InitialRequest {
    private static final long MAX_INIT_REQUEST_DELAY_MS = TimeUnit.SECONDS.toMillis(128);
    private static final long MIN_INIT_REQUEST_DELAY_MS = TimeUnit.SECONDS.toMillis(2);
    private final Context applicationContext;
    private final Queue<String> baseUrlQueue;
    /* access modifiers changed from: private */
    public ApiRequest<InitRequest, InitResponse> currentInitRequest;
    /* access modifiers changed from: private */
    public final Queue<String> currentUrlQueue;
    /* access modifiers changed from: private */
    public long initRequestDelayMs = 0;
    /* access modifiers changed from: private */
    public final Runnable initialRunnable;
    /* access modifiers changed from: private */
    public Listener listener;
    private final String sellerId;
    /* access modifiers changed from: private */
    public final TrackingObject trackingObject;

    interface Listener extends NetworkRequest.Callback<InitResponse, BMError> {
    }

    public InitialRequest(Context context, String str, Queue<String> queue) {
        this.applicationContext = context;
        this.sellerId = str;
        this.trackingObject = new SimpleTrackingObject();
        this.initialRunnable = new InitialRunnable(this);
        this.baseUrlQueue = new LinkedList(queue);
        this.currentUrlQueue = new LinkedList(queue);
    }

    /* access modifiers changed from: package-private */
    public void setListener(Listener listener2) {
        this.listener = listener2;
    }

    /* access modifiers changed from: package-private */
    public void request() {
        BidMachineEvents.eventStart(this.trackingObject, TrackEventType.InitLoading, (TrackEventInfo) null);
        Utils.onBackgroundThread(new Runnable() {
            public void run() {
                ApiRequest unused = InitialRequest.this.currentInitRequest = new ApiRequest.Builder().url(InitialRequest.this.pollUrl()).setDataBinder(new ApiRequest.ApiInitDataBinder()).setRequestData(InitialRequest.this.createInitRequest()).setCallback(new NetworkRequest.Callback<InitResponse, BMError>() {
                    public void onSuccess(InitResponse initResponse) {
                        ApiRequest unused = InitialRequest.this.currentInitRequest = null;
                        long unused2 = InitialRequest.this.initRequestDelayMs = 0;
                        Utils.cancelBackgroundThreadTask(InitialRequest.this.initialRunnable);
                        if (InitialRequest.this.listener != null) {
                            InitialRequest.this.listener.onSuccess(initResponse);
                        }
                        BidMachineEvents.eventFinish(InitialRequest.this.trackingObject, TrackEventType.InitLoading, (AdsType) null, (BMError) null);
                    }

                    public void onFail(BMError bMError) {
                        long j;
                        ApiRequest unused = InitialRequest.this.currentInitRequest = null;
                        if (InitialRequest.this.currentUrlQueue.isEmpty()) {
                            j = InitialRequest.this.calculateDelay();
                            Logger.log(String.format("reschedule init request (%s)", new Object[]{Long.valueOf(j)}));
                            if (InitialRequest.this.listener != null) {
                                InitialRequest.this.listener.onFail(bMError);
                            }
                        } else {
                            j = 0;
                        }
                        Utils.onBackgroundThread(InitialRequest.this.initialRunnable, j);
                        BidMachineEvents.eventFinish(InitialRequest.this.trackingObject, TrackEventType.InitLoading, (AdsType) null, bMError);
                    }
                }).request();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        this.listener = null;
        this.currentInitRequest = null;
    }

    /* access modifiers changed from: private */
    public String pollUrl() {
        if (this.currentUrlQueue.isEmpty()) {
            this.currentUrlQueue.addAll(this.baseUrlQueue);
        }
        return this.currentUrlQueue.poll();
    }

    /* access modifiers changed from: private */
    public InitRequest createInitRequest() {
        DeviceType deviceType;
        AdvertisingPersonalData.updateInfo(this.applicationContext);
        BidMachineImpl bidMachineImpl = BidMachineImpl.get();
        UserRestrictionParams userRestrictionParams = bidMachineImpl.getUserRestrictionParams();
        TargetingParams targetingParams = bidMachineImpl.getTargetingParams();
        InitRequest.Builder newBuilder = InitRequest.newBuilder();
        String packageName = this.applicationContext.getPackageName();
        if (packageName != null) {
            newBuilder.setBundle(packageName);
        }
        newBuilder.setSellerId(this.sellerId);
        newBuilder.setOs(OS.OS_ANDROID);
        newBuilder.setOsv(DeviceUtils.getOsVersion());
        String appVersion = Utils.getAppVersion(this.applicationContext);
        if (appVersion != null) {
            newBuilder.setAppVer(appVersion);
        }
        newBuilder.setSdk(BidMachine.NAME);
        newBuilder.setSdkver("2.1.5");
        newBuilder.setIfa(AdvertisingPersonalData.getAdvertisingId(this.applicationContext, !userRestrictionParams.canSendIfa()));
        newBuilder.setBmIfv(bidMachineImpl.obtainIFV(this.applicationContext));
        newBuilder.setSessionId(SessionManager.get().getSessionId());
        if (DeviceInfo.obtain(this.applicationContext).isTablet) {
            deviceType = DeviceType.DEVICE_TYPE_TABLET;
        } else {
            deviceType = DeviceType.DEVICE_TYPE_PHONE_DEVICE;
        }
        newBuilder.setDeviceType(deviceType);
        if (userRestrictionParams.canSendDeviceInfo()) {
            newBuilder.setContype(DeviceUtils.getConnectionType(this.applicationContext));
        }
        if (userRestrictionParams.canSendGeoPosition()) {
            Context.Geo.Builder createGeoBuilderWithLocation = ProtoUtils.createGeoBuilderWithLocation(this.applicationContext, targetingParams.getDeviceLocation(), (Location) null, true);
            targetingParams.build(createGeoBuilderWithLocation);
            newBuilder.setGeo(createGeoBuilderWithLocation);
        }
        newBuilder.setExt(createExtension(this.applicationContext));
        return newBuilder.build();
    }

    private Struct createExtension(android.content.Context context) {
        Struct.Builder newBuilder = Struct.newBuilder();
        newBuilder.putFields("networks_info", Value.newBuilder().setListValue(createNetworkInfoListValue(context)).build());
        return newBuilder.build();
    }

    private ListValue.Builder createNetworkInfoListValue(android.content.Context context) {
        ListValue.Builder newBuilder = ListValue.newBuilder();
        for (NetworkAssetParams next : NetworkAssetManager.getNetworkAssetParamsMap(context).values()) {
            newBuilder.addValues(createNetworkInfoValue(next.getName(), next.getSdkVersion(), next.getAdapterVersion()));
        }
        newBuilder.addValues(createNetworkInfoValue("mraid", "1.3.0", "2.1.5.1"));
        newBuilder.addValues(createNetworkInfoValue("vast", "1.3.0", "2.1.5.1"));
        newBuilder.addValues(createNetworkInfoValue("nast", "1.0", "2.1.5.1"));
        return newBuilder;
    }

    private Value createNetworkInfoValue(String str, String str2, String str3) {
        Value build = Value.newBuilder().setStringValue(str).build();
        Value build2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", build).putFields("network_version", build2).putFields("network_adapter_version", Value.newBuilder().setStringValue(str3).build()).build()).build();
    }

    /* access modifiers changed from: private */
    public long calculateDelay() {
        long j = this.initRequestDelayMs;
        if (j <= 0) {
            this.initRequestDelayMs = MIN_INIT_REQUEST_DELAY_MS;
        } else {
            long j2 = j * 2;
            this.initRequestDelayMs = j2;
            long j3 = MAX_INIT_REQUEST_DELAY_MS;
            if (j2 >= j3) {
                this.initRequestDelayMs = j3;
            }
        }
        return this.initRequestDelayMs;
    }

    private static class InitialRunnable implements Runnable {
        private final WeakReference<InitialRequest> weakInitialRequest;

        public InitialRunnable(InitialRequest initialRequest) {
            this.weakInitialRequest = new WeakReference<>(initialRequest);
        }

        public void run() {
            InitialRequest initialRequest = (InitialRequest) this.weakInitialRequest.get();
            if (initialRequest != null) {
                initialRequest.request();
            }
        }
    }
}
