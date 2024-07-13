package com.bykv.vk.openvk.component.video.a.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.a.b.c.c;
import com.bykv.vk.openvk.component.video.a.b.h;
import com.bykv.vk.openvk.component.video.a.b.i;
import com.bykv.vk.openvk.component.video.a.b.l;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: DownloadTask */
class b extends a {
    final Object m = this;
    final Object n;
    private final int o;
    private final C0215b p;
    private volatile h.a q;
    private volatile com.bykv.vk.openvk.component.video.a.b.c.b r;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$b  reason: collision with other inner class name */
    /* compiled from: DownloadTask */
    public interface C0215b {
        void a(b bVar);
    }

    b(a aVar) {
        super(aVar.f17970d, aVar.f17971e);
        this.o = aVar.f17973g;
        this.p = aVar.i;
        this.f17945g = aVar.f17967a;
        this.f17946h = aVar.f17968b;
        this.f17944f = aVar.f17972f;
        this.j = aVar.f17969c;
        this.i = aVar.f17974h;
        this.n = aVar.j;
    }

    public void run() {
        this.f17939a.a(this.f17946h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            j();
        } catch (com.bykv.vk.openvk.component.video.a.b.c.a unused) {
        }
        this.f17942d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f17939a.b(this.f17946h);
        C0215b bVar = this.p;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public h.a h() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public com.bykv.vk.openvk.component.video.a.b.c.b i() {
        return this.r;
    }

    private boolean j() throws com.bykv.vk.openvk.component.video.a.b.c.a {
        while (this.j.a()) {
            e();
            l.a b2 = this.j.b();
            try {
                a(b2);
                return true;
            } catch (c e2) {
                b2.a();
                a(Boolean.valueOf(g()), this.f17945g, e2);
            } catch (IOException e3) {
                if (e3 instanceof SocketTimeoutException) {
                    b2.b();
                }
                if (!b()) {
                    a(Boolean.valueOf(g()), this.f17945g, e3);
                }
            } catch (h.a e4) {
                this.q = e4;
                a(Boolean.valueOf(g()), this.f17945g, e4);
                return false;
            } catch (com.bykv.vk.openvk.component.video.a.b.c.b e5) {
                this.r = e5;
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (com.bykv.vk.openvk.component.video.a.b.e.f18017c == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d1, code lost:
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r6.d());
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bykv.vk.openvk.component.video.a.b.l.a r13) throws java.io.IOException, com.bykv.vk.openvk.component.video.a.b.h.a, com.bykv.vk.openvk.component.video.a.b.c.a, com.bykv.vk.openvk.component.video.a.b.c.b {
        /*
            r12 = this;
            com.bykv.vk.openvk.component.video.a.b.a.a r0 = r12.f17939a
            java.lang.String r1 = r12.f17946h
            java.io.File r0 = r0.c(r1)
            long r1 = r0.length()
            int r3 = r12.o
            if (r3 <= 0) goto L_0x0044
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0044
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r13 == 0) goto L_0x0043
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no necessary to download for "
            r0.append(r3)
            java.lang.String r3 = r12.f17946h
            r0.append(r3)
            java.lang.String r3 = ", cache file size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", max: "
            r0.append(r1)
            int r1 = r12.o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0043:
            return
        L_0x0044:
            int r3 = r12.f()
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f17940b
            java.lang.String r5 = r12.f17946h
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.a((java.lang.String) r5, (int) r3)
            if (r4 == 0) goto L_0x0076
            int r5 = r4.f17977c
            long r5 = (long) r5
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0076
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r13 == 0) goto L_0x0075
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file download complete, key: "
            r0.append(r1)
            java.lang.String r1 = r12.f17946h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0075:
            return
        L_0x0076:
            r12.e()
            int r5 = (int) r1
            int r6 = r12.o
            java.lang.String r7 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r6 = r12.a(r13, r5, r6, r7)
            if (r6 != 0) goto L_0x0085
            return
        L_0x0085:
            r7 = 0
            r8 = 1
            r9 = 0
            r12.e()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.i r10 = r12.i     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x0095
            boolean r10 = com.bykv.vk.openvk.component.video.a.b.e.f18019e     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0095
            r10 = 1
            goto L_0x0096
        L_0x0095:
            r10 = 0
        L_0x0096:
            java.lang.String r10 = com.bykv.vk.openvk.component.video.a.c.a.a(r6, r10, r8)     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x01ea
            int r10 = com.bykv.vk.openvk.component.video.a.c.a.a((com.bykv.vk.openvk.component.video.a.b.e.a) r6)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0111
            int r11 = r4.f17977c     // Catch:{ all -> 0x020e }
            if (r11 == r10) goto L_0x0111
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f17977c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f17946h     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020e }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x020e }
        L_0x00d4:
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f17977c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f17945g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = ", previousInfo: "
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r4.f17979e     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x0111:
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f17940b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f17946h     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.c.a.a(r6, r13, r4, r3)     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f17940b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f17946h     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.a r13 = r13.a((java.lang.String) r4, (int) r3)     // Catch:{ all -> 0x020e }
            if (r13 != 0) goto L_0x0124
            r13 = 0
            goto L_0x0126
        L_0x0124:
            int r13 = r13.f17977c     // Catch:{ all -> 0x020e }
        L_0x0126:
            java.io.InputStream r3 = r6.d()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x020e }
            boolean r10 = com.bykv.vk.openvk.component.video.a.b.e.f18018d     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = "rwd"
            goto L_0x0135
        L_0x0133:
            java.lang.String r10 = "rw"
        L_0x0135:
            r4.<init>(r0, r10)     // Catch:{ all -> 0x020e }
            r4.a((long) r1)     // Catch:{ all -> 0x01e7 }
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r7.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r10 = "preload start from: "
            r7.append(r10)     // Catch:{ all -> 0x01e7 }
            r7.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x01e7 }
        L_0x0155:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01e7 }
        L_0x0159:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x01e7 }
            if (r1 < 0) goto L_0x01ca
            r12.e()     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x0181
            r4.a(r0, r9, r1)     // Catch:{ all -> 0x01e7 }
            int r5 = r5 + r1
            com.bykv.vk.openvk.component.video.a.b.i r2 = r12.i     // Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r12.m     // Catch:{ all -> 0x01e7 }
            monitor-enter(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r7 = r12.m     // Catch:{ all -> 0x0176 }
            r7.notifyAll()     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            goto L_0x0179
        L_0x0176:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            throw r13     // Catch:{ all -> 0x01e7 }
        L_0x0179:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f17941c     // Catch:{ all -> 0x01e7 }
            r2.addAndGet(r1)     // Catch:{ all -> 0x01e7 }
            r12.a(r13, r5)     // Catch:{ all -> 0x01e7 }
        L_0x0181:
            int r1 = r12.o     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x01c6
            int r1 = r12.o     // Catch:{ all -> 0x01e7 }
            if (r5 < r1) goto L_0x01c6
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01e7 }
            if (r13 == 0) goto L_0x01ad
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r0.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = "download, more data received, currentCacheFileSize: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            r0.append(r5)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = ", max: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            int r1 = r12.o     // Catch:{ all -> 0x01e7 }
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01e7 }
        L_0x01ad:
            java.io.InputStream r13 = r6.d()
            com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r13)
            r4.a()
            r12.a()
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r13 == 0) goto L_0x01c5
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "cancel call"
            android.util.Log.w(r13, r0)
        L_0x01c5:
            return
        L_0x01c6:
            r12.e()     // Catch:{ all -> 0x01e7 }
            goto L_0x0159
        L_0x01ca:
            r12.c()     // Catch:{ all -> 0x01e3 }
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01e3 }
            if (r13 == 0) goto L_0x01d8
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "download succeed, no need to cancel call"
            android.util.Log.i(r13, r0)     // Catch:{ all -> 0x01e3 }
        L_0x01d8:
            java.io.InputStream r13 = r6.d()
            com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r13)
            r4.a()
            return
        L_0x01e3:
            r13 = move-exception
            r7 = r4
            r8 = 0
            goto L_0x020f
        L_0x01e7:
            r13 = move-exception
            r7 = r4
            goto L_0x020f
        L_0x01ea:
            com.bykv.vk.openvk.component.video.a.b.c.c r0 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f17945g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x020e:
            r13 = move-exception
        L_0x020f:
            java.io.InputStream r0 = r6.d()
            com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r0)
            if (r7 == 0) goto L_0x021b
            r7.a()
        L_0x021b:
            if (r8 == 0) goto L_0x022b
            r12.a()
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r1 = "cancel call"
            android.util.Log.w(r0, r1)
        L_0x022b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.b.a(com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* compiled from: DownloadTask */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f17967a;

        /* renamed from: b  reason: collision with root package name */
        String f17968b;

        /* renamed from: c  reason: collision with root package name */
        l f17969c;

        /* renamed from: d  reason: collision with root package name */
        com.bykv.vk.openvk.component.video.a.b.a.a f17970d;

        /* renamed from: e  reason: collision with root package name */
        com.bykv.vk.openvk.component.video.a.b.b.c f17971e;

        /* renamed from: f  reason: collision with root package name */
        List<i.b> f17972f;

        /* renamed from: g  reason: collision with root package name */
        int f17973g;

        /* renamed from: h  reason: collision with root package name */
        i f17974h;
        C0215b i;
        Object j;

        a() {
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f17967a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: package-private */
        public a b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f17968b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        public a a(l lVar) {
            if (lVar != null) {
                this.f17969c = lVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        public a a(com.bykv.vk.openvk.component.video.a.b.a.a aVar) {
            if (aVar != null) {
                this.f17970d = aVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        public a a(com.bykv.vk.openvk.component.video.a.b.b.c cVar) {
            if (cVar != null) {
                this.f17971e = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        public a a(List<i.b> list) {
            this.f17972f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(int i2) {
            this.f17973g = i2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(C0215b bVar) {
            this.i = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(i iVar) {
            this.f17974h = iVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(Object obj) {
            this.j = obj;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b a() {
            if (this.f17970d != null && this.f17971e != null && !TextUtils.isEmpty(this.f17967a) && !TextUtils.isEmpty(this.f17968b) && this.f17969c != null) {
                return new b(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
