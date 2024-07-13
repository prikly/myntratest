package com.apm.insight.k;

import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.Npth;
import com.apm.insight.h;
import com.apm.insight.l.k;
import com.apm.insight.l.q;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f10691a = false;

    /* renamed from: b  reason: collision with root package name */
    private static h f10692b;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: d  reason: collision with root package name */
        final int f10697d;

        private a(int i) {
            this.f10697d = i;
        }
    }

    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
        final int l;

        private b(int i) {
            this.l = i;
        }
    }

    public static l a(long j, String str, byte[] bArr, a aVar, String str2, boolean z) {
        StringBuilder sb;
        String str3;
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        if (str == null) {
            return new l(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str4 = null;
        if (a.GZIP == aVar && length > 128) {
            bArr = b(bArr);
            str4 = "gzip";
        } else if (a.DEFLATER == aVar && length > 128) {
            bArr = a(bArr);
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new l(LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
        }
        if (!z) {
            return a(str, bArr2, str2, str5, "POST", true, false);
        }
        byte[] a2 = h.i().getEncryptImpl().a(bArr2);
        if (a2 != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                str3 = "?";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a2;
            } else {
                str3 = "&";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a2;
            }
            sb.append(str);
            sb.append(str3);
            str = sb.toString();
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a2;
        }
        return a(str, bArr2, str2, str5, "POST", true, true);
    }

    public static l a(String str, String str2) {
        return a(str, str2, b());
    }

    public static l a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return a(2097152, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new l(201);
        } catch (Throwable th) {
            q.b(th);
            return new l((int) LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE, th);
        }
    }

    public static l a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static l a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return b(str, bArr, str2, str3, str4, z, z2);
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(d(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(h hVar) {
        f10692b = hVar;
    }

    public static boolean a() {
        return true;
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            j jVar = new j(str, "UTF-8", false);
            jVar.a("aid", str2);
            jVar.a("device_id", str3);
            jVar.a("os", APSAnalytics.OS_NAME);
            jVar.a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    jVar.a(file2.getName(), file2, (Map<String, String>) hashMap);
                }
            }
            try {
                return new JSONObject(jVar.a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    k.a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    public static byte[] a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(2097152, a(str, (Map) map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static l b(String str, String str2) {
        return a(str, str2, a());
    }

    public static l b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        try {
            j jVar = new j(c(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            jVar.a("json", str2, true);
            jVar.a("file", fileArr);
            try {
                return new l(0, new JSONObject(jVar.a()));
            } catch (JSONException e2) {
                return new l(0, (Throwable) e2);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return new l(LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:4|5)|6|7|(3:9|10|11)(1:12)|(1:14)|(1:16)|17|(4:19|(6:23|24|25|26|27|28)|35|(8:37|38|39|(6:41|42|43|44|45|46)(1:52)|53|(2:55|56)|57|59)(5:62|63|(2:65|66)|67|69))(3:70|71|72)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC, Splitter:B:70:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d8 A[SYNTHETIC, Splitter:B:80:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apm.insight.k.l b(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.lang.String r9 = "gzip"
            r0 = 0
            com.apm.insight.k.h r1 = f10692b     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x000d
            com.apm.insight.k.h r1 = f10692b     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r1.a(r3, r4)     // Catch:{ all -> 0x000d }
        L_0x000d:
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00ca }
            r1.<init>(r3)     // Catch:{ all -> 0x00ca }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x00ca }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x001f
            r8 = 1
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x0023
        L_0x001f:
            r8 = 0
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
        L_0x0023:
            if (r5 == 0) goto L_0x002a
            java.lang.String r8 = "Content-Type"
            r3.setRequestProperty(r8, r5)     // Catch:{ all -> 0x00c5 }
        L_0x002a:
            if (r6 == 0) goto L_0x0031
            java.lang.String r5 = "Content-Encoding"
            r3.setRequestProperty(r5, r6)     // Catch:{ all -> 0x00c5 }
        L_0x0031:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r9)     // Catch:{ all -> 0x00c5 }
            if (r7 == 0) goto L_0x00bd
            r3.setRequestMethod(r7)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x005b
            int r5 = r4.length     // Catch:{ all -> 0x00c5 }
            if (r5 <= 0) goto L_0x005b
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ all -> 0x0055 }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ all -> 0x0055 }
            r5.<init>(r6)     // Catch:{ all -> 0x0055 }
            r5.write(r4)     // Catch:{ all -> 0x0053 }
            r5.flush()     // Catch:{ all -> 0x0053 }
            com.apm.insight.l.k.a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x005b
        L_0x0053:
            r4 = move-exception
            goto L_0x0057
        L_0x0055:
            r4 = move-exception
            r5 = r0
        L_0x0057:
            com.apm.insight.l.k.a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x005b:
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x00c5 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x009c
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ all -> 0x0097 }
            boolean r5 = r9.equalsIgnoreCase(r5)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0086
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0081 }
            r5.<init>(r4)     // Catch:{ all -> 0x0081 }
            byte[] r6 = a((java.io.InputStream) r5)     // Catch:{ all -> 0x007e }
            com.apm.insight.l.k.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0097 }
            goto L_0x008a
        L_0x007e:
            r6 = move-exception
            r0 = r5
            goto L_0x0082
        L_0x0081:
            r6 = move-exception
        L_0x0082:
            com.apm.insight.l.k.a((java.io.Closeable) r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x0086:
            byte[] r6 = a((java.io.InputStream) r4)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            com.apm.insight.k.l r5 = c(r6)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0093
            r3.disconnect()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            com.apm.insight.l.k.a((java.io.Closeable) r4)
            return r5
        L_0x0097:
            r5 = move-exception
            r0 = r3
            r3 = r4
            r4 = r5
            goto L_0x00cc
        L_0x009c:
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00c5 }
            r6 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r7.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "http response code "
            r7.append(r8)     // Catch:{ all -> 0x00c5 }
            r7.append(r4)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00c5 }
            r5.<init>((int) r6, (java.lang.String) r4)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00b9
            r3.disconnect()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            com.apm.insight.l.k.a((java.io.Closeable) r0)
            return r5
        L_0x00bd:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "request method is not null"
            r4.<init>(r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r4 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x00cc
        L_0x00ca:
            r4 = move-exception
            r3 = r0
        L_0x00cc:
            com.apm.insight.l.q.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00df }
            r6 = 207(0xcf, float:2.9E-43)
            r5.<init>((int) r6, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00db
            r0.disconnect()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            com.apm.insight.l.k.a((java.io.Closeable) r3)
            return r5
        L_0x00df:
            r4 = move-exception
            if (r0 == 0) goto L_0x00e5
            r0.disconnect()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            com.apm.insight.l.k.a((java.io.Closeable) r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.e.b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.apm.insight.k.l");
    }

    public static boolean b() {
        return true;
    }

    private static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    private static l c(byte[] bArr) {
        return new l(204, bArr);
    }

    public static String c() {
        return h.i().getJavaCrashUploadUrl();
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String d() {
        return h.i().getAlogUploadUrl();
    }

    private static String d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String e() {
        return h.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return h.i().getExceptionUploadUrl();
    }

    public static String g() {
        return h.i().getNativeCrashUploadUrl();
    }
}
