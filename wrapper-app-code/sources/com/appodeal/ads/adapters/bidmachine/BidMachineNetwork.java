package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.bidmachine.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.BidMachine;
import io.bidmachine.CustomParams;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.utils.BMError;
import org.json.JSONArray;
import org.json.JSONObject;

public class BidMachineNetwork extends AdNetwork<RequestParams> {

    public static final class RequestParams {
        public final CustomParams customParams;
        public final String networksConfig;
        public final PriceFloorParams priceFloorParams;
        public final TargetingParams targetingParams;

        public RequestParams(TargetingParams targetingParams2, PriceFloorParams priceFloorParams2, CustomParams customParams2, String str) {
            this.priceFloorParams = priceFloorParams2;
            this.targetingParams = targetingParams2;
            this.customParams = customParams2;
            this.networksConfig = str;
        }

        public <T extends RequestBuilder<T, ?>> T prepareRequest(T t) {
            t.setTargetingParams(this.targetingParams);
            t.setPriceFloorParams(this.priceFloorParams);
            t.setNetworks(this.networksConfig);
            t.setCustomParams(this.customParams);
            return t;
        }
    }

    public class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TargetingParams f16218a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PriceFloorParams f16219b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ CustomParams f16220c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ JSONArray f16221d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ NetworkInitializationListener f16222e;

        public a(TargetingParams targetingParams, PriceFloorParams priceFloorParams, CustomParams customParams, JSONArray jSONArray, NetworkInitializationListener networkInitializationListener) {
            this.f16218a = targetingParams;
            this.f16219b = priceFloorParams;
            this.f16220c = customParams;
            this.f16221d = jSONArray;
            this.f16222e = networkInitializationListener;
        }

        public final void onInitializationFailed(LoadingError loadingError) {
            this.f16222e.onInitializationFailed(loadingError);
        }

        public final void onInitializationFinished() {
            TargetingParams targetingParams = this.f16218a;
            PriceFloorParams priceFloorParams = this.f16219b;
            CustomParams customParams = this.f16220c;
            JSONArray jSONArray = this.f16221d;
            try {
                this.f16222e.onInitializationFinished(new RequestParams(targetingParams, priceFloorParams, customParams, jSONArray != null ? jSONArray.toString() : null));
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f16222e.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    public static class builder extends AdNetworkBuilder {
        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("io.bidmachine.nativead.view.VideoPlayerActivity").build(), new ActivityRule.Builder("com.explorestack.iab.mraid.MraidActivity").build(), new ActivityRule.Builder("com.explorestack.iab.vast.activity.VastActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.BIDMACHINE;
        }

        public BidMachineNetwork build() {
            return new BidMachineNetwork(this, (a) null);
        }
    }

    public /* synthetic */ BidMachineNetwork(AdNetworkBuilder adNetworkBuilder, a aVar) {
        this(adNetworkBuilder);
    }

    public static Bundle getRequestedAdInfo(AuctionResult auctionResult) {
        if (auctionResult == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        String str = auctionResult.getNetworkParams().get("appodeal_id");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(OSOutcomeConstants.OUTCOME_ID, str);
        }
        bundle.putString("demand_source", auctionResult.getDemandSource());
        bundle.putDouble("ecpm", auctionResult.getPrice());
        return bundle;
    }

    public static LoadingError mapBidMachineError(BMError bMError) {
        if (bMError != null) {
            if (BMError.NoConnection.getCode() == bMError.getCode()) {
                return LoadingError.ConnectionError;
            }
            if (BMError.TimeoutError.getCode() == bMError.getCode()) {
                return LoadingError.TimeoutError;
            }
            if (103 == bMError.getCode()) {
                return LoadingError.NoFill;
            }
            if (101 == bMError.getCode()) {
                return LoadingError.IncorrectAdunit;
            }
            if (108 == bMError.getCode()) {
                return LoadingError.InternalError;
            }
            if (BMError.Server.getCode() == bMError.getCode()) {
                return LoadingError.ServerError;
            }
            if (BMError.AlreadyShown.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (BMError.Destroyed.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (BMError.Expired.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (110 == bMError.getCode()) {
                return LoadingError.RequestError;
            }
        }
        return LoadingError.InternalError;
    }

    public static void printError(UnifiedAdCallback unifiedAdCallback, BMError bMError) {
        if (bMError != null) {
            unifiedAdCallback.printError(bMError.getMessage(), Integer.valueOf(bMError.getCode()));
        }
    }

    public UnifiedBanner<RequestParams> createBanner() {
        return new com.appodeal.ads.adapters.bidmachine.banner.a();
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new com.appodeal.ads.adapters.bidmachine.interstitial.a();
    }

    public UnifiedMrec<RequestParams> createMrec() {
        return new com.appodeal.ads.adapters.bidmachine.mrec.a();
    }

    public UnifiedNative<RequestParams> createNativeAd() {
        return new com.appodeal.ads.adapters.bidmachine.native_ad.a();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new com.appodeal.ads.adapters.bidmachine.rewarded_video.a();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new com.appodeal.ads.adapters.bidmachine.video.a();
    }

    public String getRecommendedVersion() {
        return "2.1.5";
    }

    public String getVersion() {
        return "2.1.5";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        JSONObject jsonData = adUnit.getJsonData();
        Context applicationContext = contextProvider.getApplicationContext();
        if (jsonData == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        b.a().a(applicationContext, jsonData, adNetworkMediationParams, new a(c.a(applicationContext, jsonData, adNetworkMediationParams.getRestrictedData()), c.a(jsonData.optString("price_floors")), c.a(jsonData.optJSONObject("custom_parameters")), jsonData.optJSONArray("mediation_config"), networkInitializationListener));
    }

    public void setLogging(boolean z) {
        BidMachine.setLoggingEnabled(z);
    }

    private BidMachineNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }
}
