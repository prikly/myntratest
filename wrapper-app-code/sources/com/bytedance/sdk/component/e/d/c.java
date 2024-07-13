package com.bytedance.sdk.component.e.d;

import android.content.Context;
import com.bytedance.sdk.component.e.c.g;
import java.util.LinkedHashMap;

/* compiled from: MultiProcessFileUtils */
public class c {
    private static String a(int i) {
        return "tnc_config" + i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L_0x0006
            goto L_0x0029
        L_0x0006:
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.e r3 = r3.a(r4)     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.b r3 = r3.d()     // Catch:{ Exception -> 0x0029 }
            if (r3 == 0) goto L_0x0029
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.e r3 = r3.a(r4)     // Catch:{ Exception -> 0x0029 }
            com.bytedance.sdk.component.e.c.b r3 = r3.d()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r4 = a(r4)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = r3.a(r2, r4, r0)     // Catch:{ Exception -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0032
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.d.c.a(android.content.Context, int, int):java.lang.String");
    }

    public static void a(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(a(i2), str);
            }
            b.b("MultiProcessFileUtils", "saveData = " + str);
            if (g.a().a(i2).d() != null) {
                g.a().a(i2).d().a(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c1657027613239dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.d.c.c1657027613239dc(java.lang.String):java.lang.String");
    }
}
