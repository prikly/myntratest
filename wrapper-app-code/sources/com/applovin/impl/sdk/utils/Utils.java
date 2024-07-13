package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b.a;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.explorestack.iab.utils.m;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

public abstract class Utils {
    public static final int BYTES_PER_KB = 1000;
    public static final String KEY_AD_VALUES = "ad_values";
    private static final String[] LONG_TIME_FORMATS = {" second ago", " minute ago", " hour ago", " day ago", " week ago", " month ago"};
    private static final String[] LONG_TIME_FORMATS_PLURAL = {" seconds ago", " minutes ago", " hours ago", " days ago", " weeks ago", " months ago"};
    public static final String MACRO_CLCODE = "{CLCODE}";
    public static final String MACRO_CLICK_X = "{CLICK_X}";
    public static final String MACRO_CLICK_Y = "{CLICK_Y}";
    private static final String MACRO_EVENT_ID = "{EVENT_ID}";
    public static final String MACRO_IS_VIDEO_CLICK = "{IS_VIDEO_CLICK}";
    public static final String MACRO_SCREEN_HEIGHT = "{SCREEN_HEIGHT}";
    public static final String MACRO_SCREEN_WIDTH = "{SCREEN_WIDTH}";
    public static final String PLAY_STORE_PACKAGE_NAME = "com.android.vending";
    public static final String PLAY_STORE_SCHEME = "market";
    private static final String[] SHORT_TIME_FORMATS = {"s", m.o, "h", "d", "w", "mth"};
    private static final String TAG = "Utils";
    private static final int[] TIME_MULTIPLIERS = {60, 60, 24, 7, 4, 12};
    private static final DecimalFormat decimalFormat = new DecimalFormat();
    public static Boolean isDspDemoApp;

    public static void assertBackgroundThread() {
    }

    public static void assertMainThread() {
    }

    public static boolean bitMaskContainsFlag(long j, long j2) {
        return (j & j2) != 0;
    }

    public static List<Uri> checkCachedResourcesExist(boolean z, e eVar, n nVar, Context context) {
        if (eVar instanceof a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(eVar.B())) {
            if (!(nVar.ad() != null ? nVar.ad().b(uri.getLastPathSegment(), context) : nVar.ae().b(uri.getLastPathSegment(), context))) {
                nVar.D();
                if (v.a()) {
                    v D = nVar.D();
                    D.e(TAG, "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z) {
            Uri h2 = eVar.h();
            if (!(nVar.ad() != null ? nVar.ad().b(h2.getLastPathSegment(), context) : nVar.ae().b(h2.getLastPathSegment(), context))) {
                nVar.D();
                if (v.a()) {
                    v D2 = nVar.D();
                    D2.e(TAG, "Cached video missing: " + h2);
                }
                arrayList.add(h2);
            }
        }
        return arrayList;
    }

    public static boolean checkClassExistence(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkClassesExistence(List<String> list) {
        for (String checkClassExistence : list) {
            if (checkClassExistence(checkClassExistence)) {
                return true;
            }
        }
        return false;
    }

    public static void close(Closeable closeable, n nVar) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                if (nVar != null) {
                    nVar.D();
                    if (v.a()) {
                        v D = nVar.D();
                        D.b(TAG, "Unable to close stream: " + closeable, th);
                    }
                }
            }
        }
    }

    public static int compare(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                int compareTo = VersionInfo.getInstance(digitsOnlyVersionString).compareTo(VersionInfo.getInstance(digitsOnlyVersionString2));
                return compareTo == 0 ? compareTo : compareTo > 0 ? 1 : -1;
            }
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            int i = 0;
            while (i < max) {
                boolean isValidString = StringUtils.isValidString(split[i]);
                String str3 = BuildConfig.ADAPTER_VERSION;
                String str4 = isValidString ? split[i] : str3;
                if (StringUtils.isValidString(split2[i])) {
                    str3 = split2[i];
                }
                int parseInt = i < split.length ? Integer.parseInt(str4) : 0;
                int parseInt2 = i < split2.length ? Integer.parseInt(str3) : 0;
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            v.c(TAG, "Failed to process version string.", th);
            return 0;
        }
    }

