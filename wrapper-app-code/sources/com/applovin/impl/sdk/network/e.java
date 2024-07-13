package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final PriorityBlockingQueue<b> f15669a = new PriorityBlockingQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final n f15670b;

    static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final BlockingQueue<b> f15671a;

        /* renamed from: b  reason: collision with root package name */
        private final n f15672b;

        private a(BlockingQueue<b> blockingQueue, int i, n nVar) {
            super("AL-Network-" + i);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            } else if (nVar != null) {
                this.f15671a = blockingQueue;
                this.f15672b = nVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        private void a() throws InterruptedException {
            a(this.f15671a.take());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.Closeable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.net.HttpURLConnection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.net.HttpURLConnection} */
        /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[Catch:{ all -> 0x00bc }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[SYNTHETIC, Splitter:B:27:0x0078] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(final com.applovin.impl.sdk.network.e.b r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
                java.net.HttpURLConnection r2 = r9.b(r10)     // Catch:{ all -> 0x005b }
                byte[] r3 = r10.f15680e     // Catch:{ all -> 0x0058 }
                if (r3 == 0) goto L_0x002d
                byte[] r3 = r10.f15680e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                if (r3 <= 0) goto L_0x002d
                r3 = 1
                r2.setDoOutput(r3)     // Catch:{ all -> 0x0058 }
                byte[] r3 = r10.f15680e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                r2.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x0058 }
                java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0058 }
                byte[] r4 = r10.f15680e     // Catch:{ all -> 0x0058 }
                r3.write(r4)     // Catch:{ all -> 0x0058 }
                r3.close()     // Catch:{ all -> 0x0058 }
            L_0x002d:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0058 }
                if (r1 <= 0) goto L_0x0043
                java.io.InputStream r3 = r2.getInputStream()     // Catch:{ all -> 0x0058 }
                com.applovin.impl.sdk.n r4 = r9.f15672b     // Catch:{ all -> 0x003e }
                java.lang.String r4 = com.applovin.impl.sdk.utils.i.a((java.io.InputStream) r3, (com.applovin.impl.sdk.n) r4)     // Catch:{ all -> 0x003e }
                goto L_0x0045
            L_0x003e:
                r4 = move-exception
                r8 = r4
                r4 = r3
                r3 = r8
                goto L_0x005e
            L_0x0043:
                r3 = r0
                r4 = r3
            L_0x0045:
                com.applovin.impl.sdk.n r5 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r3, r5)
                com.applovin.impl.sdk.n r3 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r0, r3)
                com.applovin.impl.sdk.n r3 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r3)
                r3 = r0
                r6 = r3
                r0 = r4
                goto L_0x0097
            L_0x0058:
                r3 = move-exception
                r4 = r0
                goto L_0x005e
            L_0x005b:
                r3 = move-exception
                r2 = r0
                r4 = r2
            L_0x005e:
                com.applovin.impl.sdk.n r5 = r9.f15672b     // Catch:{ all -> 0x00bc }
                r5.D()     // Catch:{ all -> 0x00bc }
                boolean r5 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x00bc }
                if (r5 == 0) goto L_0x0076
                com.applovin.impl.sdk.n r5 = r9.f15672b     // Catch:{ all -> 0x00bc }
                com.applovin.impl.sdk.v r5 = r5.D()     // Catch:{ all -> 0x00bc }
                java.lang.String r6 = "NetworkCommunicationThread"
                java.lang.String r7 = "Failed to make HTTP request"
                r5.a((java.lang.String) r6, (java.lang.String) r7, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00bc }
            L_0x0076:
                if (r2 == 0) goto L_0x0086
                java.io.InputStream r5 = r2.getErrorStream()     // Catch:{ all -> 0x0083 }
                com.applovin.impl.sdk.n r6 = r9.f15672b     // Catch:{ all -> 0x0084 }
                java.lang.String r6 = com.applovin.impl.sdk.utils.i.a((java.io.InputStream) r5, (com.applovin.impl.sdk.n) r6)     // Catch:{ all -> 0x0084 }
                goto L_0x0088
            L_0x0083:
                r5 = r0
            L_0x0084:
                r6 = r0
                goto L_0x0088
            L_0x0086:
                r5 = r0
                r6 = r5
            L_0x0088:
                com.applovin.impl.sdk.n r7 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r4, r7)
                com.applovin.impl.sdk.n r4 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r5, r4)
                com.applovin.impl.sdk.n r4 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r4)
            L_0x0097:
                com.applovin.impl.sdk.network.e$c$a r2 = com.applovin.impl.sdk.network.e.c.d()
                com.applovin.impl.sdk.network.e$c$a r1 = r2.a((int) r1)
                com.applovin.impl.sdk.network.e$c$a r0 = r1.a((java.lang.String) r0)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.b((java.lang.String) r6)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.a((java.lang.Throwable) r3)
                com.applovin.impl.sdk.network.e$c r0 = r0.a()
                java.util.concurrent.Executor r1 = r10.f15683h
                com.applovin.impl.sdk.network.e$a$1 r2 = new com.applovin.impl.sdk.network.e$a$1
                r2.<init>(r10, r0)
                r1.execute(r2)
                return
            L_0x00bc:
                r10 = move-exception
                com.applovin.impl.sdk.n r1 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r4, r1)
                com.applovin.impl.sdk.n r1 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.close(r0, r1)
                com.applovin.impl.sdk.n r0 = r9.f15672b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.e.a.a(com.applovin.impl.sdk.network.e$b):void");
        }

        private HttpURLConnection b(b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f15677b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f15678c);
            httpURLConnection.setConnectTimeout(bVar.f15681f);
            httpURLConnection.setReadTimeout(bVar.f15681f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f15679d.isEmpty()) {
                for (Map.Entry entry : bVar.f15679d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f15676a = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f15677b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final String f15678c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final Map<String, String> f15679d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f15680e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final int f15681f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Consumer<c> f15682g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final Executor f15683h;
        private final int i;

        static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public String f15684a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f15685b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Map<String, String> f15686c = CollectionUtils.map();
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public byte[] f15687d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f15688e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public Consumer<c> f15689f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public Executor f15690g;

            a() {
            }

            /* access modifiers changed from: package-private */
            public a a(int i) {
                this.f15688e = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(Consumer<c> consumer) {
                this.f15689f = consumer;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(String str) {
                this.f15684a = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(String str, String str2) {
                this.f15686c.put(str, str2);
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(Map<String, String> map) {
                if (map == null) {
                    map = CollectionUtils.map();
                }
                this.f15686c = map;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(Executor executor) {
                this.f15690g = executor;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(byte[] bArr) {
                this.f15687d = bArr;
                return this;
            }

            /* access modifiers changed from: package-private */
            public b a() {
                return new b(this);
            }

            /* access modifiers changed from: package-private */
            public a b(String str) {
                this.f15685b = str;
                return this;
            }
        }

        private b(a aVar) {
            this.f15677b = aVar.f15684a;
            this.f15678c = aVar.f15685b;
            this.f15679d = aVar.f15686c != null ? aVar.f15686c : Collections.emptyMap();
            this.f15680e = aVar.f15687d;
            this.f15681f = aVar.f15688e;
            this.f15682g = aVar.f15689f;
            this.f15683h = aVar.f15690g;
            this.i = f15676a.incrementAndGet();
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.i - bVar.i;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f15691a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15692b;

        /* renamed from: c  reason: collision with root package name */
        private final String f15693c;

        /* renamed from: d  reason: collision with root package name */
        private final Throwable f15694d;

        static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public int f15695a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f15696b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public String f15697c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public Throwable f15698d;

            a() {
            }

            /* access modifiers changed from: package-private */
            public a a(int i) {
                this.f15695a = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(String str) {
                this.f15696b = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            public a a(Throwable th) {
                this.f15698d = th;
                return this;
            }

            /* access modifiers changed from: package-private */
            public c a() {
                return new c(this);
            }

            /* access modifiers changed from: package-private */
            public a b(String str) {
                this.f15697c = str;
                return this;
            }
        }

        private c(a aVar) {
            this.f15691a = aVar.f15695a;
            this.f15692b = aVar.f15696b;
            this.f15693c = aVar.f15697c;
            this.f15694d = aVar.f15698d;
        }

        static a d() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        public int a() throws Throwable {
            Throwable th = this.f15694d;
            if (th == null) {
                return this.f15691a;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public String b() throws Throwable {
            Throwable th = this.f15694d;
            if (th == null) {
                return this.f15692b;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.f15693c;
        }
    }

    e(n nVar) {
        this.f15670b = nVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int i = 0; i < ((Integer) this.f15670b.a(com.applovin.impl.sdk.c.b.as)).intValue(); i++) {
            new a(this.f15669a, i, this.f15670b).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        if (bVar != null) {
            this.f15669a.add(bVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
