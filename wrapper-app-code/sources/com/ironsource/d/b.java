package com.ironsource.d;

import android.content.Context;
import android.util.Pair;
import com.ironsource.sdk.utils.SDKUtils;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private com.ironsource.mediationsdk.adunit.a.a f7992a = new com.ironsource.mediationsdk.adunit.a.a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f7993a;

        /* renamed from: b  reason: collision with root package name */
        final String f7994b;

        /* renamed from: c  reason: collision with root package name */
        final String f7995c;

        /* renamed from: d  reason: collision with root package name */
        final int f7996d;

        /* renamed from: e  reason: collision with root package name */
        final int f7997e;

        /* renamed from: f  reason: collision with root package name */
        final String f7998f;

        /* renamed from: g  reason: collision with root package name */
        ArrayList<Pair<String, String>> f7999g;

        /* renamed from: com.ironsource.d.b$a$a  reason: collision with other inner class name */
        public static class C0081a {

            /* renamed from: a  reason: collision with root package name */
            List<Pair<String, String>> f8000a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            public String f8001b;

            /* renamed from: c  reason: collision with root package name */
            public String f8002c = "POST";

            /* renamed from: d  reason: collision with root package name */
            public String f8003d;

            /* renamed from: e  reason: collision with root package name */
            int f8004e = 15000;

            /* renamed from: f  reason: collision with root package name */
            int f8005f = 15000;

            /* renamed from: g  reason: collision with root package name */
            String f8006g = "UTF-8";

            public final C0081a a(List<Pair<String, String>> list) {
                this.f8000a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0081a aVar) {
            this.f7993a = aVar.f8001b;
            this.f7994b = aVar.f8002c;
            this.f7995c = aVar.f8003d;
            this.f7999g = new ArrayList<>(aVar.f8000a);
            this.f7996d = aVar.f8004e;
            this.f7997e = aVar.f8005f;
            this.f7998f = aVar.f8006g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.d.c a(com.ironsource.d.b.a r7) {
        /*
            java.lang.String r0 = r7.f7993a
            java.lang.String r1 = r7.f7995c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ce
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f7993a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f7996d     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f7997e     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f7994b     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f7999g     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            a((java.net.HttpURLConnection) r2, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f7994b     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f7995c     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r4 = r7.f7998f     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r4 = r3.length     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f8007a = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.a.AnonymousClass1.a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f8008b = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
            goto L_0x00bd
        L_0x007c:
            r7 = move-exception
            goto L_0x00c3
        L_0x007e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0088
        L_0x0083:
            r7 = move-exception
            r2 = r1
            goto L_0x00c3
        L_0x0086:
            r3 = move-exception
            r2 = r1
        L_0x0088:
            if (r1 == 0) goto L_0x00be
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bf }
            r0.f8007a = r4     // Catch:{ all -> 0x00bf }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00be
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.f7993a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            int r7 = r0.f8007a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.disconnect()
        L_0x00bd:
            return r0
        L_0x00be:
            throw r3     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r2.disconnect()
        L_0x00cd:
            throw r7
        L_0x00ce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.d.b.a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0081a aVar = new a.C0081a();
        aVar.f8001b = str;
        aVar.f8003d = str2;
        aVar.f8002c = "POST";
        aVar.a(list);
        return a(aVar.a());
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public void a(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("itp", (Object) Integer.valueOf(i));
    }

    public void a(Context context) {
        com.ironsource.mediationsdk.adunit.a.a.a(context);
    }

    public void a(com.ironsource.c.b bVar) {
        try {
            HashMap hashMap = new HashMap();
            String str = com.ironsource.sdk.e.a.a.f9475a;
            Intrinsics.checkNotNullExpressionValue(str, "OMIDManager.OMID_LIB_VERSION");
            hashMap.put("omv", str);
            hashMap.put("ompv", "7");
            String sDKVersion = SDKUtils.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "SDKUtils.getSDKVersion()");
            hashMap.put("sdkv", sDKVersion);
            com.ironsource.mediationsdk.adunit.a.a.a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    public void a(Boolean bool) {
        com.ironsource.mediationsdk.adunit.a.a.a("fs", (Object) bool);
    }

    public void a(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("apky", (Object) str);
    }

    public void a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("md", (Object) jSONObject);
    }

    public void a(boolean z) {
        com.ironsource.mediationsdk.adunit.a.a.a("cnst", (Object) Boolean.valueOf(z));
    }

    public void b(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("medv", (Object) str);
    }

    public void b(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("tkgp", (Object) jSONObject);
    }

    public void b(boolean z) {
        com.ironsource.mediationsdk.adunit.a.a.a("gpi", (Object) Boolean.valueOf(z));
    }

    public void c(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("sid", (Object) str);
    }

    public void d(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("plugin", (Object) str);
    }

    public void e(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("usid", (Object) str);
    }

    public void f(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("audt", (Object) str);
    }
}