    public static void disconnect(HttpURLConnection httpURLConnection, n nVar) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                if (nVar != null) {
                    nVar.D();
                    if (v.a()) {
                        v D = nVar.D();
                        D.b(TAG, "Unable to disconnect connection: " + httpURLConnection, th);
                    }
                }
            }
        }
    }

    public static String encodeUrlMap(Map<String, String> map, boolean z, boolean z2) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() {
                /* renamed from: a */
                public int compare(String str, String str2) {
                    return str.compareToIgnoreCase(str2);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            Object value = next.getValue();
            if (z2 && (value instanceof String)) {
                String str = (String) value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb.append(next.getKey());
            sb.append('=');
            sb.append(value);
        }
        return sb.toString();
    }

    private static long floatToLong(float f2) {
        return (long) Math.round(f2);
    }

    public static String formatDoubleValue(double d2, int i) {
        decimalFormat.setMaximumFractionDigits(i);
        return decimalFormat.format(d2);
    }

    private static List<Class> generateClassesList(List<String> list, n nVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String next : list) {
            try {
                arrayList.add(Class.forName(next));
            } catch (ClassNotFoundException unused) {
                nVar.D();
                if (v.a()) {
                    v D = nVar.D();
                    D.e(TAG, "Failed to create class for name: " + next);
                }
            }
        }
        return arrayList;
    }

    public static String getAdServeId(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).f();
        }
        if (c.a(obj)) {
            return ((e) obj).N();
        }
        return null;
    }

    public static int getAlwaysFinishActivitiesSetting(Context context) {
        boolean b2 = h.b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String getAndroidOSInfo() {
        try {
            return Build.VERSION.RELEASE + " (" + getAndroidSdkCodename() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            v.c(TAG, "Unable to get Android OS info", th);
            return "";
        }
    }

    public static String getAndroidSdkCodename() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt((Object) null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            v.c(TAG, "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static boolean getBooleanForProbability(int i) {
        return i > 0 && i <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= i;
    }

    public static int getExoPlayerVersionCode() {
        return 2015001;
    }

    public static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    public static String getFileName(Uri uri) {
        return TextUtils.join("_", uri.getPathSegments());
    }

    public static Map<String, String> getMetaData(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field field = getField(appLovinSdkSettings.getClass(), "metaData");
            if (field != null) {
                field.setAccessible(true);
            }
            return (Map) field.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, n nVar) {
        return getPostbacks(str, jSONObject, str2, (Map<String, String>) null, str3, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, Map<String, String> map, n nVar) {
        return getPostbacks(str, jSONObject, str2, Collections.emptyMap(), str3, map, false, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, n nVar) {
        return getPostbacks(str, jSONObject, str2, map, str3, (Map<String, String>) null, false, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z, n nVar) {
        if (map == null) {
            map = CollectionUtils.map(1);
        }
        Map<String, String> map3 = map;
        map3.put(MACRO_CLCODE, str2);
        return getPostbacks(str, jSONObject, map3, str3, map2, z, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, n nVar) {
        return getPostbacks(str, jSONObject, map, str2, (Map<String, String>) null, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, n nVar) {
        return getPostbacks(str, jSONObject, map, str2, map2, false, nVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z, n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new com.applovin.impl.sdk.d.a(str2, (String) null, map2, z));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = jSONObject2.optString(next);
                        String replace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = StringUtils.replace(optString, map);
                        }
                        arrayList.add(new com.applovin.impl.sdk.d.a(replace, optString, map2, z));
                    }
                } catch (Throwable th) {
                    nVar.D();
                    if (v.a()) {
                        nVar.D().b(TAG, "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getPrettyDate(long j, boolean z) {
        String[] strArr = z ? LONG_TIME_FORMATS : SHORT_TIME_FORMATS;
        String[] strArr2 = z ? LONG_TIME_FORMATS_PLURAL : SHORT_TIME_FORMATS;
        long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        int i = 0;
        while (i < strArr.length) {
            int[] iArr = TIME_MULTIPLIERS;
            if (currentTimeMillis >= ((long) iArr[i])) {
                currentTimeMillis /= (long) iArr[i];
                i++;
            } else if (currentTimeMillis <= 0) {
                return z ? "just now" : "now";
            } else {
                Object[] objArr = new Object[2];
                if (currentTimeMillis == 1) {
                    objArr[0] = Long.valueOf(currentTimeMillis);
                    objArr[1] = strArr[i];
                    return String.format("%d%s", objArr);
                }
                objArr[0] = Long.valueOf(currentTimeMillis);
                objArr[1] = strArr2[i];
                return String.format("%d%s", objArr);
            }
        }
        return z ? "just now" : "now";
    }

    public static View getRootView(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    public static int getRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static long getServerAdjustedUnixTimestampMillis(n nVar) {
        long longValue = ((Long) nVar.a(b.eC)).longValue();
        long longValue2 = ((Long) nVar.a(b.eD)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static String getString(Class cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return (String) field.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getVideoCompletionPercent(JSONObject jSONObject) {
        int i = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i < 0 || i > 100) {
            return 95;
        }
        return i;
    }

    public static d getZone(JSONObject jSONObject, n nVar) {
        return d.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", (String) null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", (String) null)), JsonUtils.getString(jSONObject, "zone_id", (String) null));
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean hasAndroidCoreJsonLibrary(n nVar) {
        if (!h.c()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            nVar.D();
            if (!v.a()) {
                return false;
            }
            nVar.D().a(TAG, "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean isAppLovinTestEnvironment(Context context) {
        return e.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean isBML(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER || appLovinAdSize == AppLovinAdSize.CROSS_PROMO;
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            v.c(TAG, "Exception thrown while getting memory state.", th);
        }
        return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
    }

    public static boolean isDeepLinkPlusUrl(Uri uri) {
        return uri != null && AppodealNetworks.APPLOVIN.equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static boolean isDomainWhitelisted(String str, List<String> list) {
        for (String startsWith : list) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDspDemoApp(Context context) {
        if (isDspDemoApp == null) {
            isDspDemoApp = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return isDspDemoApp.booleanValue();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isMemberOfPackageNameList(List<String> list) {
        Context Q = n.Q();
        if (Q != null) {
            return list.contains(Q.getPackageName());
        }
        v.i(TAG, "Failed to check whether or not app is member of package names");
        return false;
    }

    public static boolean isProguardRulesOmitted() {
        try {
            Class.forName("com.applovin.sdk.AppLovinSdk");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static boolean isPubInDebugMode(Context context, n nVar) {
        String str = nVar.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.RUN_IN_RELEASE_MODE);
        return (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) && (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isTestApp(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean isUserAgentCollectionEnabled(n nVar) {
        String str = nVar.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isVPNConnected() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ all -> 0x002e }
        L_0x0004:
            boolean r1 = r0.hasMoreElements()     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.nextElement()     // Catch:{ all -> 0x002e }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r1.getDisplayName()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0004
        L_0x002c:
            r0 = 1
            return r0
        L_0x002e:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.v.c(r1, r2, r0)
        L_0x0036:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.Utils.isVPNConnected():boolean");
    }

    public static boolean isVerboseLoggingConfigured() {
        Context Q = n.Q();
        if (Q != null) {
            return e.a(Q).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean isVerboseLoggingEnabled(Context context) {
        if (context == null) {
            context = n.Q();
        }
        if (context != null) {
            return e.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean isVideoMutedInitially(n nVar) {
        return ((Boolean) nVar.a(b.cC)).booleanValue() ? nVar.q().isMuted() : ((Boolean) nVar.a(b.cA)).booleanValue();
    }

    public static boolean isViewInChildView(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (isViewInChildView(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isViewInTopActivity(View view, Activity activity) {
        View rootView;
        if (!(activity == null || view == null)) {
            Window window = activity.getWindow();
            if (window != null) {
                rootView = window.getDecorView();
            } else {
                View findViewById = activity.findViewById(16908290);
                if (findViewById != null) {
                    rootView = findViewById.getRootView();
                }
            }
            return isViewInChildView(view, rootView);
        }
        return false;
    }

    public static int kilobytesToByes(int i) {
        return i * 1000;
    }

    public static void logJava8MethodReference() {
        v.f("AppLovinSdk", "Java version 8 supported.");
    }

    public static void maybeHandleNoFillResponseForPublisher(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, n nVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder();
            sb.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            sb.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb.append("\"\n..SDK KEY: \"");
            sb.append(nVar.C());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(nVar.P().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String sb2 = sb.toString();
            nVar.D();
            if (v.a()) {
                nVar.D().e("AppLovinSdk", sb2);
            }
        }
    }

    public static void maybeLogCustomDataSizeLimit(String str, String str2) {
        if (str != null && str.length() > kilobytesToByes(8)) {
            v.h(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + kilobytesToByes(8) + " maximum)");
        }
    }

    public static AppLovinAd maybeRetrieveNonDummyAd(AppLovinAd appLovinAd, n nVar) {
        if (!(appLovinAd instanceof f)) {
            return appLovinAd;
        }
        f fVar = (f) appLovinAd;
        AppLovinAd dequeueAd = nVar.v().dequeueAd(fVar.getAdZone());
        nVar.D();
        if (v.a()) {
            v D = nVar.D();
            D.b(TAG, "Dequeued ad for dummy ad: " + dequeueAd);
        }
        if (dequeueAd == null) {
            return fVar.a();
        }
        fVar.a(dequeueAd);
        ((AppLovinAdImpl) dequeueAd).setDummyAd(fVar);
        return dequeueAd;
    }

    public static double millisToSeconds(long j) {
        return ((double) j) / 1000.0d;
    }

    public static boolean objectIsOfType(Object obj, List<String> list, n nVar) {
        if (list == null) {
            return false;
        }
        for (Class isInstance : generateClassesList(list, nVar)) {
            if (isInstance.isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            nVar.D();
                            if (v.a()) {
                                nVar.D().b(TAG, "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        } else if (!objectIsOfType(entry.getValue(), list, nVar)) {
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof List)) {
                    return true;
                } else {
                    for (Object objectIsOfType : (List) obj) {
                        if (!objectIsOfType(objectIsOfType, list, nVar)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        nVar.D();
        if (v.a()) {
            v D = nVar.D();
            D.b(TAG, "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static boolean openUri(Context context, Uri uri, n nVar) {
        boolean z = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if (PLAY_STORE_SCHEME.equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            nVar.ag().pauseForClick();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            nVar.D();
            if (v.a()) {
                v D = nVar.D();
                D.b(TAG, "Unable to open \"" + uri + "\".", th);
            }
        }
        if (!z) {
            nVar.ag().resumeForClick();
        }
        return z;
    }

    public static long parseColor(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return (long) Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static void putObjectForStringIfValid(String str, String str2, Map map) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void renameKeyInObjectMap(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static String retrieveLauncherActivityFullyQualifiedName(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.name;
        }
        return null;
    }

    public static Activity retrieveParentActivity(View view, n nVar) {
        if (view == null) {
            return null;
        }
        int i = 0;
        while (i < 1000) {
            i++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                nVar.D();
                if (v.a()) {
                    nVar.D().b(TAG, "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static Object sanitizeSuperProperty(Object obj, n nVar) {
        int i;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Map map2 = CollectionUtils.map(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                map2.put(key instanceof String ? (String) key : String.valueOf(key), sanitizeSuperProperty(entry.getValue(), nVar));
            }
            return map2;
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Object sanitizeSuperProperty : list) {
                arrayList.add(sanitizeSuperProperty(sanitizeSuperProperty, nVar));
            }
            return arrayList;
        } else if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        } else {
            String valueOf = String.valueOf(obj);
            if (obj instanceof String) {
                i = ((Integer) nVar.a(b.bo)).intValue();
                if (i <= 0 || valueOf.length() <= i) {
                    return valueOf;
                }
            } else if (!(obj instanceof Uri) || (i = ((Integer) nVar.a(b.bp)).intValue()) <= 0 || valueOf.length() <= i) {
                return valueOf;
            }
            return valueOf.substring(0, i);
        }
    }

    public static float secondsToMillis(float f2) {
        return f2 * 1000.0f;
    }

    public static long secondsToMillisLong(float f2) {
        return floatToLong(secondsToMillis(f2));
    }

    public static void setImageUrl(final String str, final ImageView imageView, final n nVar) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            nVar.D();
            if (v.a()) {
                v D = nVar.D();
                D.b(TAG, "Fetching image: " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            nVar.V().c().execute(new Runnable() {
                public void run() {
                    try {
                        InputStream openStream = new URL(str).openStream();
                        final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                nVar.D();
                                if (v.a()) {
                                    nVar.D().b(Utils.TAG, "Image fetched");
                                }
                                imageView.setImageDrawable(new BitmapDrawable(nVar.P().getResources(), decodeStream));
                            }
                        });
                        Utils.close(openStream, nVar);
                    } catch (Throwable th) {
                        nVar.D();
                        if (v.a()) {
                            v D = nVar.D();
                            D.b(Utils.TAG, "Failed to fetch image: " + str, th);
                        }
                    }
                }
            });
        }
    }

    public static String shortenKey(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static void showAlert(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo next : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = next.getError();
                String name = next.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        showAlert("", sb.toString(), context);
    }

    public static void showAlert(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    public static void showToast(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                Toast makeText = Toast.makeText(context, str, 0);
                makeText.setMargin(0.0f, 0.1f);
                makeText.show();
            }
        });
    }

    public static void showToast(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static Map<String, String> stringifyObjectMap(Map<String, Object> map) {
        Map<String, String> map2 = CollectionUtils.map();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                map2.put((String) next.getKey(), String.valueOf(next.getValue()));
            }
        }
        return map2;
    }

    public static Map<String, String> toUrlSafeMap(Map<String, String> map, n nVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        for (String next : map2.keySet()) {
            String str = map2.get(next);
            if (str != null) {
                map2.put(next, StringUtils.encodeUriString(str, nVar));
            }
        }
        return map2;
    }

    public static int toVersionCode(String str) {
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                v.i(TAG, "Version number components cannot be longer than two digits -> " + str);
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    public static double tryParseDouble(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            v.c(TAG, "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static WebView tryToCreateWebView(Context context, String str) {
        try {
            return new WebView(context);
        } catch (Throwable th) {
            v.c(TAG, "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static String urlStringWithoutQueryParameters(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    public static void validateAdSdkKey(AppLovinAd appLovinAd, n nVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String C = nVar.C();
            String C2 = ((AppLovinAdBase) appLovinAd).getSdk().C();
            if (!C.equals(C2)) {
                v.i("AppLovinAd", "Ad was loaded from sdk with key: " + C2 + ", but is being rendered from sdk with key: " + C);
                nVar.W().a(com.applovin.impl.sdk.d.f.n);
            }
        }
    }
}
