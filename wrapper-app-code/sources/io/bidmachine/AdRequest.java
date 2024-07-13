package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdResponseLoader;
import io.bidmachine.ApiRequest;
import io.bidmachine.ProtoTransformer;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.models.RequestParams;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String TAG = Utils.generateTag("AdRequest", this);
    List<AdRequestListener<SelfType>> adRequestListeners;
    /* access modifiers changed from: private */
    public final AdRequestParametersType adRequestParameters;
    AdResponse adResponse;
    private final AdResponseLoader adResponseLoader;
    final Queue<String> auctionUrlQueue;
    private final String id = UUID.randomUUID().toString();
    List<InternalAdRequestListener<SelfType>> internalAdRequestListeners;
    /* access modifiers changed from: private */
    public final AtomicBoolean isApiRequestCanceled = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean isApiRequestCompleted = new AtomicBoolean(false);
    private boolean isDestroyed;
    private final AtomicBoolean isLoading = new AtomicBoolean(false);
    private final AtomicBoolean isRequestExpired = new AtomicBoolean(false);
    private final List<NetworkAdUnit> networkAdUnits = new CopyOnWriteArrayList();
    private final Runnable timeOutRunnable = new Runnable() {
        public void run() {
            AdResponse receive = AdResponseManager.get().receive(AdRequest.this.adRequestParameters);
            if (receive != null) {
                AdRequest.this.processApiRequestSuccess(receive);
                return;
            }
            AdRequest.this.processApiRequestFail(BMError.TimeoutError);
            AdRequest.this.cancel();
        }
    };
    /* access modifiers changed from: private */
    public final TrackingObject trackingObject = new SimpleTrackingObject(this.id) {
        /* access modifiers changed from: package-private */
        public List<String> getTrackingUrls(TrackEventType trackEventType) {
            if (AdRequest.this.adResponse != null) {
                return AdRequest.this.adResponse.getTrackUrlListByEvent(trackEventType);
            }
            return super.getTrackingUrls(trackEventType);
        }
    };
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(AdRequestType adrequesttype);

        void onRequestFailed(AdRequestType adrequesttype, BMError bMError);

        void onRequestSuccess(AdRequestType adrequesttype, AuctionResult auctionResult);
    }

    interface InternalAdRequestListener<AdRequestType extends AdRequest> {
        void onRequestDestroyed(AdRequestType adrequesttype);
    }

    /* access modifiers changed from: protected */
    public abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, DataRestrictions dataRestrictions);

    /* access modifiers changed from: package-private */
    public boolean isPlacementBuilderMatch(PlacementBuilder placementBuilder) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBeforeSetDisplayPlacementBuilder(Placement.DisplayPlacement.Builder builder) {
    }

    /* access modifiers changed from: protected */
    public void onBeforeSetVideoPlacementBuilder(Placement.VideoPlacement.Builder builder) {
    }

    /* access modifiers changed from: protected */
    public void onBuildPlacement(Placement.Builder builder) {
    }

    /* access modifiers changed from: protected */
    public BMError verifyRequest() {
        return null;
    }

    protected AdRequest(AdRequestParametersType adrequestparameterstype) {
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new AdResponseLoader(this.id);
        this.auctionUrlQueue = new LinkedList();
    }

    /* access modifiers changed from: protected */
    public final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    /* access modifiers changed from: package-private */
    public AdResponse getAdResponse() {
        return this.adResponse;
    }

    /* access modifiers changed from: package-private */
    public Object build(Context context, AdsType adsType) {
        Map<String, Double> map;
        Context context2 = context;
        try {
            String sellerId = BidMachineImpl.get().getSellerId();
            if (TextUtils.isEmpty(sellerId)) {
                return BMError.notFound("SellerId");
            }
            BidMachineImpl bidMachineImpl = BidMachineImpl.get();
            SessionManager sessionManager = SessionManager.get();
            AdvertisingPersonalData.updateInfo(context);
            TargetingParams targetingParams = (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), bidMachineImpl.getTargetingParams());
            UserRestrictionParams userRestrictionParams = bidMachineImpl.getUserRestrictionParams();
            this.unifiedAdRequestParams = createUnifiedAdRequestParams(this.adRequestParameters, targetingParams, userRestrictionParams);
            SessionAdParams sessionDuration = sessionManager.getSessionAdParams(adsType).setSessionDuration(Integer.valueOf(sessionManager.getSessionDuration()));
            SessionAdParams sessionAdParams = (SessionAdParams) RequestParams.resolveParams(this.adRequestParameters.getSessionAdParams(), sessionDuration);
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            if (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) {
                map = bidMachineImpl.getPriceFloorParams().getPriceFloors();
            } else {
                map = priceFloorParams.getPriceFloors();
            }
            if (map.size() == 0) {
                return BMError.notFound("PriceFloors");
            }
            Request.Builder newBuilder = Request.newBuilder();
            Request.Item.Builder newBuilder2 = Request.Item.newBuilder();
            newBuilder2.setId(UUID.randomUUID().toString());
            newBuilder2.setQty(1);
            for (Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry next = it.next();
                Request.Item.Deal.Builder newBuilder3 = Request.Item.Deal.newBuilder();
                newBuilder3.setId((String) next.getKey());
                newBuilder3.setFlr(((Double) next.getValue()).doubleValue());
                newBuilder3.setFlrcur("USD");
                newBuilder2.addDeal(newBuilder3);
                AdsType adsType2 = adsType;
            }
            Placement.Builder newBuilder4 = Placement.newBuilder();
            newBuilder4.setSsai(0);
            newBuilder4.setSdk(BidMachine.NAME);
            newBuilder4.setSdkver("2.1.5");
            newBuilder4.setSecure(!Utils.canUseCleartextTraffic());
            String placementId = this.adRequestParameters.getPlacementId();
            if (!TextUtils.isEmpty(placementId)) {
                newBuilder4.setTagid(placementId);
            }
            ArrayList<Message.Builder> arrayList = new ArrayList<>();
            SimpleContextProvider simpleContextProvider = new SimpleContextProvider(context2);
            SessionManager sessionManager2 = sessionManager;
            Placement.Builder builder = newBuilder4;
            UnifiedAdRequestParamsType unifiedadrequestparamstype = this.unifiedAdRequestParams;
            String str = sellerId;
            String str2 = "USD";
            Request.Item.Builder builder2 = newBuilder2;
            SessionAdParams sessionAdParams2 = sessionDuration;
            Request.Builder builder3 = newBuilder;
            SessionAdParams sessionAdParams3 = sessionAdParams;
            adsType.collectPlacements(simpleContextProvider, this, unifiedadrequestparamstype, collectNetworkConfig(context, adsType), arrayList, this.networkAdUnits, bidMachineImpl.getNetworksLoadingTimeOutSec());
            for (Message.Builder builder4 : arrayList) {
                if (builder4 instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder5 = (Placement.DisplayPlacement.Builder) builder4;
                    onBeforeSetDisplayPlacementBuilder(builder5);
                    builder.setDisplay(builder5);
                } else if (builder4 instanceof Placement.VideoPlacement.Builder) {
                    Placement.VideoPlacement.Builder builder6 = (Placement.VideoPlacement.Builder) builder4;
                    onBeforeSetVideoPlacementBuilder(builder6);
                    builder.setVideo(builder6);
                } else {
                    throw new IllegalArgumentException("Unsupported display type: " + builder4);
                }
            }
            Struct.Builder newBuilder5 = Struct.newBuilder();
            OMSDKSettings.fillExtension(newBuilder5);
            ListValue.Builder newBuilder6 = ListValue.newBuilder();
            for (AdResponse createBidCacheExtensionValue : AdResponseManager.get().peek(this.adRequestParameters)) {
                newBuilder6.addValues(createBidCacheExtensionValue.createBidCacheExtensionValue());
            }
            if (newBuilder6.getValuesCount() > 0) {
                newBuilder5.putFields("bid_cache", Value.newBuilder().setListValue(newBuilder6).build());
            }
            if (newBuilder5.getFieldsCount() > 0) {
                builder.setExt(newBuilder5);
            }
            onBuildPlacement(builder);
            builder2.setSpec(Any.pack(builder.build()));
            builder3.addItem(builder2.build());
            Context.Builder newBuilder7 = com.explorestack.protobuf.adcom.Context.newBuilder();
            Context.App.Builder newBuilder8 = Context.App.newBuilder();
            Publisher publisher = bidMachineImpl.getPublisher();
            if (publisher != null) {
                publisher.build(newBuilder8);
            }
            targetingParams.build(context2, newBuilder8);
            Struct.Builder newBuilder9 = Struct.newBuilder();
            targetingParams.fillAppExtension(newBuilder9);
            if (newBuilder9.getFieldsCount() > 0) {
                newBuilder8.setExt(newBuilder9.build());
            }
            newBuilder7.setApp(newBuilder8);
            BlockedParams blockedParams = targetingParams.getBlockedParams();
            if (blockedParams != null) {
                Context.Restrictions.Builder newBuilder10 = Context.Restrictions.newBuilder();
                blockedParams.build(newBuilder10);
                newBuilder7.setRestrictions(newBuilder10);
            }
            Context.User.Builder newBuilder11 = Context.User.newBuilder();
            userRestrictionParams.build(newBuilder11);
            if (userRestrictionParams.canSendUserInfo()) {
                targetingParams.build(newBuilder11);
            }
            Struct.Builder newBuilder12 = Struct.newBuilder();
            sessionAdParams3.fillUserExtension(newBuilder12);
            if (newBuilder12.getFieldsCount() > 0) {
                newBuilder11.setExt(newBuilder12.build());
            }
            sessionAdParams2.setIsUserClickedOnLastAd((Boolean) false);
            newBuilder7.setUser(newBuilder11);
            Context.Regs.Builder newBuilder13 = Context.Regs.newBuilder();
            userRestrictionParams.build(newBuilder13);
            newBuilder7.setRegs(newBuilder13);
            Context.Device.Builder newBuilder14 = Context.Device.newBuilder();
            bidMachineImpl.getDeviceParams().build(context, newBuilder14, targetingParams, bidMachineImpl.getTargetingParams(), userRestrictionParams);
            Struct.Builder newBuilder15 = Struct.newBuilder();
            bidMachineImpl.getDeviceParams().fillDeviceExtension(context2, newBuilder15, userRestrictionParams);
            if (newBuilder15.getFieldsCount() > 0) {
                newBuilder14.setExt(newBuilder15.build());
            }
            newBuilder7.setDevice(newBuilder14);
            builder3.setContext(Any.pack(newBuilder7.build()));
            builder3.setTest(bidMachineImpl.isTestMode());
            builder3.addCur(str2);
            builder3.setAt(2);
            builder3.setTmax(10000);
            CustomParams customParams = this.adRequestParameters.getCustomParams();
            if (customParams != null) {
                Struct.Builder newBuilder16 = Struct.newBuilder();
                customParams.fillStructBuilder(newBuilder16);
                if (newBuilder16.getFieldsCount() > 0) {
                    Struct.Builder newBuilder17 = Struct.newBuilder();
                    newBuilder17.putFields("custom_params", Value.newBuilder().setStructValue(newBuilder16).build());
                    builder3.setExt(newBuilder17.build());
                }
            }
            RequestExtension.Builder newBuilder18 = RequestExtension.newBuilder();
            newBuilder18.setSellerId(str);
            newBuilder18.setBmIfv(bidMachineImpl.obtainIFV(context2));
            newBuilder18.setSessionId(sessionManager2.getSessionId());
            builder3.addExtProto(Any.pack(newBuilder18.build()));
            return builder3.build();
        } catch (Throwable th) {
            Logger.log(th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public List<NetworkConfig> collectNetworkConfig(android.content.Context context, AdsType adsType) {
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            return new ArrayList(adsType.getNetworkConfigs().values());
        }
        Map<String, NetworkConfig> createInitNetworkConfigMap = NetworkRegistry.createInitNetworkConfigMap();
        for (NetworkConfig next : networkConfigList) {
            String checkAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, next, createInitNetworkConfigMap);
            if (checkAndPutNetwork != null) {
                logError(String.format("%s was removed from AdRequest: %s", new Object[]{next.getNetworkKey(), checkAndPutNetwork}));
            }
        }
        return new ArrayList(createInitNetworkConfigMap.values());
    }

    public AuctionResult getAuctionResult() {
        AdResponse adResponse2 = this.adResponse;
        if (adResponse2 != null) {
            return adResponse2.getAuctionResult();
        }
        return null;
    }

    public void request(final android.content.Context context) {
        if (!BidMachineImpl.get().isInitialized()) {
            processRequestFail(BMError.internal("BidMachine not initialized"));
        } else if (isDestroyed()) {
            processRequestFail(BMError.RequestDestroyed);
        } else {
            BMError verifyRequest = verifyRequest();
            if (verifyRequest != null) {
                processRequestFail(verifyRequest);
            } else if (!isLoading()) {
                setLoading(true);
                AdRequestExecutor.get().execute(new Runnable() {
                    static final /* synthetic */ boolean $assertionsDisabled = false;

                    static {
                        Class<AdRequest> cls = AdRequest.class;
                    }

                    public void run() {
                        try {
                            AdRequest.this.cancel();
                            AdRequest.this.unsubscribeTimeOut();
                            if (AdRequest.this.adResponse != null) {
                                AdRequest.this.adResponse.detachAdRequest(AdRequest.this);
                                AdRequest.this.adResponse = null;
                            }
                            AdRequest.this.isApiRequestCanceled.set(false);
                            AdRequest.this.isApiRequestCompleted.set(false);
                            AdRequest.this.subscribeTimeOut();
                            AdRequest.this.log("Request start");
                            BidMachineEvents.eventStart(AdRequest.this.trackingObject, TrackEventType.AuctionRequest);
                            String bidPayload = AdRequest.this.adRequestParameters.getBidPayload();
                            if (!TextUtils.isEmpty(bidPayload)) {
                                AdRequest.this.processBidPayload(bidPayload);
                            } else {
                                AdRequest.this.processRequestObject(context);
                            }
                        } catch (Throwable th) {
                            Logger.log(th);
                            AdRequest.this.processRequestFail(BMError.internal("Exception when loading ad request"));
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void processBidPayload(String str) {
        try {
            ResponsePayload parseFrom = ResponsePayload.parseFrom(Base64.decode(str, 0));
            if (parseFrom != null) {
                processBidPayload(parseFrom);
                return;
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
        processRequestFail(BMError.incorrectContent("Incorrect BidPayload format"));
    }

    /* access modifiers changed from: protected */
    public void processBidPayload(ResponsePayload responsePayload) {
        if (isBidPayloadValid(responsePayload)) {
            Openrtb responseCache = responsePayload.getResponseCache();
            if (responseCache == null || responseCache == Openrtb.getDefaultInstance()) {
                String responseCacheUrl = responsePayload.getResponseCacheUrl();
                if (!TextUtils.isEmpty(responseCacheUrl) && Utils.isHttpUrl(responseCacheUrl)) {
                    retrieveBody(responseCacheUrl);
                    return;
                }
            } else {
                ProtoTransformer.toAdResponse(this.adRequestParameters, this.networkAdUnits, responseCache.getResponse(), new ProtoTransformer.Listener<AdResponse>() {
                    public void onSuccess(AdResponse adResponse) {
                        AdRequest.this.processApiRequestSuccess(adResponse);
                    }

                    public void onFail(BMError bMError) {
                        AdRequest.this.processApiRequestFail(bMError);
                    }
                });
                return;
            }
        }
        processRequestFail(BMError.incorrectContent("BidPayload does not contain Response or URL"));
    }

    /* access modifiers changed from: package-private */
    public boolean isBidPayloadValid(ResponsePayload responsePayload) {
        Placement requestItemSpec = responsePayload.getRequestItemSpec();
        try {
            if (requestItemSpec == Placement.getDefaultInstance() || this.adRequestParameters.isPlacementObjectValid(requestItemSpec)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Logger.log(th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void retrieveBody(String str) {
        processRequestBuilder(new ApiRequest.Builder().setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    /* access modifiers changed from: private */
    public void processRequestObject(android.content.Context context) {
        BMError bMError;
        prepareUrls();
        Object build = build(context, getAdsType());
        if (build instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) build).setDataBinder(getAdsType().getBinder()), pollUrl());
            return;
        }
        if (build instanceof BMError) {
            bMError = (BMError) build;
        } else {
            bMError = BMError.internal("Failed to create ad request");
        }
        processRequestFail(bMError);
    }

    /* access modifiers changed from: package-private */
    public void processRequestBuilder(final ApiRequest.Builder<Request, Response> builder, final String str) {
        if (canSendApiRequest()) {
            builder.url(str);
            this.adResponseLoader.load(this.adRequestParameters, this.networkAdUnits, builder, new AdResponseLoader.Listener() {
                public void onSuccess(AdResponse adResponse) {
                    AdRequest.this.setAuctionUrl(str);
                    AdRequest.this.processApiRequestSuccess(adResponse);
                }

                public void onFail(BMError bMError) {
                    AdRequest.this.processApiRequestLoadedFail(builder, bMError);
                }

                public void onCancel() {
                    AdRequest.this.processApiRequestCancel();
                }
            });
        }
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    private boolean canProcessApiRequestResult() {
        return !isCompleted() && !isCanceled() && !isDestroyed();
    }

    /* access modifiers changed from: package-private */
    public void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    /* access modifiers changed from: package-private */
    public String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    /* access modifiers changed from: package-private */
    public void setAuctionUrl(String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    public void notifyMediationWin() {
        BMError bMError;
        if (isCompleted()) {
            log("notifyMediationWin");
            if (isDestroyed()) {
                bMError = BMError.RequestDestroyed;
            } else {
                bMError = isExpired() ? BMError.RequestExpired : null;
            }
            BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.MediationWin, getAdsType(), bMError);
        }
    }

    public void notifyMediationLoss() {
        notifyMediationLoss((String) null, (Double) null);
    }

    public void notifyMediationLoss(String str, Double d2) {
        BMError bMError;
        if (isCompleted()) {
            log(String.format("notifyMediationLoss (winnerNetworkName - %s, winnerNetworkPrice - %s)", new Object[]{str, d2}));
            if (isDestroyed()) {
                bMError = BMError.RequestDestroyed;
            } else {
                bMError = isExpired() ? BMError.RequestExpired : null;
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(Constants.URL_MACROS_AUCTION_SEAT_ID, str);
            }
            if (d2 != null) {
                hashMap.put(Constants.URL_MACROS_AUCTION_PRICE, d2);
            }
            BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.MediationLoss, getAdsType(), bMError, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isLoading() {
        return this.isLoading.get();
    }

    private void setLoading(boolean z) {
        this.isLoading.set(z);
    }

    /* access modifiers changed from: package-private */
    public boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    /* access modifiers changed from: package-private */
    public boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public void destroy() {
        if (!this.isDestroyed) {
            this.isDestroyed = true;
            log("destroy");
            cancel();
            unsubscribeTimeOut();
            BidMachineEvents.clear(this.trackingObject);
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            AdResponse adResponse2 = this.adResponse;
            if (adResponse2 != null) {
                adResponse2.detachAdRequest(this);
                this.adResponse = null;
            }
            BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.AuctionRequestDestroy, getAdsType(), (BMError) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void cancel() {
        this.adResponseLoader.cancel();
    }

    /* access modifiers changed from: package-private */
    public void processExpired() {
        log("Request expired");
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            for (AdRequestListener<SelfType> onRequestExpired : list) {
                onRequestExpired.onRequestExpired(this);
            }
        }
        for (AdRequestListener<?> onRequestExpired2 : BidMachineImpl.get().getAdRequestListeners()) {
            onRequestExpired2.onRequestExpired(this);
        }
        BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.AuctionRequestExpired, getAdsType(), (BMError) null);
    }

    public boolean isExpired() {
        return isAdResponseExpired() || this.isRequestExpired.get();
    }

    /* access modifiers changed from: package-private */
    public boolean isAdResponseExpired() {
        AdResponse adResponse2 = this.adResponse;
        return adResponse2 != null && adResponse2.isExpired();
    }

    public void addListener(AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    public void removeListener(AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null && adRequestListener != null) {
            list.remove(adRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void addInternalListener(InternalAdRequestListener<SelfType> internalAdRequestListener) {
        if (internalAdRequestListener != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(internalAdRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void removeInternalListener(InternalAdRequestListener<SelfType> internalAdRequestListener) {
        List<InternalAdRequestListener<SelfType>> list = this.internalAdRequestListeners;
        if (list != null && internalAdRequestListener != null) {
            list.remove(internalAdRequestListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyRequestDestroyed() {
        List<InternalAdRequestListener<SelfType>> list = this.internalAdRequestListeners;
        if (list != null) {
            for (InternalAdRequestListener<SelfType> onRequestDestroyed : list) {
                onRequestDestroyed.onRequestDestroyed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r3.adRequestParameters.getTimeOutMs();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int obtainTimeOutMs() {
        /*
            r3 = this;
            io.bidmachine.BidMachineImpl r0 = io.bidmachine.BidMachineImpl.get()
            int r0 = r0.getRequestTimeOutMs()
            if (r0 > 0) goto L_0x001c
            AdRequestParametersType r1 = r3.adRequestParameters
            java.lang.Integer r1 = r1.getTimeOutMs()
            if (r1 == 0) goto L_0x001c
            int r2 = r1.intValue()
            if (r2 <= 0) goto L_0x001c
            int r0 = r1.intValue()
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.AdRequest.obtainTimeOutMs():int");
    }

    /* access modifiers changed from: private */
    public void subscribeTimeOut() {
        int obtainTimeOutMs = obtainTimeOutMs();
        if (obtainTimeOutMs > 0) {
            Utils.onBackgroundThread(this.timeOutRunnable, (long) obtainTimeOutMs);
        }
    }

    /* access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        Utils.cancelBackgroundThreadTask(this.timeOutRunnable);
    }

    /* access modifiers changed from: package-private */
    public void processApiRequestSuccess(AdResponse adResponse2) {
        if (!canProcessApiRequestResult()) {
            adResponse2.detachAdRequest(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(String.format("Request success - %s", new Object[]{adResponse2}));
        this.adResponse = adResponse2;
        adResponse2.attachAdRequest(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            for (AdRequestListener<SelfType> onRequestSuccess : list) {
                onRequestSuccess.onRequestSuccess(this, adResponse2.getAuctionResult());
            }
        }
        for (AdRequestListener<?> onRequestSuccess2 : BidMachineImpl.get().getAdRequestListeners()) {
            onRequestSuccess2.onRequestSuccess(this, adResponse2.getAuctionResult());
        }
        BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.AuctionRequest, getAdsType(), (BMError) null);
    }

    /* access modifiers changed from: package-private */
    public void processApiRequestLoadedFail(ApiRequest.Builder<Request, Response> builder, BMError bMError) {
        String poll;
        if (canProcessApiRequestResult()) {
            if (bMError == BMError.BMServerNoFill || (poll = this.auctionUrlQueue.poll()) == null) {
                processApiRequestFail(bMError);
            } else {
                processRequestBuilder(builder, poll);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void processApiRequestFail(BMError bMError) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            unsubscribeTimeOut();
            if (bMError == null) {
                bMError = BMError.BMServerNoFill;
            }
            processRequestFail(bMError);
        }
    }

    /* access modifiers changed from: package-private */
    public void processRequestFail(BMError bMError) {
        log(String.format("Request fail - %s", new Object[]{bMError}));
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            for (AdRequestListener<SelfType> onRequestFailed : list) {
                onRequestFailed.onRequestFailed(this, bMError);
            }
        }
        for (AdRequestListener<?> onRequestFailed2 : BidMachineImpl.get().getAdRequestListeners()) {
            onRequestFailed2.onRequestFailed(this, bMError);
        }
        BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.AuctionRequest, getAdsType(), bMError);
    }

    /* access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCanceled.set(true);
            unsubscribeTimeOut();
            BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.AuctionRequestCancel, getAdsType(), (BMError) null);
            BidMachineEvents.clearEvent(this.trackingObject, TrackEventType.AuctionRequest);
        }
    }

    /* access modifiers changed from: package-private */
    public final UnifiedAdRequestParamsType obtainUnifiedRequestParams() {
        if (this.unifiedAdRequestParams == null) {
            BidMachineImpl bidMachineImpl = BidMachineImpl.get();
            UserRestrictionParams userRestrictionParams = bidMachineImpl.getUserRestrictionParams();
            this.unifiedAdRequestParams = createUnifiedAdRequestParams(this.adRequestParameters, (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), bidMachineImpl.getTargetingParams()), userRestrictionParams);
        }
        return this.unifiedAdRequestParams;
    }

    /* access modifiers changed from: private */
    public void log(String str) {
        Logger.log(this.TAG, String.format("%s - %s", new Object[]{this.adRequestParameters.getAdsType(), str}));
    }

    private void logError(String str) {
        Logger.logError(this.TAG, String.format("%s - %s", new Object[]{this.adRequestParameters.getAdsType(), str}));
    }

    public String toString() {
        return this.TAG;
    }

    protected static abstract class AdRequestBuilderImpl<SelfType extends RequestBuilder, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements RequestBuilder<SelfType, ReturnType> {
        String bidPayload;
        CustomParams customParams;
        AdRequestListener<ReturnType> listener;
        List<NetworkConfig> networkConfigList;
        String placementId;
        PriceFloorParams priceFloorParams;
        SessionAdParams sessionAdParams;
        TargetingParams targetingParams;
        Integer timeOutMs;

        /* access modifiers changed from: protected */
        public abstract ReturnType build(AdRequestParametersType adrequestparameterstype);

        /* access modifiers changed from: protected */
        public abstract AdRequestParametersType createAdRequestParameters();

        protected AdRequestBuilderImpl() {
        }

        public SelfType setPriceFloorParams(PriceFloorParams priceFloorParams2) {
            this.priceFloorParams = priceFloorParams2;
            return this;
        }

        public SelfType setTargetingParams(TargetingParams targetingParams2) {
            this.targetingParams = targetingParams2;
            return this;
        }

        public SelfType setSessionAdParams(SessionAdParams sessionAdParams2) {
            this.sessionAdParams = sessionAdParams2;
            return this;
        }

        public SelfType setNetworks(List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        public SelfType setNetworks(String str) {
            ArrayList arrayList = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            NetworkConfig create = NetworkConfigFactory.create(BidMachineImpl.get().getAppContext(), jSONArray.getJSONObject(i));
                            if (create != null) {
                                arrayList2.add(create);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e2) {
                        e = e2;
                        arrayList = arrayList2;
                        Logger.log((Throwable) e);
                        fillNetworkConfigs(arrayList);
                        return this;
                    }
                } catch (Exception e3) {
                    e = e3;
                    Logger.log((Throwable) e);
                    fillNetworkConfigs(arrayList);
                    return this;
                }
            }
            fillNetworkConfigs(arrayList);
            return this;
        }

        /* access modifiers changed from: package-private */
        public void fillNetworkConfigs(List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        public SelfType setLoadingTimeOut(Integer num) {
            this.timeOutMs = num;
            return this;
        }

        public SelfType setBidPayload(String str) {
            this.bidPayload = str;
            return this;
        }

        public SelfType setPlacementId(String str) {
            this.placementId = str;
            return this;
        }

        public SelfType setListener(AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        public SelfType setCustomParams(CustomParams customParams2) {
            this.customParams = customParams2;
            return this;
        }

        public ReturnType build() {
            AdRequestParameters createAdRequestParameters = createAdRequestParameters();
            createAdRequestParameters.setPriceFloorParams(this.priceFloorParams);
            createAdRequestParameters.setTargetingParams(this.targetingParams);
            createAdRequestParameters.setSessionAdParams(this.sessionAdParams);
            createAdRequestParameters.setNetworkConfigList(this.networkConfigList);
            createAdRequestParameters.setTimeOutMs(this.timeOutMs);
            createAdRequestParameters.setBidPayload(this.bidPayload);
            createAdRequestParameters.setPlacementId(this.placementId);
            createAdRequestParameters.setCustomParams(this.customParams);
            ReturnType build = build(createAdRequestParameters);
            build.addListener(this.listener);
            return build;
        }
    }
}
