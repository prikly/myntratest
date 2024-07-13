package com.yandex.metrica.impl.ob;

public class B7 {

    /* renamed from: c  reason: collision with root package name */
    private static final B7 f3741c = new B7(new C0275b7());

    /* renamed from: a  reason: collision with root package name */
    private final C0275b7 f3742a;

    /* renamed from: b  reason: collision with root package name */
    private a f3743b = a.BLANK;

    private enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    B7(C0275b7 b7Var) {
        this.f3742a = b7Var;
    }

    public static B7 a() {
        return f3741c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.f3743b = com.yandex.metrica.impl.ob.B7.a.f3745b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.B7$a r0 = r5.f3743b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.B7$a r1 = com.yandex.metrica.impl.ob.B7.a.LOADED     // Catch:{ all -> 0x0025 }
            r2 = 1
            if (r0 != r1) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            com.yandex.metrica.impl.ob.B7$a r3 = com.yandex.metrica.impl.ob.B7.a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r4 = 0
            if (r0 != r3) goto L_0x0011
            monitor-exit(r5)
            return r4
        L_0x0011:
            com.yandex.metrica.impl.ob.b7 r0 = r5.f3742a     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "appmetrica-service-native"
            r0.getClass()     // Catch:{ all -> 0x001f }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x001f }
            r5.f3743b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r2
        L_0x001f:
            com.yandex.metrica.impl.ob.B7$a r0 = com.yandex.metrica.impl.ob.B7.a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r5.f3743b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r5)
            return r4
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.B7.b():boolean");
    }
}
