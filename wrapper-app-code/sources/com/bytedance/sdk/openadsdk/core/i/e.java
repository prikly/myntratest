package com.bytedance.sdk.openadsdk.core.i;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SdkSwitch */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f1251a = new AtomicInteger(1);

    public static boolean a() {
        return f1251a.get() == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a(int r3) {
        /*
            r0 = 1
            if (r3 == r0) goto L_0x0007
            r1 = 2
            if (r3 == r1) goto L_0x0007
            return
        L_0x0007:
            r1 = 0
            java.util.concurrent.atomic.AtomicInteger r2 = f1251a     // Catch:{ all -> 0x001a }
            int r2 = r2.get()     // Catch:{ all -> 0x001a }
            if (r2 == r3) goto L_0x0018
            java.util.concurrent.atomic.AtomicInteger r1 = f1251a     // Catch:{ all -> 0x0016 }
            r1.set(r3)     // Catch:{ all -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r3 = move-exception
            goto L_0x001c
        L_0x0018:
            r0 = 0
            goto L_0x001f
        L_0x001a:
            r3 = move-exception
            r0 = 0
        L_0x001c:
            r3.printStackTrace()
        L_0x001f:
            if (r0 == 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "switch status changed: "
            r3.append(r0)
            boolean r0 = a()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "SdkSwitch"
            android.util.Log.e(r0, r3)
            boolean r3 = a()
            if (r3 == 0) goto L_0x0045
            com.bytedance.sdk.openadsdk.core.m.b()
            goto L_0x0095
        L_0x0045:
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.c()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x0052
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.c()     // Catch:{ all -> 0x006d }
            r3.b()     // Catch:{ all -> 0x006d }
        L_0x0052:
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.e()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x005f
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.e()     // Catch:{ all -> 0x006d }
            r3.b()     // Catch:{ all -> 0x006d }
        L_0x005f:
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.d()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x0071
            com.bytedance.sdk.openadsdk.b.c r3 = com.bytedance.sdk.openadsdk.core.m.d()     // Catch:{ all -> 0x006d }
            r3.b()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0071:
            com.bytedance.sdk.openadsdk.k.a r3 = com.bytedance.sdk.openadsdk.core.m.g()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0083
            com.bytedance.sdk.openadsdk.k.a r3 = com.bytedance.sdk.openadsdk.core.m.g()     // Catch:{ all -> 0x007f }
            r3.b()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0083:
            com.bytedance.sdk.openadsdk.h.c.a r3 = com.bytedance.sdk.openadsdk.core.m.i()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0095
            com.bytedance.sdk.openadsdk.h.c.a r3 = com.bytedance.sdk.openadsdk.core.m.i()     // Catch:{ all -> 0x0091 }
            r3.b()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.i.e.a(int):void");
    }
}
