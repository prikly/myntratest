package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.h  reason: case insensitive filesystem */
public final class C0417h implements C0591o {

    /* renamed from: a  reason: collision with root package name */
    private final g f5889a;

    public C0417h(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "systemTimeProvider");
        this.f5889a = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if ((r3 - r5.f3548e) >= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f5952a)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if ((r3 - r2.f3547d) <= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f5953b)) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x001c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.yandex.metrica.billing_interface.a> a(com.yandex.metrica.impl.ob.C0442i r10, java.util.Map<java.lang.String, ? extends com.yandex.metrica.billing_interface.a> r11, com.yandex.metrica.impl.ob.C0516l r12) {
        /*
            r9 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "history"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x001c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.yandex.metrica.billing_interface.a r2 = (com.yandex.metrica.billing_interface.a) r2
            com.yandex.metrica.billing_interface.g r3 = r9.f5889a
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            com.yandex.metrica.billing_interface.e r5 = r2.f3544a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.e.INAPP
            r7 = 1
            if (r5 != r6) goto L_0x0055
            boolean r5 = r12.a()
            if (r5 != 0) goto L_0x0055
            long r5 = r2.f3547d
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f5953b
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0085
            goto L_0x0086
        L_0x0055:
            java.lang.String r5 = r2.f3545b
            com.yandex.metrica.billing_interface.a r5 = r12.a((java.lang.String) r5)
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "storage[historyEntry.sku] ?: return true"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = r5.f3546c
            java.lang.String r8 = r2.f3546c
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x006e
            goto L_0x0086
        L_0x006e:
            com.yandex.metrica.billing_interface.e r2 = r2.f3544a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.e.SUBS
            if (r2 != r6) goto L_0x0085
            long r5 = r5.f3548e
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f5952a
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x001c
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x001c
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0417h.a(com.yandex.metrica.impl.ob.i, java.util.Map, com.yandex.metrica.impl.ob.l):java.util.Map");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0417h(g gVar, int i) {
        this((i & 1) != 0 ? new g() : null);
    }
}
