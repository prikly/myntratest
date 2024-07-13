package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.v;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f15462a = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f15463b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f15464c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f15465d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15466e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f15467f = new ArrayList(5);

    /* renamed from: g  reason: collision with root package name */
    private final Object f15468g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f15469h;

    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_APP_OPEN,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    private class b implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final String f15481b;

        b(String str) {
            this.f15481b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f15481b + ":" + Utils.shortenKey(o.this.f15463b.C()));
            thread.setDaemon(true);
            thread.setPriority(((Integer) o.this.f15463b.a(com.applovin.impl.sdk.c.b.fr)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    v unused = o.this.f15464c;
                    if (v.a()) {
                        o.this.f15464c.b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    private static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f15483a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15484b;

        /* renamed from: c  reason: collision with root package name */
        private final v f15485c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final a f15486d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final a f15487e;

        c(n nVar, a aVar, a aVar2) {
            this.f15483a = nVar;
            this.f15485c = nVar.D();
            this.f15484b = aVar.e();
            this.f15486d = aVar;
            this.f15487e = aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.h.a()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.n r1 = r6.f15483a     // Catch:{ all -> 0x004a }
                boolean r1 = r1.c()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0035
                com.applovin.impl.sdk.e.a r1 = r6.f15486d     // Catch:{ all -> 0x004a }
                boolean r1 = r1.g()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0016
                goto L_0x0035
            L_0x0016:
                boolean r1 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0025
                com.applovin.impl.sdk.v r1 = r6.f15485c     // Catch:{ all -> 0x004a }
                java.lang.String r2 = r6.f15484b     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "Task re-scheduled..."
                r1.c(r2, r3)     // Catch:{ all -> 0x004a }
            L_0x0025:
                com.applovin.impl.sdk.n r1 = r6.f15483a     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o r1 = r1.V()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.a r2 = r6.f15486d     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o$a r3 = r6.f15487e     // Catch:{ all -> 0x004a }
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a((com.applovin.impl.sdk.e.a) r2, (com.applovin.impl.sdk.e.o.a) r3, (long) r4)     // Catch:{ all -> 0x004a }
                goto L_0x003a
            L_0x0035:
                com.applovin.impl.sdk.e.a r1 = r6.f15486d     // Catch:{ all -> 0x004a }
                r1.run()     // Catch:{ all -> 0x004a }
            L_0x003a:
                boolean r1 = com.applovin.impl.sdk.v.a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f15485c
                java.lang.String r2 = r6.f15484b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x0069
            L_0x004a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0082 }
                if (r2 == 0) goto L_0x005a
                com.applovin.impl.sdk.v r2 = r6.f15485c     // Catch:{ all -> 0x0082 }
                java.lang.String r3 = r6.f15484b     // Catch:{ all -> 0x0082 }
                java.lang.String r4 = "Task failed execution"
                r2.b(r3, r4, r1)     // Catch:{ all -> 0x0082 }
            L_0x005a:
                boolean r1 = com.applovin.impl.sdk.v.a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f15485c
                java.lang.String r2 = r6.f15484b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x0069:
                com.applovin.impl.sdk.e.o$a r4 = r6.f15487e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f15486d
                java.lang.String r0 = r0.e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.c(r2, r0)
            L_0x0081:
                return
            L_0x0082:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.v.a()
                if (r2 == 0) goto L_0x00aa
                com.applovin.impl.sdk.v r2 = r6.f15485c
                java.lang.String r3 = r6.f15484b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f15487e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f15486d
                java.lang.String r0 = r0.e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.c(r3, r0)
            L_0x00aa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.o.c.run():void");
        }
    }

    public o(n nVar) {
        this.f15463b = nVar;
        this.f15464c = nVar.D();
        this.f15465d = a("auxiliary_operations", ((Integer) nVar.a(com.applovin.impl.sdk.c.b.cl)).intValue());
        this.f15466e = a("shared_thread_pool", ((Integer) nVar.a(com.applovin.impl.sdk.c.b.ap)).intValue());
    }

    private ScheduledThreadPoolExecutor a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new b(str));
    }

    private void a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.f15466e.submit(runnable);
        } else if (z) {
            f.a(j, this.f15463b, new Runnable() {
                public void run() {
                    o.this.f15466e.execute(runnable);
                }
            });
        } else {
            this.f15466e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(c cVar) {
        if (cVar.f15486d.g()) {
            return false;
        }
        synchronized (this.f15468g) {
            if (this.f15469h) {
                return false;
            }
            this.f15467f.add(cVar);
            return true;
        }
    }

    public void a(a aVar) {
        if (aVar != null) {
            try {
                if (!Utils.isMainThread() || !((Boolean) this.f15463b.a(com.applovin.impl.sdk.c.b.fq)).booleanValue()) {
                    aVar.run();
                } else {
                    this.f15466e.submit(aVar);
                }
            } catch (Throwable th) {
                if (v.a()) {
                    this.f15464c.b(aVar.e(), "Task failed execution", th);
                }
            }
        } else if (v.a()) {
            this.f15464c.e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    public void a(a aVar, a aVar2) {
        a(aVar, aVar2, 0);
    }

    public void a(a aVar, a aVar2, long j) {
        a(aVar, aVar2, j, false);
    }

    public void a(a aVar, a aVar2, long j, boolean z) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        } else if (!a(new c(this.f15463b, aVar, aVar2))) {
            a((Runnable) aVar, j, z);
        } else if (v.a()) {
            this.f15464c.c(aVar.e(), "Task execution delayed until after init");
        }
    }

    public void a(Runnable runnable) {
        this.f15465d.submit(runnable);
    }

    public boolean a() {
        return this.f15469h;
    }

    public Executor b() {
        return this.f15466e;
    }

    public ExecutorService c() {
        return f15462a;
    }

    public void d() {
        synchronized (this.f15468g) {
            this.f15469h = false;
        }
    }

    public void e() {
        synchronized (this.f15468g) {
            this.f15469h = true;
            for (c next : this.f15467f) {
                a(next.f15486d, next.f15487e);
            }
            this.f15467f.clear();
        }
    }
}
