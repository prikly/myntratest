package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.h5  reason: case insensitive filesystem */
public class C0423h5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final I1 f5896b;

    /* renamed from: c  reason: collision with root package name */
    private final C0276b8 f5897c;

    /* renamed from: d  reason: collision with root package name */
    private final C0565mn f5898d;

    public C0423h5(L3 l3) {
        this(l3, l3.x(), F0.g().k(), new C0565mn());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|(5:23|24|25|26|(3:28|29|30))|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.yandex.metrica.impl.ob.C0293c0 r8) {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.L3 r0 = r7.a()
            com.yandex.metrica.impl.ob.b8 r1 = r7.f5897c
            boolean r1 = r1.l()
            if (r1 != 0) goto L_0x0097
            com.yandex.metrica.impl.ob.Lg r1 = r0.m()
            boolean r1 = r1.P()
            if (r1 == 0) goto L_0x001b
            com.yandex.metrica.impl.ob.c0 r8 = com.yandex.metrica.impl.ob.C0293c0.e((com.yandex.metrica.impl.ob.C0293c0) r8)
            goto L_0x001f
        L_0x001b:
            com.yandex.metrica.impl.ob.c0 r8 = com.yandex.metrica.impl.ob.C0293c0.c((com.yandex.metrica.impl.ob.C0293c0) r8)
        L_0x001f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.yandex.metrica.impl.ob.mn r2 = r7.f5898d
            android.content.Context r3 = r0.g()
            com.yandex.metrica.impl.ob.I3 r4 = r0.e()
            java.lang.String r4 = r4.b()
            r2.getClass()
            r2 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x004c }
            r5 = 30
            boolean r5 = com.yandex.metrica.impl.ob.A2.a((int) r5)     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0047
            java.lang.String r3 = com.yandex.metrica.impl.ob.C0590nn.a(r3, r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x0047:
            java.lang.String r3 = r3.getInstallerPackageName(r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = ""
        L_0x0051:
            java.lang.String r4 = "appInstaller"
            r1.put(r4, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "preloadInfo"
            com.yandex.metrica.impl.ob.I1 r4 = r7.f5896b     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.v0 r4 = r4.b()     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.ee r4 = (com.yandex.metrica.impl.ob.C0357ee) r4     // Catch:{ all -> 0x0082 }
            boolean r5 = r4.f5745c     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x007f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "trackingId"
            java.lang.String r6 = r4.f5743a     // Catch:{ all -> 0x007f }
            r2.put(r5, r6)     // Catch:{ all -> 0x007f }
            org.json.JSONObject r5 = r4.f5744b     // Catch:{ all -> 0x007f }
            int r5 = r5.length()     // Catch:{ all -> 0x007f }
            if (r5 <= 0) goto L_0x007f
            java.lang.String r5 = "additionalParams"
            org.json.JSONObject r4 = r4.f5744b     // Catch:{ all -> 0x007f }
            r2.put(r5, r4)     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1.put(r3, r2)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            com.yandex.metrica.impl.ob.a4 r0 = r0.r()
            java.lang.String r1 = r1.toString()
            com.yandex.metrica.impl.ob.c0 r8 = r8.f(r1)
            r0.b(r8)
            com.yandex.metrica.impl.ob.b8 r8 = r7.f5897c
            r0 = 1
            r8.b((boolean) r0)
        L_0x0097:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0423h5.a(com.yandex.metrica.impl.ob.c0):boolean");
    }

    C0423h5(L3 l3, C0276b8 b8Var, I1 i1, C0565mn mnVar) {
        super(l3);
        this.f5897c = b8Var;
        this.f5896b = i1;
        this.f5898d = mnVar;
    }
}
