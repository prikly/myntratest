package com.appodeal.ads.adapters.vast;

import android.text.TextUtils;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.vast.rewarded_video.b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.modules.common.internal.log.InternalLogEvent;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;
import com.appodeal.ads.utils.ActivityRule;
import com.explorestack.iab.IabSettings;
import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;
import com.explorestack.iab.vast.VastLog;
import org.json.JSONObject;

public class VASTNetwork extends AdNetwork<RequestParams> {

    public static class RequestParams extends UnifiedVastNetworkParams {
        public RequestParams(RestrictedData restrictedData, String str, String str2, String str3, int i, long j, boolean z) {
            super(restrictedData, str, str2, str3, i, j, z);
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16293a;

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
                f16293a = r0
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.info     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16293a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.debug     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16293a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.warning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16293a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.error     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16293a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.none     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.vast.VASTNetwork.a.<clinit>():void");
        }
    }

    public static class builder extends AdNetworkBuilder {
        public AdNetwork build() {
            return new VASTNetwork(this);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.explorestack.iab.vast.activity.VastActivity").build(), new ActivityRule.Builder("com.explorestack.iab.mraid.MraidActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "vast";
        }
    }

    public VASTNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        IabSettings.mediatorVersion = Appodeal.getVersion();
        VastLog.addLogListener(new LogListener() {
            public final void onLog(Logger.LogLevel logLevel, String str, String str2) {
                VASTNetwork.this.lambda$new$0$VASTNetwork(logLevel, str, str2);
            }
        });
    }

    private String parseLogLevel(Logger.LogLevel logLevel) {
        int i = a.f16293a[logLevel.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "verbose" : "none" : "error" : "warning" : Constants.DEBUG_INTERSTITIAL : "info";
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new b();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new com.appodeal.ads.adapters.vast.video.b();
    }

    public String getRecommendedVersion() {
        return "1.4.1";
    }

    public String getVersion() {
        return "1.4.1";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        JSONObject jsonData = adUnit.getJsonData();
        String optString = jsonData.optString("package");
        int optInt = jsonData.optInt("close_time", 0);
        long optLong = jsonData.optLong("expiry");
        String optString2 = jsonData.optString("vast_xml");
        String optString3 = jsonData.optString("vast_url");
        String parseUrlWithTopParams = jsonData.optBoolean("top", false) ? UnifiedAdUtils.parseUrlWithTopParams(contextProvider.getApplicationContext(), optString3, adNetworkMediationParams) : optString3;
        boolean optBoolean = jsonData.optBoolean("video_auto_close", false);
        if ((TextUtils.isEmpty(optString2) || TextUtils.getTrimmedLength(optString2) == 0) && (TextUtils.isEmpty(parseUrlWithTopParams) || TextUtils.getTrimmedLength(parseUrlWithTopParams) == 0)) {
            networkInitializationListener.onInitializationFailed(LoadingError.IncorrectAdunit);
        } else {
            networkInitializationListener.onInitializationFinished(new RequestParams(adNetworkMediationParams.getRestrictedData(), optString2, parseUrlWithTopParams, optString, optInt, optLong, optBoolean));
        }
    }

    public /* synthetic */ void lambda$new$0$VASTNetwork(Logger.LogLevel logLevel, String str, String str2) {
        InternalLogKt.observer.invoke(new InternalLogEvent(str, "vast event", str2, parseLogLevel(logLevel)));
    }

    public void setLogging(boolean z) {
        VastLog.setLoggingLevel(z ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }
}
