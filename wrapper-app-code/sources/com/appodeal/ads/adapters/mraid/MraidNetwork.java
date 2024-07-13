package com.appodeal.ads.adapters.mraid;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.mraid.banner.b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.modules.common.internal.log.InternalLogEvent;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.utils.ActivityRule;
import com.explorestack.iab.IabSettings;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;
import com.onesignal.OSInAppMessageContentKt;
import io.bidmachine.utils.IabUtils;
import org.json.JSONObject;

public class MraidNetwork extends AdNetwork<UnifiedMraidNetworkParams> {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16274a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.explorestack.iab.utils.Logger$LogLevel[] r0 = com.explorestack.iab.utils.Logger.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16274a = r0
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.info     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16274a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.debug     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16274a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.warning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16274a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.error     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16274a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.none     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.mraid.MraidNetwork.a.<clinit>():void");
        }
    }

    public static class builder extends AdNetworkBuilder {
        public MraidNetwork build() {
            return new MraidNetwork(this);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.explorestack.iab.mraid.MraidActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "mraid";
        }
    }

    public MraidNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        IabSettings.mediatorVersion = Appodeal.getVersion();
        MraidLog.addLogListener(new LogListener() {
            public final void onLog(Logger.LogLevel logLevel, String str, String str2) {
                MraidNetwork.this.lambda$new$0$MraidNetwork(logLevel, str, str2);
            }
        });
    }

    private static String obtainScript(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return "window.renderValidationData(" + jSONObject + ");";
    }

    private String parseLogLevel(Logger.LogLevel logLevel) {
        int i = a.f16274a[logLevel.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "verbose" : "none" : "error" : "warning" : Constants.DEBUG_INTERSTITIAL : "info";
    }

    public UnifiedBanner<UnifiedMraidNetworkParams> createBanner() {
        return new b();
    }

    public UnifiedInterstitial<UnifiedMraidNetworkParams> createInterstitial() {
        return new com.appodeal.ads.adapters.mraid.interstitial.b();
    }

    public UnifiedMrec<UnifiedMraidNetworkParams> createMrec() {
        return new com.appodeal.ads.adapters.mraid.mrec.b();
    }

    public UnifiedRewarded<UnifiedMraidNetworkParams> createRewarded() {
        return new com.appodeal.ads.adapters.mraid.rewarded_video.b();
    }

    public UnifiedVideo<UnifiedMraidNetworkParams> createVideo() {
        return new com.appodeal.ads.adapters.mraid.video.b();
    }

    public String getRecommendedVersion() {
        return "1.4.1";
    }

    public String getVersion() {
        return "1.4.1";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<UnifiedMraidNetworkParams> networkInitializationListener) {
        JSONObject jsonData = adUnit.getJsonData();
        String optString = jsonData.optString("package");
        String optString2 = jsonData.optString("base_url", "");
        long optLong = jsonData.optLong("expiry");
        boolean optBoolean = jsonData.optBoolean("preload", true);
        boolean optBoolean2 = jsonData.optBoolean("tag");
        String optString3 = jsonData.optString(OSInAppMessageContentKt.HTML);
        String optString4 = jsonData.optString("mraid_url");
        if (jsonData.optBoolean("top", false)) {
            optString4 = UnifiedAdUtils.parseUrlWithTopParams(contextProvider.getApplicationContext(), optString4, adNetworkMediationParams);
        } else {
            AdNetworkMediationParams adNetworkMediationParams2 = adNetworkMediationParams;
        }
        int parseInt = Integer.parseInt(jsonData.getString(IabUtils.KEY_WIDTH));
        int parseInt2 = Integer.parseInt(jsonData.getString(IabUtils.KEY_HEIGHT));
        int optInt = jsonData.optInt("close_time", -1);
        UnifiedMraidNetworkParams.Builder builder2 = new UnifiedMraidNetworkParams.Builder(adNetworkMediationParams.getRestrictedData());
        builder2.setPackageName(optString).setBaseUrl(optString2).setExpiryTime(optLong).setPreload(optBoolean).setIsTag(optBoolean2).setAdm(optString3).setAdUrl(optString4).setWidth(parseInt).setHeight(parseInt2).setCloseTime(optInt);
        if (adNetworkMediationParams.isTestMode()) {
            builder2.setPageFinishedScript(obtainScript(adUnit.getJsonData().optJSONObject("validation_data")));
        }
        networkInitializationListener.onInitializationFinished(builder2.build());
    }

    public /* synthetic */ void lambda$new$0$MraidNetwork(Logger.LogLevel logLevel, String str, String str2) {
        InternalLogKt.observer.invoke(new InternalLogEvent(str, "mraid event", str2, parseLogLevel(logLevel)));
    }

    public void setLogging(boolean z) {
        MraidLog.setLoggingLevel(z ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }
}
