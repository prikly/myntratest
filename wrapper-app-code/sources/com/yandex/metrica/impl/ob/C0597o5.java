package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.o5  reason: case insensitive filesystem */
public class C0597o5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final I1 f6390b;

    public C0597o5(L3 l3) {
        this(l3, F0.g().k());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[EDGE_INSN: B:27:0x0061->B:21:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.yandex.metrica.impl.ob.C0293c0 r14) {
        /*
            r13 = this;
            java.lang.String r14 = r14.q()
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0011 }
            r1.<init>(r14)     // Catch:{ all -> 0x0011 }
            java.lang.String r14 = "preloadInfo"
            org.json.JSONObject r14 = r1.optJSONObject(r14)     // Catch:{ all -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r14 = r0
        L_0x0012:
            com.yandex.metrica.impl.ob.I1 r1 = r13.f6390b
            com.yandex.metrica.impl.ob.ee r8 = new com.yandex.metrica.impl.ob.ee
            java.lang.String r2 = "trackingId"
            java.lang.String r3 = com.yandex.metrica.impl.ob.Tl.b((org.json.JSONObject) r14, (java.lang.String) r2)
            java.lang.String r2 = "additionalParams"
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            if (r14 == 0) goto L_0x0030
            boolean r5 = r14.has(r2)
            if (r5 == 0) goto L_0x0030
            org.json.JSONObject r2 = r14.getJSONObject(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r2 = r0
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = r2
        L_0x0035:
            java.lang.String r2 = "wasSet"
            r9 = 0
            boolean r5 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r14, (java.lang.String) r2, (boolean) r9)
            java.lang.String r2 = "autoTracking"
            boolean r6 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r14, (java.lang.String) r2, (boolean) r9)
            java.lang.String r2 = "source"
            java.lang.String r14 = com.yandex.metrica.impl.ob.Tl.b((org.json.JSONObject) r14, (java.lang.String) r2)
            com.yandex.metrica.impl.ob.u0[] r2 = com.yandex.metrica.impl.ob.C0736u0.values()
            r7 = 4
            r10 = 0
        L_0x004e:
            if (r10 >= r7) goto L_0x0061
            r11 = r2[r10]
            java.lang.String r12 = r11.a()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r14)
            if (r12 == 0) goto L_0x005e
            r0 = r11
            goto L_0x0061
        L_0x005e:
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0061:
            if (r0 == 0) goto L_0x0065
            r7 = r0
            goto L_0x0068
        L_0x0065:
            com.yandex.metrica.impl.ob.u0 r14 = com.yandex.metrica.impl.ob.C0736u0.UNDEFINED
            r7 = r14
        L_0x0068:
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.b(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0597o5.a(com.yandex.metrica.impl.ob.c0):boolean");
    }

    C0597o5(L3 l3, I1 i1) {
        super(l3);
        this.f6390b = i1;
    }
}
