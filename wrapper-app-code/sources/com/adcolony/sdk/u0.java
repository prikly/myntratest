package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f10327a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ScheduledFuture<?> f10328b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture<?> f10329c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final t0 f10330d;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ScheduledFuture unused = u0.this.f10328b = null;
            u0.this.e();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (u0.this.f10330d.g()) {
                a.b().r().i();
                ScheduledFuture unused = u0.this.f10329c = null;
            }
        }
    }

    u0(t0 t0Var) {
        this.f10330d = t0Var;
    }

    private void d() {
        if (this.f10328b == null) {
            try {
                this.f10328b = this.f10327a.schedule(new a(), this.f10330d.a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("RejectedExecutionException when scheduling session stop ").a(e2.toString()).a(e0.i);
            }
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        new e0.a().a("AdColony session ending, releasing Context.").a(e0.f10041d);
        a.b().c(true);
        a.a((Context) null);
        this.f10330d.f(true);
        this.f10330d.g(true);
        this.f10330d.j();
        if (a.b().r().f()) {
            ScheduledFuture<?> scheduledFuture = this.f10329c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f10329c.cancel(false);
            }
            try {
                this.f10329c = this.f10327a.schedule(new b(), 10, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("RejectedExecutionException when scheduling message pumping stop ").a(e2.toString()).a(e0.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a();
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f10328b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f10328b.cancel(false);
            this.f10328b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        d();
    }
}
