package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.appodeal.ads.AppodealNetworks;
import kotlin.jvm.internal.Intrinsics;

public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private final e f3664a;

    public o() {
        this(new e(p.f3665a, n.f3663a, AppodealNetworks.YANDEX));
    }

    public o(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "connectionController");
        this.f3664a = eVar;
    }

    private final g b(Context context) {
        c cVar = (c) this.f3664a.a(context);
        String b2 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b2, "service.advId");
        return new g(l.OK, new f(AppodealNetworks.YANDEX, b2, Boolean.valueOf(cVar.d())), (String) null, 4);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x003b=Splitter:B:15:0x003b, B:21:0x004d=Splitter:B:21:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.identifiers.impl.g a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 2
            r1 = 0
            com.yandex.metrica.identifiers.impl.g r0 = r7.b(r8)     // Catch:{ m -> 0x0043, j -> 0x0031, all -> 0x0011 }
            com.yandex.metrica.identifiers.impl.e r1 = r7.f3664a     // Catch:{ all -> 0x0059 }
            r1.b(r8)     // Catch:{ all -> 0x0059 }
            goto L_0x0059
        L_0x0011:
            r2 = move-exception
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.l.UNKNOWN     // Catch:{ all -> 0x005a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r5.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "exception while fetching yandex adv_id: "
            r5.append(r6)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            r5.append(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
        L_0x002e:
            com.yandex.metrica.identifiers.impl.e r0 = r7.f3664a     // Catch:{ all -> 0x0058 }
            goto L_0x0055
        L_0x0031:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            java.lang.String r2 = "unknown exception while binding yandex adv_id service"
        L_0x003b:
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.l.IDENTIFIER_PROVIDER_UNAVAILABLE     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
            goto L_0x002e
        L_0x0043:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            java.lang.String r2 = "No yandex adv_id service"
        L_0x004d:
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.l.IDENTIFIER_PROVIDER_UNAVAILABLE     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
            goto L_0x002e
        L_0x0055:
            r0.b(r8)     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = r3
        L_0x0059:
            return r0
        L_0x005a:
            r0 = move-exception
            com.yandex.metrica.identifiers.impl.e r1 = r7.f3664a     // Catch:{ all -> 0x0060 }
            r1.b(r8)     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.o.a(android.content.Context):com.yandex.metrica.identifiers.impl.g");
    }
}
