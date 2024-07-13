package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SimUtils */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static String f2230a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f2231b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f2232c = null;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f2233d = true;

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|(9:4|5|6|7|8|(1:(1:11)(1:12))(1:13)|14|(1:16)(1:17)|18)|22|(2:23|24)|27|28|(3:32|33|34)|36|37|38|39|(1:44)(1:43)|45|(1:47)|48|(1:50)|51|(2:53|55)(1:57)) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004c, code lost:
        if (r4.length() < 5) goto L_0x004e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x005f A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0073 A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007b A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0083 A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 1
            f2233d = r0
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0085 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ all -> 0x0085 }
            r2 = 0
            int r3 = r1.getSimState()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0023
            if (r3 == r0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            f2233d = r2     // Catch:{ all -> 0x0034 }
            goto L_0x0025
        L_0x0023:
            f2233d = r2     // Catch:{ all -> 0x0034 }
        L_0x0025:
            java.lang.String r0 = "MCC"
            boolean r3 = f2233d     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = "Have SIM card"
            goto L_0x0030
        L_0x002e:
            java.lang.String r3 = "No SIM card"
        L_0x0030:
            com.bytedance.sdk.component.utils.l.e(r0, r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0085 }
        L_0x0038:
            r0 = 0
            java.lang.String r3 = r1.getSimOperatorName()     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r3 = r0
        L_0x003f:
            java.lang.String r4 = r1.getNetworkOperator()     // Catch:{ all -> 0x0044 }
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x004e
            int r5 = r4.length()     // Catch:{ all -> 0x0085 }
            r6 = 5
            if (r5 >= r6) goto L_0x0052
        L_0x004e:
            java.lang.String r4 = r1.getSimOperator()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x006c
            int r1 = r4.length()     // Catch:{ all -> 0x0085 }
            r5 = 4
            if (r1 <= r5) goto L_0x006c
            r0 = 3
            java.lang.String r1 = r4.substring(r2, r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r4.substring(r0)     // Catch:{ all -> 0x0085 }
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0075
            f2230a = r3     // Catch:{ all -> 0x0085 }
        L_0x0075:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x007d
            f2231b = r0     // Catch:{ all -> 0x0085 }
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0085
            f2232c = r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.n.e():void");
    }

    public static String a() {
        a.c();
        return f2230a;
    }

    public static String b() {
        try {
            a.c();
            Configuration configuration = m.a().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : f2231b;
            l.e("MCC", "config=" + configuration.mcc + ",sMCC=" + f2231b);
            if (f2233d) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getMCC");
            sb.append(f2233d ? "Have SIM card" : "No SIM card, MCC returns null");
            l.e("MCC", sb.toString());
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c() {
        a.c();
        return f2232c;
    }

    /* compiled from: SimUtils */
    public static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicBoolean f2234a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        private static AtomicLong f2235b = new AtomicLong(0);

        public a(String str, int i) {
            super(str, i);
        }

        public static void c() {
            if (!f2234a.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f2235b.get() >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    f2235b.set(currentTimeMillis);
                    e.a(new a("UpdateSimStatusTask", 5), 5);
                }
            }
        }

        public void run() {
            f2234a.set(true);
            n.e();
            f2234a.set(false);
        }
    }
}
