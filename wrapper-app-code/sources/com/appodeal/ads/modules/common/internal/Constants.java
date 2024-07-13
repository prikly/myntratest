package com.appodeal.ads.modules.common.internal;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0006XD¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b,\u0010\u0007R\u0014\u0010-\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00104\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b4\u0010/R\u0014\u00105\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00106\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00108\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b8\u0010/R\u0014\u00109\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010:\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b:\u0010/R\u0014\u0010;\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b;\u0010/R\u0014\u0010<\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b<\u0010/R\u0014\u0010=\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b=\u0010/R\u0014\u0010?\u001a\u00020>8\u0006XT¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0006XT¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bD\u0010/R\u0014\u0010E\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bE\u0010/R\u0014\u0010F\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bF\u0010/R\u0014\u0010G\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bG\u0010/R\u0014\u0010H\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bH\u0010/R\u0014\u0010I\u001a\u00020A8\u0006XT¢\u0006\u0006\n\u0004\bI\u0010CR\u0014\u0010J\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\bJ\u0010/R\u0014\u0010K\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bK\u0010\u0007R\u0014\u0010L\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bL\u0010\u0007R\u0014\u0010M\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bM\u0010\u0007R\u0014\u0010N\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bN\u0010\u0007R\u0014\u0010O\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bO\u0010\u0007R\u0014\u0010P\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\bP\u0010\u0007¨\u0006Q"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/Constants;", "", "", "adType", "", "getPrettyAdTypeFromInt", "SDK_VERSION", "Ljava/lang/String;", "Ljava/util/Date;", "BUILD_DATE", "Ljava/util/Date;", "INTERSTITIAL", "BANNER", "NON_REWARDED_VIDEO", "REWARDED_VIDEO", "MREC", "NATIVE", "DEBUG_INTERSTITIAL", "DEBUG_BANNER", "DEBUG_NON_REWARDED_VIDEO", "DEBUG_REWARDED_VIDEO", "DEBUG_MREC", "DEBUG_NATIVE", "CONFIG_URL_LIST", "INIT", "CONFIG", "GET", "STATS", "POST_BID", "SHOW", "CLICK", "FINISH", "INSTALL", "SESSIONS", "IAP", "REQUEST_SHARED_PREFERENCES_NAME", "SHARED_PREFERENCES_NAME", "INIT_URL_LIST", "CAMPAIGN_FREQUENCY", "PLACEMENT_FREQUENCY", "APP_KEY", "INAPPS", "FOR_KIDS", "UUID", "APPODEAL_VERSION", "APPODEAL_FIRST_INSTALL", "SERVER_TIMEOUT_MS", "I", "LOADING_TIMEOUT_MS", "FAILED_REQUEST_MS", "FAILED_REQUEST_PRECACHE_MS", "MAX_FAILED_REQUEST_MS", "WATERFALL_CACHE_TIMEOUT_MS", "LOADER_TIMEOUT_MS", "BANNER_LOAD_TIMEOUT_MS", "MREC_LOAD_TIMEOUT_MS", "INTERSTITIAL_LOAD_TIMEOUT_MS", "VIDEO_LOAD_TIMEOUT_MS", "REWARDED_VIDEO_LOAD_TIMEOUT_MS", "NATIVE_LOAD_TIMEOUT_MS", "PAUSE_TIMEOUT_MS", "VIEW_AD_IMPRESSION_INTERVAL", "", "DEFAULT_RRI", "Z", "", "DEFAULT_EXPIRED_TIME", "J", "MAX_NATIVE_AD_CONTAINER_SIZE", "MIN_NATIVE_AD_CONTAINER_SIZE", "VIDEO_MAX_DURATION", "FULLSCREEN_AD_SHOW_RESET_INTERVAL", "FULLSCREEN_AD_SHOWN_CALLBACK_INTERVAL", "MILLIS_IN_DAY", "DEFAULT_WATERFALL_VALIDITY_PERIOD", "PRETTY_INTERSTITIAL_NAME", "PRETTY_BANNER_NAME", "PRETTY_MREC_NAME", "PRETTY_NATIVE_NAME", "PRETTY_VIDEO_NAME", "PRETTY_REWARDED_VIDEO_NAME", "apd_internal"}, k = 1, mv = {1, 6, 0})
public final class Constants {
    public static final String APPODEAL_FIRST_INSTALL = "appodealFirstInstall";
    public static final String APPODEAL_VERSION = "appodealVersion";
    public static final String APP_KEY = "appKey";
    public static final String BANNER = "banner_320";
    public static final int BANNER_LOAD_TIMEOUT_MS = 5000;
    public static final Date BUILD_DATE;
    public static final String CAMPAIGN_FREQUENCY = "freq";
    public static final String CLICK = "click";
    public static final String CONFIG = "config";
    public static final String CONFIG_URL_LIST = "config_url_list";
    public static final String DEBUG_BANNER = "debug_banner_320";
    public static final String DEBUG_INTERSTITIAL = "debug";
    public static final String DEBUG_MREC = "debug_mrec";
    public static final String DEBUG_NATIVE = "debug_native";
    public static final String DEBUG_NON_REWARDED_VIDEO = "debug_video";
    public static final String DEBUG_REWARDED_VIDEO = "debug_rewarded_video";
    public static final long DEFAULT_EXPIRED_TIME = 0;
    public static final boolean DEFAULT_RRI = false;
    public static final int DEFAULT_WATERFALL_VALIDITY_PERIOD = 86400000;
    public static final int FAILED_REQUEST_MS = 5000;
    public static final int FAILED_REQUEST_PRECACHE_MS = 30000;
    public static final String FINISH = "finish";
    public static final String FOR_KIDS = "for_kids";
    public static final int FULLSCREEN_AD_SHOWN_CALLBACK_INTERVAL = 3000;
    public static final int FULLSCREEN_AD_SHOW_RESET_INTERVAL = 15000;
    public static final String GET = "get";
    public static final String IAP = "iap";
    public static final String INAPPS = "inapps";
    public static final String INIT = "init";
    public static final String INIT_URL_LIST = "init_url_list";
    public static final String INSTALL = "install";
    public static final Constants INSTANCE = new Constants();
    public static final String INTERSTITIAL = "banner";
    public static final int INTERSTITIAL_LOAD_TIMEOUT_MS = 10000;
    public static final int LOADER_TIMEOUT_MS = 3000;
    public static final int LOADING_TIMEOUT_MS = 120000;
    public static final int MAX_FAILED_REQUEST_MS = 100000;
    public static final int MAX_NATIVE_AD_CONTAINER_SIZE = 5;
    public static final long MILLIS_IN_DAY = 86400000;
    public static final int MIN_NATIVE_AD_CONTAINER_SIZE = 2;
    public static final String MREC = "banner_mrec";
    public static final int MREC_LOAD_TIMEOUT_MS = 5000;
    public static final String NATIVE = "native";
    public static final int NATIVE_LOAD_TIMEOUT_MS = 5000;
    public static final String NON_REWARDED_VIDEO = "video";
    public static final int PAUSE_TIMEOUT_MS = 1000;
    public static final String PLACEMENT_FREQUENCY = "placements_freq";
    public static final String POST_BID = "post_bid";
    public static final String PRETTY_BANNER_NAME = "banner";
    public static final String PRETTY_INTERSTITIAL_NAME = "interstitial";
    public static final String PRETTY_MREC_NAME = "mrec";
    public static final String PRETTY_NATIVE_NAME = "native";
    public static final String PRETTY_REWARDED_VIDEO_NAME = "rewarded_video";
    public static final String PRETTY_VIDEO_NAME = "video";
    public static final String REQUEST_SHARED_PREFERENCES_NAME = "Appodeal";
    public static final String REWARDED_VIDEO = "rewarded_video";
    public static final int REWARDED_VIDEO_LOAD_TIMEOUT_MS = 10000;
    public static final String SDK_VERSION = "3.0.2";
    public static final int SERVER_TIMEOUT_MS = 20000;
    public static final String SESSIONS = "sessions";
    public static final String SHARED_PREFERENCES_NAME = "appodeal";
    public static final String SHOW = "show";
    public static final String STATS = "stats";
    public static final String UUID = "uuid";
    public static final int VIDEO_LOAD_TIMEOUT_MS = 10000;
    public static final int VIDEO_MAX_DURATION = 90000;
    public static final int VIEW_AD_IMPRESSION_INTERVAL = 15000;
    public static final int WATERFALL_CACHE_TIMEOUT_MS = 600000;

    static {
        Date date = BuildConfig.BUILD_DATE;
        Intrinsics.checkNotNullExpressionValue(date, "BUILD_DATE");
        BUILD_DATE = date;
    }

    public final String getPrettyAdTypeFromInt(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 128 ? i != 256 ? i != 512 ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : "native" : PRETTY_MREC_NAME : "rewarded_video" : "banner" : "interstitial" : "video";
    }
}
