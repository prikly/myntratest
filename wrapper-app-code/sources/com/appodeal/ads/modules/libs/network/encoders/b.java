package com.appodeal.ads.modules.libs.network.encoders;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

public final class b implements c, d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16769a = new b();

    public final Map<String, List<String>> a() {
        return MapsKt.mapOf(TuplesKt.to("Accept-Encoding", CollectionsKt.listOf("gzip")), TuplesKt.to("Content-Encoding", CollectionsKt.listOf("gzip")));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.ByteArrayInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.ByteArrayInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.ByteArrayInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.ByteArrayInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(java.lang.String r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "gzip"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0066
            r6 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004f }
            r0.<init>()     // Catch:{ all -> 0x004f }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004b }
            r1.<init>(r7)     // Catch:{ all -> 0x004b }
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0045 }
            r7.<init>(r1)     // Catch:{ all -> 0x0045 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0040 }
        L_0x0021:
            int r2 = r7.read(r6)     // Catch:{ all -> 0x0040 }
            r3 = -1
            if (r2 == r3) goto L_0x002d
            r3 = 0
            r0.write(r6, r3, r2)     // Catch:{ all -> 0x0040 }
            goto L_0x0021
        L_0x002d:
            byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "{\n                osByte…ByteArray()\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch:{ all -> 0x0040 }
            r0.close()
            r1.close()
            r7.close()
            return r6
        L_0x0040:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x0053
        L_0x0045:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x0053
        L_0x004b:
            r7 = move-exception
            r1 = r6
            r6 = r0
            goto L_0x0051
        L_0x004f:
            r7 = move-exception
            r1 = r6
        L_0x0051:
            r0 = r7
            r7 = r1
        L_0x0053:
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.close()
        L_0x0059:
            if (r1 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r1.close()
        L_0x005f:
            if (r7 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r7.close()
        L_0x0065:
            throw r0
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.encoders.b.a(java.lang.String, byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(byte[] r5) {
        /*
            r4 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x003c, all -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x002d }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r2.write(r5)     // Catch:{ Exception -> 0x002b, all -> 0x0024 }
            r2.close()     // Catch:{ Exception -> 0x002b, all -> 0x0024 }
            byte[] r2 = r1.toByteArray()     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            java.lang.String r3 = "{\n            osBytes = …s.toByteArray()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r1.close()
            r5 = r2
            goto L_0x0049
        L_0x0024:
            r5 = move-exception
            goto L_0x0028
        L_0x0026:
            r5 = move-exception
            r2 = r0
        L_0x0028:
            r0 = r1
            goto L_0x002f
        L_0x002a:
            r2 = r0
        L_0x002b:
            r0 = r1
            goto L_0x003d
        L_0x002d:
            r5 = move-exception
            r2 = r0
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r0.close()
        L_0x0035:
            if (r2 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r2.close()
        L_0x003b:
            throw r5
        L_0x003c:
            r2 = r0
        L_0x003d:
            if (r0 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r0.close()
        L_0x0043:
            if (r2 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2.close()
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.encoders.b.a(byte[]):byte[]");
    }
}
