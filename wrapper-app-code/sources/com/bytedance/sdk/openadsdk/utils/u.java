package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.y;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolUtils */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f2239a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private static s f2240b = new s();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f2241c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f2242d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f2243e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f2244f = null;

    /* renamed from: g  reason: collision with root package name */
    private static String f2245g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f2246h = null;
    private static HashSet<String> i = new HashSet<>(Arrays.asList(new String[]{"Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"}));

    public static String a(int i2) {
        switch (i2) {
            case 1:
                return "embeded_ad_landingpage";
            case 2:
                return "banner_ad_landingpage";
            case 3:
                return "interaction_landingpage";
            case 4:
                return "splash_ad_landingpage";
            case 5:
                return "fullscreen_interstitial_ad";
            case 6:
                return "draw_ad_landingpage";
            case 7:
                return "rewarded_video_landingpage";
            default:
                return null;
        }
    }

    public static void a(n nVar, View view) {
    }

    public static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? (i2 == 3 || i2 == 4) ? "open_ad" : i2 != 7 ? i2 != 8 ? i2 != 9 ? "embeded_ad" : "draw_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static boolean e(int i2) {
        return i2 == 4;
    }

    public static boolean f(int i2) {
        return i2 == 5;
    }

    public static boolean g(int i2) {
        return i2 == 6;
    }

    public static Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(Context context, String str) {
        return h.d() != null && !h.d().a();
    }

    public static boolean d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                b.a(context, intent, (b.a) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return b(e(nVar));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 1
            r2 = 7
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 6
            switch(r0) {
                case -1695837674: goto L_0x0055;
                case -1364000502: goto L_0x004b;
                case -1263194568: goto L_0x0041;
                case -764631662: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 564365438: goto L_0x0023;
                case 1844104722: goto L_0x0019;
                case 1912999166: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x005f
        L_0x000f:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 1
            goto L_0x0060
        L_0x0019:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 3
            goto L_0x0060
        L_0x0023:
            java.lang.String r0 = "cache_splash_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 5
            goto L_0x0060
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 0
            goto L_0x0060
        L_0x0037:
            java.lang.String r0 = "fullscreen_interstitial_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 6
            goto L_0x0060
        L_0x0041:
            java.lang.String r0 = "open_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 4
            goto L_0x0060
        L_0x004b:
            java.lang.String r0 = "rewarded_video"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 7
            goto L_0x0060
        L_0x0055:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 2
            goto L_0x0060
        L_0x005f:
            r8 = -1
        L_0x0060:
            switch(r8) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0068;
                case 3: goto L_0x0067;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x0065;
                case 7: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        L_0x0068:
            return r6
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.u.a(java.lang.String):int");
    }

    public static JSONObject b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static boolean b(n nVar) {
        return nVar != null && e(nVar) == 9;
    }

    public static boolean c(n nVar) {
        return nVar != null && e(nVar) == 7;
    }

    public static boolean d(n nVar) {
        return nVar != null && e(nVar) == 8;
    }

    public static int e(n nVar) {
        JSONObject aH;
        int aI = nVar.aI();
        if (aI != 0 || (aH = nVar.aH()) == null) {
            return aI;
        }
        int optInt = aH.optInt("ad_slot_type", 0);
        nVar.C(optInt);
        return optInt;
    }

    public static int f(n nVar) {
        JSONObject aH = nVar.aH();
        if (aH != null) {
            return aH.optInt("rit", 0);
        }
        return 0;
    }

    public static long c(String str) {
        return a(b(str));
    }

    private static long a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0);
        }
        return 0;
    }

    public static int d(String str) {
        return b(b(str));
    }

    private static int b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static double e(String str) {
        return c(b(str));
    }

    public static double g(n nVar) {
        return c(nVar.aH());
    }

    private static double c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static String h(n nVar) {
        JSONObject aH;
        String aJ = nVar.aJ();
        if (TextUtils.isEmpty(aJ) && (aH = nVar.aH()) != null) {
            aJ = aH.optString("req_id", "");
            nVar.q(aJ);
        }
        if (aJ == null) {
            return "";
        }
        return aJ;
    }

    public static String a(n nVar, String str) {
        JSONObject aH = nVar.aH();
        return aH != null ? aH.optString("rit", str) : str;
    }

    public static String i(n nVar) {
        if (nVar == null || nVar.aa() == null || TextUtils.isEmpty(nVar.aa().a())) {
            return null;
        }
        return nVar.aa().a();
    }

    public static String a() {
        String str;
        String str2 = "unKnow";
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                str = com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_multi_ua_data", "android_system_ua", str2);
            } else {
                str = c.a(m.a()).b("android_system_ua", str2);
            }
            if (str != null && !str2.equals(str)) {
                return str;
            }
            FutureTask futureTask = new FutureTask(new a(2));
            f2239a.execute(futureTask);
            str2 = (String) futureTask.get(500, TimeUnit.MILLISECONDS);
            l.e("getUA", " getAndroidSystemUA userAgent" + str2);
            return str2;
        } catch (Exception unused) {
        }
    }

    public static String b() {
        if (!TextUtils.isEmpty(f2243e)) {
            return f2243e;
        }
        try {
            f2243e = h.a("sdk_local_web_ua", (long) Constants.MILLIS_IN_DAY);
            if (TextUtils.isEmpty(f2243e)) {
                if (Build.VERSION.SDK_INT < 17) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                try {
                                    if (TextUtils.isEmpty(u.f2243e)) {
                                        SSWebView sSWebView = new SSWebView(m.a());
                                        sSWebView.setWebViewClient(new SSWebView.a());
                                        String unused = u.f2243e = sSWebView.getUserAgentString();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        });
                    } else if (TextUtils.isEmpty(f2243e)) {
                        SSWebView sSWebView = new SSWebView(m.a());
                        sSWebView.setWebViewClient(new SSWebView.a());
                        f2243e = sSWebView.getUserAgentString();
                    }
                } else if (TextUtils.isEmpty(f2243e)) {
                    f2243e = WebSettings.getDefaultUserAgent(m.a());
                }
                h.a("sdk_local_web_ua", f2243e);
            }
        } catch (Exception unused) {
        }
        return f2243e;
    }

    /* access modifiers changed from: private */
    public static String u() {
        try {
            WebView webView = new WebView(m.a());
            webView.setWebViewClient(new SSWebView.a());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    c.a(m.a()).a("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            l.e("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* compiled from: ToolUtils */
    public static class a implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        int f2249a = 1;

        a(int i) {
            this.f2249a = i;
        }

        /* renamed from: a */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            if (this.f2249a == 1) {
                str = c();
            }
            if (this.f2249a == 2) {
                str = b();
            }
            return str;
        }

        private String b() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                c.a(m.a()).a("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        l.e("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                str = "unKnow";
                th = th4;
                l.e("getUA", "e:" + th.getMessage());
                return str;
            }
            return str;
        }

        private synchronized String c() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    strArr[0] = u.u();
                    l.b("getUA", "webview ua：" + strArr[0]);
                }
            });
            while ("unKnow".equals(strArr[0])) {
            }
            return strArr[0];
        }
    }

    public static String c() {
        return l.a();
    }

    public static synchronized String d() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f2244f) && m.a() != null) {
                try {
                    f2244f = m.a().getPackageName();
                } catch (Throwable th) {
                    l.c("ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
            str = f2244f;
        }
        return str;
    }

    public static synchronized String e() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f2245g) && m.a() != null) {
                try {
                    PackageInfo packageInfo = m.a().getPackageManager().getPackageInfo(d(), 0);
                    f2245g = String.valueOf(packageInfo.versionCode);
                    f2246h = packageInfo.versionName;
                } catch (Throwable th) {
                    l.c("ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
            str = f2245g;
        }
        return str;
    }

    public static synchronized String f() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f2246h) && m.a() != null) {
                try {
                    PackageInfo packageInfo = m.a().getPackageManager().getPackageInfo(d(), 0);
                    f2245g = String.valueOf(packageInfo.versionCode);
                    f2246h = packageInfo.versionName;
                } catch (Throwable th) {
                    l.c("ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
            str = f2246h;
        }
        return str;
    }

    public static String a(Context context) {
        String b2 = c.a(context).b("total_memory", (String) null);
        if (b2 == null || f(b2) <= 0) {
            b2 = e(context, "MemTotal");
            if (f(b2) <= 0) {
                b2 = g();
            }
            c.a(context).a("total_memory", b2);
        }
        return b2;
    }

    public static long f(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String g() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) m.a().getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        return c.a(context).b("total_memory", BuildConfig.ADAPTER_VERSION);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileReader} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|22|23|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[SYNTHETIC, Splitter:B:11:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0060 A[SYNTHETIC, Splitter:B:38:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(android.content.Context r6, java.lang.String r7) {
        /*
            r6 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004e }
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r0, r2)     // Catch:{ all -> 0x004e }
        L_0x000f:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x001b
            boolean r3 = r2.contains(r7)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x000f
        L_0x001b:
            if (r2 != 0) goto L_0x0024
            r1.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r0.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            return r6
        L_0x0024:
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r2.split(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "ToolUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "getTotalMemory = "
            r3.append(r4)     // Catch:{ all -> 0x004c }
            r4 = 1
            r5 = r7[r4]     // Catch:{ all -> 0x004c }
            r3.append(r5)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004c }
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x004c }
            r6 = r7[r4]     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            r0.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return r6
        L_0x004c:
            r7 = move-exception
            goto L_0x0054
        L_0x004e:
            r7 = move-exception
            r1 = r6
            goto L_0x0054
        L_0x0051:
            r7 = move-exception
            r0 = r6
            r1 = r0
        L_0x0054:
            r7.printStackTrace()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ Exception -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            return r6
        L_0x0064:
            r6 = move-exception
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.u.e(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int h() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a  reason: collision with root package name */
                private Pattern f2247a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f2247a.matcher(str).matches();
                }
            })) == null) {
                return 0;
            }
            return Math.max(listFiles.length, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int c(Context context) {
        return c.a(context).b("cpu_count", 0);
    }

    public static int d(Context context) {
        return c.a(context).b("cpu_max_frequency", 0);
    }

    public static int e(Context context) {
        return c.a(context).b("cpu_min_frequency", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC, Splitter:B:27:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[Catch:{ Exception -> 0x0064 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r7) {
        /*
            r0 = 0
            r1 = 0
            r1 = r0
            r2 = 0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0072
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            r4.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004d }
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0042 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x0039
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0042 }
            if (r1 <= r2) goto L_0x0039
            r2 = r1
        L_0x0039:
            r0.close()     // Catch:{ Exception -> 0x003f }
            r3.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0042:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0051
        L_0x0047:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0051:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0066 }
            com.bytedance.sdk.component.utils.l.e(r4, r1)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x005f
            r3.close()     // Catch:{ Exception -> 0x0064 }
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r1 = r3
            goto L_0x0004
        L_0x0066:
            r7 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ Exception -> 0x0071 }
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r7
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.u.c(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[SYNTHETIC, Splitter:B:28:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ Exception -> 0x0067 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(int r7) {
        /*
            r0 = 0
            r1 = 0
            r1 = r0
            r2 = 0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0075
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r4.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            r4.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x004a }
            r0.<init>(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0045 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x003c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0045 }
            if (r1 >= r2) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            if (r2 != 0) goto L_0x003c
        L_0x003b:
            r2 = r1
        L_0x003c:
            r0.close()     // Catch:{ Exception -> 0x0042 }
            r3.close()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0045:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0054
        L_0x004a:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0054:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0069 }
            com.bytedance.sdk.component.utils.l.e(r4, r1)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = r3
            goto L_0x0004
        L_0x0069:
            r7 = move-exception
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ Exception -> 0x0074 }
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            throw r7
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.u.d(int):int");
    }

    public static long f(Context context) {
        return c.a(context).b("total_internal_storage", 0).longValue();
    }

    public static long i() {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getBlockCountLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getBlockCount();
            }
            return j2 * j;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long g(Context context) {
        return c.a(context).b("free_internal_storage", 0).longValue();
    }

    public static long h(Context context) {
        return c.a(context).b("total_sdcard_storage", 0).longValue();
    }

    public static long j() {
        try {
            if (!v()) {
                return 0;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static boolean v() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int i(Context context) {
        return c.a(context).b("is_root", -1);
    }

    public static boolean k() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String g(String str) {
        return a(str, false);
    }

    public static String a(String str, boolean z) {
        String str2;
        String p = m.h().p();
        if (TextUtils.isEmpty(p)) {
            int o = o();
            if (o == 1) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else if (o == 2) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://" + "pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return s.b(str2);
            }
            return p(str2);
        }
        String str3 = "https://" + p + str;
        if (s.a() && !z) {
            str3 = s.b(str3);
        }
        return z ? p(str3) : str3;
    }

    private static String p(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID).appendQueryParameter("version_code", e()).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m.h().q();
        }
        if (TextUtils.isEmpty(str)) {
            return o() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/";
        }
        if (str.startsWith("http")) {
            return str;
        }
        return "https://" + str;
    }

    public static String l() {
        return String.format("https://%s", new Object[]{"log.byteoversea.com/service/2/app_log_test/"});
    }

    public static String m() {
        int o = o();
        return (o == 1 || o == 2) ? "https://sf-tb-sg.ibytedtos.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-muse-va.ibytedtos.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String n() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e2) {
            l.e("ToolUtils", e2.toString());
            return "";
        }
    }

    public static int o() {
        try {
            String id = TimeZone.getDefault().getID();
            if (i.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/")) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            l.e("ToolUtils", th.toString());
            return 0;
        }
    }

    public static String j(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale.getLanguage();
            String country = locale.getCountry();
            return language + "_" + country;
        } catch (Exception e2) {
            l.e("ToolUtils", e2.toString());
            return "";
        }
    }

    public static String k(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e2) {
            l.e("ToolUtils", e2.toString());
            return "";
        }
    }

    public static int p() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String q() {
        int i2 = -p();
        if (i2 >= 0) {
            return "Etc/GMT+" + i2;
        }
        return "Etc/GMT" + i2;
    }

    public static Map<String, Object> a(boolean z, n nVar, long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.Y());
        hashMap.put("load_time", Long.valueOf(j));
        com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.e()));
            hashMap.put("video_resolution", J.g());
        }
        if (!z) {
            hashMap.put("error_code", Long.valueOf(j2));
            if (TextUtils.isEmpty(str)) {
                str = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
            hashMap.put("error_message", str);
        }
        return hashMap;
    }

    public static Map<String, Object> a(n nVar, long j, com.bykv.vk.openvk.component.video.api.a aVar) {
        if (nVar == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.Y());
        hashMap.put("buffers_time", Long.valueOf(j));
        com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.e()));
            hashMap.put("video_resolution", J.g());
        }
        a((Map<String, Object>) hashMap, aVar);
        return hashMap;
    }

    private static void a(Map<String, Object> map, com.bykv.vk.openvk.component.video.api.a aVar) {
        if (!map.containsKey("video_resolution") && aVar != null) {
            try {
                int j = aVar.j();
                int k = aVar.k();
                map.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", new Object[]{Integer.valueOf(j), Integer.valueOf(k)}));
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean i(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(n nVar, String str) {
        if (nVar != null) {
            try {
                String O = nVar.O();
                if (TextUtils.isEmpty(O) && nVar.ab() != null && nVar.ab().c() == 1 && !TextUtils.isEmpty(nVar.ab().b())) {
                    O = nVar.ab().b();
                }
                String str2 = O;
                if (!TextUtils.isEmpty(str2)) {
                    y.a(m.a(), str2, nVar, a(str), str, false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean j(n nVar) {
        if (nVar == null) {
            return true;
        }
        int c2 = m.h().c(f(nVar));
        int c3 = o.c(m.a());
        if (c2 == 1) {
            return e(c3);
        }
        if (c2 != 2) {
            if (c2 == 3) {
                return false;
            }
            if (c2 == 5 && !e(c3) && !g(c3)) {
                return false;
            }
            return true;
        } else if (f(c3) || e(c3) || g(c3)) {
            return true;
        } else {
            return false;
        }
    }

    public static void a(JSONObject jSONObject, boolean z) {
        String a2;
        if (s.a() && (a2 = s.a("testGps.txt")) != null) {
            try {
                String[] split = a2.split(",");
                if (split.length >= 2 && j(split[1]) && j(split[0])) {
                    if (z) {
                        a(jSONObject, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    a(jSONObject2, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                    jSONObject.put("geo", jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, Float f2, Float f3) {
        if (jSONObject != null) {
            try {
                jSONObject.put(com.bytedance.sdk.component.c.a.a("w0yrwBEUr1ini9hm/p022A==", com.bytedance.sdk.openadsdk.core.a.a()), f3);
                jSONObject.put(com.bytedance.sdk.component.c.a.a("LeHrqxcsm457V3n1/LcJVw==", com.bytedance.sdk.openadsdk.core.a.a()), f2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static boolean l(Context context) {
        if (context != null) {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30;
            StringBuilder sb = new StringBuilder();
            sb.append("can query all package = ");
            sb.append(!z);
            l.c("ToolUtils", sb.toString());
            return !z;
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        if (str.contains("kllk")) {
            return str.replace("kllk", "oppo");
        }
        return "";
    }

    public static boolean a(long j, long j2) {
        long j3 = j2 - j;
        return j3 < Constants.MILLIS_IN_DAY && j3 > -86400000 && a(j) == a(j2);
    }

    public static long a(long j) {
        return (j + ((long) TimeZone.getDefault().getOffset(j))) / Constants.MILLIS_IN_DAY;
    }

    public static void a(String str, String str2, Context context) {
        int i2;
        if (!TextUtils.isEmpty(str2) && context != null && m(context)) {
            int i3 = 3572;
            int length = str2.length();
            int i4 = 0;
            int i5 = 1;
            if (length % 3572 == 0) {
                i2 = length / 3572;
            } else {
                i2 = (length / 3572) + 1;
            }
            while (i5 <= i2) {
                if (i3 < length) {
                    Log.d(str, i2 + "-" + i5 + ":" + str2.substring(i4, i3));
                    i5++;
                    i4 = i3;
                    i3 += 3572;
                } else {
                    Log.d(str, i2 + "-" + i5 + ":" + str2.substring(i4));
                    return;
                }
            }
        }
    }

    public static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long n(Context context) {
        int i2 = -1;
        try {
            i2 = context.getApplicationInfo().targetSdkVersion;
            l.a("ToolUtils", "targetSdkVersion = ", Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
        return (long) i2;
    }

    public static long o(Context context) {
        int i2 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = context.getApplicationInfo().minSdkVersion;
                l.a("ToolUtils", "minSdkVersion = ", Integer.valueOf(i2));
            }
        } catch (Throwable unused) {
        }
        return (long) i2;
    }

    public static void l(final String str) {
        e.a(new g("reportMultiLog") {
            public void run() {
                if (!u.f2241c && m.h().F()) {
                    try {
                        boolean unused = u.f2241c = true;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error", str);
                        com.bytedance.sdk.openadsdk.h.b.a().a("reportMultiLog", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    public static void m(String str) {
        if (!TTAdSdk.isInitSuccess()) {
            l.b("You must use method '" + str + "' after initialization, please check.");
        }
    }

    public static void n(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            l.b("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
        }
    }

    public static int p(Context context) {
        int b2 = o.b(context);
        if (b2 == 6) {
            return 5;
        }
        return b2;
    }
}
