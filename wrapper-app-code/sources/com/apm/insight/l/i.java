package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.b;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.entity.e;
import com.apm.insight.g.d;
import com.apm.insight.h;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i {
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.apm.insight.entity.a a(java.io.File r17, boolean r18) {
        /*
            java.lang.String r0 = "\n"
            com.apm.insight.entity.a r1 = new com.apm.insight.entity.a
            r1.<init>()
            boolean r2 = r17.exists()
            java.lang.String r3 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            java.lang.String r4 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = r17.getAbsolutePath()     // Catch:{ IOException -> 0x001a }
            java.lang.String r2 = a((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ IOException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0025
            if (r18 == 0) goto L_0x011a
            goto L_0x011b
        L_0x0025:
            java.lang.String[] r2 = r2.split(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r2.length
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x003d:
            r14 = 1
            if (r11 >= r9) goto L_0x0072
            r15 = r2[r11]
            if (r12 != 0) goto L_0x004e
            java.lang.String r5 = "stack:"
            boolean r5 = r15.startsWith(r5)
            if (r5 == 0) goto L_0x004e
            r12 = 1
            goto L_0x006f
        L_0x004e:
            if (r13 != 0) goto L_0x005a
            java.lang.String r5 = "err:"
            boolean r5 = r15.startsWith(r5)
            if (r5 == 0) goto L_0x005a
            r13 = 1
            goto L_0x006f
        L_0x005a:
            if (r13 == 0) goto L_0x0063
            r8.append(r15)
            r8.append(r0)
            goto L_0x006f
        L_0x0063:
            if (r12 == 0) goto L_0x006c
            r7.append(r15)
            r7.append(r0)
            goto L_0x006f
        L_0x006c:
            r6.add(r15)
        L_0x006f:
            int r11 = r11 + 1
            goto L_0x003d
        L_0x0072:
            int r0 = r6.size()
            if (r0 < r14) goto L_0x007f
            java.lang.Object r0 = r6.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            int r2 = r6.size()
            r5 = 2
            if (r2 < r5) goto L_0x008e
            java.lang.Object r2 = r6.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            int r9 = r6.size()
            r10 = 3
            if (r9 < r10) goto L_0x009d
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            int r9 = r6.size()
            r11 = 4
            if (r9 < r11) goto L_0x00ae
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r6 = (java.lang.String) r6
            r16 = r6
            goto L_0x00b0
        L_0x00ae:
            r16 = 0
        L_0x00b0:
            if (r12 == 0) goto L_0x00bd
            int r6 = r7.length()
            if (r6 <= 0) goto L_0x00bd
            java.lang.String r2 = r7.toString()
            goto L_0x00f6
        L_0x00bd:
            java.lang.String r6 = "\nCaused by: "
            if (r5 == 0) goto L_0x00d8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r6)
            if (r18 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r3 = r4
        L_0x00d0:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x00f6
        L_0x00d8:
            if (r2 == 0) goto L_0x00f1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r6)
            if (r18 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r3 = r4
        L_0x00e9:
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            goto L_0x00f6
        L_0x00f1:
            if (r18 == 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r3 = r4
        L_0x00f5:
            r2 = r3
        L_0x00f6:
            if (r13 == 0) goto L_0x0112
            int r3 = r8.length()
            if (r3 <= 0) goto L_0x0112
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth在抓取堆栈时发生如下错误:\n"
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
        L_0x0112:
            r3 = r2
            r5 = r0
            r0 = r16
            goto L_0x011d
        L_0x0117:
            if (r18 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r3 = r4
        L_0x011b:
            r0 = 0
            r5 = 0
        L_0x011d:
            java.lang.String r2 = "data"
            r1.a((java.lang.String) r2, (java.lang.Object) r3)
            java.lang.String r2 = "process_name"
            r1.a((java.lang.String) r2, (java.lang.Object) r5)
            java.lang.String r2 = "crash_thread_name"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            java.lang.String r2 = "isOOM"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.i.a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    public static e a(File file, CrashType crashType) {
        a d2 = d(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = d2.h().optJSONObject("header");
        if (optJSONObject.optString("unique_key", (String) null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + h.c().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        e eVar = new e();
        eVar.a(crashType == CrashType.LAUNCH ? com.apm.insight.k.e.e() : com.apm.insight.k.e.c());
        eVar.a(d2.h());
        eVar.a(com.apm.insight.k.e.a());
        return eVar;
    }

    public static String a(File file, String str) {
        return a(file, str, -1);
    }

    public static String a(File file, String str, long j) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    k.a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    if (!(sb.length() == 0 || str == null)) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    k.a((Closeable) bufferedReader2);
                    return sb.toString();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            k.a((Closeable) bufferedReader);
            throw th;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            a(file2, jSONObject2, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return a(file, str, str2, jSONObject, (String) null, z);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), str2);
    }

    public static JSONArray a(File file, long j) {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    k.a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    k.a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            k.a((Closeable) bufferedReader);
            throw th;
        }
    }

    public static void a(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (file != null && file2 != null) {
            FileInputStream fileInputStream = null;
            try {
                file2.getParentFile().mkdirs();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        k.a((Closeable) fileInputStream);
                        k.a((Closeable) fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        k.a((Closeable) fileInputStream);
                        k.a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    k.a((Closeable) fileInputStream);
                    k.a((Closeable) fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    k.a((Closeable) fileInputStream2);
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    k.a((Closeable) fileInputStream);
                    k.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    k.a((Closeable) fileInputStream);
                    k.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
                e.printStackTrace();
                k.a((Closeable) fileInputStream);
                k.a((Closeable) fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                k.a((Closeable) fileInputStream);
                k.a((Closeable) fileOutputStream);
                throw th;
            }
            k.a((Closeable) fileOutputStream);
        }
    }

    public static void a(File file, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    k.a((Closeable) fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    k.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                k.a((Closeable) fileOutputStream);
                throw th;
            }
        }
    }

    public static void a(File file, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            FileOutputStream fileOutputStream = null;
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry next : map.entrySet()) {
                        properties.setProperty((String) next.getKey(), (String) next.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    k.a((Closeable) fileOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        q.b((Throwable) e);
                        k.a((Closeable) fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        k.a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    k.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                q.b((Throwable) e);
                k.a((Closeable) fileOutputStream);
            }
        }
    }

    public static void a(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    m.a(jSONArray, (Writer) bufferedWriter2);
                    k.a((Closeable) bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    k.a((Closeable) bufferedWriter);
                }
            } catch (Throwable unused2) {
                k.a((Closeable) bufferedWriter);
            }
        }
    }

    public static void a(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    m.a(jSONObject, (Writer) bufferedWriter2);
                    k.a((Closeable) bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    k.a((Closeable) bufferedWriter);
                }
            } catch (Throwable unused2) {
                k.a((Closeable) bufferedWriter);
            }
        }
    }

    public static void a(OutputStream outputStream, File... fileArr) {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File a2 : fileArr) {
                    a(zipOutputStream2, a2);
                }
                k.a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                k.a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            k.a((Closeable) zipOutputStream);
            throw th;
        }
    }

    private static void a(String str, File file) {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                a(zipOutputStream2, file, "");
                k.a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                k.a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            k.a((Closeable) zipOutputStream);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) {
        File[] fileArr;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                fileArr = file.listFiles();
            } else {
                fileArr = new File[]{file};
            }
            if (fileArr != null) {
                for (int i = 0; i < fileArr.length; i++) {
                    a(zipOutputStream, fileArr[i], fileArr[i].getName());
                }
            }
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
        String str2;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                    if (str.length() == 0) {
                        str2 = "";
                    } else {
                        str2 = str + "/";
                    }
                    for (int i = 0; i < listFiles.length; i++) {
                        a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
                    }
                    return;
                }
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str));
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (-1 != read) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            k.a((Closeable) fileInputStream2);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    k.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                k.a((Closeable) fileInputStream);
                throw th;
            }
        }
    }

    public static boolean a(File file) {
        boolean z;
        boolean z2 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        while (listFiles != null && i < listFiles.length) {
            if (!listFiles[i].isFile()) {
                z = a(listFiles[i]);
            } else if (listFiles[i].canWrite()) {
                z = listFiles[i].delete();
            } else {
                z2 = false;
                i++;
            }
            z2 &= z;
            i++;
        }
        return z2 & file.delete();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(new File(str));
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static JSONArray b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1);
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (!(str == null || str2 == null)) {
            for (String put : str.split(str2)) {
                jSONArray.put(put);
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r3, org.json.JSONObject r4, boolean r5) {
        /*
            java.lang.String r5 = "err_write"
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            java.io.File r0 = r3.getParentFile()
            r0.mkdirs()
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0021 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ all -> 0x0021 }
            r2.<init>(r3)     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            com.apm.insight.l.m.a((org.json.JSONObject) r4, (java.io.Writer) r1)     // Catch:{ all -> 0x001e }
            com.apm.insight.l.k.a((java.io.Closeable) r1)
            goto L_0x0041
        L_0x001e:
            r3 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x0035 }
            r4.put(r5, r1)     // Catch:{ JSONException -> 0x0035 }
            java.lang.String r1 = "filters"
            java.lang.String r2 = r3.getLocalizedMessage()     // Catch:{ JSONException -> 0x0035 }
            com.apm.insight.entity.a.a((org.json.JSONObject) r4, (java.lang.String) r1, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ JSONException -> 0x0035 }
            goto L_0x0035
        L_0x0033:
            r3 = move-exception
            goto L_0x0042
        L_0x0035:
            com.apm.insight.c r4 = com.apm.insight.b.a()     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "NPTH_CATCH"
            r4.a((java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0033 }
            com.apm.insight.l.k.a((java.io.Closeable) r0)
        L_0x0041:
            return
        L_0x0042:
            com.apm.insight.l.k.a((java.io.Closeable) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.i.b(java.io.File, org.json.JSONObject, boolean):void");
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static String c(File file) {
        return a(file, "\n");
    }

    public static String c(String str) {
        return a(str, "\n");
    }

    public static void c(String str, String str2) {
        a(str2, new File(str));
    }

    public static a d(File file) {
        a a2 = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < d.a(); i++) {
            File a3 = o.a(file, "." + i);
            if (a3.exists()) {
                try {
                    a2.c(new JSONObject(c(a3.getAbsolutePath())));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        a2.a("crash_type", z ? "step" : "simple");
        JSONObject optJSONObject = a2.h().optJSONObject("header");
        JSONObject f2 = Header.a(h.g(), a2.h().optLong("crash_time", 0)).f();
        if (optJSONObject == null) {
            a2.a(f2);
        } else {
            l.a(optJSONObject, f2);
        }
        return a2;
    }

    public static e d(String str) {
        try {
            String c2 = c(str);
            if (c2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c2);
            e eVar = new e();
            eVar.a(jSONObject.optString("url"));
            eVar.a(jSONObject.optJSONObject("body"));
            eVar.b(jSONObject.optString("dump_file"));
            eVar.a(jSONObject.optBoolean("encrypt", false));
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static e e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(c(str));
            e eVar = new e();
            eVar.d(jSONObject.optString("aid"));
            eVar.c(jSONObject.optString("did"));
            eVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                eVar.a((List<String>) arrayList);
            }
            return eVar;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> e(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String next : stringPropertyNames) {
                    hashMap.put(next, properties.getProperty(next));
                }
                k.a((Closeable) fileInputStream);
                return hashMap;
            } catch (IOException e2) {
                e = e2;
                try {
                    q.b((Throwable) e);
                    k.a((Closeable) fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    k.a((Closeable) fileInputStream2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            q.b((Throwable) e);
            k.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            k.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static void f(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
        }
    }

    public static boolean g(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int c2 = NativeImpl.c(file.getAbsolutePath());
            if (c2 <= 0) {
                return c2 < 0;
            }
            NativeImpl.a(c2);
            return false;
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
        }
    }
}
