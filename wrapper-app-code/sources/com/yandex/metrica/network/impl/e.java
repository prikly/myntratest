package com.yandex.metrica.network.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f7290a = new e();

    private e() {
    }

    public static final Map a(Map map) {
        Intrinsics.checkNotNullParameter(map, "original");
        Map unmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(HashMap(original))");
        return unmodifiableMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(int r8, kotlin.jvm.functions.Function0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "inputStreamProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            java.lang.Object r9 = r9.invoke()     // Catch:{ all -> 0x0048 }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x0048
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 0
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003a }
            r4 = 0
        L_0x0019:
            int r5 = r9.read(r2)     // Catch:{ all -> 0x003a }
            r6 = -1
            if (r6 == r5) goto L_0x002a
            if (r4 <= r8) goto L_0x0023
            goto L_0x002a
        L_0x0023:
            if (r5 <= 0) goto L_0x0019
            r1.write(r2, r0, r5)     // Catch:{ all -> 0x003a }
            int r4 = r4 + r5
            goto L_0x0019
        L_0x002a:
            byte[] r8 = r1.toByteArray()     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "it.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch:{ all -> 0x003a }
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ all -> 0x0041 }
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ all -> 0x0048 }
            return r8
        L_0x003a:
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ all -> 0x0041 }
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0048
        L_0x0041:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r8)     // Catch:{ all -> 0x0048 }
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            byte[] r8 = new byte[r0]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.network.impl.e.a(int, kotlin.jvm.functions.Function0):byte[]");
    }
}
