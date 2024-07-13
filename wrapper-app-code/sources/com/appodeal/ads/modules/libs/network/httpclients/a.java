package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.Networking;
import com.appodeal.ads.modules.libs.network.encoders.c;
import com.appodeal.ads.modules.libs.network.encoders.d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Networking {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f16772a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f16773b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f16774c;

    /* renamed from: d  reason: collision with root package name */
    public final d f16775d = new d();

    public a(Map<String, ? extends List<String>> map, List<? extends d> list, List<? extends c> list2) {
        Intrinsics.checkNotNullParameter(map, "headers");
        Intrinsics.checkNotNullParameter(list, "encoders");
        Intrinsics.checkNotNullParameter(list2, "decoders");
        this.f16772a = map;
        this.f16773b = list;
        this.f16774c = list2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:(4:38|(1:40)(1:41)|42|(1:44)(2:45|46))|47|(1:49)(1:50)|51|52|(1:54)(2:55|56)|57|58|71) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0179 */
    /* renamed from: enqueue-yxL6bBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Response> java.lang.Object m151enqueueyxL6bBk(com.appodeal.ads.modules.libs.network.HttpClient.Method r11, java.lang.String r12, byte[] r13, kotlin.jvm.functions.Function1<? super byte[], ? extends Response> r14, boolean r15) {
        /*
            r10 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "parser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--> "
            r0.append(r1)
            r0.append(r11)
            r1 = 32
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", request body: "
            r0.append(r1)
            java.lang.String r1 = new java.lang.String
            r2 = 0
            if (r13 != 0) goto L_0x0031
            byte[] r3 = new byte[r2]
            goto L_0x0032
        L_0x0031:
            r3 = r13
        L_0x0032:
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r1.<init>(r3, r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "HttpClientImpl"
            r3 = 0
            r4 = 4
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r1, r0, r3, r4, r3)
            java.util.List<com.appodeal.ads.modules.libs.network.encoders.d> r0 = r10.f16773b
            java.util.Map r5 = kotlin.collections.MapsKt.emptyMap()
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0064
            java.lang.Object r6 = r0.next()
            com.appodeal.ads.modules.libs.network.encoders.d r6 = (com.appodeal.ads.modules.libs.network.encoders.d) r6
            java.util.Map r6 = r6.a()
            java.util.Map r5 = kotlin.collections.MapsKt.plus(r5, r6)
            goto L_0x004f
        L_0x0064:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r10.f16772a
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r6.putAll(r5)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0076:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r6.get(r7)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x00a0
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00a0:
            java.util.List r5 = kotlin.collections.CollectionsKt.plus(r8, r5)
            java.util.List r5 = kotlin.collections.CollectionsKt.distinct(r5)
        L_0x00a8:
            r6.put(r7, r5)
            goto L_0x0076
        L_0x00ac:
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r6)
            com.appodeal.ads.modules.libs.network.httpclients.verification.b r5 = com.appodeal.ads.modules.libs.network.httpclients.verification.a.a()
            r6 = 2
            java.lang.String r7 = "https://a.appbaqend.com"
            if (r15 == 0) goto L_0x00cc
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r12, r7, r2, r6, r3)
            if (r8 != 0) goto L_0x00cc
            java.lang.String r8 = r5.a()
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r8)
            java.lang.String r9 = "X-Request-ID"
            r0.put(r9, r8)
        L_0x00cc:
            if (r13 != 0) goto L_0x00d0
            r13 = r3
            goto L_0x00d6
        L_0x00d0:
            java.util.List<com.appodeal.ads.modules.libs.network.encoders.d> r8 = r10.f16773b
            byte[] r13 = com.appodeal.ads.modules.libs.network.encoders.ext.a.a(r13, r8)
        L_0x00d6:
            if (r13 != 0) goto L_0x00da
            byte[] r13 = new byte[r2]
        L_0x00da:
            com.appodeal.ads.modules.libs.network.httpclients.c r8 = new com.appodeal.ads.modules.libs.network.httpclients.c
            r8.<init>(r11, r12, r13, r0)
            com.appodeal.ads.modules.libs.network.httpclients.d r11 = r10.f16775d
            r11.getClass()
            java.lang.Object r11 = com.appodeal.ads.modules.libs.network.httpclients.d.a(r8)
            boolean r13 = kotlin.Result.m49isSuccessimpl(r11)
            if (r13 == 0) goto L_0x0192
            kotlin.Result$Companion r13 = kotlin.Result.Companion     // Catch:{ all -> 0x018b }
            com.appodeal.ads.modules.libs.network.httpclients.e r11 = (com.appodeal.ads.modules.libs.network.httpclients.e) r11     // Catch:{ all -> 0x018b }
            boolean r13 = r11 instanceof com.appodeal.ads.modules.libs.network.httpclients.e.a     // Catch:{ all -> 0x018b }
            if (r13 != 0) goto L_0x0184
            boolean r13 = r11 instanceof com.appodeal.ads.modules.libs.network.httpclients.e.b     // Catch:{ all -> 0x018b }
            if (r13 == 0) goto L_0x017e
            if (r15 == 0) goto L_0x012e
            boolean r12 = kotlin.text.StringsKt.startsWith$default(r12, r7, r2, r6, r3)     // Catch:{ all -> 0x018b }
            if (r12 != 0) goto L_0x012e
            r12 = r11
            com.appodeal.ads.modules.libs.network.httpclients.e$b r12 = (com.appodeal.ads.modules.libs.network.httpclients.e.b) r12     // Catch:{ all -> 0x018b }
            java.util.Map r12 = r12.c()     // Catch:{ all -> 0x018b }
            java.lang.String r13 = "X-Signature"
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x018b }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x018b }
            if (r12 != 0) goto L_0x0115
            r12 = r3
            goto L_0x011b
        L_0x0115:
            java.lang.Object r12 = kotlin.collections.CollectionsKt.firstOrNull(r12)     // Catch:{ all -> 0x018b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x018b }
        L_0x011b:
            boolean r12 = r5.a(r12)     // Catch:{ all -> 0x018b }
            if (r12 == 0) goto L_0x0122
            goto L_0x012e
        L_0x0122:
            com.appodeal.ads.modules.libs.network.HttpError$RequestVerificationFailed r12 = new com.appodeal.ads.modules.libs.network.HttpError$RequestVerificationFailed     // Catch:{ all -> 0x018b }
            com.appodeal.ads.modules.libs.network.httpclients.e$b r11 = (com.appodeal.ads.modules.libs.network.httpclients.e.b) r11     // Catch:{ all -> 0x018b }
            byte[] r11 = r11.b()     // Catch:{ all -> 0x018b }
            r12.<init>(r11)     // Catch:{ all -> 0x018b }
            throw r12     // Catch:{ all -> 0x018b }
        L_0x012e:
            r12 = r11
            com.appodeal.ads.modules.libs.network.httpclients.e$b r12 = (com.appodeal.ads.modules.libs.network.httpclients.e.b) r12     // Catch:{ all -> 0x018b }
            byte[] r12 = r12.b()     // Catch:{ all -> 0x018b }
            if (r12 != 0) goto L_0x0139
            r11 = r3
            goto L_0x0145
        L_0x0139:
            com.appodeal.ads.modules.libs.network.httpclients.e$b r11 = (com.appodeal.ads.modules.libs.network.httpclients.e.b) r11     // Catch:{ all -> 0x018b }
            java.lang.String r11 = r11.a()     // Catch:{ all -> 0x018b }
            java.util.List<com.appodeal.ads.modules.libs.network.encoders.c> r13 = r10.f16774c     // Catch:{ all -> 0x018b }
            byte[] r11 = com.appodeal.ads.modules.libs.network.encoders.ext.a.a(r12, r11, r13)     // Catch:{ all -> 0x018b }
        L_0x0145:
            java.lang.Object r11 = r14.invoke(r11)     // Catch:{ Exception -> 0x0179 }
            if (r11 != 0) goto L_0x014c
            goto L_0x0179
        L_0x014c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r12.<init>()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r13 = "<-- "
            r12.append(r13)     // Catch:{ Exception -> 0x0179 }
            com.appodeal.ads.modules.libs.network.HttpClient$Method r13 = r8.c()     // Catch:{ Exception -> 0x0179 }
            r12.append(r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r13 = "     "
            r12.append(r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r13 = r8.d()     // Catch:{ Exception -> 0x0179 }
            r12.append(r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r13 = ", parsed model: "
            r12.append(r13)     // Catch:{ Exception -> 0x0179 }
            r12.append(r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0179 }
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r1, r12, r3, r4, r3)     // Catch:{ Exception -> 0x0179 }
            r3 = r11
        L_0x0179:
            java.lang.Object r11 = kotlin.Result.m44constructorimpl(r3)     // Catch:{ all -> 0x018b }
            goto L_0x0196
        L_0x017e:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x018b }
            r11.<init>()     // Catch:{ all -> 0x018b }
            throw r11     // Catch:{ all -> 0x018b }
        L_0x0184:
            com.appodeal.ads.modules.libs.network.httpclients.e$a r11 = (com.appodeal.ads.modules.libs.network.httpclients.e.a) r11     // Catch:{ all -> 0x018b }
            com.appodeal.ads.modules.libs.network.HttpError r11 = r11.a()     // Catch:{ all -> 0x018b }
            throw r11     // Catch:{ all -> 0x018b }
        L_0x018b:
            r11 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
        L_0x0192:
            java.lang.Object r11 = kotlin.Result.m44constructorimpl(r11)
        L_0x0196:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.httpclients.a.m151enqueueyxL6bBk(com.appodeal.ads.modules.libs.network.HttpClient$Method, java.lang.String, byte[], kotlin.jvm.functions.Function1, boolean):java.lang.Object");
    }
}
