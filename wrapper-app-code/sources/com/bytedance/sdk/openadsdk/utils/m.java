package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.f;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.u;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: RomUtils */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2221a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2222b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f2223c = "sony";

    /* renamed from: d  reason: collision with root package name */
    private static final CharSequence f2224d = "amigo";

    /* renamed from: e  reason: collision with root package name */
    private static final CharSequence f2225e = "funtouch";

    /* renamed from: f  reason: collision with root package name */
    private static String f2226f = null;

    /* renamed from: g  reason: collision with root package name */
    private static int f2227g = Integer.MAX_VALUE;

    public static String a() {
        if (!TextUtils.isEmpty(f2226f)) {
            return f2226f;
        }
        String a2 = h.a("sdk_local_rom_info", 604800000);
        f2226f = a2;
        if (TextUtils.isEmpty(a2)) {
            String u = u();
            f2226f = u;
            h.a("sdk_local_rom_info", u);
        }
        return f2226f;
    }

    private static String u() {
        if (o()) {
            return p();
        }
        if (e()) {
            return l();
        }
        if (b()) {
            return q();
        }
        if (r()) {
            return s();
        }
        String m = m();
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        if (g()) {
            return f();
        }
        if (h()) {
            return i();
        }
        if (d()) {
            return c();
        }
        String j = j();
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        return Build.DISPLAY;
    }

    public static boolean b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String c() {
        return d("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (!f2222b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f2221a = true;
                    f2222b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f2222b = true;
        }
        return f2221a;
    }

    public static String f() {
        return d("ro.vivo.os.build.display.id") + "_" + d("ro.vivo.product.version");
    }

    public static boolean g() {
        String d2 = d("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(d2) && d2.toLowerCase().contains(f2225e);
    }

    public static boolean h() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(f2224d);
    }

    public static String i() {
        return Build.DISPLAY + "_" + d("ro.gn.sv.version");
    }

    public static String j() {
        if (!k()) {
            return "";
        }
        return "eui_" + d("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean k() {
        return !TextUtils.isEmpty(d("ro.letv.release.version"));
    }

    public static String l() {
        if (!e()) {
            return "";
        }
        return "miui_" + d("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String m() {
        String n = n();
        if (n == null || !n.toLowerCase().contains("emotionui")) {
            return "";
        }
        return n + "_" + Build.DISPLAY;
    }

    public static String n() {
        return d("ro.build.version.emui");
    }

    public static boolean o() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String p() {
        if (o()) {
            try {
                String d2 = d("ro.smartisan.version");
                return "smartisan_" + d2;
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String q() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean r() {
        if (f2227g == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String k = u.k("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(k)) {
                f2227g = 0;
            } else {
                f2227g = 1;
            }
        }
        if (f2227g == 1) {
            return true;
        }
        return false;
    }

    public static String s() {
        if (!r()) {
            return "";
        }
        String k = u.k("ro.build.version.kllkrom");
        return "coloros_" + d(k) + "_" + Build.DISPLAY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (android.os.Build.BRAND.toLowerCase().startsWith("huawei") == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002b
        L_0x0017:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.m.t():boolean");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = n();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r5 = null;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ExcHandler: all (r4v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC, Splitter:B:39:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.<init>()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r6 = "getprop "
            r5.append(r6)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.append(r8)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStream r7 = r4.getInputStream()     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.lang.String r2 = r5.readLine()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r4.exitValue()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x007e
        L_0x003b:
            r8 = move-exception
            com.bytedance.sdk.component.utils.l.c(r1, r0, r8)
            goto L_0x007e
        L_0x0040:
            r3 = move-exception
            goto L_0x0048
        L_0x0042:
            r5 = r3
        L_0x0043:
            r3 = r4
            goto L_0x0074
        L_0x0045:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "Unable to read sysprop "
            r4.append(r6)     // Catch:{ all -> 0x0067 }
            r4.append(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0067 }
            com.bytedance.sdk.component.utils.l.c(r1, r8, r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r8 = move-exception
            com.bytedance.sdk.component.utils.l.c(r1, r0, r8)
        L_0x0066:
            return r2
        L_0x0067:
            r8 = move-exception
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            com.bytedance.sdk.component.utils.l.c(r1, r0, r2)
        L_0x0072:
            throw r8
        L_0x0073:
            r5 = r3
        L_0x0074:
            r3.destroy()     // Catch:{ all -> 0x0078 }
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            r5.close()     // Catch:{ IOException -> 0x003b }
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.m.c(java.lang.String):java.lang.String");
    }

    private static String d(String str) {
        String str2;
        try {
            str2 = v();
            try {
                if (TextUtils.isEmpty(str2)) {
                    final f fVar = new f(new a(str), 5, 2);
                    e.a(new g("_getSystemPropertyTask") {
                        public void run() {
                            fVar.run();
                        }
                    }, 5);
                    str2 = (String) fVar.get(1, TimeUnit.SECONDS);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = "";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* compiled from: RomUtils */
    public static class a implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        private String f2229a;

        public a(String str) {
            this.f2229a = str;
        }

        /* renamed from: a */
        public String call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String b2 = m.c(this.f2229a);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            l.b("RomUtils", "property:" + b2 + ",getSystemProperty use time :" + currentTimeMillis2);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    if (b.c()) {
                        l.d("RomUtils", "SPMultiHelper-getPropertyFromSPMultiHelper:" + b2);
                        com.bytedance.sdk.openadsdk.multipro.d.a.a("rom_info", "rom_property_info", b2);
                    } else {
                        l.d("RomUtils", "SP-getPropertyFromSP:" + b2);
                        u.a("rom_info", com.bytedance.sdk.openadsdk.core.m.a()).a("rom_property_info", b2);
                    }
                } catch (Throwable unused) {
                }
            }
            return b2;
        }
    }

    private static String v() {
        try {
            if (b.c()) {
                String b2 = com.bytedance.sdk.openadsdk.multipro.d.a.b("rom_info", "rom_property_info", "");
                l.c("RomUtils", "get Property From SPMultiHelper..." + b2);
                return b2;
            }
            String b3 = u.a("rom_info", com.bytedance.sdk.openadsdk.core.m.a()).b("rom_property_info", "");
            l.c("RomUtils", "get Property From SP...=" + b3);
            return b3;
        } catch (Throwable unused) {
            return "";
        }
    }
}
