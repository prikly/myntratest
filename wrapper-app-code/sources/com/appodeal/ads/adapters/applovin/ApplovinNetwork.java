package com.appodeal.ads.adapters.applovin;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.applovin.banner.a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;
import org.json.JSONObject;

public class ApplovinNetwork extends AdNetwork<RequestParams> {
    private boolean loggingLevel;

    public static final class RequestParams {
        public JSONObject jsonData;
        public RestrictedData restrictedData;
        public AppLovinSdk sdk;
        public String zoneId;

        public RequestParams(String str, AppLovinSdk appLovinSdk, JSONObject jSONObject) {
            this.zoneId = str;
            this.sdk = appLovinSdk;
            this.jsonData = jSONObject;
        }

        public RequestParams(JSONObject jSONObject, RestrictedData restrictedData2) {
            this.jsonData = jSONObject;
            this.restrictedData = restrictedData2;
        }
    }

    public static class builder extends AdNetworkBuilder {
        public ApplovinNetwork build() {
            return new ApplovinNetwork(this);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.applovin.adview.AppLovinFullscreenActivity").build(), new ActivityRule.Builder("com.applovin.sdk.AppLovinWebViewActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.APPLOVIN;
        }
    }

    public ApplovinNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    static /* synthetic */ void lambda$initialize$0(NetworkInitializationListener networkInitializationListener, String str, AppLovinSdk appLovinSdk, AdUnit adUnit, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        try {
            networkInitializationListener.onInitializationFinished(new RequestParams(str, appLovinSdk, adUnit.getJsonData()));
        } catch (Exception unused) {
            networkInitializationListener.onInitializationFailed(LoadingError.InternalError);
        }
    }

    private void setMediatorName(AppLovinSdk appLovinSdk, String str) {
        if (!TextUtils.isEmpty(str)) {
            appLovinSdk.setMediationProvider(str);
        }
    }

    public UnifiedBanner<RequestParams> createBanner() {
        return new a();
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new com.appodeal.ads.adapters.applovin.interstitial.a();
    }

    public UnifiedMrec<RequestParams> createMrec() {
        return new com.appodeal.ads.adapters.applovin.mrec.a();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new com.appodeal.ads.adapters.applovin.rewarded_video.a();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new com.appodeal.ads.adapters.applovin.video.a();
    }

    public String getRecommendedVersion() {
        return "11.6.1";
    }

    public String getVersion() {
        return AppLovinSdk.VERSION;
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) throws Exception {
        RestrictedData restrictedData = adNetworkMediationParams.getRestrictedData();
        Context applicationContext = contextProvider.getApplicationContext();
        if (adUnit.getJsonData().has("url")) {
            networkInitializationListener.onInitializationFinished(new RequestParams(adUnit.getJsonData(), restrictedData));
            return;
        }
        String string = adUnit.getJsonData().getString("applovin_key");
        String optString = adUnit.getJsonData().optString("zone_id");
        AppLovinSdk instance = AppLovinSdk.getInstance(string, new AppLovinSdkSettings(applicationContext), applicationContext);
        AppLovinSdkSettings settings = instance.getSettings();
        settings.setVerboseLogging(this.loggingLevel);
        Boolean isMuted = adUnit.isMuted();
        if (isMuted != null) {
            settings.setMuted(isMuted.booleanValue());
        }
        instance.initializeSdk((AppLovinSdk.SdkInitializationListener) new AppLovinSdk.SdkInitializationListener(optString, instance, adUnit) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AppLovinSdk f$2;
            public final /* synthetic */ AdUnit f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                ApplovinNetwork.lambda$initialize$0(NetworkInitializationListener.this, this.f$1, this.f$2, this.f$3, appLovinSdkConfiguration);
            }
        });
        updateConsent(applicationContext, restrictedData);
        setMediatorName(instance, adUnit.getMediatorName());
    }

    public void setLogging(boolean z) {
        this.loggingLevel = z;
    }

    public void updateConsent(Context context, RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            AppLovinPrivacySettings.setHasUserConsent(restrictedData.isUserHasConsent(), context);
        } else if (restrictedData.isUserInCcpaScope()) {
            AppLovinPrivacySettings.setDoNotSell(restrictedData.isUserHasConsent(), context);
        }
        AppLovinPrivacySettings.setIsAgeRestrictedUser(restrictedData.isUserAgeRestricted(), context);
    }
}
