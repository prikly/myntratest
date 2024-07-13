package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.c;
import java.util.Timer;
import java.util.TimerTask;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    ae f8456a;

    /* renamed from: b  reason: collision with root package name */
    private c f8457b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f8458c = null;

    public ad(c cVar, ae aeVar) {
        this.f8457b = cVar;
        this.f8456a = aeVar;
    }

    private void e() {
        Timer timer = this.f8458c;
        if (timer != null) {
            timer.cancel();
            this.f8458c = null;
        }
    }

    public final synchronized void a() {
        if (this.f8457b.m) {
            e();
            Timer timer = new Timer();
            this.f8458c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    ad.this.f8456a.d();
                }
            }, this.f8457b.k);
        }
    }

    public final synchronized void b() {
        if (!this.f8457b.m) {
            e();
            Timer timer = new Timer();
            this.f8458c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    ad.this.f8456a.d();
                }
            }, this.f8457b.k);
        }
    }

    public final void c() {
        synchronized (this) {
            e();
        }
        this.f8456a.d();
    }

    public final synchronized void d() {
        e();
        Timer timer = new Timer();
        this.f8458c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                ad.this.f8456a.d();
            }
        }, this.f8457b.j);
    }
}
