package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public class c {

    public static class a extends C0102c {
        a(File file) {
            super(file);
            this.f10794b = "Total FD Count:";
            this.f10795c = ":";
            this.f10796d = -2;
        }
    }

    public static class b extends C0102c {
        b(File file) {
            super(file);
            this.f10794b = "VmSize:";
            this.f10795c = "\\s+";
            this.f10796d = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c  reason: collision with other inner class name */
    public static class C0102c {

        /* renamed from: a  reason: collision with root package name */
        protected File f10793a;

        /* renamed from: b  reason: collision with root package name */
        protected String f10794b;

        /* renamed from: c  reason: collision with root package name */
        protected String f10795c;

        /* renamed from: d  reason: collision with root package name */
        protected int f10796d;

        public C0102c(File file) {
            this.f10793a = file;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f10793a
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x004f
                java.io.File r0 = r5.f10793a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x004f
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r5.f10793a     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r5.a(r2)     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x002d
                goto L_0x0020
            L_0x002d:
                com.apm.insight.l.k.a((java.io.Closeable) r3)
                goto L_0x0047
            L_0x0031:
                r1 = move-exception
                r2 = r0
                r0 = r3
                goto L_0x0038
            L_0x0035:
                r2 = move-exception
                r1 = r2
                r2 = -1
            L_0x0038:
                com.apm.insight.c r3 = com.apm.insight.b.a()     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "NPTH_CATCH"
                r3.a((java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0048 }
                if (r0 == 0) goto L_0x0046
                com.apm.insight.l.k.a((java.io.Closeable) r0)
            L_0x0046:
                r0 = r2
            L_0x0047:
                return r0
            L_0x0048:
                r1 = move-exception
                if (r0 == 0) goto L_0x004e
                com.apm.insight.l.k.a((java.io.Closeable) r0)
            L_0x004e:
                throw r1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.C0102c.a():int");
        }

        public int a(String str) {
            int i = this.f10796d;
            if (!str.startsWith(this.f10794b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f10795c)[1].trim());
            } catch (NumberFormatException e2) {
                com.apm.insight.b.a().a("NPTH_CATCH", (Throwable) e2);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    public static class d extends C0102c {
        d(File file) {
            super(file);
        }

        public HashMap<String, List<String>> b() {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                JSONArray b2 = i.b(this.f10793a.getAbsolutePath());
                if (b2 == null) {
                    return hashMap;
                }
                for (int i = 0; i < b2.length(); i++) {
                    String optString = b2.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        if (optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            String substring = indexOf > 0 ? optString.substring(i2, optString.indexOf(93, i2)) : "unknown addr";
                            List list = hashMap.get(substring);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(substring, list);
                            }
                            list.add(optString);
                        }
                    }
                }
                return hashMap;
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    public static class e extends C0102c {
        e(File file) {
            super(file);
        }

        public JSONArray a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray b2 = i.b(this.f10793a.getAbsolutePath());
                if (b2 == null) {
                    return jSONArray;
                }
                for (int i = 0; i < b2.length(); i++) {
                    String optString = b2.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(":"));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            for (String str : list) {
                                jSONArray.put(str + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> it : hashMap.values()) {
                    for (String str2 : it) {
                        jSONArray.put(str2 + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    public static class f extends C0102c {
        f(File file) {
            super(file);
            this.f10794b = "Total Threads Count:";
            this.f10795c = ":";
            this.f10796d = -2;
        }
    }

    public static int a(String str) {
        return new a(o.b(str)).a();
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int b(String str) {
        return new f(o.c(str)).a();
    }

    public static int c(String str) {
        return new b(o.d(str)).a();
    }
}
