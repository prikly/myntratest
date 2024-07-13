package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.ICommonParams;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f10845a;

    /* renamed from: b  reason: collision with root package name */
    private ICommonParams f10846b;

    /* renamed from: c  reason: collision with root package name */
    private ICommonParams f10847c;

    public d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, (d) null);
    }

    public d(Context context, ICommonParams iCommonParams, d dVar) {
        this.f10845a = context;
        this.f10846b = iCommonParams;
        this.f10847c = dVar == null ? null : dVar.f10846b;
    }

    public static String a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static boolean a(Map<String, Object> map) {
        return map == null || map.isEmpty() || (!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code");
    }

    public Map<String, Object> a() {
        Map<String, Object> b2 = b();
        if (a(b2, "aid") == null) {
            b2.put("aid", 4444);
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[SYNTHETIC, Splitter:B:23:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[SYNTHETIC, Splitter:B:36:0x00ac] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.f10847c     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0012
            com.apm.insight.ICommonParams r4 = r9.f10847c     // Catch:{ all -> 0x0027 }
            java.util.Map r4 = r4.getCommonParams()     // Catch:{ all -> 0x0027 }
            goto L_0x0017
        L_0x0012:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
        L_0x0017:
            com.apm.insight.ICommonParams r5 = r9.f10846b     // Catch:{ all -> 0x0022 }
            java.util.Map r5 = r5.getCommonParams()     // Catch:{ all -> 0x0022 }
            r4.putAll(r5)     // Catch:{ all -> 0x0022 }
            r5 = r3
            goto L_0x002c
        L_0x0022:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r5 = r3
        L_0x0029:
            r8 = r5
            r5 = r4
            r4 = r8
        L_0x002c:
            if (r4 != 0) goto L_0x0041
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L_0x0041
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.l.v.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0040 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            boolean r5 = a(r4)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00ac
            android.content.Context r5 = r9.f10845a     // Catch:{ all -> 0x0087 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0087 }
            android.content.Context r7 = r9.f10845a     // Catch:{ all -> 0x0087 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x0087 }
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = r5.versionName     // Catch:{ all -> 0x0087 }
            r4.put(r0, r6)     // Catch:{ all -> 0x0087 }
            int r6 = r5.versionCode     // Catch:{ all -> 0x0087 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0087 }
            r4.put(r2, r6)     // Catch:{ all -> 0x0087 }
            java.lang.Object r6 = r4.get(r1)     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x00f2
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch:{ all -> 0x0087 }
            android.os.Bundle r6 = r6.metaData     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x007d
            android.content.pm.ApplicationInfo r3 = r5.applicationInfo     // Catch:{ all -> 0x0087 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0087 }
        L_0x007d:
            if (r3 != 0) goto L_0x0083
            java.lang.Object r3 = r4.get(r2)     // Catch:{ all -> 0x0087 }
        L_0x0083:
            r4.put(r1, r3)     // Catch:{ all -> 0x0087 }
            goto L_0x00f2
        L_0x0087:
            android.content.Context r3 = r9.f10845a
            java.lang.String r3 = com.apm.insight.l.a.d(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f10845a
            int r0 = com.apm.insight.l.a.e(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00f2
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto L_0x00f2
        L_0x00ac:
            android.content.Context r0 = r9.f10845a     // Catch:{ all -> 0x00f2 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00f2 }
            android.content.Context r1 = r9.f10845a     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x00f2 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = r0.versionName     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            android.content.Context r2 = r9.f10845a     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x00f2 }
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = ".BuildConfig"
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00f2
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.d.b():java.util.Map");
    }

    public ICommonParams c() {
        return this.f10846b;
    }

    public String d() {
        try {
            return this.f10846b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String e() {
        try {
            return String.valueOf(this.f10846b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public long f() {
        try {
            return this.f10846b.getUserId();
        } catch (Throwable unused) {
            return 0;
        }
    }
}