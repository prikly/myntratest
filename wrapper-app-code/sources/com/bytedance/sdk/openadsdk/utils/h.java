package com.bytedance.sdk.openadsdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: InitChecker */
public class h {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r1 = com.bytedance.sdk.component.utils.l.c()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r1 = a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current process name："
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.l.e(r2, r1)
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            com.bytedance.sdk.component.utils.l.e(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r6 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch:{ all -> 0x009e }
            java.lang.String[] r0 = r0.requestedPermissions     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0098
            int r1 = r0.length     // Catch:{ all -> 0x009e }
            if (r1 <= 0) goto L_0x0098
            java.util.List r1 = b()     // Catch:{ all -> 0x009e }
            int r4 = r0.length     // Catch:{ all -> 0x009e }
            r7 = 0
        L_0x0050:
            if (r7 >= r4) goto L_0x005c
            r8 = r0[r7]     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0059
            r1.remove(r8)     // Catch:{ all -> 0x009e }
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0050
        L_0x005c:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch:{ all -> 0x009e }
            goto L_0x00a6
        L_0x0068:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x009e }
        L_0x006c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0095 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r4.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r6 = "    May be missing permissions："
            r4.append(r6)     // Catch:{ all -> 0x0093 }
            r4.append(r1)     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0093 }
            com.bytedance.sdk.component.utils.l.e(r2, r1)     // Catch:{ all -> 0x0093 }
            r6 = 0
            goto L_0x006c
        L_0x0093:
            r0 = move-exception
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            r5 = r6
            goto L_0x00a0
        L_0x0098:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch:{ all -> 0x009e }
            goto L_0x00a6
        L_0x009e:
            r0 = move-exception
            r5 = 1
        L_0x00a0:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.l.c(r2, r1, r0)
            r6 = r5
        L_0x00a6:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d5 }
            r1 = 23
            if (r0 < r1) goto L_0x00ae
            if (r3 >= r1) goto L_0x00db
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r0.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r0.append(r4)     // Catch:{ all -> 0x00d5 }
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "&phone="
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d5 }
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = ", require="
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
            r0.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d5 }
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch:{ all -> 0x00d5 }
            goto L_0x00db
        L_0x00d5:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.l.c(r2, r1, r0)
        L_0x00db:
            if (r6 != 0) goto L_0x00e2
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.l.e(r2, r0)
        L_0x00e2:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.l.e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.h.a():void");
    }

    private static String a(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        } catch (Throwable unused) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
    }

    private static List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
