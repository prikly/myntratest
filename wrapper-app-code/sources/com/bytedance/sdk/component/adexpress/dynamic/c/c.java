package com.bytedance.sdk.component.adexpress.dynamic.c;

import org.json.JSONObject;

/* compiled from: DefaultSettingManager */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f18546a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile JSONObject f18547b;

    private c() {
    }

    public static c a() {
        if (f18546a == null) {
            synchronized (c.class) {
                if (f18546a == null) {
                    f18546a = new c();
                }
            }
        }
        return f18546a;
    }

    public JSONObject b() {
        if (f18547b == null) {
            f18547b = c();
        }
        return f18547b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC, Splitter:B:28:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006f A[SYNTHETIC, Splitter:B:39:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject c() {
        /*
            r6 = this;
            org.json.JSONObject r0 = f18547b
            if (r0 == 0) goto L_0x0007
            org.json.JSONObject r0 = f18547b
            return r0
        L_0x0007:
            com.bytedance.sdk.component.adexpress.a.a.a r0 = com.bytedance.sdk.component.adexpress.a.a.a.a()
            com.bytedance.sdk.component.adexpress.a.a.c r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Context r0 = r0.b()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004a }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004a }
            java.lang.String r5 = "dynamic_default.json"
            java.io.InputStream r0 = r0.open(r5)     // Catch:{ Exception -> 0x004a }
            r4.<init>(r0)     // Catch:{ Exception -> 0x004a }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004a }
        L_0x0034:
            java.lang.String r0 = r3.readLine()     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            r2.append(r0)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            goto L_0x0034
        L_0x003e:
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0042:
            r0 = move-exception
            r1 = r3
            goto L_0x006d
        L_0x0045:
            r0 = move-exception
            r1 = r3
            goto L_0x004b
        L_0x0048:
            r0 = move-exception
            goto L_0x006d
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            r0.printStackTrace()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0058
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0058:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0066, ArrayIndexOutOfBoundsException -> 0x0064 }
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0066, ArrayIndexOutOfBoundsException -> 0x0064 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0066, ArrayIndexOutOfBoundsException -> 0x0064 }
            f18547b = r0     // Catch:{ JSONException -> 0x0066, ArrayIndexOutOfBoundsException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            r0.printStackTrace()
        L_0x006a:
            org.json.JSONObject r0 = f18547b
            return r0
        L_0x006d:
            if (r1 == 0) goto L_0x0077
            r1.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0077:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.c.c():org.json.JSONObject");
    }
}
