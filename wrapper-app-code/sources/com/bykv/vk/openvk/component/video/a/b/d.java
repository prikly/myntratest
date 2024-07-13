package com.bykv.vk.openvk.component.video.a.b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.a.b.b;
import com.bykv.vk.openvk.component.video.a.b.b.c;
import com.bytedance.sdk.component.f.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Preloader */
public class d {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f17992e;

    /* renamed from: a  reason: collision with root package name */
    private volatile int f17993a = 163840;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Map<String, b>> f17994b = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b<Runnable> f17995c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f17996d;

    /* renamed from: f  reason: collision with root package name */
    private volatile c f17997f;

    /* renamed from: g  reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.a.b.a.c f17998g;

    /* renamed from: h  reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.a.b.a.b f17999h;
    private final HashSet<a> i = new HashSet<>();
    private final b.C0215b j = new b.C0215b() {
        public void a(b bVar) {
            int f2 = bVar.f();
            synchronized (d.this.f17994b) {
                Map map = (Map) d.this.f17994b.get(f2);
                if (map != null) {
                    map.remove(bVar.f17946h);
                }
            }
            if (e.f18017c) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + bVar.f17946h);
            }
        }
    };
    private volatile c k;
    private volatile c l;
    private volatile String m;
    private volatile boolean n;

    /* access modifiers changed from: package-private */
    public void a(com.bykv.vk.openvk.component.video.a.b.a.c cVar) {
        this.f17998g = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f17997f = cVar;
    }

