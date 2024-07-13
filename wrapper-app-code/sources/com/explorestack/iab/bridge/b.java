package com.explorestack.iab.bridge;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.explorestack.iab.mraid.i;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.utils.a;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.net.URLDecoder;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2940a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ boolean f2941b = (!b.class.desiredAssertionStatus());

    public static Pair<String, String> a(String str) {
        String[] split = str.split("/");
        return new Pair<>(split[0], split[1]);
    }

    public static void a(i iVar) {
        if (iVar != null) {
            iVar.a("nativeStorage.fireErrorEvent('internal error');");
        }
    }

    public static void a(i iVar, String str) {
        if (!a(iVar, str)) {
            try {
                Pair<String, String> a2 = a(f2940a.a(URLDecoder.decode(str, "UTF-8")));
                if (!a(iVar, (String) a2.first, (String) a2.second)) {
                    boolean z = f2941b;
                    if (!z) {
                        if (iVar == null) {
                            throw new AssertionError();
                        }
                    }
                    String string = iVar.getContext().getApplicationContext().getSharedPreferences((String) a2.first, 0).getString((String) a2.second, "");
                    if (!a(iVar, string)) {
                        if (!z) {
                            if (string == null) {
                                throw new AssertionError();
                            }
                        }
                        if (!z) {
                            if (str == null) {
                                throw new AssertionError();
                            }
                        }
                        a(iVar, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(string.getBytes(), 2));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                a(iVar);
            }
        }
    }

    public static void a(i iVar, String str, String str2) {
        if (!a(iVar, str, str2)) {
            try {
                String a2 = f2940a.a(URLDecoder.decode(str, "UTF-8"));
                byte[] decode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
                Pair<String, String> a3 = a(a2);
                if (!a(iVar, (String) a3.first, (String) a3.second)) {
                    if (!f2941b) {
                        if (iVar == null) {
                            throw new AssertionError();
                        }
                    }
                    iVar.getContext().getApplicationContext().getSharedPreferences((String) a3.first, 0).edit().putString((String) a3.second, new String(decode)).apply();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                a(iVar);
            }
        }
    }

    public static void a(i iVar, String str, String str2, String str3) {
        if (iVar != null) {
            iVar.a(String.format("nativeStorage.%s(\"%s\", \"%s\");", new Object[]{str, str2, str3}));
        }
    }

    public static boolean a(i iVar, String... strArr) {
        if (iVar == null || iVar.d() || iVar.getContext() == null) {
            a(iVar);
            return true;
        }
        if (strArr != null) {
            for (String isEmpty : strArr) {
                if (TextUtils.isEmpty(isEmpty)) {
                    a(iVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.explorestack.iab.mraid.i r6, java.lang.String r7) {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r7
            boolean r0 = a((com.explorestack.iab.mraid.i) r6, (java.lang.String[]) r0)
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            r0 = 0
            com.explorestack.iab.utils.a r2 = f2940a     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r7, r3)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r2.a((java.lang.String) r3)     // Catch:{ all -> 0x008e }
            boolean r3 = f2941b     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x0027
            if (r6 == 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            r7.<init>()     // Catch:{ all -> 0x008e }
            throw r7     // Catch:{ all -> 0x008e }
        L_0x0027:
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x008e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x008e }
            java.io.File r4 = r3.getFileStreamPath(r2)     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0084
            boolean r4 = r4.exists()     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x003c
            goto L_0x0084
        L_0x003c:
            java.io.FileInputStream r2 = r3.openFileInput(r2)     // Catch:{ all -> 0x008e }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0082 }
            r3.<init>()     // Catch:{ all -> 0x0082 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0056
        L_0x004b:
            r4 = -1
            int r5 = r2.read(r0)     // Catch:{ all -> 0x007f }
            if (r4 == r5) goto L_0x0056
            r3.write(r0, r1, r5)     // Catch:{ all -> 0x007f }
            goto L_0x004b
        L_0x0056:
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x007f }
            int r1 = r0.length     // Catch:{ all -> 0x007f }
            if (r1 <= 0) goto L_0x0075
            boolean r1 = f2941b     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x006a
            if (r7 == 0) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x007f }
            r7.<init>()     // Catch:{ all -> 0x007f }
            throw r7     // Catch:{ all -> 0x007f }
        L_0x006a:
            java.lang.String r1 = "fireReadFileSuccessEvent"
            r4 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ all -> 0x007f }
            a(r6, r1, r7, r0)     // Catch:{ all -> 0x007f }
            goto L_0x0078
        L_0x0075:
            a((com.explorestack.iab.mraid.i) r6)     // Catch:{ all -> 0x007f }
        L_0x0078:
            com.explorestack.iab.utils.Utils.close(r2)
            com.explorestack.iab.utils.Utils.close(r3)
            goto L_0x009c
        L_0x007f:
            r7 = move-exception
            r0 = r3
            goto L_0x0090
        L_0x0082:
            r7 = move-exception
            goto L_0x0090
        L_0x0084:
            a((com.explorestack.iab.mraid.i) r6)     // Catch:{ all -> 0x008e }
            com.explorestack.iab.utils.Utils.close(r0)
            com.explorestack.iab.utils.Utils.close(r0)
            return
        L_0x008e:
            r7 = move-exception
            r2 = r0
        L_0x0090:
            r7.printStackTrace()     // Catch:{ all -> 0x009d }
            a((com.explorestack.iab.mraid.i) r6)     // Catch:{ all -> 0x009d }
            com.explorestack.iab.utils.Utils.close(r2)
            com.explorestack.iab.utils.Utils.close(r0)
        L_0x009c:
            return
        L_0x009d:
            r6 = move-exception
            com.explorestack.iab.utils.Utils.close(r2)
            com.explorestack.iab.utils.Utils.close(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.bridge.b.b(com.explorestack.iab.mraid.i, java.lang.String):void");
    }

    public static void b(i iVar, String str, String str2) {
        if (!a(iVar, str, str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                String a2 = f2940a.a(URLDecoder.decode(str, "UTF-8"));
                byte[] decode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
                if (!a(iVar, a2, new String(decode))) {
                    if (!f2941b) {
                        if (iVar == null) {
                            throw new AssertionError();
                        }
                    }
                    fileOutputStream = iVar.getContext().getApplicationContext().openFileOutput(a2, 0);
                    fileOutputStream.write(decode);
                }
            } catch (Throwable th) {
                Utils.flush((Flushable) null);
                Utils.close((Closeable) null);
                throw th;
            }
            Utils.flush(fileOutputStream);
            Utils.close(fileOutputStream);
        }
    }
}
