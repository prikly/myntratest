package com.appodeal.ads.adapters.admob.unified;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.ActivityRule;
import com.appodeal.ads.utils.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public abstract class UnifiedAdmobNetwork<AdRequestType extends AdRequest, AdRequestBuilderType extends AdRequest.Builder> extends AdNetwork<UnifiedAdmobRequestParams<AdRequestType>> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean isInitialized = false;

    public static abstract class builder extends AdNetworkBuilder {
        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder(AdActivity.CLASS_NAME).build()};
        }
    }

    public UnifiedAdmobNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    private UnifiedAdmobRequestParams<AdRequestType> createParams(AdRequestType adrequesttype, String str, Boolean bool, boolean z, boolean z2) {
        return new UnifiedAdmobRequestParams(adrequesttype, str, bool, z, z2);
    }

    public static <AdRequestType extends AdRequest> LoadingError mapError(LoadAdError loadAdError) {
        if (loadAdError == null) {
            return null;
        }
        int code = loadAdError.getCode();
        if (code != 0) {
            if (code == 1) {
                return LoadingError.IncorrectAdunit;
            }
            if (code == 2) {
                return LoadingError.ConnectionError;
            }
            if (code != 3) {
                return null;
            }
        }
        return LoadingError.NoFill;
    }

    private String obtainTestDevice(Context context) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(Settings.Secure.getString(context.getContentResolver(), "android_id").getBytes(StandardCharsets.UTF_8))).toString(16).toUpperCase(Locale.ENGLISH);
        } catch (Exception e2) {
            Log.log(e2);
            return "B3EEABB8EE11C2BE770B684D95219ECB";
        }
    }

    private void setConsent(AdRequestBuilderType adrequestbuildertype, AdNetworkMediationParams adNetworkMediationParams) {
        RestrictedData restrictedData = adNetworkMediationParams.getRestrictedData();
        if (restrictedData.isUserGdprProtected()) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            adrequestbuildertype.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        }
        if (!restrictedData.isUserCcpaProtected()) {
            return;
        }
        if (TextUtils.isEmpty(restrictedData.getUSPrivacyString())) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("rdp", "1");
            adrequestbuildertype.addNetworkExtrasBundle(AdMobAdapter.class, bundle2);
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("IABUSPrivacy_String", restrictedData.getUSPrivacyString());
        adrequestbuildertype.addNetworkExtrasBundle(AdMobAdapter.class, bundle3);
    }

    private void setMediatorName(AdRequestBuilderType adrequestbuildertype, String str) {
        if (!TextUtils.isEmpty(str)) {
            adrequestbuildertype.setRequestAgent(str);
        }
    }

    private void setTargeting(Context context, RequestConfiguration.Builder builder2, AdNetworkMediationParams adNetworkMediationParams) {
        builder2.setTagForChildDirectedTreatment(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted() ? 1 : 0);
        if (adNetworkMediationParams.isTestMode()) {
            builder2.setTestDeviceIds(Arrays.asList(new String[]{obtainTestDevice(context), "B3EEABB8EE11C2BE770B684D95219ECB"}));
        }
    }

    public AdRequestType configureAdRequest(Context context, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams) {
        AdRequest.Builder createAdRequestBuilder = createAdRequestBuilder(adUnit.getJsonData());
        RequestConfiguration.Builder builder2 = MobileAds.getRequestConfiguration().toBuilder();
        setMediatorName(createAdRequestBuilder, adUnit.getMediatorName());
        setConsent(createAdRequestBuilder, adNetworkMediationParams);
        setTargeting(context, builder2, adNetworkMediationParams);
        MobileAds.setRequestConfiguration(builder2.build());
        return createAdRequest(createAdRequestBuilder);
    }

    public abstract AdRequestType createAdRequest(AdRequestBuilderType adrequestbuildertype);

    public abstract AdRequestBuilderType createAdRequestBuilder(JSONObject jSONObject);

    public String getRecommendedVersion() {
        return BuildConfig.ADAPTER_SDK_VERSION;
    }

    public String getVersion() {
        return MobileAds.getVersion().toString();
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<UnifiedAdmobRequestParams<AdRequestType>> networkInitializationListener) {
        JSONObject jsonData = adUnit.getJsonData();
        String string = jsonData.getString("admob_key");
        boolean optBoolean = jsonData.optBoolean("use_adaptive_banner", false);
        boolean optBoolean2 = jsonData.optBoolean("use_smart_banner", false);
        Boolean isMuted = adUnit.isMuted();
        Context applicationContext = contextProvider.getApplicationContext();
        if (!isInitialized) {
            isInitialized = true;
            MobileAds.initialize(applicationContext);
            if (isMuted != null) {
                MobileAds.setAppMuted(isMuted.booleanValue());
            }
        }
        networkInitializationListener.onInitializationFinished(createParams(configureAdRequest(applicationContext, adUnit, adNetworkMediationParams), string, isMuted, optBoolean, optBoolean2));
    }

    public boolean isSupportSmartBanners() {
        return true;
    }
}
