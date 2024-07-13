package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.utils.BMError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class AdResponse {
    private static final long DEF_EXPIRATION_TIME_SEC = TimeUnit.MINUTES.toSeconds(29);
    /* access modifiers changed from: private */
    public final String TAG = Utils.generateTag("AdResponse", this);
    private final Ad ad;
    private final AdCacheControl adCacheControl;
    final AdProcessCallbackComposite adCallbackComposite = new AdProcessCallbackComposite(this);
    /* access modifiers changed from: private */
    public AdObject adObject;
    private final AdRequestParameters adRequestParameters;
    private final AuctionResult auctionResult;
    private final String bidId;
    private final long createTimeMs = System.currentTimeMillis();
    private final long expirationTimeMs;
    private final Runnable expiredRunnable = new ExpiredRunnable(this);
    final AtomicBoolean isExpireTrackerSubscribed = new AtomicBoolean(false);
    private final AtomicBoolean isExpired = new AtomicBoolean(false);
    private final List<NetworkAdUnit> networkAdUnitList;
    private final String responseId;
    private final Struct seatBidExt;
    private volatile AdResponseStatus status = AdResponseStatus.Idle;
    final Map<TrackEventType, List<String>> trackUrlsMap = new EnumMap(TrackEventType.class);
    final TrackingObject trackingObject;
    final List<WeakReference<AdRequest<?, ?, ?>>> weakAdRequestList = new CopyOnWriteArrayList();
    private final NetworkAdUnit winnerNetworkAdUnit;

    public AdResponse(AdRequestParameters adRequestParameters2, List<NetworkAdUnit> list, Response response, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter) {
        this.adRequestParameters = adRequestParameters2;
        this.networkAdUnitList = new CopyOnWriteArrayList(list);
        this.responseId = response.getId();
        this.seatBidExt = seatbid.getExt();
        this.bidId = bid.getId();
        this.ad = ad2;
        AdExtension findAdExtension = findAdExtension(ad2);
        this.auctionResult = new AuctionResultImpl(adRequestParameters2.getAdsType(), seatbid, bid, ad2, networkAdapter, findAdExtension);
        this.adCacheControl = findAdCacheControl(findAdExtension);
        this.expirationTimeMs = Utils.getOrDefault((long) bid.getExp(), (long) Response.Seatbid.Bid.getDefaultInstance().getExp(), DEF_EXPIRATION_TIME_SEC) * 1000;
        this.trackingObject = new SimpleTrackingObject(this.auctionResult.getId()) {
            public List<String> getTrackingUrls(TrackEventType trackEventType) {
                return AdResponse.this.getTrackUrls(trackEventType);
            }
        };
        this.winnerNetworkAdUnit = findWinnerNetworkAdUnit(this.auctionResult, networkAdapter);
        extractTrackUrls(bid);
        subscribeExpireTracker();
    }

    public AdRequestParameters getAdRequestParameters() {
        return this.adRequestParameters;
    }

    public AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    public Ad getAd() {
        return this.ad;
    }

    public AuctionResult getAuctionResult() {
        return this.auctionResult;
    }

    public double getPrice() {
        return this.auctionResult.getPrice();
    }

    public CreativeFormat getCreativeFormat() {
        return this.auctionResult.getCreativeFormat();
    }

    public boolean canCache() {
        return this.adCacheControl == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    public long calculateExpirationLeftMs() {
        return this.expirationTimeMs - (System.currentTimeMillis() - this.createTimeMs);
    }

    public NetworkAdUnit getWinnerNetworkAdUnit() {
        return this.winnerNetworkAdUnit;
    }

    public List<String> getTrackUrlListByEvent(TrackEventType trackEventType) {
        return this.trackUrlsMap.get(trackEventType);
    }

    public boolean isExpired() {
        return this.isExpired.get();
    }

    public synchronized AdResponseStatus getStatus() {
        return this.status;
    }

    public synchronized void setStatus(AdResponseStatus adResponseStatus) {
        this.status = adResponseStatus;
    }

    public synchronized AdObject getAdObject() {
        return this.adObject;
    }

    public List<String> getTrackUrls(TrackEventType trackEventType) {
        AdObject adObject2 = this.adObject;
        AdObjectParams params = adObject2 != null ? adObject2.getParams() : null;
        if (params != null) {
            return params.getTrackUrls(trackEventType);
        }
        return null;
    }

    public void attachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest != null) {
            Logger.log(this.TAG, String.format("attachRequest - %s", new Object[]{this}));
            this.weakAdRequestList.add(new WeakReference(adRequest));
        }
    }

    public void detachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest != null) {
            Logger.log(this.TAG, String.format("detachRequest - %s", new Object[]{this}));
            ArrayList arrayList = new ArrayList();
            for (WeakReference next : this.weakAdRequestList) {
                AdRequest<?, ?, ?> adRequest2 = (AdRequest) next.get();
                if (adRequest2 == null || adRequest2 == adRequest) {
                    arrayList.add(next);
                }
            }
            this.weakAdRequestList.removeAll(arrayList);
            if (this.weakAdRequestList.size() == 0) {
                release();
            }
        }
    }

    public synchronized void loadAdObject(ContextProvider contextProvider, AdRequest adRequest, BidMachineAd bidMachineAd, AdProcessCallback adProcessCallback) {
        onAdLoadStart(adRequest);
        if (isAdLoaded()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        this.adCallbackComposite.appendCallback(adProcessCallback);
        if (!this.adCallbackComposite.isLoading.getAndSet(true)) {
            BidMachineEvents.eventStart(this.trackingObject, TrackEventType.Load);
            if (isExpired()) {
                this.adCallbackComposite.processLoadFail(BMError.ResponseExpired);
                return;
            } else if (wasShown()) {
                this.adCallbackComposite.processLoadFail(BMError.ResponseDuplicated);
                return;
            } else {
                try {
                    NetworkAdapter findNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.ad);
                    if (findNetworkAdapter == null) {
                        this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to get adapter by response"));
                        return;
                    }
                    AdObjectParams createAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.ad);
                    if (createAdObjectParams != null) {
                        if (createAdObjectParams.isValid()) {
                            AdObject createAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, findNetworkAdapter, createAdObjectParams, this.adCallbackComposite);
                            if (createAdObject == null) {
                                this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to create ad object by response"));
                                return;
                            } else {
                                createAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(), this.winnerNetworkAdUnit);
                                this.adObject = createAdObject;
                            }
                        }
                    }
                    this.adCallbackComposite.processLoadFail(BMError.incorrectContent("Failed to get parameters by response"));
                    return;
                } catch (Throwable th) {
                    Logger.log(th);
                    this.adCallbackComposite.processLoadFail(BMError.internal("Exception when processing response"));
                }
            }
        } else {
            return;
        }
        return;
    }

    public void onAdLoadStart(AdRequest<?, ?, ?> adRequest) {
        Logger.log(this.TAG, String.format("onLoadStart - %s", new Object[]{this}));
        expireAdRequests(adRequest);
    }

    public boolean isAdLoaded() {
        return this.adObject != null && this.adCallbackComposite.isLoaded.get();
    }

    public boolean wasShown() {
        return this.adCallbackComposite.isResultShownTracked.get();
    }

    public void removeCallback(AdProcessCallback adProcessCallback) {
        this.adCallbackComposite.removeCallback(adProcessCallback);
    }

    /* access modifiers changed from: package-private */
    public Value createBidCacheExtensionValue() {
        Struct.Builder putFields = Struct.newBuilder().putFields(InAppPurchaseMetaData.KEY_PRICE, Value.newBuilder().setNumberValue(this.auctionResult.getPrice()).build()).putFields("exp", Value.newBuilder().setNumberValue((double) calculateExpirationLeftMs()).build()).putFields("request_id", Value.newBuilder().setStringValue(this.responseId).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.bidId).build());
        if (this.seatBidExt.getFieldsCount() > 0) {
            putFields.putFields("seat", Value.newBuilder().setStructValue(this.seatBidExt).build());
        }
        return Value.newBuilder().setStructValue(putFields).build();
    }

    /* access modifiers changed from: private */
    public void destroy() {
        Logger.log(this.TAG, String.format("destroy - %s", new Object[]{this}));
        AdResponseManager.get().remove(this);
        clearAdRequestList();
        unsubscribeExpireTracker();
        this.adCallbackComposite.destroy();
        this.trackUrlsMap.clear();
        notifyNetworkClearAuction();
        if (this.adCallbackComposite.isLoading()) {
            eventFinish(TrackEventType.Load, BMError.Destroyed);
        }
        if (this.adObject != null) {
            eventFinish(TrackEventType.Destroy);
        }
        BidMachineEvents.clear(this.trackingObject);
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    if (AdResponse.this.adObject != null) {
                        AdResponse.this.adObject.onDestroy();
                    }
                } catch (Throwable th) {
                    Logger.log(th);
                }
                AdObject unused = AdResponse.this.adObject = null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void notifyExpired(boolean z) {
        Logger.log(this.TAG, String.format("notifyExpired - %s", new Object[]{this}));
        this.isExpired.set(true);
        unsubscribeExpireTracker();
        expireAdRequests((AdRequest<?, ?, ?>) null);
        if (z) {
            destroy();
        }
    }

    /* access modifiers changed from: package-private */
    public void expireAdRequests(AdRequest<?, ?, ?> adRequest) {
        for (WeakReference<AdRequest<?, ?, ?>> weakReference : this.weakAdRequestList) {
            AdRequest<?, ?, ?> adRequest2 = (AdRequest) weakReference.get();
            if (!(adRequest2 == null || adRequest2 == adRequest)) {
                adRequest2.processExpired();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearAdRequestList() {
        for (WeakReference<AdRequest<?, ?, ?>> clear : this.weakAdRequestList) {
            clear.clear();
        }
        this.weakAdRequestList.clear();
    }

    private boolean canBeUsedInFuture() {
        return !wasShown() && !isExpired();
    }

    private void release() {
        Logger.log(this.TAG, String.format("release - %s", new Object[]{this}));
        AdResponseManager adResponseManager = AdResponseManager.get();
        if (!canBeUsedInFuture() || !adResponseManager.contains(this)) {
            destroy();
            return;
        }
        clearAdRequestList();
        setStatus(AdResponseStatus.Idle);
        Utils.onUiThread(new Runnable() {
            public final void run() {
                AdResponse.this.lambda$release$0$AdResponse();
            }
        });
    }

    public /* synthetic */ void lambda$release$0$AdResponse() {
        try {
            if (this.adObject != null) {
                this.adObject.hide();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    private AdExtension findAdExtension(Ad ad2) {
        int extProtoCount = ad2.getExtProtoCount();
        if (extProtoCount <= 0) {
            return null;
        }
        int i = 0;
        while (i < extProtoCount) {
            try {
                Any extProto = ad2.getExtProto(i);
                if (extProto.is(AdExtension.class)) {
                    return (AdExtension) extProto.unpack(AdExtension.class);
                }
                i++;
            } catch (Throwable th) {
                Logger.log(th);
            }
        }
        return null;
    }

    private AdCacheControl findAdCacheControl(AdExtension adExtension) {
        AdCacheControl adCacheControl2;
        if (adExtension == null || (adCacheControl2 = adExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) {
            return null;
        }
        return adCacheControl2;
    }

    private NetworkAdUnit findWinnerNetworkAdUnit(AuctionResult auctionResult2, NetworkAdapter networkAdapter) {
        Map<String, String> networkParams = auctionResult2.getNetworkParams();
        String str = networkParams.get(ProtoExtConstants.AD_UNIT_ID);
        NetworkAdUnit networkAdUnit = null;
        if (!TextUtils.isEmpty(str)) {
            for (NetworkAdUnit next : this.networkAdUnitList) {
                if (next.getId().equals(str)) {
                    networkAdUnit = next;
                }
            }
        }
        if (networkAdUnit != null) {
            return networkAdUnit;
        }
        NetworkAdUnit networkAdUnit2 = new NetworkAdUnit(networkAdapter, networkParams);
        this.networkAdUnitList.add(networkAdUnit2);
        return networkAdUnit2;
    }

    private void notifyNetworkClearAuction() {
        if (this.networkAdUnitList.size() != 0) {
            for (NetworkAdUnit next : this.networkAdUnitList) {
                try {
                    next.getNetworkAdapter().clearAuction(next);
                } catch (Throwable unused) {
                }
            }
            this.networkAdUnitList.clear();
        }
    }

    private void extractTrackUrls(Response.Seatbid.Bid bid) {
        OrtbUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationWin, bid.getPurl());
        OrtbUtils.addEvent(this.trackUrlsMap, TrackEventType.MediationLoss, bid.getLurl());
    }

    private void subscribeExpireTracker() {
        if (!this.isExpireTrackerSubscribed.get() && this.expirationTimeMs > 0) {
            this.isExpireTrackerSubscribed.set(true);
            Utils.onBackgroundThread(this.expiredRunnable, this.expirationTimeMs);
        }
    }

    /* access modifiers changed from: private */
    public void unsubscribeExpireTracker() {
        this.isExpireTrackerSubscribed.set(false);
        Utils.cancelBackgroundThreadTask(this.expiredRunnable);
    }

    /* access modifiers changed from: private */
    public void eventFinish(TrackEventType trackEventType) {
        eventFinish(trackEventType, (BMError) null);
    }

    /* access modifiers changed from: private */
    public void eventFinish(TrackEventType trackEventType, BMError bMError) {
        BidMachineEvents.eventFinish(this.trackingObject, trackEventType, getAdsType(), bMError);
    }

    public String toString() {
        return this.auctionResult.toString();
    }

    static class AdProcessCallbackComposite implements AdProcessCallback {
        private final Map<AdProcessCallback, Boolean> adProcessCallbackMap = new WeakHashMap();
        private final AtomicBoolean isClickTracked = new AtomicBoolean(false);
        private final AtomicBoolean isCloseTracked = new AtomicBoolean(false);
        private final AtomicBoolean isFinishTracked = new AtomicBoolean(false);
        private final AtomicBoolean isImpressionTracked = new AtomicBoolean(false);
        private final AtomicBoolean isLoadTracked = new AtomicBoolean(false);
        /* access modifiers changed from: private */
        public final AtomicBoolean isLoaded = new AtomicBoolean(false);
        /* access modifiers changed from: private */
        public final AtomicBoolean isLoading = new AtomicBoolean(false);
        /* access modifiers changed from: private */
        public final AtomicBoolean isResultShownTracked = new AtomicBoolean(false);
        private final AtomicBoolean isShownTracked = new AtomicBoolean(false);
        private final AtomicBoolean isVisibilityTrackerShownTracked = new AtomicBoolean(false);
        private final AtomicBoolean isVisibilityTrackerStarted = new AtomicBoolean(false);
        private final Object mutexCallback = new Object();
        private final WeakReference<AdResponse> weakAdResponse;

        AdProcessCallbackComposite(AdResponse adResponse) {
            this.weakAdResponse = new WeakReference<>(adResponse);
        }

        public void processLoadSuccess() {
            if (!this.isLoadTracked.getAndSet(true)) {
                this.isLoaded.set(true);
                this.isLoading.set(false);
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processLoadSuccess - %s", new Object[]{adResponse}));
                    adResponse.eventFinish(TrackEventType.Load);
                }
                executeOnCallback($$Lambda$WRREy9IB0UF5xgc6CyeFKXVWeo.INSTANCE);
            }
        }

        public void processLoadFail(BMError bMError) {
            if (!this.isLoadTracked.getAndSet(true)) {
                this.isLoaded.set(false);
                this.isLoading.set(false);
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processLoadFail - %s", new Object[]{bMError}));
                    adResponse.eventFinish(TrackEventType.Load, bMError);
                }
                executeOnCallback(new Executable() {
                    public final void execute(Object obj) {
                        ((AdProcessCallback) obj).processLoadFail(BMError.this);
                    }
                });
                processDestroy();
            }
        }

        public void processBeforeStartVisibilityTracker() {
            this.isVisibilityTrackerStarted.set(true);
        }

        public void processFillAd() {
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.log(adResponse.TAG, String.format("processFillAd - %s", new Object[]{adResponse}));
                adResponse.eventFinish(TrackEventType.FillAd);
            }
            executeOnCallback($$Lambda$Coi3flH80HVTxM5aSvKkBVVco0o.INSTANCE);
        }

        public void processShowFail(BMError bMError) {
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.log(adResponse.TAG, String.format("processShowFail - %s", new Object[]{bMError}));
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onShowFailed();
                }
                adResponse.eventFinish(TrackEventType.Show, bMError);
            }
            executeOnCallback(new Executable() {
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processShowFail(BMError.this);
                }
            });
        }

        public void processShown() {
            this.isShownTracked.set(true);
            if (this.isVisibilityTrackerShownTracked.get() || !this.isVisibilityTrackerStarted.get()) {
                processResultShown();
            }
        }

        public boolean processVisibilityTrackerShown(UnifiedAd<?, ?> unifiedAd) {
            this.isVisibilityTrackerShownTracked.set(true);
            if (!this.isShownTracked.get() && unifiedAd.isConsiderNetworkImpressionTracking()) {
                return false;
            }
            processResultShown();
            return true;
        }

        /* access modifiers changed from: package-private */
        public void processResultShown() {
            if (this.isResultShownTracked.compareAndSet(false, true)) {
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processShown - %s", new Object[]{adResponse}));
                    adResponse.unsubscribeExpireTracker();
                    AdResponseManager.get().remove(adResponse);
                    AdObject adObject = adResponse.getAdObject();
                    if (adObject != null) {
                        adObject.onShown();
                    }
                    SessionAdParams sessionAdParams = SessionManager.get().getSessionAdParams(adResponse.getAdsType());
                    sessionAdParams.setLastBundle((String) null);
                    sessionAdParams.setLastAdDomain((String) null);
                    sessionAdParams.addImpression();
                    if (adResponse.getCreativeFormat() == CreativeFormat.Video) {
                        sessionAdParams.addVideoImpression();
                    }
                    Ad ad = adResponse.getAd();
                    Iterator it = ad.getBundleList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (!TextUtils.isEmpty(str)) {
                            sessionAdParams.setLastBundle(str);
                            break;
                        }
                    }
                    Iterator it2 = ad.getAdomainList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        if (!TextUtils.isEmpty(str2)) {
                            sessionAdParams.setLastAdDomain(str2);
                            break;
                        }
                    }
                    adResponse.eventFinish(TrackEventType.Show);
                }
                executeOnCallback($$Lambda$pow44R1ijNt3kckuMiFD4ZV8Qo.INSTANCE);
            }
        }

        public void processVisibilityTrackerImpression() {
            if (!this.isImpressionTracked.getAndSet(true)) {
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processImpression - %s", new Object[]{adResponse}));
                    AdObject adObject = adResponse.getAdObject();
                    if (adObject != null) {
                        adObject.onImpression();
                    }
                    adResponse.eventFinish(TrackEventType.Impression);
                }
                executeOnCallback($$Lambda$nXUupehGBGQEB6rjQcovaig7ngw.INSTANCE);
            }
        }

        public void processClicked() {
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.log(adResponse.TAG, String.format("processClicked - %s", new Object[]{adResponse}));
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onClicked();
                }
                if (!this.isClickTracked.getAndSet(true)) {
                    SessionManager.get().getSessionAdParams(adResponse.getAdsType()).addClick();
                }
                adResponse.eventFinish(TrackEventType.Click);
            }
            executeOnCallback($$Lambda$lQw3nAmPExfdrs76yvzKApuGbG4.INSTANCE);
        }

        public void processFinished() {
            if (!this.isFinishTracked.getAndSet(true)) {
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processFinished - %s", new Object[]{adResponse}));
                    AdObject adObject = adResponse.getAdObject();
                    if (adObject != null) {
                        adObject.onFinished();
                    }
                    if (adResponse.getCreativeFormat() == CreativeFormat.Video) {
                        SessionManager.get().getSessionAdParams(adResponse.getAdsType()).addCompletedVideo();
                    }
                }
                executeOnCallback($$Lambda$GVTc4RQ9JZSfgCFPwNTjpUOfMlI.INSTANCE);
            }
        }

        public void processClosed() {
            if (!this.isCloseTracked.getAndSet(true)) {
                AdResponse adResponse = getAdResponse();
                if (adResponse != null) {
                    Logger.log(adResponse.TAG, String.format("processClosed (%s) - %s", new Object[]{Boolean.valueOf(this.isFinishTracked.get()), adResponse}));
                    AdObject adObject = adResponse.getAdObject();
                    if (adObject != null) {
                        adObject.onClosed(this.isFinishTracked.get());
                    }
                    adResponse.eventFinish(TrackEventType.Close);
                }
                executeOnCallback($$Lambda$ygZ7ti8xYnHz1Kiu6ZnhCC2wnE.INSTANCE);
            }
        }

        public void processExpired() {
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.log(adResponse.TAG, String.format("processExpired - %s", new Object[]{adResponse}));
                AdObject adObject = adResponse.getAdObject();
                if (adObject != null) {
                    adObject.onExpired();
                }
                adResponse.eventFinish(TrackEventType.Expired);
            }
            executeOnCallback($$Lambda$GxTUyBEVWIfDJG4UFw_4pN5W9S8.INSTANCE);
            if (adResponse != null) {
                adResponse.notifyExpired(false);
            }
            processDestroy();
        }

        public void processDestroy() {
            executeOnCallback($$Lambda$tXBJ68YtGnY2mueCb21JfVEC43w.INSTANCE);
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.log(adResponse.TAG, String.format("processDestroy - %s", new Object[]{adResponse}));
                adResponse.destroy();
            }
        }

        private AdResponse getAdResponse() {
            return (AdResponse) this.weakAdResponse.get();
        }

        /* access modifiers changed from: private */
        public boolean isLoading() {
            return this.isLoading.get();
        }

        /* access modifiers changed from: package-private */
        public void appendCallback(AdProcessCallback adProcessCallback) {
            synchronized (this.mutexCallback) {
                this.adProcessCallbackMap.put(adProcessCallback, Boolean.TRUE);
            }
        }

        /* access modifiers changed from: package-private */
        public void removeCallback(AdProcessCallback adProcessCallback) {
            synchronized (this.mutexCallback) {
                this.adProcessCallbackMap.remove(adProcessCallback);
            }
        }

        /* access modifiers changed from: package-private */
        public void executeOnCallback(Executable<AdProcessCallback> executable) {
            synchronized (this.mutexCallback) {
                for (AdProcessCallback next : this.adProcessCallbackMap.keySet()) {
                    if (next != null) {
                        executable.execute(next);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public void destroy() {
            this.weakAdResponse.clear();
            this.adProcessCallbackMap.clear();
        }

        /* access modifiers changed from: package-private */
        public Map<AdProcessCallback, Boolean> getAdProcessCallbackMap() {
            return this.adProcessCallbackMap;
        }
    }

    private static class ExpiredRunnable implements Runnable {
        private final WeakReference<AdResponse> weakAdResponse;

        public ExpiredRunnable(AdResponse adResponse) {
            this.weakAdResponse = new WeakReference<>(adResponse);
        }

        public void run() {
            AdResponse adResponse = (AdResponse) this.weakAdResponse.get();
            if (adResponse != null) {
                adResponse.adCallbackComposite.processExpired();
            }
        }
    }
}