    public void a(int i2) {
        if (i2 > 0) {
            this.f17993a = i2;
        }
        if (e.f18017c) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + i2);
        }
    }

    private d() {
        b<Runnable> bVar = new b<>();
        this.f17995c = bVar;
        ExecutorService a2 = a(bVar);
        this.f17996d = a2;
        this.f17995c.a((ThreadPoolExecutor) a2);
        this.f17994b.put(0, new HashMap());
        this.f17994b.put(1, new HashMap());
    }

    public synchronized void a(long j2, long j3, long j4) {
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return this.l;
    }

    public static d c() {
        if (f17992e == null) {
            synchronized (d.class) {
                if (f17992e == null) {
                    f17992e = new d();
                }
            }
        }
        return f17992e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.bykv.vk.openvk.component.video.a.b.b} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.m = r9
            r7.n = r8
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x001e:
            r0 = 0
            if (r9 != 0) goto L_0x007b
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.i
            monitor-enter(r1)
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.i     // Catch:{ all -> 0x0078 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x0038
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.i     // Catch:{ all -> 0x0078 }
            r0.<init>(r8)     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.i     // Catch:{ all -> 0x0078 }
            r8.clear()     // Catch:{ all -> 0x0078 }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x003f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.d$a r9 = (com.bykv.vk.openvk.component.video.a.b.d.a) r9
            boolean r1 = r9.f18008a
            boolean r2 = r9.f18009b
            int r3 = r9.f18010c
            java.lang.String r4 = r9.f18011d
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f18012e
            java.lang.String[] r6 = r9.f18013f
            r0 = r7
            r0.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, resume preload: "
            r1.append(r2)
            java.lang.String r9 = r9.f18011d
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.i(r0, r9)
            goto L_0x003f
        L_0x0078:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r8
        L_0x007b:
            int r1 = com.bykv.vk.openvk.component.video.a.b.e.f18022h
            r2 = 3
            if (r1 == r2) goto L_0x00aa
            r3 = 2
            if (r1 != r3) goto L_0x0084
            goto L_0x00aa
        L_0x0084:
            r2 = 1
            if (r1 != r2) goto L_0x0141
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r1 = r7.f17994b
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r7.f17994b     // Catch:{ all -> 0x00a7 }
            int r8 = com.bykv.vk.openvk.component.video.a.b.b.b.a(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x00a7 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x009f
            java.lang.Object r8 = r8.remove(r9)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.vk.openvk.component.video.a.b.b) r0     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0141
            r0.a()
            goto L_0x0141
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r8
        L_0x00aa:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r8 = r7.f17994b
            monitor-enter(r8)
            r9 = 0
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r3 = r7.f17994b     // Catch:{ all -> 0x0142 }
            int r3 = r3.size()     // Catch:{ all -> 0x0142 }
        L_0x00b4:
            if (r9 >= r3) goto L_0x00e2
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r4 = r7.f17994b     // Catch:{ all -> 0x0142 }
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r5 = r7.f17994b     // Catch:{ all -> 0x0142 }
            int r5 = r5.keyAt(r9)     // Catch:{ all -> 0x0142 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0142 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x00df
            java.util.Collection r5 = r4.values()     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00dc
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r6 != 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00d9
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
        L_0x00d9:
            r0.addAll(r5)     // Catch:{ all -> 0x0142 }
        L_0x00dc:
            r4.clear()     // Catch:{ all -> 0x0142 }
        L_0x00df:
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00e2:
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0141
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x00ef:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x011b
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.b r9 = (com.bykv.vk.openvk.component.video.a.b.b) r9
            r9.a()
            boolean r3 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r3 == 0) goto L_0x00ef
            java.lang.String r3 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setCurrentPlayKey, cancel preload: "
            r4.append(r5)
            java.lang.String r9 = r9.f17945g
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.i(r3, r9)
            goto L_0x00ef
        L_0x011b:
            if (r1 != r2) goto L_0x0141
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.i
            monitor-enter(r8)
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x0124:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.vk.openvk.component.video.a.b.b) r0     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r0.n     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.d$a r0 = (com.bykv.vk.openvk.component.video.a.b.d.a) r0     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0124
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.i     // Catch:{ all -> 0x013e }
            r1.add(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0124
        L_0x013c:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            goto L_0x0141
        L_0x013e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            throw r9
        L_0x0141:
            return
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.d.a(boolean, java.lang.String):void");
    }

    public void a(boolean z, boolean z2, int i2, String str, String... strArr) {
        a(z, z2, i2, str, (Map<String, String>) null, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0154, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r19, boolean r20, int r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.lang.String... r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r9 = r22
            r10 = r24
            boolean r2 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = "TAG_PROXY_Preloader"
            java.lang.String r3 = "preload start ！！！！"
            android.util.Log.d(r2, r3)
        L_0x0013:
            if (r0 == 0) goto L_0x0018
            com.bykv.vk.openvk.component.video.a.b.a.b r2 = r1.f17999h
            goto L_0x001a
        L_0x0018:
            com.bykv.vk.openvk.component.video.a.b.a.c r2 = r1.f17998g
        L_0x001a:
            r11 = r2
            com.bykv.vk.openvk.component.video.a.b.b.c r12 = r1.f17997f
            if (r11 == 0) goto L_0x01d1
            if (r12 != 0) goto L_0x0023
            goto L_0x01d1
        L_0x0023:
            boolean r2 = android.text.TextUtils.isEmpty(r22)
            if (r2 != 0) goto L_0x01d0
            if (r10 == 0) goto L_0x01d0
            int r2 = r10.length
            if (r2 > 0) goto L_0x0030
            goto L_0x01d0
        L_0x0030:
            if (r21 > 0) goto L_0x0036
            int r2 = r1.f17993a
            r13 = r2
            goto L_0x0038
        L_0x0036:
            r13 = r21
        L_0x0038:
            if (r20 == 0) goto L_0x003c
            r14 = r9
            goto L_0x0041
        L_0x003c:
            java.lang.String r2 = com.bykv.vk.openvk.component.video.api.f.b.a((java.lang.String) r22)
            r14 = r2
        L_0x0041:
            java.io.File r2 = r11.d(r14)
            if (r2 == 0) goto L_0x0077
            long r3 = r2.length()
            long r5 = (long) r13
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0077
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no need preload, file size: "
            r3.append(r4)
            long r4 = r2.length()
            r3.append(r4)
            java.lang.String r2 = ", need preload size: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r0, r2)
        L_0x0076:
            return
        L_0x0077:
            com.bykv.vk.openvk.component.video.a.b.f r2 = com.bykv.vk.openvk.component.video.a.b.f.a()
            int r3 = com.bykv.vk.openvk.component.video.a.b.b.b.a(r19)
            boolean r2 = r2.a((int) r3, (java.lang.String) r14)
            if (r2 == 0) goto L_0x00a0
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "has running proxy task, skip preload for key: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L_0x009f:
            return
        L_0x00a0:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r15 = r1.f17994b
            monitor-enter(r15)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r1.f17994b     // Catch:{ all -> 0x01cd }
            r16 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00ac
            r3 = 1
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01cd }
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x01cd }
            boolean r2 = r7.containsKey(r14)     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x00bc
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x00bc:
            com.bykv.vk.openvk.component.video.a.b.d$a r6 = new com.bykv.vk.openvk.component.video.a.b.d$a     // Catch:{ all -> 0x01cd }
            r2 = r6
            r3 = r19
            r4 = r20
            r5 = r13
            r10 = r6
            r6 = r22
            r17 = r7
            r7 = r23
            r21 = r13
            r13 = 1
            r8 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r1.m     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x0155
            int r3 = com.bykv.vk.openvk.component.video.a.b.e.f18022h     // Catch:{ all -> 0x01cd }
            r4 = 3
            if (r3 != r4) goto L_0x0109
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r2 = r1.i     // Catch:{ all -> 0x01cd }
            monitor-enter(r2)     // Catch:{ all -> 0x01cd }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r0 = r1.i     // Catch:{ all -> 0x0106 }
            r0.add(r10)     // Catch:{ all -> 0x0106 }
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = ", add to pending queue"
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0104:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x0109:
            r4 = 2
            if (r3 != r4) goto L_0x0128
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0126:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0128:
            if (r3 != r13) goto L_0x0155
            boolean r3 = r1.n     // Catch:{ all -> 0x01cd }
            if (r3 != r0) goto L_0x0155
            boolean r0 = r2.equals(r14)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0155
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = ", it is playing"
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0153:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0155:
            r0 = 0
            java.util.List r2 = com.bykv.vk.openvk.component.video.a.c.a.a((java.util.Map<java.lang.String, java.lang.String>) r23)     // Catch:{ all -> 0x01cd }
            java.util.List r2 = com.bykv.vk.openvk.component.video.a.c.a.a((java.util.List<com.bykv.vk.openvk.component.video.a.b.i.b>) r2)     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x0187
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cd }
            int r3 = r2.size()     // Catch:{ all -> 0x01cd }
            r0.<init>(r3)     // Catch:{ all -> 0x01cd }
            int r3 = r2.size()     // Catch:{ all -> 0x01cd }
            r4 = 0
        L_0x016e:
            if (r4 >= r3) goto L_0x0187
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.i$b r5 = (com.bykv.vk.openvk.component.video.a.b.i.b) r5     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.i$b r6 = new com.bykv.vk.openvk.component.video.a.b.i$b     // Catch:{ all -> 0x01cd }
            java.lang.String r7 = r5.f18084a     // Catch:{ all -> 0x01cd }
            java.lang.String r5 = r5.f18085b     // Catch:{ all -> 0x01cd }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x01cd }
            r0.add(r6)     // Catch:{ all -> 0x01cd }
        L_0x0184:
            int r4 = r4 + 1
            goto L_0x016e
        L_0x0187:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.a.a) r11)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.b.c) r12)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((java.lang.String) r9)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.b(r14)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l     // Catch:{ all -> 0x01cd }
            java.util.List r4 = com.bykv.vk.openvk.component.video.a.c.a.a((java.lang.String[]) r24)     // Catch:{ all -> 0x01cd }
            r3.<init>((java.util.List<java.lang.String>) r4)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.l) r3)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r2.a((java.util.List<com.bykv.vk.openvk.component.video.a.b.i.b>) r0)     // Catch:{ all -> 0x01cd }
            r2 = r21
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.a((int) r2)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$b r2 = r1.j     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.a((com.bykv.vk.openvk.component.video.a.b.b.C0215b) r2)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.a((java.lang.Object) r10)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b r0 = r0.a()     // Catch:{ all -> 0x01cd }
            r2 = r17
            r2.put(r14, r0)     // Catch:{ all -> 0x01cd }
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            java.util.concurrent.ExecutorService r2 = r1.f17996d
            r2.execute(r0)
            return
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            throw r0
        L_0x01d0:
            return
        L_0x01d1:
            boolean r0 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cache or videoProxyDB null in Preloader!!!"
            android.util.Log.e(r0, r2)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.d.a(boolean, boolean, int, java.lang.String, java.util.Map, java.lang.String[]):void");
    }

    public void a(String str) {
        a(false, false, str);
    }

    public void a(boolean z, boolean z2, String str) {
        if (!TextUtils.isEmpty(str)) {
            final boolean z3 = z;
            final boolean z4 = z2;
            final String str2 = str;
            com.bykv.vk.openvk.component.video.a.c.a.a((g) new g("cancel b b S") {
                public void run() {
                    b bVar;
                    synchronized (d.this.f17994b) {
                        Map map = (Map) d.this.f17994b.get(com.bykv.vk.openvk.component.video.a.b.b.b.a(z3));
                        if (map != null) {
                            bVar = (b) map.remove(z4 ? str2 : com.bykv.vk.openvk.component.video.api.f.b.a(str2));
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar.a();
                    }
                }
            });
        }
    }

    public void d() {
        com.bykv.vk.openvk.component.video.a.c.a.a((g) new g("cancelAll") {
            public void run() {
                ArrayList<b> arrayList = new ArrayList<>();
                synchronized (d.this.f17994b) {
                    int size = d.this.f17994b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) d.this.f17994b.get(d.this.f17994b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    d.this.f17995c.clear();
                }
                for (b bVar : arrayList) {
                    bVar.a();
                    if (e.f18017c) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + bVar + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* compiled from: Preloader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final boolean f18008a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f18009b;

        /* renamed from: c  reason: collision with root package name */
        final int f18010c;

        /* renamed from: d  reason: collision with root package name */
        final String f18011d;

        /* renamed from: e  reason: collision with root package name */
        final Map<String, String> f18012e;

        /* renamed from: f  reason: collision with root package name */
        final String[] f18013f;

        a(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.f18008a = z;
            this.f18009b = z2;
            this.f18010c = i;
            this.f18011d = str;
            this.f18012e = map;
            this.f18013f = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f18008a == aVar.f18008a && this.f18009b == aVar.f18009b && this.f18010c == aVar.f18010c) {
                return this.f18011d.equals(aVar.f18011d);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f18008a ? 1 : 0) * true) + (this.f18009b ? 1 : 0)) * 31) + this.f18010c) * 31) + this.f18011d.hashCode();
        }
    }

    /* compiled from: Preloader */
    private static final class b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a  reason: collision with root package name */
        private ThreadPoolExecutor f18014a;

        private b() {
        }

        public void a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f18014a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.f18014a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f18014a     // Catch:{ all -> 0x002b }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f18014a     // Catch:{ all -> 0x002b }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f18014a     // Catch:{ all -> 0x002b }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x002b }
                if (r1 < r0) goto L_0x0025
                if (r0 >= r2) goto L_0x0025
                boolean r4 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x002b }
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                android.util.Log.i(r4, r0)     // Catch:{ all -> 0x002b }
            L_0x0022:
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                return r4
            L_0x0025:
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x002b:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.d.b.offer(java.lang.Object):boolean");
        }
    }

    private static ExecutorService a(final b<Runnable> bVar) {
        int a2 = com.bykv.vk.openvk.component.video.a.c.a.a();
        return new ThreadPoolExecutor(0, a2 < 1 ? 1 : a2 > 4 ? 4 : a2, 60, TimeUnit.SECONDS, bVar, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                AnonymousClass1 r0 = new Thread(runnable) {
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        super.run();
                    }
                };
                r0.setName("tt_pangle_thread_video_preload_" + r0.getId());
                r0.setDaemon(true);
                if (e.f18017c) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + r0.getName());
                }
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    bVar.offerFirst(runnable);
                    if (e.f18017c) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
