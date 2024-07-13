package com.bykv.vk.openvk.component.video.a.a.b;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bykv.vk.openvk.component.video.api.e.a;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ReallyVideoPreload */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f17929a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public c f17930b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f17931c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public File f17932d = null;

    /* renamed from: e  reason: collision with root package name */
    private File f17933e = null;

    /* renamed from: f  reason: collision with root package name */
    private final List<a.C0222a> f17934f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f17935g = false;

    public b(Context context, c cVar) {
        this.f17929a = context;
        this.f17930b = cVar;
        this.f17932d = com.bykv.vk.openvk.component.video.a.e.c.b(cVar.a(), cVar.k());
        this.f17933e = com.bykv.vk.openvk.component.video.a.e.c.c(cVar.a(), cVar.k());
    }

    public void a(a.C0222a aVar) {
        if (this.f17935g) {
            synchronized (a.C0222a.class) {
                this.f17934f.add(aVar);
            }
            return;
        }
        this.f17934f.add(aVar);
        if (this.f17933e.exists() || (!this.f17930b.h() && this.f17932d.length() >= ((long) this.f17930b.b()))) {
            com.bykv.vk.openvk.component.video.api.f.c.b("VideoPreload", "Cache file is exist");
            this.f17930b.g(1);
            a(this.f17930b, 200);
            c.a(this.f17930b);
            return;
        }
        this.f17935g = true;
        this.f17930b.g(0);
        b();
    }

    private void b() {
        i.a aVar;
        if (com.bykv.vk.openvk.component.video.api.b.e() != null) {
            aVar = com.bykv.vk.openvk.component.video.api.b.e().b();
        } else {
            aVar = new i.a();
        }
        aVar.a((long) this.f17930b.m(), TimeUnit.MILLISECONDS).b((long) this.f17930b.n(), TimeUnit.MILLISECONDS).c((long) this.f17930b.o(), TimeUnit.MILLISECONDS);
        i a2 = aVar.a();
        k.a aVar2 = new k.a();
        final long length = this.f17932d.length();
        if (this.f17930b.h()) {
            aVar2.a("RANGE", "bytes=" + length + "-").a(this.f17930b.j()).a().b();
        } else {
            aVar2.a("RANGE", "bytes=" + length + "-" + this.f17930b.b()).a(this.f17930b.j()).a().b();
        }
        a2.a(aVar2.b()).a(new com.bytedance.sdk.component.b.a.c() {
            public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
                b bVar2 = b.this;
                bVar2.a(bVar2.f17930b, 601, iOException.getMessage());
                c.a(b.this.f17930b);
            }

            /* JADX WARNING: Removed duplicated region for block: B:54:0x0185 A[Catch:{ all -> 0x01d2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x025a A[Catch:{ all -> 0x02a4 }] */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x019d A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(com.bytedance.sdk.component.b.a.b r23, com.bytedance.sdk.component.b.a.m r24) throws java.io.IOException {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r24
                    long r3 = r2
                    r6 = 0
                    r7 = 3
                    java.lang.String r8 = " Preload size="
                    r9 = 2
                    java.lang.String r10 = "Pre finally "
                    r11 = 4
                    java.lang.String r12 = "VideoPreload"
                    r13 = 1
                    r14 = 0
                    if (r2 == 0) goto L_0x01e5
                    boolean r0 = r24.d()     // Catch:{ all -> 0x01e1 }
                    if (r0 != 0) goto L_0x0079
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b     // Catch:{ all -> 0x0070 }
                    int r4 = r24.c()     // Catch:{ all -> 0x0070 }
                    java.lang.String r15 = r24.e()     // Catch:{ all -> 0x0070 }
                    r0.a((com.bykv.vk.openvk.component.video.api.c.c) r3, (int) r4, (java.lang.String) r15)     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    java.lang.String r2 = r2.j()
                    r0[r13] = r2
                    r0[r9] = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    int r2 = r2.b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0[r7] = r2
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0066:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f17930b
                    com.bykv.vk.openvk.component.video.a.a.b.c.a(r0)
                    return
                L_0x0070:
                    r0 = move-exception
                    r7 = r6
                    r23 = r8
                    r5 = 601(0x259, float:8.42E-43)
                    r8 = r7
                    goto L_0x0248
                L_0x0079:
                    com.bytedance.sdk.component.b.a.n r15 = r24.f()     // Catch:{ all -> 0x01e1 }
                    com.bytedance.sdk.component.b.a.n r15 = r24.f()     // Catch:{ all -> 0x01da }
                    r16 = 0
                    if (r0 == 0) goto L_0x009d
                    if (r15 == 0) goto L_0x009d
                    r23 = r8
                    long r7 = r2     // Catch:{ all -> 0x0099 }
                    long r18 = r15.a()     // Catch:{ all -> 0x0099 }
                    long r7 = r7 + r18
                    java.io.InputStream r0 = r15.c()     // Catch:{ all -> 0x0099 }
                    r18 = r7
                    r7 = r0
                    goto L_0x00a2
                L_0x0099:
                    r0 = move-exception
                    r7 = r6
                    r8 = r7
                    goto L_0x00f5
                L_0x009d:
                    r23 = r8
                    r7 = r6
                    r18 = r16
                L_0x00a2:
                    if (r7 != 0) goto L_0x00fa
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b     // Catch:{ all -> 0x00f3 }
                    int r4 = r24.c()     // Catch:{ all -> 0x00f3 }
                    java.lang.String r8 = r24.e()     // Catch:{ all -> 0x00f3 }
                    r0.a((com.bykv.vk.openvk.component.video.api.c.c) r3, (int) r4, (java.lang.String) r8)     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    java.lang.String r2 = r2.j()
                    r0[r13] = r2
                    r0[r9] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    int r2 = r2.b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x00f3:
                    r0 = move-exception
                    r8 = r6
                L_0x00f5:
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0248
                L_0x00fa:
                    java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01d5 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d5 }
                    java.io.File r0 = r0.f17932d     // Catch:{ all -> 0x01d5 }
                    java.lang.String r6 = "rw"
                    r8.<init>(r0, r6)     // Catch:{ all -> 0x01d5 }
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01d2 }
                    r20 = r16
                    r6 = 0
                L_0x010e:
                    int r5 = 8192 - r6
                    int r5 = r7.read(r0, r6, r5)     // Catch:{ all -> 0x01d2 }
                    r9 = -1
                    if (r5 == r9) goto L_0x01a2
                    com.bykv.vk.openvk.component.video.a.a.b.b r9 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    boolean r9 = r9.f17931c     // Catch:{ all -> 0x01d2 }
                    if (r9 == 0) goto L_0x016b
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.c()     // Catch:{ all -> 0x01d2 }
                    r0.b(r3, r4)     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    java.lang.String r2 = r2.j()
                    r0[r13] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    int r2 = r2.b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x016b:
                    int r6 = r6 + r5
                    long r13 = (long) r5
                    long r20 = r20 + r13
                    r13 = 8192(0x2000, double:4.0474E-320)
                    long r13 = r20 % r13
                    int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                    if (r5 == 0) goto L_0x0182
                    long r13 = r2     // Catch:{ all -> 0x01d2 }
                    long r13 = r18 - r13
                    int r5 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                    if (r5 != 0) goto L_0x0180
                    goto L_0x0182
                L_0x0180:
                    r5 = 0
                    goto L_0x0183
                L_0x0182:
                    r5 = 1
                L_0x0183:
                    if (r5 == 0) goto L_0x019d
                    java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d2 }
                    int r5 = r5.intValue()     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r13 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f17930b     // Catch:{ all -> 0x01d2 }
                    java.lang.String r13 = r13.k()     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.e.c.a(r8, r0, r5, r6, r13)     // Catch:{ all -> 0x01d2 }
                    long r5 = (long) r6     // Catch:{ all -> 0x01d2 }
                    long r3 = r3 + r5
                    r6 = 0
                L_0x019d:
                    r9 = 2
                    r13 = 1
                    r14 = 0
                    goto L_0x010e
                L_0x01a2:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f17930b     // Catch:{ all -> 0x01d2 }
                    boolean r0 = r0.h()     // Catch:{ all -> 0x01d2 }
                    if (r0 == 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    java.io.File r0 = r0.f17932d     // Catch:{ all -> 0x01d2 }
                    long r3 = r0.length()     // Catch:{ all -> 0x01d2 }
                    int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    r0.d()     // Catch:{ all -> 0x01d2 }
                L_0x01c1:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.c()     // Catch:{ all -> 0x01d2 }
                    r0.a((com.bykv.vk.openvk.component.video.api.c.c) r3, (int) r4)     // Catch:{ all -> 0x01d2 }
                    r6 = r8
                    goto L_0x01f9
                L_0x01d2:
                    r0 = move-exception
                    goto L_0x00f5
                L_0x01d5:
                    r0 = move-exception
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0247
                L_0x01da:
                    r0 = move-exception
                    r23 = r8
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0246
                L_0x01e1:
                    r0 = move-exception
                    r23 = r8
                    goto L_0x0243
                L_0x01e5:
                    r23 = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b     // Catch:{ all -> 0x0242 }
                    java.lang.String r4 = "Network link failed."
                    r5 = 601(0x259, float:8.42E-43)
                    r0.a((com.bykv.vk.openvk.component.video.api.c.c) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0240 }
                    r6 = 0
                    r7 = 0
                    r15 = 0
                L_0x01f9:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    java.lang.String r2 = r2.j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    int r2 = r2.b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0236:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f17930b
                    com.bykv.vk.openvk.component.video.a.a.b.c.a(r0)
                    goto L_0x02a3
                L_0x0240:
                    r0 = move-exception
                    goto L_0x0245
                L_0x0242:
                    r0 = move-exception
                L_0x0243:
                    r5 = 601(0x259, float:8.42E-43)
                L_0x0245:
                    r6 = 0
                L_0x0246:
                    r7 = 0
                L_0x0247:
                    r8 = 0
                L_0x0248:
                    r0.printStackTrace()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x02a4 }
                    r3.c()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r4 = com.bykv.vk.openvk.component.video.a.a.b.b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.api.c.c r4 = r4.f17930b     // Catch:{ all -> 0x02a4 }
                    if (r2 == 0) goto L_0x025e
                    int r5 = r24.c()     // Catch:{ all -> 0x02a4 }
                L_0x025e:
                    java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02a4 }
                    r3.a((com.bykv.vk.openvk.component.video.api.c.c) r4, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r0.a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    java.lang.String r2 = r2.j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    int r2 = r2.b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0236
                L_0x02a3:
                    return
                L_0x02a4:
                    r0 = move-exception
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r3.a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r3.a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r3.a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    r3.a((java.io.Closeable) r2)
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r3 = 0
                    r2[r3] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b
                    java.lang.String r3 = r3.j()
                    r4 = 1
                    r2[r4] = r3
                    r3 = 2
                    r2[r3] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f17930b
                    int r3 = r3.b()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 3
                    r2[r4] = r3
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r12, (java.lang.Object[]) r2)
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.vk.openvk.component.video.a.a.b.b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f17930b
                    com.bykv.vk.openvk.component.video.a.a.b.c.a(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.a.b.b.AnonymousClass1.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public c a() {
        return this.f17930b;
    }

    public void a(boolean z) {
        this.f17931c = z;
    }

    /* access modifiers changed from: private */
    public void a(c cVar, int i) {
        synchronized (a.C0222a.class) {
            for (a.C0222a next : this.f17934f) {
                if (next != null) {
                    next.a(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(c cVar, int i, String str) {
        synchronized (a.C0222a.class) {
            for (a.C0222a next : this.f17934f) {
                if (next != null) {
                    next.a(cVar, i, str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(c cVar, int i) {
        synchronized (a.C0222a.class) {
            for (a.C0222a next : this.f17934f) {
                if (next != null) {
                    next.b(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        try {
            this.f17933e.delete();
            this.f17932d.delete();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        try {
            if (!this.f17932d.renameTo(this.f17933e)) {
                throw new IOException("Error renaming file " + this.f17932d + " to " + this.f17933e + " for completion!");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            com.bykv.vk.openvk.component.video.api.f.c.b("VideoPreload", th.getMessage());
        }
    }
}
