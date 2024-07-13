package f;

import f.a;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class a<Self extends a<Self>> {

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f7405e = Executors.newFixedThreadPool(2);

    /* renamed from: a  reason: collision with root package name */
    public final d f7406a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7407b;

    /* renamed from: c  reason: collision with root package name */
    public c<Self> f7408c;

    /* renamed from: d  reason: collision with root package name */
    public b<Self> f7409d;

    public class b implements Runnable {
        private b() {
        }

        public void run() {
            a.this.a();
        }
    }

    public a(d dVar, String str) {
        this.f7406a = dVar;
        this.f7407b = str;
    }

    public Self a(b<Self> bVar) {
        this.f7409d = bVar;
        return d();
    }

    public Self a(c<Self> cVar) {
        this.f7408c = cVar;
        return d();
    }

    public final void a() {
        try {
            a(this.f7407b, e());
        } catch (Throwable unused) {
            b();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable, java.io.Flushable] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0083 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0083 }
            r1.<init>(r4)     // Catch:{ all -> 0x0083 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ all -> 0x0083 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ all -> 0x0083 }
            f.d r1 = r3.f7406a     // Catch:{ all -> 0x0082 }
            r1.a(r4)     // Catch:{ all -> 0x0082 }
            r1 = 0
            r4.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x0082 }
            r1 = 40000(0x9c40, float:5.6052E-41)
            r4.setConnectTimeout(r1)     // Catch:{ all -> 0x0082 }
            r4.setReadTimeout(r1)     // Catch:{ all -> 0x0082 }
            r3.c(r4)     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0048
            int r1 = r5.length     // Catch:{ all -> 0x0082 }
            if (r1 <= 0) goto L_0x0048
            r1 = 1
            r4.setDoOutput(r1)     // Catch:{ all -> 0x0082 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0040 }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ all -> 0x0040 }
            r1.<init>(r2)     // Catch:{ all -> 0x0040 }
            r1.write(r5)     // Catch:{ all -> 0x003d }
            a.a.a((java.io.Flushable) r1)     // Catch:{ all -> 0x0082 }
            a.a.a((java.io.Closeable) r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0048
        L_0x003d:
            r5 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r5 = move-exception
        L_0x0041:
            a.a.a((java.io.Flushable) r0)     // Catch:{ all -> 0x0082 }
            a.a.a((java.io.Closeable) r0)     // Catch:{ all -> 0x0082 }
            throw r5     // Catch:{ all -> 0x0082 }
        L_0x0048:
            int r0 = r3.b(r4)     // Catch:{ all -> 0x0082 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x007b
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x007b
            r1 = 305(0x131, float:4.27E-43)
            if (r0 == r1) goto L_0x0064
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0064
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0064
            switch(r0) {
                case 301: goto L_0x0064;
                case 302: goto L_0x0064;
                case 303: goto L_0x0064;
                default: goto L_0x0063;
            }     // Catch:{ all -> 0x0082 }
        L_0x0063:
            goto L_0x0077
        L_0x0064:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ all -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0077
            r3.a(r0, r5)     // Catch:{ all -> 0x0082 }
            r3.a((java.net.URLConnection) r4)
            return
        L_0x0077:
            r3.b()     // Catch:{ all -> 0x0082 }
            goto L_0x0087
        L_0x007b:
            r3.c()     // Catch:{ all -> 0x0082 }
            r3.a((java.net.URLConnection) r4)
            return
        L_0x0082:
            r0 = r4
        L_0x0083:
            r3.b()     // Catch:{ all -> 0x008b }
            r4 = r0
        L_0x0087:
            r3.a((java.net.URLConnection) r4)
            return
        L_0x008b:
            r4 = move-exception
            r3.a((java.net.URLConnection) r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a(java.lang.String, byte[]):void");
    }

    public final void a(URLConnection uRLConnection) {
        try {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
        } catch (Exception unused) {
        }
    }

    public final int b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    public final void b() {
        b<Self> bVar = this.f7409d;
        if (bVar != null) {
            bVar.b(d());
        }
    }

    public final void c() {
        c<Self> cVar = this.f7408c;
        if (cVar != null) {
            cVar.a(d());
        }
    }

    public abstract void c(URLConnection uRLConnection);

    public abstract Self d();

    public abstract byte[] e();

    public Self f() {
        f7405e.execute(new b());
        return d();
    }
}
