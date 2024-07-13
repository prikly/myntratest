package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.r;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceUtils */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f2207a = "";

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f2208b = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f2209c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f2210d = false;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f2211e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f2212f = true;

    /* renamed from: g  reason: collision with root package name */
    private static long f2213g;

    /* renamed from: h  reason: collision with root package name */
    private static int f2214h;
    /* access modifiers changed from: private */
    public static int i;
    /* access modifiers changed from: private */
    public static int j;
    /* access modifiers changed from: private */
    public static int k;
    /* access modifiers changed from: private */
    public static int l;

    @JProtect
    public static JSONObject a(Context context, boolean z) {
        for (char c2 = 'l'; c2 > 11; c2 = 65534) {
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", g(context));
            a(jSONObject);
            jSONObject.put("type", d(context));
            int i2 = 1;
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE + "");
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", u.p(context));
            jSONObject.put("screen_width", v.c(context));
            jSONObject.put("screen_height", v.d(context));
            if (m.h().C()) {
                jSONObject.put("sec_did", r.a().c());
            }
            com.bytedance.sdk.openadsdk.core.i.f h2 = m.h();
            if (h2.p("boot")) {
                jSONObject.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            }
            jSONObject.put(Constants.UUID, j.c(context));
            jSONObject.put("rom_version", m.a());
            jSONObject.put("sys_compiling_time", j.b(context));
            jSONObject.put("timezone", u.q());
            jSONObject.put("language", j.a());
            jSONObject.put("carrier_name", n.a());
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(z ? u.a(context) : u.b(context)) * 1024));
            jSONObject.put("locale_language", c());
            jSONObject.put("screen_bright", Math.ceil((double) (d() * 10.0f)) / 10.0d);
            if (a()) {
                i2 = 0;
            }
            jSONObject.put("is_screen_off", i2);
            jSONObject.put("cpu_num", u.c(context));
            jSONObject.put("cpu_max_freq", u.d(context));
            jSONObject.put("cpu_min_freq", u.e(context));
            jSONObject.put("battery_remaining_pct", (int) c.b());
            jSONObject.put("is_charging", c.a());
            jSONObject.put("total_space", String.valueOf(u.f(context)));
            jSONObject.put("free_space_in", String.valueOf(u.g(context)));
            jSONObject.put("sdcard_size", String.valueOf(u.h(context)));
            jSONObject.put("rooted", u.i(context));
            jSONObject.put("enable_assisted_clicking", e());
            jSONObject.put("force_language", t.a(context, "tt_choose_language"));
            jSONObject.put("airplane", h(context));
            jSONObject.put("darkmode", n(context));
            jSONObject.put("headset", o(context));
            jSONObject.put("ringmute", p(context));
            jSONObject.put("screenscale", (double) q(context));
            jSONObject.put("volume", r(context));
            jSONObject.put("low_power_mode", s(context));
            if (h2.p("mnc")) {
                jSONObject.put("mnc", n.c());
            }
            if (h2.p("mcc")) {
                jSONObject.put("mcc", n.b());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @JProtect
    public static void a(Context context) {
        if (!f2208b) {
            try {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    f2212f = powerManager.isScreenOn();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                C0017e eVar = new C0017e();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(eVar, intentFilter);
                f2208b = true;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private static void a(JSONObject jSONObject) throws JSONException {
        b(jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        switch(r2) {
            case 52: goto L_0x0054;
            case 53: goto L_0x0043;
            case 54: goto L_0x0037;
            default: goto L_0x0042;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        switch(r3) {
            case 29: goto L_0x0037;
            case 30: goto L_0x0054;
            case 31: goto L_0x003f;
            default: goto L_0x0046;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r3 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0057 }] */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            boolean r0 = f2212f
            if (r0 != 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = f2213g
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            f2213g = r0
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0057 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0057 }
            r2 = 20
            r3 = 55
            if (r1 < r2) goto L_0x0033
            boolean r0 = r0.isInteractive()     // Catch:{ all -> 0x0057 }
            r1 = 0
            goto L_0x0051
        L_0x0033:
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x0057 }
        L_0x0037:
            r1 = 73
            r2 = 16
        L_0x003b:
            switch(r1) {
                case 72: goto L_0x005b;
                case 73: goto L_0x0049;
                case 74: goto L_0x003f;
                default: goto L_0x003e;
            }     // Catch:{ all -> 0x0057 }
        L_0x003e:
            goto L_0x0054
        L_0x003f:
            switch(r2) {
                case 52: goto L_0x0054;
                case 53: goto L_0x0043;
                case 54: goto L_0x0037;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x0057 }
        L_0x0042:
            goto L_0x0050
        L_0x0043:
            switch(r3) {
                case 29: goto L_0x0037;
                case 30: goto L_0x0054;
                case 31: goto L_0x003f;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x0057 }
        L_0x0046:
            r3 = 30
            goto L_0x0043
        L_0x0049:
            r1 = 57
            if (r2 > r1) goto L_0x0050
            f2212f = r0     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0050:
            r1 = r2
        L_0x0051:
            f2212f = r0     // Catch:{ all -> 0x0057 }
            r2 = r1
        L_0x0054:
            r1 = 72
            goto L_0x003b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            boolean r0 = f2212f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.e.a():boolean");
    }

    public static int b() {
        return com.bytedance.sdk.openadsdk.core.c.a(m.a()).b("limit_ad_track", -1);
    }

    private static void b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (m.h().p("gaid")) {
            jSONObject.put("gaid", com.com.bytedance.overseas.sdk.b.a.a().b());
        }
    }

    public static boolean b(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (Build.VERSION.SDK_INT < 21) {
            return Locale.getDefault().getLanguage();
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static boolean c(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float d() {
        int i2 = -1;
        try {
            Context a2 = m.a();
            if (a2 != null) {
                i2 = Settings.System.getInt(a2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            l.e("DeviceUtils", th.getMessage());
        }
        if (i2 < 0) {
            return -1.0f;
        }
        return ((float) Math.round((((float) i2) / 255.0f) * 10.0f)) / 10.0f;
    }

    public static int d(Context context) {
        if (c(context)) {
            return 3;
        }
        return b(context) ? 2 : 1;
    }

    public static int e() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) m.a().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static JSONObject e(Context context) {
        return a(context, false);
    }

    @JProtect
    public static void f() {
        new f().run();
        Context a2 = m.a();
        if (a2 != null) {
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("cpu_count", u.h());
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("cpu_max_frequency", u.c(u.h()));
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("cpu_min_frequency", u.d(u.h()));
            String e2 = u.e(a2, "MemTotal");
            if (e2 != null) {
                com.bytedance.sdk.openadsdk.core.c.a(a2).a("total_memory", e2);
            }
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("total_internal_storage", u.i());
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("free_internal_storage", com.bytedance.sdk.component.utils.m.a());
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("total_sdcard_storage", u.j());
            com.bytedance.sdk.openadsdk.core.c.a(a2).a("is_root", u.k() ? 1 : 0);
            if (TextUtils.isEmpty(i(a2))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    f2207a = "unity";
                } catch (ClassNotFoundException unused) {
                    f2207a = "native";
                }
                com.bytedance.sdk.openadsdk.core.c.a(a2).a("framework_name", f2207a);
            }
            g();
            t(a2);
            l = v(a2);
        }
    }

    public static void f(Context context) {
        if (!f2209c) {
            try {
                b bVar = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                context.registerReceiver(bVar, intentFilter);
                f2209c = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(Build.VERSION.SDK_INT >= 17 ? context.getContentResolver() : context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            l.e("DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static void g() {
        try {
            int ringerMode = ((AudioManager) m.a().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                f2214h = 1;
            } else if (ringerMode == 1) {
                f2214h = 2;
            } else {
                f2214h = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static int h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String i(Context context) {
        if (TextUtils.isEmpty(f2207a)) {
            f2207a = com.bytedance.sdk.openadsdk.core.c.a(context).b("framework_name", "");
        }
        return f2207a;
    }

    public static void j(Context context) {
        if (context != null) {
            a.b(context.getApplicationContext());
        }
    }

    public static void k(Context context) {
        Context applicationContext;
        if (!f2211e && context != null && (applicationContext = context.getApplicationContext()) != null) {
            try {
                if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                    x(applicationContext);
                } else {
                    d.b(applicationContext);
                }
                f2211e = true;
            } catch (Throwable unused) {
            }
        }
    }

    private static int n(Context context) {
        try {
            int i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i2 == 32) {
                return 1;
            }
            return i2 == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    private static int o(Context context) {
        return k;
    }

    private static int p(Context context) {
        return f2214h;
    }

    private static float q(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static int r(Context context) {
        return j;
    }

    private static int s(Context context) {
        return l;
    }

    private static void t(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            i = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            j = streamVolume;
            j = (int) ((((double) streamVolume) / ((double) i)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public static void u(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            com.bytedance.sdk.component.f.e.a(new g("DeviceUtils_get_low_power_mode") {
                public void run() {
                    int unused = e.l = e.v(applicationContext);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    public static int v(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                    return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
                }
            }
            return w(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int w(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r2 = r1
            goto L_0x0034
        L_0x001c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            r0 = 4
            if (r4 != r0) goto L_0x0019
            goto L_0x001a
        L_0x0034:
            return r2
        L_0x0035:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.e.w(android.content.Context):int");
    }

    private static void x(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver((Handler) null) {
                public void onChange(boolean z) {
                    super.onChange(z);
                    e.u(applicationContext);
                }
            });
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$e  reason: collision with other inner class name */
    /* compiled from: DeviceUtils */
    static class C0017e extends BroadcastReceiver {
        C0017e() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = e.f2212f = true;
                l.c("DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = e.f2212f = false;
                l.c("DeviceUtils", "screen_off");
            }
        }
    }

    /* compiled from: DeviceUtils */
    public static class f implements Runnable {
        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m.a());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (m.h().p("gaid")) {
                        String id = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id)) {
                            com.com.bytedance.overseas.sdk.b.a.a().b(id);
                            com.com.bytedance.overseas.sdk.b.a.a(id);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    com.bytedance.sdk.openadsdk.core.c.a(m.a()).a("limit_ad_track", i);
                }
            } catch (IOException e2) {
                l.c("DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e2);
            } catch (GooglePlayServicesNotAvailableException e3) {
                l.c("DeviceUtils", "getLmtTask error : indicating that Google Play is not installed on this device.", e3);
            } catch (GooglePlayServicesRepairableException e4) {
                l.c("DeviceUtils", "getLmtTask error : indicating that there was a recoverable error connecting to Google Play Services.", e4);
            } catch (Throwable th) {
                l.e("DeviceUtils", th.getMessage());
            }
        }
    }

    /* compiled from: DeviceUtils */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        static int f2217a = -1;

        /* renamed from: b  reason: collision with root package name */
        static float f2218b;

        public static int a() {
            return f2217a;
        }

        public static float b() {
            return f2218b;
        }
    }

    /* compiled from: DeviceUtils */
    static class b extends BroadcastReceiver {
        b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("status", -1);
                if (intExtra == -1) {
                    c.f2217a = intExtra;
                }
                if (intExtra == 2) {
                    c.f2217a = 1;
                } else {
                    c.f2217a = 0;
                }
                c.f2218b = ((float) (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100)) / ((float) intent.getIntExtra("scale", -1));
            }
        }
    }

    /* compiled from: DeviceUtils */
    static class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = e.j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (e.i != 0) {
                            int unused2 = e.j = (int) ((((double) e.j) / ((double) e.i)) * 100.0d);
                        }
                    }
                } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = e.k = intent.getIntExtra(AdOperationMetric.INIT_STATE, 0);
                }
            }
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (!e.f2210d && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new a(), intentFilter);
                    boolean unused = e.f2210d = true;
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* compiled from: DeviceUtils */
    private static class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    e.u(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i = 0;
                    if (intent.getIntExtra(AdOperationMetric.INIT_STATE, 0) == 1) {
                        i = 1;
                    }
                    int unused = e.l = i;
                }
            }
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (Build.VERSION.SDK_INT >= 21 && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                context.registerReceiver(new d(), intentFilter);
            }
        }
    }
}
