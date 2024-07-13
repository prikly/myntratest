package com.criteo.publisher.logging;

import java.util.List;

/* compiled from: Logger */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private static final String f2637c = f.a("Logger");

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Integer> f2638d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f2639a;

    /* renamed from: b  reason: collision with root package name */
    private final List<com.criteo.publisher.g0.a<d>> f2640b;

    /* compiled from: Logger */
    class a extends ThreadLocal<Integer> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer initialValue() {
            return 0;
        }
    }

    public g(Class<?> cls, List<com.criteo.publisher.g0.a<d>> list) {
        this(cls.getSimpleName(), list);
    }

    g(String str, List<com.criteo.publisher.g0.a<d>> list) {
        this.f2639a = str;
        this.f2640b = list;
    }

    public void a(String str, Throwable th) {
        a(new e(3, str, th, (String) null));
    }

    public void a(String str, Object... objArr) {
        a(new e(3, String.format(str, objArr), (Throwable) null, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r0 != 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        f2638d.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        f2638d.set(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0 == 0) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.criteo.publisher.logging.e r8) {
        /*
            r7 = this;
            java.lang.ThreadLocal<java.lang.Integer> r0 = f2638d
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 <= r1) goto L_0x0010
            return
        L_0x0010:
            java.util.List<com.criteo.publisher.g0.a<com.criteo.publisher.logging.d>> r1 = r7.f2640b
            java.util.Iterator r1 = r1.iterator()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            com.criteo.publisher.g0.a r2 = (com.criteo.publisher.g0.a) r2
            java.lang.ThreadLocal<java.lang.Integer> r3 = f2638d
            int r4 = r0 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.set(r4)
            java.lang.Object r3 = r2.a()     // Catch:{ Exception -> 0x003d }
            com.criteo.publisher.logging.d r3 = (com.criteo.publisher.logging.d) r3     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = r7.f2639a     // Catch:{ Exception -> 0x003d }
            r3.a(r4, r8)     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x005c
            goto L_0x0056
        L_0x003b:
            r8 = move-exception
            goto L_0x0066
        L_0x003d:
            r3 = move-exception
            java.lang.String r4 = f2637c     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "Impossible to log with handler: "
            r5.append(r6)     // Catch:{ all -> 0x003b }
            r5.append(r2)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x003b }
            android.util.Log.w(r4, r2, r3)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x005c
        L_0x0056:
            java.lang.ThreadLocal<java.lang.Integer> r2 = f2638d
            r2.remove()
            goto L_0x0016
        L_0x005c:
            java.lang.ThreadLocal<java.lang.Integer> r2 = f2638d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.set(r3)
            goto L_0x0016
        L_0x0066:
            if (r0 != 0) goto L_0x006e
            java.lang.ThreadLocal<java.lang.Integer> r0 = f2638d
            r0.remove()
            goto L_0x0077
        L_0x006e:
            java.lang.ThreadLocal<java.lang.Integer> r1 = f2638d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.set(r0)
        L_0x0077:
            throw r8
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.logging.g.a(com.criteo.publisher.logging.e):void");
    }
}
