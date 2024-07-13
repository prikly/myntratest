package com.appodeal.ads;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.utils.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f16398a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16399b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static long f16400c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static long f16401d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static long f16402e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static int f16403f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static WeakReference<ActivityManager> f16404g = null;

    /* renamed from: h  reason: collision with root package name */
    public static WeakReference<WindowManager> f16405h = null;
    public static WeakReference<LocationManager> i = null;
    public static WeakReference<ConnectivityManager> j = null;

    public class a implements FileFilter {
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static float a() {
        try {
            int d2 = d();
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < d2; i2++) {
                f4 += a(String.format("/sys/devices/system/cpu/cpu%s/cpufreq/scaling_cur_freq", new Object[]{Integer.valueOf(i2)}));
                f3 += b(i2);
                f2 += a(i2);
            }
            float f5 = f2 - f3;
            if (f5 > 0.0f && f2 >= 0.0f) {
                return (f4 - f3) / f5;
            }
            return 0.0f;
        } catch (Throwable th) {
            Log.log(th);
            return 0.0f;
        }
    }

    public static float a(int i2) {
        HashMap hashMap = f16398a;
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            Float f2 = (Float) hashMap.get(Integer.valueOf(i2));
            if (f2 != null) {
                return f2.floatValue();
            }
            return 0.0f;
        }
        float a2 = a(String.format("/sys/devices/system/cpu/cpu%s/cpufreq/cpuinfo_max_freq", new Object[]{Integer.valueOf(i2)}));
        if (a2 > 0.0f) {
            hashMap.put(Integer.valueOf(i2), Float.valueOf(a2));
        }
        return a2;
    }

    public static float a(String str) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream2);
            } catch (Throwable unused) {
                inputStreamReader = null;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                n5.a((Closeable) bufferedReader);
                n5.a((Closeable) inputStreamReader);
                n5.a((Closeable) fileInputStream);
                return 0.0f;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 1024);
            } catch (Throwable unused2) {
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                n5.a((Closeable) bufferedReader);
                n5.a((Closeable) inputStreamReader);
                n5.a((Closeable) fileInputStream);
                return 0.0f;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    float parseFloat = Float.parseFloat(readLine);
                    n5.a((Closeable) bufferedReader);
                    n5.a((Closeable) inputStreamReader);
                    n5.a((Closeable) fileInputStream2);
                    return parseFloat;
                }
                n5.a((Closeable) bufferedReader);
                n5.a((Closeable) inputStreamReader);
                n5.a((Closeable) fileInputStream2);
                return 0.0f;
            } catch (Throwable unused3) {
                fileInputStream = fileInputStream2;
                n5.a((Closeable) bufferedReader);
                n5.a((Closeable) inputStreamReader);
                n5.a((Closeable) fileInputStream);
                return 0.0f;
            }
        } catch (Throwable unused4) {
            inputStreamReader = null;
            bufferedReader = null;
            n5.a((Closeable) bufferedReader);
            n5.a((Closeable) inputStreamReader);
            n5.a((Closeable) fileInputStream);
            return 0.0f;
        }
    }

    public static int a(Context context, float f2) {
        return Math.round(TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics()));
    }

    public static String a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public static float b(int i2) {
        HashMap hashMap = f16399b;
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            Float f2 = (Float) hashMap.get(Integer.valueOf(i2));
            if (f2 != null) {
                return f2.floatValue();
            }
            return 0.0f;
        }
        float a2 = a(String.format("/sys/devices/system/cpu/cpu%s/cpufreq/cpuinfo_min_freq", new Object[]{Integer.valueOf(i2)}));
        if (a2 > 0.0f) {
            hashMap.put(Integer.valueOf(i2), Float.valueOf(a2));
        }
        return a2;
    }

    public static float b(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra == -1 || intExtra2 == -1) {
                    return -1.0f;
                }
                return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
            }
        } catch (Throwable th) {
            Log.log(th);
        }
        return -1.0f;
    }

    public static String b() {
        return Build.MANUFACTURER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r5 != 9) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appodeal.ads.modules.common.internal.data.ConnectionData c(android.content.Context r6) {
        /*
            java.lang.ref.WeakReference<android.net.ConnectivityManager> r0 = j
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0013
            java.lang.ref.WeakReference<android.net.ConnectivityManager> r6 = j
            java.lang.Object r6 = r6.get()
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            goto L_0x0022
        L_0x0013:
            java.lang.String r0 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            j = r0
        L_0x0022:
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()
            r0 = 1
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L_0x0054
            boolean r3 = r6.isConnected()
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = r6.getTypeName()
            java.lang.String r4 = r6.getSubtypeName()
            int r5 = r6.getType()
            if (r5 == 0) goto L_0x004c
            if (r5 == r0) goto L_0x0058
            r6 = 6
            if (r5 == r6) goto L_0x0058
            r6 = 7
            if (r5 == r6) goto L_0x0057
            r6 = 9
            if (r5 == r6) goto L_0x0058
            goto L_0x0053
        L_0x004c:
            int r6 = r6.getSubtype()
            switch(r6) {
                case 3: goto L_0x0058;
                case 4: goto L_0x0053;
                case 5: goto L_0x0058;
                case 6: goto L_0x0058;
                case 7: goto L_0x0053;
                case 8: goto L_0x0058;
                case 9: goto L_0x0058;
                case 10: goto L_0x0058;
                case 11: goto L_0x0053;
                case 12: goto L_0x0058;
                case 13: goto L_0x0058;
                case 14: goto L_0x0058;
                case 15: goto L_0x0058;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0057
        L_0x0054:
            java.lang.String r3 = "unknown"
            r4 = r2
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r3 == 0) goto L_0x006a
            java.lang.String r6 = "CELLULAR"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0064
            java.lang.String r3 = "MOBILE"
        L_0x0064:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r6)
        L_0x006a:
            if (r4 == 0) goto L_0x007b
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r4.toLowerCase(r6)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r2 = r6
            goto L_0x007c
        L_0x007b:
            r2 = r4
        L_0x007c:
            com.appodeal.ads.modules.common.internal.data.ConnectionData r6 = new com.appodeal.ads.modules.common.internal.data.ConnectionData
            r6.<init>(r3, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.f1.c(android.content.Context):com.appodeal.ads.modules.common.internal.data.ConnectionData");
    }

    public static String c() {
        return Build.MODEL;
    }

    public static int d() {
        if (f16403f == 0) {
            try {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
                f16403f = listFiles != null ? listFiles.length : Runtime.getRuntime().availableProcessors();
            } catch (Throwable th) {
                f16403f = Runtime.getRuntime().availableProcessors();
                Log.log(th);
            }
        }
        return f16403f;
    }

    public static int d(Context context) {
        ConnectivityManager connectivityManager;
        WeakReference<ConnectivityManager> weakReference = j;
        if (weakReference == null || weakReference.get() == null) {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            j = new WeakReference<>(connectivityManager);
        } else {
            connectivityManager = j.get();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return 3;
            }
            if (type != 1) {
                return type != 9 ? 0 : 1;
            }
            return 2;
        }
    }

    public static long e() {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return ((long) memoryInfo.getTotalPss()) * 1024;
        } catch (Throwable th) {
            Log.log(th);
            return 0;
        }
    }

    public static String e(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() < 3) {
            return null;
        }
        return networkOperator.substring(0, 3) + '-' + networkOperator.substring(3);
    }

    public static long f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            Log.log(th);
            return 0;
        }
    }

    public static JSONObject f(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("battery", (double) b(context));
            jSONObject.put("rooted", m());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static long g() {
        try {
            if (f16400c == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                f16400c = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            }
        } catch (Throwable th) {
            Log.log(th);
        }
        return f16400c;
    }

    public static String g(Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    public static int h(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static long h() {
        try {
            return g() - f();
        } catch (Throwable th) {
            Log.log(th);
            return 0;
        }
    }

    public static Location i(Context context) {
        LocationManager locationManager;
        String str;
        if (!n5.a(context, "android.permission.ACCESS_FINE_LOCATION") && !n5.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return null;
        }
        WeakReference<LocationManager> weakReference = i;
        if (weakReference == null || weakReference.get() == null) {
            locationManager = (LocationManager) context.getSystemService("location");
            i = new WeakReference<>(locationManager);
        } else {
            locationManager = i.get();
        }
        String bestProvider = locationManager.getBestProvider(new Criteria(), false);
        if (bestProvider == null) {
            return null;
        }
        try {
            return locationManager.getLastKnownLocation(bestProvider);
        } catch (SecurityException unused) {
            str = "failed to retrieve GPS location: permission not granted";
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_LOCATION, str);
            return null;
        } catch (IllegalArgumentException unused2) {
            str = "failed to retrieve GPS location: device has no GPS provider";
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_LOCATION, str);
            return null;
        }
    }

    public static String i() {
        return Build.VERSION.RELEASE;
    }

    public static int j() {
        return Build.VERSION.SDK_INT;
    }

    public static long j(Context context) {
        ActivityManager activityManager;
        try {
            if (f16402e == 0) {
                WeakReference<ActivityManager> weakReference = f16404g;
                if (weakReference == null || weakReference.get() == null) {
                    activityManager = (ActivityManager) context.getSystemService("activity");
                    f16404g = new WeakReference<>(activityManager);
                } else {
                    activityManager = f16404g.get();
                }
                f16402e = ((long) activityManager.getLargeMemoryClass()) * 1024 * 1024;
            }
        } catch (Throwable th) {
            Log.log(th);
            return 0;
        }
        return f16402e - e();
    }

    public static long k(Context context) {
        ActivityManager activityManager;
        try {
            if (f16401d == 0) {
                WeakReference<ActivityManager> weakReference = f16404g;
                if (weakReference == null || weakReference.get() == null) {
                    activityManager = (ActivityManager) context.getSystemService("activity");
                    f16404g = new WeakReference<>(activityManager);
                } else {
                    activityManager = f16404g.get();
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                f16401d = memoryInfo.totalMem;
            }
        } catch (Throwable th) {
            Log.log(th);
        }
        return f16401d;
    }

    public static boolean k() {
        return NetworkStatus.INSTANCE.isConnected();
    }

    public static float l(Context context) {
        Display defaultDisplay = q(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l() {
        /*
            r0 = 1
            r1 = 0
            java.lang.Class<android.os.Build> r2 = android.os.Build.class
            java.lang.String r3 = "IS_EMULATOR"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r0)     // Catch:{ all -> 0x0023 }
            boolean r3 = r2.isAccessible()     // Catch:{ all -> 0x0023 }
            r4 = 0
            if (r3 == 0) goto L_0x0018
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0023 }
        L_0x0018:
            boolean r2 = r4 instanceof java.lang.Boolean     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0023
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0023 }
            boolean r2 = r4.booleanValue()     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = android.os.Build.FINGERPRINT
            java.lang.String r3 = "generic"
            boolean r4 = r2.startsWith(r3)
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = "unknown"
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r4 = "google_sdk"
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L_0x0076
            java.lang.String r5 = "Emulator"
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x0076
            java.lang.String r5 = "Android SDK built for x86"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "Genymotion"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = android.os.Build.BRAND
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = android.os.Build.DEVICE
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L_0x0076
        L_0x006c:
            java.lang.String r2 = android.os.Build.PRODUCT
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.f1.l():boolean");
    }

    public static float m(Context context) {
        Display defaultDisplay = q(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.y) / displayMetrics.density;
    }

    public static boolean m() {
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i2 = 0; i2 < 8; i2++) {
                if (new File(strArr[i2]).exists()) {
                    return true;
                }
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
        return false;
    }

    public static int n(Context context) {
        int rotation = q(context).getDefaultDisplay().getRotation();
        int i2 = context.getResources().getConfiguration().orientation;
        if (i2 == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i2 == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_SCREEN_ORIENTATION, "unknown screen orientation. Defaulting to portrait.");
        return 9;
    }

    public static Point o(Context context) {
        Display defaultDisplay = q(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static float p(Context context) {
        Display defaultDisplay = q(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / displayMetrics.density;
    }

    public static WindowManager q(Context context) {
        WeakReference<WindowManager> weakReference = f16405h;
        if (weakReference != null && weakReference.get() != null) {
            return f16405h.get();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        f16405h = new WeakReference<>(windowManager);
        return windowManager;
    }

    public static boolean r(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = q(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) point.y) / displayMetrics.ydpi), 2.0d) + Math.pow((double) (((float) point.x) / displayMetrics.xdpi), 2.0d)) > 7.0d;
    }

    public static boolean s(Context context) {
        ActivityManager activityManager;
        try {
            WeakReference<ActivityManager> weakReference = f16404g;
            if (weakReference == null || weakReference.get() == null) {
                activityManager = (ActivityManager) context.getSystemService("activity");
                f16404g = new WeakReference<>(activityManager);
            } else {
                activityManager = f16404g.get();
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        } catch (Throwable th) {
            Log.log(th);
            return false;
        }
    }
}
