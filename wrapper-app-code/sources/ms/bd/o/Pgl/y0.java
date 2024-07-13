package ms.bd.o.Pgl;

public class y0 {

    /* renamed from: c  reason: collision with root package name */
    private static volatile y0 f9757c;

    /* renamed from: a  reason: collision with root package name */
    private int f9758a = 0;

    /* renamed from: b  reason: collision with root package name */
    private Throwable f9759b = null;

    private y0() {
    }

    public static y0 a() {
        if (f9757c == null) {
            synchronized (y0.class) {
                if (f9757c == null) {
                    f9757c = new y0();
                }
            }
        }
        return f9757c;
    }

    public synchronized Throwable b() {
        return this.f9759b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.f9759b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            int r0 = r2.f9758a     // Catch:{ all -> 0x001e }
            int r1 = r0 + 1
            r2.f9758a = r1     // Catch:{ all -> 0x001e }
            r1 = 30
            if (r0 >= r1) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            r0 = 0
            r2.f9758a = r0     // Catch:{ all -> 0x001e }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r2.f9759b = r0     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.y0.c():void");
    }
}
