package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    public final n coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static class a extends AppLovinSdkSettings {
        a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(n nVar) {
        this.coreSdk = nVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(e.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        } else if (context != null) {
            synchronized (sdkInstancesLock) {
                if (sdkInstances.containsKey(str)) {
                    AppLovinSdk appLovinSdk = sdkInstances.get(str);
                    return appLovinSdk;
                }
                if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                    v.i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                    if (!sdkInstances.isEmpty()) {
                        AppLovinSdk next = sdkInstances.values().iterator().next();
                        return next;
                    }
                    str = str.replace(File.separator, "");
                }
                n nVar = new n();
                nVar.a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(nVar);
                nVar.a(appLovinSdk2);
                appLovinSdkSettings.attachAppLovinSdk(nVar);
                sdkInstances.put(str, appLovinSdk2);
                return appLovinSdk2;
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private static String getVersion() {
        return "11.6.1";
    }

    private static int getVersionCode() {
        return 11060199;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance = getInstance(context);
            if (instance != null) {
                instance.initializeSdk(sdkInitializationListener);
            } else {
                v.i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk next : sdkInstances.values()) {
                next.coreSdk.b();
                next.coreSdk.i();
                if (bool != null) {
                    next.coreSdk.D();
                    if (v.a()) {
                        v D = next.coreSdk.D();
                        D.c(TAG, "Toggled 'huc' to " + bool);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool.toString()));
                }
                if (bool2 != null) {
                    next.coreSdk.D();
                    if (v.a()) {
                        v D2 = next.coreSdk.D();
                        D2.c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool2.toString()));
                }
                if (bool3 != null) {
                    next.coreSdk.D();
                    if (v.a()) {
                        v D3 = next.coreSdk.D();
                        D3.c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    next.getEventService().trackEvent(AppLovinSdkExtraParameterKey.DO_NOT_SELL, CollectionUtils.map(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.v();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a2 = c.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a2.length());
        for (int i = 0; i < a2.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a2, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.t();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.x();
    }

    public String getMediationProvider() {
        return this.coreSdk.u();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.aa();
    }

    public String getSdkKey() {
        return this.coreSdk.C();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.q();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.s();
    }

    public String getUserIdentifier() {
        return this.coreSdk.n();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.r();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.y();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.z();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.d();
    }

    public boolean isInitialized() {
        return this.coreSdk.d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.b(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.m();
    }

    public void showMediationDebugger() {
        this.coreSdk.l();
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.S() + '}';
    }
}
