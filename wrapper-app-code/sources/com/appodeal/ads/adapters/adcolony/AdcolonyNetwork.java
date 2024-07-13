package com.appodeal.ads.adapters.adcolony;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.text.TextUtils;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdOptions;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;
import com.appodeal.ads.utils.Log;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class AdcolonyNetwork extends AdNetwork<RequestParams> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static String cachedSdkVersion = null;
    private static boolean isInitialized = false;
    private static boolean isInitializing = false;

    public static final class RequestParams {
        public final AdColonyAdOptions adOptions;
        public final String zoneId;

        public RequestParams(String str, AdColonyAdOptions adColonyAdOptions) {
            this.zoneId = str;
            this.adOptions = adColonyAdOptions;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16178a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appodeal.ads.UserSettings$Gender[] r0 = com.appodeal.ads.UserSettings.Gender.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16178a = r0
                com.appodeal.ads.UserSettings$Gender r1 = com.appodeal.ads.UserSettings.Gender.MALE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16178a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appodeal.ads.UserSettings$Gender r1 = com.appodeal.ads.UserSettings.Gender.FEMALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.adcolony.AdcolonyNetwork.a.<clinit>():void");
        }
    }

    public static class builder extends AdNetworkBuilder {
        public AdcolonyNetwork build() {
            return new AdcolonyNetwork(this);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.adcolony.sdk.AdColonyInterstitialActivity").build(), new ActivityRule.Builder("com.adcolony.sdk.AdColonyAdViewActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "adcolony";
        }
    }

    public AdcolonyNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] getZones(org.json.JSONObject r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0040
            int r1 = r7.length()
            if (r1 <= 0) goto L_0x0040
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x003c }
            r1.<init>()     // Catch:{ Exception -> 0x003c }
            java.util.Iterator r2 = r7.keys()     // Catch:{ Exception -> 0x003c }
        L_0x0012:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x003c }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x003c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x003c }
            org.json.JSONArray r3 = r7.getJSONArray(r3)     // Catch:{ Exception -> 0x003c }
            r4 = 0
        L_0x0023:
            int r5 = r3.length()     // Catch:{ Exception -> 0x003c }
            if (r4 >= r5) goto L_0x0012
            java.lang.String r5 = r3.getString(r4)     // Catch:{ Exception -> 0x003c }
            r1.add(r5)     // Catch:{ Exception -> 0x003c }
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0033:
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ Exception -> 0x003c }
            java.lang.Object[] r7 = r1.toArray(r7)     // Catch:{ Exception -> 0x003c }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ Exception -> 0x003c }
            goto L_0x0041
        L_0x003c:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r7 != 0) goto L_0x0048
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r7[r0] = r8
        L_0x0048:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.adcolony.AdcolonyNetwork.getZones(org.json.JSONObject, java.lang.String):java.lang.String[]");
    }

    private void setMediatorName(AdColonyAppOptions adColonyAppOptions, String str) {
        if (!TextUtils.isEmpty(str)) {
            adColonyAppOptions.setMediationNetwork(str, Appodeal.getVersion());
        }
    }

    private AdColonyAdOptions setTargeting(Context context, RestrictedData restrictedData) {
        String str;
        AdColonyUserMetadata adColonyUserMetadata = new AdColonyUserMetadata();
        Integer age = restrictedData.getAge();
        if (age != null) {
            adColonyUserMetadata.setUserAge(age.intValue());
        }
        UserSettings.Gender gender = restrictedData.getGender();
        if (gender != null) {
            int i = a.f16178a[gender.ordinal()];
            if (i == 1) {
                str = AdColonyUserMetadata.USER_MALE;
            } else if (i == 2) {
                str = AdColonyUserMetadata.USER_FEMALE;
            }
            adColonyUserMetadata.setUserGender(str);
        }
        String zip = restrictedData.getZip();
        if (zip != null) {
            adColonyUserMetadata.setUserZipCode(zip);
        }
        Location deviceLocation = restrictedData.getLocation(context).getDeviceLocation();
        if (deviceLocation != null) {
            adColonyUserMetadata.setUserLocation(deviceLocation);
        }
        return new AdColonyAdOptions().setUserMetadata(adColonyUserMetadata);
    }

    public boolean canLoadRewardedWhenDisplaying() {
        return false;
    }

    public boolean canLoadVideoWhenDisplaying() {
        return false;
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new com.appodeal.ads.adapters.adcolony.rewarded_video.a();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new com.appodeal.ads.adapters.adcolony.video.a();
    }

    public String getRecommendedVersion() {
        return io.bidmachine.ads.networks.adcolony.BuildConfig.ADAPTER_SDK_VERSION_NAME;
    }

    public String getVersion() {
        if (isInitialized) {
            return AdColony.getSDKVersion();
        }
        try {
            String str = cachedSdkVersion;
            if (str != null) {
                return str;
            }
            Class<?> cls = Class.forName("com.adcolony.sdk.q");
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("I", new Class[0]);
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(newInstance, new Object[0]);
            cachedSdkVersion = str2;
            return str2;
        } catch (Throwable th) {
            Log.log(th);
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        RequestParams requestParams;
        String string = adUnit.getJsonData().getString("zone_id");
        JSONObject jSONObject = adUnit.getJsonData().getJSONObject("zones");
        String string2 = adUnit.getJsonData().getString("store");
        String string3 = adUnit.getJsonData().getString(OSOutcomeConstants.APP_ID);
        String optString = adUnit.getJsonData().optString("consent_string");
        Context applicationContext = contextProvider.getApplicationContext();
        AdColonyAppOptions appOptions = AdColony.getAppOptions();
        if (appOptions == null) {
            appOptions = new AdColonyAppOptions();
        }
        appOptions.setOriginStore(string2);
        appOptions.setKeepScreenOn(true);
        updatePrivacy(adNetworkMediationParams.getRestrictedData(), appOptions, optString);
        setMediatorName(appOptions, adUnit.getMediatorName());
        if (isInitialized) {
            AdColony.setAppOptions(appOptions);
            requestParams = new RequestParams(string, setTargeting(applicationContext, adNetworkMediationParams.getRestrictedData()));
        } else if (isInitializing) {
            requestParams = new RequestParams(string, setTargeting(applicationContext, adNetworkMediationParams.getRestrictedData()));
        } else {
            try {
                appOptions.setAppVersion(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.log(e2);
            }
            isInitializing = true;
            AdColony.configure((Application) applicationContext, appOptions, string3, getZones(jSONObject, string));
            isInitialized = true;
            isInitializing = false;
            requestParams = new RequestParams(string, setTargeting(applicationContext, adNetworkMediationParams.getRestrictedData()));
        }
        networkInitializationListener.onInitializationFinished(requestParams);
    }

    public void updatePrivacy(RestrictedData restrictedData, AdColonyAppOptions adColonyAppOptions, String str) {
        String str2 = "1";
        if (restrictedData.isUserInGdprScope()) {
            if (TextUtils.isEmpty(str)) {
                str = restrictedData.getIabConsentString();
                if (TextUtils.isEmpty(str)) {
                    str = restrictedData.isUserHasConsent() ? str2 : BuildConfig.ADAPTER_VERSION;
                }
            }
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, true).setPrivacyConsentString(AdColonyAppOptions.GDPR, str);
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (!TextUtils.isEmpty(uSPrivacyString)) {
                str2 = uSPrivacyString;
            } else if (!restrictedData.isUserHasConsent()) {
                str2 = BuildConfig.ADAPTER_VERSION;
            }
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, true).setPrivacyConsentString(AdColonyAppOptions.CCPA, str2);
        }
        adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.COPPA, restrictedData.isUserAgeRestricted());
    }

    public LoadingError verifyLoadAvailability(AdType adType) {
        return ((adType == AdType.Video || adType == AdType.Rewarded) && (isVideoShowing() || isRewardedShowing())) ? LoadingError.Canceled : super.verifyLoadAvailability(adType);
    }
}
