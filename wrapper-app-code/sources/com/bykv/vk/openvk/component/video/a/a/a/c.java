package com.bykv.vk.openvk.component.video.a.a.a;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.b;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoCacheImpl */
public class c implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile long f17920a = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f17921b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public File f17922c;

    /* renamed from: d  reason: collision with root package name */
    private File f17923d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f17924e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile long f17925f = -1;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f17926g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f17927h = false;
    /* access modifiers changed from: private */
    public RandomAccessFile i = null;
    /* access modifiers changed from: private */
    public final com.bykv.vk.openvk.component.video.api.c.c j;

    public c(Context context, com.bykv.vk.openvk.component.video.api.c.c cVar) {
        this.j = cVar;
        try {
            this.f17922c = com.bykv.vk.openvk.component.video.a.e.c.b(cVar.a(), cVar.k());
            this.f17923d = com.bykv.vk.openvk.component.video.a.e.c.c(cVar.a(), cVar.k());
            if (d()) {
                this.i = new RandomAccessFile(this.f17923d, "r");
            } else {
                this.i = new RandomAccessFile(this.f17922c, "rw");
            }
            if (!d()) {
                this.f17924e = this.f17922c.length();
                c();
            }
        } catch (Throwable unused) {
            com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "Error using file ", cVar.j(), " as disc cache");
        }
    }

    private boolean d() {
        return this.f17923d.exists();
    }

    public void c() {
        i.a aVar;
        if (b.e() != null) {
            aVar = b.e().b();
        } else {
            aVar = new i.a();
        }
        aVar.a((long) this.j.m(), TimeUnit.MILLISECONDS).b((long) this.j.n(), TimeUnit.MILLISECONDS).c((long) this.j.o(), TimeUnit.MILLISECONDS);
        i a2 = aVar.a();
        com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "RANGE, bytes=", Long.valueOf(this.f17924e), " file hash=", this.j.k());
        k.a aVar2 = new k.a();
        a2.a(aVar2.a("RANGE", "bytes=" + this.f17924e + "-").a(this.j.j()).a().b()).a(new com.bytedance.sdk.component.b.a.c() {
            public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
                boolean unused = c.this.f17927h = false;
                long unused2 = c.this.f17920a = -1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:113:0x0157 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x012d A[Catch:{ all -> 0x01bd }] */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x0219 A[SYNTHETIC, Splitter:B:79:0x0219] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0221 A[Catch:{ all -> 0x021d }] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x0226 A[Catch:{ all -> 0x021d }] */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x0245 A[Catch:{ all -> 0x021d }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(com.bytedance.sdk.component.b.a.b r25, com.bytedance.sdk.component.b.a.m r26) throws java.io.IOException {
                /*
                    r24 = this;
                    r1 = r24
                    r2 = 0
                    if (r26 == 0) goto L_0x0289
                    r3 = 0
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0202 }
                    boolean r4 = r26.d()     // Catch:{ all -> 0x0202 }
                    boolean unused = r0.f17927h = r4     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0202 }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x0202 }
                    if (r0 == 0) goto L_0x01bf
                    com.bytedance.sdk.component.b.a.n r4 = r26.f()     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x01bd }
                    if (r0 == 0) goto L_0x0039
                    if (r4 == 0) goto L_0x0039
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r5 = r4.a()     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r7 = r7.f17924e     // Catch:{ all -> 0x01bd }
                    long r5 = r5 + r7
                    long unused = r0.f17920a = r5     // Catch:{ all -> 0x01bd }
                    java.io.InputStream r3 = r4.c()     // Catch:{ all -> 0x01bd }
                L_0x0039:
                    if (r3 != 0) goto L_0x0073
                    if (r3 == 0) goto L_0x0043
                    r3.close()     // Catch:{ all -> 0x0041 }
                    goto L_0x0043
                L_0x0041:
                    r0 = move-exception
                    goto L_0x006f
                L_0x0043:
                    if (r4 == 0) goto L_0x0048
                    r4.close()     // Catch:{ all -> 0x0041 }
                L_0x0048:
                    if (r26 == 0) goto L_0x004d
                    r26.close()     // Catch:{ all -> 0x0041 }
                L_0x004d:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0041 }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x0041 }
                    if (r0 == 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0041 }
                    java.io.File r0 = r0.f17922c     // Catch:{ all -> 0x0041 }
                    long r2 = r0.length()     // Catch:{ all -> 0x0041 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0041 }
                    long r4 = r0.f17920a     // Catch:{ all -> 0x0041 }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0041 }
                    r0.f()     // Catch:{ all -> 0x0041 }
                    goto L_0x0072
                L_0x006f:
                    r0.printStackTrace()
                L_0x0072:
                    return
                L_0x0073:
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r5 = r5.f17924e     // Catch:{ all -> 0x01bd }
                    r7 = 0
                    r10 = r7
                    r9 = 0
                L_0x0081:
                    int r12 = 8192 - r9
                    int r12 = r3.read(r0, r9, r12)     // Catch:{ all -> 0x01bd }
                    r13 = -1
                    r15 = 8
                    r16 = 7
                    r17 = 6
                    r18 = 5
                    r19 = 4
                    r20 = 3
                    r21 = 2
                    r14 = 10
                    r22 = 1
                    if (r12 == r13) goto L_0x015b
                    int r9 = r9 + r12
                    long r12 = (long) r12     // Catch:{ all -> 0x01bd }
                    long r10 = r10 + r12
                    r12 = 8192(0x2000, double:4.0474E-320)
                    long r12 = r10 % r12
                    int r23 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                    if (r23 == 0) goto L_0x00bb
                    com.bykv.vk.openvk.component.video.a.a.a.c r12 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r12 = r12.f17920a     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r7 = r7.f17924e     // Catch:{ all -> 0x01bd }
                    long r12 = r12 - r7
                    int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r7 != 0) goto L_0x00b9
                    goto L_0x00bb
                L_0x00b9:
                    r7 = 0
                    goto L_0x00bc
                L_0x00bb:
                    r7 = 1
                L_0x00bc:
                    java.lang.String r8 = "VideoCacheImpl"
                    r12 = 14
                    java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = "Write segment,execAppend ="
                    r12[r2] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01bd }
                    r12[r22] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " offset="
                    r12[r21] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bd }
                    r12[r20] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " totalLength = "
                    r12[r19] = r13     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r19 = r13.f17920a     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x01bd }
                    r12[r18] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " saveSize ="
                    r12[r17] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01bd }
                    r12[r16] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " startSaved="
                    r12[r15] = r13     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r15 = r13.f17924e     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01bd }
                    r15 = 9
                    r12[r15] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " fileHash="
                    r12[r14] = r13     // Catch:{ all -> 0x01bd }
                    r13 = 11
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.j     // Catch:{ all -> 0x01bd }
                    java.lang.String r14 = r14.k()     // Catch:{ all -> 0x01bd }
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    r13 = 12
                    java.lang.String r14 = " url="
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    r13 = 13
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.j     // Catch:{ all -> 0x01bd }
                    java.lang.String r14 = r14.j()     // Catch:{ all -> 0x01bd }
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r8, (java.lang.Object[]) r12)     // Catch:{ all -> 0x01bd }
                    if (r7 == 0) goto L_0x0157
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    java.lang.Object r7 = r7.f17921b     // Catch:{ all -> 0x01bd }
                    monitor-enter(r7)     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0154 }
                    java.io.RandomAccessFile r8 = r8.i     // Catch:{ all -> 0x0154 }
                    java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0154 }
                    int r12 = r12.intValue()     // Catch:{ all -> 0x0154 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0154 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.j     // Catch:{ all -> 0x0154 }
                    java.lang.String r13 = r13.k()     // Catch:{ all -> 0x0154 }
                    com.bykv.vk.openvk.component.video.a.e.c.a(r8, r0, r12, r9, r13)     // Catch:{ all -> 0x0154 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0154 }
                    long r7 = (long) r9     // Catch:{ all -> 0x0154 }
                    long r5 = r5 + r7
                    r9 = 0
                    goto L_0x0157
                L_0x0154:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch:{ all -> 0x0154 }
                    throw r0     // Catch:{ all -> 0x01bd }
                L_0x0157:
                    r7 = 0
                    goto L_0x0081
                L_0x015b:
                    java.lang.String r0 = "VideoCacheImpl"
                    java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = "Write segment,Write over, startIndex ="
                    r5[r2] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f17924e     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bd }
                    r5[r22] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " totalLength = "
                    r5[r21] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f17920a     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bd }
                    r5[r20] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " saveSize = "
                    r5[r19] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01bd }
                    r5[r18] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " writeEndSegment ="
                    r5[r17] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f17920a     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    long r8 = r8.f17924e     // Catch:{ all -> 0x01bd }
                    long r6 = r6 - r8
                    int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                    if (r8 != 0) goto L_0x019f
                    goto L_0x01a1
                L_0x019f:
                    r22 = 0
                L_0x01a1:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x01bd }
                    r5[r16] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " url="
                    r5[r15] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r6 = r6.j     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = r6.j()     // Catch:{ all -> 0x01bd }
                    r7 = 9
                    r5[r7] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ all -> 0x01bd }
                    goto L_0x01d0
                L_0x01bd:
                    r0 = move-exception
                    goto L_0x0204
                L_0x01bf:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0202 }
                    boolean unused = r0.f17927h = r2     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r4 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0202 }
                    long r4 = r4.f17925f     // Catch:{ all -> 0x0202 }
                    long unused = r0.f17920a = r4     // Catch:{ all -> 0x0202 }
                    r4 = r3
                L_0x01d0:
                    if (r3 == 0) goto L_0x01d5
                    r3.close()     // Catch:{ all -> 0x021d }
                L_0x01d5:
                    if (r4 == 0) goto L_0x01da
                    r4.close()     // Catch:{ all -> 0x021d }
                L_0x01da:
                    if (r26 == 0) goto L_0x01df
                    r26.close()     // Catch:{ all -> 0x021d }
                L_0x01df:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x021d }
                    if (r0 == 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    java.io.File r0 = r0.f17922c     // Catch:{ all -> 0x021d }
                    long r2 = r0.length()     // Catch:{ all -> 0x021d }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    long r4 = r0.f17920a     // Catch:{ all -> 0x021d }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    r0.f()     // Catch:{ all -> 0x021d }
                    goto L_0x0297
                L_0x0202:
                    r0 = move-exception
                    r4 = r3
                L_0x0204:
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x024f }
                    boolean unused = r5.f17927h = r2     // Catch:{ all -> 0x024f }
                    com.bykv.vk.openvk.component.video.a.a.a.c r2 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x024f }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x024f }
                    long r5 = r5.f17925f     // Catch:{ all -> 0x024f }
                    long unused = r2.f17920a = r5     // Catch:{ all -> 0x024f }
                    r0.printStackTrace()     // Catch:{ all -> 0x024f }
                    if (r3 == 0) goto L_0x021f
                    r3.close()     // Catch:{ all -> 0x021d }
                    goto L_0x021f
                L_0x021d:
                    r0 = move-exception
                    goto L_0x024b
                L_0x021f:
                    if (r4 == 0) goto L_0x0224
                    r4.close()     // Catch:{ all -> 0x021d }
                L_0x0224:
                    if (r26 == 0) goto L_0x0229
                    r26.close()     // Catch:{ all -> 0x021d }
                L_0x0229:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x021d }
                    if (r0 == 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    java.io.File r0 = r0.f17922c     // Catch:{ all -> 0x021d }
                    long r2 = r0.length()     // Catch:{ all -> 0x021d }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    long r4 = r0.f17920a     // Catch:{ all -> 0x021d }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x021d }
                    r0.f()     // Catch:{ all -> 0x021d }
                    goto L_0x0297
                L_0x024b:
                    r0.printStackTrace()
                    goto L_0x0297
                L_0x024f:
                    r0 = move-exception
                    r2 = r0
                    if (r3 == 0) goto L_0x0259
                    r3.close()     // Catch:{ all -> 0x0257 }
                    goto L_0x0259
                L_0x0257:
                    r0 = move-exception
                    goto L_0x0285
                L_0x0259:
                    if (r4 == 0) goto L_0x025e
                    r4.close()     // Catch:{ all -> 0x0257 }
                L_0x025e:
                    if (r26 == 0) goto L_0x0263
                    r26.close()     // Catch:{ all -> 0x0257 }
                L_0x0263:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0257 }
                    boolean r0 = r0.f17927h     // Catch:{ all -> 0x0257 }
                    if (r0 == 0) goto L_0x0288
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0257 }
                    java.io.File r0 = r0.f17922c     // Catch:{ all -> 0x0257 }
                    long r3 = r0.length()     // Catch:{ all -> 0x0257 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0257 }
                    long r5 = r0.f17920a     // Catch:{ all -> 0x0257 }
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 != 0) goto L_0x0288
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this     // Catch:{ all -> 0x0257 }
                    r0.f()     // Catch:{ all -> 0x0257 }
                    goto L_0x0288
                L_0x0285:
                    r0.printStackTrace()
                L_0x0288:
                    throw r2
                L_0x0289:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this
                    boolean unused = r0.f17927h = r2
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.vk.openvk.component.video.a.a.a.c.this
                    long r2 = r0.f17925f
                    long unused = r0.f17920a = r2
                L_0x0297:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.a.a.c.AnonymousClass1.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    public int a(long j2, byte[] bArr, int i2, int i3) throws IOException {
        long j3 = j2;
        try {
            if (j3 == this.f17920a) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            while (!this.f17926g) {
                synchronized (this.f17921b) {
                    long e2 = e();
                    if (j3 < e2) {
                        com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "read:  read " + j3 + " success");
                        this.i.seek(j3);
                        i5 = this.i.read(bArr, i2, i3);
                    } else {
                        byte[] bArr2 = bArr;
                        int i6 = i2;
                        int i7 = i3;
                        com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "read: wait at ", Long.valueOf(j2), "  file size = ", Long.valueOf(e2));
                        i4 += 33;
                        this.f17921b.wait(33);
                    }
                }
                if (i5 > 0) {
                    return i5;
                }
                if (i4 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    public void a() {
        try {
            if (!this.f17926g) {
                this.i.close();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f17926g = true;
        return;
    }

    private long e() {
        if (d()) {
            return this.f17923d.length();
        }
        return this.f17922c.length();
    }

    /* access modifiers changed from: private */
    public void f() throws IOException {
        synchronized (this.f17921b) {
            if (d()) {
                com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "complete: isCompleted ", this.j.j(), this.j.k());
                return;
            }
            try {
                if (this.f17922c.renameTo(this.f17923d)) {
                    if (this.i != null) {
                        this.i.close();
                    }
                    this.i = new RandomAccessFile(this.f17923d, "rw");
                    com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "complete: rename ", this.j.k(), this.j.j());
                    return;
                }
                throw new IOException("Error renaming file " + this.f17922c + " to " + this.f17923d + " for completion!");
            } catch (Throwable th) {
                th.printStackTrace();
                com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", th.getMessage());
            }
        }
    }

    public long b() throws IOException {
        if (d()) {
            this.f17920a = this.f17923d.length();
        } else {
            synchronized (this.f17921b) {
                int i2 = 0;
                do {
                    if (this.f17920a == -2147483648L) {
                        try {
                            com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "totalLength: wait");
                            i2 += 15;
                            this.f17921b.wait(5);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i2 <= 20000);
                return -1;
            }
        }
        com.bykv.vk.openvk.component.video.api.f.c.b("VideoCacheImpl", "totalLength= ", Long.valueOf(this.f17920a));
        return this.f17920a;
    }
}
