package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final String f15773a = "FileManagerOld";

    /* renamed from: b  reason: collision with root package name */
    private final n f15774b;

    /* renamed from: c  reason: collision with root package name */
    private final v f15775c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f15776d = new Object();

    s(n nVar) {
        this.f15774b = nVar;
        this.f15775c = nVar.D();
    }

    private File a(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean a(File file, String str, List<String> list, boolean z, e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a2 = a(str, list, z, eVar);
            if (!(eVar == null || a2 == null)) {
                eVar.a((long) a2.size());
            }
            return a(a2, file);
        }
        if (v.a()) {
            v vVar = this.f15775c;
            vVar.b("FileManagerOld", "File exists for " + str);
        }
        if (eVar == null) {
            return true;
        }
        eVar.b(file.length());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0055=Splitter:B:26:0x0055, B:18:0x003f=Splitter:B:18:0x003f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0064=Splitter:B:30:0x0064, B:22:0x004e=Splitter:B:22:0x004e, B:18:0x003f=Splitter:B:18:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.io.ByteArrayOutputStream r6, java.io.File r7) {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0022
            com.applovin.impl.sdk.v r0 = r5.f15775c
            java.lang.String r1 = "FileManagerOld"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing resource to filesystem: "
            r2.append(r3)
            java.lang.String r3 = r7.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L_0x0022:
            r0 = 0
            r1 = 0
            java.lang.Object r2 = r5.f15776d
            monitor-enter(r2)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x003e }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0054, all -> 0x003e }
            r6.writeTo(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r1 = 1
            com.applovin.impl.sdk.n r6 = r5.f15774b     // Catch:{ all -> 0x0036 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0067
        L_0x0036:
            r6 = move-exception
            goto L_0x0070
        L_0x0038:
            r6 = move-exception
            r0 = r3
            goto L_0x003f
        L_0x003b:
            r6 = move-exception
            r0 = r3
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
        L_0x003f:
            boolean r7 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x004e
            com.applovin.impl.sdk.v r7 = r5.f15775c     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "FileManagerOld"
            java.lang.String r4 = "Unknown failure to write file."
            r7.b(r3, r4, r6)     // Catch:{ all -> 0x0069 }
        L_0x004e:
            com.applovin.impl.sdk.n r6 = r5.f15774b     // Catch:{ all -> 0x0036 }
        L_0x0050:
            com.applovin.impl.sdk.utils.Utils.close(r0, r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0067
        L_0x0054:
            r6 = move-exception
        L_0x0055:
            boolean r7 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x0064
            com.applovin.impl.sdk.v r7 = r5.f15775c     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "FileManagerOld"
            java.lang.String r4 = "Unable to write data to file."
            r7.b(r3, r4, r6)     // Catch:{ all -> 0x0069 }
        L_0x0064:
            com.applovin.impl.sdk.n r6 = r5.f15774b     // Catch:{ all -> 0x0036 }
            goto L_0x0050
        L_0x0067:
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0069:
            r6 = move-exception
            com.applovin.impl.sdk.n r7 = r5.f15774b     // Catch:{ all -> 0x0036 }
            com.applovin.impl.sdk.utils.Utils.close(r0, r7)     // Catch:{ all -> 0x0036 }
            throw r6     // Catch:{ all -> 0x0036 }
        L_0x0070:
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.s.b(java.io.ByteArrayOutputStream, java.io.File):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r3, r8.f15774b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r2, r8.f15774b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0063 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a9 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00a3=Splitter:B:50:0x00a3, B:40:0x0075=Splitter:B:40:0x0075, B:30:0x005d=Splitter:B:30:0x005d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x00c1=Splitter:B:54:0x00c1, B:44:0x009a=Splitter:B:44:0x009a, B:34:0x006c=Splitter:B:34:0x006c, B:30:0x005d=Splitter:B:30:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = com.applovin.impl.sdk.v.a()
            if (r1 == 0) goto L_0x0026
            com.applovin.impl.sdk.v r1 = r8.f15775c
            java.lang.String r2 = "FileManagerOld"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.b(r2, r3)
        L_0x0026:
            java.lang.Object r1 = r8.f15776d
            monitor-enter(r1)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x0073, all -> 0x005b }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x0073, all -> 0x005b }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
        L_0x0037:
            r6 = 0
            int r7 = r2.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
            if (r7 < 0) goto L_0x004e
            r3.write(r5, r6, r7)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0037
        L_0x0042:
            com.applovin.impl.sdk.n r4 = r8.f15774b     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r4)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x0057, all -> 0x0055 }
            com.applovin.impl.sdk.n r9 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x004e:
            com.applovin.impl.sdk.n r9 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            return r3
        L_0x0055:
            r9 = move-exception
            goto L_0x005d
        L_0x0057:
            r3 = move-exception
            goto L_0x0075
        L_0x0059:
            r9 = move-exception
            goto L_0x00a3
        L_0x005b:
            r9 = move-exception
            r2 = r0
        L_0x005d:
            boolean r3 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x006c
            com.applovin.impl.sdk.v r3 = r8.f15775c     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "FileManagerOld"
            java.lang.String r5 = "Unknown failure to read file."
            r3.b(r4, r5, r9)     // Catch:{ all -> 0x00c8 }
        L_0x006c:
            com.applovin.impl.sdk.n r9 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x0073:
            r3 = move-exception
            r2 = r0
        L_0x0075:
            boolean r4 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x009a
            com.applovin.impl.sdk.v r4 = r8.f15775c     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = "FileManagerOld"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r6.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r7 = "Failed to read file: "
            r6.append(r7)     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00c8 }
            r6.append(r9)     // Catch:{ all -> 0x00c8 }
            r6.append(r3)     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00c8 }
            r4.b(r5, r9)     // Catch:{ all -> 0x00c8 }
        L_0x009a:
            com.applovin.impl.sdk.n r9 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x00a1:
            r9 = move-exception
            r2 = r0
        L_0x00a3:
            boolean r3 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x00c1
            com.applovin.impl.sdk.v r3 = r8.f15775c     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "FileManagerOld"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r5.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch:{ all -> 0x00c8 }
            r5.append(r9)     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x00c8 }
            r3.c(r4, r9)     // Catch:{ all -> 0x00c8 }
        L_0x00c1:
            com.applovin.impl.sdk.n r9 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r9)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x00c8:
            r9 = move-exception
            com.applovin.impl.sdk.n r0 = r8.f15774b     // Catch:{ all -> 0x00cf }
            com.applovin.impl.sdk.utils.Utils.close(r2, r0)     // Catch:{ all -> 0x00cf }
            throw r9     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cf }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.s.a(java.io.File):java.io.ByteArrayOutputStream");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.InputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r9, r7.f15774b);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (com.applovin.impl.sdk.v.a() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r7.f15775c.b("FileManagerOld", "Loaded resource at " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r2, r7.f15774b);
        com.applovin.impl.sdk.utils.Utils.close(r9, r7.f15774b);
        com.applovin.impl.sdk.utils.Utils.disconnect(r10, r7.f15774b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        return r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138 A[Catch:{ all -> 0x0152 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.ByteArrayOutputStream a(java.lang.String r8, java.util.List<java.lang.String> r9, boolean r10, com.applovin.impl.sdk.d.e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "FileManagerOld"
            r1 = 0
            if (r10 == 0) goto L_0x0028
            boolean r9 = com.applovin.impl.sdk.utils.Utils.isDomainWhitelisted(r8, r9)
            if (r9 != 0) goto L_0x0028
            boolean r9 = com.applovin.impl.sdk.v.a()
            if (r9 == 0) goto L_0x0027
            com.applovin.impl.sdk.v r9 = r7.f15775c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Domain is not whitelisted, skipping precache for url: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.b(r0, r8)
        L_0x0027:
            return r1
        L_0x0028:
            com.applovin.impl.sdk.n r9 = r7.f15774b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.c.b.cX
            java.lang.Object r9 = r9.a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0053
            java.lang.String r9 = "https://"
            boolean r10 = r8.contains(r9)
            if (r10 != 0) goto L_0x0053
            boolean r10 = com.applovin.impl.sdk.v.a()
            if (r10 == 0) goto L_0x004d
            com.applovin.impl.sdk.v r10 = r7.f15775c
            java.lang.String r2 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r10.d(r0, r2)
        L_0x004d:
            java.lang.String r10 = "http://"
            java.lang.String r8 = r8.replace(r10, r9)
        L_0x0053:
            boolean r9 = com.applovin.impl.sdk.v.a()
            if (r9 == 0) goto L_0x0074
            com.applovin.impl.sdk.v r9 = r7.f15775c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Loading "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = "..."
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.b(r0, r10)
        L_0x0074:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x012e, all -> 0x012a }
            r9.<init>()     // Catch:{ IOException -> 0x012e, all -> 0x012a }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x0127, all -> 0x0124 }
            r10.<init>(r8)     // Catch:{ IOException -> 0x0127, all -> 0x0124 }
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ IOException -> 0x0127, all -> 0x0124 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x0127, all -> 0x0124 }
            com.applovin.impl.sdk.n r2 = r7.f15774b     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r3 = com.applovin.impl.sdk.c.b.cV     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            java.lang.Object r2 = r2.a(r3)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r10.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            com.applovin.impl.sdk.n r2 = r7.f15774b     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r3 = com.applovin.impl.sdk.c.b.cW     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            java.lang.Object r2 = r2.a(r3)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r10.setReadTimeout(r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r2 = 1
            r10.setDefaultUseCaches(r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r10.setUseCaches(r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r3 = 0
            r10.setAllowUserInteraction(r3)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r10.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            int r2 = r10.getResponseCode()     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r11.a((int) r2)     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 < r4) goto L_0x0119
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r4) goto L_0x00c4
            goto L_0x0119
        L_0x00c4:
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ IOException -> 0x0121, all -> 0x011f }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ IOException -> 0x0117 }
        L_0x00cc:
            int r6 = r2.read(r5, r3, r4)     // Catch:{ IOException -> 0x0117 }
            if (r6 < 0) goto L_0x00eb
            r9.write(r5, r3, r6)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00cc
        L_0x00d6:
            com.applovin.impl.sdk.n r3 = r7.f15774b     // Catch:{ IOException -> 0x0117 }
            com.applovin.impl.sdk.utils.Utils.close(r9, r3)     // Catch:{ IOException -> 0x0117 }
        L_0x00db:
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r2, r8)
        L_0x00e0:
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r9, r8)
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r8)
            return r1
        L_0x00eb:
            boolean r3 = com.applovin.impl.sdk.v.a()     // Catch:{ IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0107
            com.applovin.impl.sdk.v r3 = r7.f15775c     // Catch:{ IOException -> 0x0117 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0117 }
            r4.<init>()     // Catch:{ IOException -> 0x0117 }
            java.lang.String r5 = "Loaded resource at "
            r4.append(r5)     // Catch:{ IOException -> 0x0117 }
            r4.append(r8)     // Catch:{ IOException -> 0x0117 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0117 }
            r3.b(r0, r4)     // Catch:{ IOException -> 0x0117 }
        L_0x0107:
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r2, r8)
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r9, r8)
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r8)
            return r9
        L_0x0117:
            r3 = move-exception
            goto L_0x0132
        L_0x0119:
            com.applovin.impl.sdk.n r8 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r1, r8)
            goto L_0x00e0
        L_0x011f:
            r8 = move-exception
            goto L_0x0154
        L_0x0121:
            r3 = move-exception
            r2 = r1
            goto L_0x0132
        L_0x0124:
            r8 = move-exception
            r10 = r1
            goto L_0x0154
        L_0x0127:
            r3 = move-exception
            r10 = r1
            goto L_0x0131
        L_0x012a:
            r8 = move-exception
            r9 = r1
            r10 = r9
            goto L_0x0154
        L_0x012e:
            r3 = move-exception
            r9 = r1
            r10 = r9
        L_0x0131:
            r2 = r10
        L_0x0132:
            boolean r4 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0152 }
            if (r4 == 0) goto L_0x014e
            com.applovin.impl.sdk.v r4 = r7.f15775c     // Catch:{ all -> 0x0152 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            r5.<init>()     // Catch:{ all -> 0x0152 }
            java.lang.String r6 = "Error loading "
            r5.append(r6)     // Catch:{ all -> 0x0152 }
            r5.append(r8)     // Catch:{ all -> 0x0152 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0152 }
            r4.b(r0, r8, r3)     // Catch:{ all -> 0x0152 }
        L_0x014e:
            r11.a((java.lang.Exception) r3)     // Catch:{ all -> 0x0152 }
            goto L_0x00db
        L_0x0152:
            r8 = move-exception
            r1 = r2
        L_0x0154:
            com.applovin.impl.sdk.n r11 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r1, r11)
            com.applovin.impl.sdk.n r11 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.close(r9, r11)
            com.applovin.impl.sdk.n r9 = r7.f15774b
            com.applovin.impl.sdk.utils.Utils.disconnect(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.s.a(java.lang.String, java.util.List, boolean, com.applovin.impl.sdk.d.e):java.io.ByteArrayOutputStream");
    }

    public File a(String str, Context context) {
        File file;
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f15775c.b("FileManagerOld", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (v.a()) {
            v vVar = this.f15775c;
            vVar.b("FileManagerOld", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f15776d) {
            File a2 = a(context);
            file = new File(a2, str);
            try {
                a2.mkdirs();
            } catch (Throwable th) {
                if (v.a()) {
                    v vVar2 = this.f15775c;
                    vVar2.b("FileManagerOld", "Unable to make cache directory at " + a2, th);
                }
                return null;
            }
        }
        return file;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, e eVar) {
        return a(context, str, str2, list, z, z2, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f15775c.b("FileManagerOld", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f15774b.a(b.fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (z2) {
            fileName = StringUtils.encodeUriString(fileName, this.f15774b);
        }
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            StringBuilder sb = new StringBuilder();
            String str3 = str2;
            sb.append(str2);
            sb.append(fileName);
            fileName = sb.toString();
        }
        String str4 = fileName;
        Context context2 = context;
        File a2 = a(str4, context);
        if (!a(a2, str, list, z, eVar)) {
            return null;
        }
        if (v.a()) {
            v vVar = this.f15775c;
            vVar.b("FileManagerOld", "Caching succeeded for file " + str4);
        }
        return z3 ? Uri.fromFile(a2).toString() : str4;
    }

    public boolean a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        if (v.a()) {
            v vVar = this.f15775c;
            vVar.b("FileManagerOld", "Caching " + file.getAbsolutePath() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            if (v.a()) {
                v vVar2 = this.f15775c;
                vVar2.d("FileManagerOld", "No data for " + file.getAbsolutePath());
            }
            return false;
        } else if (!b(byteArrayOutputStream, file)) {
            if (v.a()) {
                v vVar3 = this.f15775c;
                vVar3.e("FileManagerOld", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (!v.a()) {
            return true;
        } else {
            v vVar4 = this.f15775c;
            vVar4.b("FileManagerOld", "Caching completed for " + file);
            return true;
        }
    }

    public boolean a(File file, String str, List<String> list, e eVar) {
        return a(file, str, list, true, eVar);
    }

    public boolean b(String str, Context context) {
        boolean z;
        synchronized (this.f15776d) {
            File a2 = a(str, context);
            z = a2 != null && a2.exists() && !a2.isDirectory();
        }
        return z;
    }
}
