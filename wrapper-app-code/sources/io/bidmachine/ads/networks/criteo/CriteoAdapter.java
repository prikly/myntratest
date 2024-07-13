package io.bidmachine.ads.networks.criteo;

import android.app.Application;
import android.text.TextUtils;
import com.criteo.publisher.Bid;
import com.criteo.publisher.BidResponseListener;
import com.criteo.publisher.Criteo;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.model.AdUnit;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CriteoAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    CriteoAdapter() {
        super(BuildConfig.ADAPTER_NAME, "4.6.0", BuildConfig.ADAPTER_VERSION_NAME, 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial});
    }

    public UnifiedBannerAd createBanner() {
        return new CriteoBanner();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new CriteoInterstitial();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return Criteo.getInstance() != null;
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Map<String, String> obtainNetworkParams = networkConfigParams.obtainNetworkParams();
        if (obtainNetworkParams == null) {
            networkInitializationCallback.onFail("Network parameters not found");
            return;
        }
        String str = obtainNetworkParams.get("publisher_id");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail(String.format("%s not provided", new Object[]{"publisher_id"}));
            return;
        }
        List<AdUnit> extractAdUnits = CriteoAdUnitStorage.extractAdUnits(networkConfigParams);
        if (extractAdUnits == null || extractAdUnits.size() == 0) {
            networkInitializationCallback.onFail("AdUnits not found");
            return;
        }
        new Criteo.Builder((Application) contextProvider.getApplicationContext(), str).debugLogsEnabled(initializationParams.isTestMode()).adUnits(extractAdUnits).init();
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("ad_unit_id"));
            return;
        }
        AdUnit adUnit = CriteoAdUnitStorage.getAdUnit(mediationParameter);
        if (adUnit == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("AdUnit"));
        } else {
            Criteo.getInstance().loadBid(adUnit, new BidResponseListener(mediationParameter, headerBiddingCollectParamsCallback) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ HeaderBiddingCollectParamsCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onResponse(Bid bid) {
                    CriteoAdapter.lambda$onCollectHeaderBiddingParams$0(NetworkAdUnit.this, this.f$1, this.f$2, bid);
                }
            });
        }
    }

    static /* synthetic */ void lambda$onCollectHeaderBiddingParams$0(NetworkAdUnit networkAdUnit, String str, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback, Bid bid) {
        if (bid != null) {
            CriteoBidTokenStorage.storeBid(networkAdUnit, bid);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_unit_id", str);
            hashMap.put(InAppPurchaseMetaData.KEY_PRICE, String.valueOf(bid.getPrice()));
            headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
            return;
        }
        headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("Bid"));
    }

    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        CriteoBidTokenStorage.takeBid(networkAdUnit);
    }

    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        CriteoBidTokenStorage.takeBid(networkAdUnit);
    }

    /* renamed from: io.bidmachine.ads.networks.criteo.CriteoAdapter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$criteo$publisher$CriteoErrorCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.criteo.publisher.CriteoErrorCode[] r0 = com.criteo.publisher.CriteoErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$criteo$publisher$CriteoErrorCode = r0
                com.criteo.publisher.CriteoErrorCode r1 = com.criteo.publisher.CriteoErrorCode.ERROR_CODE_NO_FILL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$criteo$publisher$CriteoErrorCode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.CriteoErrorCode r1 = com.criteo.publisher.CriteoErrorCode.ERROR_CODE_NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.criteo.CriteoAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    static BMError mapError(CriteoErrorCode criteoErrorCode) {
        int i = AnonymousClass1.$SwitchMap$com$criteo$publisher$CriteoErrorCode[criteoErrorCode.ordinal()];
        if (i == 1) {
            return BMError.noFill();
        }
        if (i != 2) {
            return BMError.internal("Unknown error");
        }
        return BMError.NoConnection;
    }
}
