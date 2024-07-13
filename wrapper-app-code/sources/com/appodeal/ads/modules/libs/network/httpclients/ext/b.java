package com.appodeal.ads.modules.libs.network.httpclients.ext;

public final class b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.appodeal.ads.modules.libs.network.httpclients.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:118|117|120|121|122) */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01a7, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ac, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r3.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01b6, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        if (r0 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0157, code lost:
        r13 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0159, code lost:
        r13 = e;
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x01a9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0182 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0183 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0192 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0193 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0198 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0199 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019e A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019f A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b0 A[SYNTHETIC, Splitter:B:125:0x01b0] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b5 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b6 A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0157 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:27:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0177 A[SYNTHETIC, Splitter:B:94:0x0177] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017c A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017d A[Catch:{ all -> 0x018c, all -> 0x01ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(java.net.URLConnection r13, com.appodeal.ads.modules.libs.network.httpclients.c r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01ba }
            r0 = 40000(0x9c40, float:5.6052E-41)
            r13.setConnectTimeout(r0)     // Catch:{ all -> 0x01ba }
            r13.setReadTimeout(r0)     // Catch:{ all -> 0x01ba }
            boolean r0 = r13 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x01ba }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r0 = r13
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x01ba }
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            com.appodeal.ads.modules.libs.network.HttpClient$Method r2 = r14.c()     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = com.appodeal.ads.modules.libs.network.httpclients.ext.a.a(r2)     // Catch:{ all -> 0x01ba }
            r0.setRequestMethod(r2)     // Catch:{ all -> 0x01ba }
        L_0x002d:
            java.util.Map r0 = r14.b()     // Catch:{ all -> 0x01ba }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01ba }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01ba }
        L_0x0039:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01ba }
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01ba }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x01ba }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x01ba }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01ba }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01ba }
            r4 = r2
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x01ba }
            java.lang.String r5 = ";"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r2 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01ba }
            r13.setRequestProperty(r3, r2)     // Catch:{ all -> 0x01ba }
            goto L_0x0039
        L_0x0064:
            byte[] r0 = r14.a()     // Catch:{ all -> 0x01ba }
            r2 = 1
            if (r0 != 0) goto L_0x006c
            goto L_0x0081
        L_0x006c:
            r13.setDoOutput(r2)     // Catch:{ all -> 0x01ba }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x01a9 }
            java.io.OutputStream r4 = r13.getOutputStream()     // Catch:{ Exception -> 0x01a9 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01a9 }
            r3.write(r0)     // Catch:{ Exception -> 0x01a5, all -> 0x01a3 }
            r3.flush()     // Catch:{ all -> 0x01ba }
            r3.close()     // Catch:{ all -> 0x01ba }
        L_0x0081:
            java.io.InputStream r0 = r13.getInputStream()     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x015d, all -> 0x015b }
            r3.<init>()     // Catch:{ Exception -> 0x015d, all -> 0x015b }
            boolean r4 = r13 instanceof java.net.HttpURLConnection     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            if (r4 == 0) goto L_0x0092
            r4 = r13
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            goto L_0x0093
        L_0x0092:
            r4 = r1
        L_0x0093:
            r5 = -1
            if (r4 != 0) goto L_0x0098
            r4 = -1
            goto L_0x009c
        L_0x0098:
            int r4 = r4.getResponseCode()     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
        L_0x009c:
            java.util.Map r6 = r13.getHeaderFields()     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            if (r6 != 0) goto L_0x00a6
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
        L_0x00a6:
            r7 = 1024(0x400, float:1.435E-42)
            r8 = 0
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
        L_0x00ab:
            int r9 = r0.read(r7)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            if (r9 == r5) goto L_0x00b5
            r3.write(r7, r8, r9)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            goto L_0x00ab
        L_0x00b5:
            byte[] r5 = r3.toByteArray()     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r7 = "URLConnection"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.<init>()     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r10 = " <-- "
            r9.append(r10)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            com.appodeal.ads.modules.libs.network.HttpClient$Method r14 = r14.c()     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r14 = 32
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r4)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.net.URL r14 = r13.getURL()     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r14 = ", raw response(size: "
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            int r14 = r5.length     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r14 = ", data: "
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r14 = "rawResponse"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r14 = com.appodeal.ads.modules.common.internal.ext.ByteArrayExtKt.toHexString(r5)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r14 = 41
            r9.append(r14)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            java.lang.String r14 = r9.toString()     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r9 = 4
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r7, r14, r1, r9, r1)     // Catch:{ Exception -> 0x0107, all -> 0x0157 }
            r1 = r5
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            r14 = 201(0xc9, float:2.82E-43)
            if (r14 > r4) goto L_0x0112
            r14 = 300(0x12c, float:4.2E-43)
            if (r4 >= r14) goto L_0x0112
            r14 = 1
            goto L_0x0113
        L_0x0112:
            r14 = 0
        L_0x0113:
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0141
            if (r14 == 0) goto L_0x011a
            goto L_0x0141
        L_0x011a:
            r13 = 400(0x190, float:5.6E-43)
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 > r4) goto L_0x0124
            if (r4 >= r14) goto L_0x0124
            r13 = 1
            goto L_0x0125
        L_0x0124:
            r13 = 0
        L_0x0125:
            if (r13 == 0) goto L_0x012a
            com.appodeal.ads.modules.libs.network.HttpError$RequestError r13 = com.appodeal.ads.modules.libs.network.HttpError.RequestError.INSTANCE     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            goto L_0x0139
        L_0x012a:
            if (r14 > r4) goto L_0x0131
            r13 = 600(0x258, float:8.41E-43)
            if (r4 >= r13) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r2 = 0
        L_0x0132:
            if (r2 == 0) goto L_0x0137
            com.appodeal.ads.modules.libs.network.HttpError$ServerError r13 = com.appodeal.ads.modules.libs.network.HttpError.ServerError.INSTANCE     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            goto L_0x0139
        L_0x0137:
            com.appodeal.ads.modules.libs.network.HttpError$InternalError r13 = com.appodeal.ads.modules.libs.network.HttpError.InternalError.INSTANCE     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
        L_0x0139:
            com.appodeal.ads.modules.libs.network.httpclients.e$a r14 = new com.appodeal.ads.modules.libs.network.httpclients.e$a     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            r14.<init>(r6, r13)     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            if (r0 != 0) goto L_0x014d
            goto L_0x0150
        L_0x0141:
            java.lang.String r13 = r13.getContentEncoding()     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            com.appodeal.ads.modules.libs.network.httpclients.e$b r14 = new com.appodeal.ads.modules.libs.network.httpclients.e$b     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            r14.<init>(r1, r13, r6)     // Catch:{ Exception -> 0x0159, all -> 0x0157 }
            if (r0 != 0) goto L_0x014d
            goto L_0x0150
        L_0x014d:
            r0.close()     // Catch:{ all -> 0x01ba }
        L_0x0150:
            r3.flush()     // Catch:{ all -> 0x01ba }
            r3.close()     // Catch:{ all -> 0x01ba }
            goto L_0x0187
        L_0x0157:
            r13 = move-exception
            goto L_0x0190
        L_0x0159:
            r13 = move-exception
            goto L_0x0165
        L_0x015b:
            r13 = move-exception
            goto L_0x018f
        L_0x015d:
            r13 = move-exception
            goto L_0x0164
        L_0x015f:
            r13 = move-exception
            r0 = r1
            goto L_0x018f
        L_0x0162:
            r13 = move-exception
            r0 = r1
        L_0x0164:
            r3 = r1
        L_0x0165:
            r1 = r0
            java.util.Map r14 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ all -> 0x018c }
            com.appodeal.ads.modules.libs.network.HttpError$UncaughtException r0 = new com.appodeal.ads.modules.libs.network.HttpError$UncaughtException     // Catch:{ all -> 0x018c }
            r0.<init>(r13)     // Catch:{ all -> 0x018c }
            com.appodeal.ads.modules.libs.network.httpclients.e$a r13 = new com.appodeal.ads.modules.libs.network.httpclients.e$a     // Catch:{ all -> 0x018c }
            r13.<init>(r14, r0)     // Catch:{ all -> 0x018c }
            if (r1 != 0) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r1.close()     // Catch:{ all -> 0x01ba }
        L_0x017a:
            if (r3 != 0) goto L_0x017d
            goto L_0x0180
        L_0x017d:
            r3.flush()     // Catch:{ all -> 0x01ba }
        L_0x0180:
            if (r3 != 0) goto L_0x0183
            goto L_0x0186
        L_0x0183:
            r3.close()     // Catch:{ all -> 0x01ba }
        L_0x0186:
            r14 = r13
        L_0x0187:
            java.lang.Object r13 = kotlin.Result.m44constructorimpl(r14)     // Catch:{ all -> 0x01ba }
            goto L_0x01c5
        L_0x018c:
            r13 = move-exception
            r0 = r1
            r1 = r3
        L_0x018f:
            r3 = r1
        L_0x0190:
            if (r0 != 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            r0.close()     // Catch:{ all -> 0x01ba }
        L_0x0196:
            if (r3 != 0) goto L_0x0199
            goto L_0x019c
        L_0x0199:
            r3.flush()     // Catch:{ all -> 0x01ba }
        L_0x019c:
            if (r3 != 0) goto L_0x019f
            goto L_0x01b9
        L_0x019f:
            r3.close()     // Catch:{ all -> 0x01ba }
            goto L_0x01b9
        L_0x01a3:
            r13 = move-exception
            goto L_0x01ad
        L_0x01a5:
            r1 = r3
            goto L_0x01a9
        L_0x01a7:
            r13 = move-exception
            goto L_0x01ac
        L_0x01a9:
            com.appodeal.ads.modules.libs.network.HttpError$RequestError r13 = com.appodeal.ads.modules.libs.network.HttpError.RequestError.INSTANCE     // Catch:{ all -> 0x01a7 }
            throw r13     // Catch:{ all -> 0x01a7 }
        L_0x01ac:
            r3 = r1
        L_0x01ad:
            if (r3 != 0) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r3.flush()     // Catch:{ all -> 0x01ba }
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b9
        L_0x01b6:
            r3.close()     // Catch:{ all -> 0x01ba }
        L_0x01b9:
            throw r13     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r13 = move-exception
            kotlin.Result$Companion r14 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m44constructorimpl(r13)
        L_0x01c5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.httpclients.ext.b.a(java.net.URLConnection, com.appodeal.ads.modules.libs.network.httpclients.c):java.lang.Object");
    }
}
