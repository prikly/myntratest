package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3658a;

    public h(Map map) {
        Intrinsics.checkNotNullParameter(map, "providers");
        this.f3658a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(java.util.Map r3, int r4) {
        /*
            r2 = this;
            r3 = 1
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0035
            r4 = 3
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            com.yandex.metrica.identifiers.impl.k r0 = new com.yandex.metrica.identifiers.impl.k
            r0.<init>()
            java.lang.String r1 = "google"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r1 = 0
            r4[r1] = r0
            com.yandex.metrica.identifiers.impl.r r0 = new com.yandex.metrica.identifiers.impl.r
            r0.<init>()
            java.lang.String r1 = "huawei"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r4[r3] = r0
            com.yandex.metrica.identifiers.impl.o r3 = new com.yandex.metrica.identifiers.impl.o
            r3.<init>()
            java.lang.String r0 = "yandex"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r0, r3)
            r0 = 2
            r4[r0] = r3
            java.util.Map r3 = kotlin.collections.MapsKt.mapOf(r4)
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.h.<init>(java.util.Map, int):void");
    }

    public final Bundle a(Context context, String str) {
        g a2;
        Intrinsics.checkNotNullParameter(context, "context");
        i iVar = (i) this.f3658a.get(str);
        if (iVar == null || (a2 = iVar.a(context)) == null) {
            return null;
        }
        return a2.a();
    }
}
