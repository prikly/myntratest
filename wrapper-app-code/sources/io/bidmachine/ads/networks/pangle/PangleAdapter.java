package io.bidmachine.ads.networks.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.core.AdapterLogger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class PangleAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    PangleAdapter() {
        super("pangle_sdk", "4.5.0.6", BuildConfig.ADAPTER_VERSION_NAME, 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public UnifiedBannerAd createBanner() {
        return new PangleBannerAd();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new PangleInterstitialAd();
    }

    public UnifiedFullscreenAd createRewarded() {
        return new PangleRewardedAd();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return TTAdSdk.isInitSuccess();
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Map<String, String> obtainNetworkParams = networkConfigParams.obtainNetworkParams();
        if (obtainNetworkParams == null) {
            networkInitializationCallback.onFail("Network parameters not found");
            return;
        }
        String str = obtainNetworkParams.get(OSOutcomeConstants.APP_ID);
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail(String.format("%s not provided", new Object[]{OSOutcomeConstants.APP_ID}));
            return;
        }
        DataRestrictions dataRestrictions = initializationParams.getDataRestrictions();
        final Context applicationContext = contextProvider.getApplicationContext();
        final TTAdConfig build = new TTAdConfig.Builder().appId(str).debug(initializationParams.isTestMode()).coppa(toPangleCoppa(dataRestrictions)).setGDPR(toPangleGDPR(dataRestrictions)).data(createPangleData()).build();
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    TTAdSdk.init(applicationContext, build, new TTAdSdk.InitCallback() {
                        public void success() {
                            networkInitializationCallback.onSuccess();
                        }

                        public void fail(int i, String str) {
                            networkInitializationCallback.onFail(str);
                        }
                    });
                } catch (Throwable th) {
                    AdapterLogger.logThrowable(th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Exception {
        String mediationParameter = networkAdUnit.getMediationParameter(OSOutcomeConstants.APP_ID);
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter(OSOutcomeConstants.APP_ID));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("slot_id");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("slot_id"));
            return;
        }
        configure(unifiedAdRequestParams.getDataRestrictions());
        String biddingToken = TTAdSdk.getAdManager().getBiddingToken();
        if (TextUtils.isEmpty(biddingToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("network_bid_token"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OSOutcomeConstants.APP_ID, mediationParameter);
        hashMap.put("slot_id", mediationParameter2);
        hashMap.put("network_bid_token", biddingToken);
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    private void configure(DataRestrictions dataRestrictions) {
        TTAdSdk.setCoppa(toPangleCoppa(dataRestrictions));
        TTAdSdk.setGdpr(toPangleGDPR(dataRestrictions));
    }

    private int toPangleCoppa(DataRestrictions dataRestrictions) {
        return dataRestrictions.isUserAgeRestricted() ? 1 : 0;
    }

    private int toPangleGDPR(DataRestrictions dataRestrictions) {
        return dataRestrictions.isUserGdprProtected() ? 1 : 0;
    }

    private String createPangleData() {
        try {
            return new JSONArray().put(new JSONObject().put("name", "mediation").put(AppMeasurementSdk.ConditionalUserProperty.VALUE, BidMachine.NAME)).put(new JSONObject().put("name", "adapter_version").put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "2.1.5")).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
