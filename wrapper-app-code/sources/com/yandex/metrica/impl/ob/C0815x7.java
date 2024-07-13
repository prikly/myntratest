package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.x7  reason: case insensitive filesystem */
class C0815x7 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7086a;

    /* renamed from: b  reason: collision with root package name */
    private final File f7087b;

    /* renamed from: c  reason: collision with root package name */
    private final B0 f7088c;

    C0815x7(Context context, File file) {
        this(context, file, new B0());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a1 A[SYNTHETIC, Splitter:B:53:0x00a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f7086a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            com.yandex.metrica.impl.ob.B0 r1 = r9.f7088c
            java.io.File r2 = r9.f7087b
            java.io.File r11 = r1.b((java.io.File) r2, (java.lang.String) r11)
            r1 = 0
            if (r11 != 0) goto L_0x0014
            return r1
        L_0x0014:
            boolean r2 = r11.exists()
            if (r2 == 0) goto L_0x001f
            java.lang.String r10 = r11.getAbsolutePath()
            return r10
        L_0x001f:
            android.content.Context r2 = r9.f7086a
            java.lang.String r3 = "crpad_ext"
            com.yandex.metrica.impl.ob.Rm r2 = com.yandex.metrica.impl.ob.Rm.a(r2, r3)
            r2.a()     // Catch:{ all -> 0x009b }
            boolean r3 = r11.exists()     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x0038
            java.lang.String r10 = r11.getAbsolutePath()     // Catch:{ all -> 0x009b }
            r2.b()
            return r10
        L_0x0038:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ all -> 0x009b }
            r3.<init>(r0)     // Catch:{ all -> 0x009b }
            java.util.zip.ZipEntry r0 = r3.getEntry(r10)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0082
            java.io.InputStream r10 = r3.getInputStream(r0)     // Catch:{ all -> 0x0099 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0099 }
            r0.<init>(r11)     // Catch:{ all -> 0x0099 }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r4]     // Catch:{ all -> 0x0099 }
        L_0x0050:
            r6 = 0
            int r7 = r10.read(r5, r6, r4)     // Catch:{ all -> 0x0099 }
            r8 = -1
            if (r8 == r7) goto L_0x005c
            r0.write(r5, r6, r7)     // Catch:{ all -> 0x0099 }
            goto L_0x0050
        L_0x005c:
            r10 = 1
            boolean r0 = r11.setReadable(r10, r6)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x006a
            r2.b()
            r3.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            return r1
        L_0x006a:
            boolean r10 = r11.setExecutable(r10, r6)     // Catch:{ all -> 0x0099 }
            if (r10 != 0) goto L_0x0077
            r2.b()
            r3.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            return r1
        L_0x0077:
            java.lang.String r10 = r11.getAbsolutePath()     // Catch:{ all -> 0x0099 }
            r2.b()
            r3.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return r10
        L_0x0082:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r0.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "Cannot find ZipEntry"
            r0.append(r4)     // Catch:{ all -> 0x0099 }
            r0.append(r10)     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0099 }
            r11.<init>(r10)     // Catch:{ all -> 0x0099 }
            throw r11     // Catch:{ all -> 0x0099 }
        L_0x0099:
            goto L_0x009c
        L_0x009b:
            r3 = r1
        L_0x009c:
            r2.b()
            if (r3 == 0) goto L_0x00a4
            r3.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0815x7.a(java.lang.String, java.lang.String):java.lang.String");
    }

    C0815x7(Context context, File file, B0 b0) {
        this.f7086a = context;
        this.f7087b = file;
        this.f7088c = b0;
    }
}
