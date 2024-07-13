package com.bytedance.sdk.openadsdk.j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashMonitor */
public class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ScheduledExecutorService f2017a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public g f2018b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f2019c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f2020d;

    /* compiled from: CrashMonitor */
    public interface a {
        void a();
    }

    public b(g gVar) {
        this.f2018b = gVar;
    }

    public void a(long j) {
        this.f2019c = j;
    }

    public void a(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f2017a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                if (System.currentTimeMillis() - b.this.f2019c > 2000) {
                    b.this.f2017a.shutdown();
                    if (b.this.f2018b != null) {
                        b.this.f2018b.t();
                    }
                    if (b.this.f2020d != null) {
                        b.this.f2020d.a();
                    }
                }
            }
        }, 0, (long) i, TimeUnit.MILLISECONDS);
    }

    public void a() {
        ScheduledExecutorService scheduledExecutorService = this.f2017a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
