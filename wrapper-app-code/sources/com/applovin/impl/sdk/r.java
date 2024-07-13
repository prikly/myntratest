package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.e;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.appnext.base.b.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final String f15768a = "FileManager";

    /* renamed from: b  reason: collision with root package name */
    private final n f15769b;

    /* renamed from: c  reason: collision with root package name */
    private final v f15770c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f15771d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f15772e = new HashSet();

    r(n nVar) {
        this.f15769b = nVar;
        this.f15770c = nVar.D();
    }

    private long a() {
        long longValue = ((Long) this.f15769b.a(b.bt)).longValue();
        if (longValue < 0 || !b()) {
            return -1;
        }
        return longValue;
    }

    private long a(long j) {
        return j / d.fc;
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f15770c.b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (v.a()) {
            v vVar = this.f15770c;
            vVar.b("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File e2 = e(context);
        File file = new File(e2, str);
        if (z) {
            try {
                e2.mkdirs();
            } catch (Throwable th) {
                if (v.a()) {
                    v vVar2 = this.f15770c;
                    vVar2.b("FileManager", "Unable to make cache directory at " + e2, th);
                }
                return null;
            }
        }
        return file;
    }

    private void a(long j, Context context) {
        v vVar;
        String str;
        if (b()) {
            long intValue = (long) ((Integer) this.f15769b.a(b.bu)).intValue();
            if (intValue != -1) {
                int i = (a(j) > intValue ? 1 : (a(j) == intValue ? 0 : -1));
                boolean a2 = v.a();
                if (i > 0) {
                    if (a2) {
                        this.f15770c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    for (File b2 : d(context)) {
                        b(b2);
                    }
                    this.f15769b.W().a(f.f15404h);
                    return;
                } else if (a2) {
                    vVar = this.f15770c;
                    str = "Cache is present but under size limit; not dropping...";
                } else {
                    return;
                }
            } else if (v.a()) {
                vVar = this.f15770c;
                str = "Cache has no maximum size set; skipping drop...";
            } else {
                return;
            }
            vVar.b("FileManager", str);
        }
    }

    private boolean a(File file, String str, List<String> list, boolean z, e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            InputStream inputStream = null;
            try {
                inputStream = a(str, list, z, eVar);
                return b(inputStream, file);
            } finally {
                Utils.close(inputStream, this.f15769b);
            }
        } else {
            if (v.a()) {
                v vVar = this.f15770c;
                vVar.b("FileManager", "File exists for " + str);
            }
            if (eVar == null) {
                return true;
            }
            eVar.b(file.length());
            return true;
        }
    }

    private boolean b() {
        return ((Boolean) this.f15769b.a(b.bs)).booleanValue();
    }

    private boolean b(File file) {
        if (v.a()) {
            v vVar = this.f15770c;
            vVar.b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            return file.delete();
        } catch (Exception e2) {
            if (v.a()) {
                v vVar2 = this.f15770c;
                vVar2.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e2);
            }
            return false;
        } finally {
            d(file);
        }
    }

    private long c(Context context) {
        boolean z;
        long a2 = a();
        boolean z2 = a2 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> b2 = this.f15769b.b(b.bz);
        long j = 0;
        for (File next : d(context)) {
            if (!z2 || b2.contains(next.getName()) || e(next) || seconds - TimeUnit.MILLISECONDS.toSeconds(next.lastModified()) <= a2) {
                z = false;
            } else {
                if (v.a()) {
                    v vVar = this.f15770c;
                    vVar.b("FileManager", "File " + next.getName() + " has expired, removing...");
                }
                z = b(next);
            }
            if (z) {
                this.f15769b.W().a(f.f15403g);
            } else {
                j += next.length();
            }
        }
        return j;
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15771d) {
            boolean add = this.f15772e.add(absolutePath);
            while (!add) {
                try {
                    this.f15771d.wait();
                    add = this.f15772e.add(absolutePath);
                } catch (InterruptedException e2) {
                    if (v.a()) {
                        v vVar = this.f15770c;
                        vVar.b("FileManager", "Lock '" + absolutePath + "' interrupted", e2);
                    }
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.listFiles();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.io.File> d(android.content.Context r2) {
        /*
            r1 = this;
            java.io.File r2 = r1.e((android.content.Context) r2)
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0015
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L_0x0015:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.r.d(android.content.Context):java.util.List");
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15771d) {
            this.f15772e.remove(absolutePath);
            this.f15771d.notifyAll();
        }
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean e(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15771d) {
            contains = this.f15772e.contains(absolutePath);
        }
        return contains;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public InputStream a(String str, List<String> list, boolean z, e eVar) {
        if (!z || Utils.isDomainWhitelisted(str, list)) {
            if (((Boolean) this.f15769b.a(b.cX)).booleanValue() && !str.contains("https://")) {
                if (v.a()) {
                    this.f15770c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                }
                str = str.replace("http://", "https://");
            }
            if (v.a()) {
                v vVar = this.f15770c;
                vVar.b("FileManager", "Loading " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setConnectTimeout(((Integer) this.f15769b.a(b.cV)).intValue());
                httpURLConnection.setReadTimeout(((Integer) this.f15769b.a(b.cW)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                eVar.a(responseCode);
                if (responseCode >= 200) {
                    if (responseCode < 300) {
                        if (v.a()) {
                            v vVar2 = this.f15770c;
                            vVar2.b("FileManager", "Opened stream to resource " + str);
                        }
                        return httpURLConnection.getInputStream();
                    }
                }
                return null;
            } catch (Exception e2) {
                if (v.a()) {
                    v vVar3 = this.f15770c;
                    vVar3.b("FileManager", "Error loading " + str, e2);
                }
                eVar.a(e2);
                return null;
            }
        } else {
            if (v.a()) {
                v vVar4 = this.f15770c;
                vVar4.b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, e eVar) {
        return a(context, str, str2, list, z, z2, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (v.a()) {
                this.f15770c.b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f15769b.a(b.fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (z2) {
            fileName = StringUtils.encodeUriString(fileName, this.f15769b);
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
            v vVar = this.f15770c;
            vVar.b("FileManager", "Caching succeeded for file " + str4);
        }
        return z3 ? Uri.fromFile(a2).toString() : str4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.applovin.impl.sdk.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r3, r8.f15769b);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = r3.toString("UTF-8");
        r1 = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = com.applovin.impl.sdk.v.a()
            java.lang.String r2 = "FileManager"
            if (r1 == 0) goto L_0x0026
            com.applovin.impl.sdk.v r1 = r8.f15770c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.b(r2, r3)
        L_0x0026:
            r8.c((java.io.File) r9)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            r1.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
        L_0x0037:
            r6 = 0
            int r7 = r1.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            if (r7 < 0) goto L_0x0050
            r3.write(r5, r6, r7)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0037
        L_0x0042:
            com.applovin.impl.sdk.n r4 = r8.f15769b     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
        L_0x0047:
            com.applovin.impl.sdk.n r2 = r8.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.d((java.io.File) r9)
            return r0
        L_0x0050:
            java.lang.String r4 = "UTF-8"
            java.lang.String r0 = r3.toString(r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            goto L_0x0047
        L_0x0057:
            r3 = move-exception
            goto L_0x005f
        L_0x0059:
            r3 = move-exception
            goto L_0x006f
        L_0x005b:
            r3 = move-exception
            goto L_0x0095
        L_0x005d:
            r3 = move-exception
            r1 = r0
        L_0x005f:
            boolean r4 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f15770c     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = "Unknown failure to read file."
            r4.b(r2, r5, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x006d:
            r3 = move-exception
            r1 = r0
        L_0x006f:
            boolean r4 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f15770c     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r5.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "Failed to read file: "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r9.getName()     // Catch:{ all -> 0x00b2 }
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r4.b(r2, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x0093:
            r3 = move-exception
            r1 = r0
        L_0x0095:
            boolean r4 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f15770c     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r5.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r4.c(r2, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x00b2:
            r0 = move-exception
            com.applovin.impl.sdk.n r2 = r8.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.d((java.io.File) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.r.a(java.io.File):java.lang.String");
    }

    public void a(Context context) {
        if (b() && this.f15769b.c()) {
            if (v.a()) {
                this.f15770c.b("FileManager", "Compacting cache...");
            }
            a(c(context), context);
        }
    }

    public boolean a(File file, String str, List<String> list, e eVar) {
        return a(file, str, list, true, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ all -> 0x0072 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.InputStream r7, java.io.File r8) {
        /*
            r6 = this;
            boolean r0 = com.applovin.impl.sdk.v.a()
            java.lang.String r1 = "FileManager"
            if (r0 == 0) goto L_0x0022
            com.applovin.impl.sdk.v r0 = r6.f15770c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing resource to filesystem: "
            r2.append(r3)
            java.lang.String r3 = r8.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L_0x0022:
            r0 = 0
            r2 = 0
            r6.c((java.io.File) r8)     // Catch:{ all -> 0x005e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005e }
            r3.<init>(r8)     // Catch:{ all -> 0x005e }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x005b }
        L_0x0030:
            int r5 = r7.read(r4, r2, r0)     // Catch:{ all -> 0x005b }
            if (r5 < 0) goto L_0x0051
            r3.write(r4, r2, r5)     // Catch:{ Exception -> 0x003a }
            goto L_0x0030
        L_0x003a:
            r7 = move-exception
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0048
            com.applovin.impl.sdk.v r0 = r6.f15770c     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Failed to write next buffer to file"
            r0.b(r1, r4, r7)     // Catch:{ all -> 0x005b }
        L_0x0048:
            com.applovin.impl.sdk.n r7 = r6.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r3, r7)
        L_0x004d:
            r6.d((java.io.File) r8)
            return r2
        L_0x0051:
            com.applovin.impl.sdk.n r7 = r6.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r3, r7)
            r6.d((java.io.File) r8)
            r7 = 1
            return r7
        L_0x005b:
            r7 = move-exception
            r0 = r3
            goto L_0x005f
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            boolean r3 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x006c
            com.applovin.impl.sdk.v r3 = r6.f15770c     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "Unknown failure to write file."
            r3.b(r1, r4, r7)     // Catch:{ all -> 0x0072 }
        L_0x006c:
            com.applovin.impl.sdk.n r7 = r6.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r0, r7)
            goto L_0x004d
        L_0x0072:
            r7 = move-exception
            com.applovin.impl.sdk.n r1 = r6.f15769b
            com.applovin.impl.sdk.utils.Utils.close(r0, r1)
            r6.d((java.io.File) r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.r.a(java.io.InputStream, java.io.File):boolean");
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (!file.exists()) {
                if (v.a()) {
                    v vVar = this.f15770c;
                    vVar.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
                }
                if (!file.createNewFile() && v.a()) {
                    this.f15770c.e("FileManager", "Failed to create .nomedia file");
                }
            }
        } catch (IOException e2) {
            if (v.a()) {
                this.f15770c.b("FileManager", "Failed to create .nomedia file", e2);
            }
        }
    }

    public boolean b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (v.a()) {
            v vVar = this.f15770c;
            vVar.b("FileManager", "Caching " + file.getAbsolutePath() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        if (!a(inputStream, file)) {
            if (v.a()) {
                v vVar2 = this.f15770c;
                vVar2.e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (!v.a()) {
            return true;
        } else {
            v vVar3 = this.f15770c;
            vVar3.b("FileManager", "Caching completed for " + file);
            return true;
        }
    }

    public boolean b(String str, Context context) {
        File a2 = a(str, false, context);
        return a2 != null && a2.exists() && !a2.isDirectory();
    }
}
