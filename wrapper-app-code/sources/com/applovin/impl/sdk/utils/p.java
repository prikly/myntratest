package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import java.util.Timer;
import java.util.TimerTask;

public class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f15932a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Timer f15933b;

    /* renamed from: c  reason: collision with root package name */
    private long f15934c;

    /* renamed from: d  reason: collision with root package name */
    private long f15935d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f15936e;

    /* renamed from: f  reason: collision with root package name */
    private long f15937f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f15938g = new Object();

    private p(n nVar, Runnable runnable) {
        this.f15932a = nVar;
        this.f15936e = runnable;
    }

    public static p a(long j, n nVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            p pVar = new p(nVar, runnable);
            pVar.f15934c = System.currentTimeMillis();
            pVar.f15935d = j;
            try {
                Timer timer = new Timer();
                pVar.f15933b = timer;
                timer.schedule(pVar.e(), j);
            } catch (OutOfMemoryError e2) {
                nVar.D();
                if (v.a()) {
                    nVar.D().b("Timer", "Failed to create timer due to OOM error", e2);
                }
            }
            return pVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    private TimerTask e() {
        return new TimerTask() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x001b }
                    java.lang.Runnable r1 = r1.f15936e     // Catch:{ all -> 0x001b }
                    r1.run()     // Catch:{ all -> 0x001b }
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.p.this
                    java.lang.Object r1 = r1.f15938g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0018 }
                    java.util.Timer unused = r2.f15933b = r0     // Catch:{ all -> 0x0018 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    goto L_0x0060
                L_0x0018:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    throw r0
                L_0x001b:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f15932a     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f15932a     // Catch:{ all -> 0x0064 }
                    r2.D()     // Catch:{ all -> 0x0064 }
                    boolean r2 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f15932a     // Catch:{ all -> 0x0064 }
                    r2.D()     // Catch:{ all -> 0x0064 }
                    boolean r2 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f15932a     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.v r2 = r2.D()     // Catch:{ all -> 0x0064 }
                    java.lang.String r3 = "Timer"
                    java.lang.String r4 = "Encountered error while executing timed task"
                    r2.b(r3, r4, r1)     // Catch:{ all -> 0x0064 }
                L_0x0053:
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.p.this
                    java.lang.Object r1 = r1.f15938g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0061 }
                    java.util.Timer unused = r2.f15933b = r0     // Catch:{ all -> 0x0061 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0061 }
                L_0x0060:
                    return
                L_0x0061:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0061 }
                    throw r0
                L_0x0064:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.p.this
                    java.lang.Object r2 = r2.f15938g
                    monitor-enter(r2)
                    com.applovin.impl.sdk.utils.p r3 = com.applovin.impl.sdk.utils.p.this     // Catch:{ all -> 0x0073 }
                    java.util.Timer unused = r3.f15933b = r0     // Catch:{ all -> 0x0073 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                    throw r1
                L_0x0073:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.p.AnonymousClass1.run():void");
            }
        };
    }

    public long a() {
        if (this.f15933b == null) {
            return this.f15935d - this.f15937f;
        }
        return this.f15935d - (System.currentTimeMillis() - this.f15934c);
    }

    public void b() {
        synchronized (this.f15938g) {
            if (this.f15933b != null) {
                try {
                    this.f15933b.cancel();
                    this.f15937f = Math.max(1, System.currentTimeMillis() - this.f15934c);
                } catch (Throwable th) {
                    this.f15933b = null;
                    throw th;
                }
                this.f15933b = null;
            }
        }
    }

    public void c() {
        synchronized (this.f15938g) {
            if (this.f15937f > 0) {
                try {
                    long j = this.f15935d - this.f15937f;
                    this.f15935d = j;
                    if (j < 0) {
                        this.f15935d = 0;
                    }
                    Timer timer = new Timer();
                    this.f15933b = timer;
                    timer.schedule(e(), this.f15935d);
                    this.f15934c = System.currentTimeMillis();
                } catch (Throwable th) {
                    this.f15937f = 0;
                    throw th;
                }
                this.f15937f = 0;
            }
        }
    }

    public void d() {
        synchronized (this.f15938g) {
            if (this.f15933b != null) {
                try {
                    this.f15933b.cancel();
                    this.f15933b = null;
                } catch (Throwable th) {
                    this.f15933b = null;
                    this.f15937f = 0;
                    throw th;
                }
                this.f15937f = 0;
            }
        }
    }
}
