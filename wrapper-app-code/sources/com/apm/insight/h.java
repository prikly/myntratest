package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.d;
import com.apm.insight.runtime.i;
import com.apm.insight.runtime.t;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Context f10619a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Application f10620b = null;

    /* renamed from: c  reason: collision with root package name */
    private static long f10621c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static String f10622d = "default";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f10623e = false;

    /* renamed from: f  reason: collision with root package name */
    private static d f10624f;

    /* renamed from: g  reason: collision with root package name */
    private static ConfigManager f10625g = new ConfigManager();

    /* renamed from: h  reason: collision with root package name */
    private static a f10626h = new a();
    private static volatile ConcurrentHashMap<Integer, String> i;
    private static t j = null;
    private static volatile String k = null;
    private static Object l = new Object();
    private static volatile int m = 0;
    private static volatile String n;
    private static int o = 0;

    public static d a() {
        if (f10624f == null) {
            f10624f = i.a(f10619a);
        }
        return f10624f;
    }

    public static String a(long j2, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        String str = "normal_";
        sb.append(z ? "oom_" : str);
        sb.append(j());
        sb.append('_');
        if (z2) {
            str = "ignore_";
        }
        sb.append(str);
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    public static void a(int i2) {
        o = i2;
    }

    static void a(int i2, String str) {
        if (i == null) {
            synchronized (h.class) {
                if (i == null) {
                    i = new ConcurrentHashMap<>();
                }
            }
        }
        i.put(Integer.valueOf(i2), str);
    }

    public static void a(Application application) {
        if (application != null) {
            f10620b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f10620b == null) {
            f10621c = System.currentTimeMillis();
            f10619a = context;
            f10620b = application;
            k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f10624f = new d(f10619a, iCommonParams, a());
    }

    public static void a(d dVar) {
        f10624f = dVar;
    }

    static void a(String str) {
        f10622d = str;
    }

    static void a(boolean z) {
        f10623e = z;
    }

    public static a b() {
        return f10626h;
    }

    static void b(int i2, String str) {
        m = i2;
        n = str;
    }

    public static t c() {
        if (j == null) {
            synchronized (h.class) {
                j = new t(f10619a);
            }
        }
        return j;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (k == null) {
            synchronized (l) {
                if (k == null) {
                    k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return k;
    }

    public static Context g() {
        return f10619a;
    }

    public static Application h() {
        return f10620b;
    }

    public static ConfigManager i() {
        return f10625g;
    }

    public static long j() {
        return f10621c;
    }

    public static String k() {
        return f10622d;
    }

    public static int l() {
        return o;
    }

    public static boolean m() {
        return f10623e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        return obj == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return i;
    }

    public static int p() {
        return m;
    }

    public static String q() {
        return n;
    }
}
