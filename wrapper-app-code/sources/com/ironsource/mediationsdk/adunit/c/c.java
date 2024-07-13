package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.ae;
import java.util.Timer;
import java.util.TimerTask;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    a f8502a;

    /* renamed from: b  reason: collision with root package name */
    ae f8503b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f8504c;

    public c(a aVar, ae aeVar) {
        this.f8502a = aVar;
        this.f8503b = aeVar;
    }

    private void c() {
        Timer timer = this.f8504c;
        if (timer != null) {
            timer.cancel();
            this.f8504c = null;
        }
    }

    public final void a() {
        if (this.f8502a.f8494a != a.C0085a.MANUAL) {
            a(this.f8502a.f8496c);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        c();
        Timer timer = new Timer();
        this.f8504c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                c.this.f8503b.d();
            }
        }, j);
    }

    public final void b() {
        if (this.f8502a.f8494a != a.C0085a.MANUAL) {
            a(0);
        }
    }
}
