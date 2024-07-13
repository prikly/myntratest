package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    Runnable f8118a;

    /* renamed from: b  reason: collision with root package name */
    private String f8119b = "INTERNAL";

    /* renamed from: c  reason: collision with root package name */
    private Timer f8120c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8121d;

    /* renamed from: e  reason: collision with root package name */
    private Long f8122e;

    /* renamed from: f  reason: collision with root package name */
    private long f8123f;

    public f(long j, Runnable runnable, boolean z) {
        this.f8123f = j;
        this.f8118a = runnable;
        this.f8121d = false;
        this.f8122e = null;
        if (0 == 0) {
            this.f8121d = true;
            d.a().a((c) this);
            this.f8122e = Long.valueOf(System.currentTimeMillis() + this.f8123f);
            if (!d.a().b()) {
                d();
            }
        }
    }

    private void d() {
        if (this.f8120c == null) {
            Timer timer = new Timer();
            this.f8120c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    f.this.f8118a.run();
                }
            }, this.f8123f);
            Calendar.getInstance().setTimeInMillis(this.f8122e.longValue());
        }
    }

    private void e() {
        Timer timer = this.f8120c;
        if (timer != null) {
            timer.cancel();
            this.f8120c = null;
        }
    }

    public final void a() {
        Long l;
        if (this.f8120c == null && (l = this.f8122e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f8123f = longValue;
            if (longValue <= 0) {
                c();
                this.f8118a.run();
                return;
            }
            d();
        }
    }

    public final void b() {
        if (this.f8120c != null) {
            e();
        }
    }

    public final void c() {
        e();
        this.f8121d = false;
        this.f8122e = null;
        d a2 = d.a();
        if (a2.f8104g.contains(this)) {
            a2.f8104g.remove(this);
        }
    }
}
