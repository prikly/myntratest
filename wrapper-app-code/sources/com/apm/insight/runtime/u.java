package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class u {

    /* renamed from: a  reason: collision with root package name */
    static final b<d, Runnable> f10911a = new b<d, Runnable>() {
    };

    /* renamed from: b  reason: collision with root package name */
    static final b<Message, Runnable> f10912b = new b<Message, Runnable>() {
    };

    /* renamed from: c  reason: collision with root package name */
    private final HandlerThread f10913c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Queue<d> f10914d = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Queue<Message> f10915e = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile Handler f10916f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f10917g = new Object();

    class a implements Runnable {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            while (!u.this.f10914d.isEmpty()) {
                d dVar = (d) u.this.f10914d.poll();
                if (u.this.f10916f != null) {
                    try {
                        u.this.f10916f.sendMessageAtTime(dVar.f10922a, dVar.f10923b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            while (!u.this.f10915e.isEmpty()) {
                if (u.this.f10916f != null) {
                    try {
                        u.this.f10916f.sendMessageAtFrontOfQueue((Message) u.this.f10915e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void run() {
            b();
            a();
        }
    }

    public interface b<A, B> {
    }

    class c extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        volatile int f10919a = 0;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f10920b = false;

        c(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.apm.insight.b.g.a(com.apm.insight.h.g()).a().c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            if (r4.f10919a < 5) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            com.apm.insight.b.a().a("NPTH_CATCH", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r4.f10920b == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r4.f10920b = true;
            com.apm.insight.b.a().a("NPTH_ERR_MAX", (java.lang.Throwable) new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4.f10919a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r4 = this;
                super.onLooperPrepared()
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.u.this
                java.lang.Object r0 = r0.f10917g
                monitor-enter(r0)
                com.apm.insight.runtime.u r1 = com.apm.insight.runtime.u.this     // Catch:{ all -> 0x0063 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0063 }
                r2.<init>()     // Catch:{ all -> 0x0063 }
                android.os.Handler unused = r1.f10916f = r2     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.u.this
                android.os.Handler r0 = r0.f10916f
                com.apm.insight.runtime.u$a r1 = new com.apm.insight.runtime.u$a
                com.apm.insight.runtime.u r2 = com.apm.insight.runtime.u.this
                r1.<init>()
                r0.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                android.content.Context r1 = com.apm.insight.h.g()     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.g r1 = com.apm.insight.b.g.a(r1)     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.b r1 = r1.a()     // Catch:{ all -> 0x0025 }
                r1.c()     // Catch:{ all -> 0x0025 }
                int r1 = r4.f10919a     // Catch:{ all -> 0x0025 }
                r2 = 5
                r3 = 1
                if (r1 >= r2) goto L_0x0049
                com.apm.insight.c r1 = com.apm.insight.b.a()     // Catch:{ all -> 0x0025 }
                java.lang.String r2 = "NPTH_CATCH"
                r1.a((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0025 }
                goto L_0x005d
            L_0x0049:
                boolean r0 = r4.f10920b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x005d
                r4.f10920b = r3     // Catch:{ all -> 0x0025 }
                com.apm.insight.c r0 = com.apm.insight.b.a()     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                r0.a((java.lang.String) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0025 }
            L_0x005d:
                int r0 = r4.f10919a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r3
                r4.f10919a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.u.c.onLooperPrepared():void");
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        Message f10922a;

        /* renamed from: b  reason: collision with root package name */
        long f10923b;

        d(Message message, long j) {
            this.f10922a = message;
            this.f10923b = j;
        }
    }

    public u(String str) {
        this.f10913c = new c(str);
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f10916f, runnable);
    }

    public Handler a() {
        return this.f10916f;
    }

    public final boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    public void b() {
        this.f10913c.start();
    }

    public final boolean b(Message message, long j) {
        if (this.f10916f == null) {
            synchronized (this.f10917g) {
                if (this.f10916f == null) {
                    this.f10914d.add(new d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f10916f.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public HandlerThread c() {
        return this.f10913c;
    }
}
