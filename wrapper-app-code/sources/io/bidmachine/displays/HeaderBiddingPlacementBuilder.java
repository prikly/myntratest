package io.bidmachine.displays;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineEvents;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.SimpleTrackingObject;
import io.bidmachine.TrackEventInfo;
import io.bidmachine.TrackEventType;
import io.bidmachine.TrackingObject;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class HeaderBiddingPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    private static final long DEFAULT_HB_PREPARE_TIMEOUT_SEC = 10;

    HeaderBiddingPlacementBuilder() {
    }

    /* access modifiers changed from: package-private */
    public Message.Builder createPlacement(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, AdContentType adContentType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) {
        AdsType adsType2 = adsType;
        int i2 = i;
        ArrayList<AdUnitPreloadTask> arrayList = new ArrayList<>();
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig next = it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(next.getNetworkKey());
            ContextProvider contextProvider2 = contextProvider;
            if (adapter instanceof HeaderBiddingAdapter) {
                UnifiedAdRequestParamsType unifiedadrequestparamstype2 = unifiedadrequestparamstype;
                AdContentType adContentType2 = adContentType;
                if (adapter.isInitialized(contextProvider2)) {
                    for (Map<String, String> networkAdUnit : next.peekMediationConfig(adsType2, unifiedadrequestparamstype2, adContentType2)) {
                        NetworkAdUnit networkAdUnit2 = new NetworkAdUnit(adapter, networkAdUnit);
                        list.add(networkAdUnit2);
                        Iterator<NetworkConfig> it2 = it;
                        AdUnitPreloadTask adUnitPreloadTask = r1;
                        AdUnitPreloadTask adUnitPreloadTask2 = new AdUnitPreloadTask(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType, unifiedadrequestparamstype, networkAdUnit2);
                        arrayList.add(adUnitPreloadTask);
                        it = it2;
                    }
                }
            } else {
                UnifiedAdRequestParamsType unifiedadrequestparamstype3 = unifiedadrequestparamstype;
                AdContentType adContentType3 = adContentType;
            }
            it = it;
        }
        if (!arrayList.isEmpty()) {
            SimpleTrackingObject simpleTrackingObject = new SimpleTrackingObject();
            BidMachineEvents.eventStart(simpleTrackingObject, TrackEventType.HeaderBiddingNetworksPrepare);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                for (AdUnitPreloadTask execute : arrayList) {
                    execute.execute(countDownLatch);
                }
                countDownLatch.await(i2 > 0 ? (long) i2 : DEFAULT_HB_PREPARE_TIMEOUT_SEC, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Logger.log((Throwable) e2);
            } catch (Throwable th) {
                BidMachineEvents.eventFinish(simpleTrackingObject, TrackEventType.HeaderBiddingNetworksPrepare, adsType2, (BMError) null);
                throw th;
            }
            ArrayList arrayList2 = null;
            for (AdUnitPreloadTask adUnitPreloadTask3 : arrayList) {
                HeaderBiddingPlacement.AdUnit adUnit = adUnitPreloadTask3.getAdUnit();
                if (adUnit != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(adUnit);
                } else if (!adUnitPreloadTask3.isFinished()) {
                    adUnitPreloadTask3.cancel();
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                BidMachineEvents.eventFinish(simpleTrackingObject, TrackEventType.HeaderBiddingNetworksPrepare, adsType2, (BMError) null);
            } else {
                HeaderBiddingPlacement.Builder newBuilder = HeaderBiddingPlacement.newBuilder();
                newBuilder.addAllAdUnits(arrayList2);
                BidMachineEvents.eventFinish(simpleTrackingObject, TrackEventType.HeaderBiddingNetworksPrepare, adsType2, (BMError) null);
                return newBuilder;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public AdObjectParams createAdObjectParams(Ad ad) {
        HeaderBiddingAd obtainHeaderBiddingAd = obtainHeaderBiddingAd(ad);
        if (obtainHeaderBiddingAd != null) {
            return new HeaderBiddingAdObjectParams(ad, obtainHeaderBiddingAd);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public HeaderBiddingAd obtainHeaderBiddingAd(Ad ad) {
        HeaderBiddingAd headerBiddingAd = null;
        if (ad.hasDisplay()) {
            Ad.Display display = ad.getDisplay();
            if (display.hasBanner()) {
                headerBiddingAd = obtainHeaderBiddingAd(display.getBanner().getExtProtoList());
            }
            if (headerBiddingAd == null && display.hasNative()) {
                headerBiddingAd = obtainHeaderBiddingAd(display.getNative().getExtProtoList());
            }
        }
        return (headerBiddingAd != null || !ad.hasVideo()) ? headerBiddingAd : obtainHeaderBiddingAd(ad.getVideo().getExtProtoList());
    }

    private HeaderBiddingAd obtainHeaderBiddingAd(List<Any> list) {
        for (Any next : list) {
            if (next.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) next.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e2) {
                    Logger.log((Throwable) e2);
                }
            }
        }
        return null;
    }

    private static final class AdUnitPreloadTask<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> implements HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback, Runnable {
        private static final Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        private final AdContentType adContentType;
        private final UnifiedAdRequestParamsType adRequestParams;
        private HeaderBiddingPlacement.AdUnit adUnit;
        private final HeaderBiddingAdapter adapter;
        private final AdsType adsType;
        private final ContextProvider contextProvider;
        private boolean isFinished = false;
        private final NetworkAdUnit networkAdUnit;
        private CountDownLatch syncLock;
        private final TrackingObject trackingObject;

        AdUnitPreloadTask(ContextProvider contextProvider2, HeaderBiddingAdapter headerBiddingAdapter, AdsType adsType2, AdContentType adContentType2, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit2) {
            this.contextProvider = contextProvider2;
            this.adapter = headerBiddingAdapter;
            this.adsType = adsType2;
            this.adContentType = adContentType2;
            this.adRequestParams = unifiedadrequestparamstype;
            this.networkAdUnit = networkAdUnit2;
            this.trackingObject = new SimpleTrackingObject();
        }

        public AdsType getAdsType() {
            return this.adsType;
        }

        public AdContentType getAdContentType() {
            return this.adContentType;
        }

        public void run() {
            try {
                this.adapter.collectHeaderBiddingParams(this.contextProvider, this.adRequestParams, this.networkAdUnit, this, this);
            } catch (Throwable th) {
                Logger.log(th);
                onCollectFail(BMError.internal("Exception when collecting header bidding parameters"));
            }
        }

        public void onCollectFinished(Map<String, String> map) {
            if (!this.isFinished) {
                this.adUnit = HeaderBiddingPlacement.AdUnit.newBuilder().setBidder(this.adapter.getKey()).setBidderSdkver(this.adapter.getSdkVersion()).putClientParams(ProtoExtConstants.AD_UNIT_ID, this.networkAdUnit.getId()).putAllClientParams(this.networkAdUnit.getMediationConfig()).putAllClientParams(map).build();
                Logger.log(this.adapter.getKey(), String.format("%s (%s) - Header bidding collect finished", new Object[]{this.adsType, this.adContentType}));
                finish();
                BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.HeaderBiddingNetworkPrepare, this.adsType, (BMError) null);
            }
        }

        public void onCollectFail(BMError bMError) {
            if (!this.isFinished) {
                Logger.log(this.adapter.getKey(), String.format("%s (%s) - Header bidding collect fail - %s", new Object[]{this.adsType, this.adContentType, bMError}));
                finish();
                BidMachineEvents.eventFinish(this.trackingObject, TrackEventType.HeaderBiddingNetworkPrepare, this.adsType, bMError);
            }
        }

        /* access modifiers changed from: package-private */
        public void execute(CountDownLatch countDownLatch) {
            BidMachineEvents.eventStart(this.trackingObject, TrackEventType.HeaderBiddingNetworkPrepare, new TrackEventInfo().withParameter("HB_NETWORK", this.adapter.getKey()).withParameter("BM_AD_TYPE", this.adsType.getName()));
            this.syncLock = countDownLatch;
            executor.execute(this);
        }

        /* access modifiers changed from: package-private */
        public void cancel() {
            if (!this.isFinished) {
                Logger.log(this.adapter.getKey(), String.format("%s (%s) - Header bidding collect fail: timeout", new Object[]{this.adsType, this.adContentType}));
                finish();
            }
        }

        /* access modifiers changed from: package-private */
        public HeaderBiddingPlacement.AdUnit getAdUnit() {
            return this.adUnit;
        }

        /* access modifiers changed from: package-private */
        public boolean isFinished() {
            return this.isFinished;
        }

        private void finish() {
            this.isFinished = true;
            this.syncLock.countDown();
        }
    }
}
