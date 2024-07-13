package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Locale;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a  reason: collision with root package name */
    private String f9825a = "";

    /* renamed from: b  reason: collision with root package name */
    private f1 f9826b = new f1();

    /* renamed from: c  reason: collision with root package name */
    private AdColonyUserMetadata f9827c;

    public AdColonyAppOptions() {
        setOriginStore("google");
    }

    /* access modifiers changed from: package-private */
    public AdColonyAppOptions a(String str) {
        if (str == null) {
            return this;
        }
        this.f9825a = str;
        c0.a(this.f9826b, OSOutcomeConstants.APP_ID, str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public f1 b() {
        return this.f9826b;
    }

    public int getAppOrientation() {
        return c0.a(this.f9826b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return c0.h(this.f9826b, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return c0.h(this.f9826b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return c0.b(this.f9826b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return c0.b(this.f9826b, "is_child_directed");
    }

    public boolean getKeepScreenOn() {
        return c0.b(this.f9826b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        f1 b2 = c0.b();
        c0.a(b2, "name", c0.h(this.f9826b, "mediation_network"));
        c0.a(b2, MediationMetaData.KEY_VERSION, c0.h(this.f9826b, "mediation_network_version"));
        return b2.a();
    }

    public boolean getMultiWindowEnabled() {
        return c0.b(this.f9826b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return c0.g(this.f9826b, str);
    }

    public String getOriginStore() {
        return c0.h(this.f9826b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        f1 b2 = c0.b();
        c0.a(b2, "name", c0.h(this.f9826b, "plugin"));
        c0.a(b2, MediationMetaData.KEY_VERSION, c0.h(this.f9826b, "plugin_version"));
        return b2.a();
    }

    public String getPrivacyConsentString(String str) {
        f1 f1Var = this.f9826b;
        return c0.h(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        f1 f1Var = this.f9826b;
        return c0.b(f1Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return c0.a(this.f9826b, AdUnitActivity.EXTRA_ORIENTATION, -1);
    }

    public boolean getTestModeEnabled() {
        return c0.b(this.f9826b, "test_mode");
    }

    public String getUserID() {
        return c0.h(this.f9826b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f9827c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        f1 f1Var = this.f9826b;
        return f1Var.a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        c0.a(this.f9826b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z) {
        setOption("is_child_directed", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        c0.b(this.f9826b, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        c0.a(this.f9826b, "mediation_network", str);
        c0.a(this.f9826b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        c0.b(this.f9826b, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        c0.b(this.f9826b, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        c0.a(this.f9826b, "plugin", str);
        c0.a(this.f9826b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        f1 f1Var = this.f9826b;
        c0.a(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption(AdUnitActivity.EXTRA_ORIENTATION, (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        c0.b(this.f9826b, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f9827c = adColonyUserMetadata;
        c0.a(this.f9826b, "user_metadata", adColonyUserMetadata.f9862b);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        a(context);
        Boolean g2 = this.f9826b.g("use_forced_controller");
        if (g2 != null) {
            l.H = g2.booleanValue();
        }
        if (this.f9826b.f("use_staging_launch_server")) {
            k.Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b2 = z0.b(context, "IABUSPrivacy_String");
        String b3 = z0.b(context, "IABTCF_TCString");
        int a2 = z0.a(context, "IABTCF_gdprApplies");
        if (b2 != null) {
            c0.a(this.f9826b, "ccpa_consent_string", b2);
        }
        if (b3 != null) {
            c0.a(this.f9826b, "gdpr_consent_string", b3);
        }
        boolean z = true;
        if (a2 == 0 || a2 == 1) {
            f1 f1Var = this.f9826b;
            if (a2 != 1) {
                z = false;
            }
            c0.b(f1Var, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d2) {
        c0.a(this.f9826b, str, d2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f9825a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        c0.a(this.f9826b, str, str2);
        return this;
    }

    private void a(Context context) {
        setOption("bundle_id", z0.d(context));
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(":");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals(MediationMetaData.KEY_VERSION)) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }
}
