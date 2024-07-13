package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import com.ironsource.mediationsdk.C0880b;
import com.ironsource.mediationsdk.C0890l;
import com.ironsource.mediationsdk.D;
import com.ironsource.mediationsdk.G;
import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.c;
import com.ironsource.mediationsdk.sdk.e;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceUtils {
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;
    private static IronSourceUtils instance = new IronSourceUtils();
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static Boolean mFirstSession = null;
    private static String mSessionId = null;
    private static int serr = 1;

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new c());
        thread.start();
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getBase64Auth(String str, String str2) {
        String str3 = str + ":" + str2;
        return "Basic " + Base64.encodeToString(str3.getBytes(), 10);
    }

    static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean(str, z);
    }

    @Deprecated
    private static JSONObject getCachedInitResponse(Context context) {
        try {
            return new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        return getCachedInitResponse(context).optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e2) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e2);
            return "none";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultFormatterTypeByEventType(str), str2);
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultEventsUrlByEventType(str), str2);
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_events_url" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_events_url" : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? "default_pxl_events_url" : "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_events_formatter_type" : (!IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) && !IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? "" : "default_rv_events_formatter_type";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultNonConnectivityEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_non_connectivity_events" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_non_connectivity_events" : "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultOptInEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_opt_in_events" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_opt_in_events" : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultOptOutEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_opt_out_events" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_opt_out_events" : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(getDefaultTriggerEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_trigger_events" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_trigger_events" : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? "default_pxl_trigger_events" : "";
    }

    public static String getDeviceType(Context context) {
        return h.c(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!D.b(context));
        }
        return mFirstSession.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1;
        }
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, -1);
    }

    public static synchronized JSONObject getGeneralProperties(Context context) {
        JSONObject jSONObject;
        synchronized (IronSourceUtils.class) {
            jSONObject = new JSONObject();
            if (context == null) {
                return jSONObject;
            }
            try {
                jSONObject = new JSONObject(context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString("general_properties", jSONObject.toString()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    static int getIntFromSharedPrefs(Context context, String str, int i) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getInt(str, i);
    }

    public static G getIronSourceAdvId(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        H.a();
        String a2 = H.a(context);
        if (TextUtils.isEmpty(a2)) {
            a2 = h.x(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new G(a2, str);
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                if (i2 >= list2.size()) {
                    break;
                }
                String str2 = list.get(i);
                String str3 = list2.get(i2);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
                i2++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString("last_response", "");
    }

    static long getLongFromSharedPrefs(Context context, String str, long j) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(str, j);
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = BuildConfig.ADAPTER_VERSION + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2 && i != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return e.a().a(DataKeys.USER_ID);
    }

    public static JSONObject getProviderAdditionalData(C0880b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("providerPriority", bVar.n);
            jSONObject.put("spId", bVar.f8569f);
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(bVar.f8570g) ? bVar.f8570g : bVar.j());
            jSONObject.put("providerSDKVersion", bVar.f8565b.getCoreSDKVersion());
            jSONObject.put("providerAdapterVersion", bVar.f8565b.getVersion());
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + bVar.j() + ")", e2);
        }
        return jSONObject;
    }

    public static JSONObject getProviderAdditionalData(C0890l lVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spId", lVar.f8673b.getSubProviderId());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(lVar.f8673b.getAdSourceNameForEvents()) ? lVar.f8673b.getAdSourceNameForEvents() : lVar.a());
            jSONObject.put("providerSDKVersion", lVar.f8672a.getCoreSDKVersion());
            jSONObject.put("providerAdapterVersion", lVar.f8672a.getVersion());
            jSONObject.put("providerPriority", lVar.f8677f);
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + lVar.a() + ")", e2);
        }
        return jSONObject;
    }

    public static String getSDKVersion() {
        return VersionInfo.VERSION;
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new Object[]{new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes()))});
        } catch (NoSuchAlgorithmException e2) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e2);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e2);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (mDidCreateSessionID.compareAndSet(false, true)) {
                mSessionId = UUID.randomUUID().toString();
            }
            str = mSessionId;
        }
        return str;
    }

    static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(str, str2);
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j, String str) {
        return getSHA256(String.format("%s%s%s", new Object[]{Long.valueOf(j), H.a().j, str}));
    }

    public static String getUserIdForNetworks() {
        String a2 = e.a().a("userIdType");
        String a3 = e.a().a(DataKeys.USER_ID);
        if (a2 == null || !a2.equals(IronSourceConstants.TYPE_USER_GENERATED) || TextUtils.isEmpty(a3)) {
            return null;
        }
        return a3;
    }

    public static boolean isAndroidXAvailable() {
        return doesClassExist("androidx.appcompat.app.AppCompatActivity") || doesClassExist("androidx.core.app.CoreComponentFactory") || doesClassExist("androidx.fragment.app.Fragment") || doesClassExist("androidx.lifecycle.LiveData") || doesClassExist("androidx.annotation.Keep");
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return k.a(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        return !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, Constants.APP_KEY)) && !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID)) && !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "response"));
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e2) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e2);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            try {
                return new JSONObject();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else if (jSONObject == null) {
            return jSONObject2;
        } else {
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
        return jSONObject;
    }

    public static Vector<Pair<String, String>> parseJsonToPairVector(JSONObject jSONObject) {
        Vector<Pair<String, String>> vector = new Vector<>();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        vector.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return vector;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    static void saveBooleanToSharedPrefs(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(getDefaultFormatterTypeByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(getDefaultEventsUrlByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultNonConnectivityEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultOptInEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultOptOutEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultTriggerEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e2);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, j);
            edit.apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void saveGeneralProperties(android.content.Context r3, org.json.JSONObject r4) {
        /*
            java.lang.Class<com.ironsource.mediationsdk.utils.IronSourceUtils> r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x0024
            if (r4 != 0) goto L_0x0008
            goto L_0x0024
        L_0x0008:
            java.lang.String r1 = "Mediation_Shared_Preferences"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0021 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "general_properties"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0021 }
            r3.putString(r1, r4)     // Catch:{ all -> 0x0021 }
            r3.apply()     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)
            return
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0024:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.IronSourceUtils.saveGeneralProperties(android.content.Context, org.json.JSONObject):void");
    }

    static void saveIntToSharedPrefs(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putString("last_response", str);
            edit.apply();
        }
    }

    static void saveLongToSharedPrefs(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }
}
